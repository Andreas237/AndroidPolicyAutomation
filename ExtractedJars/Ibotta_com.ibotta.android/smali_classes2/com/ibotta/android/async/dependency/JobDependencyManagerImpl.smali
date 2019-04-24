.class public Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;
.super Ljava/lang/Object;
.source "JobDependencyManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/dependency/JobDependencyManager;
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# static fields
.field public static final LOG_FORMAT:Ljava/lang/String; = "Client: %1$s - %2$s"


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private failures:Z

.field protected finishedApiJobs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end field

.field private final jobClient:Lcom/ibotta/android/async/dependency/JobClient;

.field protected pendingApiJobs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/async/dependency/JobClient;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    .line 29
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->finishedApiJobs:Ljava/util/Set;

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    const-string p1, "Initialized"

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    return-void
.end method

.method private log(Ljava/lang/String;)V
    .locals 4

    const-string v0, "Client: %1$s - %2$s"

    const/4 v1, 0x2

    .line 251
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 252
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private varargs log(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    const-string v0, "Client: %1$s - %2$s"

    const/4 v1, 0x2

    .line 256
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 257
    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected attachListenerToJobs()V
    .locals 3

    const-string v0, "Attaching job dependency manager listener to jobs."

    .line 154
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 157
    invoke-interface {v1, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 159
    instance-of v2, v1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    if-eqz v2, :cond_0

    .line 160
    check-cast v1, Lcom/ibotta/android/service/api/job/BatchApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/BatchApiJob;->getApiJobs()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 161
    invoke-interface {v2, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected clearFinishedApiJobs()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->finishedApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method protected confirmFinishedJobs()Z
    .locals 3

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->finishedApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 231
    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v2

    return v0
.end method

.method protected detachListenerFromPreviousJobs()V
    .locals 2

    const-string v0, "Detaching job dependency manager listener from jobs."

    .line 136
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 139
    invoke-interface {v1, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected gatherApiJobs()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->getApiJobs()Ljava/util/Set;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    if-eqz v0, :cond_0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method protected getJobClient()Lcom/ibotta/android/async/dependency/JobClient;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    return-object v0
.end method

.method protected isJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)Z
    .locals 2

    .line 243
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->UNKNOWN:Lcom/ibotta/android/service/api/Outcome;

    if-eq v0, v1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isLoading()Z
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected isOutOfDate()Z
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 119
    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJob;->isOutOfDate()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    const-string v0, "At least one job is out of date."

    .line 129
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    :cond_3
    return v1
.end method

.method public loadData()V
    .locals 4

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Already loading."

    .line 45
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    return-void

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->isOutOfDate()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Data is still fresh. No need to reload."

    .line 50
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobsFinished()V

    return-void

    :cond_1
    const-string v0, "Data will be loaded."

    .line 55
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->detachListenerFromPreviousJobs()V

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->clearFinishedApiJobs()V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->gatherApiJobs()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->resetJobs()V

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->onLoadingStarted()V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->attachListenerToJobs()V

    const-string v0, "Submitting %1$d jobs."

    const/4 v1, 0x1

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Ljava/util/Collection;)V

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobsFinished()V

    :goto_0
    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 6

    const-string v0, "onApiJobFinished: %1$s"

    const/4 v1, 0x1

    .line 175
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->finishedApiJobs:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 181
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->failures:Z

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->isJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->failures:Z

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    .line 186
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v0, "A job has failed to load: %1$s"

    .line 187
    new-array v2, v1, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const-string v2, "A job has successfully loaded: %1$s"

    .line 192
    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v3

    invoke-direct {p0, v2, v4}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v0

    const/4 v0, 0x1

    :goto_2
    const-string v4, "Jobs remaining: %1$d"

    .line 196
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v3

    invoke-direct {p0, v4, v1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_4

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    goto :goto_3

    .line 201
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    :goto_3
    if-eqz v2, :cond_7

    .line 215
    iget-boolean p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->failures:Z

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->confirmFinishedJobs()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    const-string p1, "All jobs finished successfully."

    .line 219
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 220
    iget-object p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {p1}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobsFinished()V

    goto :goto_5

    :cond_6
    :goto_4
    const-string p1, "All jobs finished, but there were failures."

    .line 216
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 217
    iget-object p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {p1}, Lcom/ibotta/android/async/dependency/JobClient;->onApiJobsFinishedWithFailures()V

    .line 223
    :goto_5
    iget-object p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {p1}, Lcom/ibotta/android/async/dependency/JobClient;->onLoadingStopped()V

    :cond_7
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    const-string v0, "onApiJobLongTask: %1$s"

    const/4 v1, 0x1

    .line 169
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object p1, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {p1}, Lcom/ibotta/android/async/dependency/JobClient;->onLongLoadStarted()V

    return-void
.end method

.method public reloadData()V
    .locals 1

    const-string v0, "Reload data."

    .line 77
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->stopLoading()V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->resetJobs()V

    .line 84
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->loadData()V

    return-void
.end method

.method protected resetJobs()V
    .locals 2

    const-string v0, "Resetting jobs."

    .line 144
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJob;

    .line 147
    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJob;->reset()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 150
    iput-boolean v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->failures:Z

    return-void
.end method

.method public stopLoading()V
    .locals 1

    const-string v0, "Stop loading."

    .line 94
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->log(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->detachListenerFromPreviousJobs()V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->onAbandonApiJobs()V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->pendingApiJobs:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/async/dependency/JobDependencyManagerImpl;->jobClient:Lcom/ibotta/android/async/dependency/JobClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/dependency/JobClient;->onLoadingStopped()V

    return-void
.end method
