.class public Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static userInfoHelper:Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;


# instance fields
.field private userInfo:Lcom/sina/weibo/sdk/network/base/WbUserInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;
    .locals 1

    .line 16
    sget-object v0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfoHelper:Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;

    if-nez v0, :cond_0

    .line 17
    new-instance v0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfoHelper:Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;

    .line 19
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfoHelper:Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;

    return-object v0
.end method


# virtual methods
.method public clearUserInfo()V
    .locals 1

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfo:Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    .line 42
    return-void
.end method

.method public getUserInfo(Landroid/content/Context;)Lcom/sina/weibo/sdk/network/base/WbUserInfo;
    .locals 6

    .line 23
    if-nez p1, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfo:Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    if-nez v0, :cond_1

    .line 27
    const-string v0, "wb_sdk_user_key"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 28
    const-string v0, "uid"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 29
    const-string v0, "gsid"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 30
    const-string v0, "token"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 32
    new-instance v0, Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    invoke-direct {v0, v4, v3, v5}, Lcom/sina/weibo/sdk/network/base/WbUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfo:Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->userInfo:Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    return-object v0
.end method
