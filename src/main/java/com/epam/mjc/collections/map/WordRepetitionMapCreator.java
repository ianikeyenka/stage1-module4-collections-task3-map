package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();
        if (sentence.length() != 0) {
            for (String word : sentence.replaceAll("[.,]", "").split(" ")) {
                if (wordMap.containsKey(word.toLowerCase())) {
                    wordMap.put(word.toLowerCase(), wordMap.get(word.toLowerCase()) + 1);
                } else {
                    wordMap.put(word.toLowerCase(), 1);
                }
            }
        }
        return wordMap;
    }
}
