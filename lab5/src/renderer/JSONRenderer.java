package renderer;

import javax.swing.*;

public class JSONRenderer implements Render {
    @Override
    public String renderTitle(String title) {
        return "\"title\": \"" + title + "\",\n";
    }

    @Override
    public String renderText(String text) {
        return "\"text\": \"" + text + "\",\n";
    }

    @Override
    public String renderProduct(String name, String description, String image, int id) {
        return "{ \"product\": { " +
                "\"name\": \"" + name + "\", " +
                "\"description\": \"" + description + "\", " +
                "\"image\": \"" + image + "\", " +
                "\"id\": " + id + " } }\n";
    }
}
