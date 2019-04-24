.class public final Lio/fotoapparat/concurrent/CameraExecutor;
.super Ljava/lang/Object;
.source "CameraExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/concurrent/CameraExecutor$Operation;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraExecutor.kt\nio/fotoapparat/concurrent/CameraExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n670#2:79\n743#2,2:80\n1561#2,2:82\n*E\n*S KotlinDebug\n*F\n+ 1 CameraExecutor.kt\nio/fotoapparat/concurrent/CameraExecutor\n*L\n52#1:79\n52#1,2:80\n53#1,2:82\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u000cJ\u0008\u0010\r\u001a\u00020\u000cH\u0002J \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0007\"\u0004\u0008\u0000\u0010\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0011R\u0018\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0008\u001a\u00020\t*\u0006\u0012\u0002\u0008\u00030\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/fotoapparat/concurrent/CameraExecutor;",
        "",
        "executor",
        "Ljava/util/concurrent/ExecutorService;",
        "(Ljava/util/concurrent/ExecutorService;)V",
        "cancellableTasksQueue",
        "Ljava/util/LinkedList;",
        "Ljava/util/concurrent/Future;",
        "isPending",
        "",
        "(Ljava/util/concurrent/Future;)Z",
        "cancelTasks",
        "",
        "cleanUpCancelledTasks",
        "execute",
        "T",
        "operation",
        "Lio/fotoapparat/concurrent/CameraExecutor$Operation;",
        "Operation",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final cancellableTasksQueue:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/util/concurrent/Future<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final executor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/fotoapparat/concurrent/CameraExecutor;-><init>(Ljava/util/concurrent/ExecutorService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/ExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "executor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/concurrent/CameraExecutor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 19
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/concurrent/CameraExecutor;->cancellableTasksQueue:Ljava/util/LinkedList;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/ExecutorService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 16
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string p2, "Executors.newSingleThreadExecutor()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/fotoapparat/concurrent/CameraExecutor;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static final synthetic access$isPending$p(Lio/fotoapparat/concurrent/CameraExecutor;Ljava/util/concurrent/Future;)Z
    .locals 0
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 15
    invoke-direct {p0, p1}, Lio/fotoapparat/concurrent/CameraExecutor;->isPending(Ljava/util/concurrent/Future;)Z

    move-result p0

    return p0
.end method

.method private final cleanUpCancelledTasks()V
    .locals 2

    .line 39
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor;->cancellableTasksQueue:Ljava/util/LinkedList;

    check-cast v0, Ljava/util/List;

    new-instance v1, Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;

    invoke-direct {v1, p0}, Lio/fotoapparat/concurrent/CameraExecutor$cleanUpCancelledTasks$1;-><init>(Lio/fotoapparat/concurrent/CameraExecutor;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method

.method private final isPending(Ljava/util/concurrent/Future;)Z
    .locals 1
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)Z"
        }
    .end annotation

    .line 59
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final cancelTasks()V
    .locals 4

    .line 51
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor;->cancellableTasksQueue:Ljava/util/LinkedList;

    check-cast v0, Ljava/lang/Iterable;

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 80
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/concurrent/Future;

    .line 52
    invoke-direct {p0, v3}, Lio/fotoapparat/concurrent/CameraExecutor;->isPending(Ljava/util/concurrent/Future;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_1
    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    const/4 v2, 0x1

    .line 54
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor;->cancellableTasksQueue:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method public final execute(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)Ljava/util/concurrent/Future;
    .locals 2
    .param p1    # Lio/fotoapparat/concurrent/CameraExecutor$Operation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/fotoapparat/concurrent/CameraExecutor$Operation<",
            "+TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lio/fotoapparat/concurrent/CameraExecutor;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lio/fotoapparat/concurrent/CameraExecutor$execute$future$1;

    invoke-direct {v1, p1}, Lio/fotoapparat/concurrent/CameraExecutor$execute$future$1;-><init>(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)V

    check-cast v1, Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 29
    invoke-virtual {p1}, Lio/fotoapparat/concurrent/CameraExecutor$Operation;->getCancellable()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 30
    iget-object p1, p0, Lio/fotoapparat/concurrent/CameraExecutor;->cancellableTasksQueue:Ljava/util/LinkedList;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_0
    invoke-direct {p0}, Lio/fotoapparat/concurrent/CameraExecutor;->cleanUpCancelledTasks()V

    const-string p1, "future"

    .line 35
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
