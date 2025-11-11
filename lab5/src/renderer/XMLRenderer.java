package renderer;

import javax.swing.*;

public class XMLRenderer implements Render {
    @Override
    public String renderTitle(String title) {
        return "<title>" + title + "</title>\n";
    }

    @Override
    public String renderText(String text) {
        return "<text>" + text + "</text>\n";
    }

    @Override
    public String renderProduct(String name, String description, String image, int id) {
        return "<product>\n" +
                "<name>" + name + "</name>\n" +
                "<description>" + description + "</description>\n" +
                "<image>" + image + "</image>\n" +
                "<id>" + id + "</id>\n" +
                "</product>\n";
    }
}
