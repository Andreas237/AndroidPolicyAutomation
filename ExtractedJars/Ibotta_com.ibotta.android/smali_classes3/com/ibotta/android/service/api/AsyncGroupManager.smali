.class public Lcom/ibotta/android/service/api/AsyncGroupManager;
.super Ljava/lang/Object;
.source "AsyncGroupManager.java"


# instance fields
.field private final asyncGroups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/service/api/AsyncGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final mapLock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    .line 22
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    return-void
.end method

.method private createAsyncGroup(I)Lcom/ibotta/android/service/api/AsyncGroup;
    .locals 3

    .line 110
    new-instance v0, Lcom/ibotta/android/service/api/AsyncGroup;

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/AsyncGroup;-><init>(I)V

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/AsyncGroup;->getGroup()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Created new AsyncGroup: %1$s"

    const/4 v1, 0x1

    .line 113
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public attachToGroups(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachToGroups: acquiring mapLock"

    const/4 v1, 0x0

    .line 43
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "attachToGroups: acquired mapLock"

    .line 45
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 49
    iget-object v3, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJob;->getGroup()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/service/api/AsyncGroup;

    if-nez v3, :cond_0

    const-string v3, "AsyncGroup null, creating one now: group=%1$s"

    .line 52
    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJob;->getGroup()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJob;->getGroup()I

    move-result v3

    invoke-direct {p0, v3}, Lcom/ibotta/android/service/api/AsyncGroupManager;->createAsyncGroup(I)Lcom/ibotta/android/service/api/AsyncGroup;

    move-result-object v3

    :cond_0
    const-string v4, "Attaching apiJob to group: group=%1$s"

    .line 58
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v3, v2, v1

    invoke-static {v4, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-virtual {v3, v0}, Lcom/ibotta/android/service/api/AsyncGroup;->add(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    :cond_1
    const-string p1, "AsyncGroup count: %1$s"

    .line 62
    new-array v0, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "attachToGroups: released mapLock"

    .line 65
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 65
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "attachToGroups: released mapLock"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public cleanUp()V
    .locals 6

    const-string v0, "cleanUp"

    const/4 v1, 0x0

    .line 119
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 123
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    .line 124
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 126
    iget-object v3, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 127
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/service/api/AsyncGroup;

    invoke-virtual {v5}, Lcom/ibotta/android/service/api/AsyncGroup;->getJobsToSubmit()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 128
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 132
    :cond_1
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 133
    iget-object v4, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 136
    :cond_2
    iget-object v2, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    const-string v3, "AsyncGroup counts: before=%1$d, after%2$d"

    const/4 v4, 0x2

    .line 138
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public clear()V
    .locals 2

    const-string v0, "clear"

    const/4 v1, 0x0

    .line 145
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public consumed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 157
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

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

    check-cast v1, Lcom/ibotta/android/service/api/AsyncGroup;

    .line 158
    invoke-virtual {v1, p1}, Lcom/ibotta/android/service/api/AsyncGroup;->consumed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 161
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public getJobsToSubmit(Ljava/util/Set;)Lcom/ibotta/android/service/api/AsyncGroup;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;)",
            "Lcom/ibotta/android/service/api/AsyncGroup;"
        }
    .end annotation

    const-string v0, "getJobsToSubmit: acquiring mapLock"

    const/4 v1, 0x0

    .line 72
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "getJobsToSubmit: acquired mapLock"

    .line 74
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 79
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/service/api/AsyncGroup;

    invoke-virtual {v4}, Lcom/ibotta/android/service/api/AsyncGroup;->getJobsToSubmit()Ljava/util/Set;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 81
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_0

    .line 82
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/service/api/AsyncGroup;

    const-string v0, "Jobs found in: %1$s"

    .line 84
    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v2, p1

    goto :goto_1

    :cond_0
    const-string v3, "No jobs found in: %1$s"

    .line 88
    new-array v4, v5, [Ljava/lang/Object;

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string p1, "No more async groups."

    .line 92
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string p1, "getJobsToSubmit: released mapLock"

    .line 96
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :catchall_0
    move-exception p1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 96
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "getJobsToSubmit: released mapLock"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public isEmpty()Z
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->asyncGroups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/AsyncGroup;

    .line 30
    invoke-virtual {v1}, Lcom/ibotta/android/service/api/AsyncGroup;->getJobsToSubmit()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 36
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/AsyncGroupManager;->mapLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
