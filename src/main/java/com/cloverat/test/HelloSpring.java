package com.cloverat.test;

/**
 * @author chenyujun
 * @date 18-4-2
 */
public class HelloSpring {

    private String message;

    public void getMessage() {
        //return message;
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
