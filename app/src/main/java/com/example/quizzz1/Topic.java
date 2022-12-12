package com.example.quizzz1;

public class Topic {

    private String itemName;
    private int resourceID;

    public Topic(String topicName, int resourceID) {
        this.itemName = topicName;
        this.resourceID = resourceID;
    }

    public int getResourceID() {
        return resourceID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setTopicName(String topicName) {
        this.itemName = topicName;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }
}
