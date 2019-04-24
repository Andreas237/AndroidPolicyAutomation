.class public Lcom/huawei/operation/activity/WebViewActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;,
        Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;
    }
.end annotation


# static fields
.field private static final APP_PACKAGE:Ljava/lang/String; = "com.huawei.health"

.field private static final APP_SETTING_ACTIVITY:Ljava/lang/String; = "com.huawei.ui.main.stories.me.activity.AppSettingActivity"

.field public static final BI_SHOW_TIME:Ljava/lang/String; = "SHOW_TIME_BI"

.field private static final CHOOSE_TEXT_COLOR:Ljava/lang/String; = "#FFFB6522"

.field private static final CLICL_STATUS_BAR_ACTION:Ljava/lang/String; = "com.huawei.intent.action.CLICK_STATUSBAR"

.field private static final EMPTYSTRING:Ljava/lang/String; = ""

.field public static final END_DATE:Ljava/lang/String; = "endDate"

.field public static final EXTRA_BI_ID:Ljava/lang/String; = "EXTRA_BI_ID"

.field public static final EXTRA_BI_NAME:Ljava/lang/String; = "EXTRA_BI_NAME"

.field public static final EXTRA_BI_SHOWTIME:Ljava/lang/String; = "EXTRA_BI_SHOWTIME"

.field public static final EXTRA_BI_SOURCE:Ljava/lang/String; = "EXTRA_BI_SOURCE"

.field public static final EXTRA_TITLE:Ljava/lang/String; = "title"

.field public static final EXTRA_TYPE:Ljava/lang/String; = "type"

.field public static final EXTRA_URL:Ljava/lang/String; = "url"

.field public static final HAS_DATA:Ljava/lang/String; = "has_data"

.field public static final HEALTH_SHOP_TYPE:Ljava/lang/String; = "HEALTH_SHOP_TYPE"

.field private static final HMS:Ljava/lang/String; = "HMS"

.field public static final HTTPS:Ljava/lang/String; = "https://"

.field private static final IS_AUTH_INT:I = 0x1

.field private static final IS_AUTH_STR:Ljava/lang/String; = "0"

.field public static final IS_GUIDE:Ljava/lang/String; = "is_guide"

.field public static final IS_START_FROM_HEART_KAN_BAN:Ljava/lang/String; = "IS_START_FROM_HEART_KAN_BAN"

.field public static final JAVA_SCRIPT:Ljava/lang/String; = "javascript:"

.field public static final JUMP_MODE_HUA_FEN_CLUB:I = 0x1

.field public static final JUMP_MODE_KEY:Ljava/lang/String; = "WebViewActivity.JUMP_MODE_KEY"

.field public static final JUMP_MODE_VALUE_HELP:I = 0x0

.field public static final JUMP_MODE_VALUE_NONE:I = 0x3

.field public static final JUMP_MODE_VALUE_VMALL:I = 0x2

.field public static final LEGALINFO_WEBVIEW_TYPE:Ljava/lang/String; = "LEGALINFOWEBVIEW_TYPE"

.field private static final MAX_GET_THREAD_COUNT:I = 0x5

.field public static final MESSAGECENTER_WEBVIEW_TYPE:Ljava/lang/String; = "MESSAGECENTER_WEBVIEW_TYPE"

.field private static final MIAO_HEALTH_URL:Ljava/lang/String; = "https://mlhwm.miaohealth.net/#/shoppartmanage"

.field private static final MIAO_HEALTH_URL_CHECK:Ljava/lang/String; = "http://hwmltest.miaomore.com:8024/#/shoppingcart"

.field private static final MIAO_HEALTH_URL_TEST:Ljava/lang/String; = "http://mlhwmtest.miaohealth.net/#/shoppartmanage"

.field private static final NOT_AUTH_INT:I = 0x0

.field private static final NOT_AUTH_STR:Ljava/lang/String; = "1"

.field private static final NO_HMS:Ljava/lang/String; = "NO_HMS"

.field public static final OPEN_SERVICE_TYPE:Ljava/lang/String; = "OPEN_SERVICE_TYPE"

.field private static final PicWidth:I = 0x40

.field public static final RECOMMENDINFO:Ljava/lang/String; = "RecommendInfo"

.field private static final REQUESTCODE_HEALTH_Sef_PREMISSION:I = 0x1

.field private static final REQUESTCODE_JS_SDK_PREMISSION:I = 0x232e

.field public static final REQUEST_CODE:I = 0xa

.field private static final RESET_ACTIVITY_LIST:I = 0x1

.field public static final SLEEP_SERVICE:Ljava/lang/String; = "sleep_service"

.field public static final SOURCE_ADDIALOG:Ljava/lang/String; = "ADDIALOG"

.field public static final SOURCE_INFO:Ljava/lang/String; = "INFO"

.field public static final SOURCE_INFO_MORE:Ljava/lang/String; = "INFO_MORE"

.field public static final SOURCE_OPERPOSITION:Ljava/lang/String; = "OPERPOSITION"

.field public static final SOURCE_SLEEPDETAIL:Ljava/lang/String; = "SLEEPDETAIL"

.field public static final SOURCE_SMARTCARD:Ljava/lang/String; = "SMARTCARD"

.field public static final SOURCE_SOCIALBANNER:Ljava/lang/String; = "SOCIALBANNER"

.field public static final START_DATE:Ljava/lang/String; = "startDate"

.field private static final SYSTEMUI_PERMITION:Ljava/lang/String; = "huawei.permission.CLICK_STATUSBAR_BROADCAST"

.field private static final TAB_LAYOUT_BACKGROUND_COLOR:Ljava/lang/String; = "#FFF2F2F2"

.field private static final TAG:Ljava/lang/String; = "Opera_WebViewActivity"

.field private static final UNCHOOSE_TEXT_COLOR:Ljava/lang/String; = "#801A1A1A"

.field private static final USER_QUIT_ACT_CODE:Ljava/lang/String; = "1"

.field private static final USER_VMALL_CONPON_CODE:Ljava/lang/String; = "2"

.field private static final VMALL_URL_STRING:Ljava/lang/String; = "https://healthrecommend.hicloud.com/healthMallPlat/vmall/index.html#/order"

.field private static final VMALL_URL_STRING_TEST:Ljava/lang/String; = "http://hwlf.hwcloudtest.cn:10180/healthMallPlat/vmall/index.html#/order"

.field private static mActiveFlag:Z = false

.field private static mActivity:Landroid/app/Activity; = null

.field private static final maxPicByte:I = 0x8000


# instance fields
.field private annualUrl:Ljava/lang/String;

.field private annualUrl2018:Ljava/lang/String;

.field private biId:Ljava/lang/String;

.field private biName:Ljava/lang/String;

.field private biPauseTime:J

.field private biSource:Ljava/lang/String;

.field private biStartTime:J

.field private biTotalTime:J

.field private btnGoSetting:Lo/egd;

.field private btnNetSetting:Lo/egd;

.field private hasData:Z

.field private helpUrl_ch:Ljava/lang/String;

.field private helpUrl_us:Ljava/lang/String;

.field private isFirstShwTab:Z

