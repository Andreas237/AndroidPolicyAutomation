.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;"
    }
.end annotation


# instance fields
.field private analysisResultSummary_:Ljava/lang/Object;

.field private baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private cloudOrderId_:Ljava/lang/Object;

.field private doctorDiagnosis_:Ljava/lang/Object;

.field private eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;>;"
        }
    .end annotation
.end field

.field private eventDataMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation
.end field

.field private originalUrl_:Ljava/lang/Object;

.field private parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;>;"
        }
    .end annotation
.end field

.field private parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

.field private statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;>;"
        }
    .end annotation
.end field

.field private statisticsDataMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation
.end field

.field private summary_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 24169
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 24434
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24550
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24626
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24742
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24818
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24894
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24970
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25046
    .line 25047
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 25292
    .line 25293
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24170
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->maybeForceBuilderInitialization()V

    .line 24171
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 24175
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 24434
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24550
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24626
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24742
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24818
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24894
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24970
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25046
    .line 25047
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 25292
    .line 25293
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24176
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->maybeForceBuilderInitialization()V

    .line 24177
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 24152
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$33500()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24152
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24187
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;-><init>()V

    return-object v0
.end method

.method private ensureEventDataMapIsMutable()V
    .locals 2

    .line 25295
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-eq v0, v1, :cond_0

    .line 25296
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 25297
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25299
    :cond_0
    return-void
.end method

.method private ensureStatisticsDataMapIsMutable()V
    .locals 2

    .line 25049
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    .line 25050
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 25051
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25053
    :cond_0
    return-void
.end method

.method private getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation

    .line 24539
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24540
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 24542
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 24543
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 24544
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 24545
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24547
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 24158
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$33200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;>;"
        }
    .end annotation

    .line 25526
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25527
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 25531
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 25532
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25533
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 25535
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private getParsedFileDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;>;"
        }
    .end annotation

    .line 24731
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24732
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 24734
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v1

    .line 24735
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 24736
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 24737
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24739
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;>;"
        }
    .end annotation

    .line 25280
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25281
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x80

    const/16 v3, 0x80

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 25285
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 25286
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25287
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 25289
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 24179
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$33700()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24180
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24181
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParsedFileDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24182
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24183
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24185
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEventDataMap(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;"
        }
    .end annotation

    .line 25434
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25435
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25436
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 25438
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25440
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25442
    :goto_0
    return-object p0
.end method

.method public addAllStatisticsDataMap(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;"
        }
    .end annotation

    .line 25188
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25189
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25190
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 25192
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25194
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25196
    :goto_0
    return-object p0
.end method

.method public addEventDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25420
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25421
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25422
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 25423
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25425
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25427
    :goto_0
    return-object p0
.end method

.method public addEventDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25389
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25390
    if-nez p2, :cond_0

    .line 25391
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25393
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25394
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 25395
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25397
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25399
    :goto_0
    return-object p0
.end method

.method public addEventDataMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25406
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25407
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25408
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25409
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25411
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25413
    :goto_0
    return-object p0
.end method

.method public addEventDataMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25372
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25373
    if-nez p1, :cond_0

    .line 25374
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25376
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25377
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25378
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25380
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25382
    :goto_0
    return-object p0
.end method

.method public addEventDataMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 25505
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 25506
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    .line 25505
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    return-object v0
.end method

.method public addEventDataMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 2

    .line 25513
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 25514
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    .line 25513
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    return-object v0
.end method

.method public addStatisticsDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25174
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25175
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25176
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 25177
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25179
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25181
    :goto_0
    return-object p0
.end method

.method public addStatisticsDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25143
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25144
    if-nez p2, :cond_0

    .line 25145
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25147
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25148
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 25149
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25151
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25153
    :goto_0
    return-object p0
.end method

.method public addStatisticsDataMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25160
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25161
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25162
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25163
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25165
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25167
    :goto_0
    return-object p0
.end method

.method public addStatisticsDataMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25126
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25127
    if-nez p1, :cond_0

    .line 25128
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25130
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25131
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25132
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25134
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25136
    :goto_0
    return-object p0
.end method

.method public addStatisticsDataMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 25259
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 25260
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    .line 25259
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    return-object v0
.end method

