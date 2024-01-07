package com.github.catvod.crawler;

import android.content.Context;
import com.github.tvbox.osc.util.OkGoHelper;
import com.github.tvbox.osc.util.js.Connect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Dns;

public abstract class Spider {

    public void init(Context context)  {}

    public void init(Context context, String extend)  {
        init(context);
    }

    public String homeContent(boolean filter)  {
        return "";
    }

    public String homeVideoContent()  {
        return "";
    }

    public String categoryContent(String tid, String pg, boolean filter, HashMap < String, String > extend)  {
        return "";
    }

    public String detailContent(List < String > ids)  {
        return "";
    }

    public String searchContent(String key, boolean quick)  {
        return "";
    }

    public String searchContent(String key, boolean quick, String pg)  {
        return "";
    }

    public String playerContent(String flag, String id, List < String > vipFlags)  {
        return "";
    }

    public boolean manualVideoCheck()  {
        return false;
    }

    public boolean isVideoFormat(String url)  {
        return false;
    }

    public Object[] proxyLocal(Map < String, String > params)  {
        return null;
    }

    public void cancelByTag() {

    }

    public void destroy() {}

    public static Dns safeDns() {
        return OkGoHelper.dnsOverHttps;
    }
}
