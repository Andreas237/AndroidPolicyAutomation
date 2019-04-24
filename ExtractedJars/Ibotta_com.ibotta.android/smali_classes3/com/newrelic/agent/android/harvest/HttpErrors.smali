.class public Lcom/newrelic/agent/android/harvest/HttpErrors;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "HttpErrors.java"


# instance fields
.field private final httpErrors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/harvest/HttpError;",
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
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public addHttpError(Lcom/newrelic/agent/android/harvest/HttpError;)V
    .locals 4

    .line 24
    monitor-enter p1

    .line 25
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/harvest/HttpError;

    .line 26
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HttpError;->getHash()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HttpError;->getHash()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 27
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HttpError;->incrementCount()V

    .line 28
    monitor-exit p1

    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 46
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 47
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/HttpError;

    .line 48
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/HttpError;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public clear()V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public count()I
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public getHttpErrors()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/harvest/HttpError;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    return-object v0
.end method

.method public declared-synchronized removeHttpError(Lcom/newrelic/agent/android/harvest/HttpError;)V
    .locals 1

    monitor-enter p0

    .line 37
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HttpErrors;->httpErrors:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
