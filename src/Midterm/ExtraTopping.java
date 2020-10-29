package Midterm;

public class ExtraTopping implements PokeBowl {
    private PokeBowl bowl;
    private String toppingName;

    public ExtraTopping(PokeBowl bowl, String toppingName) {
        this.bowl = bowl;
        this.toppingName = toppingName;
    }

    @Override
    public double getPrice() {
        double total;
        total = bowl.getPrice() + 2.50;
        return total;
    }

    @Override
    public String getDescription() {
        return bowl.getDescription() + " + extra "+this.toppingName ;
    }
}
