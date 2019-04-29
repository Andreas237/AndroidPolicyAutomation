.class final Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DefaultQosModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/media/DefaultQosModule;-><init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/CoroutineContext;)V
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
    value = "SMAP\nDefaultQosModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultQosModule.kt\nio/streamroot/dna/core/media/DefaultQosModule$qosJob$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1469#2,3:66\n*E\n*S KotlinDebug\n*F\n+ 1 DefaultQosModule.kt\nio/streamroot/dna/core/media/DefaultQosModule$qosJob$1\n*L\n34#1,3:66\n*E\n"
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
    c = "io/streamroot/dna/core/media/DefaultQosModule$qosJob$1"
    f = "DefaultQosModule.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x15,
        0x18,
        0x1c,
        0x19
    }
    m = "invokeSuspend"
    n = {
        "errorMargin",
        "errorMargin",
        "previousPlaybackPosition",
        "previousPlaybackState",
        "errorMargin",
        "previousPlaybackPosition",
        "previousPlaybackState"
    }
    s = {
        "I$0",
        "I$0",
        "J$0",
        "L$1",
        "I$0",
        "J$0",
        "L$1"
    }
.end annotation


# instance fields
.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/media/DefaultQosModule;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/media/DefaultQosModule;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->this$0:Lio/streamroot/dna/core/media/DefaultQosModule;

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

    new-instance v0, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;

    iget-object v1, p0, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->this$0:Lio/streamroot/dna/core/media/DefaultQosModule;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;-><init>(Lio/streamroot/dna/core/media/DefaultQosModule;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 21
    iget v4, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->label:I

    const/4 v5, 0x1

    packed-switch v4, :pswitch_data_0

    .line 55
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 21
    :pswitch_0
    iget-object v4, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/streamroot/dna/core/PlaybackState;

    iget-wide v6, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->J$0:J

    iget v8, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iget-object v9, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/CoroutineScope;

    instance-of v10, v2, Lkotlin/Result$Failure;

    if-eqz v10, :cond_3

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :pswitch_1
    iget-object v4, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/streamroot/dna/core/PlaybackState;

    iget-wide v6, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->J$0:J

    iget v8, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iget-object v9, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v10, v2, Lkotlin/Result$Failure;

    if-eqz v10, :cond_0

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    move-object v10, v4

    move-object v4, v3

    move-object v3, v1

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object/from16 v17, v0

    move-object v10, v4

    move-object v4, v3

    move-object v3, v1

    goto/16 :goto_7

    :pswitch_2
    iget v4, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iget-object v6, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    instance-of v7, v2, Lkotlin/Result$Failure;

    if-eqz v7, :cond_2

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :pswitch_3
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_1

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :cond_1
    iget-object v6, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    const-wide v7, 0x4097700000000000L    # 1500.0

    double-to-int v4, v7

    .line 23
    iget-object v2, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->this$0:Lio/streamroot/dna/core/media/DefaultQosModule;

    invoke-static {v2}, Lio/streamroot/dna/core/media/DefaultQosModule;->access$getPlayer$p(Lio/streamroot/dna/core/media/DefaultQosModule;)Lio/streamroot/dna/core/media/PlayerWrapper;

    move-result-object v2

    iput-object v6, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    iput v4, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iput v5, v1, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->label:I

    invoke-virtual {v2, v1}, Lio/streamroot/dna/core/media/PlayerWrapper;->interact(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_2

    return-object v3

    .line 24
    :cond_2
    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    sget-object v2, Lio/streamroot/dna/core/PlaybackState;->IDLE:Lio/streamroot/dna/core/PlaybackState;

    move-object v9, v6

    move-wide v6, v7

    move v8, v4

    move-object v4, v2

    :cond_3
    move-object v2, v1

    .line 25
    :goto_0
    invoke-static {v9}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v10

    if-eqz v10, :cond_11

    .line 27
    :try_start_1
    iget-object v10, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->this$0:Lio/streamroot/dna/core/media/DefaultQosModule;

    invoke-static {v10}, Lio/streamroot/dna/core/media/DefaultQosModule;->access$getPlayer$p(Lio/streamroot/dna/core/media/DefaultQosModule;)Lio/streamroot/dna/core/media/PlayerWrapper;

    move-result-object v10

    iput-object v9, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    iput v8, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iput-wide v6, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->J$0:J

    iput-object v4, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$1:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v2, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->label:I

    invoke-virtual {v10, v2}, Lio/streamroot/dna/core/media/PlayerWrapper;->interact(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-ne v10, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v23, v3

    move-object v3, v2

    move-object v2, v10

    move-object v10, v4

    move-object/from16 v4, v23

    .line 28
    :goto_1
    :try_start_2
    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    cmp-long v13, v11, v6

    if-ltz v13, :cond_d

    int-to-long v13, v8

    add-long v15, v6, v13

    cmp-long v13, v11, v15

    if-lez v13, :cond_5

    goto :goto_5

    :cond_5
    cmp-long v13, v11, v6

    if-nez v13, :cond_c

    .line 33
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 34
    check-cast v2, Ljava/lang/Iterable;

    .line 66
    instance-of v13, v2, Ljava/util/Collection;

    const/4 v14, 0x0

    if-eqz v13, :cond_6

    move-object v13, v2

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    .line 67
    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/streamroot/dna/core/TimeRange;

    .line 34
    invoke-virtual {v13}, Lio/streamroot/dna/core/TimeRange;->getStart()J

    move-result-wide v15

    invoke-virtual {v13}, Lio/streamroot/dna/core/TimeRange;->getStart()J

    move-result-wide v17

    invoke-virtual {v13}, Lio/streamroot/dna/core/TimeRange;->getDuration()J

    move-result-wide v19

    add-long v21, v17, v19

    cmp-long v13, v15, v11

    if-lez v13, :cond_8

    goto :goto_2

    :cond_8
    cmp-long v13, v21, v11

    if-ltz v13, :cond_9

    move v13, v5

    goto :goto_3

    :cond_9
    :goto_2
    move v13, v14

    :goto_3
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_7

    move v14, v5

    :cond_a
    :goto_4
    if-eqz v14, :cond_b

    .line 35
    sget-object v2, Lio/streamroot/dna/core/PlaybackState;->PAUSING:Lio/streamroot/dna/core/PlaybackState;

    goto :goto_6

    .line 37
    :cond_b
    sget-object v2, Lio/streamroot/dna/core/PlaybackState;->BUFFERING:Lio/streamroot/dna/core/PlaybackState;

    goto :goto_6

    .line 40
    :cond_c
    sget-object v2, Lio/streamroot/dna/core/PlaybackState;->PLAYING:Lio/streamroot/dna/core/PlaybackState;

    goto :goto_6

    .line 31
    :cond_d
    :goto_5
    sget-object v2, Lio/streamroot/dna/core/PlaybackState;->SEEKING:Lio/streamroot/dna/core/PlaybackState;

    :goto_6
    if-eq v2, v10, :cond_e

    .line 44
    iget-object v13, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->this$0:Lio/streamroot/dna/core/media/DefaultQosModule;

    invoke-virtual {v13, v2}, Lio/streamroot/dna/core/media/DefaultQosModule;->playbackStateChange(Lio/streamroot/dna/core/PlaybackState;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_e
    move-wide v6, v11

    move-object/from16 v23, v4

    move-object v4, v2

    move-object/from16 v2, v23

    goto :goto_8

    :catch_1
    move-exception v0

    move-object/from16 v17, v0

    goto :goto_7

    :catch_2
    move-exception v0

    move-object/from16 v17, v0

    move-object v10, v4

    move-object v4, v3

    move-object v3, v2

    .line 50
    :goto_7
    invoke-interface {v9}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    sget-object v11, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v11, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v2, v11}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v2, :cond_f

    invoke-interface {v9}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v11

    new-instance v12, Lio/streamroot/dna/core/media/QosModuleException;

    const-string v15, "Default qos module exception"

    const/16 v16, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    move-object v14, v12

    invoke-direct/range {v14 .. v19}, Lio/streamroot/dna/core/media/QosModuleException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v12, Ljava/lang/Throwable;

    invoke-virtual {v2, v11, v12}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :cond_f
    move-object v2, v4

    move-object v4, v10

    :goto_8
    const-wide/16 v10, 0x3e8

    .line 53
    iput-object v9, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$0:Ljava/lang/Object;

    iput v8, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->I$0:I

    iput-wide v6, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->J$0:J

    iput-object v4, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->L$1:Ljava/lang/Object;

    const/4 v12, 0x3

    iput v12, v3, Lio/streamroot/dna/core/media/DefaultQosModule$qosJob$1;->label:I

    invoke-static {v10, v11, v3}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_10

    return-object v2

    :cond_10
    move-object/from16 v23, v3

    move-object v3, v2

    move-object/from16 v2, v23

    goto/16 :goto_0

    .line 55
    :cond_11
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
