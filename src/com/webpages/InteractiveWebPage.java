package com.webpages;

public class InteractiveWebPage extends WebPage {
    private String content;

    public InteractiveWebPage(String content) {
        this.content = content;
    }

    public void display() {
        display(this.content);
    }

    @Override
    public String getContent() {
        return  content;
    }

    public void click(){
        System.out.println("Clicking on interactive web page");
    }
}
