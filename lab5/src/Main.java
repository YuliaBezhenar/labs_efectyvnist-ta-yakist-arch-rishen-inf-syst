import pages.*;
import renderer.*;

public class Main {
    public static void main(String[] args) {
        Render html = new HTMLRenderer();
        Render json = new JSONRenderer();
        Render xml = new XMLRenderer();

        Page about = new SimplePage(html, "Про нас", "Ми — найкраща компанія!");
        System.out.println("HTML Simple Page:\n" + about.render());

        Page aboutJson = new SimplePage(json, "Про нас", "Ми — найкраща компанія!");
        System.out.println("\nJSON Simple Page:\n" + aboutJson.render());

        Product prod = new Product(1, "Ноутбук ASUS", "Потужний ноутбук для роботи", "asus.png");
        Page productHtml = new ProductPage(html, prod);
        System.out.println("\nHTML Product Page:\n" + productHtml.render());

        Page productXml = new ProductPage(xml, prod);
        System.out.println("\nXML Product Page:\n" + productXml.render());
    }
}