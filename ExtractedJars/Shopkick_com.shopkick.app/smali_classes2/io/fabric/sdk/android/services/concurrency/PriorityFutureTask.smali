.class public Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;
.super Ljava/util/concurrent/FutureTask;
.source "PriorityFutureTask.java"

# interfaces
.implements Lio/fabric/sdk/android/services/concurrency/Dependency;
.implements Lio/fabric/sdk/android/services/concurrency/PriorityProvider;
.implements Lio/fabric/sdk/android/services/concurrency/Task;
.implements Lio/fabric/sdk/android/services/concurrency/DelegateProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "TV;>;",
        "Lio/fabric/sdk/android/services/concurrency/Dependency<",
        "Lio/fabric/sdk/android/services/concurrency/Task;",
        ">;",
        "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
        "Lio/fabric/sdk/android/services/concurrency/Task;",
        "Lio/fabric/sdk/android/services/concurrency/DelegateProvider;"
    }
.end annotation


# instance fields
.field final delegate:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 45
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->checkAndInitDelegate(Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object p1

    iput-object p1, p0, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->delegate:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 40
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->checkAndInitDelegate(Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object p1

    iput-object p1, p0, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->delegate:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V
    .locals 1

    .line 55
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Dependency;

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/services/concurrency/Dependency;->addDependency(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic addDependency(Ljava/lang/Object;)V
    .locals 0

    .line 33
    check-cast p1, Lio/fabric/sdk/android/services/concurrency/Task;

    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V

    return-void
.end method

.method public areDependenciesMet()Z
    .locals 1

    .line 65
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Dependency;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/Dependency;->areDependenciesMet()Z

    move-result v0

    return v0
.end method

.method protected checkAndInitDelegate(Ljava/lang/Object;)Lio/fabric/sdk/android/services/concurrency/Dependency;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lio/fabric/sdk/android/services/concurrency/Dependency<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;:",
            "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
            ":",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 102
    invoke-static {p1}, Lio/fabric/sdk/android/services/concurrency/PriorityTask;->isProperDelegate(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    check-cast p1, Lio/fabric/sdk/android/services/concurrency/Dependency;

    return-object p1

    .line 105
    :cond_0
    new-instance p1, Lio/fabric/sdk/android/services/concurrency/PriorityTask;

    invoke-direct {p1}, Lio/fabric/sdk/android/services/concurrency/PriorityTask;-><init>()V

    return-object p1
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 50
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lio/fabric/sdk/android/services/concurrency/Dependency<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;:",
            "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
            ":",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">()TT;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->delegate:Ljava/lang/Object;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Dependency;

    return-object v0
.end method

.method public getDependencies()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/services/concurrency/Task;",
            ">;"
        }
    .end annotation

    .line 60
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Dependency;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/Dependency;->getDependencies()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getError()Ljava/lang/Throwable;
    .locals 1

    .line 90
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Task;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/Task;->getError()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public getPriority()Lio/fabric/sdk/android/services/concurrency/Priority;
    .locals 1

    .line 70
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;->getPriority()Lio/fabric/sdk/android/services/concurrency/Priority;

    move-result-object v0

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .line 80
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Task;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/Task;->isFinished()Z

    move-result v0

    return v0
.end method

.method public setError(Ljava/lang/Throwable;)V
    .locals 1

    .line 85
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Task;

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/services/concurrency/Task;->setError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public setFinished(Z)V
    .locals 1

    .line 75
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityFutureTask;->getDelegate()Lio/fabric/sdk/android/services/concurrency/Dependency;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    check-cast v0, Lio/fabric/sdk/android/services/concurrency/Task;

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/services/concurrency/Task;->setFinished(Z)V

    return-void
.end method
