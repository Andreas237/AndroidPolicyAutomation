.class final Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SignalingConnection.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->onFailure(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
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
    c = "io/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1"
    f = "SignalingConnection.kt"
    i = {}
    l = {
        0x68,
        0x6a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

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

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;-><init>(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 104
    iget v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 112
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 104
    :pswitch_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    move-object p1, v0

    goto :goto_0

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 105
    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-static {v1}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->access$getExponentialBackoff$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->label:I

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    .line 107
    :cond_2
    :goto_0
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->access$getReconnectionCounter$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 108
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->access$getWebSocketRef$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-static {v1}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->access$getWebSocketFactory$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Lokhttp3/WebSocket$Factory;

    move-result-object v1

    new-instance v2, Lokhttp3/Request$Builder;

    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    invoke-static {v3}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->access$getSignalingUrl$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Lokhttp3/HttpUrl;

    move-result-object v3

    invoke-virtual {v2, v3}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v2

    iget-object v3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;->this$0:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    check-cast v3, Lokhttp3/WebSocketListener;

    invoke-interface {v1, v2, v3}, Lokhttp3/WebSocket$Factory;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/WebSocket;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lokhttp3/WebSocket;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 110
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    sget-object v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v2, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, p1, v0}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 112
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
