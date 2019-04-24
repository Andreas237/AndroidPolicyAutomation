.class public final Lcom/google/protobuf/Struct;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/StructOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Struct$Builder;,
        Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

.field public static final FIELDS_FIELD_NUMBER:I = 0x1

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/Struct;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private fields_:Lcom/google/protobuf/MapField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/MapField<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 696
    new-instance v0, Lcom/google/protobuf/Struct;

    invoke-direct {v0}, Lcom/google/protobuf/Struct;-><init>()V

    sput-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    .line 704
    new-instance v0, Lcom/google/protobuf/Struct$1;

    invoke-direct {v0}, Lcom/google/protobuf/Struct$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 202
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 29
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Lcom/google/protobuf/Struct;-><init>()V

    .line 41
    if-nez p2, :cond_0

    .line 42
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 44
    :cond_0
    const/4 v3, 0x0

    .line 46
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    :goto_0
    if-nez v5, :cond_3

    .line 50
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v6

    .line 51
    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    .line 53
    :sswitch_0
    const/4 v5, 0x1

    .line 54
    goto :goto_2

    .line 56
    :goto_1
    invoke-virtual {p0, p1, v4, p2, v6}, Lcom/google/protobuf/Struct;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 58
    const/4 v5, 0x1

    goto :goto_2

    .line 63
    :sswitch_1
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 64
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    invoke-static {v0}, Lcom/google/protobuf/MapField;->newMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    .line 66
    or-int/lit8 v3, v3, 0x1

    .line 69
    :cond_1
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    .line 70
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry;->getParserForType()Lcom/google/protobuf/Parser;

    move-result-object v0

    .line 69
    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/protobuf/MapEntry;

    .line 71
    iget-object v0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    .line 72
    invoke-virtual {v7}, Lcom/google/protobuf/MapEntry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7}, Lcom/google/protobuf/MapEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 71
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 76
    :cond_2
    :goto_2
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v4}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->makeExtensionsImmutable()V

    .line 85
    goto :goto_3

    .line 77
    :catch_0
    move-exception v5

    .line 78
    :try_start_1
    invoke-virtual {v5, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 79
    :catch_1
    move-exception v5

    .line 80
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v5}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 81
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :catchall_0
    move-exception v8

    invoke-virtual {v4}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->makeExtensionsImmutable()V

    throw v8

    .line 86
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Struct$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Struct;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 202
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 27
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Struct$1;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/google/protobuf/Struct;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/MapField;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    return-object v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/Struct;Lcom/google/protobuf/MapField;)Lcom/google/protobuf/MapField;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    return-object p1
.end method

