package com.pgs.javadev;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();
        System.out.println(creator.createXmasTree("x", 100));
    }

}
