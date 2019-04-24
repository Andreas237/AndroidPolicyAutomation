.class Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;
.super Ljava/lang/Object;
.source "StreamCompleteListenerManager.java"


# instance fields
.field private streamComplete:Z

.field private streamCompleteListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamComplete:Z

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    return-void
.end method

.method private checkComplete()Z
    .locals 2

    .line 47
    monitor-enter p0

    .line 48
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 49
    iput-boolean v1, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamComplete:Z

    .line 50
    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private getStreamCompleteListeners()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 57
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 59
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 19
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isComplete()Z
    .locals 1

    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    iget-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamComplete:Z

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public notifyStreamComplete(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->checkComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->getStreamCompleteListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;

    .line 32
    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;->streamComplete(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public notifyStreamError(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->checkComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->getStreamCompleteListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;

    .line 40
    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;->streamError(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->streamCompleteListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
