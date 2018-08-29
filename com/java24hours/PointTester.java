package com.java24hours;

import java.awt.*;

public class PointTester {
    public static void main(String[] arguments) {
        Point3D location = new Point3D(7,6,64);
        Point4D location4 = new Point4D(4,8,32,0);

        System.out.println("The 3D point is at (" + location.x + ", " + location.y + ", " + location.z + ")");
        System.out.println("It's being moved to (10, 22, 71)");
        location.move(10,22,71);
        System.out.println("The 3D point is now at (" + location.x + ", " + location.y + ", " + location.z + ")");
        System.out.println("It's being moved -20 units on all axes");
        location.translate(-20,-20,-20);
        System.out.println("It ends up at (" + location.x + ", " + location.y + ", " + location.z + ")\n\n");

        System.out.println("The 4D point is at (" + location4.x + ", " + location4.y + ", " + location4.z + ", " + location4.t + ")");
        System.out.println("It's being moved to (10, 22, 71, -1)");
        location4.move(10,22,71, -1);
        System.out.println("The 3D point is now at (" + location4.x + ", " + location4.y + ", " + location4.z + ", " + location4.t + ")");
        System.out.println("It's being moved to (10, 22, 71, 31)");
        location4.move(10,22,71, 31);
        System.out.println("The 3D point is now at (" + location4.x + ", " + location4.y + ", " + location4.z + ", " + location4.t + ")");
        System.out.println("It's being moved -20 units on all axes");
        location4.translate(-20,-20,-20, -20);
        System.out.println("It ends up at (" + location4.x + ", " + location4.y + ", " + location4.z + ", " + location4.t + ")");
        System.out.println("It's being moved another -20 units on all axes");
        location4.translate(-20,-20,-20, -20);
        System.out.println("It ends up at (" + location4.x + ", " + location4.y + ", " + location4.z + ", " + location4.t + ")");
    }
}
