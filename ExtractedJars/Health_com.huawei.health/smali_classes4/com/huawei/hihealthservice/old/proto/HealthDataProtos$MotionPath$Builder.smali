.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathOrBuilder;"
    }
.end annotation


# instance fields
.field private baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

.field private bitField0_:I

.field private endAddress_:Ljava/lang/Object;

.field private heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private heartrateList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;"
        }
    .end annotation
.end field

.field private lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;>;"
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

.field private paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;>;"
        }
    .end annotation
.end field

.field private paceMap_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;"
        }
    .end annotation
.end field

.field private partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;>;"
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


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 12192
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 12573
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12689
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12765
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12841
    .line 12842
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 13215
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13419
    .line 13420
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 13665
    .line 13666
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 13911
    .line 13912
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12193
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->maybeForceBuilderInitialization()V

    .line 12194
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 12198
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 12573
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12689
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12765
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12841
    .line 12842
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 13215
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13419
    .line 13420
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 13665
    .line 13666
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 13911
    .line 13912
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12199
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->maybeForceBuilderInitialization()V

    .line 12200
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 12175
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$16400()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12175
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12211
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;-><init>()V

    return-object v0
.end method

.method private ensureHeartrateListIsMutable()V
    .locals 2

    .line 13668
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x4000

    const/16 v1, 0x4000

    if-eq v0, v1, :cond_0

    .line 13669
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 13670
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13672
    :cond_0
    return-void
.end method

.method private ensureLbsDataListIsMutable()V
    .locals 2

    .line 12844
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 12845
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12846
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12848
    :cond_0
    return-void
.end method

.method private ensurePaceMapIsMutable()V
    .locals 2

    .line 13422
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x2000

    const/16 v1, 0x2000

    if-eq v0, v1, :cond_0

    .line 13423
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 13424
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13426
    :cond_0
    return-void
.end method

.method private ensurePartTimeMapIsMutable()V
    .locals 2

    .line 13914
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, 0x8000

    and-int/2addr v0, v1

    const v1, 0x8000

    if-eq v0, v1, :cond_0

    .line 13915
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 13916
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13918
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

    .line 12678
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 12679
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 12681
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    .line 12682
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 12683
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 12684
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12686
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 12181
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$16100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;>;"
        }
    .end annotation

    .line 13899
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13900
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x4000

    const/16 v3, 0x4000

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 13904
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 13905
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13906
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 13908
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;>;"
        }
    .end annotation

    .line 13075
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13076
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 13080
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 13081
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13082
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 13084
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;>;"
        }
    .end annotation

    .line 13653
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13654
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x2000

    const/16 v3, 0x2000

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 13658
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 13659
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13660
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 13662
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;>;"
        }
    .end annotation

    .line 14145
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 14146
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v3, 0x8000

    and-int/2addr v2, v3

    const v3, 0x8000

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 14150
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 14151
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14152
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 14154
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 12202
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$16600()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12203
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 12204
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12205
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12206
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12207
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12209
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllHeartrateList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;"
        }
    .end annotation

    .line 13807
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13808
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13809
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 13811
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13813
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13815
    :goto_0
    return-object p0
.end method

.method public addAllLbsDataList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;"
        }
    .end annotation

    .line 12983
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12984
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12985
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 12987
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12989
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12991
    :goto_0
    return-object p0
.end method

.method public addAllPaceMap(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;"
        }
    .end annotation

    .line 13561
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13562
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13563
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 13565
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13567
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13569
    :goto_0
    return-object p0
.end method

.method public addAllPartTimeMap(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;"
        }
    .end annotation

    .line 14053
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 14054
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 14055
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 14057
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14059
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14061
    :goto_0
    return-object p0
.end method

.method public addHeartrateList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13793
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13794
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13795
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13796
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13798
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13800
    :goto_0
    return-object p0
.end method

.method public addHeartrateList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13762
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13763
    if-nez p2, :cond_0

    .line 13764
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13766
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13767
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13768
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13770
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13772
    :goto_0
    return-object p0
.end method

.method public addHeartrateList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13779
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13780
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13781
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13782
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13784
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13786
    :goto_0
    return-object p0
.end method

.method public addHeartrateList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13745
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13746
    if-nez p1, :cond_0

    .line 13747
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13749
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13750
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13751
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13753
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13755
    :goto_0
    return-object p0
.end method

.method public addHeartrateListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 13878
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13879
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    .line 13878
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    return-object v0
.end method

