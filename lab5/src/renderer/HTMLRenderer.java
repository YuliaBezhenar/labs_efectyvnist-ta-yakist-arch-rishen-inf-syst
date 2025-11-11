package renderer;

public class HTMLRenderer implements Render{
    @Override
    public String renderTitle(String title) {
        return "<h1>" + title + "</h1>\n";
    }

    @Override
    public String renderText(String text) {
        return "<p>" + text + "</p>\n";
    }

    @Override
    public String renderProduct(String name, String description, String image, int id) {
        return "<div class='product'>" +
                "<h2>" + name + "</h2>" +
                "<p>" + description + "</p>" +
                "<img src='" + image + "' alt='" + name + "'>" +
                "<p>ID: " + id + "</p>" +
                "</div>\n";
    }
}
