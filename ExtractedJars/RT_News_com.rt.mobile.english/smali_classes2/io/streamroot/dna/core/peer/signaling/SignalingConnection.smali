.class public final Lio/streamroot/dna/core/peer/signaling/SignalingConnection;
.super Lokhttp3/WebSocketListener;
.source "SignalingConnection.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0008\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010%\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010&\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010\'\u001a\u0004\u0018\u00010(2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J(\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u0002012\u0008\u00105\u001a\u0004\u0018\u00010\u0013J\u001e\u00106\u001a\u0002012\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0013R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/signaling/SignalingConnection;",
        "Lokhttp3/WebSocketListener;",
        "Ljava/lang/AutoCloseable;",
        "webSocketFactory",
        "Lokhttp3/WebSocket$Factory;",
        "signalingHandler",
        "Lio/streamroot/dna/core/peer/signaling/SignalingHandler;",
        "messageSerializer",
        "Lio/streamroot/dna/core/peer/signaling/MessageSerializer;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "signalingListener",
        "Lio/streamroot/dna/core/peer/signaling/SignalingListener;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "signalingUrl",
        "Lokhttp3/HttpUrl;",
        "peerId",
        "",
        "(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/SignalingListener;Lkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;)V",
        "exponentialBackoff",
        "",
        "reconnectionCounter",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "webSocketRef",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lokhttp3/WebSocket;",
        "close",
        "",
        "onClosed",
        "webSocket",
        "code",
        "",
        "reason",
        "onClosing",
        "onFailure",
        "t",
        "",
        "response",
        "Lokhttp3/Response;",
        "onMessage",
        "text",
        "bytes",
        "Lokio/ByteString;",
        "onOpen",
        "sendAnswer",
        "",
        "remotePeerId",
        "connectionId",
        "accepted",
        "sessionDescription",
        "sendOffer",
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

.field private exponentialBackoff:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

.field private final peerId:Ljava/lang/String;

.field private final reconnectionCounter:Ljava/util/concurrent/atomic/AtomicLong;

.field private final signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

.field private final signalingListener:Lio/streamroot/dna/core/peer/signaling/SignalingListener;

.field private final signalingUrl:Lokhttp3/HttpUrl;

.field private final supervisor:Lkotlinx/coroutines/Job;

.field private webSocketFactory:Lokhttp3/WebSocket$Factory;

.field private webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lokhttp3/WebSocket;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/SignalingListener;Lkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lokhttp3/WebSocket$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/peer/signaling/SignalingHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/peer/signaling/MessageSerializer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/streamroot/dna/core/peer/signaling/SignalingListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/sequences/Sequence;
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
            "Lio/streamroot/dna/core/peer/signaling/MessageSerializer;",
            "Lio/streamroot/dna/core/error/ErrorAggregator;",
            "Lio/streamroot/dna/core/peer/signaling/SignalingListener;",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lokhttp3/HttpUrl;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "webSocketFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageSerializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delaySequence"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingUrl"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Lokhttp3/WebSocketListener;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p5, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingListener:Lio/streamroot/dna/core/peer/signaling/SignalingListener;

    iput-object p6, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->delaySequence:Lkotlin/sequences/Sequence;

    iput-object p7, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingUrl:Lokhttp3/HttpUrl;

    iput-object p8, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->peerId:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 30
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->supervisor:Lkotlinx/coroutines/Job;

    .line 31
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->delaySequence:Lkotlin/sequences/Sequence;

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->exponentialBackoff:Ljava/util/Iterator;

    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->reconnectionCounter:Ljava/util/concurrent/atomic/AtomicLong;

    .line 36
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    new-instance p3, Lokhttp3/Request$Builder;

    invoke-direct {p3}, Lokhttp3/Request$Builder;-><init>()V

    iget-object p4, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingUrl:Lokhttp3/HttpUrl;

    invoke-virtual {p3, p4}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p3

    invoke-virtual {p3}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p3

    move-object p4, p0

    check-cast p4, Lokhttp3/WebSocketListener;

    invoke-interface {p2, p3, p4}, Lokhttp3/WebSocket$Factory;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokhttp3/WebSocket;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lokhttp3/WebSocket;->cancel()V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getExponentialBackoff$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/Iterator;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->exponentialBackoff:Ljava/util/Iterator;

    return-object p0
