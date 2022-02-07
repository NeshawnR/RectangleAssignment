package com.company;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(2, 4);

        System.out.println("Look at the rectangle");

        rect1.setWidth(5);
        rect1.setLength(2);

        System.out.println("The width is 5 and the length is 2");

    }
}