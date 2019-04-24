.class public Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;
.super Ljava/lang/Object;
.source "SwitchableTMonitorClient.java"

# interfaces
.implements Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# instance fields
.field private activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

.field private final isDebugInternalTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

.field private final isDebugTMonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

.field private final noOpTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

.field private final realTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/DebugTrackingSupplier;Lcom/ibotta/android/tracking/DebugTrackingSupplier;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->realTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->noOpTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->isDebugInternalTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->isDebugTMonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    return-void
.end method

.method private ensureActiveTMonitorClient()V
    .locals 4

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->isDebugInternalTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->isDebugTMonitorClientOn:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->realTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->noOpTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 69
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    if-eq v0, v1, :cond_4

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->realTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const-string v1, "Switching to real TMonitorClient..."

    .line 71
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const-string v1, "Switching to No-Op TMonitorClient..."

    .line 73
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    if-eqz v1, :cond_2

    .line 77
    invoke-interface {v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->stop()V

    .line 80
    :cond_2
    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->start()V

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->realTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    if-ne v0, v1, :cond_3

    const-string v0, "Switched to real TMonitorClient."

    .line 84
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const-string v0, "Switched to No-Op TMonitorClient."

    .line 86
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->ensureActiveTMonitorClient()V

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public notify(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->ensureActiveTMonitorClient()V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->notify(Ljava/util/List;)V

    return-void
.end method

.method public start()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->ensureActiveTMonitorClient()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->stop()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/ibotta/android/tracking/tmonitor/SwitchableTMonitorClient;->activeTMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    :cond_0
    return-void
.end method