.end method

.method public static final synthetic access$getReconnectionCounter$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->reconnectionCounter:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$getSignalingUrl$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Lokhttp3/HttpUrl;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingUrl:Lokhttp3/HttpUrl;

    return-object p0
.end method

.method public static final synthetic access$getWebSocketFactory$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Lokhttp3/WebSocket$Factory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    return-object p0
.end method

.method public static final synthetic access$getWebSocketRef$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic access$setExponentialBackoff$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Ljava/util/Iterator;)V
    .locals 0
    .param p1    # Ljava/util/Iterator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->exponentialBackoff:Ljava/util/Iterator;

    return-void
.end method

.method public static final synthetic access$setWebSocketFactory$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Lokhttp3/WebSocket$Factory;)V
    .locals 0
    .param p1    # Lokhttp3/WebSocket$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketFactory:Lokhttp3/WebSocket$Factory;

    return-void
.end method

.method public static final synthetic access$setWebSocketRef$p(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/atomic/AtomicReference;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    .line 60
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 61
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    const/16 v1, 0x3e8

    const-string v2, "bye"

    invoke-interface {v0, v1, v2}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 59
    monitor-exit p0

    throw v0
.end method

.method public onClosed(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 0
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/SignalingHandler;->onDisconnect()V

    return-void
.end method

.method public onClosing(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 0
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public onFailure(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 6
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lokhttp3/Response;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->supervisor:Lkotlinx/coroutines/Job;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p2

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/Job;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    new-instance p1, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;

    invoke-direct {p1, p0, p3}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection$onFailure$1;-><init>(Lio/streamroot/dna/core/peer/signaling/SignalingConnection;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public onMessage(Lokhttp3/WebSocket;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onMessage(Lokhttp3/WebSocket;Lokio/ByteString;)V
    .locals 3
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokio/ByteString;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 79
    :try_start_0
    invoke-virtual {p2}, Lokio/ByteString;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 80
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->deserialize(Lokio/ByteString;)Lio/streamroot/dna/core/peer/signaling/RawMessage;

    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object p2

    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    if-ne p2, v0, :cond_0

    .line 82
    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingListener:Lio/streamroot/dna/core/peer/signaling/SignalingListener;

    .line 83
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getSenderId()Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getSdp()Ljava/lang/String;

    move-result-object p1

    .line 82
    invoke-interface {p2, v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SignalingListener;->onOfferReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 87
    :cond_0
    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingListener:Lio/streamroot/dna/core/peer/signaling/SignalingListener;

    .line 88
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getSenderId()Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getAccepted()Z

    move-result v2

    .line 91
    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/RawMessage;->getSdp()Ljava/lang/String;

    move-result-object p1

    .line 87
    invoke-interface {p2, v0, v1, v2, p1}, Lio/streamroot/dna/core/peer/signaling/SignalingListener;->onAnswerReceived(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 95
    iget-object p2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onOpen(Lokhttp3/WebSocket;Lokhttp3/Response;)V
    .locals 0
    .param p1    # Lokhttp3/WebSocket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Response;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->signalingHandler:Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    invoke-virtual {p1}, Lio/streamroot/dna/core/peer/signaling/SignalingHandler;->onConnect()V

    .line 66
    iget-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->delaySequence:Lkotlin/sequences/Sequence;

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->exponentialBackoff:Ljava/util/Iterator;

    return-void
.end method

.method public final sendAnswer(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    iget-object v3, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->peerId:Ljava/lang/String;

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->serializeAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lokio/ByteString;

    move-result-object p1

    invoke-interface {v0, p1}, Lokhttp3/WebSocket;->send(Lokio/ByteString;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final sendOffer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDescription"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->webSocketRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->messageSerializer:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    iget-object v2, p0, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->peerId:Ljava/lang/String;

    invoke-virtual {v1, p1, v2, p2, p3}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->serializeOffer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lokio/ByteString;

    move-result-object p1

    invoke-interface {v0, p1}, Lokhttp3/WebSocket;->send(Lokio/ByteString;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
