package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> outPutMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (outPutMap.get(entry.getValue()) != null) {
                if (entry.getKey() < outPutMap.get(entry.getValue())) {
                    outPutMap.put(entry.getValue(), entry.getKey());
                }
            } else {
                outPutMap.put(entry.getValue(), entry.getKey());
            }
        }
        return outPutMap;
    }
}