.method public addHeartrateListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 2

    .line 13886
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13887
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    .line 13886
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    return-object v0
.end method

.method public addLbsDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12969
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12970
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12971
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 12972
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12974
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12976
    :goto_0
    return-object p0
.end method

.method public addLbsDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12938
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 12939
    if-nez p2, :cond_0

    .line 12940
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12942
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12943
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 12944
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12946
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12948
    :goto_0
    return-object p0
.end method

.method public addLbsDataList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12955
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12956
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12957
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12958
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12960
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12962
    :goto_0
    return-object p0
.end method

.method public addLbsDataList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12921
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 12922
    if-nez p1, :cond_0

    .line 12923
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12925
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12926
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12927
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12929
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12931
    :goto_0
    return-object p0
.end method

.method public addLbsDataListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 2

    .line 13054
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13055
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    .line 13054
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    return-object v0
.end method

.method public addLbsDataListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 2

    .line 13062
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13063
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    .line 13062
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    return-object v0
.end method

.method public addPaceMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13547
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13548
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13549
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13550
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13552
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13554
    :goto_0
    return-object p0
.end method

.method public addPaceMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13516
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13517
    if-nez p2, :cond_0

    .line 13518
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13520
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13521
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13522
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13524
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13526
    :goto_0
    return-object p0
.end method

.method public addPaceMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13533
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13534
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13535
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13536
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13538
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13540
    :goto_0
    return-object p0
.end method

.method public addPaceMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13499
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13500
    if-nez p1, :cond_0

    .line 13501
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13503
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13504
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13505
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13507
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13509
    :goto_0
    return-object p0
.end method

.method public addPaceMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 13632
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13633
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    .line 13632
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    return-object v0
.end method

.method public addPaceMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 2

    .line 13640
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 13641
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    .line 13640
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    return-object v0
.end method

.method public addPartTimeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 14039
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 14040
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 14041
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14042
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14044
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14046
    :goto_0
    return-object p0
.end method

.method public addPartTimeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 14008
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 14009
    if-nez p2, :cond_0

    .line 14010
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 14012
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 14013
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14014
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14016
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14018
    :goto_0
    return-object p0
.end method

.method public addPartTimeMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 14025
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 14026
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 14027
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14028
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14030
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14032
    :goto_0
    return-object p0
.end method

.method public addPartTimeMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13991
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13992
    if-nez p1, :cond_0

    .line 13993
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13995
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 13996
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13997
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13999
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 14001
    :goto_0
    return-object p0
.end method

.method public addPartTimeMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 14124
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 14125
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    .line 14124
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    return-object v0
.end method