.method public addStatisticsDataMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 2

    .line 25267
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 25268
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    .line 25267
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 2

    .line 24243
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v1

    .line 24244
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 24245
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 24247
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 5

    .line 24251
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 24252
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24253
    const/4 v4, 0x0

    .line 24254
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 24255
    const/4 v4, 0x1

    .line 24257
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24258
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$33902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 24260
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$33902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24262
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 24263
    or-int/lit8 v4, v4, 0x2

    .line 24265
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24266
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 24267
    or-int/lit8 v4, v4, 0x4

    .line 24269
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_4

    .line 24270
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    goto :goto_1

    .line 24272
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24274
    :goto_1
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_5

    .line 24275
    or-int/lit8 v4, v4, 0x8

    .line 24277
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24278
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    .line 24279
    or-int/lit8 v4, v4, 0x10

    .line 24281
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24282
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    .line 24283
    or-int/lit8 v4, v4, 0x20

    .line 24285
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24286
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_8

    .line 24287
    or-int/lit8 v4, v4, 0x40

    .line 24289
    :cond_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24290
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_a

    .line 24291
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_9

    .line 24292
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 24293
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24295
    :cond_9
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;

    goto :goto_2

    .line 24297
    :cond_a
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;

    .line 24299
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_c

    .line 24300
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_b

    .line 24301
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24302
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24304
    :cond_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;

    goto :goto_3

    .line 24306
    :cond_c
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;Ljava/util/List;)Ljava/util/List;

    .line 24308
    :goto_3
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;I)I

    .line 24309
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onBuilt()V

    .line 24310
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24191
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 24192
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24193
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 24195
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24197
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24198
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24199
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24200
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24201
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    goto :goto_1

    .line 24203
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24205
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24206
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24207
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24208
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24209
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24210
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24211
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24212
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 24213
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24214
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 24215
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 24216
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    goto :goto_2

    .line 24218
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 24220
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_3

    .line 24221
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24222
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    goto :goto_3

    .line 24224
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 24226
    :goto_3
    return-object p0
.end method

.method public clearAnalysisResultSummary()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24875
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24876
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getAnalysisResultSummary()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24877
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24878
    return-object p0
.end method

.method public clearBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24506
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24507
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24508
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24510
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24512
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24513
    return-object p0
.end method

.method public clearCloudOrderId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25027
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25028
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getCloudOrderId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25029
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 25030
    return-object p0
.end method

.method public clearDoctorDiagnosis()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24951
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24952
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDoctorDiagnosis()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24953
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24954
    return-object p0
.end method

.method public clearEventDataMap()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25448
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25449
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 25450
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25451
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25453
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 25455
    :goto_0
    return-object p0
.end method

.method public clearOriginalUrl()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24607
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24608
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24609
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24610
    return-object p0
.end method

.method public clearParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24698
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24699
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24700
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24702
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 24704
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24705
    return-object p0
.end method

.method public clearStatisticsDataMap()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25202
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25203
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 25204
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25205
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25207
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 25209
    :goto_0
    return-object p0
.end method

.method public clearSummary()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24799
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24800
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getSummary()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24801
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24802
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24230
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAnalysisResultSummary()Ljava/lang/String;
    .locals 4

    .line 24829
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24830
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24831
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 24833
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 24834
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24835
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24837
    :cond_0
    return-object v3

    .line 24839
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAnalysisResultSummaryBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 24847
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24848
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24849
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 24850
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 24852
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24853
    return-object v2

    .line 24855
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 24447
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24448
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0

    .line 24450
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 24519
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24520
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24521
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 24527
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 24528
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;

    return-object v0

    .line 24530
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getCloudOrderId()Ljava/lang/String;
    .locals 4

    .line 24981
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 24982
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24983
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 24985
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 24986
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24987
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 24989
    :cond_0
    return-object v3

    .line 24991
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCloudOrderIdBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 24999
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25000
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 25001
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 25002
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 25004
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25005
    return-object v2

    .line 25007
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 24152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    .locals 1

    .line 24239
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 24235
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$33200()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDoctorDiagnosis()Ljava/lang/String;
    .locals 4

    .line 24905
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24906
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24907
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 24909
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 24910
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24911
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24913
    :cond_0
    return-object v3

    .line 24915
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDoctorDiagnosisBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 24923
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24924
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24925
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 24926
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 24928
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24929
    return-object v2

    .line 24931
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getEventDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
    .locals 1

    .line 25328
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 25329
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25330
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25332
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0

    .line 25334
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    return-object v0
.end method

