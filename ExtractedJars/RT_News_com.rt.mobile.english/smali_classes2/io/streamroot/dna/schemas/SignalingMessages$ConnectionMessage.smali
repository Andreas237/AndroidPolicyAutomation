.class public final Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConnectionMessage"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;,
        Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessageOrBuilder;"
    }
.end annotation


# static fields
.field public static final ACCEPTED_FIELD_NUMBER:I = 0x5

.field public static final CONNECTIONID_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;",
            ">;"
        }
    .end annotation
.end field

.field public static final SDP_FIELD_NUMBER:I = 0x4

.field public static final SENDERID_FIELD_NUMBER:I = 0x2

.field public static final TYPE_FIELD_NUMBER:I = 0x1


# instance fields
.field private accepted_:Z

.field private connectionId_:Ljava/lang/String;

.field private sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

.field private senderId_:Ljava/lang/String;

.field private type_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 2027
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-direct {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;-><init>()V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    .line 2028
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->makeImmutable()V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1315
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    const-string v0, ""

    .line 1316
    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    const-string v0, ""

    .line 1317
    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$2800()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1

    .line 1310
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object v0
.end method

.method static synthetic access$2900(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;I)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setTypeValue(I)V

    return-void
.end method

.method static synthetic access$3000(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setType(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)V

    return-void
.end method

.method static synthetic access$3100(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->clearType()V

    return-void
.end method

.method static synthetic access$3200(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Ljava/lang/String;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setSenderId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3300(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->clearSenderId()V

    return-void
.end method

.method static synthetic access$3400(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setSenderIdBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$3500(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Ljava/lang/String;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setConnectionId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3600(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->clearConnectionId()V

    return-void
.end method

.method static synthetic access$3700(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setConnectionIdBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$3800(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-void
.end method

.method static synthetic access$3900(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;)V

    return-void
.end method

.method static synthetic access$4000(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->mergeSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V

    return-void
.end method

.method static synthetic access$4100(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->clearSdp()V

    return-void
.end method

.method static synthetic access$4200(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;Z)V
    .locals 0

    .line 1310
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->setAccepted(Z)V

    return-void
.end method

.method static synthetic access$4300(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)V
    .locals 0

    .line 1310
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->clearAccepted()V

    return-void
.end method

.method private clearAccepted()V
    .locals 1

    const/4 v0, 0x0

    .line 1589
    iput-boolean v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    return-void
.end method

.method private clearConnectionId()V
    .locals 1

    .line 1502
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    return-void
.end method

.method private clearSdp()V
    .locals 1

    const/4 v0, 0x0

    .line 1565
    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-void
.end method

.method private clearSenderId()V
    .locals 1

    .line 1456
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    return-void
.end method

.method private clearType()V
    .locals 1

    const/4 v0, 0x0

    .line 1422
    iput v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    return-void
.end method

.method public static getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1

    .line 2032
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object v0
.end method

.method private mergeSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 2

    .line 1553
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1554
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1555
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1556
    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->newBuilder(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->buildPartial()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    goto :goto_0

    .line 1558
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    :goto_0
    return-void
.end method

.method public static newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1702
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    return-object v0
.end method

.method public static newBuilder(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;
    .locals 1

    .line 1705
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    invoke-virtual {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1679
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1685
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1643
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1650
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1690
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1697
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1667
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1674
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom([B)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1655
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1662
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;",
            ">;"
        }
    .end annotation

    .line 2038
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getParserForType()Lcom/google/protobuf/Parser;

    move-result-object v0

    return-object v0
.end method

.method private setAccepted(Z)V
    .locals 0

    .line 1582
    iput-boolean p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    return-void
.end method

.method private setConnectionId(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1492
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1495
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    return-void
.end method

.method private setConnectionIdBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1510
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1512
    :cond_0
    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 1514
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    return-void
.end method

.method private setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;)V
    .locals 0

    .line 1546
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-void
.end method

.method private setSdp(Lio/streamroot/dna/schemas/SignalingMessages$Sdp;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1536
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1538
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    return-void
.end method

.method private setSenderId(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1446
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1449
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    return-void
.end method

.method private setSenderIdBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1464
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1466
    :cond_0
    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 1468
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    return-void
.end method

.method private setType(Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;)V
    .locals 0

    if-nez p1, :cond_0

    .line 1412
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 1415
    :cond_0
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->getNumber()I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    return-void
.end method

.method private setTypeValue(I)V
    .locals 0

    .line 1405
    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    return-void
.end method


# virtual methods
.method protected final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1912
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    .line 2020
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 2011
    :pswitch_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p1, :cond_1

    const-class p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    monitor-enter p1

    .line 2012
    :try_start_0
    sget-object p2, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p2, :cond_0

    .line 2013
    new-instance p2, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    sget-object p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-direct {p2, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    sput-object p2, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->PARSER:Lcom/google/protobuf/Parser;

    .line 2015
    :cond_0
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 2017
    :cond_1
    :goto_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->PARSER:Lcom/google/protobuf/Parser;

    return-object p1

    .line 1942
    :pswitch_1
    check-cast p2, Lcom/google/protobuf/CodedInputStream;

    .line 1944
    check-cast p3, Lcom/google/protobuf/ExtensionRegistryLite;

    :cond_2
    :goto_1
    if-nez v1, :cond_a

    .line 1949
    :try_start_1
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result p1

    if-eqz p1, :cond_9

    const/16 v3, 0x8

    if-eq p1, v3, :cond_8

    const/16 v3, 0x12

    if-eq p1, v3, :cond_7

    const/16 v3, 0x1a

    if-eq p1, v3, :cond_6

    const/16 v3, 0x22

    if-eq p1, v3, :cond_4

    const/16 v3, 0x28

    if-eq p1, v3, :cond_3

    .line 1955
    invoke-virtual {p2, p1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_3

    .line 1993
    :cond_3
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result p1

    iput-boolean p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    goto :goto_1

    .line 1980
    :cond_4
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz p1, :cond_5

    .line 1981
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;

    goto :goto_2

    :cond_5
    move-object p1, v0

    .line 1983
    :goto_2
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->parser()Lcom/google/protobuf/Parser;

    move-result-object v3

    invoke-virtual {p2, v3, p3}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iput-object v3, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz p1, :cond_2

    .line 1985
    iget-object v3, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-virtual {p1, v3}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 1986
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp$Builder;->buildPartial()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    goto :goto_1

    .line 1973
    :cond_6
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object p1

    .line 1975
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    goto :goto_1

    .line 1967
    :cond_7
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object p1

    .line 1969
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    goto :goto_1

    .line 1961
    :cond_8
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result p1

    .line 1963
    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :cond_9
    :goto_3
    move v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    .line 2001
    :try_start_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 2003
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 1999
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2005
    :goto_4
    throw p1

    .line 2008
    :cond_a
    :pswitch_2
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p1

    .line 1926
    :pswitch_3
    check-cast p2, Lcom/google/protobuf/GeneratedMessageLite$Visitor;

    .line 1927
    check-cast p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    .line 1928
    iget p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    if-eqz p1, :cond_b

    move p1, v2

    goto :goto_5

    :cond_b
    move p1, v1

    :goto_5
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    iget v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    if-eqz v3, :cond_c

    move v1, v2

    :cond_c
    iget v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    invoke-interface {p2, p1, v0, v1, v3}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitInt(ZIZI)I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    .line 1929
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    iget-object v1, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    .line 1930
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    .line 1929
    invoke-interface {p2, p1, v0, v1, v3}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    .line 1931
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    iget-object v1, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    .line 1932
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    iget-object v2, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    .line 1931
    invoke-interface {p2, p1, v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    .line 1933
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iget-object v0, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    invoke-interface {p2, p1, v0}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    .line 1934
    iget-boolean p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    iget-boolean v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    iget-boolean v1, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    iget-boolean p3, p3, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    invoke-interface {p2, p1, v0, v1, p3}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitBoolean(ZZZZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    .line 1936
    sget-object p1, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;->INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;

    return-object p0

    .line 1923
    :pswitch_4
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;

    invoke-direct {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Builder;-><init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V

    return-object p1

    :pswitch_5
    return-object v0

    .line 1917
    :pswitch_6
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    return-object p1

    .line 1914
    :pswitch_7
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;

    invoke-direct {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;-><init>()V

    return-object p1

    nop

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

.method public getAccepted()Z
    .locals 1

    .line 1575
    iget-boolean v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    return v0
.end method

.method public getConnectionId()Ljava/lang/String;
    .locals 1

    .line 1477
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    return-object v0
.end method

.method public getConnectionIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1484
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;
    .locals 1

    .line 1529
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-nez v0, :cond_0

    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$Sdp;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    :goto_0
    return-object v0
.end method

.method public getSenderId()Ljava/lang/String;
    .locals 1

    .line 1431
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    return-object v0
.end method

.method public getSenderIdBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1438
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 1612
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 1616
    iget v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    sget-object v2, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-virtual {v2}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->getNumber()I

    move-result v2

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    .line 1617
    iget v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    .line 1618
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 1620
    :cond_1
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x2

    .line 1622
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeStringSize(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1624
    :cond_2
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x3

    .line 1626
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeStringSize(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1628
    :cond_3
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 1630
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1632
    :cond_4
    iget-boolean v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 1633
    iget-boolean v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    .line 1634
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1636
    :cond_5
    iput v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->memoizedSerializedSize:I

    return v0
.end method

.method public getType()Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1

    .line 1398
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1399
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    :cond_0
    return-object v0
.end method

.method public getTypeValue()I
    .locals 1

    .line 1392
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    return v0
.end method

.method public hasSdp()Z
    .locals 1

    .line 1523
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1594
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-virtual {v1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 1595
    iget v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->type_:I

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 1597
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->senderId_:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 1598
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSenderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeString(ILjava/lang/String;)V

    .line 1600
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->connectionId_:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    .line 1601
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getConnectionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeString(ILjava/lang/String;)V

    .line 1603
    :cond_2
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->sdp_:Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    .line 1604
    invoke-virtual {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->getSdp()Lio/streamroot/dna/schemas/SignalingMessages$Sdp;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 1606
    :cond_3
    iget-boolean v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    .line 1607
    iget-boolean v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;->accepted_:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    :cond_4
    return-void
.end method
