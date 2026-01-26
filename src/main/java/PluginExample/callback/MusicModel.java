package PluginExample.callback;

import android.util.Pair;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusicModel {
    static {
        HashMap<String, Object> defaultParams = new HashMap<>();
        defaultParams.put("name", "名字"); // 显示的名字
        defaultParams.put("id", "123"); // id,你返回的目录,在打开的时候会传回
        defaultParams.put("extra", ""); // 同上
        defaultParams.put("page", 1); // 页码,翻页的时候会改变
        defaultParams.put("isDir", false);// 是否为目录,仅在fetch返回时有效,用以标记,且目录永远显示在前面
    }
    public static List<HashMap<String, Object>> fetchItems(HashMap<String, Object> params){
        List<HashMap<String, Object>> items = new ArrayList<>();

        HashMap<String, Object> item = new HashMap<>();
        item.put("name", params.get("name"));
        item.put("id", params.get("id"));
        item.put("extra", params.get("extra"));
        item.put("page", params.get("page"));
        item.put("hasNextPage", false);
        items.add(item);

        return items;
    }

    //这里参数的内容是将上面fetchItems你返回的内容再次传入
    public Pair<String, HashMap<String, String>> fetchPlayUrl(HashMap<String, Object> params) throws Exception {
        Pair<String, HashMap<String, String>> result = new Pair<>("https://example.com/music.mp3", new HashMap<>());
        //这里HashMap返回的是请求头,会在音频下载的时候使用
        result.second.put("user-agent", "FunBox/1.0");
        return result;
    }
}
