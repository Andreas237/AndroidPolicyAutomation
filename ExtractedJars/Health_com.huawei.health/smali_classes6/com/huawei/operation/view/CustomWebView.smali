.class public Lcom/huawei/operation/view/CustomWebView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/adapter/SetTitleCallback;
.implements Lcom/huawei/operation/adapter/ShareCallback;
.implements Lcom/huawei/operation/adapter/AchievementShareCallback;
.implements Lcom/huawei/operation/adapter/ToastCallBack;
.implements Lcom/huawei/operation/adapter/JsDataCallBack;
.implements Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;
.implements Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;
.implements Lcom/huawei/operation/adapter/StartFitnessPageCallback;
.implements Lcom/huawei/operation/adapter/TouchSignalCallBack;
.implements Lcom/huawei/operation/adapter/StartMiniShopWebPage;
.implements Lcom/huawei/operation/adapter/StartWebPage;
.implements Lcom/huawei/operation/adapter/StartAppSettingPage;
.implements Lcom/huawei/operation/adapter/CloseWebCallBack;
.implements Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;
.implements Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;
.implements Lcom/huawei/operation/adapter/SendCurrentUrlCallback;
.implements Lcom/huawei/operation/adapter/OnLoginCallback;
.implements Lcom/huawei/operation/share/ShareConfigCallback;
.implements Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;
.implements Lcom/huawei/operation/adapter/OnActivityQuitCallBack;
.implements Lcom/huawei/operation/adapter/OnVmallCouponCallBack;
.implements Lcom/huawei/operation/adapter/OnCaptureCallback;
.implements Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;
.implements Lcom/huawei/operation/adapter/VmallArgsignCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;,
        Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;
    }
.end annotation


# static fields
.field private static final ANNUAL_MEDAL_PATHPREFIX:Ljava/lang/String; = "http://localhost/annual2018/"

.field private static final COUPON_URL:Ljava/lang/String; = "/getdiscountlist"

.field public static final CRIP_COM:Ljava/lang/String; = ".crip.com"

.field public static final C_CTRIP_COM:Ljava/lang/String; = ".c-ctrip.com"

.field private static final DELAY_DURATION:I = 0x3e8

.field private static final DELAY_MAX_TIME:I = 0x7530

.field public static final DELAY_MILLIS:I = 0x7530

.field private static final DENY_TIME_PROGRESSBAR_GONE:I = 0x1f4

.field private static final EMPTYSTRING:Ljava/lang/String; = ""

.field private static final EMPTY_SPACE:Ljava/lang/String; = " "

.field public static final FILECHOOSER_RESULTCODE:I = 0x2766

.field public static final FILECHOOSER_RESULTCODE_FOR_ANDROID_5:I = 0x2767

.field private static final FILE_PROVIDER_PATH:Ljava/lang/String; = "com.huawei.health.fileprovider"

.field private static final HBSSDK:Ljava/lang/String; = "hbssdk"

.field public static final IS_LEGAL:Ljava/lang/String; = "IS_LEGAL"

.field public static final JAVA_SCRIPT:Ljava/lang/String; = "javascript:"

.field private static final JSINTERATION:Ljava/lang/String; = "JsInteraction"

.field public static final JS_FUNCTION_ERR:Ljava/lang/String; = "JS_FUNCTION_ERR"

.field public static final JS_FUNCTION_RES:Ljava/lang/String; = "JS_FUNCTION_RES"

.field public static final JS_FUNC_TYPE:Ljava/lang/String; = "JS_FUNC_TYPE"

.field public static final JS_PARAM:Ljava/lang/String; = "JS_PARAM"

.field public static final JS_SERVICE_TYPE:Ljava/lang/String; = "JS_SERVICE_TYPE"

.field public static final MAG_WEBVIEW_LOAD:I = 0xfa1

.field public static final MSG_CONNECT_TIMEOUT:I = 0x7d7

.field public static final MSG_GET_SPORT_DATA:I = 0x7db

.field public static final MSG_GRS_GET_URL:I = 0x7df

.field public static final MSG_HANDLE_WEBVIEW_TITLE:I = 0x7dc

.field private static final MSG_INNER_HANDER_IS_FIRST_LOAD_REST:I = 0xfa1

.field public static final MSG_JS_SERVICE:I = 0x7dd

.field public static final MSG_ONRECEIVED_ERROR:I = 0x7d1

.field public static final MSG_ON_NET_WORK:I = 0x7d3

.field public static final MSG_POST_TOAST:I = 0x7d5

.field public static final MSG_PROGRESSBAR_GONE:I = 0x7d0

.field public static final MSG_QUIT_ACT:I = 0x7de

.field public static final MSG_SERVER_ERROR:I = 0x7d6

.field public static final MSG_SHOW_DIALOG:I = 0x7da

.field public static final MSG_SHOW_MYACTIVITY:I = 0x7d9

.field public static final MSG_SSL_HANDLE_ERROR:I = 0x7d8

.field public static final MSG_START_APPSETTING_PAGE:I = 0x7e2

.field public static final MSG_START_MINI_SHOP_WEB_PAGE:I = 0x7d4

.field public static final MSG_START_WEB_PAGE:I = 0x7e0

.field public static final MSG_VMALL_COUPON:I = 0x7e1

.field public static final ON_PAGE_FINISH:I = 0x2766

.field public static final PERCENT_20:Ljava/lang/String; = "%20"

.field private static final PREFIXFILE:Ljava/lang/String; = "file://"

.field private static final PREFIXFILE_WHITE:Ljava/lang/String; = "file:///data/data/com.huawei.health/"

.field private static final PREFIXHTTP:Ljava/lang/String; = "http://"

.field private static final PREFIXHTTPS:Ljava/lang/String; = "https://"

.field public static final REQ_CODE_TAKE_PHOTO:I = 0x4e21

.field private static final SESSION_DELAY_MILLIS:I = 0x124f80

.field private static final TAG:Ljava/lang/String; = "Opera_CustomWebView"

.field public static final TRIP_COM:Ljava/lang/String; = ".trip.com"

.field public static final TYPE_MINI_SHOP_ACTIVITY:I = 0xbba

.field public static final TYPE_MINI_SHOP_FRAGMENT:I = 0xbb9

.field public static final UPDATE_TITLE:I = 0x7d2

.field private static final USER_AGENT:Ljava/lang/String; = "HuaweiHealth"

.field private static final X_HUID:Ljava/lang/String; = "x-huid"

