.class final Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AvailabilityZoneRefresher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;-><init>(Lokhttp3/Call$Factory;JLkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V
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
    c = "io/streamroot/dna/core/backend/AvailabilityZoneRefresher$1"
    f = "AvailabilityZoneRefresher.kt"
    i = {}
    l = {
        0x24,
        0x36,
        0x37
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

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

    new-instance v0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;

    iget-object v1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;-><init>(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 36
    iget v1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 59
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :pswitch_0
    iget-object v1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :pswitch_1
    iget-object v1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    :try_start_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    move-object p1, p0

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v2, p1

    move-object p1, p0

    goto :goto_2

    :pswitch_2
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    move-object v1, p1

    :cond_2
    move-object p1, p0

    .line 37
    :cond_3
    :goto_0
    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 40
    :try_start_2
    iget-object v2, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    invoke-static {v2}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->access$getCallFactory$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lokhttp3/Call$Factory;

    move-result-object v2

    .line 41
    iget-object v3, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    invoke-static {v3}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->access$getDelaySequence$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lkotlin/sequences/Sequence;

    move-result-object v3

    .line 42
    iget-object v4, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    invoke-static {v4}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->access$getRequest$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lokhttp3/Request;

    move-result-object v4

    .line 43
    new-instance v5, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1$1;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    iput-object v1, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->label:I

    .line 39
    invoke-static {v2, v3, v4, v5, p1}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    return-object v0

    .line 54
    :cond_4
    :goto_1
    iget-object v2, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->this$0:Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    invoke-static {v2}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->access$getRefreshTime$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)J

    move-result-wide v2

    iput-object v1, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;->label:I

    invoke-static {v2, v3, p1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v2, v0, :cond_3

    return-object v0

    :catch_1
    move-exception v2

    .line 56
    :goto_2
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v4, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v4, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v3, :cond_3

    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 59
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
