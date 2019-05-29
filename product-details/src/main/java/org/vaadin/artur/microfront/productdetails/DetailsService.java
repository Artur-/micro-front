package org.vaadin.artur.microfront.productdetails;

import java.util.Optional;
import java.util.stream.Stream;

public class DetailsService {

        private static ProductDetails[] details = new ProductDetails[] {
                        new ProductDetails(1, "Red tractor", 12999, "3200 kg"),
                        new ProductDetails(2, "Green tractor", 15500, "1800 kg"),
                        new ProductDetails(3, "Blue tractor", 22800, "5500 kg") };

        public static Optional<ProductDetails> getProductDetails(int id) {
                return Stream.of(details).filter(product -> product.getId() == id).findFirst();

        }

}