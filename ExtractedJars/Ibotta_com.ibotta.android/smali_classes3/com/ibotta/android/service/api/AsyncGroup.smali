.class public Lcom/ibotta/android/service/api/AsyncGroup;
.super Ljava/lang/Object;
.source "AsyncGroup.java"


# instance fields
.field private futures:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            "Ljava/util/concurrent/Future<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;>;"
        }
    .end annotation
.end field

.field private group:I

.field private lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private readLock:Ljava/util/concurrent/locks/Lock;

.field private work:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private writeLock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method constructor <init>(I)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    .line 25
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->readLock:Ljava/util/concurrent/locks/Lock;

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    .line 30
    iput p1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->group:I

    return-void
.end method


# virtual methods
.method public add(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 6

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 45
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getCallables()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 49
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 53
    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/job/ApiJob;->addPeer(Lcom/ibotta/android/service/api/job/ApiJob;)V

    const-string v4, "Joined ApiJob to existing ApiJob: \n    existing=%1$s, \n    peer=%2$s"

    const/4 v5, 0x2

    .line 54
    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v2

    aput-object v0, v5, v3

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v1, "Queueing ApiJob: %1$s"

    .line 59
    new-array v4, v3, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-static {v1, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    invoke-interface {v1, v0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Queued ApiJob: %1$s"

    .line 62
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 66
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public addJobFuture(Lcom/ibotta/android/service/api/job/ApiJob;Ljava/util/concurrent/Future;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            "Ljava/util/concurrent/Future<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)V"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "New future being introduced, but record of a prior future exists: %1$s"

    const/4 v1, 0x1

    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public consumed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->writeLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public getFutures()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            "Ljava/util/concurrent/Future<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    return-object v0
.end method

.method public getGroup()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/ibotta/android/service/api/AsyncGroup;->group:I

    return v0
.end method

.method public getJobsToSubmit()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 71
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->readLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 75
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 76
    instance-of v3, v2, Ljava/util/concurrent/Callable;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/ibotta/android/service/api/AsyncGroup;->futures:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 77
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 81
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->readLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroup;->readLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "AsyncGroup [group = %1$d, count = %2$d]"

    const/4 v1, 0x2

    .line 112
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/ibotta/android/service/api/AsyncGroup;->group:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/service/api/AsyncGroup;->work:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
