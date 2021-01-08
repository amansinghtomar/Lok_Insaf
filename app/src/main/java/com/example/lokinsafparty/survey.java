package com.example.lokinsafparty;

public class survey {
    private String topic ;
    private int agree, disagree;

    public survey(String topic, int agree, int disagree) {
        this.topic = topic;
        this.agree = agree;
        this.disagree = disagree;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }

    public int getDisagree() {
        return disagree;
    }

    public void setDisagree(int disagree) {
        this.disagree = disagree;
    }
}
