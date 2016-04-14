package com.pgs.javadev;


  class XmasTreeCreator {


    private StringBuilder printChar(StringBuilder temp,String x, int number) {


        for (int i = 0; i < number; i++) {
            temp.append(x);


        }

        return temp;
    }

    private String createXmasTreeUp(String text, int levels) {
        StringBuilder tree = new StringBuilder();
        for (int i = 0; i < levels; i++) {
           printChar(tree," ", levels - 1 - i);
           printChar(tree,text, (2 * i) + 1);
            if (i != levels - 1) {
                tree.append("\n");
            }
        }


        return tree.toString();


    }


    private String createXmasTreeDown(String text, int levels) {
        StringBuilder tree = new StringBuilder();
        for (int i = levels - 1; i >= 0; i--) {
           printChar(tree," ", levels - i - 1);

            printChar(tree,text, (2 * i) + 1);
            if (i != 0) {
                tree.append("\n");
            }
        }


        return tree.toString();


    }

    private StringBuilder printLevelVertical(String text, StringBuilder a, int currentLevel) {
        for (int i = 0; i < currentLevel; i++) {

            a.append(text);
        }

        if (currentLevel != 0) {
            a.append("\n");
        }

        return a;


    }






    private String createXmasTreeRight(String text, int levels) {
        StringBuilder tree = new StringBuilder();
        for (int i = 0; i < levels; i++) {
            printLevelVertical(text, tree, i);

        }
        for (int i = levels; i >= 0; i--) {
            printLevelVertical(text, tree, i);


        }
        tree.deleteCharAt(tree.length() - 1);
        return tree.toString();
    }

    private String createXmasTreeLeft(String text, int levels) {
        StringBuilder tree = new StringBuilder();
        for (int i = 1; i < levels; i++) {

            printChar(tree," ", levels - i );
            printLevelVertical(text, tree, i);

        }

        for (int i = levels; i > 0; i--) {
            printChar(tree," ", levels - i );
            printLevelVertical(text, tree, i);
        }
tree.deleteCharAt(tree.length()-1);

        return tree.toString();
    }


     String createXmasTree(String text, int levels, String direction) {


          if (direction.equals("UP")) {
              return createXmasTreeUp(text, levels);

          } else if (direction.equals("DOWN")) {
              return createXmasTreeDown(text, levels);
          } else if (direction.equals("RIGHT")) {
              return createXmasTreeRight(text, levels);
          } else if (direction.equals("LEFT")) {
              return createXmasTreeLeft(text, levels);
          } else throw new IllegalArgumentException("Błędny wybór");

      }
    }


