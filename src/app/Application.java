package app;

public class Application {
    public static void main(String[] args) {
        Ami jb = new Ami("Jean-baptiste", 4);
        Ami noam = new Ami("Noam", 1);
        Ami ethan = new Ami("Ethan", 3);

        jb.boitUneBierre();
        System.out.println("");
        noam.boitUneBierre();
        System.out.println("");
        ethan.boitUneBierre();
    }
}
