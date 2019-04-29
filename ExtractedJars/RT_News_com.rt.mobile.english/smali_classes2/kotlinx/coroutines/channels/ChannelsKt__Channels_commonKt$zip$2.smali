.class final Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Channels.common.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt;->zip(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-TV;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,1891:1\n136#2:1892\n108#2,3:1893\n137#2,2:1896\n115#2:1898\n111#2,3:1899\n*E\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2\n*L\n1883#1:1892\n1883#1,3:1893\n1883#1,2:1896\n1883#1:1898\n1883#1,3:1899\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u0003\"\u0004\u0008\u0002\u0010\u0004*\u0008\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "E",
        "R",
        "V",
        "Lkotlinx/coroutines/channels/ProducerScope;",
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
    c = "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2"
    f = "Channels.common.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x759,
        0x759,
        0x75c,
        0x75d,
        0x75e,
        0x75f
    }
    m = "invokeSuspend"
    n = {
        "otherIterator",
        "$receiver$iv",
        "$receiver$iv$iv",
        "cause$iv$iv",
        "$receiver$iv",
        "otherIterator",
        "$receiver$iv",
        "$receiver$iv$iv",
        "cause$iv$iv",
        "$receiver$iv",
        "otherIterator",
        "$receiver$iv",
        "$receiver$iv$iv",
        "cause$iv$iv",
        "$receiver$iv",
        "e$iv",
        "element1",
        "otherIterator",
        "$receiver$iv",
        "$receiver$iv$iv",
        "cause$iv$iv",
        "$receiver$iv",
        "e$iv",
        "element1",
        "otherIterator",
        "$receiver$iv",
        "$receiver$iv$iv",
        "cause$iv$iv",
        "$receiver$iv",
        "e$iv",
        "element1",
        "element2"
    }
    s = {
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$8",
        "L$9",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$8",
        "L$9",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$8",
        "L$9",
        "L$10"
    }
.end annotation


# instance fields
.field final synthetic $other:Lkotlinx/coroutines/channels/ReceiveChannel;

.field final synthetic $this_zip:Lkotlinx/coroutines/channels/ReceiveChannel;

