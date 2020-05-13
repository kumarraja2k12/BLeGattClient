package com.example.blegattclient;

import java.util.HashMap;

public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String ENGINE_OIL_THRESHOLD = "00002a2b-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Engine oil level service");
        // Sample Characteristics.
        attributes.put(ENGINE_OIL_THRESHOLD, "Engine Oil Threshold");
    }

    public static boolean contains(String uuid) {
        return attributes.containsKey(uuid);
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}