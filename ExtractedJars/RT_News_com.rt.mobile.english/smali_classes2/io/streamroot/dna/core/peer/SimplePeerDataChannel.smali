.class public abstract Lio/streamroot/dna/core/peer/SimplePeerDataChannel;
.super Ljava/lang/Object;
.source "SimplePeerDataChannel.kt"

# interfaces
.implements Lio/streamroot/dna/core/peer/PeerDataChannel;
.implements Lorg/webrtc/PeerConnection$Observer;
.implements Lorg/webrtc/SdpObserver;
.implements Lorg/webrtc/DataChannel$Observer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/peer/SimplePeerDataChannel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008 \u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001HB\u001f\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u001dH&J\u0008\u0010\u001f\u001a\u00020 H\u0004J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J#\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020#0(H\u0016\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001dH\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u000203H\u0016J\u001b\u00104\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u0002030(H\u0016\u00a2\u0006\u0002\u00106J\u0010\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0008\u0010A\u001a\u00020\u001bH\u0016J\u0010\u0010B\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0008H\u0016J\u0008\u0010C\u001a\u00020\u001bH\u0016J\u0010\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020FH\u0016J\u0008\u0010G\u001a\u00020\u001bH\u0016R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0008X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000e\u00a8\u0006I"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/SimplePeerDataChannel;",
        "Lio/streamroot/dna/core/peer/PeerDataChannel;",
        "Lorg/webrtc/PeerConnection$Observer;",
        "Lorg/webrtc/SdpObserver;",
        "Lorg/webrtc/DataChannel$Observer;",
        "peerDataChannelListener",
        "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
        "remotePeerId",
        "",
        "connectionId",
        "(Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;)V",
        "bufferHigh",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "getConnectionId",
        "()Ljava/lang/String;",
        "latestBufferAmountRef",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "getLatestBufferAmountRef",
        "()Ljava/util/concurrent/atomic/AtomicLong;",
        "setLatestBufferAmountRef",
        "(Ljava/util/concurrent/atomic/AtomicLong;)V",
        "getPeerDataChannelListener",
        "()Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
        "setPeerDataChannelListener",
        "(Lio/streamroot/dna/core/peer/PeerDataChannelListener;)V",
        "getRemotePeerId",
        "close",
        "",
        "getBufferedAmount",
        "",
        "internalBufferAmount",
        "mediaConstraint",
        "Lorg/webrtc/MediaConstraints;",
        "onAddStream",
        "mediaStream",
        "Lorg/webrtc/MediaStream;",
        "onAddTrack",
        "rtpReceiver",
        "Lorg/webrtc/RtpReceiver;",
        "mediaStreams",
        "",
        "(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V",
        "onBufferedAmountChange",
        "bufferAmount",
        "onCreateFailure",
        "s",
        "onDataChannel",
        "dataChannel",
        "Lorg/webrtc/DataChannel;",
        "onIceCandidate",
        "iceCandidate",
        "Lorg/webrtc/IceCandidate;",
        "onIceCandidatesRemoved",
        "iceCandidates",
        "([Lorg/webrtc/IceCandidate;)V",
        "onIceConnectionChange",
        "iceConnectionState",
        "Lorg/webrtc/PeerConnection$IceConnectionState;",
        "onIceConnectionReceivingChange",
        "b",
        "",
        "onMessage",
        "buffer",
        "Lorg/webrtc/DataChannel$Buffer;",
        "onRemoveStream",
        "onRenegotiationNeeded",
        "onSetFailure",
        "onSetSuccess",
        "onSignalingChange",
        "signalingState",
        "Lorg/webrtc/PeerConnection$SignalingState;",
        "onStateChange",
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
.field private static final BUFFER_TRESHOLD:J = 0x3a98L

.field public static final Companion:Lio/streamroot/dna/core/peer/SimplePeerDataChannel$Companion;


# instance fields
.field private bufferHigh:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final connectionId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final remotePeerId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->Companion:Lio/streamroot/dna/core/peer/SimplePeerDataChannel$Companion;

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/peer/PeerDataChannelListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->remotePeerId:Ljava/lang/String;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->bufferHigh:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    check-cast v0, Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    iput-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    return-void
.end method

.method public getBufferedAmount()J
    .locals 2

    .line 78
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final getConnectionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    return-object v0
.end method

.method protected final getLatestBufferAmountRef()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method protected final getPeerDataChannelListener()Lio/streamroot/dna/core/peer/PeerDataChannelListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 14
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    return-object v0
.end method

.method public getRemotePeerId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->remotePeerId:Ljava/lang/String;

    return-object v0
