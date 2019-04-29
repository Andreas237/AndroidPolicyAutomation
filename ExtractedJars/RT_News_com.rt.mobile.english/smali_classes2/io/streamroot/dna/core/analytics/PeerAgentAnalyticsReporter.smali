.class public final Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;
.super Ljava/lang/Object;
.source "AnalyticsReporter.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$Companion;
    }
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0008H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0008H\u0016J\u0008\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "analyticsHandler",
        "Lio/streamroot/dna/core/analytics/AnalyticsHandler;",
        "(Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V",
        "appendControlAnalytics",
        "",
        "controlPayload",
        "Lorg/json/JSONObject;",
        "appendStatsAnalytics",
        "statsPayload",
        "appendTrafficAnalytics",
        "trafficPayload",
        "priority",
        "",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$Companion;

.field private static final PEER_AGENT_TIMEOUT:J = 0x7d0L


# instance fields
.field private final analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;->Companion:Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$Companion;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/analytics/AnalyticsHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "analyticsHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    return-void
.end method

.method public static final synthetic access$getAnalyticsHandler$p(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;)Lio/streamroot/dna/core/analytics/AnalyticsHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 105
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;->analyticsHandler:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    return-object p0
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    new-instance v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendControlAnalytics$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendControlAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    new-instance v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendStatsAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    new-instance v0, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendTrafficAnalytics$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter$appendTrafficAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public priority()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
