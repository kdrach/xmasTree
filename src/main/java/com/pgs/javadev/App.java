package com.pgs.javadev;





import javax.xml.bind.SchemaOutputResolver;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {





    public static void main(String[] args) {
        XmasTreeCreator creator = new XmasTreeCreator();
        Scanner scan = new Scanner(System.in);
        int levels=-1;
        System.out.println("Witaj w kreatorze choinek");
        System.out.println("Z jakich znaków zbudowana ma być twoja choinka?");

        String character = scan.next();
        System.out.println("Podaj wysokość drzewa");

        try {
            levels = scan.nextInt();
        }
        catch(InputMismatchException ex)
        {
       throw new InputMismatchException("To nie jest poprawna liczba")     ;


        }
        if (levels<1)
        {throw new IllegalArgumentException("Nie można zbudować choinki o wielkości mniejszej niż jeden znak");}

        System.out.println(levels);

        System.out.println("W którą stronę ma rosnąć? (Dostępne opcje UP-góra, DOWN- dół, LEFT-lewo, RIGHT-prawo");
        String direction = scan.next().toUpperCase();
        System.out.println(creator.createXmasTree(character, levels, direction));
    }

}