.method public addPartTimeMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 2

    .line 14132
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 14133
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    .line 14132
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 2

    .line 12285
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v1

    .line 12286
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 12287
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 12289
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 5

    .line 12293
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 12294
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12295
    const/4 v4, 0x0

    .line 12296
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 12297
    const/4 v4, 0x1

    .line 12299
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 12300
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$16802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 12302
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$16802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12304
    :goto_0
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 12305
    or-int/lit8 v4, v4, 0x2

    .line 12307
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$16902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12308
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 12309
    or-int/lit8 v4, v4, 0x4

    .line 12311
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12312
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_5

    .line 12313
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    .line 12314
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12315
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12317
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 12319
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    .line 12321
    :goto_1
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    .line 12322
    or-int/lit8 v4, v4, 0x8

    .line 12324
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalDistance_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12325
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    .line 12326
    or-int/lit8 v4, v4, 0x10

    .line 12328
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalCalories_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12329
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_8

    .line 12330
    or-int/lit8 v4, v4, 0x20

    .line 12332
    :cond_8
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalSteps_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12333
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_9

    .line 12334
    or-int/lit8 v4, v4, 0x40

    .line 12336
    :cond_9
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalTime_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;J)J

    .line 12337
    and-int/lit16 v0, v3, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_a

    .line 12338
    or-int/lit16 v4, v4, 0x80

    .line 12340
    :cond_a
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12341
    and-int/lit16 v0, v3, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_b

    .line 12342
    or-int/lit16 v4, v4, 0x100

    .line 12344
    :cond_b
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realSteps_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12345
    and-int/lit16 v0, v3, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_c

    .line 12346
    or-int/lit16 v4, v4, 0x200

    .line 12348
    :cond_c
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalStoreys_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12349
    and-int/lit16 v0, v3, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_d

    .line 12350
    or-int/lit16 v4, v4, 0x400

    .line 12352
    :cond_d
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realStoreys_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12353
    and-int/lit16 v0, v3, 0x1000

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_e

    .line 12354
    or-int/lit16 v4, v4, 0x800

    .line 12356
    :cond_e
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->runState_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12357
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_10

    .line 12358
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x2000

    const/16 v1, 0x2000

    if-ne v0, v1, :cond_f

    .line 12359
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 12360
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12362
    :cond_f
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    goto :goto_2

    .line 12364
    :cond_10
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    .line 12366
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_12

    .line 12367
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x4000

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_11

    .line 12368
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 12369
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12371
    :cond_11
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    goto :goto_3

    .line 12373
    :cond_12
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    .line 12375
    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_14

    .line 12376
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, 0x8000

    and-int/2addr v0, v1

    const v1, 0x8000

    if-ne v0, v1, :cond_13

    .line 12377
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12378
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12380
    :cond_13
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    goto :goto_4

    .line 12382
    :cond_14
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Ljava/util/List;)Ljava/util/List;

    .line 12384
    :goto_4
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;I)I

    .line 12385
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onBuilt()V

    .line 12386
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12215
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 12216
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 12217
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 12219
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 12221
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12222
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12223
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12224
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12225
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12226
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 12227
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12228
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_1

    .line 12230
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 12232
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalDistance_:I

    .line 12233
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12234
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalCalories_:I

    .line 12235
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12236
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalSteps_:I

    .line 12237
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12238
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalTime_:J

    .line 12239
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12240
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 12241
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12242
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realSteps_:I

    .line 12243
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12244
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalStoreys_:I

    .line 12245
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12246
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realStoreys_:I

    .line 12247
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12248
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->runState_:I

    .line 12249
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12250
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 12251
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 12252
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_2

    .line 12254
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 12256
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_3

    .line 12257
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 12258
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_3

    .line 12260
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 12262
    :goto_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_4

    .line 12263
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12264
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_4

    .line 12266
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 12268
    :goto_4
    return-object p0
.end method

.method public clearBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12645
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 12646
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12647
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12649
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 12651
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12652
    return-object p0
.end method

.method public clearEndAddress()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12822
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12823
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getEndAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12824
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12825
    return-object p0
.end method

.method public clearHeartrateList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13821
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13822
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 13823
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13824
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13826
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 13828
    :goto_0
    return-object p0
.end method

.method public clearLbsDataList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12997
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12998
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12999
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13000
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13002
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 13004
    :goto_0
    return-object p0
.end method

.method public clearPaceMap()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13575
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13576
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 13577
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13578
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13580
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 13582
    :goto_0
    return-object p0
.end method

.method public clearPartTimeMap()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 14067
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 14068
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 14069
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 14070
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14072
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 14074
    :goto_0
    return-object p0
.end method

.method public clearPathImageURI()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13272
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13273
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPathImageURI()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13274
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13275
    return-object p0
.end method

.method public clearRealSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13317
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13318
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realSteps_:I

    .line 13319
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13320
    return-object p0
.end method

.method public clearRealStoreys()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13381
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13382
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realStoreys_:I

    .line 13383
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13384
    return-object p0
.end method

.method public clearRunState()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13413
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13414
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->runState_:I

    .line 13415
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13416
    return-object p0
.end method

.method public clearStartAddress()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12746
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12747
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getStartAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12748
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12749
    return-object p0
.end method

.method public clearTotalCalories()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13145
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13146
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalCalories_:I

    .line 13147
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13148
    return-object p0
.end method

.method public clearTotalDistance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13113
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalDistance_:I

    .line 13115
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13116
    return-object p0
.end method

.method public clearTotalSteps()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13177
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13178
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalSteps_:I

    .line 13179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13180
    return-object p0
.end method

.method public clearTotalStoreys()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13349
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13350
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalStoreys_:I

    .line 13351
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13352
    return-object p0
.end method

.method public clearTotalTime()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13209
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13210
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalTime_:J

    .line 13211
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13212
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12272
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

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

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
    .locals 1

    .line 12586
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 12587
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0

    .line 12589
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;
    .locals 2

    .line 12658
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12659
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12660
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getBaseHealthDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    return-object v0
.end method

