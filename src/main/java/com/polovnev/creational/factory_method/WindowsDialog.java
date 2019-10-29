package com.polovnev.creational.factory_method;

public class WindowsDialog implements Dialog {

    public Button createButton() {
        return new WindowsButton();
    }
}
