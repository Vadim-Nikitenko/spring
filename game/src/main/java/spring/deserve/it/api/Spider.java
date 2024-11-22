package spring.deserve.it.api;

public interface Spider {
    RPSEnum fight(Spider opponent);  // Метод для боя (камень, ножницы, бумага)

    boolean isAlive();  // Проверка, жив ли паук

    int getLives();  // Получение оставшихся жизней

    void loseLife();  // Уменьшение количества жизней на 1

    void setLives(int lives);  // Установка количества жизней
}