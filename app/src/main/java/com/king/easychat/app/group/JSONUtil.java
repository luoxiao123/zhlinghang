/*
*JSONUtil.java
*Created on 2014-9-29 上午9:54 by Ivan
*Copyright(c)2014 Guangzhou Onion Information Technology Co., Ltd.
*http://www.cniao5.com
*/
package com.king.easychat.app.group;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 14-9-29.
 * Copyright(c)2014 Guangzhou Onion Information Technology Co., Ltd.
 * http://www.cniao5.com
 */
public class JSONUtil
{


    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();


    public static Gson getGson()
    {
        return gson;
    }


    public static <T> T fromJson(String json, Class<T> clz)
    {
        try{
            return gson.fromJson(json, clz);
        }catch (Exception e){
            return null;
        }
    }


    public static <T> List<T> listfromJson(String json, Class<T> clz)
    {
        List<T> lst =  new ArrayList<T>();
        try {
            JsonArray array = new JsonParser().parse(json).getAsJsonArray();
            for(final JsonElement elem : array){
                lst.add(new Gson().fromJson(elem, clz));        }
        }catch (Exception e){
            Log.e("listfromJson",e.toString());
        }
        return lst;
    }

    public static <T> T fromJson(String json, Type type)
    {

        return gson.fromJson(json, type);
    }


    public static String toJSON(Object object)
    {

        return gson.toJson(object);
    }
}
