package com.alfian_Modul12.Polimorfisme;

public class DemoOverLoading {
    public static class DemoOverloading {
        public static void main(String[] args) {
            Lagu lagu1 = new Lagu("Bahagia", "GAC");
            Lagu lagu2 = new Lagu("Slow Dwon", "Mac Ayres");

            lagu1.getDataLagu();
            lagu2.getDataLagu();
        }
    }
}