.method static synthetic access$400(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/MapField;
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500()Lcom/google/protobuf/Parser;
    .locals 1

    .line 19
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Struct;
    .locals 1

    .line 700
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 89
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Struct_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private internalGetFields()Lcom/google/protobuf/MapField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapField<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    if-nez v0, :cond_0

    .line 127
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    invoke-static {v0}, Lcom/google/protobuf/MapField;->emptyMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Struct;->fields_:Lcom/google/protobuf/MapField;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 348
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    invoke-virtual {v0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 351
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    invoke-virtual {v0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 322
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 323
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 322
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 329
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 330
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 329
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 290
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 296
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 335
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 336
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 335
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 342
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 343
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 342
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 310
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 311
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 310
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 317
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    .line 318
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    .line 317
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 279
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 285
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 300
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Struct;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 306
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Struct;>;"
        }
    .end annotation

    .line 714
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public containsFields(Ljava/lang/String;)Z
    .locals 1

    .line 146
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 147
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 245
    if-ne p1, p0, :cond_0

    .line 246
    const/4 v0, 0x1

    return v0

    .line 248
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/Struct;

    if-nez v0, :cond_1

    .line 249
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 251
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/Struct;

    .line 253
    const/4 v3, 0x1

    .line 254
    if-eqz v3, :cond_2

    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    .line 255
    invoke-direct {v2}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v1

    .line 254
    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapField;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 256
    :goto_0
    if-eqz v3, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 257
    :goto_1
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getDefaultInstanceForType()Lcom/google/protobuf/Struct;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Struct;
    .locals 1

    .line 723
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    return-object v0
.end method

.method public getFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 154
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->getFieldsMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getFieldsCount()I
    .locals 1

    .line 134
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getFieldsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/google/protobuf/Value;>;"
        }
    .end annotation

    .line 165
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getFieldsOrDefault(Ljava/lang/String;Lcom/google/protobuf/Value;)Lcom/google/protobuf/Value;
    .locals 2

    .line 178
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 179
    .line 180
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    .line 181
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public getFieldsOrThrow(Ljava/lang/String;)Lcom/google/protobuf/Value;
    .locals 2

    .line 193
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 194
    .line 195
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    .line 196
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 197
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 199
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Value;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Struct;>;"
        }
    .end annotation

    .line 719
    sget-object v0, Lcom/google/protobuf/Struct;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 224
    iget v2, p0, Lcom/google/protobuf/Struct;->memoizedSize:I

    .line 225
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 227
    :cond_0
    const/4 v2, 0x0

    .line 229
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 231
    sget-object v0, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 232
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 233
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v5

    .line 235
    .line 236
    const/4 v0, 0x1

    invoke-static {v0, v5}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 237
    goto :goto_0

    .line 238
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 239
    iput v2, p0, Lcom/google/protobuf/Struct;->memoizedSize:I

    .line 240
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 262
    iget v0, p0, Lcom/google/protobuf/Struct;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 263
    iget v0, p0, Lcom/google/protobuf/Struct;->memoizedHashCode:I

    return v0

    .line 265
    :cond_0
    const/16 v2, 0x29

    .line 266
    invoke-static {}, Lcom/google/protobuf/Struct;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 267
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 268
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 269
    mul-int/lit8 v0, v2, 0x35

    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/MapField;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 271
    :cond_1
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 272
    iput v2, p0, Lcom/google/protobuf/Struct;->memoizedHashCode:I

    .line 273
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 105
    sget-object v0, Lcom/google/protobuf/StructProto;->internal_static_google_protobuf_Struct_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Struct;

    const-class v2, Lcom/google/protobuf/Struct$Builder;

    .line 106
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 105
    return-object v0
.end method

.method protected internalGetMapField(I)Lcom/google/protobuf/MapField;
    .locals 3

    .line 95
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 97
    :sswitch_0
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    return-object v0

    .line 99
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid map field number: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public final isInitialized()Z
    .locals 2

    .line 204
    iget-byte v1, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 205
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 206
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 208
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/Struct;->memoizedIsInitialized:B

    .line 209
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->newBuilderForType()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Struct;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->newBuilderForType()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/Struct$Builder;
    .locals 1

    .line 346
    invoke-static {}, Lcom/google/protobuf/Struct;->newBuilder()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Struct$Builder;
    .locals 2

    .line 361
    new-instance v1, Lcom/google/protobuf/Struct$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/Struct$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Struct$1;)V

    .line 362
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/Struct;->toBuilder()Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/Struct$Builder;
    .locals 2

    .line 354
    sget-object v0, Lcom/google/protobuf/Struct;->DEFAULT_INSTANCE:Lcom/google/protobuf/Struct;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Struct$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Struct$Builder;-><init>(Lcom/google/protobuf/Struct$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Struct$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Struct$Builder;-><init>(Lcom/google/protobuf/Struct$1;)V

    .line 355
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Struct$Builder;->mergeFrom(Lcom/google/protobuf/Struct;)Lcom/google/protobuf/Struct$Builder;

    move-result-object v0

    .line 354
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

    .line 214
    .line 217
    invoke-direct {p0}, Lcom/google/protobuf/Struct;->internalGetFields()Lcom/google/protobuf/MapField;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Struct$FieldsDefaultEntryHolder;->defaultEntry:Lcom/google/protobuf/MapEntry;

    .line 215
    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->serializeStringMapTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField;Lcom/google/protobuf/MapEntry;I)V

    .line 220
    iget-object v0, p0, Lcom/google/protobuf/Struct;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 221
    return-void
.end method
