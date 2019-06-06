
package org.vaadin.artur.microfront.productdetails;

import java.util.Optional;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class ProductDetailsView extends Div {

    public static class Exporter extends WebComponentExporter<ProductDetailsView> {

        public Exporter() {
            super("product-details");
            addProperty("product", -1).onChange((component, id) -> {
                component.setProduct(id);
            });
        }

        @Override
        public void configureInstance(WebComponent<ProductDetailsView> webComponent, ProductDetailsView component) {

        }

    }

    private Div header = new Div();
    private Div name = new Div();
    private Div weight = new Div();
    private Div price = new Div();

    public ProductDetailsView() {
        header.setText("Product Details");
        add(header,name, weight, price);
    }

    public void setProduct(int id) {
        ProductDetails details = DetailsService.getProductDetails(id).orElse(null);
        if (details == null)
            return;
        name.setText(details.getName());
        weight.setText(details.getWeight());
        price.setText(format(details.getPrice()));
    }

    private String format(int price) {
        return "$" + price;
    }
}