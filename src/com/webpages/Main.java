package com.webpages;

public class Main {
    public static void main(String[] args) {
        Page page = new WebPage("This is interactive web page content");
        ((WebPage) page).Display();
        ((WebPage) page).click();
        System.out.println("Getting the content of interactive web page : " + page.getContent());

        page = new NonInteractiveWebPage("This is the content of non-interactive webpage");
        ((NonInteractiveWebPage) page).Display();
        System.out.println("Getting the content of non-interactive web page : " + page.getContent());


        page = new PDFPage("This is the content of PDF");

        System.out.println("Getting the content of non-interactive web page : " + page.getContent());
    }
}
