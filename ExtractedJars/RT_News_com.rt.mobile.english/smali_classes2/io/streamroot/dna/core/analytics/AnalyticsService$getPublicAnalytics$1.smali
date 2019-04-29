.class final Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AnalyticsService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/analytics/AnalyticsService;->getPublicAnalytics(Lio/streamroot/dna/core/InformationCallback;)V
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
    value = "SMAP\nAnalyticsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsService.kt\nio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1\n*L\n1#1,73:1\n*E\n"
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
    c = "io/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1"
    f = "AnalyticsService.kt"
    i = {}
    l = {
        0x1f,
        0x21
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $informationCallback:Lio/streamroot/dna/core/InformationCallback;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/analytics/AnalyticsService;Lio/streamroot/dna/core/InformationCallback;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    iput-object p2, p0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->$informationCallback:Lio/streamroot/dna/core/InformationCallback;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;

    iget-object v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    iget-object v2, p0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->$informationCallback:Lio/streamroot/dna/core/InformationCallback;

    invoke-direct {v0, v1, v2, p2}, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsService;Lio/streamroot/dna/core/InformationCallback;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
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

    .line 31
    iget v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->label:I

    const/4 v5, 0x1

    packed-switch v4, :pswitch_data_0

    .line 58
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 31
    :pswitch_0
    instance-of v3, v2, Lkotlin/Result$Failure;

    if-eqz v3, :cond_1

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :pswitch_1
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_0

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :cond_0
    iget-object v2, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 32
    iget-object v2, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v2}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getAnalyticsHandler$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    move-result-object v2

    if-eqz v2, :cond_2

    iput v5, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->label:I

    invoke-virtual {v2, v1}, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->getPublicAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1

    return-object v3

    .line 33
    :cond_1
    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    if-eqz v2, :cond_3

    .line 37
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v5

    if-eqz v4, :cond_3

    const-string v4, "null"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v5

    if-eqz v4, :cond_3

    .line 39
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "cdn"

    .line 40
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    const-string v2, "p2p"

    .line 41
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    const-string v2, "upload"

    .line 42
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    const-string v2, "peers"

    .line 43
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move/from16 v22, v2

    move-wide v6, v10

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v2, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, v0

    move-wide v12, v6

    :goto_1
    move-wide v6, v10

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v2, v0

    move-wide v12, v6

    goto :goto_2

    :catch_3
    move-exception v0

    move-object v2, v0

    move-wide v8, v6

    move-wide v12, v8

    .line 45
    :goto_2
    iget-object v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getErrorAggregator$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/error/ErrorAggregator;

    move-result-object v4

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v4, v2}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    move/from16 v22, v3

    goto :goto_3

    :cond_3
    move/from16 v22, v3

    move-wide v8, v6

    move-wide v12, v8

    .line 48
    :goto_3
    iget-object v2, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v2}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getLatestCdn$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    invoke-static {v2, v8, v9}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->setIfBigger(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v2

    .line 49
    iget-object v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getLatestDna$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v4

    invoke-static {v4, v6, v7}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->setIfBigger(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v18

    .line 50
    iget-object v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getLatestUpload$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v4

    invoke-static {v4, v12, v13}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->setIfBigger(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v20

    .line 52
    iget-object v14, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->$informationCallback:Lio/streamroot/dna/core/InformationCallback;

    .line 53
    iget-object v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getStateManager$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v4

    invoke-virtual {v4}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object v15

    .line 54
    iget-object v4, v1, Lio/streamroot/dna/core/analytics/AnalyticsService$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsService;->access$getCdnAnalyticsReporter$p(Lio/streamroot/dna/core/analytics/AnalyticsService;)Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    move-result-object v4

    invoke-virtual {v4}, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;->getTotalCdn()J

    move-result-wide v4

    add-long v16, v2, v4

    .line 52
    invoke-interface/range {v14 .. v22}, Lio/streamroot/dna/core/InformationCallback;->onInformation(Lio/streamroot/dna/core/State;JJJI)V

    .line 58
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
