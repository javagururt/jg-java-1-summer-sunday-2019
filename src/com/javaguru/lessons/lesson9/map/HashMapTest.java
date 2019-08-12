package com.javaguru.lessons.lesson9.map;

import java.util.HashMap;
import java.util.Map;

class HashMapTest {

    public static void main(String[] args) {
        Map<ProductKey, String> productKeyStringMap = new HashMap<>();

        ProductKey productKey = new ProductKey("apple", "from Latvia");

        ProductKey secondProductKey = new ProductKey("pineapple", "from Latvia");
        ProductKey thirdProductKey = new ProductKey("orange", "from Spain");
        productKeyStringMap.put(productKey, "with love <3");
        productKeyStringMap.put(secondProductKey, "with love <3");
        productKeyStringMap.put(thirdProductKey, "cheap and tasty");

        System.out.println(productKeyStringMap);

        ProductKey getFirstProductKey = new ProductKey("apple", "from Latvia");

        String firstProductKeyValue = productKeyStringMap.get(getFirstProductKey);

        System.out.println(firstProductKeyValue);
    }
}
