.class public Lcom/shopkick/app/sdk/SDKClientAccessor;
.super Ljava/lang/Object;
.source "SDKClientAccessor.java"


# static fields
.field private static volatile Instance:Lcom/shopkick/sdk/SDKClient;

.field private static final InstanceLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/sdk/SDKClientAccessor;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/SDKClient;
    .locals 2

    .line 41
    sget-object v0, Lcom/shopkick/app/sdk/SDKClientAccessor;->Instance:Lcom/shopkick/sdk/SDKClient;

    if-eqz v0, :cond_0

    .line 44
    sget-object v0, Lcom/shopkick/app/sdk/SDKClientAccessor;->Instance:Lcom/shopkick/sdk/SDKClient;

    return-object v0

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "must call initialize() before calling getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
    .locals 2

    .line 24
    sget-object v0, Lcom/shopkick/app/sdk/SDKClientAccessor;->Instance:Lcom/shopkick/sdk/SDKClient;

    if-nez v0, :cond_2

    .line 25
    sget-object v0, Lcom/shopkick/app/sdk/SDKClientAccessor;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v1, Lcom/shopkick/app/sdk/SDKClientAccessor;->Instance:Lcom/shopkick/sdk/SDKClient;

    if-nez v1, :cond_1

    .line 27
    new-instance v1, Lcom/shopkick/sdk/SDKClient$Builder;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/sdk/SDKClient$Builder;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/fetchers/api/APIManager;)V

    if-eqz p3, :cond_0

    .line 29
    invoke-virtual {v1, p3}, Lcom/shopkick/sdk/SDKClient$Builder;->setConfigurationProvider(Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/SDKClient$Builder;

    .line 31
    :cond_0
    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient$Builder;->build()Lcom/shopkick/sdk/SDKClient;

    move-result-object p0

    sput-object p0, Lcom/shopkick/app/sdk/SDKClientAccessor;->Instance:Lcom/shopkick/sdk/SDKClient;

    .line 33
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method
