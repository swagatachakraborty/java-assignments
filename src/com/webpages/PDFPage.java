package com.webpages;

public class PDFPage extends WebPage {
    private String content;

    public PDFPage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