.method public getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
    .locals 1

    .line 12666
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 12667
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;

    return-object v0

    .line 12669
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 12175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    .locals 1

    .line 12281
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 12277
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$16100()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getEndAddress()Ljava/lang/String;
    .locals 4

    .line 12776
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12777
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 12778
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 12780
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 12781
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12782
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12784
    :cond_0
    return-object v3

    .line 12786
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getEndAddressBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 12794
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12795
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 12796
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 12797
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 12799
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12800
    return-object v2

    .line 12802
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getHeartrateList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;
    .locals 1

    .line 13701
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13702
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13703
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13705
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0

    .line 13707
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    return-object v0
.end method

.method public getHeartrateListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;
    .locals 1

    .line 13848
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    return-object v0
.end method

.method public getHeartrateListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;>;"
        }
    .end annotation

    .line 13894
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHeartrateListCount()I
    .locals 1

    .line 13691
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13692
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 13694
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 13681
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13682
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13684
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHeartrateListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;
    .locals 1

    .line 13855
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13856
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13857
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13859
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateDataOrBuilder;

    return-object v0

    .line 13860
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 13868
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 13869
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13871
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLbsDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;
    .locals 1

    .line 12877
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 12878
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 12879
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 12881
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0

    .line 12883
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    return-object v0
.end method

.method public getLbsDataListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;
    .locals 1

    .line 13024
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    return-object v0
.end method

.method public getLbsDataListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;>;"
        }
    .end annotation

    .line 13070
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLbsDataListCount()I
    .locals 1

    .line 12867
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12868
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 12870
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 12857
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12858
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 12860
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLbsDataListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;
    .locals 1

    .line 13031
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13032
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13033
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13035
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointDataOrBuilder;

    return-object v0

    .line 13036
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 13044
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 13045
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13047
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPaceMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;
    .locals 1

    .line 13455
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13456
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13457
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13459
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0

    .line 13461
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    return-object v0
.end method

.method public getPaceMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;
    .locals 1

    .line 13602
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    return-object v0
.end method

.method public getPaceMapBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;>;"
        }
    .end annotation

    .line 13648
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPaceMapCount()I
    .locals 1

    .line 13445
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13446
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 13448
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 13435
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13436
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13438
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPaceMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;
    .locals 1

    .line 13609
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13610
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13611
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13613
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceDataOrBuilder;

    return-object v0

    .line 13614
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 13622
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 13623
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13625
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartTimeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;
    .locals 1

    .line 13947
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 13948
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13949
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 13951
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    return-object v0

    .line 13953
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    return-object v0
.end method

.method public getPartTimeMapBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;
    .locals 1

    .line 14094
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    return-object v0
.end method

.method public getPartTimeMapBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;>;"
        }
    .end annotation

    .line 14140
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartTimeMapCount()I
    .locals 1

    .line 13937
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13938
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 13940
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

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

    .line 13927
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13928
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13930
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartTimeMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;
    .locals 1

    .line 14101
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 14102
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 14103
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 14105
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeDataOrBuilder;

    return-object v0

    .line 14106
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

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

    .line 14114
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 14115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 14117
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPathImageURI()Ljava/lang/String;
    .locals 4

    .line 13226
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13227
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 13228
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 13230
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 13231
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13232
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13234
    :cond_0
    return-object v3

    .line 13236
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPathImageURIBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 13244
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13245
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 13246
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 13247
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 13249
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13250
    return-object v2

    .line 13252
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getRealSteps()I
    .locals 1

    .line 13302
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realSteps_:I

    return v0
.end method

.method public getRealStoreys()I
    .locals 1

    .line 13366
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realStoreys_:I

    return v0
.end method

.method public getRunState()I
    .locals 1

    .line 13398
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->runState_:I

    return v0
.end method

.method public getStartAddress()Ljava/lang/String;
    .locals 4

    .line 12700
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12701
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 12702
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 12704
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 12705
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12706
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12708
    :cond_0
    return-object v3

    .line 12710
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStartAddressBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 12718
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12719
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 12720
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 12721
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 12723
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12724
    return-object v2

    .line 12726
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getTotalCalories()I
    .locals 1

    .line 13130
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalCalories_:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 13098
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalDistance_:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 13162
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalSteps_:I

    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 13334
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalStoreys_:I

    return v0
.end method

.method public getTotalTime()J
    .locals 2

    .line 13194
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalTime_:J

    return-wide v0
.end method

