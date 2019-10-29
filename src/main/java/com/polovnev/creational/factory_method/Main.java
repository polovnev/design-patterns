package com.polovnev.creational.factory_method;

public class Main {

    private static final String WEB_CONTEXT = "web";

    public static void main(String[] args) {
        System.out.println(getButton(WEB_CONTEXT).getClass().getName());
    }

    private static Button getButton(String context) {
        Dialog dialog;
        if(context.equals(WEB_CONTEXT)) {
            dialog = new HtmlDialog();
        } else {
            dialog = new WindowsDialog();
        }
        return dialog.createButton();
    }
}
