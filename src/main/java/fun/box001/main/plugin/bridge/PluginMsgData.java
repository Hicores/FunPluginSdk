package fun.box001.main.plugin.bridge;

import java.util.ArrayList;
import java.util.List;


public class PluginMsgData {
    public static class MsgData {
        public static final int APP_QQ = 1;
        public static final int APP_TIM = 2;
        public static final int APP_WX = 3;
        public int fromApp;

        //来源,群聊为群号,私聊为用户账号
        public String from;

        //发送者
        public String sender;


        public List<MsgItem> items = new ArrayList<>();
    }
    public static class MsgItem {
        public static final int TYPE_TEXT = 1;
        public static final int TYPE_PIC = 2;
        public static final int TYPE_RAW = 3;
        public int type;

        public MsgData parent;
        public String content;

        public Object raw;
        public Object boxed;
    }
    public static class TextMsgData extends MsgItem{
        public String text;
    }
    public static class PicMsgData extends MsgItem{
        public String md5;

        public String generateUrl(){
            return null;
        }
        public void downloadTo(String localPath, Runnable callback){

        }
    }
}
