.class public Lcom/shopkick/sdk/core/EventLogger;
.super Ljava/lang/Object;
.source "EventLogger.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final MAX_QUEUE_SIZE_FOR_FAILURE_RETRY:I = 0x3e8

.field private static final TAG:Ljava/lang/String;

.field private static volatile instance:Lcom/shopkick/sdk/core/EventLogger;

.field private static final instanceLock:Ljava/lang/Object;


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final logID:Ljava/util/concurrent/atomic/AtomicLong;

.field private final queue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;",
            ">;"
        }
    .end annotation
.end field

.field private serverFlags:Lcom/shopkick/sdk/core/ServerFlags;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/core/EventLogger;->instanceLock:Ljava/lang/Object;

    .line 59
    const-class v0, Lcom/shopkick/sdk/core/EventLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/shopkick/sdk/core/EventLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    .line 70
    iput-object p2, p0, Lcom/shopkick/sdk/core/EventLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 71
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/shopkick/sdk/core/EventLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    .line 72
    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/sdk/core/EventLogger;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 55
    sget-object v0, Lcom/shopkick/sdk/core/EventLogger;->instance:Lcom/shopkick/sdk/core/EventLogger;

    return-object v0
.end method

.method public static getInstance(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/sdk/core/ServerFlags;)Lcom/shopkick/sdk/core/EventLogger;
    .locals 2

    .line 37
    sget-object v0, Lcom/shopkick/sdk/core/EventLogger;->instance:Lcom/shopkick/sdk/core/EventLogger;

    if-nez v0, :cond_1

    .line 38
    sget-object v0, Lcom/shopkick/sdk/core/EventLogger;->instanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 39
    :try_start_0
    sget-object v1, Lcom/shopkick/sdk/core/EventLogger;->instance:Lcom/shopkick/sdk/core/EventLogger;

    if-nez v1, :cond_0

    .line 40
    new-instance v1, Lcom/shopkick/sdk/core/EventLogger;

    invoke-direct {v1, p1, p0}, Lcom/shopkick/sdk/core/EventLogger;-><init>(Lcom/shopkick/sdk/core/ServerFlags;Lcom/shopkick/fetchers/api/APIManager;)V

    sput-object v1, Lcom/shopkick/sdk/core/EventLogger;->instance:Lcom/shopkick/sdk/core/EventLogger;

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

    .line 44
    :cond_1
    :goto_0
    sget-object p0, Lcom/shopkick/sdk/core/EventLogger;->instance:Lcom/shopkick/sdk/core/EventLogger;

    return-object p0
.end method

