.class public Lcom/huawei/operation/js/JsInteraction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetJavaScriptEnabled"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/js/JsInteraction$JsSportData;
    }
.end annotation


# static fields
.field private static final ACHIEVE_EVENT:Ljava/lang/String; = "ACHIEVE_EVENT"

.field private static final ANNUAL_PERMMISION:Ljava/lang/String; = "annual_permmision"

.field private static final API_VERSION:Ljava/lang/String; = "2.0.019"

.field private static final BI_EVENT:Ljava/lang/String; = "BI_EVENT"

.field private static final CUSTUM_WISH_2018:Ljava/lang/String; = "wish_2018"

.field private static final DEBUG:Ljava/lang/String; = "DEBUG"

.field private static final FITNESS_DATA:Ljava/lang/String; = "data"

.field private static final HEALTH_LOGIN:Ljava/lang/String; = "HEALTH_LOGIN#"

.field private static final INFO:Ljava/lang/String; = "INFO"

.field private static final LOG_DEBUG:Ljava/lang/String; = "DEBUG"

.field private static final LOG_ERROR:Ljava/lang/String; = "ERROR"

.field private static final LOG_INFO:Ljava/lang/String; = "INFO"

.field private static final LOG_WARN:Ljava/lang/String; = "WARN"

.field private static final Lable:Ljava/lang/String; = "label"

.field private static final MAX_MOUTH_DAYS:I = 0x1f

.field private static final MIAO_RELEASE_PAY_URL:Ljava/lang/String; = "https://pay.miaohealth.net/"

.field private static final MIAO_RELEASE_URL:Ljava/lang/String; = "https://mlhwm.miaohealth.net/"

.field private static final MIAO_TEST_PAY_URL:Ljava/lang/String; = "https://paytest.miaohealth.net/"

.field private static final MIAO_TEST_URL:Ljava/lang/String; = "http://mlhwmtest.miaohealth.net/"

.field private static final RESULT_CODE:Ljava/lang/String; = "resultCode"

.field private static final SHOP_TYPE_MIAO:Ljava/lang/String; = "MIAO_MORE_SHOP"

.field private static final SUGGESTION_DATE:Ljava/lang/String; = "date"

.field private static final SUGGESTION_TOTAL_CALORIE:Ljava/lang/String; = "totalcalorie"

.field private static final SUGGESTION_TOTAL_DURATION:Ljava/lang/String; = "totalduration"

.field private static final TAG:Ljava/lang/String; = "Opera_[Operation Version 1.2]JsInteraction"


# instance fields
.field adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

.field private mAchievementShareCallback:Lcom/huawei/operation/adapter/AchievementShareCallback;

.field private mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

.field private mContext:Landroid/content/Context;

.field private mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

.field private mMapInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mOnActivityQuitCallBack:Lcom/huawei/operation/adapter/OnActivityQuitCallBack;

.field private mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

.field private mOnLoginCallback:Lcom/huawei/operation/adapter/OnLoginCallback;

.field private mOnVmallCouponCallBack:Lcom/huawei/operation/adapter/OnVmallCouponCallBack;

.field private mOnWebViewStatusCallBack:Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;

.field private mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

.field private mSendNoNetMsgCallBack:Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;

.field private mSendServerErrorMsgCallBack:Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;

.field private mSetTitleCallback:Lcom/huawei/operation/adapter/SetTitleCallback;

.field private mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

.field private mSportData:Lcom/huawei/operation/adapter/SportData;

.field private mStartAppSettingPage:Lcom/huawei/operation/adapter/StartAppSettingPage;

.field private mStartFitnessPageCallBack:Lcom/huawei/operation/adapter/StartFitnessPageCallback;

.field private mStartGPSTrackPageCallback:Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;

.field private mStartMiniShopWebPage:Lcom/huawei/operation/adapter/StartMiniShopWebPage;

.field private mStartSocialDetailPageCallback:Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;

.field private mStartWebpage:Lcom/huawei/operation/adapter/StartWebPage;

.field private mToastCallBack:Lcom/huawei/operation/adapter/ToastCallBack;

.field private mTouchSignalCallBack:Lcom/huawei/operation/adapter/TouchSignalCallBack;

.field private mVmallArgsignCallback:Lcom/huawei/operation/adapter/VmallArgsignCallback;

.field private mWhiteBoxUtil:Lcom/huawei/whitebox/e;

.field private sleepQuestionnaireCallBack:Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;

.field private url_check_host:Ljava/lang/String;

