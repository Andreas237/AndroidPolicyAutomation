.class public final Lkotlinx/coroutines/DispatchedTask$DefaultImpls;
.super Ljava/lang/Object;
.source "Dispatched.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/DispatchedTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatched.kt\nkotlinx/coroutines/DispatchedTask$DefaultImpls\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,275:1\n67#2,5:276\n*E\n*S KotlinDebug\n*F\n+ 1 Dispatched.kt\nkotlinx/coroutines/DispatchedTask$DefaultImpls\n*L\n227#1,5:276\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static getExceptionalResult(Lkotlinx/coroutines/DispatchedTask;Ljava/lang/Object;)Ljava/lang/Throwable;
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
            "Lkotlinx/coroutines/DispatchedTask<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 218
    instance-of p0, p1, Lkotlinx/coroutines/CompletedExceptionally;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p1, v0

    :cond_0
    check-cast p1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz p1, :cond_1

    iget-object v0, p1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    :cond_1
    return-object v0
.end method

.method public static getResumeMode(Lkotlinx/coroutines/DispatchedTask;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/DispatchedTask<",
            "-TT;>;)I"
        }
    .end annotation

    const/4 p0, 0x1

    return p0
.end method

.method public static getSuccessfulResult(Lkotlinx/coroutines/DispatchedTask;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T_I1:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/DispatchedTask<",
            "-TT_I1;>;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p1
.end method

.method public static run(Lkotlinx/coroutines/DispatchedTask;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/DispatchedTask<",
            "-TT;>;)V"
        }
    .end annotation

    .line 222
    :try_start_0
    invoke-interface {p0}, Lkotlinx/coroutines/DispatchedTask;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lkotlinx/coroutines/DispatchedContinuation;

    .line 223
    iget-object v1, v0, Lkotlinx/coroutines/DispatchedContinuation;->continuation:Lkotlin/coroutines/Continuation;

    .line 224
    invoke-interface {v1}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    .line 225
    invoke-interface {p0}, Lkotlinx/coroutines/DispatchedTask;->getResumeMode()I

    move-result v3

    invoke-static {v3}, Lkotlinx/coroutines/ResumeModeKt;->isCancellableMode(I)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/coroutines/Job;->Key:Lkotlinx/coroutines/Job$Key;

    check-cast v3, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v2, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lkotlinx/coroutines/Job;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 226
    :goto_0
    invoke-interface {p0}, Lkotlinx/coroutines/DispatchedTask;->takeState()Ljava/lang/Object;

    move-result-object v4

    .line 227
    iget-object v0, v0, Lkotlinx/coroutines/DispatchedContinuation;->countOrElement:Ljava/lang/Object;

    .line 276
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/ThreadContextKt;->updateThreadContext(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    .line 228
    :try_start_1
    invoke-interface {v3}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v5

    if-nez v5, :cond_1

    .line 229
    invoke-interface {v3}, Lkotlinx/coroutines/Job;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    .line 231
    :cond_1
    invoke-interface {p0, v4}, Lkotlinx/coroutines/DispatchedTask;->getExceptionalResult(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 233
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    .line 235
    :cond_2
    invoke-interface {p0, v4}, Lkotlinx/coroutines/DispatchedTask;->getSuccessfulResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 237
    :goto_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 280
    :try_start_2
    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/ThreadContextKt;->restoreThreadContext(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/ThreadContextKt;->restoreThreadContext(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    throw v1

    .line 222
    :cond_3
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 239
    new-instance v1, Lkotlinx/coroutines/DispatchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected exception running "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method
