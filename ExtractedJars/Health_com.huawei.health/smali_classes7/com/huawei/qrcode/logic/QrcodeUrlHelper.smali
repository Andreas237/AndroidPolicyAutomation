.class public Lcom/huawei/qrcode/logic/QrcodeUrlHelper;
.super Ljava/lang/Object;


# static fields
.field private static mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static dealWithQrcodeApp(Landroid/content/Context;Lcom/huawei/qrcode/model/QrcodeAppInfo;ZLjava/lang/String;)V
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppPackage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/Util;->isPackageHasInstalled(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    invoke-static {}, Lcom/huawei/qrcode/logic/jump/JumpManager;->getInstance()Lcom/huawei/qrcode/logic/jump/JumpManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppPackage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppOperationInfo()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/jump/JumpManager;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "QrcodeUrlHelper dealWithQrcodeApp."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0, p3, p1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyListener(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-class v0, Lcom/huawei/qrcode/DownActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v0, "qrcodeAppInfo"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QrcodeUrlHelper isNeedBack is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    if-eqz p2, :cond_2

    const-string v0, "intent_event_callback_id"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    const-string v1, ""

    const/16 v2, 0xfa5

    invoke-virtual {v0, p3, v2, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    :cond_2
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_3

    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_3
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "QrcodeUrlHelper ActivityNotFoundException : "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static getQrcodeInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;
    .locals 4

    invoke-static {p0}, Lcom/huawei/qrcode/constant/QrcodeConstant;->getQrcodeConstant(Ljava/lang/String;)Lcom/huawei/qrcode/constant/QrcodeConstant;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    new-instance v3, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-direct {v3}, Lcom/huawei/qrcode/model/QrcodeAppInfo;-><init>()V

    iget-object v0, v2, Lcom/huawei/qrcode/constant/QrcodeConstant;->pkgName:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppPackage(Ljava/lang/String;)V

    iget-object v0, v2, Lcom/huawei/qrcode/constant/QrcodeConstant;->downUrl:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppDownUrl(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppOperationInfo(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "QrcodeUrlHelper getQrcodeInfo qrcodeConstant is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    :goto_0
    return-object v3
.end method

.method public static getQrcodeUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/huawei/qrcode/util/PackageUtil;->getVersionCode(Landroid/content/Context;)I

    move-result v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStrGroup(Ljava/lang/String;)[Ljava/lang/String;
    .locals 5

    const/4 v2, 0x0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QrcodeUrlHelper getStrGroup scanQrcodeResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-object v2

    :cond_0
    const/4 v3, 0x0

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :cond_1
    const/4 v4, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QrcodeUrlHelper getStrGroup: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v3, :cond_2

    const-string v1, "qrcodeUrl is null."

    goto :goto_0

    :cond_2
    const-string v1, "qrcodeUrl is not null."

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    array-length v0, v3

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    const/4 v0, 0x1

    aget-object v0, v3, v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :cond_3
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :cond_4
    return-object v2
.end method

.method public static isChinaUnionQrcode(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "//qr.95516.com/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v0, "QrcodeUrlHelper isChinaUnionQrcode true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "QrcodeUrlHelper isChinaUnionQrcode false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0
.end method

.method public static isHuaWeiQrcode(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "//q.hicloud.com/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v0, "QrcodeUrlHelper isHuaWeiQrcode true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "QrcodeUrlHelper isHuaWeiQrcode false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0
.end method

.method private static isLocalSupportCode(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QrcodeUrlHelper isLocalSupportCode qResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    array-length v0, v2

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-static {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant;->getQrcodeConstant(Ljava/lang/String;)Lcom/huawei/qrcode/constant/QrcodeConstant;

    move-result-object v3

    :cond_1
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    const-string v0, "QrcodeUrlHelper isLocalSupportCode qrcodeConstant is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_2
    iget-object v0, v3, Lcom/huawei/qrcode/constant/QrcodeConstant;->pkgName:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/Util;->isPackageHasInstalled(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "QrcodeUrlHelper isLocalSupportCode true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_3
    const-string v0, "QrcodeUrlHelper isLocalSupportCode false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0
.end method

.method public static isSupportProduceCode(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 5

    invoke-static {p1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    const-string v0, "QrcodeUrlHelper isSupportProduceCode splitValue is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isLocalSupportCode(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QrcodeUrlHelper isSupportProduceCode isLocalSupport "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QrcodeUrlHelper isSupportProduceCode splitValue length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    array-length v0, v3

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    invoke-static {}, Lcom/huawei/qrcode/constant/QrcodeConstant;->getInstance()Lcom/huawei/qrcode/constant/QrcodeConstant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/constant/QrcodeConstant;->getAppCodeHashSet()Ljava/util/HashSet;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static isUrlFormatOk(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QrcodeUrlHelper isFormatOk scanQrcodeResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    array-length v0, v2

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    const-string v0, "QrcodeUrlHelper isFormatOk scanQrcodeResult format true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v0, "QrcodeUrlHelper isFormatOk scanQrcodeResult format false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0
.end method

.method private static notifyIdentifySuccess(Lcom/huawei/qrcode/logic/IHandlerResultListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Lcom/huawei/qrcode/logic/IHandlerResultListener;->onHandlerSuccess()V

    goto :goto_0

    :cond_0
    const-string v0, "QrcodeUrlHelper notifyIdentifySuccess iHandlerResultListener is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    const/16 v1, 0xfa5

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    return-void
.end method

.method public static parseSqrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 4

    invoke-static {p1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    array-length v0, v2

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    const/4 v1, 0x2

    aget-object v1, v2, v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getQrcodeInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {p0, v3, p2, p3}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->dealWithQrcodeApp(Landroid/content/Context;Lcom/huawei/qrcode/model/QrcodeAppInfo;ZLjava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "QrcodeUrlHelper parseSqrcode qrcodeAppInfo is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static processSqrcodeResult(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IHandlerResultListener;)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QrcodeUrlHelper processSqrcodeResult context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    const-string v0, "QrcodeUrlHelper processSqrcodeResult iHandlerResultListener is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "QrcodeUrlHelper processSqrcodeResult scanQrcodeResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, 0xfa3

    invoke-interface {p3, v0}, Lcom/huawei/qrcode/logic/IHandlerResultListener;->onHandlerFail(I)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    const/16 v1, 0xfa3

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {p2}, Lcom/huawei/qrcode/util/QrcodeContactsUtil;->isMECard(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "QrcodeUrlHelper is MECard."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {p3, p1, p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->notifyIdentifySuccess(Lcom/huawei/qrcode/logic/IHandlerResultListener;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x12d

    invoke-static {p0, p2, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->startContactPage(Landroid/content/Context;Ljava/lang/String;I)V

    return-void

    :cond_3
    invoke-static {p2}, Lcom/huawei/qrcode/util/QrcodeContactsUtil;->isVCard(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "QrcodeUrlHelper is VCard."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {p3, p1, p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->notifyIdentifySuccess(Lcom/huawei/qrcode/logic/IHandlerResultListener;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x12e

    invoke-static {p0, p2, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->startContactPage(Landroid/content/Context;Ljava/lang/String;I)V

    return-void

    :cond_4
    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isHuaWeiQrcode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "QrcodeUrlHelper processSqrcodeResult not huawei qrcode."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, 0xfa1

    invoke-interface {p3, v0}, Lcom/huawei/qrcode/logic/IHandlerResultListener;->onHandlerFail(I)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    const/16 v1, 0xfa1

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-static {p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isUrlFormatOk(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "ScanQrcodeManger processSqrcodeResult qrcodeUrl format error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, 0xfa7

    invoke-interface {p3, v0}, Lcom/huawei/qrcode/logic/IHandlerResultListener;->onHandlerFail(I)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    const/16 v1, 0xfa7

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    return-void

    :cond_6
    sget-object v0, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->isSupportProduceCode(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "QrcodeUrlHelper processSqrcodeResult is huawei qrcode, but not support."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, 0xfa2

    invoke-interface {p3, v0}, Lcom/huawei/qrcode/logic/IHandlerResultListener;->onHandlerFail(I)V

    return-void

    :cond_7
    invoke-static {p3, p1, p2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->notifyIdentifySuccess(Lcom/huawei/qrcode/logic/IHandlerResultListener;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {p0, p2, v1, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->parseSqrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private static showMevCardpage(Landroid/content/Context;Lcom/huawei/qrcode/contacts/MEVCard;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QrcodeUrlHelper showMevCardpage context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    sget-object p0, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->mContext:Landroid/content/Context;

    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-class v0, Lcom/huawei/qrcode/contacts/QRCardActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v0, "bundleKeyMEVcard"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_1

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_1
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "QrcodeUrlHelper showMevCardpage ActivityNotFoundException: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-void
.end method

.method public static startContactPage(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QrcodeUrlHelper startContactPage context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "QrcodeUrlHelper startContactPage scanQrcodeResult is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_1
    const/16 v0, 0x12d

    if-ne v0, p2, :cond_2

    new-instance v2, Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-direct {v2}, Lcom/huawei/qrcode/contacts/MEVCard;-><init>()V

    invoke-virtual {v2, p1}, Lcom/huawei/qrcode/contacts/MEVCard;->parseMECard(Ljava/lang/String;)V

    invoke-static {p0, v2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->showMevCardpage(Landroid/content/Context;Lcom/huawei/qrcode/contacts/MEVCard;)V

    goto :goto_0

    :cond_2
    const/16 v0, 0x12e

    if-ne v0, p2, :cond_3

    new-instance v2, Lcom/huawei/qrcode/contacts/MEVCard;

    invoke-direct {v2}, Lcom/huawei/qrcode/contacts/MEVCard;-><init>()V

    invoke-virtual {v2, p1}, Lcom/huawei/qrcode/contacts/MEVCard;->parseVCard(Ljava/lang/String;)V

    invoke-static {p0, v2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->showMevCardpage(Landroid/content/Context;Lcom/huawei/qrcode/contacts/MEVCard;)V

    :cond_3
    :goto_0
    return-void
.end method