.method private logDetailedEvent(IJLcom/shopkick/sdk/scanner/ShopBeaconInfo;Lcom/shopkick/sdk/zone/ble/Proximity;)V
    .locals 1

    .line 102
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;-><init>()V

    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventType:Ljava/lang/Integer;

    .line 104
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventTimestamp:Ljava/lang/Long;

    .line 105
    new-instance p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-direct {p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;-><init>()V

    .line 106
    invoke-virtual {p4}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getDeviceId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->btleId:Ljava/lang/Integer;

    .line 107
    invoke-virtual {p4}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inBackground()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->isForeground:Ljava/lang/Boolean;

    .line 108
    invoke-virtual {p5}, Lcom/shopkick/sdk/zone/ble/Proximity;->getValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->proximityLevel:Ljava/lang/Integer;

    .line 109
    invoke-virtual {p4, p5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getDwellTimeForProximity(Lcom/shopkick/sdk/zone/ble/Proximity;)J

    move-result-wide p2

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->dwellTime:Ljava/lang/Integer;

    .line 110
    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    .line 111
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/core/EventLogger;->logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;)V

    return-void
.end method

.method private logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;)V
    .locals 8

    .line 126
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s Queuing %2$s"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    aput-object p1, v5, v6

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 128
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s Event queued"

    new-array v3, v6, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v5, v3, v7

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 130
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s Event queue failed"

    new-array v3, v6, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v5, v3, v7

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_0
    iget-object p1, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result p1

    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-virtual {v0}, Lcom/shopkick/sdk/core/ServerFlags;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->loggingQueueLimit:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 133
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "%1$s queue full"

    new-array v3, v6, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v5, v3, v7

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I

    .line 136
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/core/EventLogger;->sendEventRequest(Ljava/util/ArrayList;)V

    const-string v0, "Log full. Uploading events. "

    move-object v1, v0

    move v0, v7

    .line 140
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 143
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "%1$s %2$s"

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v5, v4, v7

    aput-object v1, v4, v6

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private sendEventRequest(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;",
            ">;)V"
        }
    .end annotation

    .line 148
    iget-object v1, p0, Lcom/shopkick/sdk/core/EventLogger;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    invoke-virtual {v1}, Lcom/shopkick/sdk/core/ServerFlags;->shouldUseNewAuth()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 149
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;-><init>()V

    .line 150
    iget-object v1, p0, Lcom/shopkick/sdk/core/EventLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;->logId:Ljava/lang/Long;

    .line 151
    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;->beaconEventInfoList:Ljava/util/ArrayList;

    .line 152
    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v4, 0x0

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, p0

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 155
    :cond_0
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;-><init>()V

    .line 156
    iget-object v1, p0, Lcom/shopkick/sdk/core/EventLogger;->logID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;->logId:Ljava/lang/Long;

    .line 157
    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;->beaconEventInfoList:Ljava/util/ArrayList;

    .line 158
    iget-object v0, p0, Lcom/shopkick/sdk/core/EventLogger;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

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
    .locals 9

    .line 169
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s Response code: %2$d"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez v0, :cond_1

    .line 171
    instance-of v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;

    const/16 v1, 0x3e8

    if-eqz v0, :cond_0

    .line 172
    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;

    .line 173
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "%1$s %2$s"

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v6, v4, v7

    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    aput-object p2, v4, v8

    invoke-virtual {v0, v2, v3, v5, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;->beaconEventInfoList:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p2, v1, :cond_1

    .line 178
    iget-object p2, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequestV2;->beaconEventInfoList:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 180
    :cond_0
    instance-of v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;

    if-eqz v0, :cond_1

    .line 181
    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;

    .line 182
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "%1$s %2$s"

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    aput-object v6, v4, v7

    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    aput-object p2, v4, v8

    invoke-virtual {v0, v2, v3, v5, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;->beaconEventInfoList:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p2, v1, :cond_1

    .line 187
    iget-object p2, p0, Lcom/shopkick/sdk/core/EventLogger;->queue:Ljava/util/concurrent/BlockingQueue;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$LogBeaconEventRequest;->beaconEventInfoList:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public logBasicEvent(ILcom/shopkick/sdk/scanner/ShopBeaconInfo;J)V
    .locals 7

    .line 76
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s logBasicEvent: %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 77
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;-><init>()V

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventType:Ljava/lang/Integer;

    .line 79
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventTimestamp:Ljava/lang/Long;

    .line 80
    new-instance p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-direct {p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;-><init>()V

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    .line 81
    iget-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    iget p3, p2, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->btleId:Ljava/lang/Integer;

    .line 82
    iget-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-virtual {p2}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getProximity()Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ble/Proximity;->getValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->proximityLevel:Ljava/lang/Integer;

    .line 83
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/core/EventLogger;->logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;)V

    return-void
.end method

.method public logDetailedEvent(IJLcom/shopkick/sdk/scanner/ShopBeaconInfo;)V
    .locals 13

    .line 97
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s logDetailedEvent: %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-virtual/range {p4 .. p4}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getProximity()Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object v12

    move-object v7, p0

    move v8, p1

    move-wide v9, p2

    move-object/from16 v11, p4

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/core/EventLogger;->logDetailedEvent(IJLcom/shopkick/sdk/scanner/ShopBeaconInfo;Lcom/shopkick/sdk/zone/ble/Proximity;)V

    return-void
.end method

.method public logEvent(IILcom/shopkick/sdk/zone/ble/Proximity;J)V
    .locals 7

    .line 87
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "%1$s logBasicEvent: %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Lcom/shopkick/sdk/core/EventLogger;->TAG:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    new-instance v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;

    invoke-direct {v0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;-><init>()V

    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventType:Ljava/lang/Integer;

    .line 90
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->eventTimestamp:Ljava/lang/Long;

    .line 91
    new-instance p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-direct {p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;-><init>()V

    iput-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    .line 92
    iget-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->btleId:Ljava/lang/Integer;

    .line 93
    iget-object p1, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;->discoveryInfo:Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;

    invoke-virtual {p3}, Lcom/shopkick/sdk/zone/ble/Proximity;->getValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDiscoveryInfo;->proximityLevel:Ljava/lang/Integer;

    .line 94
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/core/EventLogger;->logRequest(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconEventInfo;)V

    return-void
.end method

.method public logExpiredEvent(JLcom/shopkick/sdk/scanner/ShopBeaconInfo;)V
    .locals 9

    .line 115
    invoke-static {}, Lcom/shopkick/sdk/zone/ble/Proximity;->values()[Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v8, v0, v2

    .line 116
    sget-object v3, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    if-eq v8, v3, :cond_2

    sget-object v3, Lcom/shopkick/sdk/zone/ble/Proximity;->Unknown:Lcom/shopkick/sdk/zone/ble/Proximity;

    if-ne v8, v3, :cond_0

    goto :goto_1

    .line 118
    :cond_0
    invoke-virtual {p3, v8}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getDwellTimeForProximity(Lcom/shopkick/sdk/zone/ble/Proximity;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    move-object v3, p0

    move-wide v5, p1

    move-object v7, p3

    .line 121
    invoke-direct/range {v3 .. v8}, Lcom/shopkick/sdk/core/EventLogger;->logDetailedEvent(IJLcom/shopkick/sdk/scanner/ShopBeaconInfo;Lcom/shopkick/sdk/zone/ble/Proximity;)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
