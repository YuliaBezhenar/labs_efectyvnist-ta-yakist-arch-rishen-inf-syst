package pages;

import renderer.Render;

public class SimplePage extends Page {
    private String title;
    private String content;

    public SimplePage(Render renderer, String title, String content) {
        super(renderer);
        this.title = title;
        this.content = content;
    }

    @Override
    public String render() {
        return renderer.renderTitle(title) + renderer.renderText(content);
    }
}
