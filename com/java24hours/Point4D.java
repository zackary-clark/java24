package com.java24hours;

public class Point4D extends Point3D {
    public int t;

    public Point4D(int x, int y, int z, int t) {
        super(x,y,z);
        if (t >= 0) {
            this.t = t;
        } else { System.out.println("Negative time?\nHow's that work?");}
    }

    public void move(int x, int y, int z, int t) {
        if (t >= 0) {
            super.move(x, y, z);
            this.t = t;
        } else { System.out.println("Negative time?\nHow's that work?");}
    }

    public void translate(int x, int y, int z, int t) {
        super.translate(x, y, z);
        if (this.t + t >= 0) {
            this.t += t;
        } else {
            this.t = 0;
            System.out.println("Negative time?\nHow's that work?\n't' set to 0");
        }
    }
}
