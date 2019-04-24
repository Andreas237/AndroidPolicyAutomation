.class public Lo/dhh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;
    .locals 5

    .line 143
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v2

    .line 144
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v2, v0}, Lo/dhe;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 145
    new-instance v4, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v4}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    .line 146
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTrackType(I)V

    .line 147
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgPace(F)V

    .line 148
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalTime(J)V

    .line 149
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalDistance(I)V

    .line 150
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgHeartRate(I)V

    .line 151
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgStepRate()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgStepRate(I)V

    .line 152
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalCalories(I)V

    .line 153
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportId(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportType(I)V

    .line 155
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalSteps()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalSteps(I)V

    .line 156
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgPace(F)V

    .line 157
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestPace()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBestPace(F)V

    .line 158
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestStepRate()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBestStepRate(I)V

    .line 159
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMaxHeartRate(I)V

    .line 160
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveEndTime(J)V

    .line 161
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveStartTime(J)V

    .line 162
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getWearSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportData(Ljava/util/Map;)V

    .line 164
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savePaceMap(Ljava/util/Map;)V

    .line 165
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishPaceMap(Ljava/util/Map;)V

    .line 166
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savePartTimeMap(Ljava/util/Map;)V

    .line 167
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishPartTimeMap(Ljava/util/Map;)V

    .line 168
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCreepingWave()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveCreepingWave(F)V

    .line 170
    const-string v0, "AMAP"

    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getVendor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMapType(I)V

    goto :goto_0

    .line 172
    :cond_0
    const-string v0, "GOOGLE"

    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getVendor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMapType(I)V

    .line 175
    :cond_1
    :goto_0
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getIsFreeMotion()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveIsFreeMotion(Z)V

    .line 176
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportDataSource(I)V

    .line 177
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveChiefSportDataType(I)V

    .line 178
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getHasTrackPoint()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveHasTrackPoint(Z)V

    .line 179
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAbnormalTrack(I)V

    .line 182
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSwolfBase()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSwolfBase(F)V

    .line 183
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishSwolfBase()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishSwolfBase(F)V

    .line 184
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMaxAlti()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMaxAlti(F)V

    .line 185
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMinAlti()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMinAlti(F)V

    .line 186
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDescent()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalDescent(F)V

    .line 188
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSwimSegments(Ljava/util/List;)V

    .line 189
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishSwimSegments(Ljava/util/List;)V

    .line 192
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgGroundContactTime()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgGroundContactTime(I)V

    .line 193
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgGroundImpactAcceleration(I)V

    .line 194
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgEversionExcursion()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgEversionExcursion(I)V

    .line 195
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgSwingAngle()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgSwingAngle(I)V

    .line 196
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgForeFootStrikePattern()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgForeFootStrikePattern(I)V

    .line 197
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgWholeFootStrikePattern(I)V

    .line 198
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgHindFootStrikePattern()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgHindFootStrikePattern(I)V

    .line 199
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savemDuplicated(I)V

    .line 200
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmHeartrateZoneType()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savemHeartrateZoneType(I)V

    .line 202
    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getRuncourseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveRuncourseId(Ljava/lang/String;)V

    .line 204
    return-object v4
.end method

.method public static e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Ljava/lang/String;
    .locals 5

    .line 66
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getSequenceFileUrl()Ljava/lang/String;

    move-result-object v2

    .line 67
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v3

    .line 73
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v3, v0}, Lo/dhe;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 75
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTrackType(I)V

    .line 76
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgPace(F)V

    .line 77
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalTime(J)V

    .line 78
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalDistance(I)V

    .line 79
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgHeartRate(I)V

    .line 80
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgStepRate()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgStepRate(I)V

    .line 81
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalCalories(I)V

    .line 82
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportId(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportType(I)V

    .line 84
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalSteps()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalSteps(I)V

    .line 85
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgPace(F)V

    .line 86
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestPace()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBestPace(F)V

    .line 87
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestStepRate()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBestStepRate(I)V

    .line 88
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMaxHeartRate(I)V

    .line 89
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveEndTime(J)V

    .line 90
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveStartTime(J)V

    .line 91
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getWearSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportData(Ljava/util/Map;)V

    .line 93
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savePaceMap(Ljava/util/Map;)V

    .line 94
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishPaceMap(Ljava/util/Map;)V

    .line 95
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savePartTimeMap(Ljava/util/Map;)V

    .line 96
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishPartTimeMap(Ljava/util/Map;)V

    .line 97
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCreepingWave()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveCreepingWave(F)V

    .line 99
    const-string v0, "AMAP"

    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getVendor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMapType(I)V

    goto :goto_0

    .line 101
    :cond_1
    const-string v0, "GOOGLE"

    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getVendor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMapType(I)V

    .line 107
    :cond_2
    :goto_0
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSwimSegments(Ljava/util/List;)V

    .line 108
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishSwimSegments(Ljava/util/List;)V

    .line 109
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSwolfBase()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSwolfBase(F)V

    .line 110
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBritishSwolfBase()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveBritishSwolfBase(F)V

    .line 111
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMaxAlti()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMaxAlti(F)V

    .line 112
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getMinAlti()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveMinAlti(F)V

    .line 113
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDescent()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalDescent(F)V

    .line 115
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getIsFreeMotion()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveIsFreeMotion(Z)V

    .line 116
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportDataSource(I)V

    .line 117
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveChiefSportDataType(I)V

    .line 118
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getHasTrackPoint()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveHasTrackPoint(Z)V

    .line 119
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAbnormalTrack(I)V

    .line 122
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgGroundContactTime()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgGroundContactTime(I)V

    .line 123
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgGroundImpactAcceleration(I)V

    .line 124
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgEversionExcursion()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgEversionExcursion(I)V

    .line 125
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgSwingAngle()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgSwingAngle(I)V

    .line 126
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgForeFootStrikePattern()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgForeFootStrikePattern(I)V

    .line 127
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgWholeFootStrikePattern(I)V

    .line 128
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgHindFootStrikePattern()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgHindFootStrikePattern(I)V

    .line 129
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savemDuplicated(I)V

    .line 130
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmHeartrateZoneType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->savemHeartrateZoneType(I)V

    .line 132
    invoke-virtual {v4}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getRuncourseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveRuncourseId(Ljava/lang/String;)V

    .line 135
    return-object v2
.end method
