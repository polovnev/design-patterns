package com.polovnev.creational.factory_method;

public class HtmlDialog implements Dialog {

    public Button createButton() {
        return new HtmlButton();
    }

}
