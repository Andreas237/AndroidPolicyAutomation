.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfoOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeviceInfo"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    }
.end annotation


# static fields
.field public static final CLOUDUSERDEVICECODE_FIELD_NUMBER:I = 0x2

.field public static final DEVICEID_FIELD_NUMBER:I = 0x4

.field public static final HUID_FIELD_NUMBER:I = 0x3

.field public static final LOCALUSERDEVICECODE_FIELD_NUMBER:I = 0x1

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;>;"
        }
    .end annotation
.end field

.field public static final PRODUCTID_FIELD_NUMBER:I = 0x5

.field public static final PRODUCTNAME_FIELD_NUMBER:I = 0x6

.field public static final PRODUCTTYPES_FIELD_NUMBER:I = 0x7

.field public static final VERSION_FIELD_NUMBER:I = 0x8

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private bitField0_:I

.field private cloudUserDeviceCode_:J

.field private deviceId_:Ljava/lang/Object;

.field private huid_:J

.field private localUserDeviceCode_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private productId_:I

.field private productName_:Ljava/lang/Object;

.field private productTypes_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;

.field private version_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 5648
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    .line 6669
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    .line 6670
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->initFields()V

    .line 6671
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5542
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 5885
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedIsInitialized:B

    .line 5925
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedSerializedSize:I

    .line 5543
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->initFields()V

    .line 5544
    const/4 v2, 0x0

    .line 5546
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 5548
    const/4 v4, 0x0

    .line 5549
    :goto_0
    if-nez v4, :cond_4

    .line 5550
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 5551
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 5553
    :sswitch_0
    const/4 v4, 0x1

    .line 5554
    goto/16 :goto_3

    .line 5556
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 5558
    const/4 v4, 0x1

    goto/16 :goto_3

    .line 5563
    :sswitch_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5564
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    .line 5565
    goto/16 :goto_3

    .line 5568
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5569
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    .line 5570
    goto/16 :goto_3

    .line 5573
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5574
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    .line 5575
    goto/16 :goto_3

    .line 5578
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 5579
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5580
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5581
    goto/16 :goto_3

    .line 5584
    :sswitch_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5585
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    .line 5586
    goto/16 :goto_3

    .line 5589
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 5590
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5591
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5592
    goto/16 :goto_3

    .line 5595
    :sswitch_7
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_0

    .line 5596
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5597
    or-int/lit8 v0, v2, 0x40

    move v2, v0

    .line 5599
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5600
    goto :goto_3

    .line 5603
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 5604
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 5605
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_1

    .line 5606
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5607
    or-int/lit8 v0, v2, 0x40

    move v2, v0

    .line 5609
    :cond_1
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_2

    .line 5610
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 5612
    :cond_2
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    .line 5613
    goto :goto_3

    .line 5616
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 5617
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    .line 5618
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5619
    .line 5622
    :cond_3
    :goto_3
    goto/16 :goto_0

    .line 5629
    :cond_4
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_5

    .line 5630
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5632
    :cond_5
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 5633
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->makeExtensionsImmutable()V

    .line 5634
    goto :goto_4

    .line 5623
    :catch_0
    move-exception v4

    .line 5624
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 5625
    :catch_1
    move-exception v4

    .line 5626
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 5627
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5629
    :catchall_0
    move-exception v8

    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 5630
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5632
    :cond_6
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 5633
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->makeExtensionsImmutable()V

    .line 5634
    throw v8

    .line 5635
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x32 -> :sswitch_6
        0x38 -> :sswitch_7
        0x3a -> :sswitch_8
        0x42 -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5513
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 5519
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 5885
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedIsInitialized:B

    .line 5925
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedSerializedSize:I

    .line 5520
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 5521
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 5513
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 5522
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 5885
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedIsInitialized:B

    .line 5925
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedSerializedSize:I

    .line 5522
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$000()Lcom/google/protobuf/Parser;
    .locals 1

    .line 5513
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$8102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I
    .locals 0

    .line 5513
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    return p1
.end method

.method static synthetic access$8202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;J)J
    .locals 0

    .line 5513
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    return-wide p1
.end method

.method static synthetic access$8302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;J)J
    .locals 0

    .line 5513
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    return-wide p1
.end method

.method static synthetic access$8400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;
    .locals 1

    .line 5513
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$8402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5513
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$8502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I
    .locals 0

    .line 5513
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    return p1
.end method

