.class public final Lio/streamroot/dna/core/peer/PeerDataChannelPool;
.super Ljava/lang/Object;
.source "PeerDataChannelPool.kt"

# interfaces
.implements Lio/streamroot/dna/core/peer/PeerDataChannelListener;
.implements Lio/streamroot/dna/core/peer/signaling/SignalingListener;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/peer/PeerDataChannelPool$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPeerDataChannelPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeerDataChannelPool.kt\nio/streamroot/dna/core/peer/PeerDataChannelPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ChunkEncoder.kt\nio/streamroot/dna/core/peer/ChunkEncoderKt\n*L\n1#1,288:1\n241#2,2:289\n1561#2,2:291\n1561#2,2:320\n23#3,8:293\n29#3:301\n28#3,8:302\n11#3,10:310\n*E\n*S KotlinDebug\n*F\n+ 1 PeerDataChannelPool.kt\nio/streamroot/dna/core/peer/PeerDataChannelPool\n*L\n65#1,2:289\n83#1,2:291\n265#1,2:320\n101#1,8:293\n101#1:301\n101#1,8:302\n129#1,10:310\n*E\n"
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
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB7\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015J\u0008\u0010#\u001a\u00020!H\u0016J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0015J(\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0015H\u0016J*\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010.\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0015H\u0016J\u0018\u00100\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J\u0018\u00101\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J\u0018\u00102\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0016J \u00103\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00152\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0016J \u00107\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0016J\"\u00108\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0008\u0010+\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u00109\u001a\u00020*2\u0006\u0010(\u001a\u00020\u0015J\u0016\u0010:\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020;J&\u0010<\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0015J\u0016\u0010A\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015J\u000c\u0010B\u001a\u00020\u0012*\u00020\u0012H\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/PeerDataChannelPool;",
        "Lio/streamroot/dna/core/peer/PeerDataChannelListener;",
        "Lio/streamroot/dna/core/peer/signaling/SignalingListener;",
        "Ljava/lang/AutoCloseable;",
        "peerConnectionHandler",
        "Lio/streamroot/dna/core/peer/PeerConnectionHandler;",
        "signalingConnectionFactory",
        "Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;",
        "binaryDataStore",
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "chunkPool",
        "Lio/streamroot/dna/core/binary/store/ChunkPool;",
        "(Lio/streamroot/dna/core/peer/PeerConnectionHandler;Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V",
        "binaryBuffer",
        "Lorg/webrtc/DataChannel$Buffer;",
        "dataChannelPool",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Lio/streamroot/dna/core/peer/PeerDataChannel;",
        "peerConnectionFactory",
        "Lorg/webrtc/PeerConnectionFactory;",
        "peerId",
        "signalingConnection",
        "Lio/streamroot/dna/core/peer/signaling/SignalingConnection;",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "timeout",
        "",
        "broadcastMessage",
        "",
        "message",
        "close",
        "closeDataChannel",
        "connectionId",
        "getBufferedAmount",
        "onAnswerReady",
        "remotePeerId",
        "accepted",
        "",
        "sessionDescription",
        "onAnswerReceived",
        "senderId",
        "onBufferAmountLow",
        "onChannelDisconnect",
        "onChannelFailure",
        "onChannelOpen",
        "onChannelTimeout",
        "onDataReceived",
        "isBinary",
        "data",
        "Ljava/nio/ByteBuffer;",
        "onOfferReady",
        "onOfferReceived",
        "openDataChannel",
        "registerToSignaling",
        "",
        "sendBinaryDataToPeer",
        "requestId",
        "",
        "chunkIndex",
        "segmentId",
        "sendMessageToPeer",
        "reset",
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
.field public static final Companion:Lio/streamroot/dna/core/peer/PeerDataChannelPool$Companion;

.field private static final stunServerAddresses:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/webrtc/PeerConnection$IceServer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final binaryBuffer:Lorg/webrtc/DataChannel$Buffer;

