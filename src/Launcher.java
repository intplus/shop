
import java.awt.*;

public class Launcher {
    public static void main(String [] args) throws Exception{
        try {
            SplashScreen splash = SplashScreen.getSplashScreen();
            Thread.sleep(2000);
            Graphics2D g = splash.createGraphics();
            g.setColor(Color.BLACK);
            g.drawString("Loading...", 15, 70);
            splash.update();
            Thread.sleep(5000);

            splash.close();
        } catch (NullPointerException e) {
            System.err.println("no splash");
        }

        Goods shop = new Goods();
        setUpProducts(shop);

        Customer c1 = new Customer("Alexander");
        Customer c2 = new Customer("Oleg");
        Service s = new Service(shop);
        s.sale(shop.getProducts().get(0), c1, 10);
        s.sale(shop.getProducts().get(1), c2, 5);

        new ShopUI(shop);

    }
    private static void setUpProducts(Goods shop) {
        Product p = new Product();
        p.setName("ds-2cd2012f-i");
        p.setPrice(65.5);
        shop.addProduct(p);

        p = new Product();
        p.setName("ds-2cd2032f-i");
        p.setPrice(90.0);
        shop.addProduct(p);

        p = new Product();
        p.setName("ds-2cd2132f-i");
        p.setPrice(110.0);
        shop.addProduct(p);

        p = new Product();
        p.setName("ds-2cd2232f-i");
        p.setPrice(150.0);
        shop.addProduct(p);
    }
}

