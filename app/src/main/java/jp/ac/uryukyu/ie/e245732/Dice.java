package jp.ac.uryukyu.ie.e245732;

public class Dice {
    private int maxValue;
    private int value;

    public Dice(int _maxValue) {
        this.maxValue = _maxValue;
        play();
    }

    public int play() {
        value = (int) (Math.random() * this.maxValue) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int _value) {
        this.value = _value;
    }
}
