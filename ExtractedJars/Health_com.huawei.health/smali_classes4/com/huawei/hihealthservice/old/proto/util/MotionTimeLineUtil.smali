.class public Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_MotionTimeLineUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized convertMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/model/MotionPath;)V
    .locals 11

    const-class v10, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;

    monitor-enter v10

    .line 29
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 31
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 34
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/model/HealthData;)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getStartAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getStartAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setStartAddress(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getEndAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 42
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getEndAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setEndAddress(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getLbsDataMap()Ljava/util/Map;

    move-result-object v2

    .line 47
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 52
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    move-result-object v5

    .line 53
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    .line 54
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 56
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [D

    .line 57
    array-length v3, v4

    .line 59
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    .line 60
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->setCreateTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    .line 62
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v3, :cond_2

    .line 64
    aget-wide v0, v4, v9

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;->addLbsData(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;

    .line 62
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p0, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->addLbsDataList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 69
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPathImageURI()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 73
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPathImageURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setPathImageURI(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 76
    :cond_4
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->convertMotionPathPart(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object p0

    .line 78
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalDistance()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalDistance(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 79
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 80
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalCalories(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 81
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    .line 82
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getRealSteps()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRealSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    .line 83
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalStoreys()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setTotalStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    .line 84
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getRealStoreys()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRealStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v0

    .line 85
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getRunState()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->setRunState(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :cond_5
    monitor-exit v10

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v10

    throw p0
.end method

.method private static convertMotionPathPart(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    .locals 9

    .line 90
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPaceMap()Ljava/util/Map;

    move-result-object v2

    .line 91
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    move-result-object v3

    .line 94
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 95
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 97
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 98
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->setKey(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 99
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;->setValue(F)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;

    .line 100
    invoke-virtual {p0, v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->addPaceMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 101
    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getHeartrateList()Ljava/util/ArrayList;

    move-result-object v3

    .line 105
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 107
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    move-result-object v4

    .line 108
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;

    .line 110
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->getTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->setTime(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 111
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->getHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;->setHeartRate(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;

    .line 112
    invoke-virtual {p0, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->addHeartrateList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 113
    goto :goto_1

    .line 116
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPartTimeMap()Ljava/util/Map;

    move-result-object v4

    .line 117
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 119
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->newBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    move-result-object v5

    .line 120
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    .line 121
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 123
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 124
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->setKey(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 125
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;->setValue(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;

    .line 126
    invoke-virtual {p0, v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->addPartTimeMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    .line 127
    goto :goto_2

    .line 129
    :cond_2
    return-object p0
.end method

.method private static declared-synchronized convertProtoMotionTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/model/MotionTimeLine;
    .locals 3

    const-class v2, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;

    monitor-enter v2

    .line 135
    const/4 v1, 0x0

    .line 136
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    .line 138
    :try_start_0
    new-instance v1, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    invoke-direct {v1}, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;-><init>()V

    .line 139
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    .line 142
    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    .line 141
    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoHealthData(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V

    .line 143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->hasSportDuration()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getSportDuration()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->setSportDuration(I)V

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasSportTimeLine()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getSportTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->setSportTimeLine(Lcom/huawei/hihealthservice/old/model/SportTimeLine;)V

    .line 152
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasHeartRateTimeLine()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 154
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->setHeartRateTimeLine(Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;)V

    .line 156
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->hasMotionPath()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 158
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;->getMotionPath()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->setMotionPath(Lcom/huawei/hihealthservice/old/model/MotionPath;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :cond_3
    monitor-exit v2

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static getByteMotionPathArray([Lcom/huawei/hihealthservice/old/model/MotionPath;)Ljava/lang/String;
    .locals 1

    .line 219
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->getByteMotionPathArraySync([Lcom/huawei/hihealthservice/old/model/MotionPath;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized getByteMotionPathArraySync([Lcom/huawei/hihealthservice/old/model/MotionPath;)Ljava/lang/String;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;

    monitor-enter v9

    .line 225
    const/4 v2, 0x0

    .line 228
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getMotionPathArrayBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    move-result-object v3

    .line 229
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getMontionPathbuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;

    move-result-object v4

    .line 231
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    .line 233
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 236
    move-object v5, p0

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 238
    invoke-static {v4, v8}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->convertMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;Lcom/huawei/hihealthservice/old/model/MotionPath;)V

    .line 239
    invoke-virtual {v3, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;->addMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    .line 236
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;->toByteArray()[B

    move-result-object v5

    .line 244
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 247
    array-length v0, v5

    const/4 v1, 0x0

    invoke-static {v5, v1, v0}, Lcom/huawei/hihealthservice/old/util/Base64;->encoding([BII)Ljava/lang/String;

    move-result-object v2

    .line 251
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray$Builder;

    .line 252
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :cond_2
    monitor-exit v9

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method public static parseArrayMotionTimeLine(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionTimeLine;
    .locals 1

    .line 259
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->parseArrayMotionTimeLineSync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized parseArrayMotionTimeLineSync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionTimeLine;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;

    monitor-enter v9

    .line 270
    const/4 v4, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_1

    .line 276
    :try_start_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/Base64;->decoding(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 281
    goto :goto_0

    .line 278
    :catch_0
    move-exception v6

    .line 280
    const-string v0, "Debug_DE_MotionTimeLineUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseArrayMotionTimeLine "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 287
    .line 288
    :try_start_3
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;

    move-result-object v6

    .line 290
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getMotionTimeLineCount()I

    move-result v7

    .line 292
    new-array v0, v7, [Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    move-object v5, v0

    .line 294
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_0

    .line 296
    invoke-virtual {v6, v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLineArray;->getMotionTimeLine(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->convertProtoMotionTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionTimeLine;)Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    move-result-object v0

    aput-object v0, v5, v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 294
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 303
    :cond_0
    goto :goto_2

    .line 300
    :catch_1
    move-exception v6

    .line 302
    const-string v0, "Debug_DE_MotionTimeLineUtil"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseArrayMotionTimeLine "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 307
    :cond_1
    :goto_2
    monitor-exit v9

    return-object v5

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method public static parseMotionPathArray(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 1

    .line 166
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;->parseMotionPathArraySync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized parseMotionPathArraySync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/MotionTimeLineUtil;

    monitor-enter v9

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_1

    .line 182
    :try_start_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/Base64;->decoding(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 187
    goto :goto_0

    .line 184
    :catch_0
    move-exception v6

    .line 186
    const-string v0, "Debug_DE_MotionTimeLineUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMotionPathArray "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 194
    .line 195
    :try_start_3
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;->parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;

    move-result-object v6

    .line 197
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;->getMotionPathCount()I

    move-result v7

    .line 199
    new-array v0, v7, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-object v5, v0

    .line 201
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_0

    .line 203
    invoke-virtual {v6, v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathArray;->getMotionPath(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v0

    aput-object v0, v5, v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 201
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 210
    :cond_0
    goto :goto_2

    .line 207
    :catch_1
    move-exception v6

    .line 209
    const-string v0, "Debug_DE_MotionTimeLineUtil"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMotionPathArray2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 215
    :cond_1
    :goto_2
    monitor-exit v9

    return-object v5

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method
