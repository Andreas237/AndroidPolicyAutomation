.class public Lcom/sina/weibo/sdk/auth/AccessTokenKeeper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KEY_ACCESS_TOKEN:Ljava/lang/String; = "access_token"

.field private static final KEY_EXPIRES_IN:Ljava/lang/String; = "expires_in"

.field private static final KEY_REFRESH_TOKEN:Ljava/lang/String; = "refresh_token"

.field private static final KEY_UID:Ljava/lang/String; = "uid"

.field private static final PREFERENCES_NAME:Ljava/lang/String; = "com_weibo_sdk_android"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static clear(Landroid/content/Context;)V
    .locals 4

    .line 90
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 91
    return-void

    .line 93
    :cond_0
    const-string v0, "com_weibo_sdk_android"

    const v1, 0x8000

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 94
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 95
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 96
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 97
    return-void
.end method

.method public static readAccessToken(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;
    .locals 5

    .line 72
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    new-instance v3, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    invoke-direct {v3}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;-><init>()V

    .line 76
    const-string v0, "com_weibo_sdk_android"

    const v1, 0x8000

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 77
    const-string v0, "uid"

    const-string v1, ""

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->setUid(Ljava/lang/String;)V

    .line 78
    const-string v0, "access_token"

    const-string v1, ""

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->setToken(Ljava/lang/String;)V

    .line 79
    const-string v0, "refresh_token"

    const-string v1, ""

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->setRefreshToken(Ljava/lang/String;)V

    .line 80
    const-string v0, "expires_in"

    const-wide/16 v1, 0x0

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->setExpiresTime(J)V

    .line 81
    return-object v3
.end method

.method public static refreshToken(Ljava/lang/String;Landroid/content/Context;Lcom/sina/weibo/sdk/net/RequestListener;)V
    .locals 5

    .line 106
    invoke-static {p1}, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v2

    .line 107
    if-nez v2, :cond_0

    .line 108
    return-void

    .line 110
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/network/impl/RequestService;->getInstance()Lcom/sina/weibo/sdk/network/IRequestService;

    move-result-object v3

    .line 111
    new-instance v4, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;

    invoke-direct {v4, p1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;-><init>(Landroid/content/Context;)V

    .line 112
    const-string v0, "https://api.weibo.com/oauth2/access_token"

    invoke-virtual {v4, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setShortUrl(Ljava/lang/String;)V

    .line 113
    const-string v0, "client_id"

    invoke-virtual {v4, v0, p0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v0, "appKey"

    invoke-virtual {v4, v0, p0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "grant_type"

    const-string v1, "refresh_token"

    invoke-virtual {v4, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "refresh_token"

    invoke-virtual {v2}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getRefreshToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v4}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->build()Lcom/sina/weibo/sdk/network/impl/RequestParam;

    move-result-object v0

    new-instance v1, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper$1;

    invoke-direct {v1, p1, p2}, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper$1;-><init>(Landroid/content/Context;Lcom/sina/weibo/sdk/net/RequestListener;)V

    invoke-interface {v3, v0, v1}, Lcom/sina/weibo/sdk/network/IRequestService;->asyncRequest(Lcom/sina/weibo/sdk/network/IRequestParam;Lcom/sina/weibo/sdk/network/target/Target;)Lcom/sina/weibo/sdk/network/RequestCancelable;

    .line 160
    return-void
.end method

.method public static writeAccessToken(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)V
    .locals 5

    .line 51
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 52
    :cond_0
    return-void

    .line 55
    :cond_1
    const-string v0, "com_weibo_sdk_android"

    const v1, 0x8000

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 56
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 57
    const-string v0, "uid"

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 58
    const-string v0, "access_token"

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 59
    const-string v0, "refresh_token"

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getRefreshToken()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 60
    const-string v0, "expires_in"

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getExpiresTime()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 61
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 62
    return-void
.end method
