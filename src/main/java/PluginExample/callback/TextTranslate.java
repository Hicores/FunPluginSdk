package PluginExample.callback;

public class TextTranslate {
    /***
     * 翻译文本
     * 翻译会在打开聊天界面的时候调用
     * 由于调用结果会进行缓存,所以你可能无法使用脚本筛选群聊来进行翻译
     * @param text 待翻译的文本
     * @return 翻译后的文本
     */
    public static String translate(String text){
        return "翻译后的文本";
    }
}
