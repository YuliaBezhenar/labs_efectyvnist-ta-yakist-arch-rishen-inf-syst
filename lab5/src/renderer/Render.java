package renderer;

public interface Render {
    String renderTitle(String title);
    String renderText(String text);
    String renderProduct(String name, String description, String image, int id);
}
