package com.alfian_Modul12.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Mati Listrik");
        subClass.getValue("Mati lampu");
    }
}
