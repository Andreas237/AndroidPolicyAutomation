.class public final Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;
.super Ljava/lang/Object;
.source "CircuitBreakers.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCircuitBreakers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircuitBreakers.kt\nio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt\n*L\n1#1,96:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u001a]\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\u0008\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082$\u0010\t\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a\u0093\u0001\u0010\u000f\u001a\u0004\u0018\u0001H\u0001\"\u0004\u0008\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152$\u0010\t\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u001a?\u0010\u0018\u001a\u0002H\u0019\"\u0004\u0008\u0000\u0010\u0019*\u00020\u000b2\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00190\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "executeHttpRequest",
        "T",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "request",
        "Lokhttp3/Request;",
        "block",
        "Lkotlin/Function2;",
        "Lokhttp3/Response;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeZonedHttpRequest",
        "forceRefreshOnFailure",
        "",
        "buildRequest",
        "",
        "failureBlock",
        "Lkotlin/Function0;",
        "",
        "(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "suspendUse",
        "R",
        "(Lokhttp3/Response;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lokhttp3/Call$Factory;",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lokhttp3/Request;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lokhttp3/Response;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p4, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;

    iget v1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;

    invoke-direct {v0, p4}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 12
    iget v2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast p0, Lokhttp3/Response;

    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function2;

    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast p0, Lokhttp3/Request;

    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast p0, Lkotlin/sequences/Sequence;

    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lokhttp3/Call$Factory;

    instance-of p0, p4, Lkotlin/Result$Failure;

    if-eqz p0, :cond_1

    check-cast p4, Lkotlin/Result$Failure;

    iget-object p0, p4, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p0

    :cond_1
    move-object v3, p4

    goto/16 :goto_3

    :pswitch_1
    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    iget-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lokhttp3/Response;

    iget-object p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function2;

    iget-object p3, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast p3, Lokhttp3/Request;

    iget-object v2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/sequences/Sequence;

    iget-object v4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lokhttp3/Call$Factory;

    instance-of v5, p4, Lkotlin/Result$Failure;

    if-eqz v5, :cond_2

    check-cast p4, Lkotlin/Result$Failure;

    iget-object p0, p4, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p0

    :cond_2
    move-object p4, p2

    move-object p2, p3

    move-object p3, v2

    move-object v2, v1

    move-object v1, p1

    move-object p1, v4

    goto :goto_1

    :pswitch_2
    instance-of v2, p4, Lkotlin/Result$Failure;

    if-eqz v2, :cond_3

    check-cast p4, Lkotlin/Result$Failure;

    iget-object p0, p4, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p0

    .line 18
    :cond_3
    move-object p4, v3

    check-cast p4, Lokhttp3/Response;

    .line 19
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v7, p1

    move-object p1, p0

    move-object p0, v2

    move-object v2, v1

    move-object v1, p4

    move-object p4, p3

    move-object p3, v7

    .line 20
    :cond_4
    :goto_1
    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-static {v4}, Lkotlinx/coroutines/JobKt;->isActive(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 22
    :try_start_0
    invoke-interface {p1, p2}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v4

    invoke-interface {v4}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v4

    .line 23
    invoke-virtual {v4}, Lokhttp3/Response;->code()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v6, 0x1f4

    if-ge v5, v6, :cond_5

    move-object v1, v4

    goto :goto_2

    :catch_0
    move-exception v4

    .line 28
    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v5

    sget-object v6, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v6, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v5, v6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v5

    check-cast v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v5, :cond_5

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v6

    check-cast v4, Ljava/lang/Throwable;

    invoke-virtual {v5, v6, v4}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 31
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    iput-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$5:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_4

    return-object v2

    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    .line 34
    iput-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->L$5:Ljava/lang/Object;

    const/4 p0, 0x2

    iput p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    invoke-static {v1, p4, v0}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->suspendUse(Lokhttp3/Response;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_1

    return-object v2

    :cond_7
    :goto_3
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final executeZonedHttpRequest(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lokhttp3/Call$Factory;",
            "Z",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lokhttp3/Request;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lokhttp3/Response;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p3

    move-object/from16 v2, p6

    instance-of v3, v2, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;

    iget v4, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;

    invoke-direct {v3, v2}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 37
    iget v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Response;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Request;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlin/sequences/Sequence;

    iget-boolean v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Call$Factory;

    instance-of v1, v2, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v1, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v1

    :cond_1
    move-object v6, v2

    goto/16 :goto_11

    :pswitch_1
    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Response;

    iget-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    check-cast v8, Lokhttp3/Request;

    iget-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast v10, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    iget-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/functions/Function2;

    iget-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/functions/Function0;

    iget-object v13, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast v13, Lkotlin/jvm/functions/Function2;

    iget-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v14, Lkotlin/sequences/Sequence;

    iget-boolean v15, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iget-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lokhttp3/Call$Factory;

    instance-of v7, v2, Lkotlin/Result$Failure;

    if-eqz v7, :cond_2

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v1, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v1

    :cond_2
    move-object v2, v1

    move-object v7, v9

    move-object v9, v11

    move-object v1, v12

    move-object v11, v13

    move-object v12, v14

    const/16 v16, 0x1

    :goto_1
    move-object v14, v6

    move-object v6, v8

    move-object v8, v10

    move v10, v15

    goto/16 :goto_f

    :pswitch_2
    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$10:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Response;

    iget-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    check-cast v6, Lokhttp3/Request;

    iget-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast v8, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    iget-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function2;

    iget-object v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/functions/Function0;

    iget-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/functions/Function2;

    iget-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lkotlin/sequences/Sequence;

    iget-boolean v13, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iget-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lokhttp3/Call$Factory;

    :try_start_0
    instance-of v15, v2, Lkotlin/Result$Failure;

    if-eqz v15, :cond_3

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    const/16 v16, 0x1

    goto/16 :goto_8

    :pswitch_3
    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$10:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Response;

    iget-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    check-cast v6, Lokhttp3/Request;

    iget-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast v8, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    iget-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function2;

    iget-object v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/functions/Function0;

    iget-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/functions/Function2;

    iget-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lkotlin/sequences/Sequence;

    iget-boolean v13, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iget-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lokhttp3/Call$Factory;

    :try_start_1
    instance-of v15, v2, Lkotlin/Result$Failure;

    if-eqz v15, :cond_4

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_4
    move-object/from16 v23, v2

    move-object v2, v1

    move v1, v13

    move-object/from16 v13, v23

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object v2, v1

    :goto_2
    const/16 v16, 0x1

    :goto_3
    move-object v1, v0

    goto/16 :goto_d

    :pswitch_4
    iget-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    iget-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iget-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function0;

    iget-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function2;

    iget-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lkotlin/sequences/Sequence;

    iget-boolean v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iget-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lokhttp3/Call$Factory;

    instance-of v12, v2, Lkotlin/Result$Failure;

    if-eqz v12, :cond_5

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v1, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v1

    :cond_5
    move-object/from16 v23, v2

    move-object v2, v1

    move-object v1, v8

    move-object/from16 v8, v23

    goto :goto_4

    :pswitch_5
    instance-of v5, v2, Lkotlin/Result$Failure;

    if-eqz v5, :cond_6

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v1, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v1

    .line 45
    :cond_6
    invoke-interface {v3}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    sget-object v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v5, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v2, v5}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v5, :cond_11

    .line 47
    invoke-virtual {v5}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->getAvailabilityZone()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v11, p0

    .line 48
    iput-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    move/from16 v10, p1

    iput-boolean v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    move-object/from16 v9, p2

    iput-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    move-object/from16 v7, p4

    iput-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    move-object/from16 v6, p5

    iput-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    iput-object v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    invoke-interface {v1, v2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_7

    return-object v4

    .line 49
    :cond_7
    :goto_4
    check-cast v8, Lokhttp3/Request;

    invoke-interface {v9}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v13, 0x0

    .line 50
    move-object v14, v13

    check-cast v14, Lokhttp3/Response;

    move-object/from16 v23, v11

    move-object v11, v1

    move-object v1, v7

    move-object v7, v2

    move-object v2, v14

    move-object/from16 v14, v23

    move-object/from16 v24, v8

    move-object v8, v5

    move-object v5, v12

    move-object v12, v9

    move-object v9, v6

    move-object/from16 v6, v24

    .line 51
    :goto_5
    invoke-interface {v3}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v15

    invoke-static {v15}, Lkotlinx/coroutines/JobKt;->isActive(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_f

    .line 53
    :try_start_2
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->getAvailabilityZone()Ljava/lang/String;

    move-result-object v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    if-eqz v10, :cond_9

    .line 55
    :try_start_3
    iput-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-boolean v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iput-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    iput-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    iput-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    iput-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    iput-object v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    iput-object v15, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$10:Ljava/lang/Object;

    const/4 v13, 0x2

    iput v13, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    invoke-interface {v11, v15, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v13, v4, :cond_8

    return-object v4

    :cond_8
    move/from16 v23, v10

    move-object v10, v1

    move/from16 v1, v23

    .line 56
    :goto_6
    :try_start_4
    check-cast v13, Lokhttp3/Request;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-object v6, v13

    const/16 v16, 0x1

    move v13, v1

    :goto_7
    move-object v1, v2

    goto/16 :goto_a

    :catch_1
    move-exception v0

    move v13, v1

    goto/16 :goto_2

    :catch_2
    move-exception v0

    move v13, v10

    const/16 v16, 0x1

    goto/16 :goto_c

    :cond_9
    :try_start_5
    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    const/16 v16, 0x1

    xor-int/lit8 v13, v13, 0x1

    if-eqz v13, :cond_b

    .line 58
    :try_start_6
    invoke-interface {v12}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v7
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 59
    :try_start_7
    iput-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-boolean v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iput-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    iput-object v15, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    iput-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    iput-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    iput-object v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    iput-object v15, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$10:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    invoke-interface {v11, v15, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    if-ne v5, v4, :cond_a

    return-object v4

    :cond_a
    move v13, v10

    move-object v10, v1

    move-object v1, v2

    move-object v2, v5

    move-object v5, v7

    move-object v7, v15

    .line 60
    :goto_8
    :try_start_8
    check-cast v2, Lokhttp3/Request;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    move-object v6, v2

    goto :goto_a

    :catch_3
    move-exception v0

    move-object v2, v1

    goto/16 :goto_3

    :catch_4
    move-exception v0

    move-object v5, v7

    goto :goto_9

    :catch_5
    move-exception v0

    :goto_9
    move v13, v10

    move-object v7, v15

    goto :goto_c

    :cond_b
    move v13, v10

    move-object v10, v1

    goto :goto_7

    .line 62
    :goto_a
    :try_start_9
    invoke-interface {v14, v6}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v2

    invoke-interface {v2}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v2

    .line 63
    invoke-virtual {v2}, Lokhttp3/Response;->code()I

    move-result v15
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    move-object/from16 v19, v1

    const/16 v1, 0x1f4

    if-ge v15, v1, :cond_c

    move-object v1, v10

    move v10, v13

    goto/16 :goto_10

    .line 68
    :cond_c
    :try_start_a
    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    move v15, v13

    move-object/from16 v1, v19

    goto :goto_e

    :catch_6
    move-exception v0

    goto :goto_b

    :catch_7
    move-exception v0

    move-object/from16 v19, v1

    :goto_b
    move-object v1, v0

    move-object/from16 v2, v19

    goto :goto_d

    :catch_8
    move-exception v0

    const/16 v16, 0x1

    move v13, v10

    :goto_c
    move-object v10, v1

    goto/16 :goto_3

    .line 70
    :goto_d
    invoke-interface {v3}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v15

    sget-object v17, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    move-object/from16 v20, v2

    move-object/from16 v2, v17

    check-cast v2, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v15, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v2, :cond_d

    invoke-interface {v3}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v15

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v2, v15, v1}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :cond_d
    move v15, v13

    move-object/from16 v1, v20

    :goto_e
    move-object v13, v11

    move-object v11, v9

    move-object v9, v7

    move-object/from16 v23, v8

    move-object v8, v6

    move-object v6, v14

    move-object v14, v12

    move-object v12, v10

    move-object/from16 v10, v23

    .line 73
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    move-object/from16 v21, v1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iput-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-boolean v15, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iput-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object v13, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    iput-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    iput-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    iput-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    move-object/from16 v7, v21

    iput-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    move-object/from16 v22, v5

    const/4 v5, 0x4

    iput v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_e

    return-object v4

    :cond_e
    move-object v2, v7

    move-object v7, v9

    move-object v9, v11

    move-object v1, v12

    move-object v11, v13

    move-object v12, v14

    move-object/from16 v5, v22

    goto/16 :goto_1

    :goto_f
    const/4 v13, 0x0

    goto/16 :goto_5

    :cond_f
    :goto_10
    if-eqz v2, :cond_10

    .line 76
    iput-object v14, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$0:Ljava/lang/Object;

    iput-boolean v10, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->Z$0:Z

    iput-object v12, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$5:Ljava/lang/Object;

    iput-object v7, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$6:Ljava/lang/Object;

    iput-object v6, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$7:Ljava/lang/Object;

    iput-object v5, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$8:Ljava/lang/Object;

    iput-object v2, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->L$9:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v3, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    invoke-static {v2, v9, v3}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->suspendUse(Lokhttp3/Response;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1

    return-object v4

    :goto_11
    move-object/from16 v18, v6

    goto :goto_12

    :cond_10
    const/16 v18, 0x0

    :goto_12
    return-object v18

    .line 46
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You tried to execute a Zoned http request but the backend context was missing"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic executeZonedHttpRequest$default(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    move v1, p1

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_1

    .line 42
    sget-object p1, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$2;->INSTANCE:Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$2;

    move-object p4, p1

    check-cast p4, Lkotlin/jvm/functions/Function0;

    :cond_1
    move-object v4, p4

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static final synthetic suspendUse(Lokhttp3/Response;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lokhttp3/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lokhttp3/Response;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lokhttp3/Response;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;

    iget v1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;

    invoke-direct {v0, p2}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 79
    iget v2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->label:I

    packed-switch v2, :pswitch_data_0

    .line 95
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 79
    :pswitch_0
    iget-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$2:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    iget-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iget-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lokhttp3/Response;

    :try_start_0
    instance-of v0, p2, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p2, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p2
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_4

    :catch_0
    move-exception p0

    goto :goto_3

    :pswitch_1
    instance-of v2, p2, Lkotlin/Result$Failure;

    if-eqz v2, :cond_2

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p0, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p0

    :cond_2
    const/4 p2, 0x0

    .line 80
    check-cast p2, Ljava/lang/Throwable;

    .line 82
    :try_start_1
    iput-object p0, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$suspendUse$1;->label:I

    invoke-interface {p1, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v3, p2

    move-object p2, p0

    move-object p0, v3

    :goto_1
    if-nez p0, :cond_4

    .line 88
    invoke-virtual {p2}, Lokhttp3/Response;->close()V

    goto :goto_2

    .line 90
    :cond_4
    :try_start_2
    invoke-virtual {p2}, Lokhttp3/Response;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    .line 92
    invoke-static {p0, p2}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_2
    return-object p1

    :catchall_1
    move-exception p1

    move-object v3, p2

    move-object p2, p0

    move-object p0, v3

    goto :goto_4

    :catch_2
    move-exception p1

    move-object v3, p1

    move-object p1, p0

    move-object p0, v3

    .line 85
    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    if-nez p0, :cond_5

    .line 88
    invoke-virtual {p2}, Lokhttp3/Response;->close()V

    goto :goto_5

    .line 90
    :cond_5
    :try_start_4
    invoke-virtual {p2}, Lokhttp3/Response;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_5

    :catch_3
    move-exception p2

    .line 92
    invoke-static {p0, p2}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 94
    :goto_5
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
