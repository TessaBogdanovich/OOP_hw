public interface VendingMachine {
    HotDrink getProduct(String name);

    HotDrink getProduct(String name, int volume, int temperature);
}

