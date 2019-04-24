.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StringMapMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    }
.end annotation


# static fields
.field public static final ENTRIES_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private entries_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21331
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    .line 21897
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 21898
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->initFields()V

    .line 21899
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21276
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 21390
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedIsInitialized:B

    .line 21409
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedSerializedSize:I

    .line 21277
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->initFields()V

    .line 21278
    const/4 v2, 0x0

    .line 21280
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 21282
    const/4 v4, 0x0

    .line 21283
    :goto_0
    if-nez v4, :cond_2

    .line 21284
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 21285
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 21287
    :sswitch_0
    const/4 v4, 0x1

    .line 21288
    goto :goto_2

    .line 21290
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 21292
    const/4 v4, 0x1

    goto :goto_2

    .line 21297
    :sswitch_1
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 21298
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    .line 21299
    or-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 21301
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28300()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21305
    :cond_1
    :goto_2
    goto :goto_0

    .line 21312
    :cond_2
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 21313
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    .line 21315
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21316
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->makeExtensionsImmutable()V

    .line 21317
    goto :goto_3

    .line 21306
    :catch_0
    move-exception v4

    .line 21307
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 21308
    :catch_1
    move-exception v4

    .line 21309
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 21310
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21312
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 21313
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    .line 21315
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21316
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->makeExtensionsImmutable()V

    .line 21317
    throw v6

    .line 21318
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21247
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 21253
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 21390
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedIsInitialized:B

    .line 21409
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedSerializedSize:I

    .line 21254
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 21255
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 21247
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 21256
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 21390
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedIsInitialized:B

    .line 21409
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedSerializedSize:I

    .line 21256
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$26500()Lcom/google/protobuf/Parser;
    .locals 1

    .line 21247
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$29800()Z
    .locals 1

    .line 21247
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$30000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/List;
    .locals 1

    .line 21247
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$30002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 21247
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$30100()Z
    .locals 1

    .line 21247
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1

    .line 21260
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 21321
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$29300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 21388
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    .line 21389
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21484
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->access$29600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21487
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21464
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21470
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21434
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21440
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21475
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21481
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21454
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21460
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21444
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 21450
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1

    .line 21264
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public getEntries(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1

    .line 21371
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 21372
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21374
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    return-object v0
.end method

.method public getEntriesCount()I
    .locals 1

    .line 21365
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getEntriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;>;"
        }
    .end annotation

    .line 21352
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method public getEntriesOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;
    .locals 1

    .line 21381
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 21382
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 21384
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;

    return-object v0
.end method

.method public getEntriesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;>;"
        }
    .end annotation

    .line 21359
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;>;"
        }
    .end annotation

    .line 21343
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 21411
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedSerializedSize:I

    .line 21412
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 21414
    :cond_0
    const/4 v2, 0x0

    .line 21415
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 21416
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    .line 21417
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 21415
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 21419
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 21420
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedSerializedSize:I

    .line 21421
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 21271
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 21326
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$29400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    .line 21327
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 21326
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 21392
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedIsInitialized:B

    .line 21393
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 21394
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 21396
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->memoizedIsInitialized:B

    .line 21397
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21247
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21485
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 21494
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 21495
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 21247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 1

    .line 21489
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 21428
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

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

    .line 21402
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getSerializedSize()I

    .line 21403
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 21404
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->entries_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 21403
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21406
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 21407
    return-void
.end method
