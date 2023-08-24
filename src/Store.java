public class Store {
    Product[] products;

    public void doInspections() {
        int i = 1;
        System.out.println("=======================  Inspection result  =======================\n" +
                           "Product      | Produced On   | Storage place   |  life days   | Fresh\n" +
                            "\n" +
                            "-----------+---------------+---------------+--------------+------------+");
        for (Product p : this.products) {
            System.out.printf("%d.        |      %s     |   %s   |        %s        |      %d     |    %s \n ",
                    i,p.getProductName(),
                    p.getProduktion(),
                    p.getPlaceofProdukt(),
                    p.getExDay(),
                    p.getIsFresh());
            i++;
        }
    }

    public Product[] getProducts() {
        return  products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
