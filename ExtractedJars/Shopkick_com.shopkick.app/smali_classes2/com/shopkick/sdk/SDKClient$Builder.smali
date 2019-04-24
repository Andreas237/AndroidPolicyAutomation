.class public final Lcom/shopkick/sdk/SDKClient$Builder;
.super Ljava/lang/Object;
.source "SDKClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/SDKClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private final context:Landroid/content/Context;

.field private sdkConfigurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 73
    iput-object p1, p0, Lcom/shopkick/sdk/SDKClient$Builder;->context:Landroid/content/Context;

    .line 74
    iput-object p2, p0, Lcom/shopkick/sdk/SDKClient$Builder;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 75
    iput-object p3, p0, Lcom/shopkick/sdk/SDKClient$Builder;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 78
    new-instance p1, Lcom/shopkick/sdk/SDKClient$Builder$1;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/SDKClient$Builder$1;-><init>(Lcom/shopkick/sdk/SDKClient$Builder;)V

    iput-object p1, p0, Lcom/shopkick/sdk/SDKClient$Builder;->sdkConfigurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'apiManager\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'appStateProvider\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 67
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'context\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public build()Lcom/shopkick/sdk/SDKClient;
    .locals 7

    .line 131
    new-instance v6, Lcom/shopkick/sdk/SDKClient;

    iget-object v1, p0, Lcom/shopkick/sdk/SDKClient$Builder;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/sdk/SDKClient$Builder;->appStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    iget-object v3, p0, Lcom/shopkick/sdk/SDKClient$Builder;->sdkConfigurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    iget-object v4, p0, Lcom/shopkick/sdk/SDKClient$Builder;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/SDKClient;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/SDKClient$1;)V

    return-object v6
.end method

.method public setConfigurationProvider(Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/SDKClient$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 120
    iput-object p1, p0, Lcom/shopkick/sdk/SDKClient$Builder;->sdkConfigurationProvider:Lcom/shopkick/sdk/core/ConfigurationProvider;

    return-object p0

    .line 117
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'sdkConfigurationProvider\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
