.class public Lcom/mopub/common/event/MoPubEvents;
.super Ljava/lang/Object;
.source "MoPubEvents.java"


# static fields
.field private static volatile sEventDispatcher:Lcom/mopub/common/event/EventDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getDispatcher()Lcom/mopub/common/event/EventDispatcher;
    .locals 5
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 40
    sget-object v0, Lcom/mopub/common/event/MoPubEvents;->sEventDispatcher:Lcom/mopub/common/event/EventDispatcher;

    if-nez v0, :cond_1

    .line 42
    const-class v1, Lcom/mopub/common/event/MoPubEvents;

    monitor-enter v1

    .line 43
    :try_start_0
    sget-object v0, Lcom/mopub/common/event/MoPubEvents;->sEventDispatcher:Lcom/mopub/common/event/EventDispatcher;

    if-nez v0, :cond_0

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    new-instance v2, Landroid/os/HandlerThread;

    const-string v3, "mopub_event_logging"

    invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 48
    new-instance v3, Lcom/mopub/common/event/ScribeEventRecorder;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/mopub/common/event/ScribeEventRecorder;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v3, Lcom/mopub/common/event/EventDispatcher;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v3, v0, v2}, Lcom/mopub/common/event/EventDispatcher;-><init>(Ljava/lang/Iterable;Landroid/os/Looper;)V

    sput-object v3, Lcom/mopub/common/event/MoPubEvents;->sEventDispatcher:Lcom/mopub/common/event/EventDispatcher;

    move-object v0, v3

    .line 51
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static log(Lcom/mopub/common/event/BaseEvent;)V
    .locals 1

    .line 21
    invoke-static {}, Lcom/mopub/common/event/MoPubEvents;->getDispatcher()Lcom/mopub/common/event/EventDispatcher;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mopub/common/event/EventDispatcher;->dispatch(Lcom/mopub/common/event/BaseEvent;)V

    return-void
.end method

.method public static setEventDispatcher(Lcom/mopub/common/event/EventDispatcher;)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 26
    sput-object p0, Lcom/mopub/common/event/MoPubEvents;->sEventDispatcher:Lcom/mopub/common/event/EventDispatcher;

    return-void
.end method
