.class public interface abstract Lcom/ibotta/android/async/dependency/JobClient;
.super Ljava/lang/Object;
.source "JobClient.java"


# virtual methods
.method public abstract getApiJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onAbandonApiJobs()V
.end method

.method public abstract onApiJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
.end method

.method public abstract onApiJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
.end method

.method public abstract onApiJobsFinished()V
.end method

.method public abstract onApiJobsFinishedWithFailures()V
.end method

.method public abstract onLoadingStarted()V
.end method

.method public abstract onLoadingStopped()V
.end method

.method public abstract onLongLoadStarted()V
.end method
