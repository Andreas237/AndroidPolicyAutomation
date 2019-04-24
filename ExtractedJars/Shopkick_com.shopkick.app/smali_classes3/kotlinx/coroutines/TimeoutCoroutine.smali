.class Lkotlinx/coroutines/TimeoutCoroutine;
.super Lkotlinx/coroutines/AbstractCoroutine;
.source "Timeout.kt"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lkotlin/coroutines/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        "T::TU;>",
        "Lkotlinx/coroutines/AbstractCoroutine<",
        "TT;>;",
        "Ljava/lang/Runnable;",
        "Lkotlin/coroutines/Continuation<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0012\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\n\u0008\u0001\u0010\u0002 \u0000*\u0002H\u00012\u0008\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u00052\u0008\u0012\u0004\u0012\u0002H\u00020\u0006B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\nJ\r\u0010\u000f\u001a\u00020\u0010H\u0010\u00a2\u0006\u0002\u0008\u0011J\'\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0010\u00a2\u0006\u0002\u0008\u0019J\u0008\u0010\u001a\u001a\u00020\u0013H\u0016R\u0014\u0010\u000b\u001a\u00020\u000c8PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0010\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lkotlinx/coroutines/TimeoutCoroutine;",
        "U",
        "T",
        "Lkotlinx/coroutines/AbstractCoroutine;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "Lkotlin/coroutines/Continuation;",
        "time",
        "",
        "uCont",
        "(JLkotlin/coroutines/Continuation;)V",
        "defaultResumeMode",
        "",
        "getDefaultResumeMode$kotlinx_coroutines_core",
        "()I",
        "nameString",
        "",
        "nameString$kotlinx_coroutines_core",
        "onCompletionInternal",
        "",
        "state",
        "",
        "mode",
        "suppressed",
        "",
        "onCompletionInternal$kotlinx_coroutines_core",
        "run",
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
.field public final time:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final uCont:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TU;>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLkotlin/coroutines/Continuation;)V
    .locals 2
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-TU;>;)V"
        }
    .end annotation

    const-string v0, "uCont"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-interface {p3}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/AbstractCoroutine;-><init>(Lkotlin/coroutines/CoroutineContext;Z)V

    iput-wide p1, p0, Lkotlinx/coroutines/TimeoutCoroutine;->time:J

    iput-object p3, p0, Lkotlinx/coroutines/TimeoutCoroutine;->uCont:Lkotlin/coroutines/Continuation;

    return-void
.end method


# virtual methods
.method public getDefaultResumeMode$kotlinx_coroutines_core()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public nameString$kotlinx_coroutines_core()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lkotlinx/coroutines/AbstractCoroutine;->nameString$kotlinx_coroutines_core()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lkotlinx/coroutines/TimeoutCoroutine;->time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onCompletionInternal$kotlinx_coroutines_core(Ljava/lang/Object;IZ)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 93
    instance-of p3, p1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz p3, :cond_0

    .line 94
    iget-object p3, p0, Lkotlinx/coroutines/TimeoutCoroutine;->uCont:Lkotlin/coroutines/Continuation;

    check-cast p1, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object p1, p1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    invoke-static {p3, p1, p2}, Lkotlinx/coroutines/ResumeModeKt;->resumeUninterceptedWithExceptionMode(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;I)V

    goto :goto_0

    .line 96
    :cond_0
    iget-object p3, p0, Lkotlinx/coroutines/TimeoutCoroutine;->uCont:Lkotlin/coroutines/Continuation;

    invoke-static {p3, p1, p2}, Lkotlinx/coroutines/ResumeModeKt;->resumeUninterceptedMode(Lkotlin/coroutines/Continuation;Ljava/lang/Object;I)V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 3

    .line 88
    iget-wide v0, p0, Lkotlinx/coroutines/TimeoutCoroutine;->time:J

    move-object v2, p0

    check-cast v2, Lkotlinx/coroutines/Job;

    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/TimeoutKt;->TimeoutCancellationException(JLkotlinx/coroutines/Job;)Lkotlinx/coroutines/TimeoutCancellationException;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/TimeoutCoroutine;->cancel(Ljava/lang/Throwable;)Z

    return-void
.end method
