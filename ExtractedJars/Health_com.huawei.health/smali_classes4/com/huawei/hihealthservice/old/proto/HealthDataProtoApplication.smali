.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile application:Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;


# instance fields
.field private integerMapBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

.field private intgerMapEntryBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

.field private montionPathbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

.field private motionPathArrayBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

.field sleepArraybuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

.field sleepbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

.field private sportArraybuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

.field private sportbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sportArraybuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 37
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sportbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 39
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->motionPathArrayBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    .line 40
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->montionPathbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 42
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->intgerMapEntryBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    .line 43
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->integerMapBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    .line 45
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sleepArraybuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepDataArray$Builder;

    .line 46
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sleepbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SleepData$Builder;

    .line 48
    return-void
.end method

.method public static getInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;
    .locals 4

    .line 52
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->application:Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 54
    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    monitor-enter v2

    .line 56
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->application:Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 58
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->application:Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 63
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->application:Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    return-object v0
.end method


# virtual methods
.method public getIntegerMapBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->integerMapBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry$Builder;

    return-object v0
.end method

.method public getIntgerMapEntryBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->intgerMapEntryBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    return-object v0
.end method

.method public getMontionPathbuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->montionPathbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    return-object v0
.end method

.method public getMotionPathArrayBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->motionPathArrayBuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    return-object v0
.end method

.method public getSportArraybuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sportArraybuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    return-object v0
.end method

.method public getSportbuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->sportbuilder:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 102
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 106
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 110
    return-void
.end method

.method public initFunctionD()V
    .locals 0

    .line 114
    return-void
.end method