.method public getEventDataMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;
    .locals 1

    .line 25475
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;

    return-object v0
.end method

.method public getEventDataMapBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;>;"
        }
    .end annotation

    .line 25521
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEventDataMapCount()I
    .locals 1

    .line 25318
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25319
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 25321
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 25308
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25309
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 25311
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEventDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;
    .locals 1

    .line 25482
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 25483
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25484
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25486
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;

    return-object v0

    .line 25487
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 25495
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 25496
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 25498
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 4

    .line 24561
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24562
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24563
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 24565
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 24566
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24567
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24569
    :cond_0
    return-object v3

    .line 24571
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 24579
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24580
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24581
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 24582
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 24584
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24585
    return-object v2

    .line 24587
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
    .locals 1

    .line 24639
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24640
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0

    .line 24642
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public getParsedFileDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;
    .locals 2

    .line 24711
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24712
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24713
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getParsedFileDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    return-object v0
.end method

.method public getParsedFileDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;
    .locals 1

    .line 24719
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 24720
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;

    return-object v0

    .line 24722
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    return-object v0
.end method

.method public getStatisticsDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
    .locals 1

    .line 25082
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 25083
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25084
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25086
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0

    .line 25088
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    return-object v0
.end method

.method public getStatisticsDataMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;
    .locals 1

    .line 25229
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;

    return-object v0
.end method

