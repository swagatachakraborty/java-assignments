package com.webpages;

public class NonInteractiveWebPage extends Console implements Page {
    private String content;

    public NonInteractiveWebPage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    public void Display() {
        display(this.content);
    }
}
