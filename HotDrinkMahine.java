import java.util.ArrayList;
import java.util.List;

public class HotDrinkMahine implements VendingMachine {
    List <Tea> cups = new ArrayList<>();

    void initHotDrink(List<Tea> cups) {
        this.cups = cups;
    }

    @Override
    public HotDrink getProduct(String name) {
        for (Tea cup : cups) {
            if (cup.getName().contains(name)) return cup;
        }
        return null;
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Tea cup : cups) {
            if (cup.getName().contains(name) && cup.getVolume() == volume && cup.getTemperature() == temperature) return cup;
        }
        return null;
    }

    public List<Tea> getCups() {
        return cups;
    }

    public void setCups(List<Tea> cups) {
        this.cups = cups;
    }
}