.method public hasBaseHealthData()Z
    .locals 2

    .line 12580
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

    .line 12770
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

    .line 13220
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasRealSteps()Z
    .locals 2

    .line 13296
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasRealStoreys()Z
    .locals 2

    .line 13360
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasRunState()Z
    .locals 2

    .line 13392
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x1000

    const/16 v1, 0x1000

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

    .line 12694
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

    .line 13124
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasTotalDistance()Z
    .locals 2

    .line 13092
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasTotalSteps()Z
    .locals 2

    .line 13156
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasTotalStoreys()Z
    .locals 2

    .line 13328
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public hasTotalTime()Z
    .locals 2

    .line 13188
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

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

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 12186
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$16200()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12187
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 12186
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 12551
    const/4 v0, 0x1

    return v0
.end method

.method public mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12626
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 12627
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12628
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 12629
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12630
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    goto :goto_0

    .line 12632
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12634
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_1

    .line 12636
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 12638
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12639
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12175
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

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

    .line 12175
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

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

    .line 12175
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 12175
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

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

    .line 12175
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12558
    const/4 v1, 0x0

    .line 12560
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18900()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 12565
    if-eqz v1, :cond_1

    .line 12566
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    goto :goto_0

    .line 12561
    :catch_0
    move-exception v2

    .line 12562
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-object v1, v0

    .line 12563
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12565
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 12566
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12568
    :cond_0
    throw v3

    .line 12569
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12390
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    if-eqz v0, :cond_0

    .line 12391
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    return-object v0

    .line 12393
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 12394
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12399
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 12400
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasBaseHealthData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12401
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12403
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasStartAddress()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12404
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12405
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$16900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12406
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12408
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasEndAddress()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12409
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12410
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12411
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12413
    :cond_3
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_5

    .line 12414
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 12415
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12416
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12417
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_0

    .line 12419
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12420
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12422
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_2

    .line 12425
    :cond_5
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 12426
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 12427
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 12428
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12429
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    .line 12430
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12431
    .line 12432
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18500()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 12433
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getLbsDataListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 12435
    :cond_7
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12439
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 12440
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalDistance()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12442
    :cond_9
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalCalories()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 12443
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalCalories(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12445
    :cond_a
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalSteps()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 12446
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12448
    :cond_b
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalTime()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 12449
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12451
    :cond_c
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasPathImageURI()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 12452
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12453
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$17600(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 12454
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12456
    :cond_d
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRealSteps()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 12457
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRealSteps()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRealSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12459
    :cond_e
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 12460
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalStoreys()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12462
    :cond_f
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRealStoreys()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 12463
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRealStoreys()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRealStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12465
    :cond_10
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRunState()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 12466
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRunState()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRunState(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 12468
    :cond_11
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_13

    .line 12469
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    .line 12470
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 12471
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 12472
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_3

    .line 12474
    :cond_12
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 12475
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12477
    :goto_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_5

    .line 12480
    :cond_13
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    .line 12481
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 12482
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 12483
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12484
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    .line 12485
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12486
    .line 12487
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18600()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 12488
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPaceMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_4

    :cond_14
    const/4 v0, 0x0

    :goto_4
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_5

    .line 12490
    :cond_15
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12494
    :cond_16
    :goto_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_18

    .line 12495
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 12496
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 12497
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 12498
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_6

    .line 12500
    :cond_17
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 12501
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12503
    :goto_6
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_8

    .line 12506
    :cond_18
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 12507
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 12508
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 12509
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12510
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    .line 12511
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12512
    .line 12513
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18700()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 12514
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getHeartrateListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_7

    :cond_19
    const/4 v0, 0x0

    :goto_7
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_8

    .line 12516
    :cond_1a
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12520
    :cond_1b
    :goto_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1d

    .line 12521
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    .line 12522
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 12523
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12524
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    goto :goto_9

    .line 12526
    :cond_1c
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 12527
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12529
    :goto_9
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_b

    .line 12532
    :cond_1d
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    .line 12533
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 12534
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 12535
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12536
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    .line 12537
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12538
    .line 12539
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18800()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 12540
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getPartTimeMapFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_a

    :cond_1e
    const/4 v0, 0x0

    :goto_a
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_b

    .line 12542
    :cond_1f
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->access$18300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12546
    :cond_20
    :goto_b
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 12547
    return-object p0
.end method

.method public removeHeartrateList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13834
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13835
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13836
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13837
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13839
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 13841
    :goto_0
    return-object p0
.end method

.method public removeLbsDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13010
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13011
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 13012
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13013
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13015
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 13017
    :goto_0
    return-object p0
.end method

.method public removePaceMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13588
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13589
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13590
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13591
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13593
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 13595
    :goto_0
    return-object p0
.end method

.method public removePartTimeMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 14080
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 14081
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 14082
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 14083
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 14085
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 14087
    :goto_0
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12613
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 12614
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12615
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12617
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 12619
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12620
    return-object p0
.end method

.method public setBaseHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12596
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 12597
    if-nez p1, :cond_0

    .line 12598
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12600
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthData_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    .line 12601
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12603
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->baseHealthDataBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 12605
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12606
    return-object p0
.end method

.method public setEndAddress(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12810
    if-nez p1, :cond_0

    .line 12811
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12813
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12814
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12815
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12816
    return-object p0
.end method

.method public setEndAddressBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12832
    if-nez p1, :cond_0

    .line 12833
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12835
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12836
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->endAddress_:Ljava/lang/Object;

    .line 12837
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12838
    return-object p0
.end method

.method public setHeartrateList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13732
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13733
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13734
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13735
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13737
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13739
    :goto_0
    return-object p0
.end method

.method public setHeartrateList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13715
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13716
    if-nez p2, :cond_0

    .line 13717
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13719
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureHeartrateListIsMutable()V

    .line 13720
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13721
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13723
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->heartrateListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13725
    :goto_0
    return-object p0
.end method

.method public setLbsDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12908
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 12909
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12910
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 12911
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12913
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12915
    :goto_0
    return-object p0
.end method

.method public setLbsDataList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 12891
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 12892
    if-nez p2, :cond_0

    .line 12893
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12895
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensureLbsDataListIsMutable()V

    .line 12896
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 12897
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 12899
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->lbsDataListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 12901
    :goto_0
    return-object p0
.end method

.method public setPaceMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13486
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13487
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13488
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13489
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13491
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13493
    :goto_0
    return-object p0
.end method

.method public setPaceMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13469
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13470
    if-nez p2, :cond_0

    .line 13471
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13473
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePaceMapIsMutable()V

    .line 13474
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13475
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13477
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->paceMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13479
    :goto_0
    return-object p0
.end method

.method public setPartTimeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13978
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 13979
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 13980
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13981
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13983
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13985
    :goto_0
    return-object p0
.end method

.method public setPartTimeMap(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 13961
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 13962
    if-nez p2, :cond_0

    .line 13963
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13965
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->ensurePartTimeMapIsMutable()V

    .line 13966
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMap_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 13967
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    goto :goto_0

    .line 13969
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->partTimeMapBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 13971
    :goto_0
    return-object p0
.end method

.method public setPathImageURI(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13260
    if-nez p1, :cond_0

    .line 13261
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13263
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13264
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13265
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13266
    return-object p0
.end method

.method public setPathImageURIBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13282
    if-nez p1, :cond_0

    .line 13283
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13285
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13286
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->pathImageURI_:Ljava/lang/Object;

    .line 13287
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13288
    return-object p0
.end method

.method public setRealSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13308
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13309
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realSteps_:I

    .line 13310
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13311
    return-object p0
.end method

.method public setRealStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13372
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13373
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->realStoreys_:I

    .line 13374
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13375
    return-object p0
.end method

.method public setRunState(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13404
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13405
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->runState_:I

    .line 13406
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13407
    return-object p0
.end method

.method public setStartAddress(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12734
    if-nez p1, :cond_0

    .line 12735
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12737
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12738
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12739
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12740
    return-object p0
.end method

.method public setStartAddressBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 12756
    if-nez p1, :cond_0

    .line 12757
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 12759
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 12760
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->startAddress_:Ljava/lang/Object;

    .line 12761
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 12762
    return-object p0
.end method

.method public setTotalCalories(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13136
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13137
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalCalories_:I

    .line 13138
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13139
    return-object p0
.end method

.method public setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13104
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13105
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalDistance_:I

    .line 13106
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13107
    return-object p0
.end method

.method public setTotalSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13168
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13169
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalSteps_:I

    .line 13170
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13171
    return-object p0
.end method

.method public setTotalStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13340
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13341
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalStoreys_:I

    .line 13342
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13343
    return-object p0
.end method

.method public setTotalTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 2

    .line 13200
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->bitField0_:I

    .line 13201
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->totalTime_:J

    .line 13202
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->onChanged()V

    .line 13203
    return-object p0
.end method
