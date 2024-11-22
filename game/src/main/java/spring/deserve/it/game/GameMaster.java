package spring.deserve.it.game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.deserve.it.api.RPSEnum;
import spring.deserve.it.api.Spider;

import java.util.*;

public class GameMaster {

    @Value("spider.default.lives")
    int maxLives;

    private Spider spider1 = new PaperSpider();
    private Spider spider2 = new StoneSpider();

    // Метод для запуска игры
    public void fight() {

    }

}