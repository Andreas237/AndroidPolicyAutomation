.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MotionPath"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    }
.end annotation


# static fields
.field public static final BASEHEALTHDATA_FIELD_NUMBER:I = 0x1

.field public static final ENDADDRESS_FIELD_NUMBER:I = 0x3

.field public static final HEARTRATELIST_FIELD_NUMBER:I = 0xf

.field public static final LBSDATALIST_FIELD_NUMBER:I = 0x4

.field public static final PACEMAP_FIELD_NUMBER:I = 0xe

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;>;"
        }
    .end annotation
.end field

.field public static final PARTTIMEMAP_FIELD_NUMBER:I = 0x10

.field public static final PATHIMAGEURI_FIELD_NUMBER:I = 0x9

.field public static final REALSTEPS_FIELD_NUMBER:I = 0xa

.field public static final REALSTOREYS_FIELD_NUMBER:I = 0xc

.field public static final RUNSTATE_FIELD_NUMBER:I = 0xd

.field public static final STARTADDRESS_FIELD_NUMBER:I = 0x2

.field public static final TOTALCALORIES_FIELD_NUMBER:I = 0x6

.field public static final TOTALDISTANCE_FIELD_NUMBER:I = 0x5

.field public static final TOTALSTEPS_FIELD_NUMBER:I = 0x7

.field public static final TOTALSTOREYS_FIELD_NUMBER:I = 0xb

.field public static final TOTALTIME_FIELD_NUMBER:I = 0x8

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private endAddress_:Ljava/lang/Object;

.field private heartrateList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;"
        }
    .end annotation
.end field

.field private lbsDataList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private paceMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;"
        }
    .end annotation
.end field

.field private partTimeMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;>;"
        }
    .end annotation
.end field

.field private pathImageURI_:Ljava/lang/Object;

.field private realSteps_:I

.field private realStoreys_:I

.field private runState_:I

.field private startAddress_:Ljava/lang/Object;

.field private totalCalories_:I

.field private totalDistance_:I

.field private totalSteps_:I

.field private totalStoreys_:I

