package main;

import com.workintech.bedroom.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.BLUE);

        Bed bed = new Bed("King-bed", 2, 100, 2, 1);

        Lamp lamp = new Lamp(LampType.TABLE_LAMP, false, 5);

        Wardrobe wardrobe = new Wardrobe(150, 200, 75.5);

        Carpet carpet = new Carpet(200, 300, PaintColor.PURPLE);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom Name: " + bedroom.getName());
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        // Accessing instance variables of Bedroom and its associated classes
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Wall 2 Direction: " + bedroom.getWall2().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Painted Color: " + bedroom.getCeiling().getPaintedColor());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Bed Pillows: " + bedroom.getBed().getPillows());
    }
}