package com.shf;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(10);
        map.put("柳岩", 18);
        map.put("杨幂", 28);
        map.put("刘德华", 40);
        map.put("柳岩", 20);

        method(map);
        method_1(map);
        method_2(map);
        method_3(map);
    }

    /**
     * 分别遍历key和Values
     * @param hm
     */
    private static void method(HashMap<String,Integer> hm){
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = hm.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }

    /**
     * 使用Iterator迭代器迭代
     * @param hm
     */
    private static void method_1(HashMap<String,Integer> hm){
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        for (;iterator.hasNext();){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }

    /**
     * 通过get方式
     * @param hm
     */
    private static void method_2(HashMap<String,Integer> hm){
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    /**
     *
     * @param map
     */
    private static void method_3(HashMap<String, Integer> map) {
        map.forEach((key,value)->{
            System.out.println(key+"===="+value);
        });
    }
}
