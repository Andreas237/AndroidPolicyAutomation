.class public final Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;
.super Ljava/lang/Object;
.source "SignalingConnectionFactory.kt"


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0012R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;",
        "",
        "webSocketFactory",
        "Lokhttp3/WebSocket$Factory;",
        "signalingHandler",
        "Lio/streamroot/dna/core/peer/signaling/SignalingHandler;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "messageSerializer",
        "Lio/streamroot/dna/core/peer/signaling/MessageSerializer;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "signalingPath",
        "",
        "(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V",
        "buildSignalingUrl",
        "peerId",
        "openConnection",
        "Lio/streamroot/dna/core/peer/signaling/SignalingConnection;",
        "signalingListener",
        "Lio/streamroot/dna/core/peer/signaling/SignalingListener;",
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
.field private final backendUrl:Lokhttp3/HttpUrl;

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

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

.field private final signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

.field private final signalingPath:Ljava/lang/String;

.field private final webSocketFactory:Lokhttp3/WebSocket$Factory;


# direct methods
.method public constructor <init>(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lokhttp3/WebSocket$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/peer/signaling/SignalingHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/peer/signaling/MessageSerializer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/WebSocket$Factory;",
            "Lio/streamroot/dna/core/peer/signaling/SignalingHandler;",
            "Lio/streamroot/dna/core/error/ErrorAggregator;",
            "Lio/streamroot/dna/core/peer/signaling/MessageSerializer;",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lokhttp3/HttpUrl;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "webSocketFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageSerializer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delaySequence"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backendUrl"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingPath"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    iput-object p5, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->delaySequence:Lkotlin/sequences/Sequence;

    iput-object p6, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->context:Lkotlin/coroutines/CoroutineContext;

    iput-object p7, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->backendUrl:Lokhttp3/HttpUrl;

    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p8}, Lio/streamroot/dna/core/utils/UrlsKt;->clearPathSegments(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2f

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->signalingPath:Ljava/lang/String;

    return-void
.end method

.method private final buildSignalingUrl(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 2

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->context:Lkotlin/coroutines/CoroutineContext;

    sget-object v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->getAvailabilityZone()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/streamroot/dna/core/utils/UrlsKt;->clearPathSegments(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->backendUrl:Lokhttp3/HttpUrl;

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object v1

    .line 40
    invoke-virtual {v1, v0}, Lokhttp3/HttpUrl$Builder;->addEncodedPathSegments(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    .line 41
    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->signalingPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl$Builder;->addEncodedPathSegments(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object v0

    const-string v1, "id"

    .line 42
    invoke-virtual {v0, v1, p1}, Lokhttp3/HttpUrl$Builder;->addEncodedQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object p1

    const-string v0, "backendUrl.newBuilder()\n\u2026rId)\n            .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final openConnection(Lio/streamroot/dna/core/peer/signaling/SignalingListener;Ljava/lang/String;)Lio/streamroot/dna/core/peer/signaling/SignalingConnection;
    .locals 10
    .param p1    # Lio/streamroot/dna/core/peer/signaling/SignalingListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "signalingListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0, p2}, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->buildSignalingUrl(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v8

    .line 26
    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    .line 27
    iget-object v2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    .line 28
    iget-object v3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    .line 29
    iget-object v4, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    .line 30
    iget-object v5, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 32
    iget-object v7, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->delaySequence:Lkotlin/sequences/Sequence;

    move-object v1, v0

    move-object v6, p1

    move-object v9, p2

    .line 26
    invoke-direct/range {v1 .. v9}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;-><init>(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/SignalingListener;Lkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;)V

    return-object v0
.end method
