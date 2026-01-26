package PluginExample;

import PluginExample.fake.Activity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/***
 * 这里是由模块内部直接使用的Api
 * 在脚本里是裸方法,直接 方法名(参数) 调用,前面无需加任何类名
 */
public class PluginInternalApi {
    /***
     * 获取当前登录账号
     * @return 当前登录账号
     */
    public static String getAccount() {
        return "123456";
    }

    /***
     * 获取当前插件sdk版本
     * 在插件方法发生变更时,此版本号会增加
     * @return 当前插件sdk版本
     */
    public static int getVer() {
        return 2;
    }

    /***
     * 获取当前界面的Activity实例
     * 如果当前脚本运行于后台,或者被其他弹窗覆盖,此方法会返回null
     * @return 当前Activity实例
     */
    public static Activity getActivity() {
        return new Activity();
    }

    /***
     * 弹出一个Toast提示
     * @param object
     */
    public static void Toast(Object object) {

    }

    /***
     * 获取一个保存的配置项内容
     * 返回的内容只会为基础类型,如String,Int,Boolean等
     * 具体返回的内容由你在写入的时候决定
     * 如果没有对应的配置项,则返回null
     * 内容保存在脚本目录的prop.json文件里
     * @param key
     * @return
     */
    public static Object getProp(String key) {
        return "123456";
    }

    /***
     * 写入一个配置项内容
     * 写入的内容可以为基础类型,如String,Int,Boolean等
     * 写入的内容会被保存到脚本目录的prop.json文件里
     * @param key
     * @param value
     */
    public static void writeProp(String key, Object value) {

    }

    /***
     * 获得一个脚本目录文件的临时路径
     * 获得的路径可以直接使用File类进行操作
     * @param path 脚本目录下的文件路径,为相对路径
     * @return
     */
    public static String getResTmpPath(String path) {
        return "";
    }

    /***
     * 打开一个脚本目录下的文件
     * 返回的InputStream可以直接用于读取文件内容
     * @param path 脚本目录下的文件路径,为相对路径
     * @return
     */
    public static InputStream readRes(String path) {
        return null;
    }

    /***
     * 写入一个脚本目录下的文件
     * 返回的OutputStream可以直接用于写入文件内容
     * @param path 脚本目录下的文件路径,为相对路径
     * @return
     */
    public static OutputStream writeRes(String path) {
        return null;
    }

     /***
     * 加载一个Java文件并附加到当前脚本环境中
     * @param name 文件名,为绝对路径
     */
    public static void loadJava(String name){

    }

    /***
     * 加载一个Dex文件并附加到全局脚本环境中
     * 你可以直接在脚本里使用dex中的类
     * 会返回一个类加载器,但由于保护机制的存在,你需要有开发者权限,或者脚本签名验证通过才能使用反射
     * @param name 文件名,为绝对路径
     */
    public static ClassLoader loadDex(String name){
        return null;
    }


    /***
     * 发送一个文本消息
     * @param type 消息类型,0为群消息,1为私聊消息
     * @param target 接收者账号,如果type为0,则为群号;如果type为1,则为账号
     *               当app为微信时,将不区分群号和好友,则type实际上不起作用
     * @param content 消息内容
     */
    public static void sendText(int type, String target, String content) {

    }

    /***
     * 发送一个图片消息
     * @param type 消息类型,0为群消息,1为私聊消息
     * @param target 接收者账号,如果type为0,则为群号;如果type为1,则为账号
     *               当app为微信时,将不区分群号和好友,则type实际上不起作用
     * @param link 图片路径,为绝对路径或者url
     */
    public static void sendImage(int type, String target, String link) {

    }

    /***
     * 发送一个混合消息
     * @param type 消息类型,0为群消息,1为私聊消息
     * @param target 接收者账号,如果type为0,则为群号;如果type为1,则为账号
     *               当app为微信时,将不区分群号和好友,则type实际上不起作用
     * @param mixed 消息内容,文本直接赋值即可,图片则需要加上 pic:: + 图片地址
     */
    public static void sendMix(int type, String target, String content, List<String> mixed) {

    }

    /***
     * 获取当前运行的app类型
     * @return 1为QQ, 2 为TIM, 3 为微信, 0 为未知
     */
    public static int getAppType() {
        return 0;
    }
}
