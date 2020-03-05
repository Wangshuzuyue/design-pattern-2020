package com.hzw;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hzw.clone.DeepEntity;

import java.util.Collections;

/**
 * @author: huangzuwang
 * @date: 2020-03-03 12:02
 * @description:
 */
public class CloneTest {
    public static void main(String[] args) throws JsonProcessingException {
        DeepEntity deepEntity1 = new DeepEntity();
        deepEntity1.setNames(Collections.singletonList("aaa"));
        DeepEntity deepEntity2 = deepEntity1.deepClone();
        System.out.println(deepEntity1.getNames() == deepEntity2.getNames());
    }
}
