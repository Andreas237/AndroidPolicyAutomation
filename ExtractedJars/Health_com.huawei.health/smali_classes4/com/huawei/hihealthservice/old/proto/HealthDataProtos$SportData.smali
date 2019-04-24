.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    }
.end annotation


# static fields
.field public static final BASEHEALTHDATA_FIELD_NUMBER:I = 0x1

.field public static final CALORIES_FIELD_NUMBER:I = 0x6

.field public static final DISTANCES_FIELD_NUMBER:I = 0x7

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation
.end field

.field public static final STEPS_FIELD_NUMBER:I = 0x5

.field public static final STOREYS_FIELD_NUMBER:I = 0x9

.field public static final TOTALCALORIES_FIELD_NUMBER:I = 0x4

.field public static final TOTALDISTANCE_FIELD_NUMBER:I = 0x3

.field public static final TOTALSTEPS_FIELD_NUMBER:I = 0x2

.field public static final TOTALSTOREYS_FIELD_NUMBER:I = 0x8

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private calories_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private distances_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private steps_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private storeys_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private totalCalories_:J

.field private totalDistance_:J

.field private totalSteps_:J

.field private totalStoreys_:J

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 6986
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8134
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    .line 8135
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->initFields()V

    .line 8136
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6813
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 7194
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedIsInitialized:B

    .line 7237
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedSerializedSize:I

    .line 6814
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->initFields()V

    .line 6815
    const/4 v2, 0x0

    .line 6817
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 6819
    const/4 v4, 0x0

    .line 6820
    :goto_0
    if-nez v4, :cond_f

    .line 6821
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 6822
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    .line 6824
    :sswitch_0
    const/4 v4, 0x1

    .line 6825
    goto/16 :goto_6

    .line 6827
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_e

    .line 6829
    const/4 v4, 0x1

    goto/16 :goto_6

    .line 6834
    :sswitch_1
    const/4 v6, 0x0

    .line 6835
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 6836
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v6

    .line 6838
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 6839
    if-eqz v6, :cond_1

    .line 6840
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 6841
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 6843
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    .line 6844
    goto/16 :goto_6

    .line 6847
    :sswitch_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    .line 6848
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    .line 6849
    goto/16 :goto_6

    .line 6852
    :sswitch_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    .line 6853
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    .line 6854
    goto/16 :goto_6

    .line 6857
    :sswitch_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    .line 6858
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    .line 6859
    goto/16 :goto_6

    .line 6862
    :sswitch_5
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    .line 6863
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 6864
    or-int/lit8 v0, v2, 0x10

    move v2, v0

    .line 6866
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6867
    goto/16 :goto_6

    .line 6870
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 6871
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 6872
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_3

    .line 6873
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 6874
    or-int/lit8 v0, v2, 0x10

    move v2, v0

    .line 6876
    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_4

    .line 6877
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 6879
    :cond_4
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    .line 6880
    goto/16 :goto_6

    .line 6883
    :sswitch_7
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    .line 6884
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 6885
    or-int/lit8 v0, v2, 0x20

    move v2, v0

    .line 6887
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6888
    goto/16 :goto_6

    .line 6891
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 6892
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 6893
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-eq v0, v1, :cond_6

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_6

    .line 6894
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 6895
    or-int/lit8 v0, v2, 0x20

    move v2, v0

    .line 6897
    :cond_6
    :goto_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_7

    .line 6898
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 6900
    :cond_7
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    .line 6901
    goto/16 :goto_6

    .line 6904
    :sswitch_9
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_8

    .line 6905
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 6906
    or-int/lit8 v0, v2, 0x40

    move v2, v0

    .line 6908
    :cond_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6909
    goto/16 :goto_6

    .line 6912
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 6913
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 6914
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-eq v0, v1, :cond_9

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_9

    .line 6915
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 6916
    or-int/lit8 v0, v2, 0x40

    move v2, v0

    .line 6918
    :cond_9
    :goto_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_a

    .line 6919
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 6921
    :cond_a
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    .line 6922
    goto/16 :goto_6

    .line 6925
    :sswitch_b
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    .line 6926
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    .line 6927
    goto/16 :goto_6

    .line 6930
    :sswitch_c
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_b

    .line 6931
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 6932
    or-int/lit16 v0, v2, 0x100

    move v2, v0

    .line 6934
    :cond_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6935
    goto :goto_6

    .line 6938
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v6

    .line 6939
    invoke-virtual {p1, v6}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v7

    .line 6940
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_c

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_c

    .line 6941
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 6942
    or-int/lit16 v0, v2, 0x100

    move v2, v0

    .line 6944
    :cond_c
    :goto_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v0

    if-lez v0, :cond_d

    .line 6945
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 6947
    :cond_d
    invoke-virtual {p1, v7}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6948
    .line 6951
    :cond_e
    :goto_6
    goto/16 :goto_0

    .line 6958
    :cond_f
    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_10

    .line 6959
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 6961
    :cond_10
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_11

    .line 6962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 6964
    :cond_11
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_12

    .line 6965
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 6967
    :cond_12
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_13

    .line 6968
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 6970
    :cond_13
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 6971
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->makeExtensionsImmutable()V

    .line 6972
    goto/16 :goto_7

    .line 6952
    :catch_0
    move-exception v4

    .line 6953
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 6954
    :catch_1
    move-exception v4

    .line 6955
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 6956
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6958
    :catchall_0
    move-exception v8

    and-int/lit8 v0, v2, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_14

    .line 6959
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 6961
    :cond_14
    and-int/lit8 v0, v2, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_15

    .line 6962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 6964
    :cond_15
    and-int/lit8 v0, v2, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_16

    .line 6965
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 6967
    :cond_16
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_17

    .line 6968
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 6970
    :cond_17
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 6971
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->makeExtensionsImmutable()V

    .line 6972
    throw v8

    .line 6973
    :goto_7
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
        0x30 -> :sswitch_7
        0x32 -> :sswitch_8
        0x38 -> :sswitch_9
        0x3a -> :sswitch_a
        0x40 -> :sswitch_b
        0x48 -> :sswitch_c
        0x4a -> :sswitch_d
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6784
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 6790
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 7194
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedIsInitialized:B

    .line 7237
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedSerializedSize:I

    .line 6791
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 6792
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 6784
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 6793
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 7194
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedIsInitialized:B

    .line 7237
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedSerializedSize:I

    .line 6793
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$10002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J
    .locals 0

    .line 6784
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    return-wide p1
.end method