.field final synthetic $transform:Lkotlin/jvm/functions/Function2;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/channels/ProducerScope;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$this_zip:Lkotlinx/coroutines/channels/ReceiveChannel;

    iput-object p2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$other:Lkotlinx/coroutines/channels/ReceiveChannel;

    iput-object p3, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$transform:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v1, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$this_zip:Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v2, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$other:Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v3, p0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$transform:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, v3, p2}, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;-><init>(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    iput-object p1, v0, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->p$:Lkotlinx/coroutines/channels/ProducerScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18
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

    .line 1881
    iget v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    packed-switch v4, :pswitch_data_0

    .line 1888
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1881
    :pswitch_0
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$10:Ljava/lang/Object;

    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v5, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v6, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Throwable;

    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v8, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    check-cast v8, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v9, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v10, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v11, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/channels/ProducerScope;

    :try_start_0
    instance-of v12, v2, Lkotlin/Result$Failure;

    if-eqz v12, :cond_0

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    move-object v13, v3

    move-object v3, v1

    goto/16 :goto_6

    :pswitch_1
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    iget-object v5, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iget-object v6, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    check-cast v6, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v8, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Throwable;

    iget-object v9, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v10, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v11, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v12, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    check-cast v12, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v13, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    check-cast v13, Lkotlinx/coroutines/channels/ProducerScope;

    :try_start_1
    instance-of v14, v2, Lkotlin/Result$Failure;

    if-eqz v14, :cond_1

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    move-object v14, v4

    move-object v4, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object v12, v5

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object v13, v3

    move-object v3, v1

    goto/16 :goto_5

    :pswitch_2
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    iget-object v5, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iget-object v6, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    check-cast v6, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v8, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Throwable;

    iget-object v9, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v10, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v11, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v12, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    check-cast v12, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v13, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    check-cast v13, Lkotlinx/coroutines/channels/ProducerScope;

    :try_start_2
    instance-of v14, v2, Lkotlin/Result$Failure;

    if-eqz v14, :cond_2

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    move-object v14, v4

    move-object v4, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v5

    move-object v5, v7

    move-object v7, v9

    move-object v9, v3

    move-object v3, v1

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v6, v8

    move-object v7, v9

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v7, v9

    goto/16 :goto_7

    :pswitch_3
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v5, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v6, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Throwable;

    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v8, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    check-cast v8, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v9, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v10, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v11, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/channels/ProducerScope;

    :try_start_3
    instance-of v12, v2, Lkotlin/Result$Failure;

    if-eqz v12, :cond_3

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_3
    move-object v12, v2

    move-object v13, v11

    move-object v2, v1

    :goto_0
    move-object v11, v9

    goto/16 :goto_3

    :pswitch_4
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v5, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    check-cast v5, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v6, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Throwable;

    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    check-cast v7, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v8, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    check-cast v8, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;

    iget-object v9, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/channels/ReceiveChannel;

    iget-object v10, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    check-cast v10, Lkotlinx/coroutines/channels/ChannelIterator;

    iget-object v11, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/channels/ProducerScope;

    :try_start_4
    instance-of v12, v2, Lkotlin/Result$Failure;

    if-eqz v12, :cond_4

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_4
    move-object v12, v2

    move-object v2, v1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v6, v0

    goto/16 :goto_7

    :pswitch_5
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_5

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :cond_5
    iget-object v2, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->p$:Lkotlinx/coroutines/channels/ProducerScope;

    .line 1882
    iget-object v4, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$other:Lkotlinx/coroutines/channels/ReceiveChannel;

    invoke-interface {v4}, Lkotlinx/coroutines/channels/ReceiveChannel;->iterator()Lkotlinx/coroutines/channels/ChannelIterator;

    move-result-object v4

    .line 1883
    iget-object v7, v1, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$this_zip:Lkotlinx/coroutines/channels/ReceiveChannel;

    const/4 v5, 0x0

    .line 1893
    move-object v6, v5

    check-cast v6, Ljava/lang/Throwable;

    .line 1896
    :try_start_5
    invoke-interface {v7}, Lkotlinx/coroutines/channels/ReceiveChannel;->iterator()Lkotlinx/coroutines/channels/ChannelIterator;

    move-result-object v5

    move-object v8, v1

    move-object v11, v2

    move-object v10, v4

    move-object v4, v5

    move-object v5, v7

    move-object v9, v5

    move-object v2, v8

    :goto_1
    iput-object v11, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    iput-object v6, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    iput-object v5, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    const/4 v12, 0x1

    iput v12, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    invoke-interface {v4, v8}, Lkotlinx/coroutines/channels/ChannelIterator;->hasNext(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_6

    return-object v3

    .line 1881
    :cond_6
    :goto_2
    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_c

    iput-object v11, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    iput-object v6, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    iput-object v5, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    const/4 v12, 0x2

    iput v12, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    invoke-interface {v4, v8}, Lkotlinx/coroutines/channels/ChannelIterator;->next(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_7

    return-object v3

    :cond_7
    move-object v13, v11

    goto/16 :goto_0

    .line 1884
    :goto_3
    iput-object v13, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    iput-object v6, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    iput-object v5, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    iput-object v12, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iput-object v12, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v2, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    invoke-interface {v10, v2}, Lkotlinx/coroutines/channels/ChannelIterator;->hasNext(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_8

    return-object v3

    :cond_8
    move-object v14, v12

    move-object v12, v10

    move-object v10, v14

    move-object/from16 v16, v3

    move-object v3, v2

    move-object v2, v9

    move-object/from16 v9, v16

    .line 1881
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_9

    move-object v2, v3

    move-object v3, v9

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    goto :goto_1

    .line 1885
    :cond_9
    iput-object v13, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    iput-object v7, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    iput-object v6, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    iput-object v5, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    iput-object v4, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    iput-object v10, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iput-object v14, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    invoke-interface {v12, v3}, Lkotlinx/coroutines/channels/ChannelIterator;->next(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_a

    return-object v9

    :cond_a
    move-object/from16 v16, v13

    move-object v13, v9

    move-object v9, v11

    move-object/from16 v11, v16

    move-object/from16 v17, v12

    move-object v12, v10

    move-object/from16 v10, v17

    .line 1886
    :goto_5
    iget-object v15, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->$transform:Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v14, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v11, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$3:Ljava/lang/Object;

    iput-object v7, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$4:Ljava/lang/Object;

    iput-object v6, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$5:Ljava/lang/Object;

    iput-object v5, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$6:Ljava/lang/Object;

    iput-object v4, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$7:Ljava/lang/Object;

    iput-object v12, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$8:Ljava/lang/Object;

    iput-object v14, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$9:Ljava/lang/Object;

    iput-object v2, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->L$10:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v3, Lkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$zip$2;->label:I

    invoke-interface {v11, v15, v3}, Lkotlinx/coroutines/channels/ProducerScope;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_b

    return-object v13

    :cond_b
    :goto_6
    move-object v2, v3

    move-object v3, v13

    goto/16 :goto_1

    .line 1897
    :cond_c
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1898
    invoke-interface {v7, v6}, Lkotlinx/coroutines/channels/ReceiveChannel;->cancel(Ljava/lang/Throwable;)Z

    .line 1888
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 1901
    :goto_7
    :try_start_6
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1898
    :goto_8
    invoke-interface {v7, v6}, Lkotlinx/coroutines/channels/ReceiveChannel;->cancel(Ljava/lang/Throwable;)Z

    throw v2

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