.field private totalTime_:J

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 11495
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    .line 14161
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    .line 14162
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->initFields()V

    .line 14163
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 11336
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 11960
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedIsInitialized:B

    .line 12024
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedSerializedSize:I

    .line 11337
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->initFields()V

    .line 11338
    const/4 v2, 0x0

    .line 11340
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 11342
    const/4 v4, 0x0

    .line 11343
    :goto_0
    if-nez v4, :cond_7

    .line 11344
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 11345
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    .line 11347
    :sswitch_0
    const/4 v4, 0x1

    .line 11348
    goto/16 :goto_2

    .line 11350
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 11352
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 11357
    :sswitch_1
    const/4 v6, 0x0

    .line 11358
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 11359
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v6

    .line 11361
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 11362
    if-eqz v6, :cond_1

    .line 11363
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 11364
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 11366
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11367
    goto/16 :goto_2

    .line 11370
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 11371
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11372
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11373
    goto/16 :goto_2

    .line 11376
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 11377
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11378
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11379
    goto/16 :goto_2

    .line 11382
    :sswitch_4
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    .line 11383
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    .line 11384
    or-int/lit8 v0, v2, 0x8

    move v2, v0

    .line 11386
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->access$15700()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11387
    goto/16 :goto_2

    .line 11390
    :sswitch_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11391
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    .line 11392
    goto/16 :goto_2

    .line 11395
    :sswitch_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11396
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    .line 11397
    goto/16 :goto_2

    .line 11400
    :sswitch_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11401
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    .line 11402
    goto/16 :goto_2

    .line 11405
    :sswitch_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11406
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    .line 11407
    goto/16 :goto_2

    .line 11410
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 11411
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11412
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11413
    goto/16 :goto_2

    .line 11416
    :sswitch_a
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11417
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    .line 11418
    goto/16 :goto_2

    .line 11421
    :sswitch_b
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11422
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    .line 11423
    goto/16 :goto_2

    .line 11426
    :sswitch_c
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11427
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    .line 11428
    goto/16 :goto_2

    .line 11431
    :sswitch_d
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    .line 11432
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    .line 11433
    goto/16 :goto_2

    .line 11436
    :sswitch_e
    and-int/lit16 v0, v2, 0x2000

    const/16 v1, 0x2000

    if-eq v0, v1, :cond_3

    .line 11437
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    .line 11438
    or-int/lit16 v0, v2, 0x2000

    move v2, v0

    .line 11440
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->access$15800()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11441
    goto :goto_2

    .line 11444
    :sswitch_f
    and-int/lit16 v0, v2, 0x4000

    const/16 v1, 0x4000

    if-eq v0, v1, :cond_4

    .line 11445
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    .line 11446
    or-int/lit16 v0, v2, 0x4000

    move v2, v0

    .line 11448
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->access$15900()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11449
    goto :goto_2

    .line 11452
    :sswitch_10
    const v0, 0x8000

    and-int/2addr v0, v2

    const v1, 0x8000

    if-eq v0, v1, :cond_5

    .line 11453
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    .line 11454
    const v0, 0x8000

    or-int/2addr v0, v2

    move v2, v0

    .line 11456
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->access$16000()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11460
    :cond_6
    :goto_2
    goto/16 :goto_0

    .line 11467
    :cond_7
    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_8

    .line 11468
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    .line 11470
    :cond_8
    and-int/lit16 v0, v2, 0x2000

    const/16 v1, 0x2000

    if-ne v0, v1, :cond_9

    .line 11471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    .line 11473
    :cond_9
    and-int/lit16 v0, v2, 0x4000

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_a

    .line 11474
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    .line 11476
    :cond_a
    const v0, 0x8000

    and-int/2addr v0, v2

    const v1, 0x8000

    if-ne v0, v1, :cond_b

    .line 11477
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    .line 11479
    :cond_b
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 11480
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->makeExtensionsImmutable()V

    .line 11481
    goto/16 :goto_3

    .line 11461
    :catch_0
    move-exception v4

    .line 11462
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 11463
    :catch_1
    move-exception v4

    .line 11464
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 11465
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11467
    :catchall_0
    move-exception v7

    and-int/lit8 v0, v2, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_c

    .line 11468
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    .line 11470
    :cond_c
    and-int/lit16 v0, v2, 0x2000

    const/16 v1, 0x2000

    if-ne v0, v1, :cond_d

    .line 11471
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    .line 11473
    :cond_d
    and-int/lit16 v0, v2, 0x4000

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_e

    .line 11474
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    .line 11476
    :cond_e
    const v0, 0x8000

    and-int/2addr v0, v2

    const v1, 0x8000

    if-ne v0, v1, :cond_f

    .line 11477
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    .line 11479
    :cond_f
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 11480
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->makeExtensionsImmutable()V

    .line 11481
    throw v7

    .line 11482
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
        0x38 -> :sswitch_7
        0x40 -> :sswitch_8
        0x4a -> :sswitch_9
        0x50 -> :sswitch_a
        0x58 -> :sswitch_b
        0x60 -> :sswitch_c
        0x68 -> :sswitch_d
        0x72 -> :sswitch_e
        0x7a -> :sswitch_f
        0x82 -> :sswitch_10
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 11307
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 11313
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 11960
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedIsInitialized:B

    .line 12024
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedSerializedSize:I

    .line 11314
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 11315
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 11307
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 11316
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 11960
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedIsInitialized:B

    .line 12024
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedSerializedSize:I

    .line 11316
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$16600()Z
    .locals 1

    .line 11307
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$16802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object p1
.end method

.method static synthetic access$16900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$16902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$17000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$17002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$17102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$17202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    return p1
.end method

.method static synthetic access$17302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    return p1
.end method

.method static synthetic access$17402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    return p1
.end method

.method static synthetic access$17502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;J)J
    .locals 0

    .line 11307
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    return-wide p1
.end method

.method static synthetic access$17600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$17602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$17702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    return p1
.end method

.method static synthetic access$17802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    return p1
.end method

.method static synthetic access$17902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    return p1
.end method

.method static synthetic access$18002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    return p1
.end method

.method static synthetic access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$18102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$18202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;
    .locals 1

    .line 11307
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$18302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 11307
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$18402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I
    .locals 0

    .line 11307
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    return p1
.end method

