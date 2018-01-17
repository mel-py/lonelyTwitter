package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by buljubas on 1/16/18.
 */

public abstract class Tweet {
    private String message;
    Date date;

    Tweet(String message) {
        this.message = message;
        date = new Date();
    }

    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140) {
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();
}