import java.util.ArrayList;
import java.lang.String;

public class Solution {

    public static void main(String[] args) {

        Fish myFish = new Fish();
        Dog myDog = new Dog();

        myFish.setName("Freddy");
        myFish.setVerb("wants");
        myFish.setFood("plankton");

        myDog.setName("Fido");
        myDog.setVerb("craves");
        myDog.setFood("bones");

        myFish.think(myFish.getVerb());
        myDog.think(myDog.getVerb());

    }

}
