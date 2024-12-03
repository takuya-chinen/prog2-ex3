import jp.ac.uryukyu.ie.e245732.*;
import jp.ac.uryukyu.ie.e245745.ExDice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.getValue());
        ExDice exdice = new ExDice(100);
        System.out.println(exdice.getValue());
    }
}