.method static synthetic access$8600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;
    .locals 1

    .line 5513
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$8602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5513
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$8700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/util/List;
    .locals 1

    .line 5513
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$8702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 5513
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$8800(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Ljava/lang/Object;
    .locals 1

    .line 5513
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$8802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5513
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$8902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;I)I
    .locals 0

    .line 5513
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    return p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1

    .line 5526
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 5638
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$7500()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 5876
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    .line 5877
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    .line 5878
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    .line 5879
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5880
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    .line 5881
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5882
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5883
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    .line 5884
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6033
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->access$7800()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6036
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6013
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6019
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5983
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5989
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6024
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6030
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6003
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6009
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5993
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5999
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method


# virtual methods
.method public getCloudUserDeviceCode()J
    .locals 2

    .line 5691
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;
    .locals 1

    .line 5530
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 4

    .line 5721
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5722
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5723
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 5725
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 5727
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 5728
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5729
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5731
    :cond_1
    return-object v3
.end method

.method public getDeviceIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 5739
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5740
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5741
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 5742
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 5744
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->deviceId_:Ljava/lang/Object;

    .line 5745
    return-object v2

    .line 5747
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 5706
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    return-wide v0
.end method

.method public getLocalUserDeviceCode()I
    .locals 1

    .line 5676
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;>;"
        }
    .end annotation

    .line 5660
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getProductId()I
    .locals 1

    .line 5763
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    return v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 4

    .line 5778
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5779
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5780
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 5782
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 5784
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 5785
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5786
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5788
    :cond_1
    return-object v3
.end method

.method public getProductNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 5796
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5797
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5798
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 5799
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 5801
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productName_:Ljava/lang/Object;

    .line 5802
    return-object v2

    .line 5804
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getProductTypes(I)I
    .locals 1

    .line 5827
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 5828
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 5830
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getProductTypesCount()I
    .locals 1

    .line 5821
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getProductTypesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 5815
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 5927
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedSerializedSize:I

    .line 5928
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 5930
    :cond_0
    const/4 v3, 0x0

    .line 5931
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 5932
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    .line 5933
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 5935
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 5936
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    .line 5937
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 5939
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 5940
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    .line 5941
    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 5943
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 5944
    .line 5945
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDeviceIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 5947
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 5948
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    .line 5949
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 5951
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 5952
    .line 5953
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 5956
    :cond_6
    const/4 v4, 0x0

    .line 5957
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_7

    .line 5958
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    .line 5959
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 5957
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 5961
    :cond_7
    add-int/2addr v3, v4

    .line 5962
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductTypesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 5964
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_8

    .line 5965
    .line 5966
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getVersionBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 5968
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 5969
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedSerializedSize:I

    .line 5970
    return v3
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 5537
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 4

    .line 5845
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    .line 5846
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5847
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 5849
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 5851
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 5852
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5853
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    .line 5855
    :cond_1
    return-object v3
.end method

.method public getVersionBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 5863
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    .line 5864
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5865
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 5866
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 5868
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->version_:Ljava/lang/Object;

    .line 5869
    return-object v2

    .line 5871
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasCloudUserDeviceCode()Z
    .locals 2

    .line 5685
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasDeviceId()Z
    .locals 2

    .line 5715
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasHuid()Z
    .locals 2

    .line 5700
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLocalUserDeviceCode()Z
    .locals 2

    .line 5670
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

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

.method public hasProductId()Z
    .locals 2

    .line 5757
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasProductName()Z
    .locals 2

    .line 5772
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasVersion()Z
    .locals 2

    .line 5839
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

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

    .line 5643
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$7600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    .line 5644
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 5643
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 5887
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedIsInitialized:B

    .line 5888
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 5889
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 5891
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->memoizedIsInitialized:B

    .line 5892
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 5513
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6034
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 2

    .line 6043
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 6044
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;
    .locals 1

    .line 6038
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo$Builder;

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

    .line 5977
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

    .line 5897
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getSerializedSize()I

    .line 5898
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5899
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->localUserDeviceCode_:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 5901
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 5902
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->cloudUserDeviceCode_:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 5904
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 5905
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->huid_:J

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 5907
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 5908
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getDeviceIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 5910
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 5911
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productId_:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 5913
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 5914
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getProductNameBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 5916
    :cond_5
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 5917
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->productTypes_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 5916
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 5919
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 5920
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getVersionBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 5922
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 5923
    return-void
.end method
