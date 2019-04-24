.class public Lcom/newrelic/agent/android/harvest/ActivityTraces;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "ActivityTraces.java"


# instance fields
.field private final activityTraces:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/tracing/ActivityTrace;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public declared-synchronized add(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 1

    monitor-enter p0

    .line 28
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 18
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 20
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/tracing/ActivityTrace;

    .line 21
    invoke-virtual {v2}, Lcom/newrelic/agent/android/tracing/ActivityTrace;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public clear()V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public count()I
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public getActivityTraces()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/tracing/ActivityTrace;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    return-object v0
.end method

.method public declared-synchronized remove(Lcom/newrelic/agent/android/tracing/ActivityTrace;)V
    .locals 1

    monitor-enter p0

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ActivityTraces;->activityTraces:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
