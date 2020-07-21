package com.example.lenovo.youmeng;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 设置组件化的Log开关
         * 参数: boolean 默认为false，如需查看LOG设置为true
         */
        UMConfigure.setLogEnabled(true);
        //第二个参数,友盟的ak
        //第三个参数,渠道号
        //第四个参数,设备类型
        //第五个参数,推送的key
        UMConfigure.init(this,"5e47c78e0feb474e621fb2ec"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0


        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //豆瓣RENREN平台目前只能在服务器端配置
        PlatformConfig.setSinaWeibo("1760446391", "7f874a05964b4f86a47bd9cbd03ef4f3",
                "http://sns.whalecloud.com");
        PlatformConfig.setQQZone("1108917876", "zXYXb7HAJo9eOXN8");
    }
}
