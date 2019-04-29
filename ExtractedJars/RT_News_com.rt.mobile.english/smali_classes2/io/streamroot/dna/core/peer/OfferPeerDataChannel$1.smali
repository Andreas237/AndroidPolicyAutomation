.class final Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "OfferPeerDataChannel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/peer/OfferPeerDataChannel;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V
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
    c = "io/streamroot/dna/core/peer/OfferPeerDataChannel$1"
    f = "OfferPeerDataChannel.kt"
    i = {}
    l = {
        0x26,
        0x28
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $connectionId:Ljava/lang/String;

.field final synthetic $peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

.field final synthetic $remotePeerId:Ljava/lang/String;

.field final synthetic $timeout:J

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(JLio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-wide p1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$timeout:J

    iput-object p3, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$connectionId:Ljava/lang/String;

    iput-object p5, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$remotePeerId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;

    iget-wide v2, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$timeout:J

    iget-object v4, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    iget-object v5, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$connectionId:Ljava/lang/String;

    iget-object v6, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$remotePeerId:Ljava/lang/String;

    move-object v1, v0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;-><init>(JLio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 38
    iget v1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 45
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :pswitch_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->L$0:Ljava/lang/Object;

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
    iget-object p1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 39
    iget-wide v1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$timeout:J

    iput-object p1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->label:I

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    .line 41
    :cond_2
    :goto_0
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$connectionId:Ljava/lang/String;

    iget-object v2, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;->$remotePeerId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelTimeout(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 43
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

    .line 45
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
