import controller.BikeController;
import view_layer.BikesView;
import model_layer.Bikes;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Bikes bike = retrive();

        BikesView view = new BikesView();

        BikeController controller = new BikeController(bike, view);

        controller.updateView();

        controller.setBikeType("road");
        controller.setBikeId("2");

        controller.updateView();

        List<Bikes> listb = new LinkedList<Bikes>();

        listb.add(bike);
    }

    private static Bikes retrive() {
        Bikes bike = new Bikes();
        bike.setBikeType("mountain");
        bike.setBikeId("3123122");
        return bike;
    }
}