package com.java24hours;

public class Gremlin {
    static int gremlinCount = 0;
    private int guid= 1000000;

    public Gremlin() {
        gremlinCount++;
    }

    public Gremlin(int guid) {
        gremlinCount++;
        setGuid(guid);
    }

    static int getGremlinCount() {
        return gremlinCount;
    }

    public void setGuid(int guid) {
        if (guid > 1000000 && guid < 9999999) {
            this.guid = guid;
        }
    }

    public int getGuid() {
        return guid;
    }
}
