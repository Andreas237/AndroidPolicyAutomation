.class public Lcom/shopkick/sdk/core/ServerFlags;
.super Ljava/lang/Object;
.source "ServerFlags.java"

# interfaces
.implements Lcom/shopkick/sdk/core/ConfigurationProvider;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final TAG:Ljava/lang/String; = "ServerFlags"


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final mainHandler:Landroid/os/Handler;

.field private serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final useNewAuth:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Z)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/shopkick/sdk/core/ServerFlags;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 41
    iput-boolean p2, p0, Lcom/shopkick/sdk/core/ServerFlags;->useNewAuth:Z

    .line 42
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/shopkick/sdk/core/ServerFlags;->mainHandler:Landroid/os/Handler;

    .line 43
    invoke-direct {p0}, Lcom/shopkick/sdk/core/ServerFlags;->getCachedServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/core/ServerFlags;->serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    .line 44
    invoke-direct {p0}, Lcom/shopkick/sdk/core/ServerFlags;->fetchServerFlags()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/core/ServerFlags;)Z
    .locals 0

    .line 29
    iget-boolean p0, p0, Lcom/shopkick/sdk/core/ServerFlags;->useNewAuth:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/shopkick/sdk/core/ServerFlags;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method private fetchServerFlags()V
    .locals 4

    .line 86
    iget-object v0, p0, Lcom/shopkick/sdk/core/ServerFlags;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/sdk/core/ServerFlags$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/core/ServerFlags$1;-><init>(Lcom/shopkick/sdk/core/ServerFlags;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private getCachedServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 10

    .line 48
    iget-boolean v0, p0, Lcom/shopkick/sdk/core/ServerFlags;->useNewAuth:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 49
    iget-object v3, p0, Lcom/shopkick/sdk/core/ServerFlags;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    new-instance v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequestV2;

    invoke-direct {v5}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequestV2;-><init>()V

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 57
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v3, :cond_0

    .line 58
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s Using cached version of ServerFlags"

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v7, Lcom/shopkick/sdk/core/ServerFlags;->TAG:Ljava/lang/String;

    aput-object v7, v2, v1

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;

    .line 60
    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;->flags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    return-object v0

    .line 62
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s Using defaults for ServerFlags"

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/ServerFlags;->TAG:Ljava/lang/String;

    aput-object v6, v2, v1

    invoke-virtual {v0, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 63
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;-><init>()V

    return-object v0

    .line 66
    :cond_1
    iget-object v3, p0, Lcom/shopkick/sdk/core/ServerFlags;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    new-instance v5, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequest;

    invoke-direct {v5}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsRequest;-><init>()V

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 73
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 74
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v3, :cond_2

    .line 75
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s Using cached version of ServerFlags"

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v7, Lcom/shopkick/sdk/core/ServerFlags;->TAG:Ljava/lang/String;

    aput-object v7, v2, v1

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-interface {v0}, Lcom/shopkick/fetchers/RequestDetails;->getDataResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;

    .line 77
    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;->flags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    return-object v0

    .line 79
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s Using defaults for ServerFlags"

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/ServerFlags;->TAG:Ljava/lang/String;

    aput-object v6, v2, v1

    invoke-virtual {v0, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 80
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;-><init>()V

    return-object v0
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 123
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 124
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;

    .line 125
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlagsResponse;->flags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    iput-object p1, p0, Lcom/shopkick/sdk/core/ServerFlags;->serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    :cond_0
    return-void
.end method

.method public getForcedLocation()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/shopkick/sdk/core/ServerFlags;->serverFlags:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    return-object v0
.end method

.method public isExperimentalBatteryImprovementEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInBackground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiEnabledInForeground()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWiFiScanningEnabledWithoutGeofencing()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public shouldUseNewAuth()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lcom/shopkick/sdk/core/ServerFlags;->useNewAuth:Z

    return v0
.end method
