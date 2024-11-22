package spring.deserve.it.api;

import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void injectProperties(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectProperty.class)) {
                InjectProperty annotation = field.getAnnotation(InjectProperty.class);
                String propertyKey = annotation.value();
                if (propertyKey.isEmpty()) {
                    propertyKey = field.getName(); // Используем имя поля, если ключ не задан
                }

                String propertyValue = PropertyLoader.getProperty(propertyKey);
                if (propertyValue != null) {
                    field.setAccessible(true);
                    try {
                        field.set(obj, convertToFieldType(propertyValue, field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Failed to inject property: " + propertyKey, e);
                    }
                }
            }
        }
    }

    private static Object convertToFieldType(String value, Class<?> fieldType) {
        if (fieldType == int.class || fieldType == Integer.class) {
            return Integer.parseInt(value);
        }
        if (fieldType == long.class || fieldType == Long.class) {
            return Long.parseLong(value);
        }
        if (fieldType == boolean.class || fieldType == Boolean.class) {
            return Boolean.parseBoolean(value);
        }
        return value; // Для строк и других типов
    }
}
