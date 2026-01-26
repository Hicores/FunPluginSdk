package PluginExample.callback;

import fun.box001.main.plugin.bridge.PluginApi;
import fun.box001.main.plugin.bridge.PluginMsgData;

import static PluginExample.PluginInternalApi.getAccount;
import static PluginExample.PluginInternalApi.sendText;

/***
 * 脚本消息回调
 * 在脚本类型里选择了消息后,在收到消息时,会自动加载脚本并调用方法
 * 注意,如果加载的账号非脚本开发者,且脚本签名校验未通过,则方法不会被调用
 */
public class MsgProcess {
    public static void onReceiveMsg(PluginMsgData.MsgData msg){
        if (!msg.sender.equals(getAccount())){
            sendText(0, msg.from, "你好");
        }
    }
}
