.class public final Lcom/google/protobuf/Method;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MethodOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Method$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final OPTIONS_FIELD_NUMBER:I = 0x6

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/Method;>;"
        }
    .end annotation
.end field

.field public static final REQUEST_STREAMING_FIELD_NUMBER:I = 0x3

.field public static final REQUEST_TYPE_URL_FIELD_NUMBER:I = 0x2

.field public static final RESPONSE_STREAMING_FIELD_NUMBER:I = 0x5

.field public static final RESPONSE_TYPE_URL_FIELD_NUMBER:I = 0x4

.field public static final SYNTAX_FIELD_NUMBER:I = 0x7

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private options_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Option;>;"
        }
    .end annotation
.end field

.field private requestStreaming_:Z

.field private volatile requestTypeUrl_:Ljava/lang/Object;

.field private responseStreaming_:Z

.field private volatile responseTypeUrl_:Ljava/lang/Object;

.field private syntax_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1532
    new-instance v0, Lcom/google/protobuf/Method;

    invoke-direct {v0}, Lcom/google/protobuf/Method;-><init>()V

    sput-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    .line 1540
    new-instance v0, Lcom/google/protobuf/Method$1;

    invoke-direct {v0}, Lcom/google/protobuf/Method$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 365
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Method;->memoizedIsInitialized:B

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    .line 30
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Lcom/google/protobuf/Method;-><init>()V

    .line 42
    if-nez p2, :cond_0

    .line 43
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 45
    :cond_0
    const/4 v2, 0x0

    .line 47
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 49
    const/4 v4, 0x0

    .line 50
    :goto_0
    if-nez v4, :cond_3

    .line 51
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 52
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 54
    :sswitch_0
    const/4 v4, 0x1

    .line 55
    goto/16 :goto_2

    .line 57
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/Method;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 59
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 64
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 66
    iput-object v6, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 67
    goto :goto_2

    .line 70
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 72
    iput-object v6, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 73
    goto :goto_2

    .line 77
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    .line 78
    goto :goto_2

    .line 81
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 83
    iput-object v6, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 84
    goto :goto_2

    .line 88
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    .line 89
    goto :goto_2

    .line 92
    :sswitch_6
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 94
    or-int/lit8 v0, v2, 0x20

    move v2, v0

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 97
    invoke-static {}, Lcom/google/protobuf/Option;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    .line 96
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    goto :goto_2

    .line 101
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v6

    .line 103
    iput v6, p0, Lcom/google/protobuf/Method;->syntax_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 107
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 114
    :cond_3
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    .line 115
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 117
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 118
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->makeExtensionsImmutable()V

    .line 119
    goto :goto_3

    .line 108
    :catch_0
    move-exception v4

    .line 109
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 110
    :catch_1
    move-exception v4

    .line 111
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 112
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    :catchall_0
    move-exception v7

    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 115
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 117
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 118
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->makeExtensionsImmutable()V

    throw v7

    .line 120
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x38 -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Method$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Method;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 365
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Method;->memoizedIsInitialized:B

    .line 21
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Method$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/Method;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$1002(Lcom/google/protobuf/Method;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Method;->bitField0_:I

    return p1
.end method

.method static synthetic access$1100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 13
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/protobuf/Method;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/Method;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$400(Lcom/google/protobuf/Method;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$402(Lcom/google/protobuf/Method;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$502(Lcom/google/protobuf/Method;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    return p1
.end method

.method static synthetic access$600(Lcom/google/protobuf/Method;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$602(Lcom/google/protobuf/Method;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$702(Lcom/google/protobuf/Method;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    return p1
.end method

.method static synthetic access$800(Lcom/google/protobuf/Method;)Ljava/util/List;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$802(Lcom/google/protobuf/Method;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$900(Lcom/google/protobuf/Method;)I
    .locals 1

    .line 13
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    return v0
.end method

.method static synthetic access$902(Lcom/google/protobuf/Method;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Method;->syntax_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Method;
    .locals 1

    .line 1536
    sget-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 123
    sget-object v0, Lcom/google/protobuf/ApiProto;->internal_static_google_protobuf_Method_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Method$Builder;
    .locals 1

    .line 566
    sget-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    invoke-virtual {v0}, Lcom/google/protobuf/Method;->toBuilder()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Method;)Lcom/google/protobuf/Method$Builder;
    .locals 1

    .line 569
    sget-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    invoke-virtual {v0}, Lcom/google/protobuf/Method;->toBuilder()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/Method$Builder;->mergeFrom(Lcom/google/protobuf/Method;)Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 540
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 541
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 540
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 547
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 548
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 547
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 508
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 514
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 553
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 554
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 553
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 560
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 561
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 560
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 528
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 529
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 528
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 535
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    .line 536
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    .line 535
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 497
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 503
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 518
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 524
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Method;>;"
        }
    .end annotation

    .line 1550
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 438
    if-ne p1, p0, :cond_0

    .line 439
    const/4 v0, 0x1

    return v0

    .line 441
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/Method;

    if-nez v0, :cond_1

    .line 442
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 444
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/Method;

    .line 446
    const/4 v3, 0x1

    .line 447
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getName()Ljava/lang/String;

    move-result-object v0

    .line 448
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 449
    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestTypeUrl()Ljava/lang/String;

    move-result-object v0

    .line 450
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getRequestTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 451
    :goto_1
    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestStreaming()Z

    move-result v0

    .line 452
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getRequestStreaming()Z

    move-result v1

    if-ne v0, v1, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 453
    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseTypeUrl()Ljava/lang/String;

    move-result-object v0

    .line 454
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getResponseTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 455
    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseStreaming()Z

    move-result v0

    .line 456
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getResponseStreaming()Z

    move-result v1

    if-ne v0, v1, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    .line 457
    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getOptionsList()Ljava/util/List;

    move-result-object v0

    .line 458
    invoke-virtual {v2}, Lcom/google/protobuf/Method;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    .line 459
    :goto_5
    if-eqz v3, :cond_8

    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    iget v1, v2, Lcom/google/protobuf/Method;->syntax_:I

    if-ne v0, v1, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    .line 460
    :goto_6
    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v3, 0x1

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    .line 461
    :goto_7
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getDefaultInstanceForType()Lcom/google/protobuf/Method;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getDefaultInstanceForType()Lcom/google/protobuf/Method;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Method;
    .locals 1

    .line 1559
    sget-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 144
    iget-object v1, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 145
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 146
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 148
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 150
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 151
    iput-object v3, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 152
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 164
    iget-object v1, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 165
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 166
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 167
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 169
    iput-object v2, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    .line 170
    return-object v2

    .line 172
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getOptions(I)Lcom/google/protobuf/Option;
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option;

    return-object v0
.end method

.method public getOptionsCount()I
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getOptionsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Option;>;"
        }
    .end annotation

    .line 296
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getOptionsOrBuilder(I)Lcom/google/protobuf/OptionOrBuilder;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/OptionOrBuilder;

    return-object v0
.end method

.method public getOptionsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/google/protobuf/OptionOrBuilder;>;"
        }
    .end annotation

    .line 307
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Method;>;"
        }
    .end annotation

    .line 1555
    sget-object v0, Lcom/google/protobuf/Method;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getRequestStreaming()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    return v0
.end method

.method public getRequestTypeUrl()Ljava/lang/String;
    .locals 4

    .line 186
    iget-object v1, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 187
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 188
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 190
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 192
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 193
    iput-object v3, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 194
    return-object v3
.end method

.method public getRequestTypeUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 206
    iget-object v1, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 207
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 208
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 209
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 211
    iput-object v2, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    .line 212
    return-object v2

    .line 214
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getResponseStreaming()Z
    .locals 1

    .line 283
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    return v0
.end method

.method public getResponseTypeUrl()Ljava/lang/String;
    .locals 4

    .line 241
    iget-object v1, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 242
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 243
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 245
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 247
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 248
    iput-object v3, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 249
    return-object v3
.end method

.method public getResponseTypeUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 261
    iget-object v1, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 262
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 263
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 264
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 266
    iput-object v2, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    .line 267
    return-object v2

    .line 269
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 402
    iget v2, p0, Lcom/google/protobuf/Method;->memoizedSize:I

    .line 403
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 405
    :cond_0
    const/4 v2, 0x0

    .line 406
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 407
    iget-object v0, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 409
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 410
    iget-object v0, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 412
    :cond_2
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    if-eqz v0, :cond_3

    .line 413
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    .line 414
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v0

    add-int/2addr v2, v0

    .line 416
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 417
    iget-object v0, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 419
    :cond_4
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    if-eqz v0, :cond_5

    .line 420
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    .line 421
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v0

    add-int/2addr v2, v0

    .line 423
    :cond_5
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 424
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    .line 425
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 423
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 427
    :cond_6
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    sget-object v1, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    invoke-virtual {v1}, Lcom/google/protobuf/Syntax;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_7

    .line 428
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    .line 429
    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 431
    :cond_7
    iget-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 432
    iput v2, p0, Lcom/google/protobuf/Method;->memoizedSize:I

    .line 433
    return v2
.end method

.method public getSyntax()Lcom/google/protobuf/Syntax;
    .locals 2

    .line 361
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    invoke-static {v0}, Lcom/google/protobuf/Syntax;->valueOf(I)Lcom/google/protobuf/Syntax;

    move-result-object v1

    .line 362
    if-nez v1, :cond_0

    sget-object v0, Lcom/google/protobuf/Syntax;->UNRECOGNIZED:Lcom/google/protobuf/Syntax;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public getSyntaxValue()I
    .locals 1

    .line 351
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 466
    iget v0, p0, Lcom/google/protobuf/Method;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 467
    iget v0, p0, Lcom/google/protobuf/Method;->memoizedHashCode:I

    return v0

    .line 469
    :cond_0
    const/16 v2, 0x29

    .line 470
    invoke-static {}, Lcom/google/protobuf/Method;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 471
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 472
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 473
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x2

    .line 474
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 475
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x3

    .line 476
    mul-int/lit8 v0, v2, 0x35

    .line 477
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestStreaming()Z

    move-result v1

    .line 476
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    move-result v1

    add-int v2, v0, v1

    .line 478
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x4

    .line 479
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 480
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x5

    .line 481
    mul-int/lit8 v0, v2, 0x35

    .line 482
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseStreaming()Z

    move-result v1

    .line 481
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    move-result v1

    add-int v2, v0, v1

    .line 483
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getOptionsCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 484
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x6

    .line 485
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 487
    :cond_1
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x7

    .line 488
    mul-int/lit8 v0, v2, 0x35

    iget v1, p0, Lcom/google/protobuf/Method;->syntax_:I

    add-int v2, v0, v1

    .line 489
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 490
    iput v2, p0, Lcom/google/protobuf/Method;->memoizedHashCode:I

    .line 491
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 128
    sget-object v0, Lcom/google/protobuf/ApiProto;->internal_static_google_protobuf_Method_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Method;

    const-class v2, Lcom/google/protobuf/Method$Builder;

    .line 129
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 128
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 367
    iget-byte v1, p0, Lcom/google/protobuf/Method;->memoizedIsInitialized:B

    .line 368
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 369
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 371
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/Method;->memoizedIsInitialized:B

    .line 372
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->newBuilderForType()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Method;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->newBuilderForType()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/Method$Builder;
    .locals 1

    .line 564
    invoke-static {}, Lcom/google/protobuf/Method;->newBuilder()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Method$Builder;
    .locals 2

    .line 579
    new-instance v1, Lcom/google/protobuf/Method$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/Method$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Method$1;)V

    .line 580
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->toBuilder()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->toBuilder()Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/Method$Builder;
    .locals 2

    .line 572
    sget-object v0, Lcom/google/protobuf/Method;->DEFAULT_INSTANCE:Lcom/google/protobuf/Method;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Method$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Method$Builder;-><init>(Lcom/google/protobuf/Method$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Method$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Method$Builder;-><init>(Lcom/google/protobuf/Method$1;)V

    .line 573
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Method$Builder;->mergeFrom(Lcom/google/protobuf/Method;)Lcom/google/protobuf/Method$Builder;

    move-result-object v0

    .line 572
    :goto_0
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 377
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/google/protobuf/Method;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 380
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getRequestTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 381
    iget-object v0, p0, Lcom/google/protobuf/Method;->requestTypeUrl_:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 383
    :cond_1
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    if-eqz v0, :cond_2

    .line 384
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->requestStreaming_:Z

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 386
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/Method;->getResponseTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 387
    iget-object v0, p0, Lcom/google/protobuf/Method;->responseTypeUrl_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 389
    :cond_3
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    if-eqz v0, :cond_4

    .line 390
    iget-boolean v0, p0, Lcom/google/protobuf/Method;->responseStreaming_:Z

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 392
    :cond_4
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 393
    iget-object v0, p0, Lcom/google/protobuf/Method;->options_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 392
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 395
    :cond_5
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    sget-object v1, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    invoke-virtual {v1}, Lcom/google/protobuf/Syntax;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 396
    iget v0, p0, Lcom/google/protobuf/Method;->syntax_:I

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 398
    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/Method;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 399
    return-void
.end method
