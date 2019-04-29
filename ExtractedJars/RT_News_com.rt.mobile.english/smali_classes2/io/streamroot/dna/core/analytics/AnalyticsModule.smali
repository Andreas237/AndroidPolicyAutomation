.class public final Lio/streamroot/dna/core/analytics/AnalyticsModule;
.super Ljava/lang/Object;
.source "AnalyticsModule.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/analytics/AnalyticsModule$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\nio/streamroot/dna/core/analytics/AnalyticsModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n141#1,3:155\n142#1:158\n1506#2,3:159\n1506#2,3:162\n909#2:165\n*E\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\nio/streamroot/dna/core/analytics/AnalyticsModule\n*L\n110#1,3:155\n110#1:158\n110#1,3:159\n142#1,3:162\n36#1:165\n*E\n"
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
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0018\u001a\u00020\u00192\u001a\u0008\u0004\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u001bH\u0082\u0008J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0002J\u0008\u0010\"\u001a\u00020\u001dH\u0016J\u0008\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u00082\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/AnalyticsModule;",
        "Ljava/lang/AutoCloseable;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "klaraUrl",
        "Lokhttp3/HttpUrl;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "statsDelayInMs",
        "controlDelayInMs",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "analyticsReporters",
        "",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "isQosTester",
        "",
        "(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lkotlin/sequences/Sequence;JJLkotlin/coroutines/CoroutineContext;Ljava/util/List;Z)V",
        "controlAnalyticsJob",
        "Lkotlinx/coroutines/Job;",
        "statsAnalyticsJob",
        "supportPayloadJob",
        "trafficAnalyticsJob",
        "assemblePayload",
        "",
        "block",
        "Lkotlin/Function2;",
        "Lorg/json/JSONObject;",
        "",
        "buildAnalyticsRequest",
        "Lokhttp3/Request;",
        "targetPath",
        "requestBody",
        "close",
        "sendEndSessionPayload",
        "trafficDelay",
        "trafficPayloadSent",
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
.field public static final Companion:Lio/streamroot/dna/core/analytics/AnalyticsModule$Companion;

.field private static final JSON:Lokhttp3/MediaType;

.field private static final TRAFFIC_ANALYTICS_FIRST_DELAY:J = 0x1388L

.field private static final TRAFFIC_ANALYTICS_MAX_DELAY:J = 0x1d4c0L

.field private static final TRAFFIC_ANALYTICS_STEP_DELAY:J = 0x2710L


# instance fields
.field private final analyticsReporters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final callFactory:Lokhttp3/Call$Factory;

.field private final context:Lkotlin/coroutines/CoroutineContext;

.field private final controlAnalyticsJob:Lkotlinx/coroutines/Job;

.field private final controlDelayInMs:J

.field private final delaySequence:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final klaraUrl:Lokhttp3/HttpUrl;

.field private final statsAnalyticsJob:Lkotlinx/coroutines/Job;

.field private final statsDelayInMs:J

.field private final supportPayloadJob:Lkotlinx/coroutines/Job;

.field private final trafficAnalyticsJob:Lkotlinx/coroutines/Job;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/analytics/AnalyticsModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->Companion:Lio/streamroot/dna/core/analytics/AnalyticsModule$Companion;

    const-string v0, "application/json"

    .line 148
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->JSON:Lokhttp3/MediaType;

    return-void
.end method

