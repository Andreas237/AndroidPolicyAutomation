.class public final Lio/fotoapparat/result/PendingResult$Companion;
.super Ljava/lang/Object;
.source "PendingResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/result/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\u0008\u0001\u0010\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/fotoapparat/result/PendingResult$Companion;",
        "",
        "()V",
        "fromFuture",
        "Lio/fotoapparat/result/PendingResult;",
        "T",
        "future",
        "Ljava/util/concurrent/Future;",
        "logger",
        "Lio/fotoapparat/log/Logger;",
        "fromFuture$fotoapparat_release",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lio/fotoapparat/result/PendingResult$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromFuture$fotoapparat_release(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;)Lio/fotoapparat/result/PendingResult;
    .locals 3
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TT;>;",
            "Lio/fotoapparat/log/Logger;",
            ")",
            "Lio/fotoapparat/result/PendingResult<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "future"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    new-instance v0, Lio/fotoapparat/result/PendingResult;

    .line 114
    invoke-static {}, Lio/fotoapparat/hardware/ExecutorKt;->getPendingResultExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const-string v2, "pendingResultExecutor"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/concurrent/Executor;

    .line 111
    invoke-direct {v0, p1, p2, v1}, Lio/fotoapparat/result/PendingResult;-><init>(Ljava/util/concurrent/Future;Lio/fotoapparat/log/Logger;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
