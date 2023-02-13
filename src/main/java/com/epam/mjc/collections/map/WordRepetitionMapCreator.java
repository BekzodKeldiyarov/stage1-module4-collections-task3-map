package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> words = new HashMap<>();
        String[] wordsList = sentence.split(" ");
        for (String s : wordsList) {
            s = s.toLowerCase();
            if (s.endsWith(".") || s.endsWith(",")) {
                s = s.substring(0, s.length() - 1);
            }
            if (s.trim() == "") {
                continue;
            }
            if (words.containsKey(s)) {
                Integer value = words.get(s);
                words.put(s, value + 1);
            } else {
                words.put(s, 1);
            }
        }
        return words;
    }


    public static void main(String[] args) {
        WordRepetitionMapCreator creator = new WordRepetitionMapCreator();
        System.out.println(creator.createWordRepetitionMap("hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe."));
    }
}
