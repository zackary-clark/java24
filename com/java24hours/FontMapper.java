package com.java24hours;

import java.awt.*;
import java.util.*;
import java.lang.*;

public class FontMapper {
    public FontMapper() {
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt " + value.getFontName() + "\n");
        }
    }

    public FontMapper(String name, String size, String style) {
        int styleint = Font.PLAIN;
        if (style.equals("Font.BOLD")) {
            styleint = Font.BOLD;
        }
        Font cli = new Font(name, styleint, Integer.parseInt(size));
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("user defined", cli);
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt " + value.getFontName() + "\n");
        }
    }

    public static void main(String[] arguments) {
        if (arguments.length > 0) {
            new FontMapper(arguments[0], arguments[1], arguments[2]);
        } else {
            new FontMapper();
        }
    }
}
