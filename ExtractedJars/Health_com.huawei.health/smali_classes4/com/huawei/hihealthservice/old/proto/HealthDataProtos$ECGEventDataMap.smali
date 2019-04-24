.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGEventDataMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    }
.end annotation


# static fields
.field public static final EVENTDATAS_FIELD_NUMBER:I = 0x2

.field public static final KEY_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private eventDatas_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;>;"
        }
    .end annotation
.end field

.field private key_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27446
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    .line 28079
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    .line 28080
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->initFields()V

    .line 28081
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27386
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 27522
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedIsInitialized:B

    .line 27544
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedSerializedSize:I

    .line 27387
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->initFields()V

    .line 27388
    const/4 v2, 0x0

    .line 27390
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 27392
    const/4 v4, 0x0

    .line 27393
    :goto_0
    if-nez v4, :cond_2

    .line 27394
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 27395
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 27397
    :sswitch_0
    const/4 v4, 0x1

    .line 27398
    goto :goto_2

    .line 27400
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 27402
    const/4 v4, 0x1

    goto :goto_2

    .line 27407
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    .line 27408
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    .line 27409
    goto :goto_2

    .line 27412
    :sswitch_2
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 27413
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    .line 27414
    or-int/lit8 v0, v2, 0x2

    move v2, v0

    .line 27416
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;->access$37600()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27420
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 27427
    :cond_2
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 27428
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    .line 27430
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 27431
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->makeExtensionsImmutable()V

    .line 27432
    goto :goto_3

    .line 27421
    :catch_0
    move-exception v4

    .line 27422
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 27423
    :catch_1
    move-exception v4

    .line 27424
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 27425
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27427
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 27428
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    .line 27430
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 27431
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->makeExtensionsImmutable()V

    .line 27432
    throw v6

    .line 27433
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27357
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 27363
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 27522
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedIsInitialized:B

    .line 27544
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedSerializedSize:I

    .line 27364
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 27365
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 27357
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 27366
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 27522
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedIsInitialized:B

    .line 27544
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedSerializedSize:I

    .line 27366
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$33100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 27357
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$38200()Z
    .locals 1

    .line 27357
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$38402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;I)I
    .locals 0

    .line 27357
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    return p1
.end method

.method static synthetic access$38500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Ljava/util/List;
    .locals 1

    .line 27357
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$38502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 27357
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$38602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;I)I
    .locals 0

    .line 27357
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    return p1
.end method

.method static synthetic access$38700()Z
    .locals 1

    .line 27357
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1

    .line 27370
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 27436
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$37700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 27519
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    .line 27520
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    .line 27521
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27623
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->access$38000()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27626
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27603
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27609
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27573
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27579
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27614
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27620
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27593
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27599
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27583
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 27589
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1

    .line 27374
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public getEventDatas(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;
    .locals 1

    .line 27502
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 27503
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 27505
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;

    return-object v0
.end method

.method public getEventDatasCount()I
    .locals 1

    .line 27496
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getEventDatasList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataList;>;"
        }
    .end annotation

    .line 27483
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    return-object v0
.end method

.method public getEventDatasOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;
    .locals 1

    .line 27512
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 27513
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 27515
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;

    return-object v0
.end method

.method public getEventDatasOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataListOrBuilder;>;"
        }
    .end annotation

    .line 27490
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 27474
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation

    .line 27458
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 27546
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedSerializedSize:I

    .line 27547
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 27549
    :cond_0
    const/4 v2, 0x0

    .line 27550
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 27551
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    .line 27552
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 27554
    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 27555
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    .line 27556
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 27554
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 27558
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 27559
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedSerializedSize:I

    .line 27560
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 27381
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasKey()Z
    .locals 2

    .line 27468
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 27441
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$37800()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    .line 27442
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 27441
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 27524
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedIsInitialized:B

    .line 27525
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 27526
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 27528
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->memoizedIsInitialized:B

    .line 27529
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27357
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27624
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 27633
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 27634
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 27357
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 27628
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

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

    .line 27567
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

    .line 27534
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getSerializedSize()I

    .line 27535
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 27536
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->key_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 27538
    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 27539
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->eventDatas_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 27538
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 27541
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 27542
    return-void
.end method
