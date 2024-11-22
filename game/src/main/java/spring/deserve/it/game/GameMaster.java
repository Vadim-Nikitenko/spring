package spring.deserve.it.game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.deserve.it.api.RPSEnum;
import spring.deserve.it.api.Spider;

import java.util.*;


@Component
public class GameMaster {
    @Value("${spider.default.lives}")
    int maxLives;
    int battleId = 0;

    List<Spider>         spiders;  // Лист со всеми пауками
    Map<String, Integer> playerTrophies;  // Карта с игроками и трофеями

    // Метод для запуска игры
    public void fight() {
        while (true) {
        }
    }

}