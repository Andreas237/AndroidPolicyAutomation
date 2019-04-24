.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ECG"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    }
.end annotation


# static fields
.field public static final ANALYSISRESULTSUMMARY_FIELD_NUMBER:I = 0x5

.field public static final BASEHEALTHDATA_FIELD_NUMBER:I = 0x1

.field public static final CLOUDORDERID_FIELD_NUMBER:I = 0x7

.field public static final DOCTORDIAGNOSIS_FIELD_NUMBER:I = 0x6

.field public static final EVENTDATAMAP_FIELD_NUMBER:I = 0x9

.field public static final ORIGINALURL_FIELD_NUMBER:I = 0x2

.field public static final PARSEDFILEDATA_FIELD_NUMBER:I = 0x3

.field private static PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;>;"
        }
    .end annotation
.end field

.field public static final STATISTICSDATAMAP_FIELD_NUMBER:I = 0x8

.field public static final SUMMARY_FIELD_NUMBER:I = 0x4

.field private static final defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

.field private static final serialVersionUID:J = 0x0L


# instance fields
.field private analysisResultSummary_:Ljava/lang/Object;

.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private cloudOrderId_:Ljava/lang/Object;

.field private doctorDiagnosis_:Ljava/lang/Object;

.field private eventDataMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private originalUrl_:Ljava/lang/Object;

.field private parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

.field private statisticsDataMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation
.end field

.field private summary_:Ljava/lang/Object;

.field private final unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23624
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    .line 25542
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;-><init>(Z)V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    .line 25543
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->initFields()V

    .line 25544
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 23502
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 23986
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedIsInitialized:B

    .line 24029
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedSerializedSize:I

    .line 23503
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->initFields()V

    .line 23504
    const/4 v2, 0x0

    .line 23506
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->newBuilder()Lcom/google/protobuf/UnknownFieldSet$Builder;

    move-result-object v3

    .line 23508
    const/4 v4, 0x0

    .line 23509
    :goto_0
    if-nez v4, :cond_7

    .line 23510
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    .line 23511
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 23513
    :sswitch_0
    const/4 v4, 0x1

    .line 23514
    goto/16 :goto_2

    .line 23516
    :goto_1
    invoke-virtual {p0, p1, v3, p2, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 23518
    const/4 v4, 0x1

    goto/16 :goto_2

    .line 23523
    :sswitch_1
    const/4 v6, 0x0

    .line 23524
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23525
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v6

    .line 23527
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->access$2100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 23528
    if-eqz v6, :cond_1

    .line 23529
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    .line 23530
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 23532
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23533
    goto/16 :goto_2

    .line 23536
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 23537
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23538
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23539
    goto/16 :goto_2

    .line 23542
    :sswitch_3
    const/4 v6, 0x0

    .line 23543
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 23544
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v6

    .line 23546
    :cond_2
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->access$32900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 23547
    if-eqz v6, :cond_3

    .line 23548
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    .line 23549
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 23551
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23552
    goto/16 :goto_2

    .line 23555
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 23556
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23557
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23558
    goto/16 :goto_2

    .line 23561
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 23562
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23563
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23564
    goto/16 :goto_2

    .line 23567
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 23568
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23569
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23570
    goto :goto_2

    .line 23573
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    move-result-object v6

    .line 23574
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    .line 23575
    iput-object v6, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23576
    goto :goto_2

    .line 23579
    :sswitch_8
    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-eq v0, v1, :cond_4

    .line 23580
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    .line 23581
    or-int/lit16 v0, v2, 0x80

    move v2, v0

    .line 23583
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->access$33000()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23584
    goto :goto_2

    .line 23587
    :sswitch_9
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_5

    .line 23588
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    .line 23589
    or-int/lit16 v0, v2, 0x100

    move v2, v0

    .line 23591
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->access$33100()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23595
    :cond_6
    :goto_2
    goto/16 :goto_0

    .line 23602
    :cond_7
    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 23603
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    .line 23605
    :cond_8
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_9

    .line 23606
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    .line 23608
    :cond_9
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 23609
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->makeExtensionsImmutable()V

    .line 23610
    goto :goto_3

    .line 23596
    :catch_0
    move-exception v4

    .line 23597
    :try_start_1
    invoke-virtual {v4, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 23598
    :catch_1
    move-exception v4

    .line 23599
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 23600
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23602
    :catchall_0
    move-exception v7

    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_a

    .line 23603
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    .line 23605
    :cond_a
    and-int/lit16 v0, v2, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_b

    .line 23606
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    .line 23608
    :cond_b
    invoke-virtual {v3}, Lcom/google/protobuf/UnknownFieldSet$Builder;->build()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 23609
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->makeExtensionsImmutable()V

    .line 23610
    throw v7

    .line 23611
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
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
        0x4a -> :sswitch_9
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 23473
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessage$Builder<*>;)V"
        }
    .end annotation

    .line 23479
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 23986
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedIsInitialized:B

    .line 24029
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedSerializedSize:I

    .line 23480
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 23481
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 23473
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 23482
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 23986
    const/4 v0, -0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedIsInitialized:B

    .line 24029
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedSerializedSize:I

    .line 23482
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-void
.end method

