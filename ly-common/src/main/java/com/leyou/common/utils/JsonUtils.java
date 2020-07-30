package com.leyou.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.Nullable;//?
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author: HuYi.Zhang
 * @create: 2018-04-24 17:20
 **/
public class JsonUtils {

    public static final ObjectMapper mapper = new ObjectMapper();

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    @Nullable
    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj.getClass() == String.class) {
            return (String) obj;
        }
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("json序列化出错：" + obj, e);
            return null;
        }
    }

    @Nullable
    public static <T> T parse(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (IOException e) {
            logger.error("json解析出错：" + json, e);
            return null;
        }
    }

    @Nullable
    public static <E> List<E> toList(String json, Class<E> eClass) {
        try {
            return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, eClass));
        } catch (IOException e) {
            logger.error("json解析出错：" + json, e);
            return null;
        }
    }


    @Nullable
    public static <K, V> Map<K, V> toMap(String json, Class<K> kClass, Class<V> vClass) {
        try {
            /*if(json.startsWith("[")){
                System.out.println("json的开头是[");
                json=json.substring(1,json.length()-1);
            }*/
            //System.out.println("----------jsonutils----------:json" + json);
            return mapper.readValue(json, mapper.getTypeFactory().constructMapType(Map.class, kClass, vClass));
        } catch (IOException e) {
            logger.error("json解析出错：" + json, e);
            return null;
        }
    }

    @Nullable
    public static <T> T nativeRead(String json, TypeReference<T> type) {
        try {
            return mapper.readValue(json, type);
        } catch (IOException e) {
            logger.error("json解析出错：" + json, e);
            return null;
        }
    }


//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    static class User{
//        String name;
//        int age;
//}
//    public static void main(String[] args) {
//        User user = new User("Jack",21);
//        //toString,这里是serialze,序列化,对象->字符串
//        String json = serialize(user);
//        logger.info(json);
//        //反序列化,字符串->序列
//        User user2 = parse(json,User.class);
//        logger.info(user2.toString());
//        //parseList
//        json="[20,10,5,15]";
//        List<Integer> list = parseList(json, Integer.class);
//        System.out.println(list);
//        //parseMap
//        //language=JSON
//        json="{\"name\":\"Jack\",\"age\":\"21\"}";
//        Map<String, String> map = parseMap(json, String.class, String.class);
//        logger.info(String.valueOf(map));
//
//        //list中存放map
//        json="[{\"name\":\"Jack\",\"age\":\"21\"},{\"name\":\"Rose\",\"age\":\"18\"}]";
//        List<Map<String, String>> maps = nativeRead(json, new TypeReference<List<Map<String, String>>>() {
//        });
//
//        for (Map<String, String> map1 : maps) {
//            System.out.println(map1);
//        }
//    }
}