.method static synthetic access$10100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;
    .locals 1

    .line 6784
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$10102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 6784
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$10200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;
    .locals 1

    .line 6784
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$10202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 6784
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$10300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;
    .locals 1

    .line 6784
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$10302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 6784
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$10402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J
    .locals 0

    .line 6784
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    return-wide p1
.end method

.method static synthetic access$10500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Ljava/util/List;
    .locals 1

    .line 6784
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$10502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 6784
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$10602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;I)I
    .locals 0

    .line 6784
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    return p1
.end method

.method static synthetic access$10700()Lcom/google/protobuf/Parser;
    .locals 1

    .line 6784
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method static synthetic access$9500()Z
    .locals 1

    .line 6784
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$9702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 0

    .line 6784
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object p1
.end method

.method static synthetic access$9802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J
    .locals 0

    .line 6784
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    return-wide p1
.end method

.method static synthetic access$9902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;J)J
    .locals 0

    .line 6784
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    return-wide p1
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1

    .line 6797
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 6976
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$9000()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 7184
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7185
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    .line 7186
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    .line 7187
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    .line 7188
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 7189
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 7190
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 7191
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    .line 7192
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 7193
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7364
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->access$9300()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7367
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7344
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7350
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 7314
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 7320
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7355
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7361
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7334
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7340
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 7324
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 7330
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method


