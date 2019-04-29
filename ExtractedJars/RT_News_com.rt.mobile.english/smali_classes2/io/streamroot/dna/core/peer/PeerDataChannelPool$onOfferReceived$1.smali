.class final Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PeerDataChannelPool.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onOfferReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeerDataChannelPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeerDataChannelPool.kt\nio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n241#2,2:289\n*E\n*S KotlinDebug\n*F\n+ 1 PeerDataChannelPool.kt\nio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1\n*L\n160#1,2:289\n*E\n"
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
    c = "io/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1"
    f = "PeerDataChannelPool.kt"
    i = {}
    l = {
        0x9d,
        0xa3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $connectionId:Ljava/lang/String;

.field final synthetic $senderId:Ljava/lang/String;

.field final synthetic $sessionDescription:Ljava/lang/String;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$sessionDescription:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;

    iget-object v2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    iget-object v3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    iget-object v4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    iget-object v5, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$sessionDescription:Ljava/lang/String;

    move-object v1, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 157
    iget v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    .line 181
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 157
    :pswitch_0
    :try_start_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_3

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 159
    :try_start_1
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getDataChannelPool$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 160
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getDataChannelPool$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v1, "dataChannelPool.values"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 289
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/streamroot/dna/core/peer/PeerDataChannel;

    .line 160
    invoke-interface {v4}, Lio/streamroot/dna/core/peer/PeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_4

    .line 161
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getPeerConnectionHandler$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    move-result-object p1

    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    const/4 v4, 0x1

    iput v4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->label:I

    invoke-virtual {p1, v1, p0}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onOfferReceived(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 157
    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 163
    new-instance p1, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;

    .line 164
    iget-object v5, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    .line 165
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    move-object v6, v0

    check-cast v6, Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    .line 166
    iget-object v7, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    .line 167
    iget-object v8, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$sessionDescription:Ljava/lang/String;

    .line 168
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getTimeout$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)J

    move-result-wide v9

    .line 169
    new-instance v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1$peerDataChannel$1;

    invoke-direct {v0, p0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1$peerDataChannel$1;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;)V

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    .line 163
    invoke-direct/range {v4 .. v11}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V

    .line 173
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getDataChannelPool$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->connectionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 175
    :cond_4
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getSignalingConnection$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->sendAnswer(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 178
    :goto_1
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getErrorAggregator$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/error/ErrorAggregator;

    move-result-object v0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 179
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getSignalingConnection$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$senderId:Ljava/lang/String;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;->$connectionId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->sendAnswer(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 181
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