.field private static final healthShopPermissions:[Ljava/lang/String;

.field private static list:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static localBIUrl:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static localTitleBeans:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/operation/beans/TitleBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private appVersion:Ljava/lang/String;

.field private captureFunction:Ljava/lang/String;

.field private currentUrl:Ljava/lang/String;

.field private customViewDialog:Lo/egw;

.field private imageUri:Landroid/net/Uri;

.field private innerHander:Landroid/os/Handler;

.field private isTouchH5ScrollView:Z

.field private isVmallCouponPage:Z

.field private isWebViewFirstLogin:Z

.field private mActivity:Landroid/app/Activity;

.field private mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

.field private mContext:Landroid/content/Context;

.field private mFrameLayout:Landroid/widget/FrameLayout;

.field private mHandler:Landroid/os/Handler;

.field private mProgressBar:Landroid/widget/ProgressBar;

.field private mShareConfig:Lcom/huawei/operation/share/ShareConfig;

.field private mTextTitle:Landroid/widget/TextView;

.field private mType:I

.field private mUploadMessage:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
        }
    .end annotation
.end field

.field private mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;"
        }
    .end annotation
.end field

.field private mWebChromeClientBase:Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;

.field private mWebView:Landroid/webkit/WebView;

.field private mWebViewClientBase:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

.field private mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

.field private mWebViewTitles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private myWebviewClientImpl:Lcom/huawei/operation/view/WebViewClientImpl;

.field private originUrl:Ljava/lang/String;

.field private registerActivityQuitFunctionRes:Ljava/lang/String;

.field private registerVmallCouponFunctionRes:Ljava/lang/String;

.field private unsafeUrl:Ljava/lang/String;

.field private urlLists:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private webViewStatusFuction:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 212
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->healthShopPermissions:[Ljava/lang/String;

    .line 777
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    .line 780
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    .line 781
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, "http:"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, "https:"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 783
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, "404 Not Found"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".xhtml"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".htm"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 787
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".asp"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 788
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".jsp"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 789
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".php"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".xml"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    const-string v1, ".css"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1862
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    .line 1864
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    .line 1866
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ZIXUN#https://mp.weixin.qq.com"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1867
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ZIXUN#http://www.newrank.cn/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1868
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ZIXUN#https://xiumi.us/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1869
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ZIXUN#http://www.json.cn/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1870
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ZIXUN#https://v.qq.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1872
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ACT#https://healthactivity.hicloud.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1873
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ACT#https://www.sojump.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1874
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ACT#https://www.wenjuan.com"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1875
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_ACT#http://www.mikecrm.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1877
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SHOP#https://huaweim.miaomore.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1878
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SHOP#https://healthrecommend.hicloud.com/miniShop/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1880
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SERVER#https://nice.boohee.com/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1881
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SERVER#https://www.heartide.com/huawei/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1882
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SERVER#https://run.zhongan.com/channel_docking/huawei"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1883
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SERVER#http://www.chunyuyisheng.com/cooperation/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    const-string v1, "BI_SERVER#http://www.chunyuyisheng.com/cooperation/wap/search_doctor_page/"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2007
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    .line 2019
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "huaweim.miaomore.com"

    const-string v3, "x"

    const-string v4, "more"

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2021
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "healthrecommend.hicloud.com/miniShop/"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2023
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "healthrecommend.hicloud.com/messageH5/"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2025
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "healthactivity.hicloud.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2026
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "achievement.hicloud.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2028
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "heartide.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2029
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "boohee.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2030
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "boohee.cn"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2031
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "zhongan.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2032
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "alipay.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2033
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "unionpay.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2034
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "95516.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2035
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "miaohealth.net"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2036
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "tenpay.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2037
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "chunyuyisheng.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2038
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "codoon.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2039
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "guahao.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2041
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "wenjuan.net"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2042
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "sojump.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2043
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "wenjuan.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2044
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "mikecrm.com"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2045
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "wjx.top"

    const-string v3, "x"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2048
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "https://health.vmall.com/help/"

    const-string v3, "arrow"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2049
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    new-instance v1, Lcom/huawei/operation/beans/TitleBean;

    const-string v2, "vmall.com"

    const-string v3, "arrow"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    invoke-direct/range {v1 .. v7}, Lcom/huawei/operation/beans/TitleBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2050
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V
    .locals 2

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->unsafeUrl:Ljava/lang/String;

    .line 208
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isWebViewFirstLogin:Z

    .line 210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isVmallCouponPage:Z

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    .line 236
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView:Z

    .line 237
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    .line 238
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    .line 240
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    .line 247
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerActivityQuitFunctionRes:Ljava/lang/String;

    .line 249
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerVmallCouponFunctionRes:Ljava/lang/String;

    .line 256
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mFrameLayout:Landroid/widget/FrameLayout;

    .line 334
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$1;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->innerHander:Landroid/os/Handler;

    .line 1058
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->captureFunction:Ljava/lang/String;

    .line 361
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    .line 362
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    .line 363
    iput-object p4, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    .line 364
    iput-object p3, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    .line 365
    iput p6, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    .line 366
    iput-object p5, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    .line 367
    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView;->mFrameLayout:Landroid/widget/FrameLayout;

    .line 368
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 369
    new-instance v0, Lcom/huawei/operation/share/ShareConfig;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p5}, Lcom/huawei/operation/share/ShareConfig;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    .line 370
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->initWebView()V

    .line 371
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V
    .locals 2

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->unsafeUrl:Ljava/lang/String;

    .line 208
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isWebViewFirstLogin:Z

    .line 210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isVmallCouponPage:Z

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    .line 236
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView:Z

    .line 237
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    .line 238
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    .line 240
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    .line 247
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerActivityQuitFunctionRes:Ljava/lang/String;

    .line 249
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerVmallCouponFunctionRes:Ljava/lang/String;

    .line 256
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mFrameLayout:Landroid/widget/FrameLayout;

    .line 334
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$1;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$1;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->innerHander:Landroid/os/Handler;

    .line 1058
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->captureFunction:Ljava/lang/String;

    .line 349
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    .line 350
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    .line 351
    iput-object p3, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    .line 352
    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    .line 353
    iput p5, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    .line 354
    iput-object p4, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    .line 355
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 356
    new-instance v0, Lcom/huawei/operation/share/ShareConfig;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p4}, Lcom/huawei/operation/share/ShareConfig;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    .line 357
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->initWebView()V

    .line 358
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/view/CustomWebView;)Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isWebViewFirstLogin:Z

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/operation/view/CustomWebView;Z)Z
    .locals 0

    .line 121
    iput-boolean p1, p0, Lcom/huawei/operation/view/CustomWebView;->isWebViewFirstLogin:Z

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    return-object v0
.end method

