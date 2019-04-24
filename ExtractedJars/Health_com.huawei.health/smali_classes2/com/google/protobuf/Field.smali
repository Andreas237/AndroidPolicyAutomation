.class public final Lcom/google/protobuf/Field;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/FieldOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Field$Builder;,
        Lcom/google/protobuf/Field$Cardinality;,
        Lcom/google/protobuf/Field$Kind;
    }
.end annotation


# static fields
.field public static final CARDINALITY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

.field public static final DEFAULT_VALUE_FIELD_NUMBER:I = 0xb

.field public static final JSON_NAME_FIELD_NUMBER:I = 0xa

.field public static final KIND_FIELD_NUMBER:I = 0x1

.field public static final NAME_FIELD_NUMBER:I = 0x4

.field public static final NUMBER_FIELD_NUMBER:I = 0x3

.field public static final ONEOF_INDEX_FIELD_NUMBER:I = 0x7

.field public static final OPTIONS_FIELD_NUMBER:I = 0x9

.field public static final PACKED_FIELD_NUMBER:I = 0x8

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/Field;>;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x6

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private cardinality_:I

.field private volatile defaultValue_:Ljava/lang/Object;

.field private volatile jsonName_:Ljava/lang/Object;

.field private kind_:I

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private number_:I

.field private oneofIndex_:I

.field private options_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Option;>;"
        }
    .end annotation
.end field

.field private packed_:Z

