.class public final Lio/streamroot/dna/core/peer/PeerConnectorInteractor;
.super Ljava/lang/Object;
.source "PeerConnectorInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;


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
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\nH\u0007J\u0008\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J8\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J\u0018\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/PeerConnectorInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "peerDataChannelPool",
        "Lio/streamroot/dna/core/peer/PeerDataChannelPool;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Lio/streamroot/dna/core/error/ErrorAggregator;)V",
        "broadcastMessage",
        "",
        "message",
        "",
        "closeConnection",
        "connectionId",
        "getBufferedAmount",
        "",
        "name",
        "openConnection",
        "",
        "remotePeerId",
        "registerToSignaling",
        "peerId",
        "timeout",
        "",
        "sendData",
        "requestId",
        "",
        "chunkIndex",
        "segmentId",
        "offset",
        "size",
        "sendMessage",
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
.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

.field private final peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Lio/streamroot/dna/core/error/ErrorAggregator;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/peer/PeerDataChannelPool;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "peerDataChannelPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorAggregator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    iput-object p2, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-void
.end method


# virtual methods
.method public final broadcastMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->broadcastMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final closeConnection(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->closeDataChannel(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 76
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final getBufferedAmount(Ljava/lang/String;)J
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->getBufferedAmount(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 66
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    return-wide v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "PeerConnectorInteractor"

    return-object v0
.end method

.method public final openConnection(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->openDataChannel(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 29
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final registerToSignaling(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->registerToSignaling(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final sendData(Ljava/lang/String;SSLjava/lang/String;II)Z
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string p5, "connectionId"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "segmentId"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    :try_start_0
    iget-object p5, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {p5, p1, p2, p3, p4}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->sendBinaryDataToPeer(Ljava/lang/String;SSLjava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 56
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final sendMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "connectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->peerDataChannelPool:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-virtual {v0, p1, p2}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->sendMessageToPeer(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 47
    iget-object p2, p0, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
