.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionPointData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    }
.end annotation


# static fields
.field public static final CREATETIME_FIELD_NUMBER:I = 0x1

.field public static final LBSDATA_FIELD_NUMBER:I = 0x2

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private createTime_:J

.field private lbsData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 10659
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    .line 11074
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    .line 11075
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->initFields()V

    .line 11076
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10586
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 10719
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedIsInitialized:B

    .line 10741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedSerializedSize:I

    .line 10587
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->initFields()V

    .line 10588
    const/4 v3, 0x0

    .line 10590
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v4

    .line 10592
    const/4 v5, 0x0

    .line 10593
    :goto_0
    if-nez v5, :cond_4

    .line 10594
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v6

    .line 10595
    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    .line 10597
    :sswitch_0
    const/4 v5, 0x1

    .line 10598
    goto/16 :goto_3

    .line 10600
    :goto_1
    invoke-virtual {p0, p1, v4, p2, v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 10602
    const/4 v5, 0x1

    goto/16 :goto_3

    .line 10607
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

    .line 10608
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    .line 10609
    goto :goto_3

    .line 10612
    :sswitch_2
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 10613
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    .line 10614
    or-int/lit8 v0, v3, 0x2

    move v3, v0

    .line 10616
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10617
    goto :goto_3

    .line 10620
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v7

    .line 10621
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v8

    .line 10622
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_1

    .line 10623
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    .line 10624
    or-int/lit8 v0, v3, 0x2

    move v3, v0

    .line 10626
    :cond_1
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_2

    .line 10627
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readDouble()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 10629
    :cond_2
    invoke-virtual {p1, v8}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10630
    .line 10633
    :cond_3
    :goto_3
    goto/16 :goto_0

    .line 10640
    :cond_4
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 10641
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    .line 10643
    :cond_5
    invoke-virtual {v4}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 10644
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->makeExtensionsImmutable()V

    .line 10645
    goto :goto_4

    .line 10634
    :catch_0
    move-exception v5

    .line 10635
    :try_start_1
    invoke-virtual {v5, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 10636
    :catch_1
    move-exception v5

    .line 10637
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 10638
    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10640
    :catchall_0
    move-exception v9

    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 10641
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    .line 10643
    :cond_6
    invoke-virtual {v4}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 10644
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->makeExtensionsImmutable()V

    .line 10645
    throw v9

    .line 10646
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x11 -> :sswitch_2
        0x12 -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10557
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 10563
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 10719
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedIsInitialized:B

    .line 10741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedSerializedSize:I

    .line 10564
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 10565
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 10557
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 10566
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 10719
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedIsInitialized:B

    .line 10741
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedSerializedSize:I

    .line 10566
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$15402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;J)J
    .locals 0

    .line 10557
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    return-wide p1
.end method

.method static synthetic access$15500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Ljava/util/List;
    .locals 1

    .line 10557
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$15502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 10557
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$15602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;I)I
    .locals 0

    .line 10557
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

    return p1
.end method

.method static synthetic access$15700()Lcom/google/protobuf/Parser;
    .locals 1

    .line 10557
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1

    .line 10570
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 10649
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$14800()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 10716
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    .line 10717
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    .line 10718
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 1

    .line 10822
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->access$15100()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 1

    .line 10825
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10802
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10808
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10772
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10778
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10813
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10819
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10792
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10798
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10782
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10788
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 10687
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1

    .line 10574
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public getLbsData(I)D
    .locals 2

    .line 10709
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 10710
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 10712
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getLbsDataCount()I
    .locals 1

    .line 10703
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getLbsDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation

    .line 10697
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;>;"
        }
    .end annotation

    .line 10671
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 10743
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedSerializedSize:I

    .line 10744
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 10746
    :cond_0
    const/4 v3, 0x0

    .line 10747
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 10748
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    .line 10749
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 10752
    :cond_1
    const/4 v4, 0x0

    .line 10753
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getLbsDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v4, v0, 0x8

    .line 10754
    add-int/2addr v3, v4

    .line 10755
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getLbsDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 10757
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 10758
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedSerializedSize:I

    .line 10759
    return v3
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 10581
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasCreateTime()Z
    .locals 2

    .line 10681
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

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

    .line 10654
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$14900()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    .line 10655
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 10654
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 10721
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedIsInitialized:B

    .line 10722
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 10723
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 10725
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->memoizedIsInitialized:B

    .line 10726
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10557
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 1

    .line 10823
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 2

    .line 10832
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 10833
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 10557
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 1

    .line 10827
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

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

    .line 10766
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

    .line 10731
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getSerializedSize()I

    .line 10732
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 10733
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->createTime_:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 10735
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 10736
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->lbsData_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeDouble(ID)V

    .line 10735
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 10738
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 10739
    return-void
.end method
