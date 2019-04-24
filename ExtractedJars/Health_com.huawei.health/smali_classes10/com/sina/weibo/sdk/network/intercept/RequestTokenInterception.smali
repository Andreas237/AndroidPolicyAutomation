.class public Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/network/IRequestIntercept;


# static fields
.field private static token:Ljava/lang/String;


# instance fields
.field private final REFRESH_ACTION:Ljava/lang/String;

.field private final WEIBO_SDK_REFRESH_TOKEN_FILE:Ljava/lang/String;

.field private final WEIBO_SDK_TOKEN_KEY:Ljava/lang/String;

.field private final WEIBO_SDK_TOKEN_TIME:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, "refresh_action"

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->REFRESH_ACTION:Ljava/lang/String;

    .line 26
    const-string v0, "weibo_sdk_refresh_token_done"

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->WEIBO_SDK_REFRESH_TOKEN_FILE:Ljava/lang/String;

    .line 27
    const-string v0, "weibo_sdk_token_key_done"

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->WEIBO_SDK_TOKEN_KEY:Ljava/lang/String;

    .line 28
    const-string v0, "video_refresh_token_time_done"

    iput-object v0, p0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->WEIBO_SDK_TOKEN_TIME:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public doIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/InterceptException;
        }
    .end annotation

    .line 68
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/InterceptException;

    const-string v1, "\u4e0a\u4e0b\u6587\u8bbe\u7f6e\u4e3anull"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/InterceptException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_0
    const/4 v3, 0x0

    .line 73
    const-string v0, "refresh_action"

    :try_start_0
    invoke-interface {p1, v0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getInterceptResult(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 74
    goto :goto_0

    :catch_0
    move-exception v4

    .line 76
    :goto_0
    invoke-static {}, Lcom/sina/weibo/sdk/network/impl/RequestService;->getInstance()Lcom/sina/weibo/sdk/network/IRequestService;

    move-result-object v4

    .line 77
    new-instance v5, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;

    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;-><init>(Landroid/content/Context;)V

    .line 78
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "weibo_sdk_refresh_token_done"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 79
    const-string v0, "email"

    const-string v1, "liwei31@staff.weibo.com"

    invoke-virtual {v5, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, "password"

    const-string v1, "8eVZQVioD11DiZoZ5saqmttJJfqgHBockRY4GBXsbfc"

    invoke-virtual {v5, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setNeedIntercept(Z)V

    .line 82
    if-nez v3, :cond_1

    .line 83
    const-string v0, "https://ug.edm.weibo.cn/api/gettoken"

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setShortUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 85
    :cond_1
    const-string v0, "weibo_sdk_token_key_done"

    const/4 v1, 0x0

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    .line 86
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getHeader()Landroid/os/Bundle;

    move-result-object v7

    .line 87
    const-string v0, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bearer {"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "https://ug.edm.weibo.cn/api/refreshtoken"

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setShortUrl(Ljava/lang/String;)V

    .line 90
    :goto_1
    sget-object v0, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->POST:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setRequestType(Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;)V

    .line 92
    :try_start_1
    invoke-virtual {v5}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->build()Lcom/sina/weibo/sdk/network/impl/RequestParam;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/sina/weibo/sdk/network/IRequestService;->request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/RequestResult;

    move-result-object v7

    .line 93
    invoke-virtual {v7}, Lcom/sina/weibo/sdk/network/base/RequestResult;->getResponse()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 94
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 95
    const-string v0, "status"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 96
    const-string v0, "1"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    const-string v0, "data"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 98
    const-string v0, "expire"

    const-wide/16 v1, 0x0

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v12

    .line 99
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    sput-object v11, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    .line 101
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "weibo_sdk_token_key_done"

    sget-object v2, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 102
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "video_refresh_token_time_done"

    invoke-interface {v0, v1, v12, v13}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_2

    .line 104
    :cond_2
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/InterceptException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5237\u65b0token\u63a5\u53e3\u8bf7\u6c42\u5f02\u5e38 action = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/InterceptException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :goto_2
    goto :goto_3

    .line 107
    :cond_3
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/InterceptException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5237\u65b0token\u63a5\u53e3\u8bf7\u6c42\u5f02\u5e38 action = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/InterceptException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    :goto_3
    goto :goto_4

    .line 111
    :catch_1
    move-exception v7

    .line 112
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/InterceptException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5237\u65b0token\u63a5\u53e3\u8bf7\u6c42\u5f02\u5e38 action = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  error = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/InterceptException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method public needIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 9

    .line 32
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://ug.edm.weibo.cn/api/gettoken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://ug.edm.weibo.cn/api/refreshtoken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_1
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    .line 36
    const/4 v0, 0x1

    return v0

    .line 38
    :cond_2
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "weibo_sdk_refresh_token_done"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 39
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 42
    const-string v0, "weibo_sdk_token_key_done"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    .line 44
    :cond_3
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 45
    const-string v0, "refresh_action"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/sina/weibo/sdk/network/IRequestParam;->addInterceptResult(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x1

    return v0

    .line 49
    :cond_4
    const-string v0, "video_refresh_token_time_done"

    const-wide/16 v1, 0x0

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 51
    const-wide/32 v0, 0x127500

    add-long/2addr v0, v7

    cmp-long v0, v5, v0

    if-gtz v0, :cond_5

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-nez v0, :cond_6

    .line 53
    :cond_5
    const-string v0, "refresh_action"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/sina/weibo/sdk/network/IRequestParam;->addInterceptResult(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_6
    const-wide/32 v0, 0x93a80

    add-long/2addr v0, v7

    cmp-long v0, v5, v0

    if-lez v0, :cond_7

    const-wide/32 v0, 0x127500

    add-long/2addr v0, v7

    cmp-long v0, v5, v0

    if-gez v0, :cond_7

    .line 57
    const-string v0, "refresh_action"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/sina/weibo/sdk/network/IRequestParam;->addInterceptResult(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_7
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getHeader()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "Authorization"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bearer {"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/sina/weibo/sdk/network/intercept/RequestTokenInterception;->token:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const/4 v0, 0x0

    return v0
.end method
