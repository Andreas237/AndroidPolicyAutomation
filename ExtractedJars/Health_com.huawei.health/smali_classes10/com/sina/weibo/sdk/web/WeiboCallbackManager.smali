.class public Lcom/sina/weibo/sdk/web/WeiboCallbackManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sInstance:Lcom/sina/weibo/sdk/web/WeiboCallbackManager;


# instance fields
.field private mWeiboAuthListenerMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/sina/weibo/sdk/auth/WbAuthListener;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->mWeiboAuthListenerMap:Ljava/util/Map;

    .line 16
    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/sina/weibo/sdk/web/WeiboCallbackManager;
    .locals 3

    const-class v1, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;

    monitor-enter v1

    .line 19
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->sInstance:Lcom/sina/weibo/sdk/web/WeiboCallbackManager;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->sInstance:Lcom/sina/weibo/sdk/web/WeiboCallbackManager;

    .line 22
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->sInstance:Lcom/sina/weibo/sdk/web/WeiboCallbackManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public genCallbackKey()Ljava/lang/String;
    .locals 2

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized getWeiboAuthListener(Ljava/lang/String;)Lcom/sina/weibo/sdk/auth/WbAuthListener;
    .locals 1

    monitor-enter p0

    .line 26
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->mWeiboAuthListenerMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sina/weibo/sdk/auth/WbAuthListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized removeWeiboAuthListener(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 40
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    monitor-exit p0

    return-void

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->mWeiboAuthListenerMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setWeiboAuthListener(Ljava/lang/String;Lcom/sina/weibo/sdk/auth/WbAuthListener;)V
    .locals 1

    monitor-enter p0

    .line 33
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    .line 34
    :cond_0
    monitor-exit p0

    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->mWeiboAuthListenerMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
