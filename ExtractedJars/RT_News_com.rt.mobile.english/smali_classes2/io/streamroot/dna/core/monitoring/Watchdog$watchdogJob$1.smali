.class final Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Watchdog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/monitoring/Watchdog;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;[Lio/streamroot/dna/core/monitoring/Watcher;Lkotlin/coroutines/CoroutineContext;J)V
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
    value = "SMAP\nWatchdog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Watchdog.kt\nio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n8686#2:63\n9003#2,3:64\n*E\n*S KotlinDebug\n*F\n+ 1 Watchdog.kt\nio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1\n*L\n35#1:63\n35#1,3:64\n*E\n"
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
    c = "io/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1"
    f = "Watchdog.kt"
    i = {}
    l = {
        0x1e,
        0x21
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $adaptiveResourceHandler:Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;

.field final synthetic $refreshDelayInMs:J

.field final synthetic $stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field final synthetic $watchers:[Lio/streamroot/dna/core/monitoring/Watcher;

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/monitoring/Watchdog;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/monitoring/Watchdog;J[Lio/streamroot/dna/core/monitoring/Watcher;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->this$0:Lio/streamroot/dna/core/monitoring/Watchdog;

    iput-wide p2, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$refreshDelayInMs:J

    iput-object p4, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$watchers:[Lio/streamroot/dna/core/monitoring/Watcher;

    iput-object p5, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$adaptiveResourceHandler:Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;

    iput-object p6, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;

    iget-object v2, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->this$0:Lio/streamroot/dna/core/monitoring/Watchdog;

    iget-wide v3, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$refreshDelayInMs:J

    iget-object v5, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$watchers:[Lio/streamroot/dna/core/monitoring/Watcher;

    iget-object v6, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$adaptiveResourceHandler:Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;

    iget-object v7, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    move-object v1, v0

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;-><init>(Lio/streamroot/dna/core/monitoring/Watchdog;J[Lio/streamroot/dna/core/monitoring/Watcher;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 30
    iget v1, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 51
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :pswitch_0
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    move-object p1, p0

    goto :goto_1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    move-object v1, p1

    move-object p1, p0

    .line 31
    :cond_2
    :goto_0
    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 32
    iget-wide v2, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$refreshDelayInMs:J

    iput-object v1, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->label:I

    invoke-static {v2, v3, p1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    .line 34
    :cond_3
    :goto_1
    :try_start_0
    iget-object v2, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$watchers:[Lio/streamroot/dna/core/monitoring/Watcher;

    .line 63
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 64
    array-length v4, v2

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_4

    aget-object v6, v2, v5

    .line 35
    invoke-interface {v6}, Lio/streamroot/dna/core/monitoring/Watcher;->watch()Lio/streamroot/dna/core/monitoring/WatchResult;

    move-result-object v6

    invoke-virtual {v6}, Lio/streamroot/dna/core/monitoring/WatchResult;->getThreatLevel()Lio/streamroot/dna/core/monitoring/ThreatLevel;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 66
    :cond_4
    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .line 36
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->max(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    sget-object v2, Lio/streamroot/dna/core/monitoring/ThreatLevel;->LOW:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    .line 38
    :goto_3
    iget-object v3, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->this$0:Lio/streamroot/dna/core/monitoring/Watchdog;

    invoke-static {v3}, Lio/streamroot/dna/core/monitoring/Watchdog;->access$getThreatLevelCountReference$p(Lio/streamroot/dna/core/monitoring/Watchdog;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "threatLevelCountReference.get()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v3

    check-cast v5, Lorg/json/JSONObject;

    invoke-virtual {v2}, Lio/streamroot/dna/core/monitoring/ThreatLevel;->getPrettyName()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->increment$default(Lorg/json/JSONObject;Ljava/lang/String;JILjava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    sget-object v3, Lio/streamroot/dna/core/monitoring/ThreatLevel;->HIGH:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    if-ne v2, v3, :cond_6

    .line 42
    iget-object v2, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$adaptiveResourceHandler:Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;

    invoke-virtual {v2}, Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;->peerPoolHigh()V

    goto :goto_0

    .line 43
    :cond_6
    sget-object v3, Lio/streamroot/dna/core/monitoring/ThreatLevel;->CRITICAL:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    if-ne v2, v3, :cond_2

    .line 44
    iget-object v2, p1, Lio/streamroot/dna/core/monitoring/Watchdog$watchdogJob$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    sget-object v3, Lio/streamroot/dna/core/State;->DEFINITELY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v2, v3}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v2

    .line 48
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v4, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v4, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v3, :cond_2

    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 51
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