.method public constructor <init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lkotlin/sequences/Sequence;JJLkotlin/coroutines/CoroutineContext;Ljava/util/List;Z)V
    .locals 1
    .param p1    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "Lokhttp3/HttpUrl;",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;JJ",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/List<",
            "+",
            "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "klaraUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delaySequence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsReporters"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->callFactory:Lokhttp3/Call$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->klaraUrl:Lokhttp3/HttpUrl;

    iput-object p3, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->delaySequence:Lkotlin/sequences/Sequence;

    iput-wide p4, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->statsDelayInMs:J

    iput-wide p6, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->controlDelayInMs:J

    iput-object p8, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    .line 36
    check-cast p9, Ljava/lang/Iterable;

    .line 165
    new-instance p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$$special$$inlined$sortedByDescending$1;

    invoke-direct {p1}, Lio/streamroot/dna/core/analytics/AnalyticsModule$$special$$inlined$sortedByDescending$1;-><init>()V

    check-cast p1, Ljava/util/Comparator;

    invoke-static {p9, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->analyticsReporters:Ljava/util/List;

    .line 38
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, p3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    new-instance p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$statsAnalyticsJob$1;

    const/4 p8, 0x0

    invoke-direct {p1, p0, p8}, Lio/streamroot/dna/core/analytics/AnalyticsModule$statsAnalyticsJob$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p4, 0x0

    const/4 p6, 0x2

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->statsAnalyticsJob:Lkotlinx/coroutines/Job;

    if-eqz p10, :cond_0

    move-object p1, p8

    goto :goto_0

    .line 54
    :cond_0
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, p3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    const/4 p4, 0x0

    new-instance p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;

    invoke-direct {p1, p0, p8}, Lio/streamroot/dna/core/analytics/AnalyticsModule$controlAnalyticsJob$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x2

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->controlAnalyticsJob:Lkotlinx/coroutines/Job;

    .line 70
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, p3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    const/4 p4, 0x0

    new-instance p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$trafficAnalyticsJob$1;

    invoke-direct {p1, p0, p8}, Lio/streamroot/dna/core/analytics/AnalyticsModule$trafficAnalyticsJob$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x2

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->trafficAnalyticsJob:Lkotlinx/coroutines/Job;

    .line 87
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, p3}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    new-instance p1, Lio/streamroot/dna/core/analytics/AnalyticsModule$supportPayloadJob$1;

    invoke-direct {p1, p0, p8}, Lio/streamroot/dna/core/analytics/AnalyticsModule$supportPayloadJob$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->supportPayloadJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$assemblePayload(Lio/streamroot/dna/core/analytics/AnalyticsModule;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->assemblePayload(Lkotlin/jvm/functions/Function2;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$buildAnalyticsRequest(Lio/streamroot/dna/core/analytics/AnalyticsModule;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->buildAnalyticsRequest(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsReporters$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Ljava/util/List;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->analyticsReporters:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getCallFactory$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Lokhttp3/Call$Factory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->callFactory:Lokhttp3/Call$Factory;

    return-object p0
.end method

.method public static final synthetic access$getControlDelayInMs$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)J
    .locals 2

    .line 26
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->controlDelayInMs:J

    return-wide v0
.end method

.method public static final synthetic access$getDelaySequence$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Lkotlin/sequences/Sequence;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->delaySequence:Lkotlin/sequences/Sequence;

    return-object p0
.end method

.method public static final synthetic access$getStatsDelayInMs$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)J
    .locals 2

    .line 26
    iget-wide v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->statsDelayInMs:J

    return-wide v0
.end method

.method public static final synthetic access$trafficDelay(Lio/streamroot/dna/core/analytics/AnalyticsModule;I)J
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->trafficDelay(I)J

    move-result-wide p0

    return-wide p0
.end method

.method private final assemblePayload(Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lorg/json/JSONObject;",
            "-",
            "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 141
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getAnalyticsReporters$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 142
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 163
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    .line 142
    invoke-interface {p1, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "analyticsReporters\n     \u2026}\n            .toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final buildAnalyticsRequest(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;
    .locals 3

    .line 126
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->klaraUrl:Lokhttp3/HttpUrl;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 128
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 129
    sget-object v1, Lio/streamroot/dna/core/analytics/AnalyticsModule;->JSON:Lokhttp3/MediaType;

    invoke-static {v1, p2}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p2

    invoke-virtual {v0, p2}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 130
    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string p2, "Request.Builder()\n      \u2026Url)\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final sendEndSessionPayload()V
    .locals 8

    .line 155
    :try_start_0
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->access$getAnalyticsReporters$p(Lio/streamroot/dna/core/analytics/AnalyticsModule;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 158
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    .line 110
    instance-of v3, v2, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;

    if-nez v3, :cond_0

    invoke-interface {v2, v1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter;->appendStatsAnalytics(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 157
    :cond_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "analyticsReporters\n     \u2026}\n            .toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    iget-object v3, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->context:Lkotlin/coroutines/CoroutineContext;

    const/4 v4, 0x0

    new-instance v1, Lio/streamroot/dna/core/analytics/AnalyticsModule$sendEndSessionPayload$1;

    const/4 v5, 0x0

    invoke-direct {v1, p0, v0, v5}, Lio/streamroot/dna/core/analytics/AnalyticsModule$sendEndSessionPayload$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsModule;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 121
    sget-object v1, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method private final trafficDelay(I)J
    .locals 6

    const/16 v0, 0xc

    if-ge p1, v0, :cond_0

    int-to-long v0, p1

    const-wide/16 v2, 0x2710

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    add-long v4, v0, v2

    goto :goto_0

    :cond_0
    const-wide/32 v4, 0x1d4c0

    :goto_0
    return-wide v4
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 101
    invoke-direct {p0}, Lio/streamroot/dna/core/analytics/AnalyticsModule;->sendEndSessionPayload()V

    .line 102
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->supportPayloadJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 103
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->trafficAnalyticsJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 104
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->statsAnalyticsJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 105
    iget-object v0, p0, Lio/streamroot/dna/core/analytics/AnalyticsModule;->controlAnalyticsJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    :cond_0
    return-void
.end method
