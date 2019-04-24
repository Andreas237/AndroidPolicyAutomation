.class public final Lcom/google/protobuf/Type;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/TypeOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Type$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

.field public static final FIELDS_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final ONEOFS_FIELD_NUMBER:I = 0x3

.field public static final OPTIONS_FIELD_NUMBER:I = 0x4

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/google/protobuf/Type;>;"
        }
    .end annotation
.end field

.field public static final SOURCE_CONTEXT_FIELD_NUMBER:I = 0x5

.field public static final SYNTAX_FIELD_NUMBER:I = 0x6

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private fields_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Field;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private oneofs_:Lcom/google/protobuf/LazyStringList;

.field private options_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Option;>;"
        }
    .end annotation
.end field

.field private sourceContext_:Lcom/google/protobuf/SourceContext;

.field private syntax_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1958
    new-instance v0, Lcom/google/protobuf/Type;

    invoke-direct {v0}, Lcom/google/protobuf/Type;-><init>()V

    sput-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    .line 1966
    new-instance v0, Lcom/google/protobuf/Type$1;

    invoke-direct {v0}, Lcom/google/protobuf/Type$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 401
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Type;->memoizedIsInitialized:B

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 25
    sget-object v0, Lcom/google/protobuf/LazyStringArrayList;->EMPTY:Lcom/google/protobuf/LazyStringList;

    iput-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    .line 28
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Lcom/google/protobuf/Type;-><init>()V

    .line 40
    if-nez p2, :cond_0

    .line 41
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 45
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-nez v4, :cond_6

    .line 49
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 50
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 52
    :sswitch_0
    const/4 v4, 0x1

    .line 53
    goto/16 :goto_2

    .line 55
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/google/protobuf/Type;->parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 57
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 62
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 64
    iput-object v6, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 65
    goto/16 :goto_2

    .line 68
    :sswitch_2
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 70
    or-int/lit8 v0, v2, 0x2

    move v2, v0

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 73
    invoke-static {}, Lcom/google/protobuf/Field;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    goto/16 :goto_2

    .line 77
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v6

    .line 78
    and-int/lit8 v0, v2, 0x4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    .line 79
    new-instance v0, Lcom/google/protobuf/LazyStringArrayList;

    invoke-direct {v0}, Lcom/google/protobuf/LazyStringArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    .line 80
    or-int/lit8 v0, v2, 0x4

    move v2, v0

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0, v6}, Lcom/google/protobuf/LazyStringList;->add(Ljava/lang/Object;)Z

    .line 83
    goto :goto_2

    .line 86
    :sswitch_4
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_3

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 88
    or-int/lit8 v0, v2, 0x8

    move v2, v0

    .line 90
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 91
    invoke-static {}, Lcom/google/protobuf/Option;->parser()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    .line 90
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    goto :goto_2

    .line 95
    :sswitch_5
    const/4 v6, 0x0

    .line 96
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    if-eqz v0, :cond_4

    .line 97
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    invoke-virtual {v0}, Lcom/google/protobuf/SourceContext;->toBuilder()Lcom/google/protobuf/SourceContext$Builder;

    move-result-object v6

    .line 99
    :cond_4
    invoke-static {}, Lcom/google/protobuf/SourceContext;->parser()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/SourceContext;

    iput-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    .line 100
    if-eqz v6, :cond_5

    .line 101
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    invoke-virtual {v6, v0}, Lcom/google/protobuf/SourceContext$Builder;->mergeFrom(Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext$Builder;

    .line 102
    invoke-virtual {v6}, Lcom/google/protobuf/SourceContext$Builder;->buildPartial()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    goto :goto_2

    .line 108
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v6

    .line 110
    iput v6, p0, Lcom/google/protobuf/Type;->syntax_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 114
    :cond_5
    :goto_2
    goto/16 :goto_0

    .line 121
    :cond_6
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 122
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 124
    :cond_7
    and-int/lit8 v0, v2, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    .line 125
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0}, Lcom/google/protobuf/LazyStringList;->getUnmodifiableView()Lcom/google/protobuf/LazyStringList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    .line 127
    :cond_8
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_9

    .line 128
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 130
    :cond_9
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 131
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->makeExtensionsImmutable()V

    .line 132
    goto :goto_3

    .line 115
    :catch_0
    move-exception v4

    .line 116
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 117
    :catch_1
    move-exception v4

    .line 118
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v4}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 119
    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    :catchall_0
    move-exception v7

    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_a

    .line 122
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 124
    :cond_a
    and-int/lit8 v0, v2, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_b

    .line 125
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0}, Lcom/google/protobuf/LazyStringList;->getUnmodifiableView()Lcom/google/protobuf/LazyStringList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    .line 127
    :cond_b
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_c

    .line 128
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 130
    :cond_c
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 131
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->makeExtensionsImmutable()V

    throw v7

    .line 133
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/Type$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/Type;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

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

    .line 401
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/google/protobuf/Type;->memoizedIsInitialized:B

    .line 21
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/Type$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/google/protobuf/Type;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method static synthetic access$1000()Lcom/google/protobuf/Parser;
    .locals 1

    .line 13
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/protobuf/Type;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$302(Lcom/google/protobuf/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$400(Lcom/google/protobuf/Type;)Ljava/util/List;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$402(Lcom/google/protobuf/Type;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$500(Lcom/google/protobuf/Type;)Lcom/google/protobuf/LazyStringList;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    return-object v0
.end method

.method static synthetic access$502(Lcom/google/protobuf/Type;Lcom/google/protobuf/LazyStringList;)Lcom/google/protobuf/LazyStringList;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    return-object p1
.end method

.method static synthetic access$600(Lcom/google/protobuf/Type;)Ljava/util/List;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$602(Lcom/google/protobuf/Type;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$702(Lcom/google/protobuf/Type;Lcom/google/protobuf/SourceContext;)Lcom/google/protobuf/SourceContext;
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    return-object p1
.end method

.method static synthetic access$800(Lcom/google/protobuf/Type;)I
    .locals 1

    .line 13
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    return v0
.end method

.method static synthetic access$802(Lcom/google/protobuf/Type;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Type;->syntax_:I

    return p1
.end method

.method static synthetic access$902(Lcom/google/protobuf/Type;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/google/protobuf/Type;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/Type;
    .locals 1

    .line 1962
    sget-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 136
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Type_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/Type$Builder;
    .locals 1

    .line 604
    sget-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    invoke-virtual {v0}, Lcom/google/protobuf/Type;->toBuilder()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/Type;)Lcom/google/protobuf/Type$Builder;
    .locals 1

    .line 607
    sget-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    invoke-virtual {v0}, Lcom/google/protobuf/Type;->toBuilder()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/Type$Builder;->mergeFrom(Lcom/google/protobuf/Type;)Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 578
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 579
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 578
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 585
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 586
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 585
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 546
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 552
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 591
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 592
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 591
    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 598
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 599
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 598
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 566
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 567
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 566
    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 573
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    .line 574
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    .line 573
    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 535
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 541
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 556
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 562
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Type;>;"
        }
    .end annotation

    .line 1976
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 473
    if-ne p1, p0, :cond_0

    .line 474
    const/4 v0, 0x1

    return v0

    .line 476
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/Type;

    if-nez v0, :cond_1

    .line 477
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 479
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/Type;

    .line 481
    const/4 v3, 0x1

    .line 482
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getName()Ljava/lang/String;

    move-result-object v0

    .line 483
    invoke-virtual {v2}, Lcom/google/protobuf/Type;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 484
    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getFieldsList()Ljava/util/List;

    move-result-object v0

    .line 485
    invoke-virtual {v2}, Lcom/google/protobuf/Type;->getFieldsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 486
    :goto_1
    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOneofsList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v0

    .line 487
    invoke-virtual {v2}, Lcom/google/protobuf/Type;->getOneofsList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 488
    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOptionsList()Ljava/util/List;

    move-result-object v0

    .line 489
    invoke-virtual {v2}, Lcom/google/protobuf/Type;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 490
    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->hasSourceContext()Z

    move-result v0

    invoke-virtual {v2}, Lcom/google/protobuf/Type;->hasSourceContext()Z

    move-result v1

    if-ne v0, v1, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    .line 491
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->hasSourceContext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 492
    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    .line 493
    invoke-virtual {v2}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SourceContext;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    .line 495
    :cond_8
    :goto_5
    if-eqz v3, :cond_9

    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    iget v1, v2, Lcom/google/protobuf/Type;->syntax_:I

    if-ne v0, v1, :cond_9

    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    .line 496
    :goto_6
    if-eqz v3, :cond_a

    iget-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    iget-object v1, v2, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v3, 0x1

    goto :goto_7

    :cond_a
    const/4 v3, 0x0

    .line 497
    :goto_7
    return v3
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getDefaultInstanceForType()Lcom/google/protobuf/Type;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getDefaultInstanceForType()Lcom/google/protobuf/Type;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/Type;
    .locals 1

    .line 1985
    sget-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    return-object v0
.end method

.method public getFields(I)Lcom/google/protobuf/Field;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field;

    return-object v0
.end method

.method public getFieldsCount()I
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getFieldsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Field;>;"
        }
    .end annotation

    .line 199
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    return-object v0
.end method

.method public getFieldsOrBuilder(I)Lcom/google/protobuf/FieldOrBuilder;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/FieldOrBuilder;

    return-object v0
.end method

.method public getFieldsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/google/protobuf/FieldOrBuilder;>;"
        }
    .end annotation

    .line 210
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 4

    .line 157
    iget-object v1, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 158
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 159
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 161
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 163
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 164
    iput-object v3, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 165
    return-object v3
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 177
    iget-object v1, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 178
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 179
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 180
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 182
    iput-object v2, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    .line 183
    return-object v2

    .line 185
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getOneofs(I)Ljava/lang/String;
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/LazyStringList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOneofsBytes(I)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0, p1}, Lcom/google/protobuf/LazyStringList;->getByteString(I)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getOneofsCount()I
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0}, Lcom/google/protobuf/LazyStringList;->size()I

    move-result v0

    return v0
