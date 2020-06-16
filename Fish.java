import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Fish extends Animal {

    private String fishName;
    private String verb;
    private String fishFood;

    public void setName(String name) {
        fishName = name;
    }

    public void setVerb(String verbName) {
        verb = verbName;
    }

    public void setFood(String food) {
        fishFood = food;
    }

    public String getName() {
        return fishName;
    }

    public String getVerb() {
        return verb;
    }

    public String getFood() {
        return fishFood;
    }

    @Override

    public String name() {
        return fishName;
    }

    public String favourite() {
        return fishFood;
    }

}
