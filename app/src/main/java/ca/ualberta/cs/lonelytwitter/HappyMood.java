package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by buljubas on 1/16/18.
 */

public class HappyMood extends Mood {
    HappyMood() {}

    HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