.end method

.method public getOneofsList()Lcom/google/protobuf/ProtocolStringList;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    return-object v0
.end method

.method public bridge synthetic getOneofsList()Ljava/util/List;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOneofsList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v0

    return-object v0
.end method

.method public getOptions(I)Lcom/google/protobuf/Option;
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Option;

    return-object v0
.end method

.method public getOptionsCount()I
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

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

    .line 299
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getOptionsOrBuilder(I)Lcom/google/protobuf/OptionOrBuilder;
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

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

    .line 310
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/Type;>;"
        }
    .end annotation

    .line 1981
    sget-object v0, Lcom/google/protobuf/Type;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 435
    iget v2, p0, Lcom/google/protobuf/Type;->memoizedSize:I

    .line 436
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 438
    :cond_0
    const/4 v2, 0x0

    .line 439
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 440
    iget-object v0, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 442
    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 443
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    .line 444
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 442
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 447
    :cond_2
    const/4 v3, 0x0

    .line 448
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0}, Lcom/google/protobuf/LazyStringList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 449
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0, v4}, Lcom/google/protobuf/LazyStringList;->getRaw(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/Type;->computeStringSizeNoTag(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v3, v0

    .line 448
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 451
    :cond_3
    add-int/2addr v2, v3

    .line 452
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOneofsList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/ProtocolStringList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    .line 454
    const/4 v3, 0x0

    :goto_2
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 455
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    .line 456
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 454
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 458
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    if-eqz v0, :cond_5

    .line 459
    .line 460
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 462
    :cond_5
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    sget-object v1, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    invoke-virtual {v1}, Lcom/google/protobuf/Syntax;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 463
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    .line 464
    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 466
    :cond_6
    iget-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 467
    iput v2, p0, Lcom/google/protobuf/Type;->memoizedSize:I

    .line 468
    return v2
.end method

.method public getSourceContext()Lcom/google/protobuf/SourceContext;
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/SourceContext;->getDefaultInstance()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    :goto_0
    return-object v0
.end method

.method public getSourceContextOrBuilder()Lcom/google/protobuf/SourceContextOrBuilder;
    .locals 1

    .line 374
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    return-object v0
.end method

.method public getSyntax()Lcom/google/protobuf/Syntax;
    .locals 2

    .line 397
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    invoke-static {v0}, Lcom/google/protobuf/Syntax;->valueOf(I)Lcom/google/protobuf/Syntax;

    move-result-object v1

    .line 398
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

    .line 387
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasSourceContext()Z
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 502
    iget v0, p0, Lcom/google/protobuf/Type;->memoizedHashCode:I

    if-eqz v0, :cond_0

    .line 503
    iget v0, p0, Lcom/google/protobuf/Type;->memoizedHashCode:I

    return v0

    .line 505
    :cond_0
    const/16 v2, 0x29

    .line 506
    invoke-static {}, Lcom/google/protobuf/Type;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x30b

    .line 507
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x1

    .line 508
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 509
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getFieldsCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 510
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x2

    .line 511
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getFieldsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 513
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOneofsCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 514
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x3

    .line 515
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOneofsList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 517
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOptionsCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 518
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x4

    .line 519
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getOptionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 521
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->hasSourceContext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 522
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x5

    .line 523
    mul-int/lit8 v0, v2, 0x35

    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/SourceContext;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 525
    :cond_4
    mul-int/lit8 v0, v2, 0x25

    add-int/lit8 v2, v0, 0x6

    .line 526
    mul-int/lit8 v0, v2, 0x35

    iget v1, p0, Lcom/google/protobuf/Type;->syntax_:I

    add-int v2, v0, v1

    .line 527
    mul-int/lit8 v0, v2, 0x1d

    iget-object v1, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 528
    iput v2, p0, Lcom/google/protobuf/Type;->memoizedHashCode:I

    .line 529
    return v2
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 141
    sget-object v0, Lcom/google/protobuf/TypeProto;->internal_static_google_protobuf_Type_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/Type;

    const-class v2, Lcom/google/protobuf/Type$Builder;

    .line 142
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 141
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 403
    iget-byte v1, p0, Lcom/google/protobuf/Type;->memoizedIsInitialized:B

    .line 404
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 405
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 407
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/google/protobuf/Type;->memoizedIsInitialized:B

    .line 408
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->newBuilderForType()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/protobuf/Type;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->newBuilderForType()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/Type$Builder;
    .locals 1

    .line 602
    invoke-static {}, Lcom/google/protobuf/Type;->newBuilder()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Type$Builder;
    .locals 2

    .line 617
    new-instance v1, Lcom/google/protobuf/Type$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/Type$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/Type$1;)V

    .line 618
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->toBuilder()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->toBuilder()Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/Type$Builder;
    .locals 2

    .line 610
    sget-object v0, Lcom/google/protobuf/Type;->DEFAULT_INSTANCE:Lcom/google/protobuf/Type;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Type$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Type$Builder;-><init>(Lcom/google/protobuf/Type$1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Type$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/Type$Builder;-><init>(Lcom/google/protobuf/Type$1;)V

    .line 611
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Type$Builder;->mergeFrom(Lcom/google/protobuf/Type;)Lcom/google/protobuf/Type$Builder;

    move-result-object v0

    .line 610
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

    .line 413
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/google/protobuf/Type;->name_:Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 416
    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 417
    iget-object v0, p0, Lcom/google/protobuf/Type;->fields_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 416
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 419
    :cond_1
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0}, Lcom/google/protobuf/LazyStringList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 420
    iget-object v0, p0, Lcom/google/protobuf/Type;->oneofs_:Lcom/google/protobuf/LazyStringList;

    invoke-interface {v0, v2}, Lcom/google/protobuf/LazyStringList;->getRaw(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 419
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 422
    :cond_2
    const/4 v2, 0x0

    :goto_2
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 423
    iget-object v0, p0, Lcom/google/protobuf/Type;->options_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 422
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 425
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/Type;->sourceContext_:Lcom/google/protobuf/SourceContext;

    if-eqz v0, :cond_4

    .line 426
    invoke-virtual {p0}, Lcom/google/protobuf/Type;->getSourceContext()Lcom/google/protobuf/SourceContext;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 428
    :cond_4
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    sget-object v1, Lcom/google/protobuf/Syntax;->SYNTAX_PROTO2:Lcom/google/protobuf/Syntax;

    invoke-virtual {v1}, Lcom/google/protobuf/Syntax;->getNumber()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 429
    iget v0, p0, Lcom/google/protobuf/Type;->syntax_:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 431
    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/Type;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 432
    return-void
.end method
