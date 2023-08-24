import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Product {
    private String productName;
    private int exDay;
    private boolean isFresh;
    private LocalDate produktion;
    private String placeofProdukt;
private static       Random random = new Random();
    public Product(String productName, int exDay) {
        this.productName = productName;
        this.exDay = exDay;
        generateDAte();
        setPlase();
        isFresh();

    }

    public void isFresh() {
        int ex = 0;
        if (this.placeofProdukt.equals("Shov-Case")) {
            ex = this.exDay/2;

        }else{
            ex = this.exDay;
        }


        if (LocalDate.now().isAfter(this.produktion.plusDays(this.exDay))) {
            this.isFresh = false;
        } else {
            this.isFresh = true;
        }
    }

    public void generateDAte() {

        this.produktion = LocalDate.of(2023,
                random.nextInt(8) + 1,
                random.nextInt(30) + 1);
    }


    public void setPlase(){
      Random random = new Random();
        int randomnumber = random.nextInt(2);
        if(randomnumber ==1) {
            this.placeofProdukt = "show-case";
        } else{
            this.placeofProdukt = "ise-Box";
        }
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExDay() {
        return exDay;
    }




    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }
    public  boolean getIsFresh(){
        return this.isFresh;
    }

    public LocalDate getProduktion() {
        return produktion;
    }

    public void setProduktion(LocalDate produktion) {
        this.produktion = produktion;
    }

    public String getPlaceofProdukt() {
        return placeofProdukt;
    }

    public void setPlaceofProdukt(String placeofProdukt) {
        this.placeofProdukt = placeofProdukt;
    }

}
