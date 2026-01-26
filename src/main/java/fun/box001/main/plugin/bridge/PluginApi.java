package fun.box001.main.plugin.bridge;

public class PluginApi {
    public static class MenuCreateData {
        public String name;
        public String tag;
        public String pluginId;
        public MenuClickCallback run;
    }
    public interface MenuCreateOp{
        void createOnce(String name, String tag, MenuClickCallback run);
    }

    public interface MenuClickCallback{
        void onClick(String tag, PluginMsgData.MsgData msg);
    }
}
