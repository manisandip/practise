package com.company;

interface Sandip{
    void print();
    void print2();
    void print3();
}
class manisha implements Sandip {

    public void print() {
        System.out.println("Hello");
    }

    public void print2() {
        System.out.println("hi");
    }

    class jyot extends manisha {
        public void print3() {
            System.out.println("jsk");
        }
    }


        public static void main(String args[]) {
            manisha obj = new manisha();
            obj.print();
            obj.print2();
        }
    }