.method public getStatisticsDataMapBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;>;"
        }
    .end annotation

    .line 25275
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStatisticsDataMapCount()I
    .locals 1

    .line 25072
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25073
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 25075
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 25062
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25063
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 25065
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStatisticsDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;
    .locals 1

    .line 25236
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 25237
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 25238
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25240
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;

    return-object v0

    .line 25241
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 25249
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 25250
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 25252
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 4

    .line 24753
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24754
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24755
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 24757
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 24758
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24759
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24761
    :cond_0
    return-object v3

    .line 24763
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSummaryBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 24771
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24772
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24773
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 24774
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 24776
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24777
    return-object v2

    .line 24779
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasAnalysisResultSummary()Z
    .locals 2

    .line 24823
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24441
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24975
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24899
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24555
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24633
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24747
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

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

    .line 24163
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$33300()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    .line 24164
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 24163
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 24412
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24487
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24488
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24489
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 24490
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24491
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 24493
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24495
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_1

    .line 24497
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24499
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24500
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24152
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24152
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24152
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 24152
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24152
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24419
    const/4 v1, 0x0

    .line 24421
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$35100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 24426
    if-eqz v1, :cond_1

    .line 24427
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    goto :goto_0

    .line 24422
    :catch_0
    move-exception v2

    .line 24423
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-object v1, v0

    .line 24424
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24426
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 24427
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    .line 24429
    :cond_0
    throw v3

    .line 24430
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 24314
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    if-eqz v0, :cond_0

    .line 24315
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    move-result-object v0

    return-object v0

    .line 24317
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 24318
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24323
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 24324
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasBaseHealthData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24325
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    .line 24327
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasOriginalUrl()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 24328
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24329
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24330
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24332
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasParsedFileData()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 24333
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeParsedFileData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;

    .line 24335
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasSummary()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 24336
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24337
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24338
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24340
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasAnalysisResultSummary()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 24341
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24342
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24343
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24345
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasDoctorDiagnosis()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 24346
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24347
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24348
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24350
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->hasCloudOrderId()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 24351
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24352
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34500(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 24353
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24355
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_9

    .line 24356
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 24357
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 24358
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 24359
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    goto :goto_0

    .line 24361
    :cond_8
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 24362
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24364
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_2

    .line 24367
    :cond_9
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 24368
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 24369
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 24370
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24371
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    .line 24372
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24373
    .line 24374
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34900()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 24375
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getStatisticsDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_a
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 24377
    :cond_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24381
    :cond_c
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_e

    .line 24382
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 24383
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 24384
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24385
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    goto :goto_3

    .line 24387
    :cond_d
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 24388
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24390
    :goto_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_5

    .line 24393
    :cond_e
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 24394
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 24395
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 24396
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24397
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    .line 24398
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24399
    .line 24400
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$35000()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 24401
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->getEventDataMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_4

    :cond_f
    const/4 v0, 0x0

    :goto_4
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_5

    .line 24403
    :cond_10
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->access$34700(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 24407
    :cond_11
    :goto_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 24408
    return-object p0
.end method

.method public mergeParsedFileData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24679
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24680
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24681
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 24682
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24683
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    goto :goto_0

    .line 24685
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24687
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_1

    .line 24689
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24691
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24692
    return-object p0
.end method

.method public removeEventDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25461
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25462
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25463
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 25464
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25466
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 25468
    :goto_0
    return-object p0
.end method

.method public removeStatisticsDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25215
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25216
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25217
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 25218
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25220
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 25222
    :goto_0
    return-object p0
.end method

.method public setAnalysisResultSummary(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24863
    if-nez p1, :cond_0

    .line 24864
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24866
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24867
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24868
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24869
    return-object p0
.end method

.method public setAnalysisResultSummaryBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24885
    if-nez p1, :cond_0

    .line 24886
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24888
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24889
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->analysisResultSummary_:Ljava/lang/Object;

    .line 24890
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24891
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24474
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24475
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24476
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24478
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24480
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24481
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24457
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24458
    if-nez p1, :cond_0

    .line 24459
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24461
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 24462
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24464
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24466
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24467
    return-object p0
.end method

.method public setCloudOrderId(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25015
    if-nez p1, :cond_0

    .line 25016
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25018
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25019
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25020
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 25021
    return-object p0
.end method

.method public setCloudOrderIdBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25037
    if-nez p1, :cond_0

    .line 25038
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25040
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 25041
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->cloudOrderId_:Ljava/lang/Object;

    .line 25042
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 25043
    return-object p0
.end method

.method public setDoctorDiagnosis(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24939
    if-nez p1, :cond_0

    .line 24940
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24942
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24943
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24944
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24945
    return-object p0
.end method

.method public setDoctorDiagnosisBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24961
    if-nez p1, :cond_0

    .line 24962
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24964
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24965
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->doctorDiagnosis_:Ljava/lang/Object;

    .line 24966
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24967
    return-object p0
.end method

.method public setEventDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25359
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25360
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25361
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 25362
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25364
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25366
    :goto_0
    return-object p0
.end method

.method public setEventDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25342
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25343
    if-nez p2, :cond_0

    .line 25344
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25346
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureEventDataMapIsMutable()V

    .line 25347
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 25348
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25350
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->eventDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25352
    :goto_0
    return-object p0
.end method

.method public setOriginalUrl(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24595
    if-nez p1, :cond_0

    .line 24596
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24598
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24599
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24600
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24601
    return-object p0
.end method

.method public setOriginalUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24617
    if-nez p1, :cond_0

    .line 24618
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24620
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24621
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->originalUrl_:Ljava/lang/Object;

    .line 24622
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24623
    return-object p0
.end method

.method public setParsedFileData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24666
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 24667
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24668
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24670
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24672
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24673
    return-object p0
.end method

.method public setParsedFileData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24649
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 24650
    if-nez p1, :cond_0

    .line 24651
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24653
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;

    .line 24654
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 24656
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->parsedFileDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 24658
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24659
    return-object p0
.end method

.method public setStatisticsDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 25113
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 25114
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 25116
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25118
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25120
    :goto_0
    return-object p0
.end method

.method public setStatisticsDataMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 1

    .line 25096
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 25097
    if-nez p2, :cond_0

    .line 25098
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 25100
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->ensureStatisticsDataMapIsMutable()V

    .line 25101
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 25102
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    goto :goto_0

    .line 25104
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->statisticsDataMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 25106
    :goto_0
    return-object p0
.end method

.method public setSummary(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24787
    if-nez p1, :cond_0

    .line 24788
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24790
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24791
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24792
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24793
    return-object p0
.end method

.method public setSummaryBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;
    .locals 2

    .line 24809
    if-nez p1, :cond_0

    .line 24810
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 24812
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->bitField0_:I

    .line 24813
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->summary_:Ljava/lang/Object;

    .line 24814
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECG$Builder;->onChanged()V

    .line 24815
    return-object p0
.end method
