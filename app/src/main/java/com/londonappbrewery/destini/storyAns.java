package com.londonappbrewery.destini;

public class storyAns {
    private int storyanswerId;
    public storyAns(int answer)
    {
        storyanswerId=answer;
    }

    public int getStoryanswer() {
        return storyanswerId;
    }

    public void setStoryanswer(int storyanswer) {
        this.storyanswerId = storyanswer;
    }
}
