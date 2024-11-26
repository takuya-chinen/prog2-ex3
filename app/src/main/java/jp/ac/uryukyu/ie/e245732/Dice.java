package jp.ac.uryukyu.ie.e245732;
public class Dice {
    private int value;
    public Dice(){
        play();
    }
    public int play(){
        value = (int)(Math.random()*5) + 1;
        return value;
    }
    public int getValue(){
        return value;
    }
}
