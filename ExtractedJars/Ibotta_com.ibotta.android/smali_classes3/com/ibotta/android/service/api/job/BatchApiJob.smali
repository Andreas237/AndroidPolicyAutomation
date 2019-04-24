.class public Lcom/ibotta/android/service/api/job/BatchApiJob;
.super Lcom/ibotta/android/service/api/job/BaseApiJob;
.source "BatchApiJob.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/service/api/job/BaseApiJob<",
        "Lcom/ibotta/android/service/api/job/BatchApiJob;",
        "Lcom/ibotta/android/service/api/job/SingleApiJob;",
        ">;",
        "Lcom/ibotta/android/service/api/job/ApiJobListener;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/android/service/api/job/BatchApiJob;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiJobs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private exception:Lcom/ibotta/api/ApiException;

.field private lastLoadTime:J

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private notifiedJobFinished:Z

.field private notifiedLongTask:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/api/job/BaseApiJob;-><init>(I)V

    .line 26
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    .line 27
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public varargs add([Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    if-eqz p1, :cond_2

    .line 137
    array-length v0, p1

    if-gtz v0, :cond_0

    goto :goto_1

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 143
    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/service/api/job/SingleApiJob;->setGroup(I)V

    .line 145
    invoke-virtual {v2, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 146
    iget-object v3, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v3, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 149
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic addPeer(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->addPeer(Lcom/ibotta/android/service/api/job/BatchApiJob;)V

    return-void
.end method

.method public addPeer(Lcom/ibotta/android/service/api/job/BatchApiJob;)V
    .locals 0

    return-void
.end method

.method public compareTo(Lcom/ibotta/android/service/api/job/BatchApiJob;)I
    .locals 1

    .line 206
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->compareTo(Lcom/ibotta/android/service/api/job/BatchApiJob;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic copyOutcome(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/BatchApiJob;)V

    return-void
.end method

.method public copyOutcome(Lcom/ibotta/android/service/api/job/BatchApiJob;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 161
    :cond_1
    instance-of v1, p1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    if-nez v1, :cond_2

    return v0

    .line 165
    :cond_2
    check-cast p1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    .line 166
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    iget-object v2, p1, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    .line 167
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    .line 168
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 169
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 38
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getCallables()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/concurrent/Callable<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;>;"
        }
    .end annotation

    .line 43
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getException()Lcom/ibotta/api/ApiException;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    return-object v0
.end method

.method public getLastLoadTime()J
    .locals 2

    .line 133
    iget-wide v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lastLoadTime:J

    return-wide v0
.end method

.method public getOutcome()Lcom/ibotta/android/service/api/Outcome;
    .locals 8

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-object v0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 80
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 81
    invoke-virtual {v5}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccess()Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 83
    iput-object v2, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {v5}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v6

    sget-object v7, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-ne v6, v7, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez v1, :cond_1

    .line 87
    invoke-virtual {v5}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v1

    .line 88
    invoke-virtual {v5}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object v5

    iput-object v5, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    .line 93
    iput-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    goto :goto_1

    :cond_5
    if-lez v3, :cond_6

    .line 95
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 96
    iput-object v2, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    goto :goto_1

    .line 97
    :cond_6
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-ne v4, v0, :cond_7

    .line 98
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 99
    iput-object v2, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    goto :goto_1

    .line 101
    :cond_7
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->ERROR:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-object v0

    :catchall_0
    move-exception v0

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getPeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 263
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 174
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x1159

    const/16 v2, 0x99b

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    .line 175
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public isOutOfDate()Z
    .locals 4

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 122
    invoke-interface {v3}, Lcom/ibotta/android/service/api/job/ApiJob;->isOutOfDate()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public isSuccess()Z
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSuccessfullyLoaded()Z
    .locals 4

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 58
    invoke-interface {v3}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, v0, :cond_2

    const/4 v1, 0x1

    .line 64
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 4

    const-string v0, "BatchApiJob [%1$s] finished %2$s"

    const/4 v1, 0x2

    .line 224
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 228
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object p1

    .line 229
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedJobFinished:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-eq p1, v0, :cond_1

    .line 230
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne p1, v0, :cond_0

    .line 231
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lastLoadTime:J

    .line 233
    :cond_0
    iput-boolean v2, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedJobFinished:Z

    .line 234
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifyJobFinished()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 211
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 213
    :try_start_0
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedLongTask:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 214
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedLongTask:Z

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifyLongTask()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public reset()V
    .locals 2

    .line 243
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->reset()V

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 246
    :try_start_0
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedLongTask:Z

    .line 247
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->notifiedJobFinished:Z

    const/4 v0, 0x0

    .line 248
    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->exception:Lcom/ibotta/api/ApiException;

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 250
    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJob;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BatchApiJob [name=%1$s, group=%2$d, outcome=%3$s, size=%4$d, listeners=%5$d]\n"

    const/4 v2, 0x5

    .line 184
    new-array v2, v2, [Ljava/lang/Object;

    .line 186
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 187
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getGroup()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    .line 188
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    .line 189
    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x3

    aput-object v3, v2, v6

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getListenerCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x4

    aput-object v3, v2, v6

    .line 184
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 194
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->apiJobs:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Callable;

    const-string v3, "    %1$s\n"

    .line 195
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v2, v6, v4

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 198
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BatchApiJob;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
