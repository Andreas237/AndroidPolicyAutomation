.class public Lkotlinx/coroutines/CancellableContinuationImpl;
.super Lkotlinx/coroutines/AbstractContinuation;
.source "CancellableContinuation.kt"

# interfaces
.implements Lkotlinx/coroutines/CancellableContinuation;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/AbstractContinuation<",
        "TT;>;",
        "Lkotlinx/coroutines/CancellableContinuation<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 AbstractContinuation.kt\nkotlinx/coroutines/AbstractContinuation\n*L\n1#1,285:1\n186#2,2:286\n186#2,2:288\n*E\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n228#1,2:286\n248#1,2:288\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0011\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u0008\u0012\u0004\u0012\u0002H\u00010\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001b\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010\u0013\u001a\u0002H\u0001\"\u0004\u0008\u0001\u0010\u00012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0008\u0010\u0016\u001a\u00020\u0010H\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00028\u00002\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0019\u0010 \u001a\u00020\u0010*\u00020!2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u0010*\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u000b\u001a\u00020\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006$"
    }
    d2 = {
        "Lkotlinx/coroutines/CancellableContinuationImpl;",
        "T",
        "Lkotlinx/coroutines/AbstractContinuation;",
        "Lkotlinx/coroutines/CancellableContinuation;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "delegate",
        "Lkotlin/coroutines/Continuation;",
        "resumeMode",
        "",
        "(Lkotlin/coroutines/Continuation;I)V",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "getContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "completeResume",
        "",
        "token",
        "",
        "getSuccessfulResult",
        "state",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "initCancellability",
        "nameString",
        "",
        "tryResume",
        "value",
        "idempotent",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "tryResumeWithException",
        "exception",
        "",
        "resumeUndispatched",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V",
        "resumeUndispatchedWithException",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# instance fields
.field private final context:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;I)V
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;I)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/AbstractContinuation;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 221
    invoke-interface {p1}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/CancellableContinuationImpl;->context:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public completeResume(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    check-cast p1, Lkotlinx/coroutines/NotCompleted;

    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResumeMode()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lkotlinx/coroutines/CancellableContinuationImpl;->completeStateUpdate(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)V

    return-void
.end method

.method public getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 221
    iget-object v0, p0, Lkotlinx/coroutines/CancellableContinuationImpl;->context:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public getSuccessfulResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 272
    instance-of v0, p1, Lkotlinx/coroutines/CompletedIdempotentResult;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/CompletedIdempotentResult;

    iget-object p1, p1, Lkotlinx/coroutines/CompletedIdempotentResult;->result:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public initCancellability()V
    .locals 2

    .line 224
    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/Job;->Key:Lkotlinx/coroutines/Job$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/Job;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->initParentJobInternal$kotlinx_coroutines_core(Lkotlinx/coroutines/Job;)V

    return-void
.end method

.method protected nameString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CancellableContinuation("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-static {v1}, Lkotlinx/coroutines/DebugKt;->toDebugString(Lkotlin/coroutines/Continuation;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public resumeUndispatched(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V
    .locals 3
    .param p1    # Lkotlinx/coroutines/CoroutineDispatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/DispatchedContinuation;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Lkotlinx/coroutines/DispatchedContinuation;

    if-eqz v0, :cond_1

    .line 262
    iget-object v2, v0, Lkotlinx/coroutines/DispatchedContinuation;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResumeMode()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p2, p1}, Lkotlinx/coroutines/CancellableContinuationImpl;->resumeImpl(Ljava/lang/Object;I)V

    return-void
.end method

.method public resumeUndispatchedWithException(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Lkotlinx/coroutines/CoroutineDispatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/DispatchedContinuation;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Lkotlinx/coroutines/DispatchedContinuation;

    .line 267
    new-instance v1, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {v1, p2}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    if-eqz v0, :cond_1

    iget-object v2, v0, Lkotlinx/coroutines/DispatchedContinuation;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResumeMode()I

    move-result p1

    :goto_0
    invoke-virtual {p0, v1, p1}, Lkotlinx/coroutines/CancellableContinuationImpl;->resumeImpl(Ljava/lang/Object;I)V

    return-void
.end method

.method public tryResume(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 287
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 230
    instance-of v1, v0, Lkotlinx/coroutines/NotCompleted;

    if-eqz v1, :cond_2

    if-nez p2, :cond_1

    move-object v1, p1

    goto :goto_0

    .line 232
    :cond_1
    new-instance v1, Lkotlinx/coroutines/CompletedIdempotentResult;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/NotCompleted;

    invoke-direct {v1, p2, p1, v2}, Lkotlinx/coroutines/CompletedIdempotentResult;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/NotCompleted;)V

    .line 233
    :goto_0
    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/NotCompleted;

    invoke-virtual {p0, v2, v1}, Lkotlinx/coroutines/CancellableContinuationImpl;->tryUpdateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 235
    :cond_2
    instance-of v1, v0, Lkotlinx/coroutines/CompletedIdempotentResult;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 236
    check-cast v0, Lkotlinx/coroutines/CompletedIdempotentResult;

    iget-object v1, v0, Lkotlinx/coroutines/CompletedIdempotentResult;->idempotentResume:Ljava/lang/Object;

    if-ne v1, p2, :cond_5

    .line 237
    iget-object p2, v0, Lkotlinx/coroutines/CompletedIdempotentResult;->result:Ljava/lang/Object;

    if-ne p2, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    .line 238
    iget-object p1, v0, Lkotlinx/coroutines/CompletedIdempotentResult;->token:Lkotlinx/coroutines/NotCompleted;

    return-object p1

    .line 237
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Non-idempotent resume"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_5
    return-object v2

    :cond_6
    return-object v2
.end method

.method public tryResumeWithException(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 250
    instance-of v1, v0, Lkotlinx/coroutines/NotCompleted;

    if-eqz v1, :cond_1

    .line 251
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/NotCompleted;

    new-instance v2, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {v2, p1}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;->tryUpdateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