.field private volatile typeUrl_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 2441
    new-instance v0, Lcom/google/protobuf/Field;

    invoke-direct {v0}, Lcom/google/protobuf/Field;-><init>()V

    sput-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    .line 2449
    new-instance v0, Lcom/google/protobuf/Field$1;

    invoke-direct {v0}, Lcom/google/protobuf/Field$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 1026
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 33
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Lcom/google/protobuf/Field;-><init>()V

    .line 45
    if-nez p2, :cond_0

    .line 46
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 48
    :cond_0
    const/4 v2, 0x0

    .line 50
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 52
    const/4 v4, 0x0

    .line 53
    :goto_0
    if-nez v4, :cond_3

    .line 54
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 55
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 57
    :sswitch_0
    const/4 v4, 0x1

    .line 58
    goto/16 :goto_2

    .line 60
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/Field;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 62
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 67
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v6

    .line 69
    iput v6, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 70
    goto/16 :goto_2

    .line 73
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v6

    .line 75
    iput v6, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 76
    goto/16 :goto_2

    .line 80
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 81
    goto/16 :goto_2

    .line 84
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 86
    iput-object v6, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 87
    goto :goto_2

    .line 90
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 92
    iput-object v6, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 93
    goto :goto_2

    .line 97
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 98
    goto :goto_2

    .line 102
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 103
    goto :goto_2

    .line 106
    :sswitch_8
    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-eq v0, v1, :cond_1

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 108
    or-int/lit16 v0, v2, 0x80

    move v2, v0

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 111
    invoke-static {}, Lcom/google/protobuf/Option;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    .line 110
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    goto :goto_2

    .line 115
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 117
    iput-object v6, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 118
    goto :goto_2

    .line 121
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 123
    iput-object v6, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 127
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 134
    :cond_3
    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_4

    .line 135
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 137
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 138
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->makeExtensionsImmutable()V

    .line 139
    goto :goto_3

    .line 128
    :catch_0
    move-exception v4

    .line 129
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 130
    :catch_1
    move-exception v4

    .line 131
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 132
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :catchall_0
    move-exception v7

    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_5

    .line 135
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 137
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 138
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->makeExtensionsImmutable()V

    throw v7

    .line 140
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x32 -> :sswitch_5
        0x38 -> :sswitch_6
        0x40 -> :sswitch_7
        0x4a -> :sswitch_8
        0x52 -> :sswitch_9
        0x5a -> :sswitch_a
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Field$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Field;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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

    .line 1026
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 21
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Field$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/Field;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/google/protobuf/Field;)Ljava/util/List;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1002(Lcom/google/protobuf/Field;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$1102(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$1202(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$1302(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Field;->bitField0_:I

    return p1
.end method

.method static synthetic access$1400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 13
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/protobuf/Field;)I
    .locals 1

    .line 13
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    return v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Field;->kind_:I

    return p1
.end method

.method static synthetic access$400(Lcom/google/protobuf/Field;)I
    .locals 1

    .line 13
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    return v0
.end method

.method static synthetic access$402(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    return p1
.end method

.method static synthetic access$502(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Field;->number_:I

    return p1
.end method

.method static synthetic access$600(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$602(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$700(Lcom/google/protobuf/Field;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$702(Lcom/google/protobuf/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$802(Lcom/google/protobuf/Field;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    return p1
.end method

.method static synthetic access$902(Lcom/google/protobuf/Field;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/google/protobuf/Field;->packed_:Z

    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Field;
    .locals 1

    .line 2445
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 143
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Field_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Field$Builder;
    .locals 1

    .line 1257
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    invoke-virtual {v0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$Builder;
    .locals 1

    .line 1260
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    invoke-virtual {v0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/Field$Builder;->mergeFrom(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1231
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1232
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1231
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1238
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1239
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1238
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1199
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1205
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1244
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1245
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1244
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1251
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1252
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1251
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1219
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1220
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1219
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1226
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    .line 1227
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    .line 1226
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1188
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1194
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1209
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1215
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Field;>;"
        }
    .end annotation

    .line 2459
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1119
    if-ne p1, p0, :cond_0

    .line 1120
    const/4 v0, 0x1

    return v0

    .line 1122
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/Field;

    if-nez v0, :cond_1

    .line 1123
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1125
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/Field;

    .line 1127
    const/4 v3, 0x1

    .line 1128
    if-eqz v3, :cond_2

    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    iget v1, v2, Lcom/google/protobuf/Field;->kind_:I

    if-ne v0, v1, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 1129
    :goto_0
    if-eqz v3, :cond_3

    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    iget v1, v2, Lcom/google/protobuf/Field;->cardinality_:I

    if-ne v0, v1, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 1130
    :goto_1
    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNumber()I

    move-result v0

    .line 1131
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getNumber()I

    move-result v1

    if-ne v0, v1, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 1132
    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1133
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 1134
    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    move-result-object v0

    .line 1135
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    .line 1136
    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOneofIndex()I

    move-result v0

    .line 1137
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getOneofIndex()I

    move-result v1

    if-ne v0, v1, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    .line 1138
    :goto_5
    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getPacked()Z

    move-result v0

    .line 1139
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getPacked()Z

    move-result v1

    if-ne v0, v1, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    .line 1140
    :goto_6
    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    move-result-object v0

    .line 1141
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v3, 0x1

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    .line 1142
    :goto_7
    if-eqz v3, :cond_a

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    move-result-object v0

    .line 1143
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    .line 1144
    :goto_8
    if-eqz v3, :cond_b

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    move-result-object v0

    .line 1145
    invoke-virtual {v2}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v3, 0x1

    goto :goto_9

    :cond_b
    const/4 v3, 0x0

    .line 1146
    :goto_9
    if-eqz v3, :cond_c

    iget-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v3, 0x1

    goto :goto_a

    :cond_c
    const/4 v3, 0x0

    .line 1147
    :goto_a
    return v3
.end method

.method public getCardinality()Lcom/google/protobuf/Field$Cardinality;
    .locals 2

    .line 757
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    invoke-static {v0}, Lcom/google/protobuf/Field$Cardinality;->valueOf(I)Lcom/google/protobuf/Field$Cardinality;

    move-result-object v1

    .line 758
    if-nez v1, :cond_0

    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public getCardinalityValue()I
    .locals 1

    .line 747
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Field;
    .locals 1

    .line 2468
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultInstanceForType()Lcom/google/protobuf/Field;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultInstanceForType()Lcom/google/protobuf/Field;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultValue()Ljava/lang/String;
    .locals 4

    .line 994
    iget-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 995
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 996
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 998
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 1000
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 1001
    iput-object v3, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 1002
    return-object v3
.end method

.method public getDefaultValueBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 1014
    iget-object v1, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 1015
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1016
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 1017
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 1019
    iput-object v2, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    .line 1020
    return-object v2

    .line 1022
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getJsonName()Ljava/lang/String;
    .locals 4

    .line 952
    iget-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 953
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 954
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 956
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 958
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 959
    iput-object v3, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 960
    return-object v3
.end method

.method public getJsonNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 972
    iget-object v1, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 973
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 974
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 975
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 977
    iput-object v2, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    .line 978
    return-object v2

    .line 980
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getKind()Lcom/google/protobuf/Field$Kind;
    .locals 2

    .line 733
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    invoke-static {v0}, Lcom/google/protobuf/Field$Kind;->valueOf(I)Lcom/google/protobuf/Field$Kind;

    move-result-object v1

    .line 734
    if-nez v1, :cond_0

    sget-object v0, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public getKindValue()I
    .locals 1

    .line 723
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 784
    iget-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 785
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 786
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 788
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 790
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 791
    iput-object v3, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 792
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 804
    iget-object v1, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 805
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 806
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 807
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 809
    iput-object v2, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    .line 810
    return-object v2

    .line 812
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    .line 771
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    return v0
.end method

.method public getOneofIndex()I
    .locals 1

    .line 871
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    return v0
.end method

.method public getOptions(I)Lcom/google/protobuf/Option;
    .locals 1

    .line 928
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option;

    return-object v0
.end method

.method public getOptionsCount()I
    .locals 1

    .line 918
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

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

    .line 897
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getOptionsOrBuilder(I)Lcom/google/protobuf/OptionOrBuilder;
    .locals 1

    .line 939
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

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

    .line 908
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getPacked()Z
    .locals 1

    .line 884
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Field;>;"
        }
    .end annotation

    .line 2464
    sget-object v0, Lcom/google/protobuf/Field;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 1072
    iget v2, p0, Lcom/google/protobuf/Field;->memoizedSize:I

    .line 1073
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 1075
    :cond_0
    const/4 v2, 0x0

    .line 1076
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    invoke-virtual {v1}, Lcom/google/protobuf/Field$Kind;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 1077
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    .line 1078
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 1080
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    invoke-virtual {v1}, Lcom/google/protobuf/Field$Cardinality;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 1081
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    .line 1082
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 1084
    :cond_2
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    if-eqz v0, :cond_3

    .line 1085
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    .line 1086
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 1088
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1089
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1091
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1092
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1094
    :cond_5
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    if-eqz v0, :cond_6

    .line 1095
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    .line 1096
    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 1098
    :cond_6
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    if-eqz v0, :cond_7

    .line 1099
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    .line 1100
    const/16 v1, 0x8

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v0

    add-int/2addr v2, v0

    .line 1102
    :cond_7
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 1103
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    .line 1104
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1102
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1106
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 1107
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1109
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 1110
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    const/16 v1, 0xb

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 1112
    :cond_a
    iget-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 1113
    iput v2, p0, Lcom/google/protobuf/Field;->memoizedSize:I

    .line 1114
    return v2
.end method

.method public getTypeUrl()Ljava/lang/String;
    .locals 4

    .line 827
    iget-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 828
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 829
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 831
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 833
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 834
    iput-object v3, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 835
    return-object v3
.end method

.method public getTypeUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 848
    iget-object v1, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 849
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 850
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 851
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 853
    iput-object v2, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    .line 854
    return-object v2

    .line 856
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1152
    iget v0, p0, Lcom/google/protobuf/Field;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 1153
    iget v0, p0, Lcom/google/protobuf/Field;->memoizedHashCode:I

    return v0

    .line 1155
    :cond_0
    const/16 v2, 0x29

    .line 1156
    invoke-static {}, Lcom/google/protobuf/Field;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 1157
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 1158
    mul-int/lit8 v0, v2, 0x35

    iget v1, p0, Lcom/google/protobuf/Field;->kind_:I

    add-int v2, v0, v1

    .line 1159
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x2

    .line 1160
    mul-int/lit8 v0, v2, 0x35

    iget v1, p0, Lcom/google/protobuf/Field;->cardinality_:I

    add-int v2, v0, v1

    .line 1161
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x3

    .line 1162
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNumber()I

    move-result v1

    add-int v2, v0, v1

    .line 1163
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x4

    .line 1164
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1165
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x6

    .line 1166
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1167
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x7

    .line 1168
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOneofIndex()I

    move-result v1

    add-int v2, v0, v1

    .line 1169
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x8

    .line 1170
    mul-int/lit8 v0, v2, 0x35

    .line 1171
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getPacked()Z

    move-result v1

    .line 1170
    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    move-result v1

    add-int v2, v0, v1

    .line 1172
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 1173
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x9

    .line 1174
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1176
    :cond_1
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0xa

    .line 1177
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1178
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0xb

    .line 1179
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1180
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 1181
    iput v2, p0, Lcom/google/protobuf/Field;->memoizedHashCode:I

    .line 1182
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 148
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Field_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Field;

    const-class v2, Lcom/google/protobuf/Field$Builder;

    .line 149
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 148
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1028
    iget-byte v1, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 1029
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 1030
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 1032
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/Field;->memoizedIsInitialized:B

    .line 1033
    const/4 v0, 0x1

    return v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/Field$Builder;
    .locals 1

    .line 1255
    invoke-static {}, Lcom/google/protobuf/Field;->newBuilder()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Field$Builder;
    .locals 2

    .line 1270
    new-instance v1, Lcom/google/protobuf/Field$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/Field$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Field$1;)V

    .line 1271
    return-object v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->newBuilderForType()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Field;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->newBuilderForType()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/Field$Builder;
    .locals 2

    .line 1263
    sget-object v0, Lcom/google/protobuf/Field;->DEFAULT_INSTANCE:Lcom/google/protobuf/Field;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Field$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Field$Builder;-><init>(Lcom/google/protobuf/Field$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Field$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Field$Builder;-><init>(Lcom/google/protobuf/Field$1;)V

    .line 1264
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Field$Builder;->mergeFrom(Lcom/google/protobuf/Field;)Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    .line 1263
    :goto_0
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->toBuilder()Lcom/google/protobuf/Field$Builder;

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

    .line 1038
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    invoke-virtual {v1}, Lcom/google/protobuf/Field$Kind;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1039
    iget v0, p0, Lcom/google/protobuf/Field;->kind_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 1041
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    invoke-virtual {v1}, Lcom/google/protobuf/Field$Cardinality;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 1042
    iget v0, p0, Lcom/google/protobuf/Field;->cardinality_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 1044
    :cond_1
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    if-eqz v0, :cond_2

    .line 1045
    iget v0, p0, Lcom/google/protobuf/Field;->number_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 1047
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1048
    iget-object v0, p0, Lcom/google/protobuf/Field;->name_:Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 1050
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getTypeUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1051
    iget-object v0, p0, Lcom/google/protobuf/Field;->typeUrl_:Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 1053
    :cond_4
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    if-eqz v0, :cond_5

    .line 1054
    iget v0, p0, Lcom/google/protobuf/Field;->oneofIndex_:I

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 1056
    :cond_5
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    if-eqz v0, :cond_6

    .line 1057
    iget-boolean v0, p0, Lcom/google/protobuf/Field;->packed_:Z

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 1059
    :cond_6
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 1060
    iget-object v0, p0, Lcom/google/protobuf/Field;->options_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 1059
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1062
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getJsonNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1063
    iget-object v0, p0, Lcom/google/protobuf/Field;->jsonName_:Ljava/lang/Object;

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 1065
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/Field;->getDefaultValueBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 1066
    iget-object v0, p0, Lcom/google/protobuf/Field;->defaultValue_:Ljava/lang/Object;

    const/16 v1, 0xb

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 1068
    :cond_9
    iget-object v0, p0, Lcom/google/protobuf/Field;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 1069
    return-void
.end method
