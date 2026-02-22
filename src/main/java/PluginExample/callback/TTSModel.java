package PluginExample.callback;

import android.content.Context;

public class TTSModel {
    public static String performConvert(String text){
        return "https://example.com/tts.mp3";
    }

    /***
     * 仅sdk >=3时会调用
     * 在点击TTS界面中的打开设置界面会调用此方法,此方法始终在ui线程运行
     * @param context
     */
    public static void openSettings(Context context){

    }
}
