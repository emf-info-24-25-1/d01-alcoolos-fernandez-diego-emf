package app;

public class Ami {
    private String name;
    private int beerUntilDrunk;

    public Ami(String name, int beerUntilDrunk) {
        this.name = name;
        this.beerUntilDrunk = beerUntilDrunk;
    }

    public void boitUneBierre() {
        System.out.println(name + " peut encore boire " + beerUntilDrunk);
        this.beerUntilDrunk--;
        if (beerUntilDrunk > 0) {
            System.out.println(name + " a bu une bière. " + name + " peut encore boire " + beerUntilDrunk + " bières"); 
        } else {
            System.out.println(name + " est déjà saoul");
        }
        
    }

    public String getName() {
        return this.name;
    }

    public int getBeerUntilDrunk() {
        return this.beerUntilDrunk;
    }
    
    public void setBeerUntilDrunk(int beerUntilDrunk) {
        this.beerUntilDrunk = beerUntilDrunk;
    }
}
