.class abstract Lcom/google/common/util/concurrent/AggregateFuture$RunningState;
.super Lcom/google/common/util/concurrent/AggregateFutureState;
.source "AggregateFuture.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/AggregateFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "RunningState"
.end annotation


# instance fields
.field private final allMustSucceed:Z

.field private final collectsValues:Z

.field private futures:Lcom/google/common/collect/ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/ImmutableCollection<",
            "+",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TInputT;>;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/common/util/concurrent/AggregateFuture;


# direct methods
.method constructor <init>(Lcom/google/common/util/concurrent/AggregateFuture;Lcom/google/common/collect/ImmutableCollection;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/ImmutableCollection<",
            "+",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TInputT;>;>;ZZ)V"
        }
    .end annotation

    .line 86
    iput-object p1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    .line 87
    invoke-virtual {p2}, Lcom/google/common/collect/ImmutableCollection;->size()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/AggregateFutureState;-><init>(I)V

    .line 88
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/common/collect/ImmutableCollection;

    iput-object p1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    .line 89
    iput-boolean p3, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    .line 90
    iput-boolean p4, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectsValues:Z

    return-void
.end method

.method static synthetic access$000(Lcom/google/common/util/concurrent/AggregateFuture$RunningState;)Lcom/google/common/collect/ImmutableCollection;
    .locals 0

    .line 78
    iget-object p0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/common/util/concurrent/AggregateFuture$RunningState;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->init()V

    return-void
.end method

.method static synthetic access$200(Lcom/google/common/util/concurrent/AggregateFuture$RunningState;ILjava/util/concurrent/Future;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1, p2}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleOneInputDone(ILjava/util/concurrent/Future;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/common/util/concurrent/AggregateFuture$RunningState;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->decrementCountAndMaybeComplete()V

    return-void
.end method

.method private decrementCountAndMaybeComplete()V
    .locals 3

    .line 229
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->decrementRemainingAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Less than 0 remaining futures"

    .line 230
    invoke-static {v1, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    if-nez v0, :cond_1

    .line 232
    invoke-direct {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->processCompleted()V

    :cond_1
    return-void
.end method

.method private handleException(Ljava/lang/Throwable;)V
    .locals 6

    .line 157
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/AggregateFuture;->setException(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->releaseResourcesAfterFailure()V

    const/4 v3, 0x1

    goto :goto_0

    .line 170
    :cond_0
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->getOrInitSeenExceptions()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3, p1}, Lcom/google/common/util/concurrent/AggregateFuture;->access$400(Ljava/util/Set;Ljava/lang/Throwable;)Z

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x1

    .line 175
    :goto_0
    instance-of v4, p1, Ljava/lang/Error;

    iget-boolean v5, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    and-int v0, v5, v1

    and-int/2addr v0, v3

    or-int/2addr v0, v4

    if-eqz v0, :cond_4

    if-eqz v4, :cond_3

    const-string v0, "Input Future failed with Error"

    goto :goto_2

    :cond_3
    const-string v0, "Got more than one input Future failure. Logging failures after the first"

    .line 181
    :goto_2
    invoke-static {}, Lcom/google/common/util/concurrent/AggregateFuture;->access$500()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2, v0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method

.method private handleOneInputDone(ILjava/util/concurrent/Future;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/Future<",
            "+TInputT;>;)V"
        }
    .end annotation

    .line 199
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    .line 200
    invoke-virtual {v0}, Lcom/google/common/util/concurrent/AggregateFuture;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/AggregateFuture;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v2, "Future was done before all dependencies completed"

    .line 199
    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 204
    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v2, "Tried to set value from future which is not done"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 205
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    if-eqz v0, :cond_3

    .line 206
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    iget-object p1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/google/common/util/concurrent/AggregateFuture;->access$602(Lcom/google/common/util/concurrent/AggregateFuture;Lcom/google/common/util/concurrent/AggregateFuture$RunningState;)Lcom/google/common/util/concurrent/AggregateFuture$RunningState;

    .line 210
    iget-object p1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    invoke-virtual {p1, v1}, Lcom/google/common/util/concurrent/AggregateFuture;->cancel(Z)Z

    goto :goto_2

    .line 213
    :cond_2
    invoke-static {p2}, Lcom/google/common/util/concurrent/Futures;->getDone(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p2

    .line 214
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectsValues:Z

    if-eqz v0, :cond_4

    .line 215
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectOneValue(ZILjava/lang/Object;)V

    goto :goto_2

    .line 218
    :cond_3
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectsValues:Z

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 219
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    invoke-static {p2}, Lcom/google/common/util/concurrent/Futures;->getDone(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectOneValue(ZILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 224
    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleException(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    move-exception p1

    .line 222
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleException(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-void
.end method

.method private init()V
    .locals 5

    .line 107
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleAllCompleted()V

    return-void

    .line 115
    :cond_0
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 126
    iget-object v1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    invoke-virtual {v1}, Lcom/google/common/collect/ImmutableCollection;->iterator()Lcom/google/common/collect/UnmodifiableIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/util/concurrent/ListenableFuture;

    add-int/lit8 v3, v0, 0x1

    .line 128
    new-instance v4, Lcom/google/common/util/concurrent/AggregateFuture$RunningState$1;

    invoke-direct {v4, p0, v0, v2}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState$1;-><init>(Lcom/google/common/util/concurrent/AggregateFuture$RunningState;ILcom/google/common/util/concurrent/ListenableFuture;)V

    .line 139
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 128
    invoke-interface {v2, v4, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move v0, v3

    goto :goto_0

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableCollection;->iterator()Lcom/google/common/collect/UnmodifiableIterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 145
    invoke-static {}, Lcom/google/common/util/concurrent/MoreExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v1, p0, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private processCompleted()V
    .locals 4

    .line 239
    iget-boolean v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->collectsValues:Z

    iget-boolean v1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->allMustSucceed:Z

    xor-int/lit8 v1, v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 241
    iget-object v1, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    invoke-virtual {v1}, Lcom/google/common/collect/ImmutableCollection;->iterator()Lcom/google/common/collect/UnmodifiableIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/util/concurrent/ListenableFuture;

    add-int/lit8 v3, v0, 0x1

    .line 242
    invoke-direct {p0, v0, v2}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleOneInputDone(ILjava/util/concurrent/Future;)V

    move v0, v3

    goto :goto_0

    .line 245
    :cond_0
    invoke-virtual {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->handleAllCompleted()V

    return-void
.end method


# virtual methods
.method final addInitialException(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/AggregateFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->this$0:Lcom/google/common/util/concurrent/AggregateFuture;

    invoke-virtual {v0}, Lcom/google/common/util/concurrent/AggregateFuture;->trustedGetException()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/common/util/concurrent/AggregateFuture;->access$400(Ljava/util/Set;Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method abstract collectOneValue(ZILjava/lang/Object;)V
    .param p3    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZITInputT;)V"
        }
    .end annotation
.end method

.method abstract handleAllCompleted()V
.end method

.method interruptTask()V
    .locals 0

    return-void
.end method

.method releaseResourcesAfterFailure()V
    .locals 1

    const/4 v0, 0x0

    .line 258
    iput-object v0, p0, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->futures:Lcom/google/common/collect/ImmutableCollection;

    return-void
.end method

.method public final run()V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/google/common/util/concurrent/AggregateFuture$RunningState;->decrementCountAndMaybeComplete()V

    return-void
.end method
