.class final Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AnalyticsReporter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;->appendStatsAnalytics(Lorg/json/JSONObject;)V
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
        "Lorg/json/JSONObject;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lorg/json/JSONObject;",
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
    c = "io/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1"
    f = "AnalyticsReporter.kt"
    i = {}
    l = {
        0x70,
        0x73
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $statsPayload:Lorg/json/JSONObject;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;

    iput-object p2, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->$statsPayload:Lorg/json/JSONObject;

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

    new-instance v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;

    iget-object v1, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;

    iget-object v2, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->$statsPayload:Lorg/json/JSONObject;

    invoke-direct {v0, v1, v2, p2}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 112
    iget v1, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 115
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :pswitch_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    const-wide/16 v1, 0x7d0

    .line 113
    new-instance p1, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1$1;

    const/4 v3, 0x0

    invoke-direct {p1, p0, v3}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1$1;-><init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x1

    iput v3, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;->label:I

    invoke-static {v1, v2, p1, p0}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
