.class public final Lio/streamroot/dna/core/peer/OfferPeerDataChannel;
.super Lio/streamroot/dna/core/peer/SimplePeerDataChannel;
.source "OfferPeerDataChannel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\n\u00a2\u0006\u0002\u0010\rJ\u0008\u0010\u0019\u001a\u00020\u001aH\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016J\u0008\u0010\u001b\u001a\u00020\u0008H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0008\u0010\"\u001a\u00020\u001aH\u0016J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0003R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/OfferPeerDataChannel;",
        "Lio/streamroot/dna/core/peer/SimplePeerDataChannel;",
        "remotePeerId",
        "",
        "peerDataChannelListener",
        "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
        "connectionId",
        "timeout",
        "",
        "peerConnectionFactory",
        "Lkotlin/Function1;",
        "Lorg/webrtc/PeerConnection$Observer;",
        "Lorg/webrtc/PeerConnection;",
        "(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V",
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
        "onIceGatheringChange",
        "iceGatheringState",
        "Lorg/webrtc/PeerConnection$IceGatheringState;",
        "onStateChange",
        "send",
        "data",
        "Lorg/webrtc/DataChannel$Buffer;",
        "setRemoteDescription",
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
.field private final dataChannel:Lorg/webrtc/DataChannel;

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
.method public constructor <init>(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V
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
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
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

    move-object/from16 v1, p6

    const-string v2, "remotePeerId"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "connectionId"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "peerConnectionFactory"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    .line 22
    invoke-direct {v0, v4, v6, v5}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/PeerConnection;

    if-eqz v1, :cond_1

    iput-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    .line 26
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    new-instance v1, Lorg/webrtc/DataChannel$Init;

    invoke-direct {v1}, Lorg/webrtc/DataChannel$Init;-><init>()V

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, v1, Lorg/webrtc/DataChannel$Init;->ordered:Z

    const/4 v2, 0x1

    .line 31
    iput v2, v1, Lorg/webrtc/DataChannel$Init;->maxRetransmits:I

    .line 33
    iget-object v2, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v2, v5, v1}, Lorg/webrtc/PeerConnection;->createDataChannel(Ljava/lang/String;Lorg/webrtc/DataChannel$Init;)Lorg/webrtc/DataChannel;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    .line 34
    iget-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    move-object v2, v0

    check-cast v2, Lorg/webrtc/DataChannel$Observer;

    invoke-virtual {v1, v2}, Lorg/webrtc/DataChannel;->registerObserver(Lorg/webrtc/DataChannel$Observer;)V

    .line 36
    iget-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    move-object v2, v0

    check-cast v2, Lorg/webrtc/SdpObserver;

    invoke-virtual {v0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->mediaConstraint()Lorg/webrtc/MediaConstraints;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/webrtc/PeerConnection;->createOffer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    .line 38
    sget-object v1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v8, v1

    check-cast v8, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    const/4 v10, 0x0

    new-instance v11, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;

    const/4 v7, 0x0

    move-object v1, v11

    move-wide/from16 v2, p4

    invoke-direct/range {v1 .. v7}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel$1;-><init>(JLio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v11

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x2

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v1

    iput-object v1, v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    return-void

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 23
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    .line 65
    :try_start_0
    invoke-super {p0}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->close()V

    .line 67
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->unregisterObserver()V

    .line 68
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->close()V

    .line 69
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->dispose()V

    .line 71
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->close()V

    .line 72
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->dispose()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 64
    monitor-exit p0

    throw v0
.end method

.method public connectionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 50
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public internalBufferAmount()J
    .locals 2

    .line 105
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->bufferedAmount()J

    move-result-wide v0

    return-wide v0
.end method

.method public isOpen()Z
    .locals 2

    .line 53
    sget-object v0, Lorg/webrtc/DataChannel$State;->OPEN:Lorg/webrtc/DataChannel$State;

    iget-object v1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

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

    .line 90
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    move-object v1, p0

    check-cast v1, Lorg/webrtc/SdpObserver;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->setLocalDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method public onIceGatheringChange(Lorg/webrtc/PeerConnection$IceGatheringState;)V
    .locals 4
    .param p1    # Lorg/webrtc/PeerConnection$IceGatheringState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "iceGatheringState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    sget-object v0, Lorg/webrtc/PeerConnection$IceGatheringState;->COMPLETE:Lorg/webrtc/PeerConnection$IceGatheringState;

    if-ne v0, p1, :cond_0

    .line 96
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    invoke-virtual {v2}, Lorg/webrtc/PeerConnection;->getLocalDescription()Lorg/webrtc/SessionDescription;

    move-result-object v2

    iget-object v2, v2, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v3, "peerConnection.localDescription.description"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1, v2}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onOfferReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStateChange()V
    .locals 3

    .line 77
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->state()Lorg/webrtc/DataChannel$State;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannelStateRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 79
    sget-object v1, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    if-eq v1, v0, :cond_1

    sget-object v1, Lorg/webrtc/DataChannel$State;->CLOSING:Lorg/webrtc/DataChannel$State;

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    sget-object v1, Lorg/webrtc/DataChannel$State;->OPEN:Lorg/webrtc/DataChannel$State;

    if-ne v1, v0, :cond_2

    .line 83
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 84
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelOpen(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 80
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->timeoutJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 81
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelDisconnect(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public remotePeerId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 48
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized send(Lorg/webrtc/DataChannel$Buffer;)Z
    .locals 1
    .param p1    # Lorg/webrtc/DataChannel$Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->dataChannel:Lorg/webrtc/DataChannel;

    invoke-virtual {v0, p1}, Lorg/webrtc/DataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 61
    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    .line 56
    monitor-exit p0

    throw p1
.end method

.method public final setRemoteDescription(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->peerConnection:Lorg/webrtc/PeerConnection;

    move-object v1, p0

    check-cast v1, Lorg/webrtc/SdpObserver;

    new-instance v2, Lorg/webrtc/SessionDescription;

    sget-object v3, Lorg/webrtc/SessionDescription$Type;->ANSWER:Lorg/webrtc/SessionDescription$Type;

    invoke-direct {v2, v3, p1}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/PeerConnection;->setRemoteDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    return-void
.end method
