package PluginExample.callback;

import org.json.JSONArray;
import org.json.JSONObject;

import static PluginExample.PluginInternalApi.Toast;

/***
 * 表情包搜索
 */
public class StickerSearchModel {
    public static JSONObject search(String keyword){
        try {
            JSONObject result = new JSONObject();
            JSONArray items = new JSONArray();

            {
                JSONObject item = new JSONObject();
                item.put("url", "https://example.com/sticker1.png");
                {
                    //如果连接有防盗链等http请求头,可以指定
                    JSONObject header = new JSONObject();
                    header.put("user-agent", "FunBox/1.0");
                    item.put("headers", header);
                }

                items.put(item);
            }

            result.put("items", items);
            return result;
        }catch (Exception e){
            Toast(e);
            return null;
        }

    }
}
