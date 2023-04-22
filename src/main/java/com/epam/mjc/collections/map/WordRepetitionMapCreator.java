package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(sentence, " ,.");
        while (st1.hasMoreTokens()) {
            String value = st1.nextToken().toLowerCase(Locale.ROOT);
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        return map;
    }
}
