package spring.deserve.it.game;

import lombok.Getter;
import lombok.Setter;
import spring.deserve.it.api.Spider;

@Getter
@Setter
public abstract class AbstractSpider implements Spider {


    private String owner;

    private int lives = 5;


    public boolean isAlive() {
        return lives > 0;
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
        }
    }
}

