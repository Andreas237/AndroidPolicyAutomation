.class final Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PeerDataChannelPool.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/peer/PeerDataChannelPool;->openDataChannel(Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/webrtc/PeerConnection$Observer;",
        "Lorg/webrtc/PeerConnection;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lorg/webrtc/PeerConnection;",
        "peerConnectionObserver",
        "Lorg/webrtc/PeerConnection$Observer;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Lorg/webrtc/PeerConnection$Observer;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;->invoke(Lorg/webrtc/PeerConnection$Observer;)Lorg/webrtc/PeerConnection;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/webrtc/PeerConnection$Observer;)Lorg/webrtc/PeerConnection;
    .locals 2
    .param p1    # Lorg/webrtc/PeerConnection$Observer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "peerConnectionObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lio/streamroot/dna/core/peer/PeerDataChannelPool$openDataChannel$peerDataChannel$1;->this$0:Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    invoke-static {v0}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getPeerConnectionFactory$p(Lio/streamroot/dna/core/peer/PeerDataChannelPool;)Lorg/webrtc/PeerConnectionFactory;

    move-result-object v0

    invoke-static {}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;->access$getStunServerAddresses$cp()Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnectionFactory;->createPeerConnection(Ljava/util/List;Lorg/webrtc/PeerConnection$Observer;)Lorg/webrtc/PeerConnection;

    move-result-object p1

    return-object p1
.end method
