.class public Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/network/IRequestIntercept;


# static fields
.field public static aidInfo:Ljava/lang/String;

.field private static appKey:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getAidInfoFile(ILandroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 131
    invoke-virtual {p2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    .line 132
    new-instance v3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "weibo_sdk_aid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 133
    return-object v3
.end method

.method private static getTimestamp()Ljava/lang/String;
    .locals 6

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 98
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static setAppKey(Ljava/lang/String;)V
    .locals 0

    .line 33
    sput-object p0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->appKey:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public doIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/InterceptException;
        }
    .end annotation

    .line 37
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->loadAidFromCache(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    .line 40
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    :try_start_0
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->loadAidFromNet()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 44
    :catch_0
    move-exception v3

    .line 48
    :cond_1
    :goto_0
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/InterceptException;

    const-string v1, "aid get error"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/InterceptException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_2
    sget-object v0, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 52
    const-string v0, "aid"

    sget-object v1, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_3
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getUrl()Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://api.weibo.cn/2/sdk/login"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    .line 58
    :cond_4
    const/4 v4, 0x0

    .line 59
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->GET:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-ne v0, v1, :cond_5

    .line 60
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getGetBundle()Landroid/os/Bundle;

    move-result-object v4

    goto :goto_1

    .line 62
    :cond_5
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getPostBundle()Landroid/os/Bundle;

    move-result-object v4

    .line 64
    :goto_1
    const-string v5, ""

    .line 65
    const-string v0, "access_token"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 66
    const-string v0, "refresh_token"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 67
    const-string v0, "phone"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .line 69
    if-eqz v6, :cond_6

    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 71
    move-object v5, v6

    check-cast v5, Ljava/lang/String;

    goto :goto_2

    .line 73
    :cond_6
    if-eqz v7, :cond_7

    instance-of v0, v7, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 75
    move-object v5, v7

    check-cast v5, Ljava/lang/String;

    goto :goto_2

    .line 76
    :cond_7
    if-eqz v8, :cond_8

    instance-of v0, v8, Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 78
    move-object v5, v8

    check-cast v5, Ljava/lang/String;

    .line 81
    :cond_8
    :goto_2
    invoke-static {}, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->getTimestamp()Ljava/lang/String;

    move-result-object v9

    .line 82
    const-string v0, "oauth_timestamp"

    invoke-virtual {p2, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    sget-object v2, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->appKey:Ljava/lang/String;

    invoke-static {v0, v1, v5, v2, v9}, Lcom/sina/weibo/sdk/net/HttpManager;->getOauthSign(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 85
    const-string v0, "oauth_sign"

    invoke-virtual {p2, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "weiboSdk param"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->aidInfo:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->appKey:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->GET:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-ne v0, v1, :cond_9

    .line 89
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getGetBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "appKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_3

    .line 91
    :cond_9
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getPostBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "appKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 93
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public loadAidFromCache(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 102
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->loadAidInfoFromCache(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v1

    .line 103
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 104
    invoke-virtual {v1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 106
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method protected declared-synchronized loadAidInfoFromCache(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 8

    monitor-enter p0

    .line 111
    const/4 v1, 0x0

    .line 113
    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0, p1}, Lcom/sina/weibo/sdk/network/intercept/CommonParamInterception;->getAidInfoFile(ILandroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 114
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v1, v0

    .line 115
    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    move-result v0

    new-array v3, v0, [B

    .line 116
    invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 117
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->parseJson(Ljava/lang/String;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 120
    if-eqz v1, :cond_0

    .line 122
    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    goto :goto_0

    .line 123
    :catch_0
    move-exception v5

    .line 124
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v4

    .line 118
    :catch_1
    move-exception v2

    .line 120
    if-eqz v1, :cond_2

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    goto :goto_2

    .line 123
    :catch_2
    move-exception v2

    .line 124
    goto :goto_2

    .line 120
    :catchall_0
    move-exception v6

    if-eqz v1, :cond_1

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    goto :goto_1

    .line 123
    :catch_3
    move-exception v7

    .line 124
    :cond_1
    :goto_1
    :try_start_4
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    :cond_2
    :goto_2
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public needIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 1

    .line 29
    const/4 v0, 0x1

    return v0
.end method
