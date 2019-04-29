.class final Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "TrackerInteractor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeer(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1"
    f = "TrackerInteractor.kt"
    i = {}
    l = {
        0x4c,
        0x5c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/tracker/TrackerInteractor;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/tracker/TrackerInteractor;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->this$0:Lio/streamroot/dna/core/tracker/TrackerInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;

    iget-object v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->this$0:Lio/streamroot/dna/core/tracker/TrackerInteractor;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 76
    iget v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 95
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :pswitch_0
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    goto :goto_0

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 79
    :try_start_1
    iget-object v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->this$0:Lio/streamroot/dna/core/tracker/TrackerInteractor;

    invoke-static {v1}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->access$getCallFactory$p(Lio/streamroot/dna/core/tracker/TrackerInteractor;)Lokhttp3/Call$Factory;

    move-result-object v2

    const/4 v3, 0x1

    .line 81
    iget-object v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->this$0:Lio/streamroot/dna/core/tracker/TrackerInteractor;

    invoke-static {v1}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->access$getDelaySequence$p(Lio/streamroot/dna/core/tracker/TrackerInteractor;)Lkotlin/sequences/Sequence;

    move-result-object v4

    .line 82
    new-instance v1, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$1;

    const/4 v5, 0x0

    invoke-direct {v1, p0, v5}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$1;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 83
    new-instance v6, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$2;

    invoke-direct {v6, p0}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$2;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;)V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 84
    new-instance v7, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$3;

    invoke-direct {v7, p0, v5}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1$3;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;Lkotlin/coroutines/Continuation;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;->label:I

    move-object v5, v1

    move-object v8, p0

    .line 78
    invoke-static/range {v2 .. v8}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v1, v0, :cond_1

    return-object v0

    :catch_1
    move-exception v0

    .line 93
    :goto_0
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    sget-object v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v2, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, p1, v0}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 95
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