.field private isFromHeartKanban:Z

.field private isGuide:Z

.field private isMiaoChoosed:Z

.field private isOrderManagerPage:Z

.field private isVamllOrMiaoChoose:Z

.field private isVmallChoosed:Z

.field private jsApiId:Ljava/lang/String;

.field private lifeTime:J

.field private lineFeatureHomePage:Landroid/widget/LinearLayout;

.field private lineMyActivityBtn:Landroid/widget/LinearLayout;

.field private lineOrderManager:Landroid/widget/LinearLayout;

.field private lineQuitActBtn:Landroid/widget/LinearLayout;

.field private lineShoppingCart:Landroid/widget/LinearLayout;

.field private mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

.field private mContext:Landroid/content/Context;

.field private mCustomTitleBar:Lo/emr;

.field private mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

.field private mDoubleClickReceiver:Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;

.field private mFrameLayout:Landroid/widget/FrameLayout;

.field private mGetUrlThreadPool:Ljava/util/concurrent/ExecutorService;

.field private mHandler:Landroid/os/Handler;

.field private mProgressBar:Landroid/widget/ProgressBar;

.field private mUiptions:I

.field private miaoImageView:Landroid/widget/ImageView;

.field private miaoTextView:Landroid/widget/TextView;

.field private mode:I

.field private netWorkLayout:Landroid/widget/RelativeLayout;

.field private popView:Lo/elp;

.field private reloadLayout:Landroid/widget/RelativeLayout;

.field private shouldBiShowTime:Ljava/lang/String;

.field private tabsRelativeLayout:Landroid/widget/RelativeLayout;

.field private tipsImageView:Landroid/widget/ImageView;

.field private title:Ljava/lang/String;

.field private txtNoNetWorkTips:Landroid/widget/TextView;

.field private txtWebViewTips1:Landroid/widget/TextView;

.field private txtWebViewTips2:Landroid/widget/TextView;

.field private txtWebViewTips3:Landroid/widget/TextView;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private viewDivisonBarFeartureHomePage:Landroid/view/View;

.field private viewDivisonBarShopCar:Landroid/view/View;

.field private vmallImageView:Landroid/widget/ImageView;

.field private vmallTextView:Landroid/widget/TextView;

.field private webView:Landroid/webkit/WebView;

.field private webviewLayout:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 278
    const-class v0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->registerJsApi(Ljava/lang/Class;)V

    .line 279
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 189
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lifeTime:J

    .line 210
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biStartTime:J

    .line 211
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biPauseTime:J

    .line 212
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    .line 228
    const-string v0, "https://resourcephs1.vmall.com/"

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->helpUrl_ch:Ljava/lang/String;

    .line 229
    const-string v0, "https://resourcephs2.vmall.com/"

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->helpUrl_us:Ljava/lang/String;

    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isFirstShwTab:Z

    .line 237
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isOrderManagerPage:Z

    .line 238
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVamllOrMiaoChoose:Z

    .line 260
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVmallChoosed:Z

    .line 261
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isMiaoChoosed:Z

    .line 267
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mUiptions:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/operation/activity/WebViewActivity;)Lo/emr;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->jumpToMain()V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mProgressBar:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showNoServicePage()V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showNoNetWorkPage()V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showServerErrorPage()V

    return-void
.end method