.field private final binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

.field private final chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

.field private final context:Lkotlin/coroutines/CoroutineContext;

.field private final dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/streamroot/dna/core/peer/PeerDataChannel;",
            ">;"
        }
    .end annotation
.end field

.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final peerConnectionFactory:Lorg/webrtc/PeerConnectionFactory;

.field private final peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

.field private peerId:Ljava/lang/String;

.field private signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

.field private final signalingConnectionFactory:Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;

.field private final supervisor:Lkotlinx/coroutines/Job;

.field private timeout:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->Companion:Lio/streamroot/dna/core/peer/PeerDataChannelPool$Companion;

    .line 281
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->stunServerAddresses:Ljava/util/ArrayList;

    .line 284
    sget-object v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->stunServerAddresses:Ljava/util/ArrayList;

    const-string v1, "stun:stun.l.google.com:19302"

    invoke-static {v1}, Lorg/webrtc/PeerConnection$IceServer;->builder(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/PeerConnection$IceServer$Builder;->createIceServer()Lorg/webrtc/PeerConnection$IceServer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/peer/PeerConnectionHandler;Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/peer/PeerConnectionHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/binary/store/BinaryDataStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/streamroot/dna/core/binary/store/ChunkPool;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "peerConnectionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalingConnectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunkPool"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnectionFactory:Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;

    iput-object p3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    iput-object p5, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->context:Lkotlin/coroutines/CoroutineContext;

    iput-object p6, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 35
    invoke-static {p2, p1, p2}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p2

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->supervisor:Lkotlinx/coroutines/Job;

    .line 36
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    invoke-static {}, Lorg/webrtc/PeerConnectionFactory;->builder()Lorg/webrtc/PeerConnectionFactory$Builder;

    move-result-object p2

    .line 43
    invoke-virtual {p2}, Lorg/webrtc/PeerConnectionFactory$Builder;->createPeerConnectionFactory()Lorg/webrtc/PeerConnectionFactory;

    move-result-object p2

    const-string p3, "PeerConnectionFactory\n  \u2026tePeerConnectionFactory()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionFactory:Lorg/webrtc/PeerConnectionFactory;

    .line 45
    new-instance p2, Lorg/webrtc/DataChannel$Buffer;

    iget-object p3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p3}, Lio/streamroot/dna/core/binary/store/ChunkPool;->getChunkSize()I

    move-result p3

    add-int/lit8 p3, p3, 0x4

    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 46
    sget-object p4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 45
    invoke-direct {p2, p3, p1}, Lorg/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->binaryBuffer:Lorg/webrtc/DataChannel$Buffer;

    return-void
.end method

.method public static final synthetic access$getDataChannelPool$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic access$getErrorAggregator$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/error/ErrorAggregator;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-object p0
.end method

.method public static final synthetic access$getPeerConnectionFactory$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lorg/webrtc/PeerConnectionFactory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionFactory:Lorg/webrtc/PeerConnectionFactory;

    return-object p0
.end method

.method public static final synthetic access$getPeerConnectionHandler$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/peer/PeerConnectionHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    return-object p0
.end method

.method public static final synthetic access$getSignalingConnection$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lio/streamroot/dna/core/peer/signaling/SignalingConnection;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 27
    iget-object p0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    return-object p0
.end method

.method public static final synthetic access$getStunServerAddresses$cp()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    sget-object v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->stunServerAddresses:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final synthetic access$getTimeout$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)J
    .locals 2

    .line 27
    iget-wide v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->timeout:J

    return-wide v0
.end method

.method public static final synthetic access$setSignalingConnection$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Lio/streamroot/dna/core/peer/signaling/SignalingConnection;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/peer/signaling/SignalingConnection;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 27
    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    return-void
.end method

.method public static final synthetic access$setTimeout$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;J)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->timeout:J

    return-void
.end method

