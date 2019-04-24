.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECGRealTimeSliceData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    }
.end annotation


# static fields
.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;>;"
        }
    .end annotation
.end field

.field public static final REALTIMEDATALIST_FIELD_NUMBER:I = 0x2

.field public static final STAMP_FIELD_NUMBER:I = 0x1

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private realTimeDataList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation
.end field

.field private stamp_:J

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30563
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    .line 31196
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    .line 31197
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->initFields()V

    .line 31198
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30503
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 30639
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedIsInitialized:B

    .line 30661
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedSerializedSize:I

    .line 30504
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->initFields()V

    .line 30505
    const/4 v2, 0x0

    .line 30507
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 30509
    const/4 v4, 0x0

    .line 30510
    :goto_0
    if-nez v4, :cond_2

    .line 30511
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 30512
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 30514
    :sswitch_0
    const/4 v4, 0x1

    .line 30515
    goto :goto_2

    .line 30517
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 30519
    const/4 v4, 0x1

    goto :goto_2

    .line 30524
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

    .line 30525
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    .line 30526
    goto :goto_2

    .line 30529
    :sswitch_2
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 30530
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    .line 30531
    or-int/lit8 v0, v2, 0x2

    move v2, v0

    .line 30533
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;->access$43200()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30537
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 30544
    :cond_2
    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 30545
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    .line 30547
    :cond_3
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 30548
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->makeExtensionsImmutable()V

    .line 30549
    goto :goto_3

    .line 30538
    :catch_0
    move-exception v4

    .line 30539
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 30540
    :catch_1
    move-exception v4

    .line 30541
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 30542
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30544
    :catchall_0
    move-exception v6

    and-int/lit8 v0, v2, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 30545
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    .line 30547
    :cond_4
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 30548
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->makeExtensionsImmutable()V

    .line 30549
    throw v6

    .line 30550
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

    .line 30474
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 30480
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 30639
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedIsInitialized:B

    .line 30661
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedSerializedSize:I

    .line 30481
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 30482
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 30474
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 30483
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 30639
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedIsInitialized:B

    .line 30661
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedSerializedSize:I

    .line 30483
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$43800()Z
    .locals 1

    .line 30474
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$44002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;J)J
    .locals 0

    .line 30474
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    return-wide p1
.end method

.method static synthetic access$44100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Ljava/util/List;
    .locals 1

    .line 30474
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$44102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 30474
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$44202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;I)I
    .locals 0

    .line 30474
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

    return p1
.end method

.method static synthetic access$44300()Z
    .locals 1

    .line 30474
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$44400()Lcom/google/protobuf/Parser;
    .locals 1

    .line 30474
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1

    .line 30487
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 30553
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$43300()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 30636
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    .line 30637
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    .line 30638
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30740
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->access$43600()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30743
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30720
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30726
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30690
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30696
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30731
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30737
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30710
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30716
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30700
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 30706
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;
    .locals 1

    .line 30491
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;>;"
        }
    .end annotation

    .line 30575
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getRealTimeDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
    .locals 1

    .line 30619
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 30620
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 30622
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;

    return-object v0
.end method

.method public getRealTimeDataListCount()I
    .locals 1

    .line 30613
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getRealTimeDataListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation

    .line 30600
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    return-object v0
.end method

.method public getRealTimeDataListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;
    .locals 1

    .line 30629
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 30630
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 30632
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;

    return-object v0
.end method

.method public getRealTimeDataListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;>;"
        }
    .end annotation

    .line 30607
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 30663
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedSerializedSize:I

    .line 30664
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 30666
    :cond_0
    const/4 v3, 0x0

    .line 30667
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 30668
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    .line 30669
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 30671
    :cond_1
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 30672
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    .line 30673
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 30671
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 30675
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 30676
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedSerializedSize:I

    .line 30677
    return v3
.end method

.method public getStamp()J
    .locals 2

    .line 30591
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    return-wide v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 30498
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasStamp()Z
    .locals 2

    .line 30585
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

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

    .line 30558
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$43400()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    .line 30559
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 30558
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 30641
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedIsInitialized:B

    .line 30642
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 30643
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 30645
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->memoizedIsInitialized:B

    .line 30646
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30474
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30741
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 2

    .line 30750
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 30751
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 30474
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;
    .locals 1

    .line 30745
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData$Builder;

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

    .line 30684
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30651
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getSerializedSize()I

    .line 30652
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 30653
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->stamp_:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 30655
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 30656
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->realTimeDataList_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 30655
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 30658
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 30659
    return-void
.end method
