package pages;

import renderer.Render;

public class ProductPage extends Page {
    private Product product;

    public ProductPage(Render renderer, Product product) {
        super(renderer);
        this.product = product;
    }

    @Override
    public String render() {
        return renderer.renderProduct(
                product.getName(),
                product.getDescription(),
                product.getImage(),
                product.getId()
        );
    }
}
