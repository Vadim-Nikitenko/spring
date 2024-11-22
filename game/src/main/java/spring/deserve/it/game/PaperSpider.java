package spring.deserve.it.game;

import spring.deserve.it.api.RPSEnum;
import spring.deserve.it.api.Spider;

public class PaperSpider extends AbstractSpider {

    @Override
    public RPSEnum fight(Spider spider) {
        return RPSEnum.PAPER;
    }

    @Override
    public int getLives() {
        return 0;
    }

    @Override
    public void setLives(int lives) {

    }


}
