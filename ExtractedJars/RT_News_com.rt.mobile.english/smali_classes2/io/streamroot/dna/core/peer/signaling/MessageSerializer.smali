.class public final Lio/streamroot/dna/core/peer/signaling/MessageSerializer;
.super Ljava/lang/Object;
.source "MessageSerializer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessageSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageSerializer.kt\nio/streamroot/dna/core/peer/signaling/MessageSerializer\n*L\n1#1,86:1\n*E\n"
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
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u000bH\u0002J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J&\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/signaling/MessageSerializer;",
        "",
        "sdpEncoder",
        "Lio/streamroot/dna/core/peer/signaling/SdpEncoder;",
        "(Lio/streamroot/dna/core/peer/signaling/SdpEncoder;)V",
        "buildSignalingMessage",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;",
        "block",
        "Lkotlin/Function1;",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "deserialize",
        "Lio/streamroot/dna/core/peer/signaling/RawMessage;",
        "encodedMessage",
        "Lokio/ByteString;",
        "serializeAnswer",
        "remotePeerId",
        "",
        "senderId",
        "connectionId",
        "accepted",
        "",
        "sessionDescription",
        "serializeMessage",
        "signalingMessage",
        "serializeOffer",
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
.field private final sdpEncoder:Lio/streamroot/dna/core/peer/signaling/SdpEncoder;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/peer/signaling/SdpEncoder;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/peer/signaling/SdpEncoder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sdpEncoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->sdpEncoder:Lio/streamroot/dna/core/peer/signaling/SdpEncoder;

    return-void
.end method

.method public static final synthetic access$getSdpEncoder$p(Lio/streamroot/dna/core/peer/signaling/MessageSerializer;)Lio/streamroot/dna/core/peer/signaling/SdpEncoder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object p0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->sdpEncoder:Lio/streamroot/dna/core/peer/signaling/SdpEncoder;

    return-object p0
.end method

.method private final buildSignalingMessage(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;"
        }
    .end annotation

    .line 83
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    const-string v0, "SignalingMessages.Connec\u2026er().apply(block).build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p1
.end method

.method private final serializeMessage(Ljava/lang/String;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)Lokio/ByteString;
    .locals 3

    .line 70
    invoke-virtual {p2}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->toByteArray()[B

    move-result-object p2

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    array-length v1, p2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 73
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "StandardCharsets.UTF_8"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "(this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    int-to-byte p1, p1

    .line 74
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 75
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 77
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 79
    invoke-static {v0}, Lokio/ByteString;->of(Ljava/nio/ByteBuffer;)Lokio/ByteString;

    move-result-object p1

    const-string p2, "ByteString.of(byteBuffer)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final deserialize(Lokio/ByteString;)Lio/streamroot/dna/core/peer/signaling/RawMessage;
    .locals 10
    .param p1    # Lokio/ByteString;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "encodedMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lokio/ByteString;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->parseFrom([B)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object p1

    .line 58
    iget-object v0, p0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->sdpEncoder:Lio/streamroot/dna/core/peer/signaling/SdpEncoder;

    const-string v1, "signalingMessage"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object v1

    const-string v2, "signalingMessage.type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v2

    const-string v3, "signalingMessage.sdp"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->decode(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Ljava/lang/String;

    move-result-object v8

    .line 60
    new-instance v0, Lio/streamroot/dna/core/peer/signaling/RawMessage;

    .line 61
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object v5

    const-string v1, "signalingMessage.type"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderId()Ljava/lang/String;

    move-result-object v6

    const-string v1, "signalingMessage.senderId"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v7

    const-string v1, "signalingMessage.connectionId"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getAccepted()Z

    move-result v9

    move-object v4, v0

    .line 60
    invoke-direct/range {v4 .. v9}, Lio/streamroot/dna/core/peer/signaling/RawMessage;-><init>(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final serializeAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lokio/ByteString;
    .locals 7
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
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;

    move-object v1, v0

    move-object v2, p0

    move v3, p4

    move-object v4, p2

    move-object v5, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeAnswer$signalingMessage$1;-><init>(Lio/streamroot/dna/core/peer/signaling/MessageSerializer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->buildSignalingMessage(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object p2

    .line 37
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->serializeMessage(Ljava/lang/String;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)Lokio/ByteString;

    move-result-object p1

    return-object p1
.end method

.method public final serializeOffer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lokio/ByteString;
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
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "remotePeerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "senderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDescription"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeOffer$signalingMessage$1;

    invoke-direct {v0, p0, p2, p3, p4}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer$serializeOffer$signalingMessage$1;-><init>(Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->buildSignalingMessage(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object p2

    .line 53
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;->serializeMessage(Ljava/lang/String;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)Lokio/ByteString;

    move-result-object p1

    return-object p1
.end method
