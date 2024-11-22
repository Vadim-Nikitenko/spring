package spring.deserve.it.game;

import spring.deserve.it.api.RPSEnum;
import spring.deserve.it.api.Spider;

public class StoneSpider extends AbstractSpider {

    @Override
    public RPSEnum fight(Spider spider) {
        return RPSEnum.ROCK;
    }

    @Override
    public int getLives() {
        return 0;
    }

    @Override
    public void setLives(int lives) {

    }
}
