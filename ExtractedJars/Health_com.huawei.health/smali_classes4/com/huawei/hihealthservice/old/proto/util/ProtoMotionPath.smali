.class public Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static declared-synchronized convertProtoHeartRateTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;)Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;
    .locals 7

    const-class v6, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;

    monitor-enter v6

    .line 223
    const/4 v1, 0x0

    .line 225
    const/4 v0, 0x0

    if-eq v0, p0, :cond_5

    .line 227
    :try_start_0
    new-instance v1, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

    invoke-direct {v1}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;-><init>()V

    .line 228
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    .line 230
    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoHealthData(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V

    .line 233
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->hasSportDuration()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    .line 236
    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getSportDuration()I

    move-result v0

    .line 235
    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->setSportDuration(I)V

    .line 240
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasMaxHeartRate()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->setMaxHeartRate(I)V

    .line 245
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasMinHeartRate()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->setMinHeartRate(I)V

    .line 249
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->hasAvgHeartRate()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->setAvgHeartRate(I)V

    .line 254
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getHeartRateValuesCount()I

    move-result v2

    .line 256
    if-lez v2, :cond_5

    .line 258
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLine;->getHeartRateValuesList()Ljava/util/List;

    move-result-object v3

    .line 260
    new-array v4, v2, [I

    .line 261
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_4

    .line 263
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v4, v5

    .line 261
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 266
    :cond_4
    invoke-virtual {v1, v4}, Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;->setHeartRateValues([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    :cond_5
    monitor-exit v6

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method

.method static declared-synchronized convertProtoMotionPath(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 14

    const-class v13, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;

    monitor-enter v13

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v0, 0x0

    if-eq v0, p0, :cond_6

    .line 22
    :try_start_0
    new-instance v2, Lcom/huawei/hihealthservice/old/model/MotionPath;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/model/MotionPath;-><init>()V

    .line 24
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v3

    .line 26
    invoke-static {v2, v3}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoHealthData(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V

    .line 28
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasStartAddress()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getStartAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setStartAddress(Ljava/lang/String;)V

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasEndAddress()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getEndAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setEndAddress(Ljava/lang/String;)V

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getLbsDataListCount()I

    move-result v4

    .line 39
    if-lez v4, :cond_5

    .line 42
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getLbsDataListList()Ljava/util/List;

    move-result-object v5

    .line 44
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 50
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v4, :cond_4

    .line 52
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;

    .line 54
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getLbsDataCount()I

    move-result v8

    .line 56
    if-lez v8, :cond_3

    .line 58
    new-array v10, v8, [D

    .line 60
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getLbsDataList()Ljava/util/List;

    move-result-object v11

    .line 62
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v8, :cond_2

    .line 64
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    aput-wide v0, v10, v12

    .line 62
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPointData;->getCreateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {v2, v6}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 74
    :cond_5
    invoke-static {p0, v2}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoMotionPathPart(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v2

    .line 75
    invoke-static {p0, v2}, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;->convertProtoMotionPathPart2(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 77
    :cond_6
    monitor-exit v13

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v13

    throw p0
.end method

.method private static convertProtoMotionPathPart(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 2

    .line 127
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasPathImageURI()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPathImageURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setPathImageURI(Ljava/lang/String;)V

    .line 132
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalDistance()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalDistance(I)V

    .line 136
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalTime()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalTime(J)V

    .line 140
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalCalories()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalCalories(I)V

    .line 144
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalSteps()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalSteps(I)V

    .line 149
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRealSteps()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 151
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRealSteps()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setRealSteps(I)V

    .line 154
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 156
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getTotalStoreys()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalStoreys(I)V

    .line 159
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRealStoreys()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 161
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRealStoreys()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setRealStoreys(I)V

    .line 164
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->hasRunState()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 166
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getRunState()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setRunState(I)V

    .line 168
    :cond_8
    return-object p1
.end method

.method private static convertProtoMotionPathPart2(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;Lcom/huawei/hihealthservice/old/model/MotionPath;)Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 10

    .line 81
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPaceMapCount()I

    move-result v3

    .line 82
    if-lez v3, :cond_1

    .line 84
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPaceMapList()Ljava/util/List;

    move-result-object v4

    .line 85
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 87
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_0

    .line 89
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;

    .line 90
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getKey()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPaceData;->getValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p1, v5}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 95
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getHeartrateListCount()I

    move-result v4

    .line 96
    if-lez v4, :cond_3

    .line 98
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 99
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getHeartrateListList()Ljava/util/List;

    move-result-object v6

    .line 100
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;

    .line 102
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;-><init>()V

    .line 103
    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->setTime(Ljava/lang/Long;)V

    .line 104
    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathHeartRateData;->getHeartRate()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->setHeartRate(Ljava/lang/Integer;)V

    .line 105
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {p1, v5}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setHeartrateList(Ljava/util/ArrayList;)V

    .line 110
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPartTimeMapCount()I

    move-result v5

    .line 111
    if-lez v5, :cond_5

    .line 113
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPath;->getPartTimeMapList()Ljava/util/List;

    move-result-object v6

    .line 114
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 116
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v5, :cond_4

    .line 118
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;

    .line 119
    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getKey()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$MotionPathPartTimeData;->getValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 121
    :cond_4
    invoke-virtual {p1, v7}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setPartTimeMap(Ljava/util/Map;)V

    .line 123
    :cond_5
    return-object p1
.end method

.method static declared-synchronized convertProtoSportTimeLine(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;)Lcom/huawei/hihealthservice/old/model/SportTimeLine;
    .locals 3

    const-class v2, Lcom/huawei/hihealthservice/old/proto/util/ProtoMotionPath;

    monitor-enter v2

    .line 174
    const/4 v1, 0x0

    .line 175
    const/4 v0, 0x0

    if-eq v0, p0, :cond_5

    .line 177
    :try_start_0
    new-instance v1, Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    invoke-direct {v1}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;-><init>()V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasBaseTimeLine()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    .line 182
    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v0

    .line 181
    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoHealthData(Lcom/huawei/hihealthservice/old/model/HealthData;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;)V

    .line 184
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->hasSportDuration()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;->getSportDuration()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setSportDuration(I)V

    .line 190
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalSteps()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalSteps()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setTotalSteps(I)V

    .line 195
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalCalory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 197
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalCalory()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setTotalCalory(I)V

    .line 200
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalDistance()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 202
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalDistance()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setTotalDistance(I)V

    .line 205
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 207
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getTotalStoreys()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setTotalStoreys(I)V

    .line 210
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->hasRealSteps()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 212
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportTimeLine;->getRealSteps()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->setRealSteps(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :cond_5
    monitor-exit v2

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method