.method static synthetic access$1002(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->selectImageDialog()V

    return-void
.end method

.method static synthetic access$1202(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/FrameLayout;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mFrameLayout:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->checkHavePermission()V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->fileChoose()V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Z
    .locals 1

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->shouldOverrideUrlHandler(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1700(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/ProgressBar;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1802(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1902(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Z
    .locals 1

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->isHealthVmall(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$2200(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->innerHander:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2300(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->unsafeUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2302(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->unsafeUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$2400(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/operation/view/CustomWebView;)Landroid/content/Context;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$2600(Lcom/huawei/operation/view/CustomWebView;)Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isVmallCouponPage:Z

    return v0
.end method

.method static synthetic access$2602(Lcom/huawei/operation/view/CustomWebView;Z)Z
    .locals 0

    .line 121
    iput-boolean p1, p0, Lcom/huawei/operation/view/CustomWebView;->isVmallCouponPage:Z

    return p1
.end method

.method static synthetic access$2700(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/view/WebViewClientImpl;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->myWebviewClientImpl:Lcom/huawei/operation/view/WebViewClientImpl;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/operation/view/CustomWebView;I)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->setProgressBar(I)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->setBrowserTitle(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewTitles:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/view/CustomWebView;->onGeolocationPermissionsShowPromptDialog(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    return-void
.end method

.method private checkHavePermission()V
    .locals 7

    .line 1375
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/huawei/operation/view/CustomWebView;->healthShopPermissions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1377
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_4

    .line 1378
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1379
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 1380
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 1381
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 1382
    :goto_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    const-string v1, "android.permission.CAMERA"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v6

    .line 1383
    if-nez v4, :cond_4

    if-nez v5, :cond_4

    if-nez v6, :cond_4

    .line 1384
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1385
    return-void

    .line 1389
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/huawei/operation/view/CustomWebView;->healthShopPermissions:[Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/operation/view/CustomWebView;->checkHavePermission(Landroid/content/Context;[Ljava/lang/String;)V

    .line 1391
    return-void
.end method

.method private fileChoose()V
    .locals 4

    .line 1462
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileChoose"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1463
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 1464
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->openFileChooserImplForAndroid5(Landroid/app/Activity;)V

    goto :goto_0

    .line 1466
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->openFileChooserImpl(Landroid/app/Activity;)V

    .line 1468
    :goto_0
    return-void
.end method

.method private getGetDialogTips(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1132
    const-string v4, ""

    .line 1133
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1134
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1135
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, v5}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->queryServiceNameByID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1136
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1137
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_me_healthshop_webview_location_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1138
    return-object v4

    .line 1142
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_me_healthshop_webview_location_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/operation/utils/Utils;->getHostByJDK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1143
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_me_healthshop_webview_third_pre:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1144
    return-object v4
.end method

.method private initData()V
    .locals 6

    .line 381
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 384
    if-nez v4, :cond_0

    .line 385
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginOperationAdapter=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    return-void

    .line 388
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "getAppInfo"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {v4, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getInfo([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 389
    const-string v0, "grayVersion"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    .line 391
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewTitles:Ljava/util/List;

    .line 392
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    .line 393
    return-void
.end method

.method private initJsInteraction()V
    .locals 9

    .line 487
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initJsInteraction"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 490
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initJsInteraction isOversea return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    return-void

    .line 494
    :cond_0
    new-instance v8, Lcom/huawei/operation/js/JsInteraction;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v8, v0}, Lcom/huawei/operation/js/JsInteraction;-><init>(Landroid/content/Context;)V

    .line 495
    invoke-virtual {v8, p0, p0, p0}, Lcom/huawei/operation/js/JsInteraction;->setShareCallback(Lcom/huawei/operation/adapter/ShareCallback;Lcom/huawei/operation/adapter/AchievementShareCallback;Lcom/huawei/operation/adapter/OnCaptureCallback;)V

    .line 496
    move-object v0, v8

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/operation/js/JsInteraction;->setStarAndEndCallback(Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;Lcom/huawei/operation/adapter/StartFitnessPageCallback;Lcom/huawei/operation/adapter/StartMiniShopWebPage;Lcom/huawei/operation/adapter/StartWebPage;Lcom/huawei/operation/adapter/StartAppSettingPage;Lcom/huawei/operation/adapter/CloseWebCallBack;)V

    .line 497
    move-object v0, v8

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/operation/js/JsInteraction;->setSendCallback(Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;Lcom/huawei/operation/adapter/SendCurrentUrlCallback;Lcom/huawei/operation/adapter/OnActivityQuitCallBack;Lcom/huawei/operation/adapter/OnVmallCouponCallBack;Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;Lcom/huawei/operation/adapter/VmallArgsignCallback;)V

    .line 498
    invoke-virtual {v8, p0, p0, p0}, Lcom/huawei/operation/js/JsInteraction;->setWidgetCallback(Lcom/huawei/operation/adapter/SetTitleCallback;Lcom/huawei/operation/adapter/ToastCallBack;Lcom/huawei/operation/adapter/JsDataCallBack;)V

    .line 499
    invoke-virtual {v8, p0, p0, p0}, Lcom/huawei/operation/js/JsInteraction;->setTouchCalllback(Lcom/huawei/operation/adapter/TouchSignalCallBack;Lcom/huawei/operation/adapter/OnLoginCallback;Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;)V

    .line 500
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v8, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    return-void
.end method

.method private initWebView()V
    .locals 4

    .line 374
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->initData()V

    .line 376
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->initWebViewSettings()V

    .line 377
    invoke-direct {p0}, Lcom/huawei/operation/view/CustomWebView;->initJsInteraction()V

    .line 378
    return-void
.end method

.method private initWebViewSettings()V
    .locals 8

    .line 396
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWebViewSettings"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v4

    .line 400
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 401
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 405
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    .line 406
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    goto :goto_0

    .line 409
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 411
    :goto_0
    const-wide/32 v0, 0x800000

    invoke-virtual {v5, v0, v1}, Landroid/webkit/WebSettings;->setAppCacheMaxSize(J)V

    .line 412
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/webCache"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 413
    invoke-virtual {v5, v6}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 414
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 415
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 416
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 418
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 419
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 421
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v7

    .line 422
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "HuaweiHealth"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 425
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 426
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 427
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_2

    .line 429
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 431
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 433
    const/16 v0, 0x64

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 434
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 435
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 436
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 437
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 439
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 440
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 444
    :cond_3
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 445
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWebContentsDebuggingEnabled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const/4 v0, 0x1

    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 449
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$2;

    invoke-direct {v1, p0}, Lcom/huawei/operation/view/CustomWebView$2;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 480
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;-><init>(Lcom/huawei/operation/view/CustomWebView;Lcom/huawei/operation/view/CustomWebView$1;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebChromeClientBase:Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;

    .line 481
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;-><init>(Lcom/huawei/operation/view/CustomWebView;Lcom/huawei/operation/view/CustomWebView$1;)V

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewClientBase:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    .line 482
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mWebChromeClientBase:Lcom/huawei/operation/view/CustomWebView$WebChromeClientBase;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewClientBase:Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 484
    return-void
.end method

.method private isHealthVmall(Ljava/lang/String;)Z
    .locals 4

    .line 1487
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1488
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthVmall is empty url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1489
    const/4 v0, 0x0

    return v0

    .line 1491
    :cond_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1492
    const-string v0, "http://hwlf.hwcloudtest.cn:10180/healthMallPlat/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://openapi.test.vmall.com/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1493
    :cond_1
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthVmall is true in test version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1494
    const/4 v0, 0x1

    return v0

    .line 1497
    :cond_2
    const-string v0, "https://healthrecommend.hicloud.com/healthMallPlat/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1498
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthVmall is true in release version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1499
    const/4 v0, 0x1

    return v0

    .line 1502
    :cond_3
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHealthVmall is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1503
    const/4 v0, 0x0

    return v0
.end method

.method private isValidUrl(Ljava/lang/String;)Z
    .locals 2

    .line 2117
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2118
    const/4 v0, 0x0

    return v0

    .line 2120
    :cond_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "file://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onGeolocationPermissionsShowPromptDialog(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 6

    .line 1153
    const/4 v3, 0x0

    .line 1154
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1155
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->getGetDialogTips(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1156
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1157
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_user_permission_ok:I

    .line 1158
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/operation/view/CustomWebView$9;

    invoke-direct {v2, p0, p2, p1}, Lcom/huawei/operation/view/CustomWebView$9;-><init>(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 1165
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/operation/view/CustomWebView$8;

    invoke-direct {v2, p0, p2, p1}, Lcom/huawei/operation/view/CustomWebView$8;-><init>(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1172
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1173
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    goto :goto_0

    .line 1175
    :cond_0
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 1176
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$10;

    invoke-direct {v0, p0, p2, p1}, Lcom/huawei/operation/view/CustomWebView$10;-><init>(Lcom/huawei/operation/view/CustomWebView;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lo/egv;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1183
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 1185
    :goto_0
    return-void
.end method

.method private reportValidUrl(Ljava/lang/String;)V
    .locals 5

    .line 1989
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1990
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportValidUrl isOversea return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1991
    return-void

    .line 1993
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1994
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1995
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 1996
    const-string v0, "lasturl"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1998
    :cond_1
    const-string v0, "lasturl"

    const-string v1, ""

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2000
    :goto_0
    const-string v0, "invalidurl"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2001
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget-object v2, Lo/dae;->gZ:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2002
    return-void
.end method

.method private selectImageDialog()V
    .locals 11

    .line 1320
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "commonwebview : selectImageDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 1322
    sget v0, Lcom/huawei/operation/R$layout;->hw_show_select_pic_dialog_view:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1323
    sget v0, Lcom/huawei/operation/R$id;->line_take_photo:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 1324
    sget v0, Lcom/huawei/operation/R$id;->line_gallery:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 1325
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$11;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$11;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1332
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$12;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$12;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1340
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1341
    new-instance v9, Lcom/huawei/operation/view/CustomWebView$13;

    invoke-direct {v9, p0}, Lcom/huawei/operation/view/CustomWebView$13;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1347
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_select_upload_way:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 1348
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_settings_button_cancal:I

    .line 1349
    invoke-virtual {v0, v1, v9}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1351
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->customViewDialog:Lo/egw;

    .line 1352
    new-instance v10, Lcom/huawei/operation/view/CustomWebView$14;

    invoke-direct {v10, p0}, Lcom/huawei/operation/view/CustomWebView$14;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    .line 1358
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->customViewDialog:Lo/egw;

    invoke-virtual {v0, v10}, Lo/egw;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1359
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->customViewDialog:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 1360
    return-void
.end method

.method private setBrowserTitle(Ljava/lang/String;)V
    .locals 6

    .line 569
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBrowserTitle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WebViewActivity setBrowserTitle title = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mTextTitle:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 572
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WebViewActivity setBrowserTitle mTextTitle != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    sget-object v0, Lcom/huawei/operation/view/CustomWebView;->list:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lcom/huawei/operation/utils/WebViewUtils;->isUnreasonableTitle(Ljava/util/ArrayList;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 575
    const-string p1, ""

    goto :goto_0

    .line 576
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    .line 578
    :try_start_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 579
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v5

    .line 580
    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 581
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "title.contains(urlHost) title is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "urlHost is = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    const-string v0, ""

    move-object p1, v0

    .line 586
    :cond_1
    goto :goto_0

    .line 584
    :catch_0
    move-exception v4

    .line 585
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    :cond_2
    :goto_0
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 589
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d2

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 590
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewTitles:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 591
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != mWebViewTitles"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewTitles:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 596
    :cond_3
    return-void
.end method

.method private setProgressBar(I)V
    .locals 5

    .line 1299
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setProgressBar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1300
    iget v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    const/16 v1, 0xbb9

    if-ne v0, v1, :cond_0

    .line 1301
    return-void

    .line 1303
    :cond_0
    const/16 v0, 0x64

    if-lt p1, v0, :cond_1

    .line 1304
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setProgressBar >= 100"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1305
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1306
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1307
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1308
    goto :goto_0

    .line 1309
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 1310
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1312
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1314
    :goto_0
    return-void
.end method

.method private shouldOverrideUrlHandler(Ljava/lang/String;)Z
    .locals 6

    .line 1838
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldOverrideUrl originUrl: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1839
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->replaceSpace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1840
    iput-object v4, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    .line 1841
    invoke-direct {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1842
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isWhiteUrl(Ljava/lang/String;)Z

    move-result v5

    .line 1843
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 1844
    if-nez v5, :cond_0

    .line 1845
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldOverrideUrlHandler isWhiteUrl false url is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1846
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1847
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1848
    const/4 v0, 0x1

    return v0

    .line 1850
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1853
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-static {v0, v1, v4}, Lcom/huawei/operation/utils/WebViewUtils;->schemeHandle(Landroid/content/Context;Lcom/huawei/operation/adapter/PluginOperationAdapter;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1854
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scheme is known"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1855
    const/4 v0, 0x1

    return v0

    .line 1857
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scheme is unknown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1858
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public callBackWebviewStatus(Ljava/lang/String;)V
    .locals 5

    .line 2144
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callBackWebviewStatus status : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2145
    const-string v4, ""

    .line 2146
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->webViewStatusFuction:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->webViewStatusFuction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2150
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2151
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TextUtils.isEmpty(callJs)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2152
    return-void

    .line 2154
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 2156
    return-void
.end method

.method public callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 974
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callJsServiceFunction enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 976
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7dd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 977
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 978
    const-string v0, "JS_SERVICE_TYPE"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 979
    const-string v0, "JS_FUNC_TYPE"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 980
    const-string v0, "JS_PARAM"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 981
    const-string v0, "JS_FUNCTION_RES"

    invoke-virtual {v5, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 982
    const-string v0, "IS_LEGAL"

    invoke-virtual {v5, v0, p5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 983
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 984
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 987
    :cond_0
    return-void
.end method

.method public callJsSportDataFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 959
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callJsSportDataFunction enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 960
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 961
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7db

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 962
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 963
    const-string v0, "JS_PARAM"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 964
    const-string v0, "JS_FUNCTION_RES"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    const-string v0, "JS_FUNCTION_ERR"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 966
    const-string v0, "IS_LEGAL"

    invoke-virtual {v5, v0, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 967
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 968
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 970
    :cond_0
    return-void
.end method

.method public callSleepQuestionnaireJsFuncion(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 998
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$5;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/huawei/operation/view/CustomWebView$5;-><init>(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 1014
    return-void
.end method

.method public callVmallArgsignJsFuncion(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1018
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$6;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/huawei/operation/view/CustomWebView$6;-><init>(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 1034
    return-void
.end method

.method public checkHavePermission(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 8

    .line 1427
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1428
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 1429
    invoke-virtual {p0}, Lcom/huawei/operation/view/CustomWebView;->takePhoto()V

    .line 1430
    return-void

    .line 1432
    :cond_0
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1433
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$15;

    invoke-direct {v1, p0}, Lcom/huawei/operation/view/CustomWebView$15;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    invoke-static {v0, p2, v1}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 1444
    move-object v4, p2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 1445
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1446
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 1447
    :cond_1
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1448
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 1449
    :cond_2
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1450
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 1444
    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    goto :goto_2

    .line 1454
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/operation/view/CustomWebView;->takePhoto()V

    .line 1456
    :goto_2
    return-void
.end method

.method public clear()V
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->innerHander:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->innerHander:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 283
    :cond_0
    invoke-static {}, Lcom/huawei/operation/utils/CasLoginManager;->getInstance()Lcom/huawei/operation/utils/CasLoginManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/utils/CasLoginManager;->release()V

    .line 284
    return-void
.end method

.method public clearUploadMessage()V
    .locals 4

    .line 1363
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearUploadMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1364
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    if-eqz v0, :cond_0

    .line 1365
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1366
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    goto :goto_0

    .line 1367
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    if-eqz v0, :cond_1

    .line 1368
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    const/4 v1, 0x0

    new-array v1, v1, [Landroid/net/Uri;

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1369
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    .line 1371
    :cond_1
    :goto_0
    return-void
.end method

.method public getCaptureFunction()Ljava/lang/String;
    .locals 1

    .line 1061
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->captureFunction:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentUrl()Ljava/lang/String;
    .locals 4

    .line 505
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 506
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentUrl null != currentUrl "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentUrl currentUrl == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->currentUrl:Ljava/lang/String;

    return-object v0

    .line 510
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentUrl currentUrl == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCustomViewDialog()Lo/egw;
    .locals 4

    .line 298
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCustomViewDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->customViewDialog:Lo/egw;

    return-object v0
.end method

.method public getImageUri()Landroid/net/Uri;
    .locals 4

    .line 317
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImageUri"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->imageUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getProgressBar()Landroid/widget/ProgressBar;
    .locals 4

    .line 753
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getProgressBar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mProgressBar:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public getRegisterActivityQuitFunctionRes()Ljava/lang/String;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerActivityQuitFunctionRes:Ljava/lang/String;

    return-object v0
.end method

.method public getRegisterVmallCouponFunctionRes()Ljava/lang/String;
    .locals 1

    .line 271
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->registerVmallCouponFunctionRes:Ljava/lang/String;

    return-object v0
.end method

.method public getUrlBIType(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1895
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1896
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUrlBIType mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1897
    const-string v0, ""

    return-object v0

    .line 1899
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const-string v1, "BI_url"

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->queryUrlList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 1900
    const/4 v5, 0x0

    .line 1901
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1902
    move-object v5, v4

    .line 1903
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in cloudBIUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1905
    :cond_1
    sget-object v5, Lcom/huawei/operation/view/CustomWebView;->localBIUrl:Ljava/util/ArrayList;

    .line 1906
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in localBIUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1908
    :goto_0
    const/4 v6, 0x0

    .line 1909
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 1910
    const-string v0, "#"

    const/4 v1, 0x2

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 1911
    if-eqz v6, :cond_2

    array-length v0, v6

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1912
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1913
    const/4 v0, 0x0

    aget-object v0, v6, v0

    return-object v0

    .line 1916
    :cond_2
    goto :goto_1

    .line 1917
    :cond_3
    const-string v0, ""

    return-object v0
.end method

.method public getmUploadMessage()Landroid/webkit/ValueCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
        }
    .end annotation

    .line 288
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getmUploadMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object v0
.end method

.method public getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;"
        }
    .end annotation

    .line 307
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getmUploadMessageForAndroid5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    return-object v0
.end method

.method public getmWebViewConfig()Lcom/huawei/operation/beans/WebViewConfig;
    .locals 2

    .line 2128
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-nez v0, :cond_0

    .line 2129
    const/4 v0, 0x0

    return-object v0

    .line 2131
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2132
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->queryWebViewConfig()Lcom/huawei/operation/beans/WebViewConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    .line 2134
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    return-object v0
.end method

.method public goBack()Z
    .locals 4

    .line 717
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_1

    .line 718
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->canFinish(Landroid/app/Activity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 719
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breathe finish activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 720
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 721
    const/4 v0, 0x1

    return v0

    .line 722
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->canFinish(Landroid/app/Activity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 723
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breathe show stop dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    const/4 v0, 0x1

    return v0

    .line 728
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 729
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "canGoBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 731
    const/4 v0, 0x1

    return v0

    .line 733
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no GoBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    const/4 v0, 0x0

    return v0
.end method

.method public goBackToMiniShop()V
    .locals 4

    .line 884
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goBackToMiniShop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    invoke-virtual {p0}, Lcom/huawei/operation/view/CustomWebView;->jumpToMainByClearTop()V

    .line 886
    return-void
.end method

.method public isCustomTitle(Ljava/lang/String;)V
    .locals 10

    .line 2057
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-nez v0, :cond_2

    .line 2058
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentUrl is null = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mAdapter is null = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v3, 0x0

    if-ne v3, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2059
    return-void

    .line 2061
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2062
    const/4 v4, 0x0

    .line 2063
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2064
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    invoke-virtual {v0}, Lcom/huawei/operation/beans/WebViewConfig;->fetch_getTitleBeanConfigs()Ljava/util/List;

    move-result-object v4

    goto :goto_1

    .line 2066
    :cond_3
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->queryWebViewConfig()Lcom/huawei/operation/beans/WebViewConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    .line 2067
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryWebViewConfig = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2068
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 2069
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebViewConfig:Lcom/huawei/operation/beans/WebViewConfig;

    invoke-virtual {v0}, Lcom/huawei/operation/beans/WebViewConfig;->fetch_getTitleBeanConfigs()Ljava/util/List;

    move-result-object v4

    goto :goto_1

    .line 2071
    :cond_4
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mWebViewConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2074
    :goto_1
    const/4 v5, 0x0

    .line 2075
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 2076
    move-object v5, v4

    .line 2077
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isCustomTitle in cloudTitleBeanList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 2079
    :cond_5
    sget-object v5, Lcom/huawei/operation/view/CustomWebView;->localTitleBeans:Ljava/util/List;

    .line 2080
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isCustomTitle in localTitleBeans"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2083
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/operation/beans/TitleBean;

    .line 2084
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2085
    new-instance v8, Lcom/huawei/operation/beans/TitleBean;

    invoke-direct {v8}, Lcom/huawei/operation/beans/TitleBean;-><init>()V

    .line 2086
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setUrl(Ljava/lang/String;)V

    .line 2087
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getRightBtn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setRightBtn(Ljava/lang/String;)V

    .line 2088
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getLeftBtn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setLeftBtn(Ljava/lang/String;)V

    .line 2089
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getFeatureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setFeatureUrl(Ljava/lang/String;)V

    .line 2090
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getShopcarUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setShopcarUrl(Ljava/lang/String;)V

    .line 2091
    invoke-virtual {v7}, Lcom/huawei/operation/beans/TitleBean;->fetch_getOrderManagerUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setOrderManagerUrl(Ljava/lang/String;)V

    .line 2092
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->getActivityKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 2093
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web/html/activity.html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2094
    const-string v0, "isMyActivity"

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setRightBtn(Ljava/lang/String;)V

    .line 2095
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setRegisterActivityQuitFunctionRes(Ljava/lang/String;)V

    goto :goto_4

    .line 2096
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web/html/myActivity.html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2097
    const-string v0, ""

    invoke-virtual {v8, v0}, Lcom/huawei/operation/beans/TitleBean;->config_setRightBtn(Ljava/lang/String;)V

    .line 2098
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setRegisterActivityQuitFunctionRes(Ljava/lang/String;)V

    .line 2100
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7dc

    invoke-virtual {v0, v1, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2101
    return-void

    .line 2103
    :cond_8
    goto/16 :goto_3

    .line 2104
    :cond_9
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7dc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2105
    goto :goto_5

    .line 2106
    :cond_a
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isCustomTitle isValidUrl is false ."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2108
    :goto_5
    return-void
.end method

.method public isTouchH5ScrollView()Z
    .locals 1

    .line 327
    iget-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView:Z

    return v0
.end method

.method public isWhiteOtherUrl(Ljava/lang/String;)Z
    .locals 5

    .line 1950
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1951
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1952
    const/4 v0, 0x0

    return v0

    .line 1955
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1957
    invoke-static {p1}, Lcom/huawei/operation/utils/WebViewUtils;->isOverseaUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1958
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl is Oversea url return true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1959
    const/4 v0, 0x1

    return v0

    .line 1961
    :cond_1
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl is not Oversea url return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1962
    const/4 v0, 0x0

    return v0

    .line 1964
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1965
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->urlLists:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1967
    :cond_3
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1968
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-static {p1, v0}, Lcom/huawei/operation/utils/Utils;->isWhiteUrlLogicJudge(Ljava/lang/String;Lcom/huawei/operation/adapter/PluginOperationAdapter;)Z

    move-result v4

    .line 1969
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl isValidUrl is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1970
    if-eqz v4, :cond_5

    .line 1971
    const/4 v0, 0x1

    return v0

    .line 1973
    :cond_5
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid url is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->reportValidUrl(Ljava/lang/String;)V

    .line 1976
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid url return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1977
    const/4 v0, 0x0

    return v0

    .line 1979
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public isWhiteUrl(Ljava/lang/String;)Z
    .locals 4

    .line 1931
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->needAuth(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1932
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl do not need auth version !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1933
    const/4 v0, 0x1

    return v0

    .line 1935
    :cond_0
    invoke-static {p1}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1936
    const/4 v0, 0x1

    return v0

    .line 1938
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->isWhiteOtherUrl(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public jumpToMainByClearTop()V
    .locals 7

    .line 889
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToMain"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 890
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 891
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 893
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 894
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 895
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 896
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 897
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 900
    goto :goto_0

    .line 898
    :catch_0
    move-exception v6

    .line 899
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthAPPIntent()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 901
    :goto_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pIntent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 903
    invoke-virtual {p0}, Lcom/huawei/operation/view/CustomWebView;->sendLocalBroadCast()V

    .line 904
    return-void
.end method

.method public load(Ljava/lang/String;)V
    .locals 6

    .line 603
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load originUrl ===>xxx"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load originUrl ===>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load url ===>isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    const-string p1, "about:blank"

    .line 610
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->replaceSpace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 611
    iput-object v4, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    .line 612
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 613
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load isWhiteUrl is false url is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 615
    return-void

    .line 617
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 619
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 620
    const-string v0, "javascript:"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 621
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https or JAVA_SCRIPT protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    invoke-static {v4}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 623
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not file protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 625
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    goto :goto_0

    .line 628
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JAVA_SCRIPT protocol not removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    :cond_3
    :goto_0
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isCustomTitle(Ljava/lang/String;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "file:///android_asset/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 634
    :cond_4
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load url isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 636
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$4;

    invoke-direct {v1, p0}, Lcom/huawei/operation/view/CustomWebView$4;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 646
    goto :goto_1

    .line 647
    :cond_5
    iget v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    const/16 v1, 0xbb9

    if-ne v1, v0, :cond_6

    .line 648
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load url TYPE_MINI_SHOP_FRAGMENT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 650
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 653
    goto :goto_1

    .line 654
    :cond_6
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load url MSG_ON_NET_WORK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 658
    :goto_1
    return-void
.end method

.method public onAchievementShare(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 832
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAchievementShare "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImgurlAndAwardName imgUrl = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "awardName = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 835
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->startAchieveAwardShare(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 837
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAchievementShare mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    :goto_0
    return-void
.end method

.method public onActivityQuitCallBack(Ljava/lang/String;)V
    .locals 3

    .line 1038
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1039
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->setRegisterActivityQuitFunctionRes(Ljava/lang/String;)V

    .line 1040
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1041
    const/16 v0, 0x7de

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1042
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1044
    :cond_0
    return-void
.end method

.method public onCapture(Ljava/lang/String;)V
    .locals 5

    .line 1076
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1077
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onCapture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    new-instance v4, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1079
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v4, v0, p1}, Lcom/huawei/operation/share/CaptureUtils;->capture(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1081
    :cond_0
    return-void
.end method

.method public onCloseWebCallBack()V
    .locals 4

    .line 876
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    const/16 v1, 0xbb9

    if-eq v0, v1, :cond_0

    .line 877
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCloseWebCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 880
    :cond_0
    return-void
.end method

.method public onCustomUserPrefSet(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1106
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$7;

    invoke-direct {v0, p0, p2, p3, p1}, Lcom/huawei/operation/view/CustomWebView$7;-><init>(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1124
    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView$7;->start()V

    .line 1125
    return-void
.end method

.method public onLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 942
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLogin huid = ... ;serviceId = ...;function=..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onLogin huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",serviceId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",function = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 944
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 945
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLogin is begining send Message to WebViewActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 946
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 947
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 948
    const-string v0, "huid"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 949
    const-string v0, "serviceId"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    const-string v0, "function"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    const/16 v0, 0x7da

    iput v0, v4, Landroid/os/Message;->what:I

    .line 952
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 953
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 955
    :cond_0
    return-void
.end method

.method public onNoGranted(Ljava/lang/String;)V
    .locals 5

    .line 1085
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1086
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onNoGranted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    new-instance v4, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1088
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v4, v0, p1}, Lcom/huawei/operation/share/CaptureUtils;->captureNoPermission(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1090
    :cond_0
    return-void
.end method

.method public onParseFunction(Ljava/lang/String;)V
    .locals 0

    .line 1071
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->captureFunction:Ljava/lang/String;

    .line 1072
    return-void
.end method

.method public onSendNoNetMsgCallBack()V
    .locals 4

    .line 933
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSendNoNetMsgCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 935
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSendNoNetMsgCallBack not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 936
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 938
    :cond_0
    return-void
.end method

.method public onSendServerErrorMsgCallBack()V
    .locals 4

    .line 924
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSendServerErrorMsgCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 925
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 926
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSendServerErrorMsgCallBack not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 929
    :cond_0
    return-void
.end method

.method public onShare(Ljava/lang/String;)V
    .locals 2

    .line 1094
    new-instance v1, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1095
    invoke-virtual {v1, p1}, Lcom/huawei/operation/share/CaptureUtils;->share(Ljava/lang/String;)V

    .line 1096
    return-void
.end method

.method public onShare(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 523
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onShare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onShare activityId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  shareType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    if-eqz v0, :cond_0

    .line 526
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    invoke-virtual {v0, p1, p2, p0}, Lcom/huawei/operation/share/ShareConfig;->doObtionShareConfig(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/share/ShareConfigCallback;)V

    .line 528
    :cond_0
    return-void
.end method

.method public onShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 532
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    if-eqz v0, :cond_0

    .line 533
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mShareConfig:Lcom/huawei/operation/share/ShareConfig;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/operation/share/ShareConfig;->doObtionShareConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/share/ShareConfigCallback;)V

    .line 535
    :cond_0
    return-void
.end method

.method public onShareConfig(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 7

    .line 539
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onShareConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResult title = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  shareContent:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "bmp:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez p3, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    const-string v3, "not null"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_1

    .line 543
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    new-instance v6, Lcom/huawei/operation/view/CustomWebView$3;

    invoke-direct {v6, p0}, Lcom/huawei/operation/view/CustomWebView$3;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    invoke-interface/range {v0 .. v6}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->share(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 550
    :cond_1
    return-void
.end method

.method public onShareMultiple(Ljava/lang/String;I)V
    .locals 2

    .line 1100
    new-instance v1, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1101
    invoke-virtual {v1, p1, p2}, Lcom/huawei/operation/share/CaptureUtils;->share(Ljava/lang/String;I)V

    .line 1102
    return-void
.end method

.method public onStartAppSettingPage()V
    .locals 6

    .line 817
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartAppSettingPage  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7e2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 819
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 820
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 821
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 822
    return-void
.end method

.method public onStartFitnessPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 843
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartFitnessPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStartFitnessPage id"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",version"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 846
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->startFitnessPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 848
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartFitnessPage mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    :goto_0
    return-void
.end method

.method public onStartGPSTrackPage(Landroid/content/Context;ILjava/lang/String;F)V
    .locals 4

    .line 854
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartGPSTrackPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStartGPSTrackPage sportType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " targetType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " targetValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 856
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 857
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->startGPSTrackPage(Landroid/content/Context;ILjava/lang/String;F)V

    goto :goto_0

    .line 859
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartGPSTrackPage mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    :goto_0
    return-void
.end method

.method public onStartMiniShopWebPage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 796
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartMiniShopWebPage type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 798
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 799
    const-string v0, "url"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 800
    const-string v0, "type"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 801
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 802
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 803
    return-void
.end method

.method public onStartSocialDetialPage(Landroid/content/Context;J)V
    .locals 4

    .line 865
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartSocialDetialPage huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 867
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->startSocialDetailPage(Landroid/content/Context;J)V

    goto :goto_0

    .line 869
    :cond_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartSocialDetialPage mAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    :goto_0
    return-void
.end method

.method public onStartWebPage(Ljava/lang/String;)V
    .locals 6

    .line 807
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartWebPage  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7e0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 809
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 810
    const-string v0, "url"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 812
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 813
    return-void
.end method

.method public onToast(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 915
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onToast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 916
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 917
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onToast not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 918
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d5

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 920
    :cond_0
    return-void
.end method

.method public onTouchSignalCallBack(Z)V
    .locals 4

    .line 826
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onTouchSignalCallBack flag is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    iput-boolean p1, p0, Lcom/huawei/operation/view/CustomWebView;->isTouchH5ScrollView:Z

    .line 828
    return-void
.end method

.method public onVmallCouponCallBack(Ljava/lang/String;)V
    .locals 3

    .line 1048
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1049
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->setRegisterVmallCouponFunctionRes(Ljava/lang/String;)V

    .line 1050
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1051
    const/16 v0, 0x7e1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1052
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1054
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/operation/view/CustomWebView;->isVmallCouponPage:Z

    .line 1056
    :cond_0
    return-void
.end method

.method public onWebViewStatusCallBack(Ljava/lang/String;)V
    .locals 2

    .line 991
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 992
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->webViewStatusFuction:Ljava/lang/String;

    .line 994
    :cond_0
    return-void
.end method

.method public processBack()Z
    .locals 6

    .line 553
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processBack,WebView go back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 555
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->replaceSpace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 556
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentUrl:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    invoke-virtual {p0, v5}, Lcom/huawei/operation/view/CustomWebView;->isWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 558
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 559
    const/4 v0, 0x0

    return v0

    .line 561
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 562
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 563
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentUrl after goBack:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->isCustomTitle(Ljava/lang/String;)V

    .line 565
    const/4 v0, 0x1

    return v0
.end method

.method public reload(Ljava/lang/String;)V
    .locals 6

    .line 665
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload reloadUrl ===> xxx"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load reloadUrl ===>"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 668
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload url is isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    const-string p1, "about:blank"

    .line 671
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->replaceSpace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 672
    iput-object v4, p0, Lcom/huawei/operation/view/CustomWebView;->originUrl:Ljava/lang/String;

    .line 674
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 675
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload isWhiteUrl is false url is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 677
    return-void

    .line 679
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 681
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 682
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    const-string v0, "javascript:"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 684
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https or JAVA_SCRIPT protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    invoke-static {v4}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 686
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not file protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 688
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    goto :goto_0

    .line 691
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JAVA_SCRIPT protocol not removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    :cond_3
    :goto_0
    invoke-virtual {p0, v4}, Lcom/huawei/operation/view/CustomWebView;->isCustomTitle(Ljava/lang/String;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 697
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload url isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 699
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 701
    goto :goto_1

    .line 702
    :cond_4
    iget v0, p0, Lcom/huawei/operation/view/CustomWebView;->mType:I

    const/16 v1, 0xbb9

    if-ne v1, v0, :cond_5

    .line 703
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload url TYPE_MINI_SHOP_FRAGMENT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 705
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->appVersion:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 708
    goto :goto_1

    .line 709
    :cond_5
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload url MSG_ON_NET_WORK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 713
    :goto_1
    return-void
.end method

.method public replaceSpace(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 2162
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceSpace originUrl is :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2163
    const-string v0, " "

    const-string v1, "%20"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 2164
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceSpace newUrl is :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2165
    return-object v4
.end method

.method public sendLocalBroadCast()V
    .locals 6

    .line 907
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendLocalBroadCast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 909
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 910
    const-string v0, "com.huawei.plugin.operation.action_jumt_to_fearture_page"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 911
    invoke-virtual {v4, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 912
    return-void
.end method

.method public setCaptureFunction(Ljava/lang/String;)V
    .locals 0

    .line 1065
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->captureFunction:Ljava/lang/String;

    .line 1066
    return-void
.end method

.method public setCustomViewDialog(Lo/egw;)V
    .locals 4

    .line 303
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomViewDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->customViewDialog:Lo/egw;

    .line 305
    return-void
.end method

.method public setImageUri(Landroid/net/Uri;)V
    .locals 4

    .line 322
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setImageUri"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->imageUri:Landroid/net/Uri;

    .line 324
    return-void
.end method

.method public setJsEnable(Z)V
    .locals 5

    .line 1474
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter setJsEnable :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1475
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1476
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    .line 1477
    invoke-virtual {v4, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1480
    :cond_0
    return-void
.end method

.method public setMyWebviewClientImpl(Lcom/huawei/operation/view/WebViewClientImpl;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->myWebviewClientImpl:Lcom/huawei/operation/view/WebViewClientImpl;

    .line 260
    return-void
.end method

.method public setRegisterActivityQuitFunctionRes(Ljava/lang/String;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->registerActivityQuitFunctionRes:Ljava/lang/String;

    .line 268
    return-void
.end method

.method public setRegisterVmallCouponFunctionRes(Ljava/lang/String;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->registerVmallCouponFunctionRes:Ljava/lang/String;

    .line 276
    return-void
.end method

.method public setTextView(Landroid/widget/TextView;)V
    .locals 4

    .line 743
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTextView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mTextTitle:Landroid/widget/TextView;

    .line 745
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 4

    .line 517
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTitle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView;->setBrowserTitle(Ljava/lang/String;)V

    .line 519
    return-void
.end method

.method public setWebViewChromeBase(Landroid/webkit/WebChromeClient;)V
    .locals 4

    .line 773
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWebViewChromeBase"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 775
    return-void
.end method

.method public setWebViewClientBase(Landroid/webkit/WebViewClient;)V
    .locals 4

    .line 763
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWebViewClientBase"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 765
    return-void
.end method

.method public setmUploadMessage(Landroid/webkit/ValueCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 293
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setmUploadMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    .line 295
    return-void
.end method

.method public setmUploadMessageForAndroid5(Landroid/webkit/ValueCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 312
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setmUploadMessageForAndroid5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView;->mUploadMessageForAndroid5:Landroid/webkit/ValueCallback;

    .line 314
    return-void
.end method

.method public takePhoto()V
    .locals 6

    .line 1397
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "takePhoto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1398
    const/4 v4, 0x0

    .line 1400
    :try_start_0
    invoke-static {}, Lcom/huawei/operation/utils/WebViewUtils;->createImageFile()Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1403
    goto :goto_0

    .line 1401
    :catch_0
    move-exception v5

    .line 1402
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1404
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 1406
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1407
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 1408
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.health.fileprovider"

    invoke-static {v0, v1, v4}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->imageUri:Landroid/net/Uri;

    .line 1409
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_1

    .line 1411
    :cond_0
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->imageUri:Landroid/net/Uri;

    .line 1413
    :goto_1
    const-string v0, "output"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView;->imageUri:Landroid/net/Uri;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1414
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView;->mActivity:Landroid/app/Activity;

    const/16 v1, 0x4e21

    invoke-virtual {v0, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1415
    goto :goto_2

    .line 1416
    :cond_1
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == outputImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    :goto_2
    return-void
.end method
