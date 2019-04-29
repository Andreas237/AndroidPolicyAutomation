.class public final Lio/streamroot/dna/core/peer/signaling/SdpEncoder;
.super Ljava/lang/Object;
.source "SdpEncoder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/peer/signaling/SdpEncoder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdpEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdpEncoder.kt\nio/streamroot/dna/core/peer/signaling/SdpEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,236:1\n221#1:239\n186#1,28:243\n186#1,29:271\n214#1:300\n1506#2,2:237\n1508#2:240\n1570#2,2:241\n1572#2:301\n637#2,9:302\n1506#2,3:311\n1561#2,2:314\n1506#2,3:322\n1506#2,3:331\n120#3,6:316\n120#3,6:325\n*E\n*S KotlinDebug\n*F\n+ 1 SdpEncoder.kt\nio/streamroot/dna/core/peer/signaling/SdpEncoder\n*L\n33#1:239\n89#1,28:243\n89#1,29:271\n89#1:300\n33#1,2:237\n33#1:240\n89#1,2:241\n89#1:301\n134#1,9:302\n136#1,3:311\n145#1,2:314\n157#1,3:322\n163#1,3:331\n155#1,6:316\n161#1,6:325\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u000c\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0008\u0011H\u0082\u0008J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J-\u0010\u001b\u001a\u00020\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u001dH\u0082\u0008J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0013J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lio/streamroot/dna/core/peer/signaling/SdpEncoder;",
        "",
        "randomService",
        "Lio/streamroot/dna/core/utils/RandomService;",
        "enableIpv6",
        "",
        "(Lio/streamroot/dna/core/utils/RandomService;Z)V",
        "fingerprintRegex",
        "Lkotlin/text/Regex;",
        "icePwdRegex",
        "iceUfragRegex",
        "udpIceCandRegex",
        "buildIceCandidate",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;",
        "block",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "decode",
        "",
        "type",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
        "encodedSdp",
        "Lio/streamroot/dna/schemas/SignalingMessages$Sdp;",
        "decodeFingerprint",
        "dtlsFingerprint",
        "Lcom/google/protobuf/ByteString;",
        "decodeIpAddress",
        "encodedIpAddress",
        "Lkotlin/Function2;",
        "",
        "encode",
        "rawSdp",
        "encodeFingerprint",
        "encodeIpAddress",
        "ipAddress",
        "port",
        "iceCodeToSdpString",
        "iceCode",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;",
        "sdpStringToIceCode",
        "code",
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
.field private static final ALL_ICE_CANDIDATE:Ljava/lang/String; = "^a=candidate:.* (?:udp|UDP) .* ((?:[a-fA-F0-9]{0,4}:){0,7}[a-fA-F0-9]{0,4}|[0-9]{1,3}(?:\\.[0-9]{1,3}){3}) ([0-9]{1,5}) typ ([a-zA-Z]+)(?: raddr ((?:[a-fA-F0-9]{0,4}:){0,7}[a-fA-F0-9]{0,4}|[0-9]{1,3}(?:\\.[0-9]{1,3}){3}) rport ([0-9]{1,5}))?.*(\\r)?"

.field public static final Companion:Lio/streamroot/dna/core/peer/signaling/SdpEncoder$Companion;

.field private static final IPV4_ENCODED_SIZE:I = 0x6

.field private static final IPV4_ONLY_ICE_CANDIDATE:Ljava/lang/String; = "^a=candidate:.* (?:udp|UDP) .* [0-9]{1,3}(?:\\.[0-9]{1,3}){3} ([0-9]{1,5}) typ ([a-zA-Z]+)(?: raddr [0-9]{1,3}(?:\\.[0-9]{1,3}){3} rport ([0-9]{1,5}))?.*(\\r)?"

.field private static final IPV4_PART_COUNT:I = 0x4

.field private static final IPV4_REGEX:Ljava/lang/String; = "[0-9]{1,3}(?:\\.[0-9]{1,3}){3}"

.field private static final IPV6_AND_IPV4_REGEX:Ljava/lang/String; = "((?:[a-fA-F0-9]{0,4}:){0,7}[a-fA-F0-9]{0,4}|[0-9]{1,3}(?:\\.[0-9]{1,3}){3})"

.field private static final IPV6_ENCODED_SIZE:I = 0x12

.field private static final IPV6_PART_COUNT:I = 0x8

.field private static final PORT_REGEX:Ljava/lang/String; = "([0-9]{1,5})"


