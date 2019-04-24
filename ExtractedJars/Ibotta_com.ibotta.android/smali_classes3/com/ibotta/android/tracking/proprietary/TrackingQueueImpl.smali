.class public Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;
.super Ljava/lang/Object;
.source "TrackingQueueImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;
    }
.end annotation


# static fields
.field private static final DEBUG_FLUSH_THRESHOLD:I = 0x1

.field private static final DEBUG_IDLE_SECONDS:J = 0x1L

.field private static final FLUSH_THRESHOLD:I = 0x14

.field private static final IDLE_SECONDS:J = 0x1eL

.field private static final STOP_SENDER_THRESHOLD:I = 0x3


# instance fields
.field private final appContext:Landroid/content/Context;

.field private emptyEventQueueCount:I

.field private final isDebugTmonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

.field private final isDebugTrackingQueue:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

.field private final isIbottaV1TrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

.field private final maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

.field private final maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

.field private final maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

.field private final queue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final queueLock:Ljava/util/concurrent/locks/Lock;

.field private sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

.field private final tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

.field private final v1TrackingClient:Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

.field private final waitCondition:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/DebugTrackingSupplier;Lcom/ibotta/android/tracking/DebugTrackingSupplier;Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->waitCondition:Ljava/util/concurrent/locks/Condition;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queue:Ljava/util/List;

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTrackingQueue:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    .line 57
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTmonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    .line 58
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->appContext:Landroid/content/Context;

    .line 59
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 60
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->v1TrackingClient:Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    .line 61
    iput-object p6, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isIbottaV1TrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    .line 62
    iput-object p7, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

    .line 63
    iput-object p8, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

    .line 64
    iput-object p9, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)J
    .locals 2

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->getIdleSeconds()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$300(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Condition;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->waitCondition:Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/List;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queue:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->onEventsSent()V

    return-void
.end method

.method static synthetic access$600(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->onNoEventsSent()V

    return-void
.end method

.method static synthetic access$700(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Landroid/content/Context;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->appContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$800(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-object p0
.end method

.method static synthetic access$900(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

    return-object p0
.end method

.method private getFlushThreshold()J
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTrackingQueue:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTmonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x14

    :goto_0
    return-wide v0
.end method

.method private getIdleSeconds()J
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTrackingQueue:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isDebugTmonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1e

    :goto_0
    return-wide v0
.end method

.method private mapEventToV1Tracking(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 4

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->isIbottaV1TrackingEnabledSupplier:Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/IsTrackingEnabledSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 77
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->startSender()V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queue:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queue:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-long v0, p1

    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->getFlushThreshold()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private mapEventToV2Tracking(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 7

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->v1TrackingClient:Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->v1TrackingClient:Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getEventContext()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->getParams()Ljava/util/Map;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/tracking/proprietary/V1TrackingClient;->logEvent(Ljava/lang/String;JILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method private onEventsSent()V
    .locals 3

    const-string v0, "onEventsSent"

    const/4 v1, 0x0

    .line 105
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iput v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    return-void
.end method

.method private onNoEventsSent()V
    .locals 3

    const-string v0, "onNoEventsSent"

    const/4 v1, 0x0

    .line 110
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    .line 114
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    const/4 v2, 0x3

    if-lt v0, v2, :cond_0

    .line 115
    iput v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->emptyEventQueueCount:I

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->stopSender()V

    :cond_0
    return-void
.end method

.method private startSender()V
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 123
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    const-string v0, "startSender"

    const/4 v1, 0x0

    .line 127
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;-><init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$1;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    .line 130
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    const-string v2, "Tracking Queue Sender"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private stopSender()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    if-nez v0, :cond_0

    return-void

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    const-string v0, "stopSender"

    const/4 v1, 0x0

    .line 143
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->stop()V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->sender:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;

    return-void

    :catchall_0
    move-exception v0

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->queueLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->mapEventToV1Tracking(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->mapEventToV2Tracking(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public stop()V
    .locals 2

    const-string v0, "stop"

    const/4 v1, 0x0

    .line 100
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->stopSender()V

    return-void
.end method
