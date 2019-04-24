.class public Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;
.super Landroidx/work/Worker;
.source "IbottaTrackingFlushWorker.java"


# instance fields
.field private appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation
.end field

.field private trackingApiClient:Lcom/ibotta/android/tracking/network/TrackingApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 32
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;)V

    return-void
.end method

.method private ibottaTrackingIsEnabled()Z
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 77
    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getOpsKillSwitchConfig()Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->getKillSwitches()Ljava/util/Map;

    move-result-object v0

    const-string v1, "ibotta_tracking"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public doWork()Landroidx/work/ListenableWorker$Result;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->ibottaTrackingIsEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Ibotta Tracking disabled via killswitch, exiting"

    .line 49
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    sget-object v0, Landroidx/work/ListenableWorker$Result;->SUCCESS:Landroidx/work/ListenableWorker$Result;

    return-object v0

    :cond_0
    const-string v0, "Beginning Ibotta Tracking flush procedure"

    .line 53
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;->getEntriesForFlush()Landroid/util/Pair;

    move-result-object v0

    .line 59
    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "No events to send, exiting"

    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    sget-object v0, Landroidx/work/ListenableWorker$Result;->SUCCESS:Landroidx/work/ListenableWorker$Result;

    return-object v0

    .line 65
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->trackingApiClient:Lcom/ibotta/android/tracking/network/TrackingApiClient;

    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v2, v3}, Lcom/ibotta/android/tracking/network/TrackingApiClient;->sendTrackingEvents(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Landroidx/work/ListenableWorker$Result;->SUCCESS:Landroidx/work/ListenableWorker$Result;

    goto :goto_0

    :cond_2
    sget-object v2, Landroidx/work/ListenableWorker$Result;->FAILURE:Landroidx/work/ListenableWorker$Result;

    .line 67
    :goto_0
    sget-object v3, Landroidx/work/ListenableWorker$Result;->SUCCESS:Landroidx/work/ListenableWorker$Result;

    if-ne v2, v3, :cond_3

    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Successfully flushed "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " tracking entries to server"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingFlushCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingFlushCallback;->accept(Ljava/lang/Object;)V

    :cond_3
    return-object v2
.end method

.method public init(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;Lcom/ibotta/android/tracking/network/TrackingApiClient;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->ibottaTrackingQueue:Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/tracking/IbottaTrackingFlushWorker;->trackingApiClient:Lcom/ibotta/android/tracking/network/TrackingApiClient;

    return-void
.end method
