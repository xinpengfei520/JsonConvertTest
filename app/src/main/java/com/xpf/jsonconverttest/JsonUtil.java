package com.xpf.jsonconverttest;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xpf on 2017/11/13 :)
 * Function:
 */

public class JsonUtil {

    /**
     * map convert to json string.
     *
     * @param map
     * @return
     */
    public static String toJson(HashMap<String, Object> map) {
        if (map != null && map.size() > 0) {
            JSONObject loginObject = new JSONObject();
            // 通过Map.entrySet遍历key和value"
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Log.e("TAG", "key= " + entry.getKey() + " and value= " + entry.getValue());
                try {
                    loginObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
            return loginObject.toString();
        } else {
            return "";
        }
    }

    /**
     * json string convert to jsonObject.
     *
     * @param json
     * @return
     */
    public static JSONObject fromJson(String json) {
        JSONObject jsonObject = null;
        if (!TextUtils.isEmpty(json)) {
            try {
                jsonObject = new JSONObject(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

}
