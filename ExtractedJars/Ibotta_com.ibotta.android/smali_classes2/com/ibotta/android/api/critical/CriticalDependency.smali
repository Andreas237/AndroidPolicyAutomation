.class public interface abstract Lcom/ibotta/android/api/critical/CriticalDependency;
.super Ljava/lang/Object;
.source "CriticalDependency.java"


# virtual methods
.method public abstract getApiJobs()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isLoadNeeded()Z
.end method

.method public abstract onAppLaunched(ZZ)V
.end method

.method public abstract onJobQueued()V
.end method
