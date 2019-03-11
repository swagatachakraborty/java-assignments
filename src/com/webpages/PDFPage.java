package com.webpages;

public class PDFPage implements Page {
    private String content;

    public PDFPage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
