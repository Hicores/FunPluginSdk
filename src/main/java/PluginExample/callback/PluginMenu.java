package PluginExample.callback;

//脚本里不需要写这行import
import static PluginExample.PluginInternalApi.sendMsg;

//脚本里需要写这行import
import fun.box001.main.plugin.bridge.PluginApi;

/***
 * 脚本菜单回调
 * 在脚本类型里选择了菜单后,在打开菜单界面时,会自动加载脚本并调用方法
 */
public class PluginMenu {
    public static void onMenuPreCreate(PluginApi.MenuCreateOp op){
        op.createOnce("菜单显示的内容", "TEST_MENU", ((tag, msg) -> {
            sendMsg(0, msg.from, "打死南浔");
        }));
    }
}