.method static synthetic access$33700()Z
    .locals 1

    .line 23473
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$33902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object p1
.end method

.method static synthetic access$34000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$34002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$34102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object p1
.end method

.method static synthetic access$34200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$34202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$34300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$34302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$34400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$34402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$34500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$34502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$34602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;
    .locals 1

    .line 23473
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$34702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 23473
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$34802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;I)I
    .locals 0

    .line 23473
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    return p1
.end method

.method static synthetic access$34900()Z
    .locals 1

    .line 23473
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$35000()Z
    .locals 1

    .line 23473
    sget-boolean v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method static synthetic access$35100()Lcom/google/protobuf/Parser;
    .locals 1

    .line 23473
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1

    .line 23486
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 23614
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$33200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 23976
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 23977
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23978
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 23979
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23980
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23981
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23982
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23983
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    .line 23984
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    .line 23985
    return-void
.end method

.method public static newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24136
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->access$33500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24139
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24116
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24122
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 24086
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 24092
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24127
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24133
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24106
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24112
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 24096
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 24102
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method


# virtual methods
.method public getAnalysisResultSummary()Ljava/lang/String;
    .locals 4

    .line 23778
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23779
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23780
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 23782
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 23784
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 23785
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23786
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23788
    :cond_1
    return-object v3
.end method

.method public getAnalysisResultSummaryBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 23796
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23797
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23798
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 23799
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 23801
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->analysisResultSummary_:Ljava/lang/Object;

    .line 23802
    return-object v2

    .line 23804
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 23652
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 23658
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getCloudOrderId()Ljava/lang/String;
    .locals 4

    .line 23862
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23863
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23864
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 23866
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 23868
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 23869
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23870
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23872
    :cond_1
    return-object v3
.end method

.method public getCloudOrderIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 23880
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23881
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23882
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 23883
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 23885
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->cloudOrderId_:Ljava/lang/Object;

    .line 23886
    return-object v2

    .line 23888
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1

    .line 23490
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->defaultInstance:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    return-object v0
.end method

.method public getDoctorDiagnosis()Ljava/lang/String;
    .locals 4

    .line 23820
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23821
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23822
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 23824
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 23826
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 23827
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23828
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23830
    :cond_1
    return-object v3
.end method

.method public getDoctorDiagnosisBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 23838
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23839
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23840
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 23841
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 23843
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->doctorDiagnosis_:Ljava/lang/Object;

    .line 23844
    return-object v2

    .line 23846
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getEventDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1

    .line 23959
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 23960
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23962
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public getEventDataMapCount()I
    .locals 1

    .line 23952
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getEventDataMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation

    .line 23939
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    return-object v0
.end method

.method public getEventDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;
    .locals 1

    .line 23969
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 23970
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23972
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;

    return-object v0
