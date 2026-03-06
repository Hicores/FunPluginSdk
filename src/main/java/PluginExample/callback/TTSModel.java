package PluginExample.callback;

import android.content.Context;

import java.util.HashMap;

public class TTSModel {
    /*
     在点击转换按钮时会调用
        text: 输入的文本内容
        id: 选择的角色id
     */
    public static String performConvert(String text, String id){
        return "https://example.com/tts.mp3";
    }

    /***
     * 获取可用的角色列表
     * 在点击切换配音员的时候调用
     * 返回一个HashMap对象
     * KEY为配音员的名字
     * VALUE为配音员的id,在performConvert方法中会传入这个id
     * @return
     */
    public static HashMap<String, String>getCharacters(){
        HashMap<String, String> characters = new HashMap<>();
        characters.put("character1", "id_5876786786");
        characters.put("character2", "id_56786879");
        return characters;
    }
}
