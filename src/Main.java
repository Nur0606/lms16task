// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[]{


                new Milk("milk", 60),
                new Milk("milk", 60),
                new Milk("milk", 60),
                new Milk("milk", 150),
                new Corn("Corn", "89898989"),
                new Milk("milk", 150),
                new Milk("milk", 150),
                new Milk("milk", 150),
                new Milk("milk", 150),
                new Milk("milk", 150),
                new Milk("milk", 150),
                new Milk("milk", 150)

        };

        Store store = new Store();
        store.setProducts(product);
        store.doInspections();

    }

}