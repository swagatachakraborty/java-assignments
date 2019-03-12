package com.webpages;

public class NonInteractiveWebPage extends WebPage {
    private String content;

    public NonInteractiveWebPage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    public void display() {
        display(this.content);
    }
}
