package com.webpages;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();

        WebPage webPage = new InteractiveWebPage("This is interactive web webPage content");
        ((InteractiveWebPage) webPage).display();
        ((InteractiveWebPage) webPage).click();
        console.display("Getting the content of interactive web webPage : " + webPage.getContent());

        webPage = new NonInteractiveWebPage("This is the content of non-interactive webpage");
        ((NonInteractiveWebPage) webPage).display();
        console.display("Getting the content of non-interactive web webPage : " + webPage.getContent());


        webPage = new PDFPage("This is the content of PDF");

        console.display("Getting the content of non-interactive web webPage : " + webPage.getContent());
    }
}
