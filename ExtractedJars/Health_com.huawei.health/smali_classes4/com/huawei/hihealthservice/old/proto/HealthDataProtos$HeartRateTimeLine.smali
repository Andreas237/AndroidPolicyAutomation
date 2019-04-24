.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HeartRateTimeLine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    }
.end annotation


# static fields
.field public static final AVGHEARTRATE_FIELD_NUMBER:I = 0x4

.field public static final BASETIMELINE_FIELD_NUMBER:I = 0x1

.field public static final HEARTRATEVALUES_FIELD_NUMBER:I = 0x5

.field public static final MAXHEARTRATE_FIELD_NUMBER:I = 0x2

.field public static final MINHEARTRATE_FIELD_NUMBER:I = 0x3

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;>;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private avgHeartRate_:I

.field private baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

.field private bitField0_:I

.field private heartRateValues_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private maxHeartRate_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private minHeartRate_:I

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9810
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    .line 10521
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    .line 10522
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->initFields()V

    .line 10523
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9714
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 9924
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedIsInitialized:B

    .line 9955
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedSerializedSize:I

    .line 9715
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->initFields()V

    .line 9716
    const/4 v2, 0x0

    .line 9718
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 9720
    const/4 v4, 0x0

    .line 9721
    :goto_0
    if-nez v4, :cond_6

    .line 9722
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 9723
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 9725
    :sswitch_0
    const/4 v4, 0x1

    .line 9726
    goto/16 :goto_3

    .line 9728
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 9730
    const/4 v4, 0x1

    goto/16 :goto_3

    .line 9735
    :sswitch_1
    const/4 v6, 0x0

    .line 9736
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 9737
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    move-result-object v6

    .line 9739
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->access$11800()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9740
    if-eqz v6, :cond_1

    .line 9741
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;

    .line 9742
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9744
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    .line 9745
    goto/16 :goto_3

    .line 9748
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    .line 9749
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    .line 9750
    goto/16 :goto_3

    .line 9753
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    .line 9754
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    .line 9755
    goto/16 :goto_3

    .line 9758
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    .line 9759
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    .line 9760
    goto/16 :goto_3

    .line 9763
    :sswitch_5
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    .line 9764
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9765
    or-int/lit8 v0, v2, 0x10

    move v2, v0

    .line 9767
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9768
    goto :goto_3

    .line 9771
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 9772
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 9773
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_3

    .line 9774
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9775
    or-int/lit8 v0, v2, 0x10

    move v2, v0

    .line 9777
    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_4

    .line 9778
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 9780
    :cond_4
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9781
    .line 9784
    :cond_5
    :goto_3
    goto/16 :goto_0

    .line 9791
    :cond_6
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_7

    .line 9792
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9794
    :cond_7
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 9795
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->makeExtensionsImmutable()V

    .line 9796
    goto :goto_4

    .line 9785
    :catch_0
    move-exception v4

    .line 9786
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 9787
    :catch_1
    move-exception v4

    .line 9788
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 9789
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9791
    :catchall_0
    move-exception v8

    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_8

    .line 9792
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9794
    :cond_8
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 9795
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->makeExtensionsImmutable()V

    .line 9796
    throw v8

    .line 9797
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x2a -> :sswitch_6
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 9685
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 9691
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 9924
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedIsInitialized:B

    .line 9955
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedSerializedSize:I

    .line 9692
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 9693
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 9685
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 9694
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 9924
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedIsInitialized:B

    .line 9955
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedSerializedSize:I

    .line 9694
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$13900()Z
    .locals 1

    .line 9685
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$14102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 0

    .line 9685
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object p1
.end method

.method static synthetic access$14202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I
    .locals 0

    .line 9685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    return p1
.end method

.method static synthetic access$14302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I
    .locals 0

    .line 9685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    return p1
.end method

.method static synthetic access$14402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I
    .locals 0

    .line 9685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    return p1
.end method

.method static synthetic access$14500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Ljava/util/List;
    .locals 1

    .line 9685
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$14502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 9685
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$14602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;I)I
    .locals 0

    .line 9685
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    return p1
.end method

.method static synthetic access$14700()Lcom/google/protobuf/Parser;
    .locals 1

    .line 9685
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1

    .line 9698
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 9800
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$13400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 9918
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9919
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    .line 9920
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    .line 9921
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    .line 9922
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9923
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10051
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->access$13700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10054
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10031
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10037
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10001
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10007
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10042
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10048
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10021
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10027
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10011
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 10017
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method


# virtual methods
.method public getAvgHeartRate()I
    .locals 1

    .line 9889
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    return v0
.end method

.method public getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
    .locals 1

    .line 9838
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
    .locals 1

    .line 9844
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;
    .locals 1

    .line 9702
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    return-object v0
.end method

.method public getHeartRateValues(I)I
    .locals 1

    .line 9911
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 9912
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 9914
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getHeartRateValuesCount()I
    .locals 1

    .line 9905
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getHeartRateValuesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 9899
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    return-object v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 9859
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 9874
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;>;"
        }
    .end annotation

    .line 9822
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 9957
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedSerializedSize:I

    .line 9958
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 9960
    :cond_0
    const/4 v2, 0x0

    .line 9961
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 9962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    .line 9963
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 9965
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 9966
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    .line 9967
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9969
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 9970
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    .line 9971
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9973
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 9974
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    .line 9975
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 9978
    :cond_4
    const/4 v3, 0x0

    .line 9979
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    .line 9980
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    .line 9981
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v3, v0

    .line 9979
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 9983
    :cond_5
    add-int/2addr v2, v3

    .line 9984
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getHeartRateValuesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    .line 9986
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 9987
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedSerializedSize:I

    .line 9988
    return v2
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 9709
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasAvgHeartRate()Z
    .locals 2

    .line 9883
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

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

.method public hasBaseTimeLine()Z
    .locals 2

    .line 9832
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

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

.method public hasMaxHeartRate()Z
    .locals 2

    .line 9853
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

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

.method public hasMinHeartRate()Z
    .locals 2

    .line 9868
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 9805
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$13500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    .line 9806
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 9805
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 9926
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedIsInitialized:B

    .line 9927
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 9928
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 9930
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->memoizedIsInitialized:B

    .line 9931
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9685
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10052
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 2

    .line 10061
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 10062
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 9685
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;
    .locals 1

    .line 10056
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine$Builder;

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

    .line 9995
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

    .line 9936
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getSerializedSize()I

    .line 9937
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 9938
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->baseTimeLine_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 9940
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 9941
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->maxHeartRate_:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9943
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 9944
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->minHeartRate_:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9946
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 9947
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->avgHeartRate_:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9949
    :cond_3
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 9950
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->heartRateValues_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 9949
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9952
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 9953
    return-void
.end method
