package pages;

import renderer.Render;

public abstract class Page {
    protected Render renderer;

    public Page(Render renderer) {
        this.renderer = renderer;
    }

    public abstract String render();

}
