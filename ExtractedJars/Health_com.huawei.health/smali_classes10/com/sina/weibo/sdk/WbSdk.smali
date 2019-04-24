.class public Lcom/sina/weibo/sdk/WbSdk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static authInfo:Lcom/sina/weibo/sdk/auth/AuthInfo;

.field private static init:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-boolean v0, Lcom/sina/weibo/sdk/WbSdk;->init:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkInit()V
    .locals 2

    .line 42
    sget-boolean v0, Lcom/sina/weibo/sdk/WbSdk;->init:Z

    if-nez v0, :cond_0

    .line 43
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "weibo sdk was not initall! please use: WbSdk.install() in your app Application or your main Activity. when you want to use weibo sdk function, make sure call WbSdk.install() before this function"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    return-void
.end method

.method public static getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;
    .locals 1

    .line 49
    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->checkInit()V

    .line 50
    sget-object v0, Lcom/sina/weibo/sdk/WbSdk;->authInfo:Lcom/sina/weibo/sdk/auth/AuthInfo;

    return-object v0
.end method

.method public static install(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/AuthInfo;)V
    .locals 2

    .line 26
    sget-boolean v0, Lcom/sina/weibo/sdk/WbSdk;->init:Z

    if-nez v0, :cond_2

    .line 27
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getRedirectUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "please set right app info (appKey,redirect"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_1
    sput-object p1, Lcom/sina/weibo/sdk/WbSdk;->authInfo:Lcom/sina/weibo/sdk/auth/AuthInfo;

    .line 31
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->setAppKey(Ljava/lang/String;)V

    .line 32
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->setAppkey(Ljava/lang/String;)V

    .line 33
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/WbSdk;->authInfo:Lcom/sina/weibo/sdk/auth/AuthInfo;

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->aidTaskInit(Ljava/lang/String;)V

    .line 34
    const/4 v0, 0x1

    sput-boolean v0, Lcom/sina/weibo/sdk/WbSdk;->init:Z

    .line 36
    :cond_2
    return-void
.end method

.method public static isWbInstall(Landroid/content/Context;)Z
    .locals 4

    .line 58
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.sina.weibo.action.sdkidentity"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 59
    const-string v0, "android.intent.category.DEFAULT"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 61
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static supportMultiImage(Landroid/content/Context;)Z
    .locals 3

    .line 72
    invoke-static {p0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    invoke-static {p0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v2

    .line 74
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getSupportVersion()I

    move-result v0

    const/16 v1, 0x2a14

    if-lt v0, v1, :cond_0

    .line 75
    const/4 v0, 0x1

    return v0

    .line 77
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
