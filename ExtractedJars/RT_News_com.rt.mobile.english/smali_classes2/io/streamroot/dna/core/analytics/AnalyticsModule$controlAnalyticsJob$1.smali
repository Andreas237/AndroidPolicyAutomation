.class final Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AnalyticsModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/analytics/AnalyticsModule;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lkotlin/sequences/Sequence;JJLkotlin/coroutines/CoroutineContext;Ljava/util/List;Z)V
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
    value = "SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\nio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1\n+ 2 AnalyticsModule.kt\nio/streamroot/dna/core/analytics/AnalyticsModule\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n141#2,3:155\n142#2:158\n1506#3,3:159\n*E\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\nio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1\n*L\n58#1,3:155\n58#1:158\n58#1,3:159\n*E\n"
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
    c = "io/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1"
    f = "AnalyticsModule.kt"
    i = {
        0x1
    }
    l = {
        0x36,
        0x39,
        0x40
    }
    m = "invokeSuspend"
    n = {
        "controlPayload"
    }
    s = {
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

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

    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;

    iget-object v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 54
    iget v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 68
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :pswitch_0
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$0:Ljava/lang/Object;

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
    move-object p1, v0

    move-object v0, p0

    goto/16 :goto_4

    :catch_0
    move-exception p1

    move-object v6, p1

    move-object p1, v0

    move-object v0, p0

    goto/16 :goto_3

    :pswitch_1
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    move-object p1, v0

    move-object v0, p0

    goto :goto_1

    :pswitch_2
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    move-object v1, v0

    move-object v0, p0

    .line 55
    :goto_0
    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 56
    iget-object v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    invoke-static {v2}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getControlDelayInMs$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)J

    move-result-wide v2

    iput-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->label:I

    invoke-static {v2, v3, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v11, v1

    move-object v1, p1

    move-object p1, v11

    .line 58
    :goto_1
    :try_start_1
    iget-object v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    .line 155
    invoke-static {v2}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getAnalyticsReporters$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 158
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 160
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    .line 58
    invoke-interface {v4, v3}, Lio/streamroot/dna/core/analytics/AnalyticsReporter;->appendControlAnalytics(Lorg/json/JSONObject;)V

    goto :goto_2

    .line 157
    :cond_4
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "analyticsReporters\n     \u2026}\n            .toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v3, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    invoke-static {v3}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getCallFactory$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Lokhttp3/Call$Factory;

    move-result-object v3

    .line 61
    iget-object v4, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    invoke-static {v4}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getDelaySequence$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Lkotlin/sequences/Sequence;

    move-result-object v4

    .line 62
    iget-object v5, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsModule;

    const-string v6, "/stats/control"

    invoke-static {v5, v6, v2}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$buildAnalyticsRequest(Lio/streamroot/dna/core/analytics/AnalyticsModule;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object v5

    .line 63
    new-instance v6, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1$1;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iput-object v1, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;->label:I

    .line 59
    invoke-static {v3, v4, v5, v6, v0}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v2, p1, :cond_5

    return-object p1

    :catch_1
    move-exception v2

    move-object v6, v2

    .line 65
    :goto_3
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    sget-object v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v3, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v2, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v2, :cond_5

    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v9

    new-instance v10, Lio/streamroot/dna/core/analytics/AnalyticsException;

    const-string v4, "Control analytics sending error"

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, Lio/streamroot/dna/core/analytics/AnalyticsException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v10, Ljava/lang/Throwable;

    invoke-virtual {v2, v9, v10}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    move-object v11, v1

    move-object v1, p1

    move-object p1, v11

    goto/16 :goto_0

    .line 68
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
