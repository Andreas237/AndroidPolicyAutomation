.class public abstract Lcom/ibotta/android/service/api/job/BaseApiJob;
.super Ljava/lang/Object;
.source "BaseApiJob.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJob;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/ibotta/android/service/api/job/ApiJob;",
        ":",
        "Ljava/lang/Comparable<",
        "TT;>;J::",
        "Lcom/ibotta/android/service/api/job/ApiJob;",
        ":",
        "Ljava/util/concurrent/Callable<",
        "TJ;>;>",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/service/api/job/ApiJob<",
        "TT;TJ;>;"
    }
.end annotation


# instance fields
.field private apiJobListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJobListener;",
            ">;"
        }
    .end annotation
.end field

.field private group:I

.field protected listenerLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field protected listenerReadLock:Ljava/util/concurrent/locks/Lock;

.field protected listenerWriteLock:Ljava/util/concurrent/locks/Lock;

.field private name:Ljava/lang/String;

.field protected notifiedJobFinished:Z

.field protected notifiedLongTask:Z

.field protected outcome:Lcom/ibotta/android/service/api/Outcome;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 26
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    .line 27
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    .line 35
    iput p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->group:I

    return-void
.end method

.method public static synthetic lambda$notifyJobFinished$1(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V
    .locals 1

    .line 166
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobListener;

    .line 167
    invoke-interface {v0, p0}, Lcom/ibotta/android/service/api/job/ApiJobListener;->onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 169
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedJobFinished:Z

    return-void
.end method

.method public static synthetic lambda$notifyLongTask$0(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V
    .locals 2

    .line 136
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedJobFinished:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string p1, "Tried to notify for long task, but task is already finished."

    const/4 v0, 0x0

    .line 137
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedLongTask:Z

    return-void

    .line 142
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobListener;

    .line 143
    invoke-interface {v0, p0}, Lcom/ibotta/android/service/api/job/ApiJobListener;->onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_0

    .line 145
    :cond_1
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedLongTask:Z

    return-void
.end method

.method private notifyJobFinished(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJobListener;",
            ">;)V"
        }
    .end annotation

    .line 164
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$RFsaUMSLZlP5fHMCHYbFYBnxLHM;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$RFsaUMSLZlP5fHMCHYbFYBnxLHM;-><init>(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private notifyLongTask(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJobListener;",
            ">;)V"
        }
    .end annotation

    .line 133
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;-><init>(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 88
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 89
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance v1, Lcom/ibotta/android/service/api/job/ApiJobListenerComparator;

    invoke-direct {v1}, Lcom/ibotta/android/service/api/job/ApiJobListenerComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 93
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 95
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 96
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedJobFinished:Z

    if-eqz p1, :cond_0

    .line 100
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifyJobFinished(Ljava/util/Set;)V

    goto :goto_0

    .line 101
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedLongTask:Z

    if-eqz p1, :cond_1

    .line 103
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifyLongTask(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public getGroup()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->group:I

    return v0
.end method

.method protected getListenerCount()I
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getListeners()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJobListener;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOutcome()Lcom/ibotta/android/service/api/Outcome;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-object v0
.end method

.method public isSuccess()Z
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected notifyJobFinished()V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 155
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 160
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifyJobFinished(Ljava/util/Set;)V

    return-void

    :catchall_0
    move-exception v0

    .line 157
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method protected notifyLongTask()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 124
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 129
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifyLongTask(Ljava/util/Set;)V

    return-void

    :catchall_0
    move-exception v0

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerReadLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 113
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->apiJobListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->listenerWriteLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public reset()V
    .locals 1

    .line 175
    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    const/4 v0, 0x0

    .line 176
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedLongTask:Z

    .line 177
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->notifiedJobFinished:Z

    return-void
.end method

.method setGroup(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->group:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->name:Ljava/lang/String;

    return-void
.end method

.method public setOutcome(Lcom/ibotta/android/service/api/Outcome;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/BaseApiJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    return-void
.end method
