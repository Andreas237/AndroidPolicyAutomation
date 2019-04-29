.class final Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;
.super Lkotlin/jvm/internal/Lambda;
.source "MessageSerializer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->serializeAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lokio/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessageSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageSerializer.kt\nio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1\n*L\n1#1,86:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
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
.field final synthetic $accepted:Z

.field final synthetic $connectionId:Ljava/lang/String;

.field final synthetic $senderId:Ljava/lang/String;

.field final synthetic $sessionDescription:Ljava/lang/String;

.field final synthetic this$0:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/peer/signaling/MessageSerializer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->this$0:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    iput-boolean p2, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$accepted:Z

    iput-object p3, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$senderId:Ljava/lang/String;

    iput-object p4, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$connectionId:Ljava/lang/String;

    iput-object p5, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$sessionDescription:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->invoke(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;)V
    .locals 2
    .param p1    # Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->setType(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    .line 31
    iget-boolean v0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$accepted:Z

    invoke-virtual {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->setAccepted(Z)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    .line 32
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$senderId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->setSenderId(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    .line 33
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$connectionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->setConnectionId(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->$sessionDescription:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;->this$0:Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    invoke-static {v1}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->access$getSdpEncoder$p(Lio/streamroot/dna/core/peer/signaling/MessageSerializer;)Lio/streamroot/dna/core/peer/signaling/SdpEncoder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->encode(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    :cond_0
    return-void
.end method
