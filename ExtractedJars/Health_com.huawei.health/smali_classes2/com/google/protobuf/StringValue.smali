.class public final Lcom/google/protobuf/StringValue;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/StringValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/StringValue$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/StringValue;>;"
        }
    .end annotation
.end field

.field public static final VALUE_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private volatile value_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 523
    new-instance v0, Lcom/google/protobuf/StringValue;

    invoke-direct {v0}, Lcom/google/protobuf/StringValue;-><init>()V

    sput-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    .line 535
    new-instance v0, Lcom/google/protobuf/StringValue$1;

    invoke-direct {v0}, Lcom/google/protobuf/StringValue$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 130
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/StringValue;->memoizedIsInitialized:B

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    .line 25
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Lcom/google/protobuf/StringValue;-><init>()V

    .line 37
    if-nez p2, :cond_0

    .line 38
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 42
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_0
    if-nez v3, :cond_2

    .line 46
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v4

    .line 47
    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    .line 49
    :sswitch_0
    const/4 v3, 0x1

    .line 50
    goto :goto_2

    .line 52
    :goto_1
    invoke-virtual {p0, p1, v2, p2, v4}, Lcom/google/protobuf/StringValue;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 54
    const/4 v3, 0x1

    goto :goto_2

    .line 59
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v5

    .line 61
    iput-object v5, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 65
    :cond_1
    :goto_2
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 73
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->makeExtensionsImmutable()V

    .line 74
    goto :goto_3

    .line 66
    :catch_0
    move-exception v3

    .line 67
    :try_start_1
    invoke-virtual {v3, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 68
    :catch_1
    move-exception v3

    .line 69
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v3}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 70
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :catchall_0
    move-exception v6

    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 73
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->makeExtensionsImmutable()V

    throw v6

    .line 75
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/StringValue$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/StringValue;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 130
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/StringValue;->memoizedIsInitialized:B

    .line 22
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/StringValue$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/google/protobuf/StringValue;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/protobuf/StringValue;)Ljava/lang/Object;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/StringValue;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/StringValue;
    .locals 1

    .line 527
    sget-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 78
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_StringValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/StringValue$Builder;
    .locals 1

    .line 264
    sget-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    invoke-virtual {v0}, Lcom/google/protobuf/StringValue;->toBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/StringValue;)Lcom/google/protobuf/StringValue$Builder;
    .locals 1

    .line 267
    sget-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    invoke-virtual {v0}, Lcom/google/protobuf/StringValue;->toBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/StringValue$Builder;->mergeFrom(Lcom/google/protobuf/StringValue;)Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static of(Ljava/lang/String;)Lcom/google/protobuf/StringValue;
    .locals 1

    .line 531
    invoke-static {}, Lcom/google/protobuf/StringValue;->newBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/StringValue$Builder;->setValue(Ljava/lang/String;)Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/StringValue$Builder;->build()Lcom/google/protobuf/StringValue;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 238
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 239
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 238
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 245
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 246
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 245
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 206
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 212
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 251
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 252
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 251
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 258
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 259
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 258
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 226
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 227
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 226
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 233
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 234
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    .line 233
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 195
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 201
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 216
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/StringValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 222
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/StringValue;>;"
        }
    .end annotation

    .line 545
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 163
    if-ne p1, p0, :cond_0

    .line 164
    const/4 v0, 0x1

    return v0

    .line 166
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/StringValue;

    if-nez v0, :cond_1

    .line 167
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 169
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/StringValue;

    .line 171
    const/4 v3, 0x1

    .line 172
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-virtual {v2}, Lcom/google/protobuf/StringValue;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 174
    :goto_0
    if-eqz v3, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 175
    :goto_1
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getDefaultInstanceForType()Lcom/google/protobuf/StringValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getDefaultInstanceForType()Lcom/google/protobuf/StringValue;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/StringValue;
    .locals 1

    .line 554
    sget-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/StringValue;>;"
        }
    .end annotation

    .line 550
    sget-object v0, Lcom/google/protobuf/StringValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 149
    iget v2, p0, Lcom/google/protobuf/StringValue;->memoizedSize:I

    .line 150
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 152
    :cond_0
    const/4 v2, 0x0

    .line 153
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 156
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 157
    iput v2, p0, Lcom/google/protobuf/StringValue;->memoizedSize:I

    .line 158
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 4

    .line 98
    iget-object v1, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    .line 99
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 100
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 102
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 104
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 105
    iput-object v3, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    .line 106
    return-object v3
.end method

.method public getValueBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 118
    iget-object v1, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    .line 119
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 120
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 121
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 123
    iput-object v2, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    .line 124
    return-object v2

    .line 126
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 180
    iget v0, p0, Lcom/google/protobuf/StringValue;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 181
    iget v0, p0, Lcom/google/protobuf/StringValue;->memoizedHashCode:I

    return v0

    .line 183
    :cond_0
    const/16 v2, 0x29

    .line 184
    invoke-static {}, Lcom/google/protobuf/StringValue;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 185
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 186
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 187
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 188
    iput v2, p0, Lcom/google/protobuf/StringValue;->memoizedHashCode:I

    .line 189
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 83
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_StringValue_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/StringValue;

    const-class v2, Lcom/google/protobuf/StringValue$Builder;

    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 83
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 132
    iget-byte v1, p0, Lcom/google/protobuf/StringValue;->memoizedIsInitialized:B

    .line 133
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 134
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 136
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/StringValue;->memoizedIsInitialized:B

    .line 137
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->newBuilderForType()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/StringValue;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->newBuilderForType()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/StringValue$Builder;
    .locals 1

    .line 262
    invoke-static {}, Lcom/google/protobuf/StringValue;->newBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/StringValue$Builder;
    .locals 2

    .line 277
    new-instance v1, Lcom/google/protobuf/StringValue$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/StringValue$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/StringValue$1;)V

    .line 278
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->toBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->toBuilder()Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/StringValue$Builder;
    .locals 2

    .line 270
    sget-object v0, Lcom/google/protobuf/StringValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/StringValue;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/StringValue$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/StringValue$Builder;-><init>(Lcom/google/protobuf/StringValue$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/StringValue$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/StringValue$Builder;-><init>(Lcom/google/protobuf/StringValue$1;)V

    .line 271
    invoke-virtual {v0, p0}, Lcom/google/protobuf/StringValue$Builder;->mergeFrom(Lcom/google/protobuf/StringValue;)Lcom/google/protobuf/StringValue$Builder;

    move-result-object v0

    .line 270
    :goto_0
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 142
    invoke-virtual {p0}, Lcom/google/protobuf/StringValue;->getValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->value_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/StringValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 146
    return-void
.end method
