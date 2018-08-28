package com.java24hours;

public class GremlinLab {
    public static void main(String[] arguments) {
        int numGremlins = Integer.parseInt(arguments[0]);
        if (numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++) {
                gremlins[i] = new Gremlin(1523000);
                System.out.println(gremlins[i].getGuid());
            }
            System.out.println("There are " + Gremlin.getGremlinCount() + " gremlins.");
        }
    }
}
