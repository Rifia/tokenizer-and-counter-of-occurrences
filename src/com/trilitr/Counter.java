package com.trilitr;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Counter {
    private Map<String, Integer> map = new HashMap<>();

    void incrementValue(String key) {
        if (map.containsKey(key)) {
            Integer i = map.get(key);
            map.put(key, ++i);
        } else {
            map.put(key, 1);
        }
    }

    void counterResult() throws IOException {
        FileWriter csvWriter = new FileWriter("..:\\....\\....\\...\\fileName.csv");
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                csvWriter.write(e.getValue() + "," + e.getKey() + "\n");
            }
            csvWriter.close();
        }
}
