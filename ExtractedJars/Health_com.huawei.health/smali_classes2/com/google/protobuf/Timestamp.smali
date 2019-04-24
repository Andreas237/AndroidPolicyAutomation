.class public final Lcom/google/protobuf/Timestamp;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/TimestampOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Timestamp$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

.field public static final NANOS_FIELD_NUMBER:I = 0x2

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/Timestamp;>;"
        }
    .end annotation
.end field

.field public static final SECONDS_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private nanos_:I

.field private seconds_:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 647
    new-instance v0, Lcom/google/protobuf/Timestamp;

    invoke-direct {v0}, Lcom/google/protobuf/Timestamp;-><init>()V

    sput-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    .line 655
    new-instance v0, Lcom/google/protobuf/Timestamp$1;

    invoke-direct {v0}, Lcom/google/protobuf/Timestamp$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 78
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 179
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Timestamp;->memoizedIsInitialized:B

    .line 79
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    .line 81
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 92
    invoke-direct {p0}, Lcom/google/protobuf/Timestamp;-><init>()V

    .line 93
    if-nez p2, :cond_0

    .line 94
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 96
    :cond_0
    const/4 v2, 0x0

    .line 98
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 100
    const/4 v4, 0x0

    .line 101
    :goto_0
    if-nez v4, :cond_2

    .line 102
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 103
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 105
    :sswitch_0
    const/4 v4, 0x1

    .line 106
    goto :goto_2

    .line 108
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/Timestamp;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 110
    const/4 v4, 0x1

    goto :goto_2

    .line 116
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    .line 117
    goto :goto_2

    .line 121
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :cond_1
    :goto_2
    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 133
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->makeExtensionsImmutable()V

    .line 134
    goto :goto_3

    .line 126
    :catch_0
    move-exception v4

    .line 127
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 128
    :catch_1
    move-exception v4

    .line 129
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 130
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    :catchall_0
    move-exception v6

    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 133
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->makeExtensionsImmutable()V

    throw v6

    .line 135
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Timestamp$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Timestamp;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 179
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Timestamp;->memoizedIsInitialized:B

    .line 77
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Timestamp$1;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/google/protobuf/Timestamp;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$302(Lcom/google/protobuf/Timestamp;J)J
    .locals 0

    .line 69
    iput-wide p1, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    return-wide p1
.end method

.method static synthetic access$402(Lcom/google/protobuf/Timestamp;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    return p1
.end method

.method static synthetic access$500()Lcom/google/protobuf/Parser;
    .locals 1

    .line 69
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Timestamp;
    .locals 1

    .line 651
    sget-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 138
    sget-object v0, Lcom/google/protobuf/TimestampProto;->internal_static_google_protobuf_Timestamp_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Timestamp$Builder;
    .locals 1

    .line 326
    sget-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    invoke-virtual {v0}, Lcom/google/protobuf/Timestamp;->toBuilder()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Timestamp;)Lcom/google/protobuf/Timestamp$Builder;
    .locals 1

    .line 329
    sget-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    invoke-virtual {v0}, Lcom/google/protobuf/Timestamp;->toBuilder()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/Timestamp$Builder;->mergeFrom(Lcom/google/protobuf/Timestamp;)Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 300
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 301
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 300
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 307
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 308
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 307
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 268
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 274
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 313
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 314
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 313
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 320
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 321
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 320
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 289
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 288
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 295
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    .line 296
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    .line 295
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 257
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 263
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 278
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Timestamp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 284
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Timestamp;>;"
        }
    .end annotation

    .line 665
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 220
    if-ne p1, p0, :cond_0

    .line 221
    const/4 v0, 0x1

    return v0

    .line 223
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/Timestamp;

    if-nez v0, :cond_1

    .line 224
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 226
    :cond_1
    move-object v4, p1

    check-cast v4, Lcom/google/protobuf/Timestamp;

    .line 228
    const/4 v5, 0x1

    .line 229
    if-eqz v5, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    move-result-wide v0

    .line 230
    invoke-virtual {v4}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 231
    :goto_0
    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getNanos()I

    move-result v0

    .line 232
    invoke-virtual {v4}, Lcom/google/protobuf/Timestamp;->getNanos()I

    move-result v1

    if-ne v0, v1, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 233
    :goto_1
    if-eqz v5, :cond_4

    iget-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v4, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    .line 234
    :goto_2
    return v5
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getDefaultInstanceForType()Lcom/google/protobuf/Timestamp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getDefaultInstanceForType()Lcom/google/protobuf/Timestamp;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Timestamp;
    .locals 1

    .line 674
    sget-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    return-object v0
