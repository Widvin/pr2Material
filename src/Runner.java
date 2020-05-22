import by.gsu.pms.Detail;
import by.gsu.pms.Material;

public class Runner {
    public static void main(String[] args) {

        Material copper = new Material("Copper", 8.93);
        Material aluminium = new Material("Aluminum", 2.69);

        Detail wire = new Detail("Wire", copper, 0.03);
        Detail wire2 = new Detail("Wire", aluminium, 0.03);

        System.out.println(wire.toString());

        wire.setMaterial(copper);
        System.out.println(wire.getMass());

        wire2.setMaterial(aluminium);
        System.out.println(wire.toString());

    }
}

