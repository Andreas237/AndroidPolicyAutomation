.class public abstract Lkotlinx/coroutines/ThreadEventLoop;
.super Lkotlinx/coroutines/EventLoopBase;
.source "EventLoop.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEventLoop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.kt\nkotlinx/coroutines/ThreadEventLoop\n*L\n1#1,345:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008 \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0014J\u0006\u0010\u0007\u001a\u00020\u0008J\u0008\u0010\t\u001a\u00020\u0008H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlinx/coroutines/ThreadEventLoop;",
        "Lkotlinx/coroutines/EventLoopBase;",
        "thread",
        "Ljava/lang/Thread;",
        "(Ljava/lang/Thread;)V",
        "isCorrectThread",
        "",
        "shutdown",
        "",
        "unpark",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final thread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 1
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "thread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    invoke-direct {p0}, Lkotlinx/coroutines/EventLoopBase;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/ThreadEventLoop;->thread:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected isCorrectThread()Z
    .locals 2

    .line 324
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/ThreadEventLoop;->thread:Ljava/lang/Thread;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final shutdown()V
    .locals 5

    .line 332
    invoke-virtual {p0}, Lkotlinx/coroutines/ThreadEventLoop;->closeQueue()V

    .line 333
    invoke-virtual {p0}, Lkotlinx/coroutines/ThreadEventLoop;->isCorrectThread()Z

    move-result v0

    sget-boolean v1, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    const-string v0, "Assertion failed"

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 335
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/ThreadEventLoop;->processNextEvent()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    goto :goto_0

    .line 337
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/ThreadEventLoop;->rescheduleAllDelayed()V

    return-void
.end method

.method protected unpark()V
    .locals 2

    .line 327
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/ThreadEventLoop;->thread:Ljava/lang/Thread;

    if-eq v0, v1, :cond_0

    .line 328
    invoke-static {}, Lkotlinx/coroutines/TimeSourceKt;->getTimeSource()Lkotlinx/coroutines/TimeSource;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/ThreadEventLoop;->thread:Ljava/lang/Thread;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/TimeSource;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