# virtual methods
.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 7014
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 7020
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getCalories(I)I
    .locals 1

    .line 7112
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7113
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7115
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCaloriesCount()I
    .locals 1

    .line 7106
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getCaloriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7100
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;
    .locals 1

    .line 6801
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    return-object v0
.end method

.method public getDistances(I)I
    .locals 1

    .line 7137
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7138
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7140
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDistancesCount()I
    .locals 1

    .line 7131
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getDistancesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7125
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;>;"
        }
    .end annotation

    .line 6998
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 7239
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedSerializedSize:I

    .line 7240
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 7242
    :cond_0
    const/4 v3, 0x0

    .line 7243
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 7244
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 7245
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 7247
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 7248
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    .line 7249
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 7251
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 7252
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    .line 7253
    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 7255
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 7256
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    .line 7257
    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 7260
    :cond_4
    const/4 v4, 0x0

    .line 7261
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_5

    .line 7262
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    .line 7263
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 7261
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 7265
    :cond_5
    add-int/2addr v3, v4

    .line 7266
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getStepsList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 7269
    const/4 v4, 0x0

    .line 7270
    const/4 v5, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_6

    .line 7271
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    .line 7272
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 7270
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 7274
    :cond_6
    add-int/2addr v3, v4

    .line 7275
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getCaloriesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 7278
    const/4 v4, 0x0

    .line 7279
    const/4 v5, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_7

    .line 7280
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    .line 7281
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 7279
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 7283
    :cond_7
    add-int/2addr v3, v4

    .line 7284
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDistancesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 7286
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_8

    .line 7287
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    .line 7288
    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 7291
    :cond_8
    const/4 v4, 0x0

    .line 7292
    const/4 v5, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_9

    .line 7293
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    .line 7294
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 7292
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 7296
    :cond_9
    add-int/2addr v3, v4

    .line 7297
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getStoreysList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1

    add-int/2addr v3, v0

    .line 7299
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 7300
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedSerializedSize:I

    .line 7301
    return v3
.end method

.method public getSteps(I)I
    .locals 1

    .line 7087
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7088
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7090
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStepsCount()I
    .locals 1

    .line 7081
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getStepsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7075
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    return-object v0
.end method

.method public getStoreys(I)I
    .locals 1

    .line 7177
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 7178
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 7180
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStoreysCount()I
    .locals 1

    .line 7171
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getStoreysList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 7165
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    return-object v0
.end method

.method public getTotalCalories()J
    .locals 2

    .line 7065
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    return-wide v0
.end method

.method public getTotalDistance()J
    .locals 2

    .line 7050
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    return-wide v0
.end method

.method public getTotalSteps()J
    .locals 2

    .line 7035
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    return-wide v0
.end method

.method public getTotalStoreys()J
    .locals 2

    .line 7155
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    return-wide v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 6808
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 7008
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

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

.method public hasTotalCalories()Z
    .locals 2

    .line 7059
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 7044
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

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

.method public hasTotalSteps()Z
    .locals 2

    .line 7029
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

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

.method public hasTotalStoreys()Z
    .locals 2

    .line 7149
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 6981
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$9100()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 6982
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 6981
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 7196
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedIsInitialized:B

    .line 7197
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 7198
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 7200
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->memoizedIsInitialized:B

    .line 7201
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6784
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7365
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 2

    .line 7374
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 7375
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 6784
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 7369
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

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

    .line 7308
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

    .line 7206
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getSerializedSize()I

    .line 7207
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 7208
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 7210
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 7211
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalSteps_:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 7213
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 7214
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalDistance_:J

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 7216
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 7217
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalCalories_:J

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 7219
    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 7220
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->steps_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7219
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7222
    :cond_4
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 7223
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->calories_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7222
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 7225
    :cond_5
    const/4 v3, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 7226
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->distances_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7225
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 7228
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_7

    .line 7229
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->totalStoreys_:J

    const/16 v2, 0x8

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 7231
    :cond_7
    const/4 v3, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 7232
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->storeys_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7231
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 7234
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 7235
    return-void
.end method