.method static synthetic access$18500()Z
    .locals 1

    .line 11307
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$18600()Z
    .locals 1

    .line 11307
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$18700()Z
    .locals 1

    .line 11307
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$18800()Z
    .locals 1

    .line 11307
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$18900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 11307
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1

    .line 11320
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 11485
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$16100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 2

    .line 11943
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 11944
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11945
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11946
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    .line 11947
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    .line 11948
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    .line 11949
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    .line 11950
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    .line 11951
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11952
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    .line 11953
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    .line 11954
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    .line 11955
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    .line 11956
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    .line 11957
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    .line 11958
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    .line 11959
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12159
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->access$16400()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12162
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12139
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12145
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 12109
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 12115
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12150
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12156
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12129
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12135
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 12119
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 12125
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method


# virtual methods
.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 11523
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 11529
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1

    .line 11324
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    return-object v0
.end method

.method public getEndAddress()Ljava/lang/String;
    .locals 4

    .line 11586
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11587
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11588
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 11590
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 11592
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 11593
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11594
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11596
    :cond_1
    return-object v3
.end method

.method public getEndAddressBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 11604
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11605
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11606
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 11607
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 11609
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->endAddress_:Ljava/lang/Object;

    .line 11610
    return-object v2

    .line 11612
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getHeartrateList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1

    .line 11885
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11886
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11888
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public getHeartrateListCount()I
    .locals 1

    .line 11879
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getHeartrateListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;"
        }
    .end annotation

    .line 11866
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    return-object v0
.end method

.method public getHeartrateListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;
    .locals 1

    .line 11895
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11896
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11898
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;

    return-object v0
.end method

.method public getHeartrateListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;>;"
        }
    .end annotation

    .line 11873
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    return-object v0
.end method

.method public getLbsDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1

    .line 11641
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11642
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11644
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public getLbsDataListCount()I
    .locals 1

    .line 11635
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getLbsDataListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;>;"
        }
    .end annotation

    .line 11622
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    return-object v0
.end method

.method public getLbsDataListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;
    .locals 1

    .line 11651
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11652
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11654
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;

    return-object v0
.end method

.method public getLbsDataListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;>;"
        }
    .end annotation

    .line 11629
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    return-object v0
.end method

.method public getPaceMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1

    .line 11844
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11845
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11847
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public getPaceMapCount()I
    .locals 1

    .line 11838
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPaceMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;"
        }
    .end annotation

    .line 11825
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    return-object v0
.end method

.method public getPaceMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;
    .locals 1

    .line 11854
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11855
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11857
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;

    return-object v0
.end method

.method public getPaceMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;>;"
        }
    .end annotation

    .line 11832
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;>;"
        }
    .end annotation

    .line 11507
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getPartTimeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    .locals 1

    .line 11926
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11927
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11929
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    return-object v0
.end method

.method public getPartTimeMapCount()I
    .locals 1

    .line 11920
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPartTimeMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;>;"
        }
    .end annotation

    .line 11907
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    return-object v0
.end method

.method public getPartTimeMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;
    .locals 1

    .line 11936
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 11937
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 11939
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;

    return-object v0
.end method

.method public getPartTimeMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;>;"
        }
    .end annotation

    .line 11914
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    return-object v0
.end method

.method public getPathImageURI()Ljava/lang/String;
    .locals 4

    .line 11729
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11730
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11731
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 11733
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 11735
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 11736
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11737
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11739
    :cond_1
    return-object v3
.end method

.method public getPathImageURIBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 11747
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11748
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11749
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 11750
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 11752
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->pathImageURI_:Ljava/lang/Object;

    .line 11753
    return-object v2

    .line 11755
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getRealSteps()I
    .locals 1

    .line 11771
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    return v0
.end method

.method public getRealStoreys()I
    .locals 1

    .line 11801
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    return v0
.end method