.end method

.method public abstract internalBufferAmount()J
.end method

.method protected final mediaConstraint()Lorg/webrtc/MediaConstraints;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 88
    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    .line 89
    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->mandatory:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "OfferToReceiveVideo"

    const-string v4, "false"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->mandatory:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "OfferToReceiveAudio"

    const-string v4, "false"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->optional:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string v3, "DtlsSrtpKeyAgreement"

    const-string v4, "true"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public onAddStream(Lorg/webrtc/MediaStream;)V
    .locals 1
    .param p1    # Lorg/webrtc/MediaStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mediaStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAddTrack(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V
    .locals 1
    .param p1    # Lorg/webrtc/RtpReceiver;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Lorg/webrtc/MediaStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rtpReceiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "mediaStreams"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onBufferedAmountChange(J)V
    .locals 4

    .line 66
    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->internalBufferAmount()J

    move-result-wide p1

    .line 67
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 68
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->bufferHigh:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v1, 0x3a98

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    cmp-long v0, p1, v1

    if-gez v0, :cond_1

    .line 69
    iget-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    invoke-interface {p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onBufferAmountLow(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onCreateFailure(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onDataChannel(Lorg/webrtc/DataChannel;)V
    .locals 1
    .param p1    # Lorg/webrtc/DataChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIceCandidate(Lorg/webrtc/IceCandidate;)V
    .locals 1
    .param p1    # Lorg/webrtc/IceCandidate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "iceCandidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIceCandidatesRemoved([Lorg/webrtc/IceCandidate;)V
    .locals 1
    .param p1    # [Lorg/webrtc/IceCandidate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "iceCandidates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .locals 1
    .param p1    # Lorg/webrtc/PeerConnection$IceConnectionState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "iceConnectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    sget-object v0, Lorg/webrtc/PeerConnection$IceConnectionState;->FAILED:Lorg/webrtc/PeerConnection$IceConnectionState;

    if-eq p1, v0, :cond_0

    sget-object v0, Lorg/webrtc/PeerConnection$IceConnectionState;->CLOSED:Lorg/webrtc/PeerConnection$IceConnectionState;

    if-ne p1, v0, :cond_1

    .line 31
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    invoke-interface {p1, v0}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelDisconnect(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onIceConnectionReceivingChange(Z)V
    .locals 0

    return-void
.end method

.method public onMessage(Lorg/webrtc/DataChannel$Buffer;)V
    .locals 4
    .param p1    # Lorg/webrtc/DataChannel$Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    iget-boolean v2, p1, Lorg/webrtc/DataChannel$Buffer;->binary:Z

    iget-object p1, p1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    const-string v3, "buffer.data"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onDataReceived(Ljava/lang/String;ZLjava/nio/ByteBuffer;)V

    :cond_0
    return-void
.end method

.method public onRemoveStream(Lorg/webrtc/MediaStream;)V
    .locals 1
    .param p1    # Lorg/webrtc/MediaStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mediaStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onRenegotiationNeeded()V
    .locals 0

    return-void
.end method

.method public onSetFailure(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    invoke-virtual {p0}, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onSetSuccess()V
    .locals 0

    return-void
.end method

.method public onSignalingChange(Lorg/webrtc/PeerConnection$SignalingState;)V
    .locals 1
    .param p1    # Lorg/webrtc/PeerConnection$SignalingState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "signalingState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lorg/webrtc/PeerConnection$SignalingState;->CLOSED:Lorg/webrtc/PeerConnection$SignalingState;

    if-ne p1, v0, :cond_0

    .line 24
    iget-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->connectionId:Ljava/lang/String;

    invoke-interface {p1, v0}, Lio/streamroot/dna/core/peer/PeerDataChannelListener;->onChannelDisconnect(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStateChange()V
    .locals 0

    return-void
.end method

.method public onTrack(Lorg/webrtc/RtpTransceiver;)V
    .locals 0

    invoke-static {p0, p1}, Lorg/webrtc/PeerConnection$Observer$$CC;->onTrack(Lorg/webrtc/PeerConnection$Observer;Lorg/webrtc/RtpTransceiver;)V

    return-void
.end method

.method protected final setLatestBufferAmountRef(Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/atomic/AtomicLong;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->latestBufferAmountRef:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method protected final setPeerDataChannelListener(Lio/streamroot/dna/core/peer/PeerDataChannelListener;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/peer/PeerDataChannelListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 14
    iput-object p1, p0, Lio/streamroot/dna/core/peer/SimplePeerDataChannel;->peerDataChannelListener:Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    return-void
.end method