.end method

.method public getNanos()I
    .locals 1

    .line 176
    iget v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Timestamp;>;"
        }
    .end annotation

    .line 670
    sget-object v0, Lcom/google/protobuf/Timestamp;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSeconds()J
    .locals 2

    .line 160
    iget-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    return-wide v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 201
    iget v4, p0, Lcom/google/protobuf/Timestamp;->memoizedSize:I

    .line 202
    const/4 v0, -0x1

    if-eq v4, v0, :cond_0

    return v4

    .line 204
    :cond_0
    const/4 v4, 0x0

    .line 205
    iget-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 206
    iget-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    .line 207
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v4, v0, 0x0

    .line 209
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    if-eqz v0, :cond_2

    .line 210
    iget v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    .line 211
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v4, v0

    .line 213
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v4, v0

    .line 214
    iput v4, p0, Lcom/google/protobuf/Timestamp;->memoizedSize:I

    .line 215
    return v4
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 239
    iget v0, p0, Lcom/google/protobuf/Timestamp;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 240
    iget v0, p0, Lcom/google/protobuf/Timestamp;->memoizedHashCode:I

    return v0

    .line 242
    :cond_0
    const/16 v3, 0x29

    .line 243
    invoke-static {}, Lcom/google/protobuf/Timestamp;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v3, v0, 0x30b

    .line 244
    mul-int/lit8 v0, v3, 0x25

    add-int/lit8 v3, v0, 0x1

    .line 245
    mul-int/lit8 v0, v3, 0x35

    .line 246
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    move-result-wide v1

    .line 245
    invoke-static {v1, v2}, Lcom/google/protobuf/Internal;->hashLong(J)I

    move-result v1

    add-int v3, v0, v1

    .line 247
    mul-int/lit8 v0, v3, 0x25

    add-int/lit8 v3, v0, 0x2

    .line 248
    mul-int/lit8 v0, v3, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getNanos()I

    move-result v1

    add-int v3, v0, v1

    .line 249
    mul-int/lit8 v0, v3, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v3, v0, v1

    .line 250
    iput v3, p0, Lcom/google/protobuf/Timestamp;->memoizedHashCode:I

    .line 251
    return v3
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 143
    sget-object v0, Lcom/google/protobuf/TimestampProto;->internal_static_google_protobuf_Timestamp_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Timestamp;

    const-class v2, Lcom/google/protobuf/Timestamp$Builder;

    .line 144
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 143
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 181
    iget-byte v1, p0, Lcom/google/protobuf/Timestamp;->memoizedIsInitialized:B

    .line 182
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 183
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 185
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/Timestamp;->memoizedIsInitialized:B

    .line 186
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->newBuilderForType()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 69
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Timestamp;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->newBuilderForType()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/Timestamp$Builder;
    .locals 1

    .line 324
    invoke-static {}, Lcom/google/protobuf/Timestamp;->newBuilder()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Timestamp$Builder;
    .locals 2

    .line 339
    new-instance v1, Lcom/google/protobuf/Timestamp$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/Timestamp$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Timestamp$1;)V

    .line 340
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->toBuilder()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->toBuilder()Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/Timestamp$Builder;
    .locals 2

    .line 332
    sget-object v0, Lcom/google/protobuf/Timestamp;->DEFAULT_INSTANCE:Lcom/google/protobuf/Timestamp;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Timestamp$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Timestamp$Builder;-><init>(Lcom/google/protobuf/Timestamp$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Timestamp$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Timestamp$Builder;-><init>(Lcom/google/protobuf/Timestamp$1;)V

    .line 333
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Timestamp$Builder;->mergeFrom(Lcom/google/protobuf/Timestamp;)Lcom/google/protobuf/Timestamp$Builder;

    move-result-object v0

    .line 332
    :goto_0
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 191
    iget-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 192
    iget-wide v0, p0, Lcom/google/protobuf/Timestamp;->seconds_:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 194
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    if-eqz v0, :cond_1

    .line 195
    iget v0, p0, Lcom/google/protobuf/Timestamp;->nanos_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Timestamp;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 198
    return-void
.end method