# instance fields
.field private final fingerprintRegex:Lkotlin/text/Regex;

.field private final icePwdRegex:Lkotlin/text/Regex;

.field private final iceUfragRegex:Lkotlin/text/Regex;

.field private final randomService:Lio/streamroot/dna/core/utils/RandomService;

.field private final udpIceCandRegex:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->Companion:Lio/streamroot/dna/core/peer/signaling/SdpEncoder$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p0, v0, v1, v2, v0}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;-><init>(Lio/streamroot/dna/core/utils/RandomService;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/streamroot/dna/core/utils/RandomService;Z)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/utils/RandomService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "randomService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->randomService:Lio/streamroot/dna/core/utils/RandomService;

    .line 22
    new-instance p1, Lkotlin/text/Regex;

    const-string v0, "^a=ice-ufrag:(.+)"

    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->iceUfragRegex:Lkotlin/text/Regex;

    .line 23
    new-instance p1, Lkotlin/text/Regex;

    const-string v0, "^a=ice-pwd:(.+)"

    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->icePwdRegex:Lkotlin/text/Regex;

    .line 24
    new-instance p1, Lkotlin/text/Regex;

    const-string v0, "^a=fingerprint:sha-256 ([A-F0-9]{2}(?::[A-F0-9]{2}){31})"

    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->fingerprintRegex:Lkotlin/text/Regex;

    .line 25
    new-instance p1, Lkotlin/text/Regex;

    if-eqz p2, :cond_0

    const-string p2, "^a=candidate:.* (?:udp|UDP) .* ((?:[a-fA-F0-9]{0,4}:){0,7}[a-fA-F0-9]{0,4}|[0-9]{1,3}(?:\\.[0-9]{1,3}){3}) ([0-9]{1,5}) typ ([a-zA-Z]+)(?: raddr ((?:[a-fA-F0-9]{0,4}:){0,7}[a-fA-F0-9]{0,4}|[0-9]{1,3}(?:\\.[0-9]{1,3}){3}) rport ([0-9]{1,5}))?.*(\\r)?"

    goto :goto_0

    :cond_0
    const-string p2, "^a=candidate:.* (?:udp|UDP) .* [0-9]{1,3}(?:\\.[0-9]{1,3}){3} ([0-9]{1,5}) typ ([a-zA-Z]+)(?: raddr [0-9]{1,3}(?:\\.[0-9]{1,3}){3} rport ([0-9]{1,5}))?.*(\\r)?"

    :goto_0
    invoke-direct {p1, p2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->udpIceCandRegex:Lkotlin/text/Regex;

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/utils/RandomService;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 21
    sget-object p1, Lio/streamroot/dna/core/utils/DefaultRandomService;->INSTANCE:Lio/streamroot/dna/core/utils/DefaultRandomService;

    check-cast p1, Lio/streamroot/dna/core/utils/RandomService;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;-><init>(Lio/streamroot/dna/core/utils/RandomService;Z)V

    return-void
.end method

.method private final buildIceCandidate(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;"
        }
    .end annotation

    .line 221
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SignalingMessages.IceCan\u2026newBuilder().apply(block)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final decodeFingerprint(Lcom/google/protobuf/ByteString;)Ljava/lang/String;
    .locals 5

    .line 145
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 146
    check-cast p1, Ljava/lang/Iterable;

    .line 314
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    const-string v2, "%02X:"

    const/4 v3, 0x1

    .line 147
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    array-length v0, v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "java.lang.String.format(this, *args)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 149
    :cond_0
    invoke-static {v1}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final decodeIpAddress(Lcom/google/protobuf/ByteString;Lkotlin/jvm/functions/Function2;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/ByteString;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_6

    .line 186
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 188
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 189
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    goto :goto_2

    .line 200
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x8

    :goto_0
    if-ge v2, v1, :cond_2

    const-string v3, "byteBuffer"

    .line 202
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v4}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    .line 203
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 205
    :cond_2
    invoke-static {v0}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 200
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 191
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    :goto_1
    if-ge v2, v1, :cond_4

    const-string v3, "byteBuffer"

    .line 193
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedByte(Ljava/nio/ByteBuffer;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    .line 194
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 196
    :cond_4
    invoke-static {v0}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    if-eqz v0, :cond_5

    const-string v1, "byteBuffer"

    .line 213
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void

    :cond_6
    :goto_3
    return-void
.end method

.method private final encodeFingerprint(Ljava/lang/String;)Lcom/google/protobuf/ByteString;
    .locals 7

    .line 132
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 p1, 0x1

    new-array v1, p1, [Ljava/lang/String;

    const-string v2, ":"

    const/4 v6, 0x0

    aput-object v2, v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    .line 133
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 302
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 303
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    .line 304
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 305
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 134
    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    move v2, v6

    :goto_0
    if-nez v2, :cond_0

    .line 306
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 310
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 136
    :goto_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 312
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "byteBuffer"

    .line 137
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x10

    invoke-static {v2}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {p1, v1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->putUnsignedByte(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    goto :goto_2

    .line 139
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 141
    invoke-static {p1}, Lcom/google/protobuf/ByteString;->copyFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ByteString;

    move-result-object p1

    const-string v0, "ByteString.copyFrom(byteBuffer)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final encodeIpAddress(Ljava/lang/String;Ljava/lang/String;)Lcom/google/protobuf/ByteString;
    .locals 8

    .line 155
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    .line 316
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v6, 0x0

    move v2, v6

    :goto_0
    const/4 v3, -0x1

    const/16 v4, 0x2e

    const/4 v7, 0x1

    if-ge v2, v1, :cond_2

    .line 317
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_0

    move v5, v7

    goto :goto_1

    :cond_0
    move v5, v6

    :goto_1
    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_2
    if-ltz v2, :cond_3

    .line 156
    new-array v1, v7, [C

    aput-char v4, v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/4 v0, 0x6

    .line 157
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 323
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "byteBuffer"

    .line 158
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xa

    invoke-static {v2}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->putUnsignedByte(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_3

    .line 325
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    move v2, v6

    :goto_4
    const/16 v4, 0x3a

    if-ge v2, v1, :cond_6

    .line 326
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_4

    move v5, v7

    goto :goto_5

    :cond_4
    move v5, v6

    :goto_5
    if-eqz v5, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    move v2, v3

    :goto_6
    if-ltz v2, :cond_b

    .line 162
    new-array v1, v7, [C

    aput-char v4, v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 163
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 332
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 164
    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_7

    move v3, v7

    goto :goto_8

    :cond_7
    move v3, v6

    :goto_8
    if-eqz v3, :cond_8

    .line 168
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    rsub-int/lit8 v3, v3, 0x8

    add-int/2addr v3, v7

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_7

    :cond_8
    const-string v3, "byteBuffer"

    .line 171
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-static {v3}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v1, v2}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->putUnsignedShort(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object v1

    goto :goto_7

    :cond_9
    move-object v0, v1

    :cond_a
    const-string p1, "byteBuffer"

    .line 179
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->putUnsignedShort(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    .line 180
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 182
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ByteString;

    move-result-object p1

    const-string p2, "ByteString.copyFrom(byteBuffer)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 175
    :cond_b
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method

.method private final iceCodeToSdpString(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)Ljava/lang/String;
    .locals 1

    .line 216
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    if-ne p1, v0, :cond_0

    const-string p1, "srflx"

    goto :goto_0

    :cond_0
    const-string p1, "host"

    :goto_0
    return-object p1
.end method

.method private final sdpStringToIceCode(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 1

    const-string v0, "srflx"

    .line 218
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    goto :goto_0

    :cond_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final decode(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Ljava/lang/String;
    .locals 17
    .param p1    # Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "encodedSdp"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v2

    const-string v4, "encodedSdp.iceUfrag"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v5, 0x1

    if-nez v2, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v6, 0x0

    if-eqz v2, :cond_1

    return-object v6

    .line 85
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v2

    const-string v7, "encodedSdp.icePwd"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_3

    return-object v6

    .line 86
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDtlsFingerprint()Lcom/google/protobuf/ByteString;

    move-result-object v2

    const-string v5, "encodedSdp.dtlsFingerprint"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v6

    .line 87
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceCandidatesCount()I

    move-result v2

    if-nez v2, :cond_5

    return-object v6

    :cond_5
    const/16 v2, 0x12c

    .line 89
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "v=0\n"

    .line 90
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "o=- "

    .line 91
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->randomService:Lio/streamroot/dna/core/utils/RandomService;

    invoke-interface {v2}, Lio/streamroot/dna/core/utils/RandomService;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " 2 IN IP4 127.0.0.1\n"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "s=-\n"

    .line 92
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "t=0 0\n"

    .line 93
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "a=group:BUNDLE data\n"

    .line 94
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "a=msid-semantic: WMS\n"

    .line 95
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "m=application 59118 DTLS/SCTP 5000\n"

    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "c=IN IP4 0.0.0.0\n"

    .line 97
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceCandidatesList()Ljava/util/List;

    move-result-object v2

    const-string v7, "encodedSdp.iceCandidatesList"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    .line 242
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v7, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v10, v7, 0x1

    if-gez v7, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    check-cast v8, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    const-string v11, "iceCandidate"

    .line 100
    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getGlobalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v11

    if-eqz v11, :cond_11

    .line 243
    invoke-virtual {v11}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_7

    goto/16 :goto_9

    .line 245
    :cond_7
    invoke-virtual {v11}, Lcom/google/protobuf/ByteString;->asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v11

    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 246
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v12

    const/4 v14, 0x4

    const/16 v15, 0x3a

    const/16 v4, 0x10

    const/16 v6, 0x8

    const/16 v9, 0x12

    const/4 v13, 0x6

    if-eq v12, v13, :cond_a

    if-eq v12, v9, :cond_8

    const/4 v6, 0x0

    goto :goto_5

    .line 257
    :cond_8
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v6, :cond_9

    const-string v6, "byteBuffer"

    .line 259
    invoke-static {v11, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result v6

    invoke-static {v4}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v13

    invoke-static {v6, v13}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v6

    const-string v13, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    const/16 v6, 0x8

    const/4 v13, 0x6

    goto :goto_3

    .line 262
    :cond_9
    invoke-static {v12}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 257
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v9, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    .line 248
    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v14, :cond_b

    const-string v12, "byteBuffer"

    .line 250
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedByte(Ljava/nio/ByteBuffer;)I

    move-result v12

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v12, 0x2e

    .line 251
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 253
    :cond_b
    invoke-static {v6}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 248
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v9, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    if-eqz v6, :cond_11

    const-string v9, "byteBuffer"

    .line 270
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result v9

    const-string v11, "a=candidate:"

    .line 101
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " 1 udp "

    .line 103
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " "

    .line 105
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " "

    .line 107
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " typ "

    .line 109
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual {v8}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getCode()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    move-result-object v6

    const-string v7, "iceCandidate.code"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v6}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->iceCodeToSdpString(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v8}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getLocalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v6

    if-eqz v6, :cond_11

    .line 112
    invoke-virtual {v8}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getLocalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v6

    if-eqz v6, :cond_11

    .line 271
    invoke-virtual {v6}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_c

    goto/16 :goto_9

    .line 273
    :cond_c
    invoke-virtual {v6}, Lcom/google/protobuf/ByteString;->asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 274
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    const/4 v8, 0x6

    if-eq v7, v8, :cond_f

    const/16 v8, 0x12

    if-eq v7, v8, :cond_d

    const/4 v4, 0x0

    goto :goto_8

    .line 285
    :cond_d
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    const/16 v9, 0x8

    :goto_6
    if-ge v8, v9, :cond_e

    const-string v11, "byteBuffer"

    .line 287
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result v11

    invoke-static {v4}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v11

    const-string v12, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    .line 290
    :cond_e
    invoke-static {v7}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 285
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    .line 276
    :cond_f
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v14, :cond_10

    const-string v8, "byteBuffer"

    .line 278
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedByte(Ljava/nio/ByteBuffer;)I

    move-result v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v8, 0x2e

    .line 279
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    .line 281
    :cond_10
    invoke-static {v4}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->deleteLastChar(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 276
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_8
    if-eqz v4, :cond_11

    const-string v7, "byteBuffer"

    .line 298
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lio/streamroot/dna/core/utils/ByteBufferExtensionKt;->unsignedShort(Ljava/nio/ByteBuffer;)I

    move-result v6

    const-string v7, " raddr "

    .line 113
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " rport "

    .line 115
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_11
    :goto_9
    const/16 v4, 0xa

    .line 120
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v7, v10

    const/4 v6, 0x0

    goto/16 :goto_2

    :cond_12
    const/16 v4, 0xa

    const-string v2, "a=ice-ufrag:"

    .line 122
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "a=ice-pwd:"

    .line 123
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "a=fingerprint:sha-256 "

    .line 124
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDtlsFingerprint()Lcom/google/protobuf/ByteString;

    move-result-object v2

    const-string v3, "encodedSdp.dtlsFingerprint"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->decodeFingerprint(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "a=setup:"

    .line 125
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    if-ne v1, v2, :cond_13

    const-string v1, "actpass"

    goto :goto_a

    :cond_13
    const-string v1, "active"

    :goto_a
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "a=mid:data\n"

    .line 126
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "a=sctpmap:5000 webrtc-datachannel 1024\n"

    .line 127
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final encode(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "rawSdp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;

    const-string v0, "Trying to encode blank sdp"

    invoke-direct {p1, v0, v2, v1, v2}, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_0
    const-string v4, "\\r"

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p1

    .line 31
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const-string v3, "\n"

    .line 32
    new-instance v4, Lkotlin/text/Regex;

    invoke-direct {v4, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v3}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 33
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    move-result-object v4

    .line 238
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 34
    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_0

    .line 36
    :cond_2
    iget-object v7, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->iceUfragRegex:Lkotlin/text/Regex;

    invoke-static {v7, v5, v3, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 37
    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v6

    if-eqz v8, :cond_3

    const-string v5, "sdpBuilder"

    .line 38
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->setIceUfrag(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    goto :goto_0

    .line 43
    :cond_3
    iget-object v7, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->icePwdRegex:Lkotlin/text/Regex;

    invoke-static {v7, v5, v3, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 44
    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v6

    if-eqz v8, :cond_4

    const-string v5, "sdpBuilder"

    .line 45
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->setIcePwd(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    goto :goto_0

    .line 50
    :cond_4
    iget-object v7, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->fingerprintRegex:Lkotlin/text/Regex;

    invoke-static {v7, v5, v3, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 51
    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v6

    if-eqz v8, :cond_5

    const-string v5, "sdpBuilder"

    .line 52
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {p0, v5}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->encodeFingerprint(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->setDtlsFingerprint(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    goto/16 :goto_0

    .line 57
    :cond_5
    iget-object v7, p0, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->udpIceCandRegex:Lkotlin/text/Regex;

    invoke-static {v7, v5, v3, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 58
    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v6

    if-eqz v7, :cond_1

    .line 239
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    move-result-object v7

    .line 60
    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-direct {p0, v6, v8}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->encodeIpAddress(Ljava/lang/String;Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v6

    invoke-virtual {v7, v6}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->setGlobalAddress(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    .line 61
    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v6

    const/4 v8, 0x3

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {p0, v6}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->sdpStringToIceCode(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    move-result-object v6

    invoke-virtual {v7, v6}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->setCode(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    .line 63
    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object v6

    const/4 v8, 0x4

    invoke-interface {v6, v8}, Lkotlin/text/MatchGroupCollection;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 64
    invoke-virtual {v6}, Lkotlin/text/MatchGroup;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    const/4 v8, 0x5

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {p0, v6, v5}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;->encodeIpAddress(Ljava/lang/String;Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v5

    invoke-virtual {v7, v5}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->setLocalAddress(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    :cond_6
    const-string v5, "SignalingMessages.IceCan\u2026newBuilder().apply(block)"

    .line 66
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v4, v7}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    move-result-object v4

    goto/16 :goto_0

    :cond_7
    const-string v0, "sdpBuilder"

    .line 75
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->getIceUfrag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdpBuilder.iceUfrag"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_8

    move v0, v6

    goto :goto_1

    :cond_8
    move v0, v3

    :goto_1
    if-eqz v0, :cond_9

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;

    const-string v1, "Trying to encode invalid sdp, IceUfrag missing"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid sdp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 76
    :cond_9
    invoke-virtual {v4}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->getIcePwd()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdpBuilder.icePwd"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_a

    move v3, v6

    :cond_a
    if-eqz v3, :cond_b

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;

    const-string v1, "Trying to encode invalid sdp, IcePwd missing"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid sdp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 77
    :cond_b
    invoke-virtual {v4}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->getDtlsFingerprint()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const-string v1, "sdpBuilder.dtlsFingerprint"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;

    const-string v1, "Trying to encode invalid sdp, missing DtlsFingerPrint"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid sdp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 78
    :cond_c
    invoke-virtual {v4}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->getIceCandidatesCount()I

    move-result v0

    if-nez v0, :cond_d

    new-instance v0, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;

    const-string v1, "Trying to encode invalid sdp, no IceCandidate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid sdp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/streamroot/dna/core/peer/signaling/SdpEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 80
    :cond_d
    invoke-virtual {v4}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    const-string v0, "sdpBuilder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p1
.end method
