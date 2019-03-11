package com.webpages;

public class WebPage extends NonInteractiveWebPage{
    private String content;

    public WebPage(String contents) {
        super(contents);
    }

    public void click(){
        System.out.println("Clicking on interactive web page");
    }
}
