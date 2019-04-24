.class public interface abstract Lcom/ibotta/android/service/api/job/ApiJob;
.super Ljava/lang/Object;
.source "ApiJob.java"


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
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V
.end method

.method public abstract addPeer(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract copyOutcome(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract getCallables()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/concurrent/Callable<",
            "TJ;>;>;"
        }
    .end annotation
.end method

.method public abstract getException()Lcom/ibotta/api/ApiException;
.end method

.method public abstract getGroup()I
.end method

.method public abstract getLastLoadTime()J
.end method

.method public abstract getListeners()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJobListener;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOutcome()Lcom/ibotta/android/service/api/Outcome;
.end method

.method public abstract getPeers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isOutOfDate()Z
.end method

.method public abstract isSuccessfullyLoaded()Z
.end method

.method public abstract removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V
.end method

.method public abstract reset()V
.end method