.field private url_login_host:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_login_host:Ljava/lang/String;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_check_host:Ljava/lang/String;

    .line 164
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mWhiteBoxUtil:Lcom/huawei/whitebox/e;

    .line 167
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    .line 168
    invoke-static {p1}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 169
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getAppInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getDeviceInfo"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "getLoginInfo"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "getUserInfo"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "getPhoneInfo"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getInfo([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    .line 174
    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/operation/js/JsInteraction;->dealNoGranted(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/OnCaptureCallback;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->sleepQuestionnaireCallBack:Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/VmallArgsignCallback;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mVmallArgsignCallback:Lcom/huawei/operation/adapter/VmallArgsignCallback;

    return-object v0
.end method

.method private checkFunctionIsleagal(Ljava/lang/String;)Z
    .locals 7

    .line 987
    const-string v4, ""

    .line 988
    const/4 v5, 0x0

    .line 990
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 991
    const-string v0, "accessToken"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 992
    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 995
    goto :goto_0

    .line 993
    :catch_0
    move-exception v6

    .line 994
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthData JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthData at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    invoke-direct {p0, v5}, Lcom/huawei/operation/js/JsInteraction;->getScopeByType(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private checkIsHuaweiWhiteUrl()Z
    .locals 4

    .line 262
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->needAuth(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsHuaweiWhiteUrl do not need auth version !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v0, 0x1

    return v0

    .line 266
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 267
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == operationAdapter || null == currentUrlCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    const/4 v0, 0x0

    return v0

    .line 270
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v1}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    const/4 v0, 0x1

    return v0

    .line 274
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private checkUrlIsLegal()Z
    .locals 6

    .line 232
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->needAuth(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegal do not need auth version !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const/4 v0, 0x1

    return v0

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v4

    .line 237
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 238
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkUrlIsLegal url == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",huid == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const-string v0, "https://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "http://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 240
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url.startsWith(\"https://\") || url.startsWith(\"http://\")"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_check_host:Ljava/lang/String;

    .line 243
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getActivityFlag()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 244
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegal WebViewActivity.getActiveFlag() = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_login_host:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_check_host:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_login_host:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->url_check_host:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 246
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url_login_host != null && url_check_host != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "url_login_host = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/js/JsInteraction;->url_login_host:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",url_check_host = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/js/JsInteraction;->url_check_host:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HEALTH_LOGIN#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 251
    :cond_3
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegal WebViewActivity.getActiveFlag() = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :cond_4
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "after setActiveFlag url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, v4, v5}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkCurrentUrlAuth(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 284
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->needAuth(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegalNew do not need auth version !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    const/4 v0, 0x1

    return v0

    .line 288
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkUrlIsLegalNew at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",scope = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v1}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegalNew is White url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/4 v0, 0x1

    return v0

    .line 295
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/js/JsInteraction;->doAtCheck(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private dealCapture(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1819
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "capture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1821
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    if-eqz v0, :cond_0

    .line 1822
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$2;

    invoke-direct {v1, p0, p2}, Lcom/huawei/operation/js/JsInteraction$2;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 1829
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnCaptureCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1831
    :goto_0
    return-void
.end method

.method private dealNoGranted(Ljava/lang/String;)V
    .locals 4

    .line 1834
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealNoGranted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1836
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    if-eqz v0, :cond_0

    .line 1837
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/operation/js/JsInteraction$3;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 1844
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnCaptureCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1846
    :goto_0
    return-void
.end method

.method private doAtCheck(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 18

    .line 305
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doAtCheck atParam = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",scope = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "atParam == null || scope == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    const/4 v0, 0x0

    return v0

    .line 310
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 313
    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {v5, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 317
    goto :goto_0

    .line 314
    :catch_0
    move-exception v6

    .line 315
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doHttpPost e is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    const/4 v0, 0x0

    return v0

    .line 319
    :goto_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v6, "apidevlf.hwcloudtest.cn"

    goto :goto_1

    :cond_2
    const-string v6, "api.cloud.huawei.com"

    .line 321
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->getTokenKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 322
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebViewActivity.tokenKeyUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/rest.php?nsp_ts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&nsp_svc=huawei.oauth2.user.getTokenInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 324
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 325
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 326
    const-string v0, "Content-Type"

    const-string v1, "text/xml"

    invoke-virtual {v10, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v0, "Host"

    invoke-virtual {v10, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v10, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    const-string v0, "User-Agent"

    const-string v1, "Apache-HttpClient/4.1.1 (java 1.5)"

    invoke-virtual {v10, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    const-string v0, "open_id"

    const-string v1, "OPENID"

    invoke-virtual {v9, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    const-string v0, "access_token"

    invoke-virtual {v9, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    const/4 v0, 0x0

    invoke-static {v0, v8, v9, v10}, Lcom/huawei/operation/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v11

    .line 333
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doAtCheck after postRequest , ans = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    const/4 v0, 0x0

    if-ne v0, v11, :cond_3

    .line 335
    const/4 v0, 0x0

    return v0

    .line 337
    :cond_3
    const/4 v12, 0x0

    .line 339
    :try_start_1
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 340
    const-string v0, "scope"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v12

    .line 344
    goto :goto_2

    .line 341
    :catch_1
    move-exception v13

    .line 342
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse param json fail! e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const/4 v0, 0x0

    return v0

    .line 345
    :goto_2
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cloudScope = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    if-nez v12, :cond_4

    .line 347
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloudScope == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const/4 v0, 0x0

    return v0

    .line 351
    :cond_4
    const-string v0, " "

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 352
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strings.length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v13

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    move-object v14, v13

    array-length v15, v14

    const/16 v16, 0x0

    :goto_3
    move/from16 v0, v16

    if-ge v0, v15, :cond_6

    aget-object v17, v14, v16

    .line 354
    move-object/from16 v0, v17

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 355
    const/4 v0, 0x1

    return v0

    .line 353
    :cond_5
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 358
    :cond_6
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scope is not exit cloudScope!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const/4 v0, 0x0

    return v0
.end method

.method private getCustomUserPrefKeys()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 2103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2104
    const-string v0, "custom.wish_2018"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2105
    return-object v1
.end method

.method private getScopeByType(I)Ljava/lang/String;
    .locals 1

    .line 1001
    const-string v0, ""

    .line 1002
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1004
    :pswitch_0
    const-string v0, "https://www.huawei.com/health/health.slp.readonly"

    .line 1005
    goto :goto_0

    .line 1007
    :pswitch_1
    const-string v0, "https://www.huawei.com/health/health.bg.readonly"

    .line 1008
    goto :goto_0

    .line 1010
    :pswitch_2
    const-string v0, "https://www.huawei.com/health/health.bp.readonly"

    .line 1011
    goto :goto_0

    .line 1013
    :pswitch_3
    const-string v0, "https://www.huawei.com/health/health.hr.readonly"

    .line 1014
    goto :goto_0

    .line 1016
    :pswitch_4
    const-string v0, "https://www.huawei.com/health/health.wgt.readonly"

    .line 1017
    goto :goto_0

    .line 1019
    :pswitch_5
    const-string v0, "https://www.huawei.com/health/health.slp.readonly"

    .line 1020
    goto :goto_0

    .line 1022
    :pswitch_6
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    .line 1023
    .line 1027
    :goto_0
    :pswitch_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_7
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private initJsonDataForH5(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 491
    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    const-string v0, "data"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    goto :goto_0

    .line 493
    :catch_0
    move-exception v3

    .line 494
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    :goto_0
    return-void
.end method

.method private isMiaoUrl()Z
    .locals 5

    .line 1503
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v4

    .line 1504
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMiaoUrl url is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1505
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1506
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMiaoUrl url is : empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1507
    const/4 v0, 0x0

    return v0

    .line 1509
    :cond_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1510
    const-string v0, "http://mlhwmtest.miaohealth.net/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://paytest.miaohealth.net/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1511
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1514
    :cond_2
    const-string v0, "https://mlhwm.miaohealth.net/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "https://pay.miaohealth.net/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1515
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 1518
    :cond_4
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMiaoUrl url is : false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1519
    const/4 v0, 0x0

    return v0
.end method

.method private jsonToMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 1528
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mapJson = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1529
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1531
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1532
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    .line 1533
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1534
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 1535
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1536
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 1537
    const-string v0, ""

    invoke-interface {v4, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1539
    :cond_0
    invoke-interface {v4, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1541
    :goto_1
    goto :goto_0

    .line 1544
    :cond_1
    goto :goto_2

    .line 1542
    :catch_0
    move-exception v5

    .line 1543
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    :goto_2
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonToMap map is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1546
    return-object v4
.end method

.method private parseJsonFromSHOP(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1346
    const-string v4, ""

    .line 1347
    const-string v5, ""

    .line 1348
    const-string v0, "MIAO_MORE_SHOP"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1349
    const-string v4, "mpqlf0xjydgwtp9es7"

    .line 1350
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mWhiteBoxUtil:Lcom/huawei/whitebox/e;

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mWhiteBoxUtil:Lcom/huawei/whitebox/e;

    const/4 v2, 0x1

    const/16 v3, 0x3e9

    invoke-virtual {v1, v2, v3}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mWhiteBoxUtil:Lcom/huawei/whitebox/e;

    const/4 v2, 0x1

    const/16 v3, 0x7d1

    invoke-virtual {v1, v2, v3}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1352
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1354
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mWhiteBoxUtil:Lcom/huawei/whitebox/e;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 1357
    goto :goto_0

    .line 1355
    :catch_0
    move-exception v8

    .line 1356
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    :cond_0
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1360
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 1362
    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1363
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    .line 1364
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1365
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 1366
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1367
    const/4 v0, 0x0

    if-ne v0, v11, :cond_1

    .line 1368
    const-string v0, ""

    invoke-interface {v7, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1370
    :cond_1
    invoke-interface {v7, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1372
    :goto_2
    goto :goto_1

    .line 1375
    :cond_2
    goto :goto_3

    .line 1373
    :catch_1
    move-exception v8

    .line 1374
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    :goto_3
    const-string v0, "open_appid"

    invoke-interface {v7, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1377
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 1378
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1379
    goto :goto_4

    .line 1380
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v6, v2, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1381
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    return-object v8
.end method


# virtual methods
.method public achievementShare(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 817
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 818
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the current Url is not Huawei super White Url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    return-void

    .line 822
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "achievementShare imgUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", awardName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mAchievementShareCallback:Lcom/huawei/operation/adapter/AchievementShareCallback;

    if-eqz v0, :cond_1

    .line 824
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mAchievementShareCallback:Lcom/huawei/operation/adapter/AchievementShareCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/AchievementShareCallback;->onAchievementShare(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    :cond_1
    return-void
.end method

.method public breatheControl(Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2289
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2290
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breatheControl context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2291
    return-void

    .line 2293
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheControl "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2295
    const-string v6, ""

    .line 2297
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2298
    const-string v0, "functionRes"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 2301
    goto :goto_0

    .line 2299
    :catch_0
    move-exception v7

    .line 2300
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheControl JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2303
    :goto_0
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v7

    .line 2304
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2305
    if-eqz v7, :cond_1

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_1

    .line 2306
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "BREATHE_CONTROL"

    move-object v3, p1

    move-object v4, v6

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2310
    :cond_1
    return-void
.end method

.method public calibrationControl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1577
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationControl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1579
    const-string v6, ""

    .line 1581
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1582
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1585
    goto :goto_0

    .line 1583
    :catch_0
    move-exception v7

    .line 1584
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1586
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1587
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl calibrationControl_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1588
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationControl isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1589
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1590
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "CALIBRATION_CONTROL"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1593
    :cond_0
    return-void
.end method

.method public capture(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1757
    const-string v4, ""

    .line 1759
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1760
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1763
    goto :goto_0

    .line 1761
    :catch_0
    move-exception v5

    .line 1762
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1764
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1765
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1766
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1767
    if-nez v5, :cond_0

    .line 1768
    return-void

    .line 1771
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 1772
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 1776
    if-eqz v6, :cond_1

    .line 1777
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/js/JsInteraction;->dealCapture(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 1780
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1781
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_8

    .line 1782
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1783
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    .line 1784
    :goto_1
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 1785
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v9, 0x1

    goto :goto_2

    :cond_5
    const/4 v9, 0x0

    .line 1786
    :goto_2
    if-nez v8, :cond_6

    if-nez v9, :cond_6

    .line 1787
    invoke-direct {p0, p2}, Lcom/huawei/operation/js/JsInteraction;->dealNoGranted(Ljava/lang/String;)V

    .line 1788
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/operation/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1789
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storagePermission false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1790
    return-void

    .line 1792
    :cond_6
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 1793
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    invoke-interface {v0, p2}, Lcom/huawei/operation/adapter/OnCaptureCallback;->onParseFunction(Ljava/lang/String;)V

    .line 1794
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$1;

    invoke-direct {v1, p0, p2}, Lcom/huawei/operation/js/JsInteraction$1;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    const/16 v2, 0xbb9

    invoke-static {v0, v7, v1, v2}, Lo/dbe;->b(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;I)V

    .line 1809
    return-void

    .line 1813
    :cond_7
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/js/JsInteraction;->dealCapture(Ljava/lang/String;Ljava/lang/String;)V

    .line 1816
    :cond_8
    :goto_3
    return-void
.end method

.method public checkAppIsInstall(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2320
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAppIsInstall"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2321
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2322
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAppIsInstall mContext == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2323
    const/4 v0, 0x0

    return v0

    .line 2325
    :cond_0
    const-string v4, ""

    .line 2327
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2328
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2331
    goto :goto_0

    .line 2329
    :catch_0
    move-exception v5

    .line 2330
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2332
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2333
    const-string v0, "https://www.huawei.com/auth/account/base.profile"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2334
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capture checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2335
    if-eqz v5, :cond_1

    .line 2336
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 2337
    return v6

    .line 2339
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public checkCalibration(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1597
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCalibration param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1599
    const-string v6, ""

    .line 1601
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1602
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1605
    goto :goto_0

    .line 1603
    :catch_0
    move-exception v7

    .line 1604
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCailbration JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1606
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1607
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCalibration checkCalibration_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1608
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCailbration isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1610
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "CHECK_CALIBRATION"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1613
    :cond_0
    return-void
.end method

.method public checkConnected(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1683
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkConnected()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1684
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkConnected param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1686
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "CHECK_CONNECTED"

    move-object v3, p1

    move-object v4, p2

    const/4 v5, 0x1

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1689
    :cond_0
    return-void
.end method

.method public closeWeb()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1387
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWeb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

    if-eqz v0, :cond_0

    .line 1389
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/CloseWebCallBack;->onCloseWebCallBack()V

    .line 1391
    :cond_0
    return-void
.end method

.method public copyContent2Clipboard(Ljava/lang/String;)Z
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2277
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2278
    const/4 v0, 0x0

    return v0

    .line 2281
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/ClipboardManager;

    .line 2282
    const-string v0, "label"

    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    .line 2283
    invoke-virtual {v2, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 2284
    const/4 v0, 0x1

    return v0
.end method

.method public deleteSleepQuestionnaireResult(JLjava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2238
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteSleepQuestionnaireResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2239
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v4

    .line 2240
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 2241
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$8;

    invoke-direct {v1, p0, p3}, Lcom/huawei/operation/js/JsInteraction$8;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->deleteSleepQuestionnaireResult(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2250
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteurl check fail or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2252
    :goto_0
    return-void
.end method

.method public gameControl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1663
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gameControl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1664
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gameControl param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    const-string v6, ""

    .line 1667
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1668
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1671
    goto :goto_0

    .line 1669
    :catch_0
    move-exception v7

    .line 1670
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCailbration JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1672
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1673
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gameControl gameControl_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1674
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gameControl isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1675
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1676
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "GAME_CONTROL"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1679
    :cond_0
    return-void
.end method

.method public getAbility()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1240
    invoke-static {}, Lcom/huawei/operation/utils/AbilitySetUtils;->getAbilitySet()Ljava/lang/String;

    move-result-object v4

    .line 1241
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AbilityData json ===>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1242
    return-object v4
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 521
    const-string v4, ""

    .line 522
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 524
    const-string v0, ""

    return-object v0

    .line 526
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    .line 527
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAccessToken return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    return-object v4
.end method

.method public getAnnualInitalData()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 976
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualInitalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 980
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the current Url is not Huawei super WhiteUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 981
    const-string v0, "1002"

    return-object v0

    .line 983
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getAnnualInitalData()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAnnualReport(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 961
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualReport functionRes : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    invoke-direct {p0, p1}, Lcom/huawei/operation/js/JsInteraction;->checkFunctionIsleagal(Ljava/lang/String;)Z

    move-result v6

    .line 964
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 965
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "ANNUAL_REPORT_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 967
    :cond_0
    return-void
.end method

.method public getApiVersion()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 880
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getApiVersion return: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "2.0.019"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 881
    const-string v0, "2.0.019"

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 570
    const-string v4, ""

    .line 571
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "appId"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 574
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAppId return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    return-object v4
.end method

.method public getAppType()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 585
    const-string v4, ""

    .line 586
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "appType"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 589
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAppType return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    return-object v4
.end method

.method public getBindDeviceType()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 662
    const-string v4, ""

    .line 663
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 664
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "productType"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 666
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBindDeviceType return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    return-object v4
.end method

.method public getCustomUserPrefFromHiHealth(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2001
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCustomUserPrefFromHiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2002
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCustomUserPrefFromHiHealth key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2003
    const-string v4, ""

    .line 2005
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2006
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2009
    goto :goto_0

    .line 2007
    :catch_0
    move-exception v5

    .line 2008
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCustomUserPrefFromHiHealth JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2010
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCustomUserPrefFromHiHealth at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2011
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2012
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCustomUserPrefFromHiHealth checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2013
    const/4 v6, 0x0

    .line 2014
    if-eqz v5, :cond_0

    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->getCustomUserPrefKeys()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2015
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, p2}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 2016
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 2017
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2018
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v6

    .line 2021
    :cond_0
    return-object v6
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 625
    const-string v4, ""

    .line 626
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 628
    const-string v0, ""

    return-object v0

    .line 630
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 631
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "deviceId"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 633
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceId return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 635
    const-string v4, "clientnull"

    .line 637
    :cond_2
    return-object v4
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 600
    const-string v4, ""

    .line 601
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 602
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "deviceModel"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 604
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceType return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    return-object v4
.end method

.method public getEnvironment()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 726
    const-string v4, ""

    .line 727
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 728
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "environment"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 730
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getEnvironment return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    return-object v4
.end method

.method public getFitnessData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 396
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessData startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 400
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the current Url is not Huawei super WhiteUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    const-string v0, "1002"

    return-object v0

    .line 404
    :cond_0
    invoke-static {p1, p2}, Lcom/huawei/operation/jsoperation/JsUtil;->checkParamIsLegal(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 405
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessData params is not legal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const-string v0, "1001"

    return-object v0

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getRecordsByDateRange(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 410
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 411
    :cond_2
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportListData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    const-string v0, ""

    return-object v0

    .line 414
    :cond_3
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessData sportListData.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 416
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 417
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessData map.get(date)="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "date"

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",map.get(totalcarlorie)= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "totalcalorie"

    .line 418
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",map.get(totalduration)="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "totalduration"

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 417
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 421
    const-string v0, "date"

    const-string v1, "date"

    :try_start_0
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 422
    const-string v0, "totalcalorie"

    const-string v1, "totalcalorie"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 423
    const-string v0, "totalduration"

    const-string v1, "totalduration"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 424
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 427
    goto :goto_1

    .line 425
    :catch_0
    move-exception v9

    .line 426
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessData JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_1
    goto/16 :goto_0

    .line 430
    :cond_4
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFitnessStat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 442
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStat startDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 444
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 445
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v0

    if-nez v0, :cond_0

    .line 446
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessStat checkUrlIsLegal retrun false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const-string v0, "1003"

    const-string v1, "getFitnessStat JSONException checkUrlIsLegal false"

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/operation/js/JsInteraction;->initJsonDataForH5(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 451
    :cond_0
    invoke-static {p1, p2}, Lcom/huawei/operation/jsoperation/JsUtil;->checkParamIsLegal(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 452
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessStat params is not legal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const-string v0, "1001"

    const-string v1, "getFitnessStat JSONException ONE "

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/operation/js/JsInteraction;->initJsonDataForH5(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getRecordsByDateRange(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 458
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 460
    :cond_2
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessStat sportListData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    const-string v0, "0"

    const-string v1, "getFitnessStat JSONException TWO "

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/operation/js/JsInteraction;->initJsonDataForH5(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 464
    :cond_3
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStat sportListData.size() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map;

    .line 466
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 468
    const-string v0, "date"

    const-string v1, "date"

    :try_start_0
    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 469
    const-string v0, "totalcalorie"

    const-string v1, "totalcalorie"

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 470
    const-string v0, "totalduration"

    const-string v1, "totalduration"

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 471
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 474
    goto :goto_1

    .line 472
    :catch_0
    move-exception v10

    .line 473
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessStat JSONException Three"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    :goto_1
    goto :goto_0

    .line 477
    :cond_4
    const-string v0, "0"

    const-string v1, "getFitnessStat JSONException Four"

    invoke-direct {p0, v4, v5, v0, v1}, Lcom/huawei/operation/js/JsInteraction;->initJsonDataForH5(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStat jsonObject.toString = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFitnessStatData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 913
    const-string v6, ""

    .line 915
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 916
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 919
    goto :goto_0

    .line 917
    :catch_0
    move-exception v7

    .line 918
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStatData JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStatData at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    const-string v0, "https://www.huawei.com/health/sport.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 922
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessStatData checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 924
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "FITNESS_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 926
    :cond_0
    return-void
.end method

.method public getHealthData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 948
    invoke-direct {p0, p1}, Lcom/huawei/operation/js/JsInteraction;->checkFunctionIsleagal(Ljava/lang/String;)Z

    move-result v6

    .line 949
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 950
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "HEALTH_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 952
    :cond_0
    return-void
.end method

.method public getHealthStat(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 935
    invoke-direct {p0, p1}, Lcom/huawei/operation/js/JsInteraction;->checkFunctionIsleagal(Ljava/lang/String;)Z

    move-result v6

    .line 936
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 937
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "HEALTH_STAT"

    move-object v3, p1

    move-object v4, p2

    move v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 939
    :cond_0
    return-void
.end method

.method public getHuid()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 505
    const-string v4, ""

    .line 506
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v0

    if-nez v0, :cond_0

    .line 507
    const-string v0, ""

    return-object v0

    .line 509
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 510
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuid return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    return-object v4
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 711
    const-string v4, ""

    .line 712
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 713
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "languageCode"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 715
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLanguage return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    return-object v4
.end method

.method public getMotionPathData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1037
    const-string v6, ""

    .line 1038
    const/4 v7, 0x0

    .line 1040
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1041
    const-string v0, "accessToken"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1044
    goto :goto_0

    .line 1042
    :catch_0
    move-exception v8

    .line 1043
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMotionPathData JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMotionPathData at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1047
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TextUtils.isEmpty(motionPath_at) and used old check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1048
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v7

    goto :goto_1

    .line 1050
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motionPath_at is not null,used new check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    const-string v0, "https://www.huawei.com/health/motionpath.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1053
    :goto_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMotionPathData checkUrlIsLegal() return: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1054
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_1

    .line 1055
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "MOTION_PATH_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1057
    :cond_1
    return-void
.end method

.method public getNickName()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 741
    const-string v4, ""

    .line 742
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 744
    const-string v0, ""

    return-object v0

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 747
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "name"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 749
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNickName return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    return-object v4
.end method

.method public getPersonalPrivacySettingValue(Ljava/lang/String;I)Ljava/lang/String;
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2118
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPersonalPrivacySettingValue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2119
    const-string v4, ""

    .line 2121
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2122
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2125
    goto :goto_0

    .line 2123
    :catch_0
    move-exception v5

    .line 2124
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2126
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2127
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2129
    const/4 v6, 0x0

    .line 2130
    if-eqz v5, :cond_0

    .line 2131
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p2}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getPersonalPrivacySettingValue(I)Ljava/lang/String;

    move-result-object v6

    .line 2133
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPersonalPrivacySettingValue result is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2134
    return-object v6
.end method

.method public getPhoneModel()Ljava/lang/String;
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 696
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 697
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 698
    const-string v0, ""

    return-object v0

    .line 700
    :cond_0
    return-object v1
.end method

.method public getPhoneType()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 678
    const-string v4, ""

    .line 679
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 680
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PhoneType is HW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    const-string v4, "HW"

    goto :goto_0

    .line 683
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PhoneType is 3RD"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    const-string v4, "3RD"

    .line 686
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPhoneType return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    return-object v4
.end method

.method public getPhoto()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 760
    const-string v4, ""

    .line 761
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 763
    const-string v0, ""

    return-object v0

    .line 765
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 766
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "portraitUrl"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 768
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPhoto return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    return-object v4
.end method

.method public getServiceToken()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 538
    const-string v4, ""

    .line 539
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 541
    const-string v0, ""

    return-object v0

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v4

    .line 544
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getServiceToken return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    return-object v4
.end method

.method public getSharedPreference(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2029
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSharedPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2030
    const-string v4, ""

    .line 2032
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2033
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2036
    goto :goto_0

    .line 2034
    :catch_0
    move-exception v5

    .line 2035
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSharedPreference JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2037
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSharedPreference at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2038
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2039
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSharedPreference checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2040
    const/4 v6, 0x0

    .line 2041
    if-eqz v5, :cond_0

    .line 2042
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 2043
    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 2042
    invoke-static {v0, v1, p2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2045
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSharedPreference result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2046
    return-object v6
.end method

.method public getSleepService()Ljava/lang/String;
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2259
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    .line 2260
    const-string v1, ""

    .line 2261
    if-eqz v0, :cond_0

    .line 2262
    invoke-static {}, Lo/dch;->b()Lo/dch;

    move-result-object v2

    .line 2263
    invoke-virtual {v2}, Lo/dch;->d()Ljava/lang/String;

    move-result-object v1

    .line 2265
    :cond_0
    return-object v1
.end method

.method public getSportData()Ljava/lang/String;
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1131
    const-string v4, ""

    .line 1132
    const-string v5, "1.0.1"

    .line 1134
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1136
    const-string v0, ""

    return-object v0

    .line 1138
    :cond_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 1140
    new-instance v8, Ljava/util/Date;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1141
    invoke-virtual {v6, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 1143
    new-instance v10, Lcom/huawei/operation/js/JsInteraction$JsSportData;

    invoke-direct {v10}, Lcom/huawei/operation/js/JsInteraction$JsSportData;-><init>()V

    .line 1144
    invoke-virtual {v10, v5}, Lcom/huawei/operation/js/JsInteraction$JsSportData;->setVersion(Ljava/lang/String;)V

    .line 1145
    invoke-virtual {v10, v9}, Lcom/huawei/operation/js/JsInteraction$JsSportData;->setCurrentTime(Ljava/lang/String;)V

    .line 1147
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getSportData()Lcom/huawei/operation/adapter/SportData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSportData:Lcom/huawei/operation/adapter/SportData;

    .line 1148
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSportData:Lcom/huawei/operation/adapter/SportData;

    if-eqz v0, :cond_1

    .line 1149
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSportData:Lcom/huawei/operation/adapter/SportData;

    invoke-virtual {v0}, Lcom/huawei/operation/adapter/SportData;->getData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/operation/js/JsInteraction$JsSportData;->configData(Ljava/util/List;)V

    .line 1151
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v10}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1152
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportData json ===>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    return-object v4
.end method

.method public getSportData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1082
    const-string v6, ""

    .line 1084
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1085
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1088
    goto :goto_0

    .line 1086
    :catch_0
    move-exception v7

    .line 1087
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportData JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportData at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    const-string v0, "https://www.huawei.com/health/sport.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1091
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportData checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1092
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1093
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "SPORT_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1095
    :cond_0
    return-void
.end method

.method public getSportData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1068
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v4

    .line 1069
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUrlIsLegal() return: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1070
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1071
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    invoke-interface {v0, p1, p2, p3, v4}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsSportDataFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1073
    :cond_0
    return-void
.end method

.method public getSysVersion()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 647
    const-string v4, ""

    .line 648
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 649
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "sysVersion"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 651
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSysVersion return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    return-object v4
.end method

.method public getUpDeviceType()Ljava/lang/String;
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 614
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v1

    .line 615
    return-object v1
.end method

.method public getUserGender(Ljava/lang/String;)I
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2077
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserGender"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2078
    const-string v4, ""

    .line 2080
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2081
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2084
    goto :goto_0

    .line 2082
    :catch_0
    move-exception v5

    .line 2083
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2085
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2086
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2088
    const/4 v6, -0x1

    .line 2089
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserGender checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2090
    if-eqz v5, :cond_0

    .line 2091
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v7

    .line 2092
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 2093
    invoke-virtual {v7}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v6

    .line 2096
    :cond_0
    return v6
.end method

.method public getUserInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 891
    const-string v6, ""

    .line 893
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 894
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 897
    goto :goto_0

    .line 895
    :catch_0
    move-exception v7

    .line 896
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 898
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 899
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 900
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 901
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 902
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "USER_INFO_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 904
    :cond_0
    return-void
.end method

.method public getVersion()Ljava/lang/String;
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 555
    const-string v4, ""

    .line 556
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 557
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mMapInfo:Ljava/util/Map;

    const-string v1, "grayVersion"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 559
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getVersion return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    return-object v4
.end method

.method public go2PersonalPrivacySettingsActivity(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2145
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPersonalPrivacySettingValue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2146
    const-string v4, ""

    .line 2148
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2149
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2152
    goto :goto_0

    .line 2150
    :catch_0
    move-exception v5

    .line 2151
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2153
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkIsLegal at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2154
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2155
    if-eqz v5, :cond_0

    .line 2156
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->go2PersonalPrivacySettingsActivity()V

    .line 2158
    :cond_0
    return-void
.end method

.method public goBackToMiniShop()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1395
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goBackToMiniShop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1396
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

    if-eqz v0, :cond_0

    .line 1397
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/CloseWebCallBack;->goBackToMiniShop()V

    .line 1399
    :cond_0
    return-void
.end method

.method public insertHealthData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1117
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertHealthData param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",functionRes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    invoke-direct {p0, p1}, Lcom/huawei/operation/js/JsInteraction;->checkFunctionIsleagal(Ljava/lang/String;)Z

    move-result v6

    .line 1119
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "INSERT_HEALTH_DATA"

    move-object v3, p1

    move-object v4, p2

    move v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1122
    :cond_0
    return-void
.end method

.method public isBigCD()Z
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2415
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2417
    const/4 v0, 0x0

    return v0

    .line 2419
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v4

    .line 2420
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBigCD return:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2421
    return v4
.end method

.method public isNetworkConnected()Z
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1427
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1428
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public jumpBrowserDownload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2383
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpBrowserDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2384
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2385
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpBrowserDownload mContext == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2386
    return-void

    .line 2388
    :cond_0
    const-string v4, ""

    .line 2390
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2391
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2394
    goto :goto_0

    .line 2392
    :catch_0
    move-exception v5

    .line 2393
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jumpBrowserDownload JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2395
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jumpBrowserDownload at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2396
    const-string v0, "https://www.huawei.com/auth/account/base.profile"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2397
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jumpBrowserDownload checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2398
    if-eqz v5, :cond_1

    .line 2399
    invoke-static {p2}, Lcom/huawei/operation/utils/WebViewUtils;->isWhiteThirdPkg(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2400
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 2401
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 2402
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2403
    invoke-virtual {v7, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2404
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2407
    :cond_1
    return-void
.end method

.method public log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 792
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 793
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the current Url is not Huawei super White Url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    return-void

    .line 797
    :cond_0
    const-string v0, "DEBUG"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 798
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "H5 log content : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 799
    :cond_1
    const-string v0, "INFO"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 800
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "H5 log content : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 801
    :cond_2
    const-string v0, "ERROR"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 802
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "H5 log content : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 803
    :cond_3
    const-string v0, "WARN"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 804
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "H5 log content : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 806
    :cond_4
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "log level:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", content:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    :goto_0
    return-void
.end method

.method public login(Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 368
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendCurrentUrlCallback;->getCurrentUrl()Ljava/lang/String;

    move-result-object v4

    .line 369
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 371
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HEALTH_LOGIN#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 372
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/operation/PluginOperation;->setActivityFlag(Z)V

    .line 373
    const-string v0, "https://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url.startsWith(\"https://\") || url.startsWith(\"http://\")"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->url_login_host:Ljava/lang/String;

    .line 377
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() url=..., huid=..., serviceId=...;function=..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login() url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "serviceId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",function = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnLoginCallback:Lcom/huawei/operation/adapter/OnLoginCallback;

    if-eqz v0, :cond_2

    .line 381
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnLoginCallback:Lcom/huawei/operation/adapter/OnLoginCallback;

    invoke-interface {v0, v5, v6, p1}, Lcom/huawei/operation/adapter/OnLoginCallback;->onLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 383
    :cond_2
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnLoginCallback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    :goto_0
    return-void
.end method

.method public querySleepQuestionnaireResults(JLjava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2183
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter querySleepQuestionnaireResults"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2184
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v4

    .line 2185
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 2186
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$5;

    invoke-direct {v1, p0, p3}, Lcom/huawei/operation/js/JsInteraction$5;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->querySleepQuestionnaireResults(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2195
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteurl check fail or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2197
    :goto_0
    return-void
.end method

.method public registerActivityQuit(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1705
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerActivityQuit functionRes : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1706
    const-string v4, ""

    .line 1708
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1709
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1712
    goto :goto_0

    .line 1710
    :catch_0
    move-exception v5

    .line 1711
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1713
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activity_at at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1714
    const-string v0, "https://www.huawei.com/health/activity"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1715
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerActivityQuit isLegal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1716
    if-nez v5, :cond_0

    .line 1717
    const/16 v0, 0x3eb

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1719
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnActivityQuitCallBack:Lcom/huawei/operation/adapter/OnActivityQuitCallBack;

    if-eqz v0, :cond_1

    .line 1720
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnActivityQuitCallBack:Lcom/huawei/operation/adapter/OnActivityQuitCallBack;

    invoke-interface {v0, p2}, Lcom/huawei/operation/adapter/OnActivityQuitCallBack;->onActivityQuitCallBack(Ljava/lang/String;)V

    goto :goto_1

    .line 1722
    :cond_1
    const/16 v0, 0x7cf

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1724
    :goto_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public registerDataClient(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1099
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",functionRes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1100
    const-string v6, ""

    .line 1102
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1103
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1106
    goto :goto_0

    .line 1104
    :catch_0
    move-exception v7

    .line 1105
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1108
    const-string v0, "https://www.huawei.com/health/profile"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1109
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1111
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "DATA"

    const-string v2, "REGISTER_DATA_CLIENT"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1113
    :cond_0
    return-void
.end method

.method public registerVmallCoupon(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1729
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerVmallCoupon functionRes : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1730
    const-string v4, ""

    .line 1732
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1733
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1736
    goto :goto_0

    .line 1734
    :catch_0
    move-exception v5

    .line 1735
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1737
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activity_at at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1738
    const-string v0, "https://www.huawei.com/health/activity"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1739
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerVmallCoupon isLegal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1740
    if-nez v5, :cond_0

    .line 1741
    const/16 v0, 0x3eb

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1743
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnVmallCouponCallBack:Lcom/huawei/operation/adapter/OnVmallCouponCallBack;

    if-eqz v0, :cond_1

    .line 1744
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnVmallCouponCallBack:Lcom/huawei/operation/adapter/OnVmallCouponCallBack;

    invoke-interface {v0, p2}, Lcom/huawei/operation/adapter/OnVmallCouponCallBack;->onVmallCouponCallBack(Ljava/lang/String;)V

    goto :goto_1

    .line 1746
    :cond_1
    const/16 v0, 0x7cf

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1748
    :goto_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public registerWebViewStatus(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1693
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWebViewStatus functionRes : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1694
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnWebViewStatusCallBack:Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;

    if-eqz v0, :cond_0

    .line 1695
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnWebViewStatusCallBack:Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;->onWebViewStatusCallBack(Ljava/lang/String;)V

    goto :goto_0

    .line 1697
    :cond_0
    const/16 v0, 0x7cf

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1699
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public relaxControl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1640
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "relaxControl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1641
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxControl param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1642
    const-string v6, ""

    .line 1644
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1645
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1648
    goto :goto_0

    .line 1646
    :catch_0
    move-exception v7

    .line 1647
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCailbration JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.rt.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1650
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxControl relaxControl_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1651
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxControl isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1652
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1653
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "RELAX_CONTROL"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1656
    :cond_0
    return-void
.end method

.method public resetCalibration(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1617
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetCalibration()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1618
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetCalibration param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1619
    const-string v6, ""

    .line 1621
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1622
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1625
    goto :goto_0

    .line 1623
    :catch_0
    move-exception v7

    .line 1624
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkCailbration JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1626
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1627
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetCalibration resetCalibration_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1628
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetCailbration isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1629
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1630
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "RESET_CALIBRATION"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1633
    :cond_0
    return-void
.end method

.method public sendNoNetMsg()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1418
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendNoNetMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1419
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendNoNetMsgCallBack:Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;

    if-eqz v0, :cond_0

    .line 1420
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendNoNetMsg mSendNoNetMsgCallBack != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1421
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendNoNetMsgCallBack:Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;->onSendNoNetMsgCallBack()V

    .line 1423
    :cond_0
    return-void
.end method

.method public sendServerErrorMsg()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1406
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendServerErrorMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1407
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendServerErrorMsgCallBack:Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;

    if-eqz v0, :cond_0

    .line 1408
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendServerErrorMsg mSendServerErrorMsgCallBack != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSendServerErrorMsgCallBack:Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;->onSendServerErrorMsgCallBack()V

    .line 1411
    :cond_0
    return-void
.end method

.method public setBIEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1441
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1442
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBIEventNew isOversea return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    return-void

    .line 1445
    :cond_0
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->isMiaoUrl()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1447
    return-void

    .line 1449
    :cond_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " mapJson = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, " level = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1450
    invoke-direct {p0, p2}, Lcom/huawei/operation/js/JsInteraction;->jsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 1451
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1452
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1453
    return-void
.end method

.method public setBIEventNew(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1464
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBIEventNew()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1465
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBIEventNew param: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    const-string v2, " mapJson : "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p3, v1, v2

    const-string v2, " type : "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1467
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1468
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBIEventNew isOversea return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    return-void

    .line 1471
    :cond_0
    const-string v4, ""

    .line 1473
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1474
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1477
    goto :goto_0

    .line 1475
    :catch_0
    move-exception v5

    .line 1476
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setBIEventNew JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1478
    :goto_0
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1480
    const-string v0, "https://www.huawei.com/auth/account/base.profile"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 1481
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBIEventNew isLegal "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isLegalBase "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1482
    if-nez v5, :cond_1

    if-eqz v6, :cond_4

    .line 1483
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "BI_EVENT"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1484
    :cond_2
    invoke-direct {p0, p3}, Lcom/huawei/operation/js/JsInteraction;->jsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .line 1485
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1486
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1487
    goto :goto_1

    :cond_3
    const-string v0, "ACHIEVE_EVENT"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1489
    :try_start_1
    invoke-direct {p0, p3}, Lcom/huawei/operation/js/JsInteraction;->jsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .line 1490
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0, p2, v7}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->setAchieveEvent(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1493
    goto :goto_1

    .line 1491
    :catch_1
    move-exception v7

    .line 1492
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1496
    :cond_4
    :goto_1
    return-void
.end method

.method public setCustomUserPrefFromHiHealth(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1974
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomUserPrefFromHiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCustomUserPrefFromHiHealth key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1976
    const-string v4, ""

    .line 1978
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1979
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1982
    goto :goto_0

    .line 1980
    :catch_0
    move-exception v5

    .line 1981
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCustomUserPrefFromHiHealth JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1983
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCustomUserPrefFromHiHealth at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1984
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1985
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCustomUserPrefFromHiHealth checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1986
    if-eqz v5, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->getCustomUserPrefKeys()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x78

    if-ge v0, v1, :cond_1

    .line 1987
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    if-eqz v0, :cond_0

    .line 1988
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    invoke-interface {v0, p4, p2, p3}, Lcom/huawei/operation/adapter/OnCaptureCallback;->onCustomUserPrefSet(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1990
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomUserPrefFromHiHealth = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1994
    :cond_1
    :goto_1
    return-void
.end method

.method public setSendCallback(Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;Lcom/huawei/operation/adapter/SendCurrentUrlCallback;Lcom/huawei/operation/adapter/OnActivityQuitCallBack;Lcom/huawei/operation/adapter/OnVmallCouponCallBack;Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;Lcom/huawei/operation/adapter/VmallArgsignCallback;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mSendServerErrorMsgCallBack:Lcom/huawei/operation/adapter/SendServerErrorMsgCallBack;

    .line 190
    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction;->mSendNoNetMsgCallBack:Lcom/huawei/operation/adapter/SendNoNetMsgCallBack;

    .line 191
    iput-object p3, p0, Lcom/huawei/operation/js/JsInteraction;->mSendCurrentUrlCallback:Lcom/huawei/operation/adapter/SendCurrentUrlCallback;

    .line 192
    iput-object p4, p0, Lcom/huawei/operation/js/JsInteraction;->mOnActivityQuitCallBack:Lcom/huawei/operation/adapter/OnActivityQuitCallBack;

    .line 193
    iput-object p5, p0, Lcom/huawei/operation/js/JsInteraction;->mOnVmallCouponCallBack:Lcom/huawei/operation/adapter/OnVmallCouponCallBack;

    .line 194
    iput-object p6, p0, Lcom/huawei/operation/js/JsInteraction;->sleepQuestionnaireCallBack:Lcom/huawei/operation/adapter/SleepQuestionnaireCallBack;

    .line 195
    iput-object p7, p0, Lcom/huawei/operation/js/JsInteraction;->mVmallArgsignCallback:Lcom/huawei/operation/adapter/VmallArgsignCallback;

    .line 196
    return-void
.end method

.method public setShareCallback(Lcom/huawei/operation/adapter/ShareCallback;Lcom/huawei/operation/adapter/AchievementShareCallback;Lcom/huawei/operation/adapter/OnCaptureCallback;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

    .line 178
    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction;->mAchievementShareCallback:Lcom/huawei/operation/adapter/AchievementShareCallback;

    .line 179
    iput-object p3, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    .line 180
    return-void
.end method

.method public setSharedPreference(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2054
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSharedPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2055
    const-string v4, ""

    .line 2057
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2058
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2061
    goto :goto_0

    .line 2059
    :catch_0
    move-exception v5

    .line 2060
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSharedPreference JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2062
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSharedPreference at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2063
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2064
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSharedPreference checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2065
    if-eqz v5, :cond_0

    .line 2066
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 2067
    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dcy;

    invoke-direct {v2}, Lo/dcy;-><init>()V

    .line 2066
    invoke-static {v0, v1, p2, p3, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2070
    :cond_0
    return-void
.end method

.method public setStarAndEndCallback(Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;Lcom/huawei/operation/adapter/StartFitnessPageCallback;Lcom/huawei/operation/adapter/StartMiniShopWebPage;Lcom/huawei/operation/adapter/StartWebPage;Lcom/huawei/operation/adapter/StartAppSettingPage;Lcom/huawei/operation/adapter/CloseWebCallBack;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mStartGPSTrackPageCallback:Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;

    .line 212
    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction;->mStartSocialDetailPageCallback:Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;

    .line 213
    iput-object p3, p0, Lcom/huawei/operation/js/JsInteraction;->mStartFitnessPageCallBack:Lcom/huawei/operation/adapter/StartFitnessPageCallback;

    .line 214
    iput-object p4, p0, Lcom/huawei/operation/js/JsInteraction;->mStartMiniShopWebPage:Lcom/huawei/operation/adapter/StartMiniShopWebPage;

    .line 215
    iput-object p5, p0, Lcom/huawei/operation/js/JsInteraction;->mStartWebpage:Lcom/huawei/operation/adapter/StartWebPage;

    .line 216
    iput-object p6, p0, Lcom/huawei/operation/js/JsInteraction;->mStartAppSettingPage:Lcom/huawei/operation/adapter/StartAppSettingPage;

    .line 217
    iput-object p7, p0, Lcom/huawei/operation/js/JsInteraction;->mCloseWebCallBack:Lcom/huawei/operation/adapter/CloseWebCallBack;

    .line 218
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 779
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTitle title:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSetTitleCallback:Lcom/huawei/operation/adapter/SetTitleCallback;

    if-eqz v0, :cond_0

    .line 781
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mSetTitleCallback:Lcom/huawei/operation/adapter/SetTitleCallback;

    invoke-interface {v0, p1}, Lcom/huawei/operation/adapter/SetTitleCallback;->setTitle(Ljava/lang/String;)V

    .line 783
    :cond_0
    return-void
.end method

.method public setTouchCalllback(Lcom/huawei/operation/adapter/TouchSignalCallBack;Lcom/huawei/operation/adapter/OnLoginCallback;Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mTouchSignalCallBack:Lcom/huawei/operation/adapter/TouchSignalCallBack;

    .line 200
    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction;->mOnLoginCallback:Lcom/huawei/operation/adapter/OnLoginCallback;

    .line 201
    iput-object p3, p0, Lcom/huawei/operation/js/JsInteraction;->mOnWebViewStatusCallBack:Lcom/huawei/operation/adapter/OnWebViewStatusCallBack;

    .line 202
    return-void
.end method

.method public setWidgetCallback(Lcom/huawei/operation/adapter/SetTitleCallback;Lcom/huawei/operation/adapter/ToastCallBack;Lcom/huawei/operation/adapter/JsDataCallBack;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction;->mSetTitleCallback:Lcom/huawei/operation/adapter/SetTitleCallback;

    .line 222
    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction;->mToastCallBack:Lcom/huawei/operation/adapter/ToastCallBack;

    .line 223
    iput-object p3, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    .line 224
    return-void
.end method

.method public share(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 849
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "share activityId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", shareType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", shareChannel:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

    if-eqz v0, :cond_0

    .line 851
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/ShareCallback;->onShare(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    :cond_0
    return-void
.end method

.method public share(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 864
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bitmapUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", title:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",content:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegal()Z

    move-result v0

    if-nez v0, :cond_0

    .line 867
    return-void

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

    if-eqz v0, :cond_1

    .line 870
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mShareCallback:Lcom/huawei/operation/adapter/ShareCallback;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/huawei/operation/adapter/ShareCallback;->onShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    :cond_1
    return-void
.end method

.method public shareByPath(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1922
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareByPath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1923
    const-string v4, ""

    .line 1925
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1926
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1929
    goto :goto_0

    .line 1927
    :catch_0
    move-exception v5

    .line 1928
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareByPath JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1930
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareByPath at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1931
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1932
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareByPath checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1933
    if-eqz v5, :cond_1

    .line 1934
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    if-eqz v0, :cond_0

    .line 1935
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    invoke-interface {v0, p2}, Lcom/huawei/operation/adapter/OnCaptureCallback;->onShare(Ljava/lang/String;)V

    goto :goto_1

    .line 1937
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnCaptureCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1940
    :cond_1
    :goto_1
    return-void
.end method

.method public shareMultipleImg(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1948
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareMultipleImg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1949
    const-string v4, ""

    .line 1951
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1952
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1955
    goto :goto_0

    .line 1953
    :catch_0
    move-exception v5

    .line 1954
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareMultipleImg JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1956
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareMultipleImg at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1957
    const-string v0, "https://www.huawei.com/health/profile.readonly"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1958
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shareMultipleImg checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1959
    if-eqz v5, :cond_1

    .line 1960
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    if-eqz v0, :cond_0

    .line 1961
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mOnCaptureCallback:Lcom/huawei/operation/adapter/OnCaptureCallback;

    invoke-interface {v0, p2, p3}, Lcom/huawei/operation/adapter/OnCaptureCallback;->onShareMultiple(Ljava/lang/String;I)V

    goto :goto_1

    .line 1963
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOnCaptureCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1966
    :cond_1
    :goto_1
    return-void
.end method

.method public signInterfaceSHA256(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1322
    const-string v4, ""

    .line 1323
    const-string v5, ""

    .line 1325
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/js/JsInteraction;->parseJsonFromSHOP(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1328
    goto :goto_0

    .line 1326
    :catch_0
    move-exception v6

    .line 1327
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    :goto_0
    const-string v0, "UTF-8"

    :try_start_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/cxc;->b([B)[B

    move-result-object v6

    .line 1331
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lo/cwu;->a([BZ)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v5, v0

    .line 1334
    goto :goto_1

    .line 1332
    :catch_1
    move-exception v6

    .line 1333
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1335
    :goto_1
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after SHA256 url is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1336
    return-object v5
.end method

.method public startAppSettingPage()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1288
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAppSettingPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1289
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1290
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the currentUrl is not Huawei super White Url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1292
    return-void

    .line 1295
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartAppSettingPage:Lcom/huawei/operation/adapter/StartAppSettingPage;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1296
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartAppSettingPage:Lcom/huawei/operation/adapter/StartAppSettingPage;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/StartAppSettingPage;->onStartAppSettingPage()V

    .line 1298
    :cond_1
    return-void
.end method

.method public startFitnessList()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1230
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitnessList enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    invoke-interface {v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->startFitnessList()V

    .line 1232
    return-void
.end method

.method public startFitnessPage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1219
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startFitnessPage id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1220
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartFitnessPageCallBack:Lcom/huawei/operation/adapter/StartFitnessPageCallback;

    if-eqz v0, :cond_0

    .line 1221
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartFitnessPageCallBack:Lcom/huawei/operation/adapter/StartFitnessPageCallback;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/operation/adapter/StartFitnessPageCallback;->onStartFitnessPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1223
    :cond_0
    return-void
.end method

.method public startGPSTrailPage(ILjava/lang/String;F)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1189
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startGPSTrailPage sportType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " targetType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " targetValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1190
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartGPSTrackPageCallback:Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;

    if-eqz v0, :cond_0

    .line 1191
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartGPSTrackPageCallback:Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/huawei/operation/adapter/StartGPSTrackPageCallback;->onStartGPSTrackPage(Landroid/content/Context;ILjava/lang/String;F)V

    .line 1193
    :cond_0
    return-void
.end method

.method public startMiniShopWebPage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1252
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMiniShopWebPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1254
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the currentUrl is not Huawei super White Url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1256
    return-void

    .line 1258
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartMiniShopWebPage:Lcom/huawei/operation/adapter/StartMiniShopWebPage;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1259
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartMiniShopWebPage:Lcom/huawei/operation/adapter/StartMiniShopWebPage;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/StartMiniShopWebPage;->onStartMiniShopWebPage(Ljava/lang/String;Ljava/lang/String;)V

    .line 1261
    :cond_1
    return-void
.end method

.method public startPkgApp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2351
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPkgApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2352
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2353
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPkgApp mContext == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2354
    return-void

    .line 2356
    :cond_0
    const-string v4, ""

    .line 2358
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2359
    const-string v0, "accessToken"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2362
    goto :goto_0

    .line 2360
    :catch_0
    move-exception v5

    .line 2361
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startPkgApp JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2363
    :goto_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startPkgApp at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2364
    const-string v0, "https://www.huawei.com/auth/account/base.profile"

    invoke-direct {p0, v4, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 2365
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startPkgApp checkUrlIsLegalNew return = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2366
    if-eqz v5, :cond_1

    .line 2367
    invoke-static {p2}, Lcom/huawei/operation/utils/WebViewUtils;->isWhiteThirdPkg(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2368
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-static {v0, p2, p3, p4}, Lcom/huawei/operation/utils/WebViewUtils;->gotoPkgAppDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2371
    :cond_1
    return-void
.end method

.method public startSocialDetailPage(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1201
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSocialDetailPage huid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartSocialDetailPageCallback:Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;

    if-eqz v0, :cond_1

    .line 1203
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 1204
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 1205
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartSocialDetailPageCallback:Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction;->mContext:Landroid/content/Context;

    invoke-interface {v0, v1, v4, v5}, Lcom/huawei/operation/adapter/StartSocialDetailPageCallback;->onStartSocialDetialPage(Landroid/content/Context;J)V

    goto :goto_0

    .line 1207
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSocialDetailPage failed because of huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1210
    :cond_1
    :goto_0
    return-void
.end method

.method public startWebPage(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1270
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWebPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1272
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/huawei/operation/utils/Utils;->isHttpOrHttps(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1273
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWebPage empty url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    return-void

    .line 1276
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartWebpage:Lcom/huawei/operation/adapter/StartWebPage;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1277
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mStartWebpage:Lcom/huawei/operation/adapter/StartWebPage;

    invoke-interface {v0, p1}, Lcom/huawei/operation/adapter/StartWebPage;->onStartWebPage(Ljava/lang/String;)V

    .line 1279
    :cond_2
    return-void
.end method

.method public stressControl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1554
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressControl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1555
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", functionRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1556
    const-string v6, ""

    .line 1558
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1559
    const-string v0, "accessToken"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1562
    goto :goto_0

    .line 1560
    :catch_0
    move-exception v7

    .line 1561
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl JSONException param fail e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1563
    :goto_0
    const-string v0, "https://www.huawei.com/health/health.ps.readonly"

    invoke-direct {p0, v6, v0}, Lcom/huawei/operation/js/JsInteraction;->checkUrlIsLegalNew(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 1564
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl stressControl_at = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1565
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressControl isLegal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1566
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    if-eqz v0, :cond_0

    .line 1567
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mJsDataCallBack:Lcom/huawei/operation/adapter/JsDataCallBack;

    const-string v1, "STRESS"

    const-string v2, "STRESS_CONTROL"

    move-object v3, p1

    move-object v4, p2

    move v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/operation/adapter/JsDataCallBack;->callJsServiceFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1570
    :cond_0
    return-void
.end method

.method public toast(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 835
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toast content:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mToastCallBack:Lcom/huawei/operation/adapter/ToastCallBack;

    if-eqz v0, :cond_0

    .line 837
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mToastCallBack:Lcom/huawei/operation/adapter/ToastCallBack;

    invoke-interface {v0, p1, p2}, Lcom/huawei/operation/adapter/ToastCallBack;->onToast(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    :cond_0
    return-void
.end method

.method public touchSignal(Z)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1306
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "touchSignal is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1307
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mTouchSignalCallBack:Lcom/huawei/operation/adapter/TouchSignalCallBack;

    if-eqz v0, :cond_0

    .line 1308
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "touchSignal mTouchSignalCallBack "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1309
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->mTouchSignalCallBack:Lcom/huawei/operation/adapter/TouchSignalCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/operation/adapter/TouchSignalCallBack;->onTouchSignalCallBack(Z)V

    .line 1311
    :cond_0
    return-void
.end method

.method public uploadSleepQuestionnaireResults(JLjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2163
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter uploadSleepQuestionnaireResults"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2164
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v4

    .line 2165
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 2166
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$4;

    invoke-direct {v1, p0, p4}, Lcom/huawei/operation/js/JsInteraction$4;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->uploadSleepQuestionnaireResults(JLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2176
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteurl check fail or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2179
    :goto_0
    return-void
.end method

.method public vmallAgrQuery(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2220
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter querySleepQuestionnaireResults"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2221
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v4

    .line 2222
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 2223
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$7;

    invoke-direct {v1, p0, p1}, Lcom/huawei/operation/js/JsInteraction$7;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->vmallAgrQuery(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2232
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteurl check fail or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2234
    :goto_0
    return-void
.end method

.method public vmallAgrSign(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 2202
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter vmallAgrSign"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2203
    invoke-direct {p0}, Lcom/huawei/operation/js/JsInteraction;->checkIsHuaweiWhiteUrl()Z

    move-result v4

    .line 2204
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    if-eqz v0, :cond_0

    .line 2205
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction;->adapter:Lcom/huawei/operation/adapter/PluginOperationAdapter;

    new-instance v1, Lcom/huawei/operation/js/JsInteraction$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/operation/js/JsInteraction$6;-><init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->vmallAgrSign(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2214
    :cond_0
    const-string v0, "Opera_[Operation Version 1.2]JsInteraction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteurl check fail or adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2216
    :goto_0
    return-void
.end method
