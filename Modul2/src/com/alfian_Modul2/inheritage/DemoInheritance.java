package com.alfian_Modul2.inheritage;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukan data ke SuperClass :");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printxy();

        System.out.println("Ini Subclass:");
        subclass.x = 30;
        subclass.y = 40;

        subclass.z = 10;
        superclass.printxy();
        subclass.sumValue();
    }
}
