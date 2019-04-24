.class public final Lkotlinx/coroutines/BlockingEventLoop;
.super Lkotlinx/coroutines/ThreadEventLoop;
.source "EventLoop.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlinx/coroutines/BlockingEventLoop;",
        "Lkotlinx/coroutines/ThreadEventLoop;",
        "thread",
        "Ljava/lang/Thread;",
        "(Ljava/lang/Thread;)V",
        "isCompleted",
        "",
        "()Z",
        "setCompleted",
        "(Z)V",
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
.field private volatile isCompleted:Z


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 1
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "thread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    invoke-direct {p0, p1}, Lkotlinx/coroutines/ThreadEventLoop;-><init>(Ljava/lang/Thread;)V

    return-void
.end method


# virtual methods
.method public isCompleted()Z
    .locals 1

    .line 343
    iget-boolean v0, p0, Lkotlinx/coroutines/BlockingEventLoop;->isCompleted:Z

    return v0
.end method

.method public setCompleted(Z)V
    .locals 0

    .line 343
    iput-boolean p1, p0, Lkotlinx/coroutines/BlockingEventLoop;->isCompleted:Z

    return-void
.end method