.method static synthetic access$1800(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showUnstableNetWorkPage()V

    return-void
.end method

.method static synthetic access$1900(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showSSLErrorTipsPage()V

    return-void
.end method

.method static synthetic access$2000(Lcom/huawei/operation/activity/WebViewActivity;Z)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->showRightTextBtnMyActivity(Z)V

    return-void
.end method

.method static synthetic access$202(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl2018:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$2100(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/operation/activity/WebViewActivity;->showServiceTips(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$2200(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/operation/activity/WebViewActivity;->callJsSportDatafunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic access$2300(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->handleWebViewTitle(Lcom/huawei/operation/beans/TitleBean;)V

    return-void
.end method

.method static synthetic access$2400(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/adapter/PluginOperationAdapter;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightQuitAct()V

    return-void
.end method

.method static synthetic access$2600(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightVmallConpon()V

    return-void
.end method

.method static synthetic access$2700(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initAnnualWebView()V

    return-void
.end method

.method static synthetic access$2800(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initErrorView()V

    return-void
.end method

.method static synthetic access$2900(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initIntentData()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/os/Handler;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$3000(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initView()V

    return-void
.end method

.method static synthetic access$3100(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Z
    .locals 1

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->isResetToOrderManager(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$3200(Lcom/huawei/operation/activity/WebViewActivity;Z)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setTheTabsView(Z)V

    return-void
.end method

.method static synthetic access$3300(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->shareToThird()V

    return-void
.end method

.method static synthetic access$3400(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->handleMoreQuitActPopWindow(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$3500(Lcom/huawei/operation/activity/WebViewActivity;)Lo/elp;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    return-object v0
.end method

.method static synthetic access$3600(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setClickBI(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3700(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;Lcom/huawei/operation/beans/TitleBean;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/activity/WebViewActivity;->handleMorePopWindow(Landroid/view/View;Lcom/huawei/operation/beans/TitleBean;)V

    return-void
.end method

.method static synthetic access$3800(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$3900(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->handleMoreMyActivityPopWindow(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/operation/activity/WebViewActivity;)Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isFirstShwTab:Z

    return v0
.end method

.method static synthetic access$402(Lcom/huawei/operation/activity/WebViewActivity;Z)Z
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->isFirstShwTab:Z

    return p1
.end method

.method static synthetic access$500(Lcom/huawei/operation/activity/WebViewActivity;)Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isOrderManagerPage:Z

    return v0
.end method

.method static synthetic access$600(Lcom/huawei/operation/activity/WebViewActivity;Z)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setTheTabsChoose(Z)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 103
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getTheVmallUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    return-object v0
.end method

.method public static backToActivityListPage()V
    .locals 4

    .line 1963
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "backToActivityListPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1964
    sget-object v0, Lcom/huawei/operation/activity/WebViewActivity;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/operation/activity/WebViewActivity;->mActivity:Landroid/app/Activity;

    instance-of v0, v0, Lcom/huawei/operation/activity/WebViewActivity;

    if-eqz v0, :cond_0

    .line 1965
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetActivityListPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1966
    sget-object v0, Lcom/huawei/operation/activity/WebViewActivity;->mActivity:Landroid/app/Activity;

    check-cast v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->resetActivityListPage()V

    .line 1968
    :cond_0
    return-void
.end method

.method private callJsSportDatafunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1379
    const/4 v4, 0x0

    .line 1380
    const/4 v5, 0x0

    .line 1381
    if-nez p4, :cond_0

    .line 1382
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1383
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\'null\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1384
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1385
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1386
    return-void

    .line 1388
    :cond_0
    const/4 v6, 0x0

    .line 1389
    const/4 v7, 0x0

    .line 1391
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1392
    const-string v0, "startDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1393
    const-string v0, "endDate"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 1401
    goto :goto_0

    .line 1394
    :catch_0
    move-exception v8

    .line 1395
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse param json fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1396
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1397
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\'null\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1398
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1399
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1400
    return-void

    .line 1402
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$17;

    invoke-direct {v1, p0, p3, p2}, Lcom/huawei/operation/activity/WebViewActivity$17;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v6, v7, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getSportData(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1430
    return-void
.end method

.method private static checkOrderManagerPage(Ljava/lang/String;)Z
    .locals 4

    .line 560
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkOrderManagerPage url is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 562
    const/4 v0, 0x0

    return v0

    .line 563
    :cond_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 564
    const-string v0, "http://hwlf.hwcloudtest.cn:10180/healthMallPlat/vmall/index.html#/order"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "http://hwmltest.miaomore.com:8024/#/shoppingcart"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 566
    :cond_3
    const-string v0, "https://healthrecommend.hicloud.com/healthMallPlat/vmall/index.html#/order"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://mlhwm.miaohealth.net/#/shoppartmanage"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private defaultHandleTitle()V
    .locals 3

    .line 1276
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomLeftBtnCloseType()V

    .line 1277
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1278
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_share_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1279
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$14;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1286
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1288
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1289
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1291
    :cond_0
    return-void
.end method

.method private destroyWebView()V
    .locals 5

    .line 1782
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1783
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 1784
    const-string v0, "onDestroy destroyWebView"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1785
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 1786
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 1787
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1789
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 1791
    :cond_1
    return-void
.end method

.method public static getActiveFlag()Z
    .locals 1

    .line 274
    sget-boolean v0, Lcom/huawei/operation/activity/WebViewActivity;->mActiveFlag:Z

    return v0
.end method

.method public static getActivity()Landroid/app/Activity;
    .locals 4

    .line 1976
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1977
    sget-object v0, Lcom/huawei/operation/activity/WebViewActivity;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method private getMiaoHealthUrlString()Ljava/lang/String;
    .locals 1

    .line 574
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "http://mlhwmtest.miaohealth.net/#/shoppartmanage"

    goto :goto_0

    :cond_0
    const-string v0, "https://mlhwm.miaohealth.net/#/shoppartmanage"

    :goto_0
    return-object v0
.end method

.method private getTheVmallUrl()Ljava/lang/String;
    .locals 1

    .line 579
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "http://hwlf.hwcloudtest.cn:10180/healthMallPlat/vmall/index.html#/order"

    goto :goto_0

    :cond_0
    const-string v0, "https://healthrecommend.hicloud.com/healthMallPlat/vmall/index.html#/order"

    :goto_0
    return-object v0
.end method

.method private handleMoreMyActivityPopWindow(Landroid/view/View;)V
    .locals 4

    .line 1548
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$layout;->pop_custom_view_my_activity_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1549
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    .line 1550
    sget v0, Lcom/huawei/operation/R$id;->line_my_activity_btn:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineMyActivityBtn:Landroid/widget/LinearLayout;

    .line 1551
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineMyActivityBtn:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$22;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$22;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1560
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 1561
    return-void
.end method

.method private handleMorePopWindow(Landroid/view/View;Lcom/huawei/operation/beans/TitleBean;)V
    .locals 4

    .line 1166
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$layout;->pop_custom_view_health_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1167
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    .line 1168
    sget v0, Lcom/huawei/operation/R$id;->line_feature_home_page:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineFeatureHomePage:Landroid/widget/LinearLayout;

    .line 1169
    sget v0, Lcom/huawei/operation/R$id;->line_shopping_cart:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineShoppingCart:Landroid/widget/LinearLayout;

    .line 1170
    sget v0, Lcom/huawei/operation/R$id;->line_order_manager:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    .line 1171
    sget v0, Lcom/huawei/operation/R$id;->divison_bar_shop_car:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarShopCar:Landroid/view/View;

    .line 1172
    sget v0, Lcom/huawei/operation/R$id;->divison_bar_feature_home_page:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarFeartureHomePage:Landroid/view/View;

    .line 1174
    invoke-virtual {p2}, Lcom/huawei/operation/beans/TitleBean;->fetch_getFeatureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1175
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineFeatureHomePage:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 1177
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineFeatureHomePage:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1180
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/operation/beans/TitleBean;->fetch_getShopcarUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1181
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineShoppingCart:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 1183
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineShoppingCart:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1186
    :goto_1
    invoke-virtual {p2}, Lcom/huawei/operation/beans/TitleBean;->fetch_getOrderManagerUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1187
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 1189
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1193
    :goto_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineShoppingCart:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1194
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarFeartureHomePage:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 1196
    :cond_3
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarFeartureHomePage:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1199
    :goto_3
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_4

    .line 1200
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarShopCar:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 1202
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->viewDivisonBarShopCar:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1205
    :goto_4
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineFeatureHomePage:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$11;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1241
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineShoppingCart:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$12;

    invoke-direct {v1, p0, p2}, Lcom/huawei/operation/activity/WebViewActivity$12;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1253
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineOrderManager:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$13;

    invoke-direct {v1, p0, p2}, Lcom/huawei/operation/activity/WebViewActivity$13;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1266
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 1267
    return-void
.end method

.method private handleMoreQuitActPopWindow(Landroid/view/View;)V
    .locals 4

    .line 1103
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/operation/R$layout;->pop_custom_view_health_quit_act_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1104
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    .line 1105
    sget v0, Lcom/huawei/operation/R$id;->line_quit_act_btn:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineQuitActBtn:Landroid/widget/LinearLayout;

    .line 1106
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lineQuitActBtn:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$8;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1114
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->popView:Lo/elp;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 1115
    return-void
.end method

.method private handleWebViewTitle(Lcom/huawei/operation/beans/TitleBean;)V
    .locals 4

    .line 1031
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1032
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == titleBean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1033
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->defaultHandleTitle()V

    .line 1034
    return-void

    .line 1036
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->handlemCustomTitleBarLeftBtn(Lcom/huawei/operation/beans/TitleBean;)V

    .line 1037
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->handlemCustomTitleBarRightBtn(Lcom/huawei/operation/beans/TitleBean;)V

    .line 1039
    return-void
.end method

.method private handlemCustomTitleBarLeftBtn(Lcom/huawei/operation/beans/TitleBean;)V
    .locals 2

    .line 1045
    invoke-virtual {p1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getLeftBtn()Ljava/lang/String;

    move-result-object v1

    .line 1046
    const-string v0, "arrow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1047
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomLeftBtnArrowType()V

    goto :goto_0

    .line 1049
    :cond_0
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomLeftBtnCloseType()V

    .line 1051
    :goto_0
    return-void
.end method

.method private handlemCustomTitleBarRightBtn(Lcom/huawei/operation/beans/TitleBean;)V
    .locals 5

    .line 1058
    invoke-virtual {p1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getRightBtn()Ljava/lang/String;

    move-result-object v4

    .line 1059
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rightBtnType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1060
    const-string v0, "more"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1061
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightMoreType(Lcom/huawei/operation/beans/TitleBean;)V

    goto :goto_0

    .line 1062
    :cond_0
    const-string v0, "isMyActivity"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1063
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->showRightTextBtnMyActivity(Z)V

    goto :goto_0

    .line 1064
    :cond_1
    const-string v0, "share"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1065
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1066
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1067
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_share_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1068
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$6;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1077
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1078
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1080
    :goto_0
    return-void
.end method

.method private hideBottomUIMenu()V
    .locals 3

    .line 2036
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 2037
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 2038
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 2039
    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 2040
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v2

    .line 2041
    or-int/lit8 v2, v2, 0x2

    .line 2042
    or-int/lit8 v2, v2, 0x4

    .line 2043
    or-int/lit16 v2, v2, 0x1000

    .line 2044
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 2046
    :cond_1
    :goto_0
    return-void
.end method

.method private initAnnualWebView()V
    .locals 5

    .line 341
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 342
    if-eqz v4, :cond_2

    .line 343
    const-string v0, "url"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 344
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 345
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 347
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initAnnualWebView url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initAnnualWebView annualUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl2018:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl2018:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 356
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableSlowWholeDocumentDraw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-static {}, Landroid/webkit/WebView;->enableSlowWholeDocumentDraw()V

    .line 360
    :cond_2
    return-void
.end method

.method private initErrorView()V
    .locals 4

    .line 363
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CommonUtil.isErrorWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    sget v0, Lcom/huawei/operation/R$id;->btn_go_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnGoSetting:Lo/egd;

    .line 365
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnGoSetting:Lo/egd;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$2;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 377
    sget v0, Lcom/huawei/operation/R$id;->mini_shop__webview_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    .line 378
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_apphelp_pwindows_back_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 379
    return-void
.end method

.method private initGRSManager()V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 313
    new-instance v0, Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;

    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;-><init>(Landroid/os/Looper;Lcom/huawei/operation/activity/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mGetUrlThreadPool:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 316
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mGetUrlThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mGetUrlThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$1;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 335
    return-void
.end method

.method private initIntentData()V
    .locals 5

    .line 381
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initIntentData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 384
    if-eqz v4, :cond_1

    .line 385
    const-string v0, "is_guide"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isGuide:Z

    .line 386
    const-string v0, "type"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    .line 387
    const-string v0, "url"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 388
    const-string v0, "has_data"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->hasData:Z

    .line 389
    const-string v0, "IS_START_FROM_HEART_KAN_BAN"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isFromHeartKanban:Z

    .line 390
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 391
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 393
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initIntentData url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    const-string v0, "title"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->title:Ljava/lang/String;

    .line 395
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mode:I

    .line 397
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    .line 398
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    .line 399
    const-string v0, "EXTRA_BI_SOURCE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biSource:Ljava/lang/String;

    .line 400
    const-string v0, "EXTRA_BI_SHOWTIME"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->shouldBiShowTime:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    :cond_1
    goto :goto_0

    .line 402
    :catch_0
    move-exception v4

    .line 403
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIntentData Exception e.getMessage() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    :goto_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " url = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    return-void
.end method

.method private initTheTabsView()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 545
    sget v0, Lcom/huawei/operation/R$id;->tabs_rl_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    .line 546
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 547
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    const-string v1, "#FFF2F2F2"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 548
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    const v1, 0x3f733333    # 0.95f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 549
    sget v0, Lcom/huawei/operation/R$id;->vmall_text_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    .line 550
    sget v0, Lcom/huawei/operation/R$id;->vmall_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallImageView:Landroid/widget/ImageView;

    .line 551
    sget v0, Lcom/huawei/operation/R$id;->miao_text_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    .line 552
    sget v0, Lcom/huawei/operation/R$id;->miao_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoImageView:Landroid/widget/ImageView;

    .line 553
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 555
    return-void
.end method

.method private initTitleView(I)V
    .locals 4

    .line 731
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTitleView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 734
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 735
    goto :goto_0

    .line 737
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_main_discovery_tab_service_huawei_club:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 738
    goto :goto_0

    .line 740
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_main_left_menu_vmall:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 741
    goto :goto_0

    .line 743
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webviewLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setFitsSystemWindows(Z)V

    .line 744
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 745
    .line 749
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private initView()V
    .locals 8

    .line 425
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iput-object p0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    .line 427
    invoke-static {p0}, Lcom/huawei/operation/activity/WebViewActivity;->setActivity(Landroid/app/Activity;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 429
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 430
    new-instance v0, Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;

    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$CommonWebViewActivityHandler;-><init>(Landroid/os/Looper;Lcom/huawei/operation/activity/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    .line 433
    :cond_0
    sget v0, Lcom/huawei/operation/R$id;->webview_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webviewLayout:Landroid/widget/LinearLayout;

    .line 434
    sget v0, Lcom/huawei/operation/R$id;->web_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    .line 435
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->annualUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    .line 438
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 440
    :goto_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->isHardwareAccelerated()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    sget v0, Lcom/huawei/operation/R$id;->web_view_frame_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mFrameLayout:Landroid/widget/FrameLayout;

    .line 442
    new-instance v0, Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->mFrameLayout:Landroid/widget/FrameLayout;

    sget v3, Lcom/huawei/operation/R$id;->load_url_progress:I

    .line 443
    invoke-virtual {p0, v3}, Lcom/huawei/operation/activity/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    iget-object v4, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    iget-object v5, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    const/16 v6, 0xbba

    invoke-direct/range {v0 .. v6}, Lcom/huawei/operation/view/CustomWebView;-><init>(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    .line 447
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getProgressBar()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mProgressBar:Landroid/widget/ProgressBar;

    .line 448
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->setCustomTitleBar()V

    .line 449
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-virtual {v1}, Lo/emr;->getmViewTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setTextView(Landroid/widget/TextView;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 451
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setTitle(Ljava/lang/String;)V

    .line 453
    :cond_2
    sget v0, Lcom/huawei/operation/R$id;->net_work_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    .line 454
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 456
    sget v0, Lcom/huawei/operation/R$id;->reload_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->reloadLayout:Landroid/widget/RelativeLayout;

    .line 457
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->reloadLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 459
    sget v0, Lcom/huawei/operation/R$id;->btn_no_net_work:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnNetSetting:Lo/egd;

    .line 460
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnNetSetting:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 462
    sget v0, Lcom/huawei/operation/R$id;->img_no_net_work:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    .line 463
    sget v0, Lcom/huawei/operation/R$id;->tips_no_net_work:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    .line 464
    sget v0, Lcom/huawei/operation/R$id;->tips_web_view_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    .line 465
    sget v0, Lcom/huawei/operation/R$id;->tips_web_view_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    .line 466
    sget v0, Lcom/huawei/operation/R$id;->tips_web_view_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    .line 469
    const-string v0, "HEALTH_SHOP_TYPE"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 470
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 471
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showNoNetWorkPage()V

    .line 474
    :cond_3
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->checkOrderManagerPage(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isOrderManagerPage:Z

    .line 475
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView isOrderManagerPage: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->isOrderManagerPage:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isOrderManagerPage:Z

    if-eqz v0, :cond_4

    .line 477
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initTheTabsView()V

    .line 480
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webviewLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$3;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 504
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebViewActivity initView url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 507
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$4;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 524
    :cond_5
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setBISource(Ljava/lang/String;)V

    .line 526
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_7

    .line 528
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 529
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test version register jssdk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    new-instance v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->setShowAuthDlg(Z)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->setBiType(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->build()Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;

    move-result-object v7

    .line 531
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-static {v0, v7}, Lcom/huawei/hwCloudJs/JsClientApi;->createApi(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->jsApiId:Ljava/lang/String;

    .line 532
    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 533
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https protocol url register jssdk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    new-instance v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->setShowAuthDlg(Z)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->setBiType(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->build()Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;

    move-result-object v7

    .line 535
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-static {v0, v7}, Lcom/huawei/hwCloudJs/JsClientApi;->createApi(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->jsApiId:Ljava/lang/String;

    .line 539
    :cond_7
    :goto_1
    invoke-static {p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->assistActivity(Landroid/app/Activity;)V

    .line 540
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    iput v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mUiptions:I

    .line 541
    return-void
.end method

.method private isResetToOrderManager(Ljava/lang/String;)Z
    .locals 4

    .line 997
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isResetToOrderManager finish_url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 998
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 999
    const/4 v0, 0x0

    return v0

    .line 1000
    :cond_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1001
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isResetToOrderManager isTestVersion: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    const-string v0, "http://hwlf.hwcloudtest.cn:10180/healthMallPlat/vmall/index.html#/order"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "http://mlhwmtest.miaohealth.net/#/shoppartmanage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1004
    :cond_3
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isResetToOrderManager is not TestVersion: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1005
    const-string v0, "https://healthrecommend.hicloud.com/healthMallPlat/vmall/index.html#/order"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://mlhwm.miaohealth.net/#/shoppartmanage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private jumpToMain()V
    .locals 7

    .line 808
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToMain"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 810
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 812
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 813
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 814
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 815
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 816
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 819
    goto :goto_0

    .line 817
    :catch_0
    move-exception v6

    .line 818
    const-string v0, "Opera_WebViewActivity"

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

    .line 820
    :goto_0
    const-string v0, "Opera_WebViewActivity"

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

    .line 821
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 822
    return-void
.end method

.method private mCustomLeftBtnArrowType()V
    .locals 3

    .line 1335
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1336
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_rtl_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 1338
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1340
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$16;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$16;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1369
    return-void
.end method

.method private mCustomLeftBtnCloseType()V
    .locals 3

    .line 1297
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1298
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$15;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1329
    return-void
.end method

.method private mCustomTitleBarRightMoreType(Lcom/huawei/operation/beans/TitleBean;)V
    .locals 3

    .line 1143
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1145
    invoke-virtual {p1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getFeatureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getShopcarUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getOrderManagerUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1146
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    goto :goto_0

    .line 1148
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1150
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->hw_health_shop_more_img:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1151
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$10;

    invoke-direct {v1, p0, p1}, Lcom/huawei/operation/activity/WebViewActivity$10;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1158
    return-void
.end method

.method private mCustomTitleBarRightQuitAct()V
    .locals 4

    .line 1086
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomTitleBarRightQuitAct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1088
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1089
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->hw_health_shop_more_img:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1090
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$7;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1097
    return-void
.end method

.method private mCustomTitleBarRightVmallConpon()V
    .locals 4

    .line 1121
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomTitleBarRightVmallConpon"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1123
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1124
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->hw_health_shop_conpou_img:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1125
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$9;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1136
    return-void
.end method

.method private reload()V
    .locals 5

    .line 1794
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1795
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1796
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1797
    return-void

    .line 1799
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1800
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1801
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWebViewOriginalUrl()Ljava/lang/String;

    move-result-object v4

    .line 1802
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1803
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1804
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1805
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isMiaoChoosed:Z

    if-eqz v0, :cond_1

    .line 1806
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl isVmallChoosed is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1807
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getMiaoHealthUrlString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 1809
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 1812
    :cond_2
    invoke-static {v4}, Lcom/huawei/operation/activity/WebViewActivity;->checkOrderManagerPage(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1813
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl isVamllOrMiaoChoose is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1814
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVmallChoosed:Z

    if-eqz v0, :cond_3

    .line 1815
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl isVmallChoosed is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1816
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getTheVmallUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 1818
    :cond_3
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl isVmallChoosed is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getMiaoHealthUrlString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 1822
    :cond_4
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadUrl isVamllOrMiaoChoose is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1823
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v4}, Lcom/huawei/operation/view/CustomWebView;->reload(Ljava/lang/String;)V

    .line 1826
    :goto_0
    return-void
.end method

.method public static setActiveFlag(Z)V
    .locals 0

    .line 270
    sput-boolean p0, Lcom/huawei/operation/activity/WebViewActivity;->mActiveFlag:Z

    .line 271
    return-void
.end method

.method public static setActivity(Landroid/app/Activity;)V
    .locals 4

    .line 1971
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1972
    sput-object p0, Lcom/huawei/operation/activity/WebViewActivity;->mActivity:Landroid/app/Activity;

    .line 1973
    return-void
.end method

.method private setBISource(Ljava/lang/String;)V
    .locals 6

    .line 656
    const-string v4, ""

    .line 658
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, p1}, Lcom/huawei/operation/view/CustomWebView;->getUrlBIType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 660
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 661
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 664
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 668
    :cond_1
    :goto_0
    goto :goto_1

    .line 666
    :catch_0
    move-exception v5

    .line 667
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error in getUrlBIType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    :goto_1
    const-string v0, "Opera_WebViewActivity"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "id = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " name = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " source = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->biSource:Ljava/lang/String;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " url = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p1, v1, v2

    const-string v2, " type = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 671
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    const-string v0, "source"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biSource:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    const-string v0, "url"

    invoke-interface {v5, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    const-string v0, "type"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget-object v2, Lo/dae;->hd:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 678
    return-void
.end method

.method private setClickBI(Ljava/lang/String;)V
    .locals 4

    .line 1373
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1374
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1376
    return-void
.end method

.method private setCustomTitleBar()V
    .locals 4

    .line 681
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    sget v0, Lcom/huawei/operation/R$id;->mini_shop__webview_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    .line 683
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 684
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$5;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 714
    const-string v0, "MESSAGECENTER_WEBVIEW_TYPE"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 715
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar MESSAGECENTER_WEBVIEW_TYPE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    iget v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mode:I

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->initTitleView(I)V

    .line 722
    :cond_0
    return-void
.end method

.method private setTheMiaoHealthChoosed(Z)V
    .locals 5

    .line 625
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTheMiaoHealthChoosed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    iput-boolean p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->isMiaoChoosed:Z

    .line 627
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setTheMiaoText(Z)V

    .line 628
    if-eqz p1, :cond_0

    .line 630
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getMiaoHealthUrlString()Ljava/lang/String;

    move-result-object v4

    .line 631
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTheMiaoHealthChoosed get the miao health url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 633
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v4}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 635
    :cond_0
    return-void
.end method

.method private setTheMiaoText(Z)V
    .locals 2

    .line 639
    if-eqz p1, :cond_0

    .line 640
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    const-string v1, "#FFFB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 641
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 642
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 643
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoImageView:Landroid/widget/ImageView;

    const-string v1, "#FFFB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_0

    .line 645
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    const-string v1, "#801A1A1A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 646
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 647
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoImageView:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 649
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 650
    return-void
.end method

.method private setTheTabsChoose(Z)V
    .locals 4

    .line 586
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTheTabsChoose: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    iput-boolean p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVamllOrMiaoChoose:Z

    .line 588
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setTheVmallChoosed(Z)V

    .line 589
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setTheMiaoHealthChoosed(Z)V

    .line 590
    return-void
.end method

.method private setTheTabsView(Z)V
    .locals 4

    .line 1012
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_0

    .line 1013
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initTheTabsView()V

    .line 1015
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isResetToOrderManager isShowTab: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1016
    if-eqz p1, :cond_2

    .line 1017
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1018
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVamllOrMiaoChoose:Z

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setTheVmallText(Z)V

    .line 1019
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVamllOrMiaoChoose:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setTheMiaoText(Z)V

    goto :goto_1

    .line 1021
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tabsRelativeLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1023
    :goto_1
    return-void
.end method

.method private setTheVmallChoosed(Z)V
    .locals 5

    .line 594
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTheVmallChoosed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    iput-boolean p1, p0, Lcom/huawei/operation/activity/WebViewActivity;->isVmallChoosed:Z

    .line 596
    invoke-direct {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setTheVmallText(Z)V

    .line 597
    if-eqz p1, :cond_0

    .line 599
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getTheVmallUrl()Ljava/lang/String;

    move-result-object v4

    .line 600
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTheVmallChoosed get the vmall url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v4}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 604
    :cond_0
    return-void
.end method

.method private setTheVmallText(Z)V
    .locals 2

    .line 608
    if-eqz p1, :cond_0

    .line 609
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    const-string v1, "#FFFB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 610
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 611
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 612
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallImageView:Landroid/widget/ImageView;

    const-string v1, "#FFFB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_0

    .line 614
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    const-string v1, "#801A1A1A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 615
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 616
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallImageView:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 618
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 619
    return-void
.end method

.method private shareToThird()V
    .locals 15

    .line 755
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-virtual {v0}, Lo/emr;->getmViewTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v10

    .line 756
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareToThird title is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 758
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_plugin_operation_activity_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 761
    :cond_1
    sget v0, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_webview_share_default_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 762
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShareTitleContent() : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, "getWebViewOriginalUrl() : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDrawingCacheEnabled(Z)V

    .line 765
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->buildDrawingCache()V

    .line 766
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v12

    .line 767
    const/16 v0, 0x40

    const/16 v1, 0x40

    const/4 v2, 0x1

    invoke-static {v12, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 768
    if-eqz v13, :cond_2

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    const v1, 0x8000

    if-le v0, v1, :cond_3

    .line 769
    :cond_2
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap == null or more than max show default picture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$mipmap;->hw_show_app_logo:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 773
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getCurrentPageUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const-string v0, ""

    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getCurrentPageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 774
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter share information"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 776
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    move-object v2, v10

    move-object v3, v11

    move-object v4, v13

    .line 779
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getCurrentPageUrl()Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lo/dae;->gQ:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    move-object v9, v14

    .line 778
    const/4 v1, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/huawei/operation/utils/OperationUtils;->share(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;Ljava/util/Map;)V

    .line 780
    goto :goto_0

    .line 781
    :cond_4
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWebViewOriginalUrl() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    :goto_0
    return-void
.end method

.method private showBottomUIMenu()V
    .locals 5

    .line 2052
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 2053
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    .line 2054
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 2055
    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 2056
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "after  showBottomUIMenu! uiOptions = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/operation/activity/WebViewActivity;->mUiptions:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2057
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mUiptions:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 2059
    :cond_1
    :goto_0
    return-void
.end method

.method private showNoNetWorkPage()V
    .locals 4

    .line 1639
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoNetWorkPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1640
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1641
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1642
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1643
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1644
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1645
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 1646
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_no_net_work_pls_click_again:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1647
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/operation/R$drawable;->ic_network:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1648
    return-void
.end method

.method private showNoServicePage()V
    .locals 4

    .line 1607
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1608
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1609
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1610
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1611
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1612
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1613
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnNetSetting:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1614
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 1615
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_unable_connect_server_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1616
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/operation/R$drawable;->ic_network:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1617
    return-void
.end method

.method private showRightTextBtnMyActivity(Z)V
    .locals 3

    .line 1520
    if-eqz p1, :cond_0

    .line 1521
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 1522
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1523
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$drawable;->hw_health_shop_more_img:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1524
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/operation/activity/WebViewActivity$21;

    invoke-direct {v1, p0}, Lcom/huawei/operation/activity/WebViewActivity$21;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1539
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 1541
    :goto_0
    return-void
.end method

.method private showSSLErrorTipsPage()V
    .locals 5

    .line 1670
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSSLErrorTipsPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1671
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1672
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1673
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 1674
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1675
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1676
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1678
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_webview_cannot_load:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1679
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_webview_update_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1680
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_webview_check_date_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1681
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_pls_contact_huawei_customer_service:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1682
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/operation/R$drawable;->ic_abnormal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1683
    return-void
.end method

.method private showServerErrorPage()V
    .locals 4

    .line 1654
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showServerErrorPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1655
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1656
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1657
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnNetSetting:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1658
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1659
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1660
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1661
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 1662
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_servers_error:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1663
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/operation/R$drawable;->ic_network:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1664
    return-void
.end method

.method private showServiceTips(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1433
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showServiceTips huid=..., serviceId=...;function=..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showServiceTips huid = "

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

    .line 1435
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    if-nez p3, :cond_1

    .line 1436
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceId == null || huid == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1438
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3ea

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1440
    return-void

    .line 1442
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getAuthType(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    .line 1443
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "authType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1444
    const/4 v0, 0x1

    if-ne v0, v7, :cond_2

    .line 1445
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authType == 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1447
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1448
    return-void

    .line 1450
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 1451
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authType == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1454
    const-string v0, "\\*"

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 1455
    const/4 v0, 0x0

    aget-object v9, v8, v0

    .line 1456
    const/4 v0, 0x1

    aget-object v10, v8, v0

    .line 1457
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dialogType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",serviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    const-string v0, "HMS"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "NO_HMS"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1459
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceId is not Legal!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1461
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "201"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1463
    return-void

    .line 1465
    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    move-object v2, v9

    move-object v3, v10

    move-object v4, p2

    move-object v5, p1

    new-instance v6, Lcom/huawei/operation/activity/WebViewActivity$18;

    invoke-direct {v6, p0, p3}, Lcom/huawei/operation/activity/WebViewActivity$18;-><init>(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    invoke-interface/range {v0 .. v6}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->showServiceTips(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1488
    goto :goto_0

    .line 1482
    :catch_0
    move-exception v8

    .line 1484
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "202"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1485
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Can not get serviceIds "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1487
    return-void

    .line 1492
    :cond_4
    :goto_0
    return-void
.end method

.method private showUnstableNetWorkPage()V
    .locals 4

    .line 1623
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->netWorkLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1625
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1626
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips1:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1627
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips2:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1628
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtWebViewTips3:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1629
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 1630
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1631
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->txtNoNetWorkTips:Landroid/widget/TextView;

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_unstable_net_work_pls_touch_to_retry:I

    invoke-virtual {p0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1632
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->tipsImageView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/operation/R$drawable;->ic_network:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1633
    return-void
.end method


# virtual methods
.method public getCurrentPageUrl()Ljava/lang/String;
    .locals 5

    .line 799
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPageUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 800
    const-string v4, ""

    .line 801
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 802
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 804
    :cond_0
    return-object v4
.end method

.method public getWebViewOriginalUrl()Ljava/lang/String;
    .locals 5

    .line 786
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWebViewOriginalUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    const-string v4, ""

    .line 788
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 789
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v4

    .line 791
    :cond_0
    return-object v4
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1849
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1850
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " resultCode is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1851
    const/16 v0, 0x2766

    if-ne p1, v0, :cond_3

    .line 1852
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessage()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1853
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult FILECHOOSER_RESULTCODE return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1854
    return-void

    .line 1856
    :cond_0
    if-eqz p3, :cond_1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 1857
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessage()Landroid/webkit/ValueCallback;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1858
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessage(Landroid/webkit/ValueCallback;)V

    .line 1859
    goto/16 :goto_6

    :cond_3
    const/16 v0, 0x2767

    if-ne p1, v0, :cond_8

    .line 1860
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 1861
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult FILECHOOSER_RESULTCODE_FOR_ANDROID_5 return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1862
    return-void

    .line 1864
    :cond_4
    if-eqz p3, :cond_5

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    :cond_5
    const/4 v4, 0x0

    goto :goto_1

    :cond_6
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 1865
    :goto_1
    if-eqz v4, :cond_7

    .line 1866
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult FILECHOOSER_RESULTCODE_FOR_ANDROID_5 result not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1867
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/net/Uri;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_2

    .line 1869
    :cond_7
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult FILECHOOSER_RESULTCODE_FOR_ANDROID_5 result null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1870
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Landroid/net/Uri;

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1872
    :goto_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessageForAndroid5(Landroid/webkit/ValueCallback;)V

    .line 1873
    goto/16 :goto_6

    :cond_8
    const/16 v0, 0x4e21

    if-ne p1, v0, :cond_13

    .line 1874
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_e

    .line 1875
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO SDK_INT >= 21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1876
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_9

    .line 1877
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO getmUploadMessageForAndroid5 null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1878
    return-void

    .line 1879
    :cond_9
    if-nez p2, :cond_a

    .line 1880
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO resultCode == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1881
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Landroid/net/Uri;

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1882
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessageForAndroid5(Landroid/webkit/ValueCallback;)V

    .line 1883
    return-void

    .line 1885
    :cond_a
    if-eqz p3, :cond_b

    const/4 v0, -0x1

    if-eq p2, v0, :cond_c

    :cond_b
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getImageUri()Landroid/net/Uri;

    move-result-object v4

    goto :goto_3

    :cond_c
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 1886
    :goto_3
    if-eqz v4, :cond_d

    .line 1887
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO result != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1888
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/net/Uri;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_4

    .line 1890
    :cond_d
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO result == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1891
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessageForAndroid5()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Landroid/net/Uri;

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1893
    :goto_4
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessageForAndroid5(Landroid/webkit/ValueCallback;)V

    .line 1894
    goto/16 :goto_6

    .line 1895
    :cond_e
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO SDK_INT < 21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1896
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessage()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_f

    .line 1897
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO SDK_INT < 21 getmUploadMessage is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1898
    return-void

    .line 1899
    :cond_f
    if-nez p2, :cond_10

    .line 1900
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult REQ_CODE_TAKE_PHOTO SDK_INT < 21 resultCode == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1901
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessage()Landroid/webkit/ValueCallback;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1902
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessage(Landroid/webkit/ValueCallback;)V

    .line 1903
    return-void

    .line 1905
    :cond_10
    if-eqz p3, :cond_11

    const/4 v0, -0x1

    if-eq p2, v0, :cond_12

    :cond_11
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getImageUri()Landroid/net/Uri;

    move-result-object v4

    goto :goto_5

    :cond_12
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 1906
    :goto_5
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getmUploadMessage()Landroid/webkit/ValueCallback;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1907
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setmUploadMessage(Landroid/webkit/ValueCallback;)V

    .line 1908
    goto :goto_6

    .line 1910
    :cond_13
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult in JsClientApi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1913
    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/huawei/hwCloudJs/JsClientApi;->handleActivityResult(IILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1916
    goto :goto_6

    .line 1914
    :catch_0
    move-exception v4

    .line 1915
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1918
    :goto_6
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1830
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1831
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->reloadLayout:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 1832
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->reload()V

    goto :goto_0

    .line 1833
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->btnNetSetting:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 1834
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    goto :goto_0

    .line 1836
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->vmallTextView:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 1837
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setTheTabsChoose(Z)V

    goto :goto_0

    .line 1839
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->miaoTextView:Landroid/widget/TextView;

    if-ne p1, v0, :cond_3

    .line 1840
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setTheTabsChoose(Z)V

    .line 1843
    :cond_3
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 1990
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1991
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 1993
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->hideBottomUIMenu()V

    .line 1994
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6a2a\u5c4f\u72b6\u6001\uff1aORIENTATION_LANDSCAPE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1995
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 1996
    goto/16 :goto_2

    .line 1998
    :sswitch_1
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ad6\u5c4f\u72b6\u6001\uff1aORIENTATION_PORTRAIT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2000
    :try_start_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v2, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 2007
    goto :goto_0

    .line 2001
    :catch_0
    move-exception v4

    .line 2002
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2007
    goto :goto_0

    .line 2003
    :catch_1
    move-exception v4

    .line 2004
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2007
    goto :goto_0

    .line 2005
    :catch_2
    move-exception v4

    .line 2006
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2008
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBar:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 2009
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->showBottomUIMenu()V

    .line 2011
    :try_start_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onResume"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    const/4 v2, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5

    .line 2018
    goto :goto_1

    .line 2012
    :catch_3
    move-exception v4

    .line 2013
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2018
    goto :goto_1

    .line 2014
    :catch_4
    move-exception v4

    .line 2015
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2018
    goto :goto_1

    .line 2016
    :catch_5
    move-exception v4

    .line 2017
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->loadApplicationTheme()V

    .line 2020
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initSystemBar()V

    .line 2021
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2022
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNavigationBarColor common_color_white"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->common_color_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 2025
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->refreshDrawableState()V

    .line 2026
    .line 2030
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 283
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 284
    iput-object p0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    .line 286
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 287
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 288
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 289
    const-string v0, "url"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 290
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 291
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 293
    :cond_0
    const-string v0, "has_data"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->hasData:Z

    .line 296
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->isOverseaUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 297
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate isOversea return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->finish()V

    .line 299
    return-void

    .line 301
    :cond_2
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate isOversea url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 304
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://messagecenter.hicloud.com/breathePractice/index.html"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 305
    invoke-virtual {p0}, Lcom/huawei/operation/activity/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 307
    :cond_4
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initGRSManager()V

    .line 309
    return-void
.end method

.method public onDestroy()V
    .locals 7

    .line 1731
    :try_start_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1732
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1733
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1734
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONDESTROY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1735
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "303"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 1736
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setRegisterActivityQuitFunctionRes(Ljava/lang/String;)V

    .line 1737
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->clear()V

    .line 1739
    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/operation/activity/WebViewActivity;->mActiveFlag:Z

    .line 1740
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->setActiveFlag(Z)V

    .line 1741
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->jsApiId:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->destroyApi(Ljava/lang/String;)V

    .line 1742
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->setActivity(Landroid/app/Activity;)V

    .line 1743
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mGetUrlThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1744
    iget-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    iget-wide v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->biPauseTime:J

    iget-wide v4, p0, Lcom/huawei/operation/activity/WebViewActivity;->biStartTime:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    .line 1745
    const-string v0, "OPEN_SERVICE_TYPE"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1746
    const-string v0, "onDestroy OPEN_SERVICE_TYPE"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1747
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1748
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1749
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1750
    const-string v0, "time"

    iget-wide v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1751
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget-object v2, Lo/dae;->hl:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1753
    :cond_1
    const-string v0, "SHOW_TIME_BI"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->shouldBiShowTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1754
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BI_SHOW_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1755
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1756
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biId:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1757
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biName:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1758
    const-string v0, "source"

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biSource:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1759
    const-string v0, "showTime"

    iget-wide v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1760
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget-object v2, Lo/dae;->ak:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1763
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->isGuide:Z

    if-eqz v0, :cond_3

    .line 1764
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1765
    const-string v0, "startTime"

    iget-wide v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biStartTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1766
    const-string v0, "totalTime"

    iget-wide v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1768
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    sget-object v2, Lo/dae;->eO:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1771
    :cond_3
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->destroyWebView()V

    .line 1772
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1773
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-boolean v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->isFromHeartKanban:Z

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->stressAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1774
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mAdapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->breatheControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1778
    :cond_4
    goto :goto_0

    .line 1776
    :catch_0
    move-exception v6

    .line 1777
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1779
    :goto_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 411
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNewIntent ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 413
    invoke-virtual {p0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->setIntent(Landroid/content/Intent;)V

    .line 414
    sget v0, Lcom/huawei/operation/R$layout;->activity_common_web_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->setContentView(I)V

    .line 415
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->type:Ljava/lang/String;

    .line 416
    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 417
    const-string v0, "has_data"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->hasData:Z

    .line 418
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 419
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->url:Ljava/lang/String;

    .line 421
    :cond_0
    invoke-direct {p0}, Lcom/huawei/operation/activity/WebViewActivity;->initView()V

    .line 422
    return-void
.end method

.method public onPause()V
    .locals 5

    .line 1715
    :try_start_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 1716
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1717
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1718
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONPAUSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1719
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "302"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 1721
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biPauseTime:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1724
    goto :goto_0

    .line 1722
    :catch_0
    move-exception v4

    .line 1723
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1725
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/operation/activity/WebViewActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1726
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1922
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 1923
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult requestCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1924
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 1925
    const/16 v0, 0x232e

    if-ne p1, v0, :cond_0

    .line 1927
    invoke-static {p1, p2, p3}, Lcom/huawei/hwCloudJs/JsClientApi;->handleActivityPermissionResult(I[Ljava/lang/String;[I)V

    goto/16 :goto_0

    .line 1928
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1930
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1931
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : HasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1932
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->takePhoto()V

    goto/16 :goto_0

    .line 1934
    :cond_1
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1936
    :cond_2
    const/16 v0, 0xbb9

    if-ne p1, v0, :cond_4

    .line 1937
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.REQUEST_CODE_SCREEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1939
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1940
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : HasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1941
    new-instance v4, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1942
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v1}, Lcom/huawei/operation/view/CustomWebView;->getCaptureFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/operation/share/CaptureUtils;->capture(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1943
    goto :goto_0

    .line 1944
    :cond_3
    new-instance v4, Lcom/huawei/operation/share/CaptureUtils;

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/operation/share/CaptureUtils;-><init>(Landroid/content/Context;)V

    .line 1945
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v1}, Lcom/huawei/operation/view/CustomWebView;->getCaptureFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/operation/share/CaptureUtils;->captureNoPermission(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1946
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1949
    :cond_4
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 8

    .line 1686
    new-instance v0, Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;

    .line 1687
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.intent.action.CLICK_STATUSBAR"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1688
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity;->mDoubleClickReceiver:Lcom/huawei/operation/activity/WebViewActivity$DoubleClickReceiver;

    const-string v2, "huawei.permission.CLICK_STATUSBAR_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v6, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1690
    :try_start_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 1691
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1692
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1693
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONRESUME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1694
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "301"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 1697
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->lifeTime:J

    .line 1698
    iget-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    iget-wide v2, p0, Lcom/huawei/operation/activity/WebViewActivity;->biPauseTime:J

    iget-wide v4, p0, Lcom/huawei/operation/activity/WebViewActivity;->biStartTime:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biTotalTime:J

    .line 1699
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->biStartTime:J

    .line 1700
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_2

    .line 1701
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getCustomViewDialog()Lo/egw;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1702
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getCustomViewDialog()Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1704
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->clearUploadMessage()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1708
    :cond_2
    goto :goto_0

    .line 1706
    :catch_0
    move-exception v7

    .line 1707
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1710
    :goto_0
    return-void
.end method

.method public resetActivityListPage()V
    .locals 4

    .line 1955
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetActivityListPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1956
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1957
    return-void
.end method

.method public showQuitDialog()V
    .locals 6

    .line 1497
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1498
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_hwh_home_healthshop_quit_activities_contents:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/operation/activity/WebViewActivity$20;

    invoke-direct {v2, p0}, Lcom/huawei/operation/activity/WebViewActivity$20;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 1499
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/operation/R$string;->IDS_settings_firmware_upgrade_exit:I

    sget v2, Lcom/huawei/operation/R$color;->health_webview_quit_act_text_color:I

    new-instance v3, Lcom/huawei/operation/activity/WebViewActivity$19;

    invoke-direct {v3, p0}, Lcom/huawei/operation/activity/WebViewActivity$19;-><init>(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 1504
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1514
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1515
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1516
    return-void
.end method

.method public startLoadJS(Ljava/lang/String;)V
    .locals 4

    .line 1593
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startLoadJS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1594
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1595
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mCustomWebView is false url is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1596
    return-void

    .line 1598
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1600
    return-void
.end method

.method public startLoadUrl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1569
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startLoadUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1570
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startLoadUrl startLoadUrl the url is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1571
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1572
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mCustomWebView is false startLoadUrl is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    return-void

    .line 1575
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, p1}, Lcom/huawei/operation/view/CustomWebView;->replaceSpace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1576
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v4}, Lcom/huawei/operation/view/CustomWebView;->isWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1577
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWhiteUrl is false url is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 1579
    return-void

    .line 1581
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->mCustomWebView:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setJsEnable(Z)V

    .line 1583
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1585
    return-void
.end method
