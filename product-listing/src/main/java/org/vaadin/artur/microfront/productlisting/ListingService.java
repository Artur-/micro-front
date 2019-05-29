package org.vaadin.artur.microfront.productlisting;

public class ListingService {

    private static ProductInfo[] infos = new ProductInfo[] {
            new ProductInfo(1, "Red tractor",
                    "https://images.pexels.com/photos/158689/old-red-tractor-nostalgia-158689.jpeg"),
            new ProductInfo(2, "Green tractor",
                    "https://www.publicdomainpictures.net/pictures/130000/nahled/green-tractor.jpg"),
            new ProductInfo(3, "Blue tractor",
                    "https://cdn.pixabay.com/photo/2017/12/09/22/51/tractor-3008929_960_720.png") };

    public static ProductInfo[] getProductInfos() {
        return infos;
    }

}