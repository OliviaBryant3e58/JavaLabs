import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public abstract class Animal {

    public abstract String name();
    public abstract String favourite();

    public final void think(String verb) {

        System.out.println(name() + " " + verb + " " + favourite());

    }

}
