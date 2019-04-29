.class public final Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$SdpOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Sdp"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lio/streamroot/dna/schemas/SignalingMessages$Sdp;",
        "Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$SdpOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

.field public static final DTLSFINGERPRINT_FIELD_NUMBER:I = 0x3

.field public static final ICECANDIDATES_FIELD_NUMBER:I = 0x4

.field public static final ICEPWD_FIELD_NUMBER:I = 0x2

.field public static final ICEUFRAG_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$Sdp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private dtlsFingerprint_:Lcom/google/protobuf/ByteString;

.field private iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$ProtobufList<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation
.end field

.field private icePwd_:Ljava/lang/String;

.field private iceUfrag_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1245
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-direct {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;-><init>()V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1246
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->makeImmutable()V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 566
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    const-string v0, ""

    .line 567
    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    const-string v0, ""

    .line 568
    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    .line 569
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    .line 570
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    return-void
.end method

.method static synthetic access$1000(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/String;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIceUfrag(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1100(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->clearIceUfrag()V

    return-void
.end method

.method static synthetic access$1200(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIceUfragBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$1300(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/String;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIcePwd(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1400(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->clearIcePwd()V

    return-void
.end method

.method static synthetic access$1500(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIcePwdBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$1600(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setDtlsFingerprint(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$1700(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->clearDtlsFingerprint()V

    return-void
.end method

.method static synthetic access$1800(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-void
.end method

.method static synthetic access$1900(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-void
.end method

.method static synthetic access$2000(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-void
.end method

.method static synthetic access$2100(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V

    return-void
.end method

.method static synthetic access$2200(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-void
.end method

.method static synthetic access$2300(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V

    return-void
.end method

.method static synthetic access$2400(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;Ljava/lang/Iterable;)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->addAllIceCandidates(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic access$2500(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->clearIceCandidates()V

    return-void
.end method

.method static synthetic access$2600(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;I)V
    .locals 0

    .line 561
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->removeIceCandidates(I)V

    return-void
.end method

.method static synthetic access$900()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1

    .line 561
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object v0
.end method

.method private addAllIceCandidates(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;)V"
        }
    .end annotation

    .line 793
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 794
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite;->addAll(Ljava/lang/Iterable;Ljava/util/Collection;)V

    return-void
.end method

.method private addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 1

    .line 785
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 786
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-virtual {p2}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Internal$ProtobufList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private addIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 1

    if-nez p2, :cond_0

    .line 767
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 769
    :cond_0
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 770
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Internal$ProtobufList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 1

    .line 777
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 778
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$ProtobufList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private addIceCandidates(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 1

    if-nez p1, :cond_0

    .line 756
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 758
    :cond_0
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 759
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$ProtobufList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private clearDtlsFingerprint()V
    .locals 1

    .line 688
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDtlsFingerprint()Lcom/google/protobuf/ByteString;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method private clearIceCandidates()V
    .locals 1

    .line 801
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    return-void
.end method

.method private clearIcePwd()V
    .locals 1

    .line 650
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    return-void
.end method

.method private clearIceUfrag()V
    .locals 1

    .line 604
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    return-void
.end method

.method private ensureIceCandidatesIsMutable()V
    .locals 1

    .line 726
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$ProtobufList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 727
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 728
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageLite;->mutableCopy(Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    :cond_0
    return-void
.end method

.method public static getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1

    .line 1250
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object v0
.end method

.method public static newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 914
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    return-object v0
.end method

.method public static newBuilder(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;
    .locals 1

    .line 917
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    invoke-virtual {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 891
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 897
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 855
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 862
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 902
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 909
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 879
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 886
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom([B)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 867
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 874
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$Sdp;",
            ">;"
        }
    .end annotation

    .line 1256
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getParserForType()Lcom/google/protobuf/Parser;

    move-result-object v0

    return-object v0
.end method

.method private removeIceCandidates(I)V
    .locals 1

    .line 807
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 808
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$ProtobufList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private setDtlsFingerprint(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 678
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 681
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method private setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;)V
    .locals 1

    .line 748
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 749
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-virtual {p2}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Internal$ProtobufList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setIceCandidates(ILio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 1

    if-nez p2, :cond_0

    .line 738
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 740
    :cond_0
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->ensureIceCandidatesIsMutable()V

    .line 741
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Internal$ProtobufList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setIcePwd(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 640
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 643
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    return-void
.end method

.method private setIcePwdBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 658
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 660
    :cond_0
    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 662
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    return-void
.end method

.method private setIceUfrag(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 594
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 597
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    return-void
.end method

.method private setIceUfragBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 612
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 614
    :cond_0
    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 616
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1139
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    .line 1238
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 1229
    :pswitch_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p1, :cond_1

    const-class p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    monitor-enter p1

    .line 1230
    :try_start_0
    sget-object p2, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p2, :cond_0

    .line 1231
    new-instance p2, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    sget-object p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-direct {p2, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    sput-object p2, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->PARSER:Lcom/google/protobuf/Parser;

    .line 1233
    :cond_0
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 1235
    :cond_1
    :goto_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->PARSER:Lcom/google/protobuf/Parser;

    return-object p1

    .line 1170
    :pswitch_1
    check-cast p2, Lcom/google/protobuf/CodedInputStream;

    .line 1172
    check-cast p3, Lcom/google/protobuf/ExtensionRegistryLite;

    :cond_2
    :goto_1
    if-nez v1, :cond_9

    .line 1177
    :try_start_1
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result p1

    if-eqz p1, :cond_8

    const/16 v0, 0xa

    if-eq p1, v0, :cond_7

    const/16 v0, 0x12

    if-eq p1, v0, :cond_6

    const/16 v0, 0x1a

    if-eq p1, v0, :cond_5

    const/16 v0, 0x22

    if-eq p1, v0, :cond_3

    .line 1183
    invoke-virtual {p2, p1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 1206
    :cond_3
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {p1}, Lcom/google/protobuf/Internal$ProtobufList;->isModifiable()Z

    move-result p1

    if-nez p1, :cond_4

    .line 1207
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 1208
    invoke-static {p1}, Lcom/google/protobuf/GeneratedMessageLite;->mutableCopy(Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 1210
    :cond_4
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 1211
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->parser()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    .line 1210
    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$ProtobufList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1202
    :cond_5
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    goto :goto_1

    .line 1195
    :cond_6
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object p1

    .line 1197
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    goto :goto_1

    .line 1189
    :cond_7
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object p1

    .line 1191
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :cond_8
    :goto_2
    move v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 1219
    :try_start_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 1221
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 1217
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1223
    :goto_3
    throw p1

    .line 1226
    :cond_9
    :pswitch_2
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p1

    .line 1154
    :pswitch_3
    check-cast p2, Lcom/google/protobuf/GeneratedMessageLite$Visitor;

    .line 1155
    check-cast p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1156
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    .line 1157
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    iget-object v4, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    .line 1156
    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    .line 1158
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    .line 1159
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    iget-object v4, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    .line 1158
    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    .line 1160
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq p1, v0, :cond_a

    move p1, v2

    goto :goto_4

    :cond_a
    move p1, v1

    :goto_4
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    sget-object v4, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq v3, v4, :cond_b

    move v1, v2

    :cond_b
    iget-object v2, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    invoke-interface {p2, p1, v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    .line 1162
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    iget-object v0, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {p2, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitList(Lcom/google/protobuf/Internal$ProtobufList;Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 1163
    sget-object p1, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;->INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;

    if-ne p2, p1, :cond_c

    .line 1165
    iget p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->bitField0_:I

    iget p2, p3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->bitField0_:I

    or-int/2addr p1, p2

    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->bitField0_:I

    :cond_c
    return-object p0

    .line 1151
    :pswitch_4
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    invoke-direct {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;-><init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V

    return-object p1

    .line 1147
    :pswitch_5
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {p1}, Lcom/google/protobuf/Internal$ProtobufList;->makeImmutable()V

    return-object v0

    .line 1144
    :pswitch_6
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-object p1

    .line 1141
    :pswitch_7
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-direct {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public getDtlsFingerprint()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 671
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getIceCandidates(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1

    .line 716
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$ProtobufList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p1
.end method

.method public getIceCandidatesCount()I
    .locals 1

    .line 710
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$ProtobufList;->size()I

    move-result v0

    return v0
.end method

.method public getIceCandidatesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation

    .line 697
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    return-object v0
.end method

.method public getIceCandidatesOrBuilder(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;
    .locals 1

    .line 723
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$ProtobufList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;

    return-object p1
.end method

.method public getIceCandidatesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;",
            ">;"
        }
    .end annotation

    .line 704
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    return-object v0
.end method

.method public getIcePwd()Ljava/lang/String;
    .locals 1

    .line 625
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    return-object v0
.end method

.method public getIcePwdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 632
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getIceUfrag()Ljava/lang/String;
    .locals 1

    .line 579
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    return-object v0
.end method

.method public getIceUfragBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 586
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 828
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 832
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 834
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/protobuf/CodedOutputStream;->computeStringSize(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 836
    :goto_0
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x2

    .line 838
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeStringSize(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    .line 840
    :cond_2
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x3

    .line 841
    iget-object v3, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    .line 842
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v2

    add-int/2addr v0, v2

    .line 844
    :cond_3
    :goto_1
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v2}, Lcom/google/protobuf/Internal$ProtobufList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    const/4 v2, 0x4

    .line 845
    iget-object v3, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 846
    invoke-interface {v3, v1}, Lcom/google/protobuf/Internal$ProtobufList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/protobuf/MessageLite;

    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 848
    :cond_4
    iput v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->memoizedSerializedSize:I

    return v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 813
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceUfrag_:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 814
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIceUfrag()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeString(ILjava/lang/String;)V

    .line 816
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->icePwd_:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 817
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getIcePwd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeString(ILjava/lang/String;)V

    .line 819
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    .line 820
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->dtlsFingerprint_:Lcom/google/protobuf/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    :cond_2
    const/4 v0, 0x0

    .line 822
    :goto_0
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v1}, Lcom/google/protobuf/Internal$ProtobufList;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    const/4 v1, 0x4

    .line 823
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->iceCandidates_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v2, v0}, Lcom/google/protobuf/Internal$ProtobufList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/protobuf/MessageLite;

    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
