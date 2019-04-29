.class public final Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;
.super Lio/streamroot/dna/core/peer/SimplePeerDataChannel;
.source "AnswerPeerDataChannel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016J\u0008\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0008\u0010$\u001a\u00020\u001bH\u0016J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\'H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;",
        "Lio/streamroot/dna/core/peer/SimplePeerDataChannel;",
        "remotePeerId",
        "",
        "peerDataChannelListener",
        "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
        "connectionId",
        "remoteSessionDescription",
        "timeout",
        "",
        "peerConnectionFactory",
        "Lkotlin/Function1;",
        "Lorg/webrtc/PeerConnection$Observer;",
        "Lorg/webrtc/PeerConnection;",
        "(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V",
        "dataChannel",
        "Lorg/webrtc/DataChannel;",
        "dataChannelStateRef",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lorg/webrtc/DataChannel$State;",
        "isOpen",
        "",
        "()Z",
        "peerConnection",
        "timeoutJob",
        "Lkotlinx/coroutines/Job;",
        "close",
        "",
        "internalBufferAmount",
        "onCreateSuccess",
        "sessionDescription",
        "Lorg/webrtc/SessionDescription;",
        "onDataChannel",
        "onIceGatheringChange",
        "iceGatheringState",
        "Lorg/webrtc/PeerConnection$IceGatheringState;",
        "onStateChange",
        "send",
        "data",
        "Lorg/webrtc/DataChannel$Buffer;",
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
.field private dataChannel:Lorg/webrtc/DataChannel;

.field private dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/webrtc/DataChannel$State;",
            ">;"
        }
    .end annotation
.end field

.field private peerConnection:Lorg/webrtc/PeerConnection;

.field private final timeoutJob:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/peer/PeerDataChannelListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/webrtc/PeerConnection$Observer;",
            "+",
            "Lorg/webrtc/PeerConnection;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v6, p1

    move-object v5, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p7

    const-string v3, "remotePeerId"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "connectionId"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "remoteSessionDescription"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "peerConnectionFactory"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    .line 23
    invoke-direct {v0, v4, v6, v5}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/PeerConnection;

    if-eqz v2, :cond_0

    iput-object v2, v0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    .line 27
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    iget-object v2, v0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    move-object v3, v0

    check-cast v3, Lorg/webrtc/SdpObserver;

    new-instance v7, Lorg/webrtc/SessionDescription;

    sget-object v8, Lorg/webrtc/SessionDescription$Type;->OFFER:Lorg/webrtc/SessionDescription$Type;

    invoke-direct {v7, v8, v1}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v7}, Lorg/webrtc/PeerConnection;->setRemoteDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    .line 32
    iget-object v1, v0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->mediaConstraint()Lorg/webrtc/MediaConstraints;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/webrtc/PeerConnection;->createAnswer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    .line 34
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v8, v1

    check-cast v8, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    const/4 v10, 0x0

    new-instance v11, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel$1;

    const/4 v7, 0x0

    move-object v1, v11

    move-wide/from16 v2, p5

    invoke-direct/range {v1 .. v7}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel$1;-><init>(JLio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v11

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x2

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v1

    iput-object v1, v0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    return-void

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    .line 58
    :try_start_0
    invoke-super {p0}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->close()V

    .line 60
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->unregisterObserver()V

    .line 61
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->close()V

    .line 62
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->dispose()V

    :cond_2
    const/4 v0, 0x0

    .line 63
    check-cast v0, Lorg/webrtc/DataChannel;

    iput-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    .line 65
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->close()V

    .line 66
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->dispose()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 57
    monitor-exit p0

    throw v0
.end method

.method public connectionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 46
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public internalBufferAmount()J
    .locals 2

    .line 99
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->bufferedAmount()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public isOpen()Z
    .locals 2

    .line 49
    sget-object v0, Lorg/webrtc/DataChannel$State;->OPEN:Lorg/webrtc/DataChannel$State;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/DataChannel$State;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreateSuccess(Lorg/webrtc/SessionDescription;)V
    .locals 2
    .param p1    # Lorg/webrtc/SessionDescription;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    move-object v1, p0

    check-cast v1, Lorg/webrtc/SdpObserver;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->setLocalDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method public onDataChannel(Lorg/webrtc/DataChannel;)V
    .locals 2
    .param p1    # Lorg/webrtc/DataChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    move-object v0, p0

    check-cast v0, Lorg/webrtc/DataChannel$Observer;

    invoke-virtual {p1, v0}, Lorg/webrtc/DataChannel;->registerObserver(Lorg/webrtc/DataChannel$Observer;)V

    .line 87
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 88
    iput-object p1, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    .line 89
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelOpen(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onIceGatheringChange(Lorg/webrtc/PeerConnection$IceGatheringState;)V
    .locals 5
    .param p1    # Lorg/webrtc/PeerConnection$IceGatheringState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "iceGatheringState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    sget-object v0, Lorg/webrtc/PeerConnection$IceGatheringState;->COMPLETE:Lorg/webrtc/PeerConnection$IceGatheringState;

    if-ne v0, p1, :cond_0

    .line 94
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    iget-object v3, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v3}, Lorg/webrtc/PeerConnection;->getLocalDescription()Lorg/webrtc/SessionDescription;

    move-result-object v3

    iget-object v3, v3, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v4, "peerConnection.localDescription.description"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1, v2, v3}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onAnswerReady(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStateChange()V
    .locals 2

    .line 71
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->state()Lorg/webrtc/DataChannel$State;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 72
    :goto_0
    iget-object v1, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 73
    sget-object v1, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    if-eq v1, v0, :cond_1

    sget-object v1, Lorg/webrtc/DataChannel$State;->CLOSING:Lorg/webrtc/DataChannel$State;

    if-ne v1, v0, :cond_2

    .line 74
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 75
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelDisconnect(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public remotePeerId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 44
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized send(Lorg/webrtc/DataChannel$Buffer;)Z
    .locals 2
    .param p1    # Lorg/webrtc/DataChannel$Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->isOpen()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/streamroot/dna/core/peer/AnswerPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/webrtc/DataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
