package org.vaadin.artur.microfront.productlisting;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.webcomponent.WebComponent;

import elemental.json.Json;
import elemental.json.JsonObject;

public class ProductListingView extends Div {

    private WebComponent<ProductListingView> webComponent;

    public static class Exporter extends WebComponentExporter<ProductListingView> {

        public Exporter() {
            super("product-listing");
        }

        @Override
        public void configureInstance(WebComponent<ProductListingView> webComponent, ProductListingView component) {
            component.setWebComponent(webComponent);
        }

    }

    public ProductListingView() {
        Grid<ProductInfo> list = new Grid<ProductInfo>(ProductInfo.class);
        list.setItems(ListingService.getProductInfos());
        add(list);
        list.addItemClickListener(e -> {
            JsonObject data = Json.createObject();
            data.put("id", e.getItem().getId());
            webComponent.fireEvent("product-selected", data);
        });
    }

    private void setWebComponent(WebComponent<ProductListingView> webComponent) {
        this.webComponent = webComponent;
    }
}