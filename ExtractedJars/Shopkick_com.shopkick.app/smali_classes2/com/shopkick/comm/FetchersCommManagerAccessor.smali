.class public final Lcom/shopkick/comm/FetchersCommManagerAccessor;
.super Ljava/lang/Object;
.source "FetchersCommManagerAccessor.java"


# static fields
.field private static volatile Instance:Lnet/toddm/comm/CommManager;

.field private static final InstanceLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lnet/toddm/comm/CommManager;
    .locals 2

    .line 47
    sget-object v0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->Instance:Lnet/toddm/comm/CommManager;

    if-eqz v0, :cond_0

    .line 50
    sget-object v0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->Instance:Lnet/toddm/comm/CommManager;

    return-object v0

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "must call initialize() before calling getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;Lnet/toddm/comm/RetryPolicyProvider;)V
    .locals 3

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    .line 26
    sget-object v0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->Instance:Lnet/toddm/comm/CommManager;

    if-nez v0, :cond_1

    .line 27
    sget-object v0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 28
    :try_start_0
    sget-object v1, Lcom/shopkick/comm/FetchersCommManagerAccessor;->Instance:Lnet/toddm/comm/CommManager;

    if-nez v1, :cond_0

    .line 31
    new-instance v1, Lcom/shopkick/comm/FetchersCommCacheProvider;

    invoke-direct {v1, p0}, Lcom/shopkick/comm/FetchersCommCacheProvider;-><init>(Landroid/content/Context;)V

    .line 34
    new-instance p0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {p0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "FetchersCommManager"

    .line 35
    invoke-virtual {p0, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object p0

    .line 36
    invoke-virtual {p0, p1}, Lnet/toddm/comm/CommManager$Builder;->setRetryPolicyProvider(Lnet/toddm/comm/RetryPolicyProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object p0

    .line 37
    invoke-virtual {p0, v1}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object p0

    .line 38
    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object p0

    new-instance p1, Lcom/shopkick/comm/FetchersCommConfigurationProvider;

    invoke-direct {p1}, Lcom/shopkick/comm/FetchersCommConfigurationProvider;-><init>()V

    .line 39
    invoke-virtual {p0, p1}, Lnet/toddm/comm/CommManager$Builder;->setConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object p0

    .line 40
    invoke-virtual {p0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object p0

    sput-object p0, Lcom/shopkick/comm/FetchersCommManagerAccessor;->Instance:Lnet/toddm/comm/CommManager;

    .line 42
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 25
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'retryPolicyProvider\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 24
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
