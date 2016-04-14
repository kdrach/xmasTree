package com.pgs.javadev;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class XmasTreeCreatorTest {

    XmasTreeCreator xmasTreeCreator;

    @Before
    public void init() {
        xmasTreeCreator = new XmasTreeCreator();
    }

    @Test
    public void testSingleRowUP() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "UP");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowUp() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "UP");
        assertThat(tree, equalTo(
                        " x\n" +
                        "xxx"));
    }

    @Test
    public void testOddRowUp() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "UP");
        assertThat(tree, equalTo(
                        "  x\n" +
                        " xxx\n" +
                        "xxxxx"));
    }

    @Test
    public void testEvenRowDown() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "DOWN");

        assertThat(tree, equalTo(
                "xxx\n" + " x"));
    }

    @Test
    public void testOddRowDown() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "DOWN");
        assertThat(tree, equalTo(
                        "xxxxx\n" +
                        " xxx\n" +
                        "  x"));



    }
    @Test
    public void testSingleRowDOWN() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "DOWN");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testOddRowRight() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "RIGHT");
        assertThat(tree, equalTo(
                        "x\n" +
                        "xx\n" +
                        "xxx\n"+
                        "xx\n"+
                        "x"


        ));


    }

    @Test
    public void testEvenRowRight() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "RIGHT");

        assertThat(tree, equalTo(
                "x\n" +
                "xx\n" +
                "x"
    ));
    }

   @Test
    public void testEvenRowLeft() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "LEFT");

        assertThat(tree, equalTo(
                " x\n" +
                "xx\n" +
                " x"
    ));
    }
    @Test
    public void testOddRowLeft() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "LEFT");
        assertThat(tree, equalTo(
                        "  x\n" +
                        " xx\n" +
                        "xxx\n"+
                        " xx\n"+
                        "  x"


        ));


    }

    @Test
    public void testSingleRowRight() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "RIGHT");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testSingleRowLeft() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "LEFT");
        assertThat(tree, equalTo("x"));
    }





}
