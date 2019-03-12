package com.webpages;

public abstract class WebPage implements Displayable {
    abstract String getContent();

    @Override
    public void display(String content) {
        System.out.println(content);
    }

}