.method private final reset(Lorg/webrtc/DataChannel$Buffer;)Lorg/webrtc/DataChannel$Buffer;
    .locals 2
    .param p1    # Lorg/webrtc/DataChannel$Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 275
    iget-object v0, p1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p1
.end method


# virtual methods
.method public final broadcastMessage(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    :try_start_0
    invoke-static {p1}, Lio/streamroot/dna/core/utils/StringExtensionKt;->toWebRtcBuffer(Ljava/lang/String;)Lorg/webrtc/DataChannel$Buffer;

    move-result-object p1

    .line 83
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "dataChannelPool.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 291
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    .line 84
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->reset(Lorg/webrtc/DataChannel$Buffer;)Lorg/webrtc/DataChannel$Buffer;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/streamroot/dna/core/peer/PeerDataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 87
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 2

    .line 261
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 263
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->close()V

    .line 265
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "dataChannelPool.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 320
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    .line 265
    invoke-interface {v1}, Lio/streamroot/dna/core/peer/PeerDataChannel;->close()V

    goto :goto_0

    .line 266
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 268
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionFactory:Lorg/webrtc/PeerConnectionFactory;

    invoke-virtual {v0}, Lorg/webrtc/PeerConnectionFactory;->dispose()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 270
    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final closeDataChannel(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    if-eqz p1, :cond_0

    .line 249
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->context:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$closeDataChannel$1$1;

    const/4 v4, 0x0

    invoke-direct {v0, p1, v4}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$closeDataChannel$1$1;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_0
    return-void
.end method

.method public final getBufferedAmount(Ljava/lang/String;)J
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lio/streamroot/dna/core/peer/PeerDataChannel;->getBufferedAmount()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public onAnswerReady(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDescription"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->sendAnswer(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result p3

    const/4 p4, 0x1

    if-eq p3, p4, :cond_1

    .line 205
    :cond_0
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 208
    iget-object p4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p3, Ljava/lang/Throwable;

    invoke-virtual {p4, p3}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 209
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onAnswerReceived(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
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

    const-string v0, "senderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    .line 188
    iget-object p3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/streamroot/dna/core/peer/PeerDataChannel;

    .line 189
    instance-of v0, p3, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;

    if-eqz v0, :cond_1

    .line 190
    check-cast p3, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;

    invoke-virtual {p3, p4}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->setRemoteDescription(Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_0
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 197
    iget-object p4, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p3, Ljava/lang/Throwable;

    invoke-virtual {p4, p3}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 198
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBufferAmountLow(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onBufferAmountLow(Ljava/lang/String;)V

    return-void
.end method

.method public onChannelDisconnect(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onDisconnect(Ljava/lang/String;)V

    .line 232
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->closeDataChannel(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 234
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remotePeerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onConnectionFailure(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->closeDataChannel(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 243
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onChannelOpen(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remotePeerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onConnectionOpen(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 122
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onChannelTimeout(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remotePeerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onTimeout(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->closeDataChannel(Ljava/lang/String;)V

    return-void
.end method

.method public onDataReceived(Ljava/lang/String;ZLjava/nio/ByteBuffer;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 311
    :try_start_0
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 312
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 313
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v4

    .line 130
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p2}, Lio/streamroot/dna/core/binary/store/ChunkPool;->borrow()Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 131
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 132
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 134
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    new-instance v1, Lio/streamroot/dna/core/binary/store/BinaryData;

    const/4 v6, 0x0

    const/4 v2, 0x1

    new-array v7, v2, [Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    aput-object p2, v7, v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->add(Lio/streamroot/dna/core/binary/store/BinaryData;)Ljava/lang/String;

    move-result-object v2

    .line 135
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    const/4 v5, 0x4

    .line 141
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    move-object v1, p1

    .line 135
    invoke-virtual/range {v0 .. v6}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onDataReceive(Ljava/lang/String;Ljava/lang/String;SSII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 317
    :try_start_1
    new-instance p2, Lio/streamroot/dna/core/peer/ChunkDecodingException;

    const-string v0, "WebRtc chunk decoding exception."

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WebRTC Buffer => capacity:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " position:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " remaining:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " \n"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v0, p3, p1}, Lio/streamroot/dna/core/peer/ChunkDecodingException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 144
    :cond_0
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerConnectionHandler:Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p3}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p3

    const-string v0, "StandardCharsets.UTF_8.decode(data)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1, p3}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;->onMessageReceive(Ljava/lang/String;Ljava/nio/CharBuffer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 147
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onOfferReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
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

    .line 215
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->sendOffer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    .line 216
    :cond_0
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 219
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p3, Ljava/lang/Throwable;

    invoke-virtual {v0, p3}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    .line 220
    invoke-virtual {p0, p2, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->onChannelFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onOfferReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "senderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_1

    .line 153
    iget-object p3, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->sendAnswer(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z

    :cond_0
    return-void

    .line 157
    :cond_1
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->context:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p2

    move-object v7, p1

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$onOfferReceived$1;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final openDataChannel(Ljava/lang/String;)Z
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "dataChannelPool.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 289
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/streamroot/dna/core/peer/PeerDataChannel;

    .line 65
    invoke-interface {v2}, Lio/streamroot/dna/core/peer/PeerDataChannel;->getRemotePeerId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    .line 66
    new-instance v0, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;

    .line 68
    move-object v4, p0

    check-cast v4, Lio/streamroot/dna/core/peer/PeerDataChannelListener;

    .line 69
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 70
    iget-wide v6, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->timeout:J

    .line 71
    new-instance v1, Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)V

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object v2, v0

    move-object v3, p1

    .line 66
    invoke-direct/range {v2 .. v8}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/peer/PeerDataChannelListener;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V

    .line 74
    iget-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0}, Lio/streamroot/dna/core/peer/OfferPeerDataChannel;->connectionId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final registerToSignaling(Ljava/lang/String;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerId:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 57
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/streamroot/dna/core/peer/signaling/SignalingConnection;->close()V

    .line 58
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnectionFactory:Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;

    move-object v1, p0

    check-cast v1, Lio/streamroot/dna/core/peer/signaling/SignalingListener;

    invoke-virtual {v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;->openConnection(Lio/streamroot/dna/core/peer/signaling/SignalingListener;Ljava/lang/String;)Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->signalingConnection:Lio/streamroot/dna/core/peer/signaling/SignalingConnection;

    .line 60
    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->peerId:Ljava/lang/String;

    int-to-long p1, p2

    .line 61
    iput-wide p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->timeout:J

    return-void
.end method

.method public final sendBinaryDataToPeer(Ljava/lang/String;SSLjava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 101
    :try_start_0
    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {v1, p4}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->get(Ljava/lang/String;)Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object p4

    if-eqz p4, :cond_1

    aget-object p4, p4, p3

    if-eqz p4, :cond_1

    .line 102
    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    if-eqz p1, :cond_0

    .line 103
    iget-object v1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->binaryBuffer:Lorg/webrtc/DataChannel$Buffer;

    .line 293
    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p4

    .line 294
    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 296
    iget-object v2, v1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 297
    iget-object v2, v1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    .line 302
    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 301
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 300
    invoke-virtual {p2, p4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 307
    iget-object p2, v1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 104
    invoke-interface {p1, v1}, Lio/streamroot/dna/core/peer/PeerDataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z

    move-result p1

    .line 105
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 109
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return v0
.end method

.method public final sendMessageToPeer(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->dataChannelPool:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/peer/PeerDataChannel;

    if-eqz p1, :cond_0

    invoke-static {p2}, Lio/streamroot/dna/core/utils/StringExtensionKt;->toWebRtcBuffer(Ljava/lang/String;)Lorg/webrtc/DataChannel$Buffer;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 95
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
