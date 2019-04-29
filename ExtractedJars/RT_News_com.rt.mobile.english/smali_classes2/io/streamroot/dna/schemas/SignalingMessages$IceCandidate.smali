.class public final Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SignalingMessages.java"

# interfaces
.implements Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IceCandidate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;,
        Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;",
        ">;",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidateOrBuilder;"
    }
.end annotation


# static fields
.field public static final CODE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

.field public static final GLOBALADDRESS_FIELD_NUMBER:I = 0x2

.field public static final LOCALADDRESS_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private code_:I

.field private globalAddress_:Lcom/google/protobuf/ByteString;

.field private localAddress_:Lcom/google/protobuf/ByteString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 500
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-direct {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;-><init>()V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    .line 501
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->makeImmutable()V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 43
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    .line 44
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method static synthetic access$000()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1

    .line 37
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object v0
.end method

.method static synthetic access$100(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->setCodeValue(I)V

    return-void
.end method

.method static synthetic access$200(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->setCode(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)V

    return-void
.end method

.method static synthetic access$300(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->clearCode()V

    return-void
.end method

.method static synthetic access$400(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->setGlobalAddress(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$500(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->clearGlobalAddress()V

    return-void
.end method

.method static synthetic access$600(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->setLocalAddress(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method static synthetic access$700(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->clearLocalAddress()V

    return-void
.end method

.method private clearCode()V
    .locals 1

    const/4 v0, 0x0

    .line 149
    iput v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    return-void
.end method

.method private clearGlobalAddress()V
    .locals 1

    .line 175
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getGlobalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method private clearLocalAddress()V
    .locals 1

    .line 201
    invoke-static {}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getLocalAddress()Lcom/google/protobuf/ByteString;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method public static getDefaultInstance()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1

    .line 505
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object v0
.end method

.method public static newBuilder()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 300
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    return-object v0
.end method

.method public static newBuilder(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;
    .locals 1

    .line 303
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    invoke-virtual {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 277
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 283
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 241
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 248
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 295
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 265
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 272
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom([B)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 253
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 260
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;",
            ">;"
        }
    .end annotation

    .line 511
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-virtual {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->getParserForType()Lcom/google/protobuf/Parser;

    move-result-object v0

    return-object v0
.end method

.method private setCode(Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;)V
    .locals 0

    if-nez p1, :cond_0

    .line 139
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 142
    :cond_0
    invoke-virtual {p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->getNumber()I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    return-void
.end method

.method private setCodeValue(I)V
    .locals 0

    .line 132
    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    return-void
.end method

.method private setGlobalAddress(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 165
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 168
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method private setLocalAddress(Lcom/google/protobuf/ByteString;)V
    .locals 0

    if-nez p1, :cond_0

    .line 191
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1

    .line 194
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    return-void
.end method


# virtual methods
.method protected final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 408
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    .line 493
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 484
    :pswitch_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p1, :cond_1

    const-class p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    monitor-enter p1

    .line 485
    :try_start_0
    sget-object p2, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->PARSER:Lcom/google/protobuf/Parser;

    if-nez p2, :cond_0

    .line 486
    new-instance p2, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    sget-object p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-direct {p2, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    sput-object p2, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->PARSER:Lcom/google/protobuf/Parser;

    .line 488
    :cond_0
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 490
    :cond_1
    :goto_0
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->PARSER:Lcom/google/protobuf/Parser;

    return-object p1

    .line 435
    :pswitch_1
    check-cast p2, Lcom/google/protobuf/CodedInputStream;

    .line 437
    check-cast p3, Lcom/google/protobuf/ExtensionRegistryLite;

    :cond_2
    :goto_1
    if-nez v1, :cond_7

    .line 442
    :try_start_1
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result p1

    if-eqz p1, :cond_6

    const/16 p3, 0x8

    if-eq p1, p3, :cond_5

    const/16 p3, 0x12

    if-eq p1, p3, :cond_4

    const/16 p3, 0x1a

    if-eq p1, p3, :cond_3

    .line 448
    invoke-virtual {p2, p1}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 466
    :cond_3
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    goto :goto_1

    .line 461
    :cond_4
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    goto :goto_1

    .line 454
    :cond_5
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result p1

    .line 456
    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :cond_6
    :goto_2
    move v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 474
    :try_start_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 476
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 472
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 478
    :goto_3
    throw p1

    .line 481
    :cond_7
    :pswitch_2
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p1

    .line 422
    :pswitch_3
    check-cast p2, Lcom/google/protobuf/GeneratedMessageLite$Visitor;

    .line 423
    check-cast p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    .line 424
    iget p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    if-eqz p1, :cond_8

    move p1, v2

    goto :goto_4

    :cond_8
    move p1, v1

    :goto_4
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    iget v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    if-eqz v3, :cond_9

    move v3, v2

    goto :goto_5

    :cond_9
    move v3, v1

    :goto_5
    iget v4, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitInt(ZIZI)I

    move-result p1

    iput p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    .line 425
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq p1, v0, :cond_a

    move p1, v2

    goto :goto_6

    :cond_a
    move p1, v1

    :goto_6
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    sget-object v4, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq v3, v4, :cond_b

    move v3, v2

    goto :goto_7

    :cond_b
    move v3, v1

    :goto_7
    iget-object v4, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    .line 427
    iget-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq p1, v0, :cond_c

    move p1, v2

    goto :goto_8

    :cond_c
    move p1, v1

    :goto_8
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    iget-object v3, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    sget-object v4, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    if-eq v3, v4, :cond_d

    move v1, v2

    :cond_d
    iget-object p3, p3, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    invoke-interface {p2, p1, v0, v1, p3}, Lcom/google/protobuf/GeneratedMessageLite$Visitor;->visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    .line 429
    sget-object p1, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;->INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;

    return-object p0

    .line 419
    :pswitch_4
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;

    invoke-direct {p1, v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$Builder;-><init>(Lio/streamroot/dna/schemas/SignalingMessages$1;)V

    return-object p1

    :pswitch_5
    return-object v0

    .line 413
    :pswitch_6
    sget-object p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->DEFAULT_INSTANCE:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    return-object p1

    .line 410
    :pswitch_7
    new-instance p1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;

    invoke-direct {p1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;-><init>()V

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

.method public getCode()Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 1

    .line 125
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    invoke-static {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    move-result-object v0

    if-nez v0, :cond_0

    .line 126
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    :cond_0
    return-object v0
.end method

.method public getCodeValue()I
    .locals 1

    .line 119
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    return v0
.end method

.method public getGlobalAddress()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 158
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getLocalAddress()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 184
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 218
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 222
    iget v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    sget-object v2, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    invoke-virtual {v2}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->getNumber()I

    move-result v2

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    .line 223
    iget v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    .line 224
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 226
    :cond_1
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x2

    .line 227
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    .line 228
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 230
    :cond_2
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x3

    .line 231
    iget-object v2, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    .line 232
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 234
    :cond_3
    iput v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->memoizedSerializedSize:I

    return v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    invoke-virtual {v1}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 207
    iget v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->code_:I

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 209
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 210
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->globalAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 212
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    .line 213
    iget-object v1, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;->localAddress_:Lcom/google/protobuf/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    :cond_2
    return-void
.end method
