import jp.ac.uryukyu.ie.e245732.*;

public class Main {
    public static void main(String[] args){
        Dice dice1 = new Dice(6);
        System.out.println(dice1.getValue());
        Dice dice2 = new Dice(100);
        System.out.println(dice2.getValue());
      }
}
