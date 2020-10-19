package Nomer1;

public class DemoClub {
    public DemoClub() {
    }

    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Chealsea");
        Club club3 = new Club("Chealsea", " Chealsea Football Club adalah sebuah klub sepak bola yang berasal dari Liga Inggris");
        Club club4 = new Club("Chealsea", 1905, "Stamford Bridge");
        Club club5 = new Club("Chealsea", 1905, "Stamford Bridge", 6, "Chealse Football Club adalah sebuah klub sepak bola yang berasal dari Liga Inggris");
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
