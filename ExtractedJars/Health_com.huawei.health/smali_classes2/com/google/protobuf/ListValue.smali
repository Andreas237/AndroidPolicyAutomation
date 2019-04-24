.class public final Lcom/google/protobuf/ListValue;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ListValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/ListValue$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/ListValue;>;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private memoizedIsInitialized:B

.field private values_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Value;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 805
    new-instance v0, Lcom/google/protobuf/ListValue;

    invoke-direct {v0}, Lcom/google/protobuf/ListValue;-><init>()V

    sput-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    .line 813
    new-instance v0, Lcom/google/protobuf/ListValue$1;

    invoke-direct {v0}, Lcom/google/protobuf/ListValue$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 149
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/ListValue;->memoizedIsInitialized:B

    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

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
    invoke-direct {p0}, Lcom/google/protobuf/ListValue;-><init>()V

    .line 37
    if-nez p2, :cond_0

    .line 38
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 42
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    :goto_0
    if-nez v4, :cond_3

    .line 46
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 47
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 49
    :sswitch_0
    const/4 v4, 0x1

    .line 50
    goto :goto_2

    .line 52
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/ListValue;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 54
    const/4 v4, 0x1

    goto :goto_2

    .line 59
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    .line 61
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    .line 64
    invoke-static {}, Lcom/google/protobuf/Value;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    .line 63
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_2
    :goto_2
    goto :goto_0

    .line 75
    :cond_3
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 76
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    .line 78
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 79
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->makeExtensionsImmutable()V

    .line 80
    goto :goto_3

    .line 69
    :catch_0
    move-exception v4

    .line 70
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 71
    :catch_1
    move-exception v4

    .line 72
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 73
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 76
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    .line 78
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 79
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->makeExtensionsImmutable()V

    throw v6

    .line 81
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/ListValue$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/ListValue;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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

    .line 149
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/ListValue;->memoizedIsInitialized:B

    .line 22
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/ListValue$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/google/protobuf/ListValue;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/protobuf/ListValue;)Ljava/util/List;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/ListValue;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 14
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/ListValue;
    .locals 1

    .line 809
    sget-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 84
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_ListValue_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 286
    sget-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    invoke-virtual {v0}, Lcom/google/protobuf/ListValue;->toBuilder()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 289
    sget-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    invoke-virtual {v0}, Lcom/google/protobuf/ListValue;->toBuilder()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 260
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 261
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 260
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 267
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 268
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 267
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 228
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 234
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 273
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 274
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 273
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 280
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 281
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 280
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 248
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 249
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 248
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 255
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    .line 256
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    .line 255
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 217
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 223
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 238
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/ListValue;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 244
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/ListValue;>;"
        }
    .end annotation

    .line 823
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 183
    if-ne p1, p0, :cond_0

    .line 184
    const/4 v0, 0x1

    return v0

    .line 186
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/ListValue;

    if-nez v0, :cond_1

    .line 187
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 189
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/ListValue;

    .line 191
    const/4 v3, 0x1

    .line 192
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->getValuesList()Ljava/util/List;

    move-result-object v0

    .line 193
    invoke-virtual {v2}, Lcom/google/protobuf/ListValue;->getValuesList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 194
    :goto_0
    if-eqz v3, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 195
    :goto_1
    return v3
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/ListValue;
    .locals 1

    .line 832
    sget-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->getDefaultInstanceForType()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->getDefaultInstanceForType()Lcom/google/protobuf/ListValue;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/ListValue;>;"
        }
    .end annotation

    .line 828
    sget-object v0, Lcom/google/protobuf/ListValue;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 168
    iget v2, p0, Lcom/google/protobuf/ListValue;->memoizedSize:I

    .line 169
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 171
    :cond_0
    const/4 v2, 0x0

    .line 172
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 173
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    .line 174
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 172
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 177
    iput v2, p0, Lcom/google/protobuf/ListValue;->memoizedSize:I

    .line 178
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getValues(I)Lcom/google/protobuf/Value;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    return-object v0
.end method

.method public getValuesCount()I
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getValuesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    return-object v0
.end method

.method public getValuesOrBuilder(I)Lcom/google/protobuf/ValueOrBuilder;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/ValueOrBuilder;

    return-object v0
.end method

.method public getValuesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/google/protobuf/ValueOrBuilder;>;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 200
    iget v0, p0, Lcom/google/protobuf/ListValue;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 201
    iget v0, p0, Lcom/google/protobuf/ListValue;->memoizedHashCode:I

    return v0

    .line 203
    :cond_0
    const/16 v2, 0x29

    .line 204
    invoke-static {}, Lcom/google/protobuf/ListValue;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 205
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->getValuesCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 206
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 207
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->getValuesList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 209
    :cond_1
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 210
    iput v2, p0, Lcom/google/protobuf/ListValue;->memoizedHashCode:I

    .line 211
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 89
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_ListValue_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/ListValue;

    const-class v2, Lcom/google/protobuf/ListValue$Builder;

    .line 90
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 89
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 151
    iget-byte v1, p0, Lcom/google/protobuf/ListValue;->memoizedIsInitialized:B

    .line 152
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 155
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/ListValue;->memoizedIsInitialized:B

    .line 156
    const/4 v0, 0x1

    return v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/ListValue$Builder;
    .locals 1

    .line 284
    invoke-static {}, Lcom/google/protobuf/ListValue;->newBuilder()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 299
    new-instance v1, Lcom/google/protobuf/ListValue$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/ListValue$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/ListValue$1;)V

    .line 300
    return-object v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->newBuilderForType()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ListValue;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->newBuilderForType()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/ListValue$Builder;
    .locals 2

    .line 292
    sget-object v0, Lcom/google/protobuf/ListValue;->DEFAULT_INSTANCE:Lcom/google/protobuf/ListValue;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/ListValue$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/ListValue$Builder;-><init>(Lcom/google/protobuf/ListValue$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/ListValue$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/ListValue$Builder;-><init>(Lcom/google/protobuf/ListValue$1;)V

    .line 293
    invoke-virtual {v0, p0}, Lcom/google/protobuf/ListValue$Builder;->mergeFrom(Lcom/google/protobuf/ListValue;)Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    .line 292
    :goto_0
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->toBuilder()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/ListValue;->toBuilder()Lcom/google/protobuf/ListValue$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 161
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->values_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 161
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/ListValue;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 165
    return-void
.end method
