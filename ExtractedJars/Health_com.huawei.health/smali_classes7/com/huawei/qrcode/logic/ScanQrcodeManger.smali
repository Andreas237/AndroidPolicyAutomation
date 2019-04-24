.class public Lcom/huawei/qrcode/logic/ScanQrcodeManger;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/ScanQrcodeManger$SingletoneHolder;
    }
.end annotation


# static fields
.field public static final INTENT_EVENT_CALL_BACK_ID:Ljava/lang/String; = "intent_event_callback_id"


# instance fields
.field private iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

.field private mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IScanQrcodeListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanSuccessCall()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/qrcode/logic/ScanQrcodeManger;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealQueryFailCallBack(Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealQueryResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IAppInfoCallBack;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    return-object v0
.end method

.method private dealAppInfoFail(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/logic/IAppInfoCallBack;->onAppInfoFail(I)V

    :cond_0
    return-void
.end method

.method private dealQueryFailCallBack(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "dealScanFailCallBack context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa3

    invoke-direct {p0, v1, p3, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/16 v0, 0xfa2

    if-ne v0, p2, :cond_1

    invoke-static {p1, p3}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getQrcodeUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "ScanQrcodeManger dealScanFailCallBack NOT_SUPPORT_PRODUCE_QRCODE."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const/16 v0, -0x12f

    if-ne v0, p2, :cond_2

    const-string v0, "ScanQrcodeManger dealScanFailCallBack SCAN_SDK_ERROR_NETWORK_FAIL."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_2
    const/16 v0, -0x130

    if-ne v0, p2, :cond_3

    const-string v0, "ScanQrcodeManger dealScanFailCallBack SCAN_SDK_ERROR_REQUEST_FAIL."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_3
    :goto_0
    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, p3, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private dealQueryResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ScanQrcodeManger json is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/16 v0, -0x130

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealAppInfoFail(I)V

    return-void

    :cond_0
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "rtnCode"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger real resp rtnCode-----> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    const-string v0, "packageName"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "downloadUrl"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "name"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "code"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "hashType"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "hash"

    invoke-static {v7, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger response ProduceCode-----> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v10, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-direct {v10}, Lcom/huawei/qrcode/model/QrcodeAppInfo;-><init>()V

    invoke-virtual {v10, v3}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppDownUrl(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppPackage(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setHashType(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setHashValue(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    const-string v12, ""

    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    array-length v0, v11

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    const/4 v0, 0x2

    aget-object v12, v11, v0

    :cond_1
    invoke-virtual {v10, v12}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppOperationInfo(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setName(Ljava/lang/String;)V

    invoke-direct {p0, v5, p1}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->saveProduceCodeJsonFromServer(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    invoke-interface {v0, v10}, Lcom/huawei/qrcode/logic/IAppInfoCallBack;->onAppInfoSuccess(Ljava/lang/Object;)V

    :cond_2
    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    if-ne v0, v6, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger json rtnCode -----> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0xfa2

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealAppInfoFail(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v7

    const-string v0, "JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/16 v0, -0x130

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealAppInfoFail(I)V

    :goto_1
    return-void
.end method

.method private dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "ScanQrcodeManger dealWithScanFailCall."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "ScanQrcodeManger dealWithScanFailCall mScanCodeListener is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/qrcode/logic/IScanQrcodeListener;->onScanFailCallBack(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private dealWithScanSuccessCall()V
    .locals 2

    const-string v0, "ScanQrcodeManger dealWithScanSuccessCall."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "ScanQrcodeManger iScanQrcodeListener is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/IScanQrcodeListener;->onScanSuccessCallBack(Ljava/lang/String;)V

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    return-object v0
.end method

.method private getProduceCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v2, ""

    invoke-static {p1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    array-length v0, v3

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    aget-object v2, v3, v0

    :cond_0
    return-object v2
.end method

.method private getQrcodeAppInfoInSp(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;
    .locals 11

    const/4 v2, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoInSp json is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoInSp scanResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "packageName"

    invoke-static {v3, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "downloadUrl"

    invoke-static {v3, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "name"

    invoke-static {v3, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "hashType"

    invoke-static {v3, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "hash"

    invoke-static {v3, v0}, Lcom/huawei/qrcode/util/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-direct {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;-><init>()V

    move-object v2, v0

    invoke-virtual {v2, v5}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppDownUrl(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppPackage(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setHashType(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setHashValue(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const-string v10, ""

    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    array-length v0, v9

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    const/4 v0, 0x2

    aget-object v10, v9, v0

    :cond_2
    invoke-virtual {v2, v10}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppOperationInfo(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setName(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoInSp JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-object v2
.end method

.method private getQueryUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "https://browserdl.hicloud.com/urlServer/appinfo"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "code="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "hashType="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "MD5"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isValidProduceCode(Ljava/lang/String;)Z
    .locals 9

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ScanQrcodeManger isExpireProduceCode spTime is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    goto :goto_0

    :catch_0
    move-exception v8

    const-string v0, "ScanQrcodeManger convert to Long exception."

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    sub-long v0, v4, v6

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    sub-long v0, v4, v6

    const-wide/32 v2, 0x4d3f6400

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    const-string v0, "ScanQrcodeManger isValidProduceCode spTime is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v0, "ScanQrcodeManger isValidProduceCode spTime is expire."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0
.end method

.method private saveProduceCodeJsonFromServer(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "ScanQrcodeManger saveProduceCodeJsonFromServer."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ScanQrcodeManger saveProduceCodeJsonFromServer produceCode is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ScanQrcodeManger saveProduceCodeJsonFromServer sp jsonValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "_"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "ScanQrcodeManger saveProduceCodeJsonFromServer mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getQrcodeAppInfoBySpJson(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;
    .locals 8

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getProduceCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson scanResult produceCode is not exist."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v2, v1}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson spJson is not exist."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_2
    const/4 v4, 0x0

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    :cond_3
    const-string v5, ""

    const-string v6, ""

    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    array-length v0, v4

    const/4 v1, 0x2

    if-lt v0, v1, :cond_4

    const/4 v0, 0x0

    aget-object v5, v4, v0

    const/4 v0, 0x1

    aget-object v6, v4, v0

    goto :goto_0

    :cond_4
    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson spJsonGroup error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson jsonValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_5
    invoke-direct {p0, v6}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->isValidProduceCode(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    const-string v0, "ScanQrcodeManger getQrcodeAppInfoBySpJson spJson is expire."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    invoke-static {p1}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->removeKeyValue(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-direct {p0, v5, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getQrcodeAppInfoInSp(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;

    move-result-object v0

    return-object v0
.end method

.method public startAnalyzeQrcode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode qrcodeUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xff

    if-lt v0, v1, :cond_2

    const-string v0, "ScanQrcodeManger startScanQrcode externalValue unlegal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const-string v0, ""

    const/16 v1, 0x12f

    invoke-direct {p0, v1, v0, p3}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/qrcode/logic/ExternalValueManager;->setExternalValue(Ljava/lang/String;)V

    iput-object p4, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-static {p2}, Lcom/huawei/qrcode/util/Util;->isOldHwid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.QRCODE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "qrcode_intent_key"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "intent_external_value"

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-interface {v0, v2}, Lcom/huawei/qrcode/logic/IScanQrcodeListener;->onAnalyzeSuccessCallBack(Landroid/content/Intent;)V

    return-void

    :cond_3
    invoke-static {p2}, Lcom/huawei/qrcode/util/QrcodeContactsUtil;->isMECard(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode is MECard."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanSuccessCall()V

    const/16 v0, 0x12d

    invoke-static {p1, p2, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->startContactPage(Landroid/content/Context;Ljava/lang/String;I)V

    return-void

    :cond_4
    invoke-static {p2}, Lcom/huawei/qrcode/util/QrcodeContactsUtil;->isVCard(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode is VCard."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanSuccessCall()V

    const/16 v0, 0x12e

    invoke-static {p1, p2, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->startContactPage(Landroid/content/Context;Ljava/lang/String;I)V

    return-void

    :cond_5
    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isHuaWeiQrcode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode not huawei qrcode."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa1

    invoke-direct {p0, v1, p2, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isUrlFormatOk(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode qrcodeUrl format error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xfa7

    invoke-direct {p0, v1, p2, v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger startAnalyzeQrcode eventId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;-><init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V

    invoke-virtual {v0, v2, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->addEventListener(Ljava/lang/String;Lcom/huawei/qrcode/logic/IEventListener;)V

    invoke-static {p1, p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isSupportProduceCode(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0, p1, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getQrcodeAppInfoBySpJson(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_8

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode parse sp json success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    invoke-static {p1, v3, v0, v2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->dealWithQrcodeApp(Landroid/content/Context;Lcom/huawei/qrcode/model/QrcodeAppInfo;ZLjava/lang/String;)V

    return-void

    :cond_8
    const-string v0, "ScanQrcodeManger startAnalyzeQrcode parse sp not json."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const-string v0, "ScanQrcodeManger startAnalyzeQrcode startQueryApp from server."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;

    invoke-direct {v1, p0, p1, v2, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;-><init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2, v1}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startQueryApp(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IAppInfoCallBack;)V

    return-void

    :cond_9
    const/4 v0, 0x1

    invoke-static {p1, p2, v0, v2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->parseSqrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public startQueryApp(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IAppInfoCallBack;)V
    .locals 5

    iput-object p3, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    const-string v2, ""

    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    array-length v0, v3

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    aget-object v2, v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger local req produceCode ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mAppInfoCallBack:Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    const/16 v1, 0xfa2

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/IAppInfoCallBack;->onAppInfoFail(I)V

    :cond_1
    return-void

    :goto_0
    new-instance v4, Lcom/huawei/qrcode/server/query/QueryThread;

    invoke-direct {p0, v2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getQueryUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;

    invoke-direct {v1, p0, p2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;-><init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Ljava/lang/String;)V

    invoke-direct {v4, p1, v0, v1}, Lcom/huawei/qrcode/server/query/QueryThread;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;)V

    invoke-virtual {v4}, Lcom/huawei/qrcode/server/query/QueryThread;->start()V

    return-void
.end method

.method public startScanQrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "ScanQrcodeManger startScanQrcode context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xff

    if-lt v0, v1, :cond_1

    const-string v0, "ScanQrcodeManger startScanQrcode externalValue unlegal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const-string v0, ""

    const/16 v1, 0x12f

    invoke-direct {p0, v1, v0, p4}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->dealWithScanFailCall(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/huawei/qrcode/logic/ExternalValueManager;->setExternalValue(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    iput-object p5, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->iScanQrcodeListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;-><init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V

    invoke-virtual {v0, v2, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->addEventListener(Ljava/lang/String;Lcom/huawei/qrcode/logic/IEventListener;)V

    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-class v0, Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v0, "intent_event_callback_id"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "intent_scan_function_tip"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    const-string v0, "picture_select_btn_flag"

    invoke-virtual {v3, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/qrcode/util/Util;->isGreaterOrEqualM()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_4
    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui50()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1, v3}, Lcom/huawei/qrcode/util/Util;->cancelSplit(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_5
    invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ScanQrcodeManger startScanQrcode ActivityNotFoundException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-void
.end method
