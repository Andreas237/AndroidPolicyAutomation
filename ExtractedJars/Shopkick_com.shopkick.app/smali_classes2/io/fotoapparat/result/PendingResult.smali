.class public Lio/fotoapparat/result/PendingResult;
.super Ljava/lang/Object;
.source "PendingResult.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/result/PendingResult$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000 \u001a*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB%\u0008\u0000\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ+\u0010\r\u001a\u0002H\u000e\"\u0004\u0008\u0001\u0010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u0002H\u000e0\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000cJ&\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u0002H\u000e0\u0000\"\u0004\u0008\u0001\u0010\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u000e0\u0010J\u001c\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00160\u0010J\u0014\u0010\u0018\u001a\u00020\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/fotoapparat/result/PendingResult;",
        "T",
        "",
        "future",
        "Ljava/util/concurrent/Future;",
        "logger",
        "Lio/fotoapparat/log/Logger;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V",
        "resultUnsafe",
        "getResultUnsafe",
        "()Ljava/lang/Object;",
        "adapt",
        "R",
        "adapter",
        "Lkotlin/Function1;",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "await",
        "transform",
        "transformer",
        "whenAvailable",
        "",
        "callback",
        "whenDone",
        "Lio/fotoapparat/result/WhenDoneListener;",
        "Companion",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/fotoapparat/result/PendingResult$Companion;


# instance fields
.field private final executor:Ljava/util/concurrent/Executor;

.field private final future:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final logger:Lio/fotoapparat/log/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/fotoapparat/result/PendingResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/fotoapparat/result/PendingResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/fotoapparat/result/PendingResult;->Companion:Lio/fotoapparat/result/PendingResult$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "TT;>;",
            "Lio/fotoapparat/log/Logger;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    const-string v0, "future"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/result/PendingResult;->future:Ljava/util/concurrent/Future;

    iput-object p2, p0, Lio/fotoapparat/result/PendingResult;->logger:Lio/fotoapparat/log/Logger;

    iput-object p3, p0, Lio/fotoapparat/result/PendingResult;->executor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static final synthetic access$getFuture$p(Lio/fotoapparat/result/PendingResult;)Ljava/util/concurrent/Future;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object p0, p0, Lio/fotoapparat/result/PendingResult;->future:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lio/fotoapparat/result/PendingResult;)Lio/fotoapparat/log/Logger;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object p0, p0, Lio/fotoapparat/result/PendingResult;->logger:Lio/fotoapparat/log/Logger;

    return-object p0
.end method

.method public static final synthetic access$getResultUnsafe$p(Lio/fotoapparat/result/PendingResult;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-direct {p0}, Lio/fotoapparat/result/PendingResult;->getResultUnsafe()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getResultUnsafe()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 24
    invoke-static {}, Lio/fotoapparat/concurrent/EnsureBgThreadKt;->ensureBackgroundThread()V

    .line 25
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult;->future:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final adapt(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/concurrent/Future<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult;->future:Ljava/util/concurrent/Future;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final await()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult;->future:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/result/PendingResult;
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+TR;>;)",
            "Lio/fotoapparat/result/PendingResult<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "transformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;

    invoke-direct {v1, p0, p1}, Lio/fotoapparat/result/PendingResult$transform$transformTask$1;-><init>(Lio/fotoapparat/result/PendingResult;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/util/concurrent/Callable;

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 38
    iget-object p1, p0, Lio/fotoapparat/result/PendingResult;->executor:Ljava/util/concurrent/Executor;

    move-object v1, v0

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 40
    new-instance p1, Lio/fotoapparat/result/PendingResult;

    .line 41
    check-cast v0, Ljava/util/concurrent/Future;

    .line 42
    iget-object v1, p0, Lio/fotoapparat/result/PendingResult;->logger:Lio/fotoapparat/log/Logger;

    .line 43
    iget-object v2, p0, Lio/fotoapparat/result/PendingResult;->executor:Ljava/util/concurrent/Executor;

    .line 40
    invoke-direct {p1, v0, v1, v2}, Lio/fotoapparat/result/PendingResult;-><init>(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public final whenAvailable(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lio/fotoapparat/result/PendingResult;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/fotoapparat/result/PendingResult$whenAvailable$1;

    invoke-direct {v1, p0, p1}, Lio/fotoapparat/result/PendingResult$whenAvailable$1;-><init>(Lio/fotoapparat/result/PendingResult;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final whenDone(Lio/fotoapparat/result/WhenDoneListener;)V
    .locals 1
    .param p1    # Lio/fotoapparat/result/WhenDoneListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/result/WhenDoneListener<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Lio/fotoapparat/result/PendingResult$whenDone$1;

    invoke-direct {v0, p1}, Lio/fotoapparat/result/PendingResult$whenDone$1;-><init>(Lio/fotoapparat/result/WhenDoneListener;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v0}, Lio/fotoapparat/result/PendingResult;->whenAvailable(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
