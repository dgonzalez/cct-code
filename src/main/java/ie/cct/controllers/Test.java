package ie.cct.controllers;

public class Test {
    private int number;
    private String test;

    public Test(int number, String test) {
        this.number = number;
        this.test = test;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    public String getTest() {
        return this.test;
    }
}
