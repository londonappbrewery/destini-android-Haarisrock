package com.londonappbrewery.destini;

public class Story {
    private int myStory;
    public Story(int storyId)
    {
        myStory=storyId;
    }

    public int getMyStory() {
        return myStory;
    }

    public void setMyStory(int myStory) {
        this.myStory = myStory;
    }
}
