.class public final Lio/fotoapparat/hardware/ExecutorKt;
.super Ljava/lang/Object;
.source "Executor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u0000\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0008\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0004\u00a8\u0006\u0010"
    }
    d2 = {
        "frameProcessingExecutor",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "getFrameProcessingExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "loggingExecutor",
        "mainThreadHandler",
        "Landroid/os/Handler;",
        "pendingResultExecutor",
        "getPendingResultExecutor",
        "executeLoggingThread",
        "",
        "function",
        "Lkotlin/Function0;",
        "executeMainThread",
        "",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final frameProcessingExecutor:Ljava/util/concurrent/ExecutorService;

.field private static final loggingExecutor:Ljava/util/concurrent/ExecutorService;

.field private static final mainThreadHandler:Landroid/os/Handler;

.field private static final pendingResultExecutor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 7
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/fotoapparat/hardware/ExecutorKt;->loggingExecutor:Ljava/util/concurrent/ExecutorService;

    .line 8
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/fotoapparat/hardware/ExecutorKt;->mainThreadHandler:Landroid/os/Handler;

    .line 13
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/fotoapparat/hardware/ExecutorKt;->pendingResultExecutor:Ljava/util/concurrent/ExecutorService;

    .line 17
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/fotoapparat/hardware/ExecutorKt;->frameProcessingExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static final executeLoggingThread(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p0    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lio/fotoapparat/hardware/ExecutorKt;->loggingExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lio/fotoapparat/hardware/ExecutorKt$executeLoggingThread$1;

    invoke-direct {v1, p0}, Lio/fotoapparat/hardware/ExecutorKt$executeLoggingThread$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final executeMainThread(Lkotlin/jvm/functions/Function0;)Z
    .locals 2
    .param p0    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v0, Lio/fotoapparat/hardware/ExecutorKt;->mainThreadHandler:Landroid/os/Handler;

    new-instance v1, Lio/fotoapparat/hardware/ExecutorKt$executeMainThread$1;

    invoke-direct {v1, p0}, Lio/fotoapparat/hardware/ExecutorKt$executeMainThread$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result p0

    return p0
.end method

.method public static final getFrameProcessingExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 17
    sget-object v0, Lio/fotoapparat/hardware/ExecutorKt;->frameProcessingExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static final getPendingResultExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 13
    sget-object v0, Lio/fotoapparat/hardware/ExecutorKt;->pendingResultExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
