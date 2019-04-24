.class public Lcom/shopkick/sdk/analytics/AnalyticsLogger;
.super Ljava/lang/Object;
.source "AnalyticsLogger.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final MAX_QUEUE_SIZE_FOR_FAILURE_RETRY:I = 0x3e8

.field private static final TAG:Ljava/lang/String;

.field private static volatile instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

.field private static final instanceLock:Ljava/lang/Object;


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final logID:Ljava/util/concurrent/atomic/AtomicLong;

.field private final queue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final serverFlags:Lcom/shopkick/sdk/core/ServerFlags;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instanceLock:Ljava/lang/Object;

    .line 59
    const-class v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p2, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 70
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p2, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    iput-object p1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    .line 72
    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/analytics/AnalyticsLogger;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 56
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    return-object v0
.end method

.method public static getInstance(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/sdk/analytics/AnalyticsLogger;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    if-nez v0, :cond_1

    .line 39
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 40
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    if-nez v1, :cond_0

    .line 41
    new-instance v1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;-><init>(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)V

    sput-object v1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    .line 43
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 45
    :cond_1
    :goto_0
    sget-object p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->instance:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    return-object p0
.end method

.method private logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;)V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 107
    sget-object p1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    const-string v0, "Event queued"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 109
    :cond_0
    sget-object p1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    const-string v0, "Event queue failed"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result p1

    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-virtual {v0}, Lcom/shopkick/sdk/core/ServerFlags;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->loggingQueueLimit:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 112
    sget-object p1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    const-string v0, "queue full"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I

    .line 115
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->sendEventRequest(Ljava/util/ArrayList;)V

    const-string v0, "Log full. Uploading events. "

    const/4 v1, 0x0

    .line 119
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->eventType:Ljava/lang/Integer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 122
    :cond_1
    sget-object p1, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method private sendEventRequest(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;",
            ">;)V"
        }
    .end annotation

    .line 127
    iget-object v1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-virtual {v1}, Lcom/shopkick/sdk/core/ServerFlags;->shouldUseNewAuth()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 128
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;-><init>()V

    .line 129
    iget-object v1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;->logId:Ljava/lang/Long;

    .line 130
    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;->geofenceEventInfoList:Ljava/util/ArrayList;

    .line 131
    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v4, 0x0

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, p0

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 134
    :cond_0
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;-><init>()V

    .line 135
    iget-object v1, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;->logId:Ljava/lang/Long;

    .line 136
    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;->geofenceEventInfoList:Ljava/util/ArrayList;

    .line 137
    iget-object v0, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v4, 0x0

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, p0

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :goto_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 149
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez v0, :cond_1

    .line 151
    instance-of v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;

    const/16 v1, 0x3e8

    if-eqz v0, :cond_0

    .line 152
    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;

    .line 153
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    iget-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;->geofenceEventInfoList:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p2, v1, :cond_1

    .line 158
    iget-object p2, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequestV2;->geofenceEventInfoList:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 160
    :cond_0
    instance-of v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;

    if-eqz v0, :cond_1

    .line 161
    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;

    .line 162
    sget-object v0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    iget-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;->geofenceEventInfoList:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p2, v1, :cond_1

    .line 167
    iget-object p2, p0, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogGeofenceEventRequest;->geofenceEventInfoList:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public logBasicEvent(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 78
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;-><init>()V

    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->eventType:Ljava/lang/Integer;

    .line 80
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->eventTimestamp:Ljava/lang/Long;

    .line 81
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->isForeground:Ljava/lang/Boolean;

    .line 82
    iput-object p5, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->chainId:Ljava/lang/String;

    .line 83
    iput-object p6, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->storeId:Ljava/lang/String;

    .line 84
    iput-object p7, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->campaignId:Ljava/lang/String;

    .line 85
    iput-object p8, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->messageId:Ljava/lang/String;

    .line 86
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;)V

    return-void
.end method

.method public logDwelledEvent(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 92
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;-><init>()V

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->eventType:Ljava/lang/Integer;

    .line 94
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->eventTimestamp:Ljava/lang/Long;

    .line 95
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->isForeground:Ljava/lang/Boolean;

    .line 96
    iput-object p5, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->chainId:Ljava/lang/String;

    .line 97
    iput-object p6, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->storeId:Ljava/lang/String;

    .line 98
    iput-object p7, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->campaignId:Ljava/lang/String;

    .line 99
    iput-object p8, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->messageId:Ljava/lang/String;

    const-wide/16 p1, 0x3e8

    .line 100
    div-long/2addr p9, p1

    invoke-static {p9, p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;->dwellTimeSeconds:Ljava/lang/Long;

    .line 101
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$GeofenceEventInfo;)V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
