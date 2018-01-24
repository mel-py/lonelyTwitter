package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by buljubas on 1/16/18.
 */

public abstract class Tweet implements Tweetable {
    ArrayList<Mood> mood;
    private String message;
    Date date;

    Tweet(String message) {
        this.message = message;
        date = new Date();
        mood = new ArrayList<Mood>();
    }

    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        mood = new ArrayList<Mood>();
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

    public void addMood(Mood mood) {
        this.mood.add(mood);
    }

    public ArrayList<Mood> getMoods() {
        return mood;
    }

    public abstract Boolean isImportant();

    public String toString() {
        return date.toString() + " | " + message;
    }
}