package controller;

import model_layer.Bikes;
import view_layer.BikesView;

public class BikeController {
    private Bikes shop;
    private BikesView view;

    public BikeController(Bikes shop, BikesView view) {
        this.shop = shop;
        this.view = view;
    }

    public void setBikeType(String type) {
        shop.setBikeType(type);
    }

    public String getBikeType() {
        return shop.getBikeType();
    }

    public void setBikeId(String id) {
        shop.setBikeId(id);
    }

    public String getBikeId() {
        return shop.getBikeId();
    }

    public void updateView(){
        view.print_Bike_Details(shop.getBikeType(), shop.getId());
    }
}
