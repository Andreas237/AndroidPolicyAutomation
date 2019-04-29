.class public final Lio/streamroot/dna/core/tracker/TrackerInteractor;
.super Ljava/lang/Object;
.source "TrackerInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTrackerInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackerInteractor.kt\nio/streamroot/dna/core/tracker/TrackerInteractor\n*L\n1#1,160:1\n*E\n"
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
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0019\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u0008\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0008\u0010#\u001a\u00020\u000fH\u0016R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006$"
    }
    d2 = {
        "Lio/streamroot/dna/core/tracker/TrackerInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "Ljava/lang/AutoCloseable;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "trackerHandler",
        "Lio/streamroot/dna/core/tracker/TrackerHandler;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "trackerPath",
        "",
        "(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/tracker/TrackerHandler;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V",
        "askPeerDeferred",
        "Lkotlinx/coroutines/Job;",
        "closeDeferred",
        "trackerConnectionDeferred",
        "askPeer",
        "",
        "requestBody",
        "buildAskPeerRequest",
        "Lokhttp3/Request;",
        "availabilityZone",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildCloseRequest",
        "buildInitRequest",
        "buildTargetUrl",
        "requestPath",
        "close",
        "closeConnection",
        "createConnection",
        "name",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private askPeerDeferred:Lkotlinx/coroutines/Job;

.field private final backendUrl:Lokhttp3/HttpUrl;

.field private final callFactory:Lokhttp3/Call$Factory;

.field private closeDeferred:Lkotlinx/coroutines/Job;

.field private final context:Lkotlin/coroutines/CoroutineContext;

.field private final delaySequence:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private trackerConnectionDeferred:Lkotlinx/coroutines/Job;

.field private final trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

.field private final trackerPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/tracker/TrackerHandler;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/tracker/TrackerHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "Lio/streamroot/dna/core/tracker/TrackerHandler;",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lokhttp3/HttpUrl;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackerHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delaySequence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backendUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackerPath"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->callFactory:Lokhttp3/Call$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

    iput-object p3, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->delaySequence:Lkotlin/sequences/Sequence;

    iput-object p4, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    iput-object p5, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->backendUrl:Lokhttp3/HttpUrl;

    iput-object p6, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerPath:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$buildCloseRequest(Lio/streamroot/dna/core/tracker/TrackerInteractor;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;
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

    .line 24
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->buildCloseRequest(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCallFactory$p(Lio/streamroot/dna/core/tracker/TrackerInteractor;)Lokhttp3/Call$Factory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object p0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->callFactory:Lokhttp3/Call$Factory;

    return-object p0
.end method

.method public static final synthetic access$getDelaySequence$p(Lio/streamroot/dna/core/tracker/TrackerInteractor;)Lkotlin/sequences/Sequence;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object p0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->delaySequence:Lkotlin/sequences/Sequence;

    return-object p0
.end method

.method public static final synthetic access$getTrackerHandler$p(Lio/streamroot/dna/core/tracker/TrackerInteractor;)Lio/streamroot/dna/core/tracker/TrackerHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object p0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

    return-object p0
.end method

.method private final buildCloseRequest(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;
    .locals 2

    const-string v0, "/bye"

    .line 151
    invoke-direct {p0, p1, v0}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->buildTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 152
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    const-string v1, "application/json"

    .line 153
    invoke-static {v1}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    invoke-static {v1, p2}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p2

    invoke-virtual {v0, p2}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 154
    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string p2, "Request.Builder()\n      \u2026url)\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final buildTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 3

    .line 159
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->backendUrl:Lokhttp3/HttpUrl;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerPath:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final askPeer(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeerDeferred:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 73
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeerDeferred:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_1

    sget-object v1, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->Key:Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/Job;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->updateRequestBody(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/tracker/TrackerHandler;->requestAttempt(I)V

    .line 76
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    invoke-direct {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance p1, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lio/streamroot/dna/core/tracker/TrackerInteractor$askPeer$1;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeerDeferred:Lkotlinx/coroutines/Job;

    :cond_1
    :goto_0
    return-void
.end method

.method final synthetic buildAskPeerRequest(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lokhttp3/Request;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "/sources"

    .line 140
    invoke-direct {p0, p1, v0}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->buildTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 141
    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    sget-object v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->Key:Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext$Key;

    check-cast v0, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    check-cast p2, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    if-eqz p2, :cond_0

    .line 144
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 145
    invoke-virtual {p2}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->getRequestBody()Lokhttp3/RequestBody;

    move-result-object p2

    invoke-virtual {v0, p2}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 146
    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 147
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string p2, "Request.Builder()\n      \u2026url)\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 142
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "`PostRequestContext` is mandatory for Tracker peers request"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method final synthetic buildInitRequest(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lokhttp3/Request;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "/init"

    .line 129
    invoke-direct {p0, p1, v0}, Lio/streamroot/dna/core/tracker/TrackerInteractor;->buildTargetUrl(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 130
    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    sget-object v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->Key:Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext$Key;

    check-cast v0, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    check-cast p2, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    if-eqz p2, :cond_0

    .line 133
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 134
    invoke-virtual {p2}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->getRequestBody()Lokhttp3/RequestBody;

    move-result-object p2

    invoke-virtual {v0, p2}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 135
    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p1

    .line 136
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    const-string p2, "Request.Builder()\n      \u2026url)\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "`PostRequestContext` is mandatory for Tracker init request"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public close()V
    .locals 2

    .line 118
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeerDeferred:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 119
    check-cast v0, Lkotlinx/coroutines/Job;

    iput-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->askPeerDeferred:Lkotlinx/coroutines/Job;

    .line 121
    iget-object v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerConnectionDeferred:Lkotlinx/coroutines/Job;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lkotlinx/coroutines/Job;->cancel()V

    .line 122
    :cond_1
    iput-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerConnectionDeferred:Lkotlinx/coroutines/Job;

    .line 124
    iget-object v1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->closeDeferred:Lkotlinx/coroutines/Job;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lkotlinx/coroutines/Job;->cancel()V

    .line 125
    :cond_2
    iput-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->closeDeferred:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final closeConnection(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/tracker/TrackerHandler;->requestAttempt(I)V

    .line 102
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v0, Lio/streamroot/dna/core/tracker/TrackerInteractor$closeConnection$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lio/streamroot/dna/core/tracker/TrackerInteractor$closeConnection$1;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->closeDeferred:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final createConnection(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerConnectionDeferred:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 41
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerConnectionDeferred:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_1

    sget-object v1, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->Key:Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/Job;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->updateRequestBody(Ljava/lang/String;)V

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerHandler:Lio/streamroot/dna/core/tracker/TrackerHandler;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/tracker/TrackerHandler;->connectionAttempt(I)V

    .line 44
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;

    invoke-direct {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/http/circuitbreaker/PostRequestContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance p1, Lio/streamroot/dna/core/tracker/TrackerInteractor$createConnection$1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lio/streamroot/dna/core/tracker/TrackerInteractor$createConnection$1;-><init>(Lio/streamroot/dna/core/tracker/TrackerInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/tracker/TrackerInteractor;->trackerConnectionDeferred:Lkotlinx/coroutines/Job;

    :cond_1
    :goto_0
    return-void
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "TrackerInteractor"

    return-object v0
.end method
