package com.example.quizzz1;

public class History {
    String score;
    String topicName;
    String level;
    String date;

    public History(String score, String topicName, String level, String date) {
        this.score = score;
        this.topicName = topicName;
        this.level = level;
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