.method public getRunState()I
    .locals 1

    .line 11816
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    return v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 12026
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedSerializedSize:I

    .line 12027
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    return v3

    .line 12029
    :cond_0
    const/4 v3, 0x0

    .line 12030
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 12031
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12032
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v3, v0, 0x0

    .line 12034
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 12035
    .line 12036
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getStartAddressBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12038
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 12039
    .line 12040
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getEndAddressBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12042
    :cond_3
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 12043
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    .line 12044
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12042
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 12046
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_5

    .line 12047
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    .line 12048
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12050
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    .line 12051
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    .line 12052
    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12054
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    .line 12055
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    .line 12056
    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12058
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_8

    .line 12059
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    .line 12060
    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    move-result v0

    add-int/2addr v3, v0

    .line 12062
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_9

    .line 12063
    .line 12064
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPathImageURIBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12066
    :cond_9
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_a

    .line 12067
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    .line 12068
    const/16 v1, 0xa

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12070
    :cond_a
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_b

    .line 12071
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    .line 12072
    const/16 v1, 0xb

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12074
    :cond_b
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_c

    .line 12075
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    .line 12076
    const/16 v1, 0xc

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12078
    :cond_c
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_d

    .line 12079
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    .line 12080
    const/16 v1, 0xd

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 12082
    :cond_d
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_e

    .line 12083
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    .line 12084
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xe

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12082
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 12086
    :cond_e
    const/4 v4, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_f

    .line 12087
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    .line 12088
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xf

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12086
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 12090
    :cond_f
    const/4 v4, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_10

    .line 12091
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    .line 12092
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x10

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v3, v0

    .line 12090
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 12094
    :cond_10
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v3, v0

    .line 12095
    iput v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedSerializedSize:I

    .line 12096
    return v3
.end method

.method public getStartAddress()Ljava/lang/String;
    .locals 4

    .line 11544
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11545
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11546
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 11548
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 11550
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 11551
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11552
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11554
    :cond_1
    return-object v3
.end method

.method public getStartAddressBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 11562
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11563
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 11564
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 11565
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 11567
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->startAddress_:Ljava/lang/Object;

    .line 11568
    return-object v2

    .line 11570
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getTotalCalories()I
    .locals 1

    .line 11684
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 11669
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 11699
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 11786
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    return v0
.end method

.method public getTotalTime()J
    .locals 2

    .line 11714
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    return-wide v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 11331
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 11517
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasEndAddress()Z
    .locals 2

    .line 11580
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasPathImageURI()Z
    .locals 2

    .line 11723
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasRealSteps()Z
    .locals 2

    .line 11765
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasRealStoreys()Z
    .locals 2

    .line 11795
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasRunState()Z
    .locals 2

    .line 11810
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasStartAddress()Z
    .locals 2

    .line 11538
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasTotalCalories()Z
    .locals 2

    .line 11678
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 11663
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasTotalSteps()Z
    .locals 2

    .line 11693
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

.method public hasTotalStoreys()Z
    .locals 2

    .line 11780
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasTotalTime()Z
    .locals 2

    .line 11708
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

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

    .line 11490
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$16200()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 11491
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 11490
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 11962
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedIsInitialized:B

    .line 11963
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 11964
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 11966
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->memoizedIsInitialized:B

    .line 11967
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 11307
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12160
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12169
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 12170
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 11307
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12164
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

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

    .line 12103
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

    .line 11972
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getSerializedSize()I

    .line 11973
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 11974
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 11976
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 11977
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getStartAddressBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 11979
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 11980
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getEndAddressBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 11982
    :cond_2
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 11983
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 11982
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11985
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 11986
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalDistance_:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 11988
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 11989
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalCalories_:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 11991
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 11992
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalSteps_:I

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 11994
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 11995
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalTime_:J

    const/16 v2, 0x8

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 11997
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 11998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPathImageURIBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 12000
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_9

    .line 12001
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realSteps_:I

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 12003
    :cond_9
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_a

    .line 12004
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->totalStoreys_:I

    const/16 v1, 0xb

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 12006
    :cond_a
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_b

    .line 12007
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->realStoreys_:I

    const/16 v1, 0xc

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 12009
    :cond_b
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_c

    .line 12010
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->runState_:I

    const/16 v1, 0xd

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 12012
    :cond_c
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_d

    .line 12013
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->paceMap_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xe

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 12012
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 12015
    :cond_d
    const/4 v3, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_e

    .line 12016
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0xf

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 12015
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 12018
    :cond_e
    const/4 v3, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_f

    .line 12019
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x10

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 12018
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 12021
    :cond_f
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 12022
    return-void
.end method
