package com.hzw.clone;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;


/**
 * @author: huangzuwang
 * @date: 2020-03-03 11:57
 * @description:
 */
public class DeepEntity implements Serializable, Cloneable {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    public DeepEntity() {
    }

    private List<String> names;

    private int age;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepEntity deepClone() throws JsonProcessingException {
        String str = MAPPER.writeValueAsString(this);
        return MAPPER.readValue(str, DeepEntity.class);
    }
}
