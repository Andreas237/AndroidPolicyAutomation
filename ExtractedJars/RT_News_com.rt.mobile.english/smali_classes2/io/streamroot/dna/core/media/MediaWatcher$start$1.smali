.class final Lio/streamroot/dna/core/media/MediaWatcher$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MediaWatcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/media/MediaWatcher;->start()V
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
    value = "SMAP\nMediaWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaWatcher.kt\nio/streamroot/dna/core/media/MediaWatcher$start$1\n*L\n1#1,44:1\n*E\n"
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
    c = "io/streamroot/dna/core/media/MediaWatcher$start$1"
    f = "MediaWatcher.kt"
    i = {}
    l = {
        0x1b,
        0x1f,
        0x1c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/media/MediaWatcher;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/media/MediaWatcher;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->this$0:Lio/streamroot/dna/core/media/MediaWatcher;

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

    new-instance v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;

    iget-object v1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->this$0:Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/media/MediaWatcher$start$1;-><init>(Lio/streamroot/dna/core/media/MediaWatcher;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/media/MediaWatcher$start$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 27
    iget v1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 38
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :pswitch_0
    iget-object v1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    iget-object v1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    move-object v2, v0

    move-object v0, p0

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v6, p1

    move-object v2, v0

    move-object v0, p0

    goto :goto_2

    :pswitch_2
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    move-object v1, p1

    :cond_2
    move-object p1, p0

    .line 28
    :goto_0
    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 30
    :try_start_1
    iget-object v2, p1, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->this$0:Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-static {v2}, Lio/streamroot/dna/core/media/MediaWatcher;->access$getPlayer$p(Lio/streamroot/dna/core/media/MediaWatcher;)Lio/streamroot/dna/core/media/PlayerWrapper;

    move-result-object v2

    iput-object v1, p1, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p1, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->label:I

    invoke-virtual {v2, p1}, Lio/streamroot/dna/core/media/PlayerWrapper;->interact(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move-object v11, v0

    move-object v0, p1

    move-object p1, v2

    move-object v2, v11

    .line 31
    :goto_1
    :try_start_2
    check-cast p1, Lkotlin/Pair;

    iget-object v3, v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->this$0:Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-static {v3}, Lio/streamroot/dna/core/media/MediaWatcher;->access$getHandler$p(Lio/streamroot/dna/core/media/MediaWatcher;)Lio/streamroot/dna/core/media/MediaElementHandler;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v3, v4, v5, p1}, Lio/streamroot/dna/core/media/MediaElementHandler;->updateMediaElement(JLjava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v6, p1

    goto :goto_2

    :catch_2
    move-exception v2

    move-object v6, v2

    move-object v2, v0

    move-object v0, p1

    .line 33
    :goto_2
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    sget-object v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v3, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {p1, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz p1, :cond_4

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v9

    new-instance v10, Lio/streamroot/dna/core/media/MediaWatcherException;

    const-string v4, "Media watcher gathering error"

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, Lio/streamroot/dna/core/media/MediaWatcherException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v10, Ljava/lang/Throwable;

    invoke-virtual {p1, v9, v10}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 36
    :cond_4
    :goto_3
    iget-object p1, v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->this$0:Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-static {p1}, Lio/streamroot/dna/core/media/MediaWatcher;->access$getRefreshDelayInMs$p(Lio/streamroot/dna/core/media/MediaWatcher;)J

    move-result-wide v3

    iput-object v1, v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;->label:I

    invoke-static {v3, v4, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    return-object v2

    :cond_5
    move-object p1, v0

    move-object v0, v2

    goto :goto_0

    .line 38
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
