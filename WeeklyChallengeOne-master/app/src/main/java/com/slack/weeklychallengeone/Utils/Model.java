package com.slack.weeklychallengeone.Utils;

public class Model {
    private String name;
    private String desc;
    private String link;

    public Model(String name, String desc,String link) {
        this.name = name;
        this.desc = desc;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getLink() {
        return link;
    }
}
