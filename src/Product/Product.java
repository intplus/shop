package Product;

public class Product {
    private String name;
    private int count;   //Кол-во
    private int ddp;     //in USD
    private int margin;  //Маржа  в %
    private  final String pixels;
    private String feature;
    private int price;
    private int discountProduct;//Discount in %


    public Product(String name, int count, int ddp, String pixels) {
        this.name = name;
        this.count = count;
        this.ddp = ddp;
        this.pixels = pixels;
        margin = 30;

        generationPrice();
    }

    private void generationPrice(){
        price = (int)(ddp*(new USD().getRate())*((100+margin)/100));
        price = (int)(price - price*((100+discountProduct)/100));
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getDdp() {
        return ddp;
    }

    public int getMargin() {
        return margin;
    }

    public String getPixels() {
        return pixels;
    }

    public String getFeature() {
        return feature;
    }
}
