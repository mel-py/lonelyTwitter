package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by buljubas on 1/16/18.
 */

public abstract class Mood {
    Date date;

    Mood() {
        this.date = new Date();
    }

    Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date =  date;
    }

    public abstract String getMood();
}