.end method

.method public getEventDataMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;>;"
        }
    .end annotation

    .line 23946
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    return-object v0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 4

    .line 23673
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23674
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23675
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 23677
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 23679
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 23680
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23681
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23683
    :cond_1
    return-object v3
.end method

.method public getOriginalUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 23691
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23692
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23693
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 23694
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 23696
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->originalUrl_:Ljava/lang/Object;

    .line 23697
    return-object v2

    .line 23699
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1

    .line 23715
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public getParsedFileDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;
    .locals 1

    .line 23721
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;>;"
        }
    .end annotation

    .line 23636
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->PARSER:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 24031
    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedSerializedSize:I

    .line 24032
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    return v2

    .line 24034
    :cond_0
    const/4 v2, 0x0

    .line 24035
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 24036
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24037
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/lit8 v2, v0, 0x0

    .line 24039
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 24040
    .line 24041
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getOriginalUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24043
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 24044
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24045
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24047
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 24048
    .line 24049
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getSummaryBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24051
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    .line 24052
    .line 24053
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getAnalysisResultSummaryBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24055
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 24056
    .line 24057
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDoctorDiagnosisBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24059
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 24060
    .line 24061
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getCloudOrderIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24063
    :cond_7
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 24064
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    .line 24065
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x8

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24063
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 24067
    :cond_8
    const/4 v3, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_9

    .line 24068
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    .line 24069
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x9

    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    move-result v0

    add-int/2addr v2, v0

    .line 24067
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 24071
    :cond_9
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    move-result v0

    add-int/2addr v2, v0

    .line 24072
    iput v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedSerializedSize:I

    .line 24073
    return v2
.end method

.method public getStatisticsDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1

    .line 23917
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 23918
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23920
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public getStatisticsDataMapCount()I
    .locals 1

    .line 23911
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getStatisticsDataMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation

    .line 23898
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    return-object v0
.end method

.method public getStatisticsDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;
    .locals 1

    .line 23927
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 23928
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23930
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;

    return-object v0
.end method

.method public getStatisticsDataMapOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;>;"
        }
    .end annotation

    .line 23905
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 4

    .line 23736
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23737
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23738
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 23740
    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 23742
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 23743
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23744
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23746
    :cond_1
    return-object v3
.end method

.method public getSummaryBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 23754
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23755
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23756
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 23757
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 23759
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->summary_:Ljava/lang/Object;

    .line 23760
    return-object v2

    .line 23762
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 23497
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    return-object v0
.end method

.method public hasAnalysisResultSummary()Z
    .locals 2

    .line 23772
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasBaseHealthData()Z
    .locals 2

    .line 23646
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasCloudOrderId()Z
    .locals 2

    .line 23856
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasDoctorDiagnosis()Z
    .locals 2

    .line 23814
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasOriginalUrl()Z
    .locals 2

    .line 23667
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasParsedFileData()Z
    .locals 2

    .line 23709
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public hasSummary()Z
    .locals 2

    .line 23730
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 23619
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$33300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    .line 23620
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 23619
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 23988
    iget-byte v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedIsInitialized:B

    .line 23989
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 23990
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 23992
    :cond_1
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->memoizedIsInitialized:B

    .line 23993
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23473
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24137
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected newBuilderForType(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24146
    new-instance v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 24147
    return-object v1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 23473
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24141
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

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

    .line 24080
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

    .line 23998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getSerializedSize()I

    .line 23999
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 24000
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 24002
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 24003
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getOriginalUrlBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 24005
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 24006
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 24008
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 24009
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getSummaryBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 24011
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 24012
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getAnalysisResultSummaryBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 24014
    :cond_4
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 24015
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDoctorDiagnosisBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 24017
    :cond_5
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 24018
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getCloudOrderIdBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 24020
    :cond_6
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 24021
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 24020
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 24023
    :cond_7
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 24024
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageLite;

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 24023
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 24026
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 24027
    return-void
.end method
