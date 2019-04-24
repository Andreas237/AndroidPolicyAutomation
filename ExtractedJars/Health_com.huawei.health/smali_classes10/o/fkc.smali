.class public Lo/fkc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;I)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/cfg;>;I)Lcom/huawei/hihealth/HiDataInsertOption;"
        }
    .end annotation

    .line 205
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 207
    const-string v0, "HiHealth_UUID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 208
    const-string v0, "PHONE_UUID"

    const-string v1, ""

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 210
    invoke-static {p2}, Lo/fkc;->e(I)I

    move-result v7

    .line 212
    const v8, 0x3a83126f    # 0.001f

    .line 213
    const/4 v9, 0x0

    .line 214
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cfg;

    .line 216
    invoke-virtual {v11}, Lo/cfg;->c()F

    move-result v0

    const/4 v1, 0x0

    sub-float/2addr v0, v1

    cmpl-float v0, v0, v8

    if-lez v0, :cond_0

    .line 217
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x3

    invoke-direct {v12, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 218
    invoke-virtual {v11}, Lo/cfg;->a()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/cfg;->d()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 219
    invoke-virtual {v11}, Lo/cfg;->c()F

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 220
    invoke-virtual {v12, v6}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 221
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    const/4 v9, 0x1

    .line 225
    :cond_0
    invoke-virtual {v11}, Lo/cfg;->b()F

    move-result v0

    const/4 v1, 0x0

    sub-float/2addr v0, v1

    cmpl-float v0, v0, v8

    if-lez v0, :cond_1

    .line 226
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x4

    invoke-direct {v12, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 227
    invoke-virtual {v11}, Lo/cfg;->a()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/cfg;->d()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 228
    invoke-virtual {v11}, Lo/cfg;->b()F

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 229
    invoke-virtual {v12, v6}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 230
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    const/4 v9, 0x1

    .line 234
    :cond_1
    if-eqz v9, :cond_2

    .line 235
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v12, v7}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 236
    invoke-virtual {v11}, Lo/cfg;->a()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/cfg;->d()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 237
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 238
    invoke-virtual {v12, v6}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 239
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    :cond_2
    const/4 v9, 0x0

    .line 244
    goto/16 :goto_0

    .line 246
    :cond_3
    new-instance v0, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v0, v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;Lcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 6

    .line 116
    new-instance v2, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v2}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 117
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportId(Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgStepRate(I)V

    .line 119
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHeartRate(I)V

    .line 120
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 121
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPaceMap(Ljava/util/Map;)V

    .line 122
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 123
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 124
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 125
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestPace()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestPace(F)V

    .line 126
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestStepRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestStepRate(I)V

    .line 127
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxHeartRate(I)V

    .line 128
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinHeartRate(I)V

    .line 129
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 130
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 131
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 132
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 133
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 134
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 135
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 136
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTrackType(I)V

    .line 137
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAbnormalTrack(I)V

    .line 138
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMapType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 139
    const-string v0, "AMAP"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 140
    const-string v0, "GCJ02"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCoordinate(Ljava/lang/String;)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMapType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 142
    const-string v0, "GOOGLE"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 143
    const-string v0, "WGS84"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCoordinate(Ljava/lang/String;)V

    .line 145
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestIsFreeMotion()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setIsFreeMotion(Z)V

    .line 146
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportDataSource(I)V

    .line 147
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setChiefSportDataType(I)V

    .line 148
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestHasTrackPoint()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHasTrackPoint(Z)V

    .line 149
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 152
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwolfBase()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwolfBase(F)V

    .line 153
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwolfBase()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwolfBase(F)V

    .line 154
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDescent()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDescent(F)V

    .line 155
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxAlti()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxAlti(F)V

    .line 156
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinAlti()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinAlti(F)V

    .line 157
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwimSegments(Ljava/util/List;)V

    .line 158
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwimSegments(Ljava/util/List;)V

    .line 161
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundContactTime(I)V

    .line 162
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundImpactAcceleration(I)V

    .line 163
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgEversionExcursion(I)V

    .line 164
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgSwingAngle(I)V

    .line 165
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgForeFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgForeFootStrikePattern(I)V

    .line 166
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgWholeFootStrikePattern(I)V

    .line 167
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHindFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHindFootStrikePattern(I)V

    .line 170
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmDuplicated()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 172
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHeartrateZoneType(I)V

    .line 176
    new-instance v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 177
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 178
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 180
    const/16 v0, 0x7531

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 181
    invoke-virtual {p2}, Lo/cex;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 182
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 183
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-virtual {v4, v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 184
    const-string v0, "HiHealth_UUID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 185
    const-string v0, "PHONE_UUID"

    const-string v1, ""

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p3, v3}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 188
    return-void
.end method

.method public static c()Lcom/huawei/hihealth/HiSyncOption;
    .locals 2

    .line 192
    new-instance v1, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 193
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 194
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 195
    const/16 v0, 0x4e20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 196
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 197
    return-object v1
.end method

.method public static c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;Lcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 7

    .line 32
    new-instance v2, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v2}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportId(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgStepRate(I)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHeartRate(I)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestPace()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestPace(F)V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 39
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPaceMap(Ljava/util/Map;)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 41
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 42
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestStepRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestStepRate(I)V

    .line 43
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxHeartRate(I)V

    .line 44
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 45
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 46
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 47
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 50
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 51
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinHeartRate()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinHeartRate(I)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTrackType(I)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAbnormalTrack(I)V

    .line 55
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestRuncourseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setRuncourseId(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMapType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 58
    const-string v0, "AMAP"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 59
    const-string v0, "GCJ02"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCoordinate(Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMapType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 61
    const-string v0, "GOOGLE"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 62
    const-string v0, "WGS84"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCoordinate(Ljava/lang/String;)V

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestIsFreeMotion()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setIsFreeMotion(Z)V

    .line 66
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportDataSource(I)V

    .line 67
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setChiefSportDataType(I)V

    .line 68
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestHasTrackPoint()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHasTrackPoint(Z)V

    .line 71
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwimSegments(Ljava/util/List;)V

    .line 72
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwimSegments(Ljava/util/List;)V

    .line 73
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwolfBase()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwolfBase(F)V

    .line 74
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwolfBase()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwolfBase(F)V

    .line 75
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDescent()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDescent(F)V

    .line 76
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxAlti()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxAlti(F)V

    .line 77
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinAlti()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinAlti(F)V

    .line 80
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundContactTime(I)V

    .line 81
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundImpactAcceleration(I)V

    .line 82
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgEversionExcursion(I)V

    .line 83
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgSwingAngle(I)V

    .line 84
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgForeFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgForeFootStrikePattern(I)V

    .line 85
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgWholeFootStrikePattern(I)V

    .line 86
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHindFootStrikePattern()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHindFootStrikePattern(I)V

    .line 89
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmDuplicated()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 91
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHeartrateZoneType(I)V

    .line 94
    new-instance v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 95
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 96
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 98
    const/16 v0, 0x7533

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 99
    invoke-virtual {v3, p2}, Lcom/huawei/hihealth/HiHealthData;->setSequenceFileUrl(Ljava/lang/String;)V

    .line 102
    new-instance v4, Lcom/google/gson/GsonBuilder;

    invoke-direct {v4}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 103
    invoke-virtual {v4}, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues()Lcom/google/gson/GsonBuilder;

    .line 104
    invoke-virtual {v4}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v5

    .line 105
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-virtual {v5, v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 106
    const-string v0, "HiHealth_UUID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 107
    const-string v0, "PHONE_UUID"

    const-string v1, ""

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p3, v3}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 109
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/util/List;)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/cfg;>;)Lcom/huawei/hihealth/HiDataInsertOption;"
        }
    .end annotation

    .line 255
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 257
    const-string v0, "HiHealth_UUID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 258
    const-string v0, "PHONE_UUID"

    const-string v1, ""

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 260
    const/16 v7, 0x4e23

    .line 262
    const v8, 0x3a83126f    # 0.001f

    .line 263
    const/4 v9, 0x0

    .line 264
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cfg;

    .line 266
    invoke-virtual {v11}, Lo/cfg;->e()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    sub-float/2addr v0, v1

    cmpl-float v0, v0, v8

    if-lez v0, :cond_0

    .line 267
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x2

    invoke-direct {v12, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 268
    invoke-virtual {v11}, Lo/cfg;->a()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/cfg;->d()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 269
    invoke-virtual {v11}, Lo/cfg;->e()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 270
    invoke-virtual {v12, v6}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 271
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    const/4 v9, 0x1

    .line 276
    :cond_0
    if-eqz v9, :cond_1

    .line 277
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v12, v7}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 278
    invoke-virtual {v11}, Lo/cfg;->a()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/cfg;->d()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 279
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 280
    invoke-virtual {v12, v6}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 281
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    :cond_1
    const/4 v9, 0x0

    .line 286
    goto/16 :goto_0

    .line 288
    :cond_2
    new-instance v0, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v0, v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static e(I)I
    .locals 2

    .line 293
    const/16 v1, 0x4e23

    .line 294
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 297
    :pswitch_0
    const/16 v1, 0x4e25

    .line 298
    goto :goto_0

    .line 301
    :pswitch_1
    const/16 v1, 0x4e24

    .line 302
    goto :goto_0

    .line 304
    :pswitch_2
    const/16 v1, 0x4e23

    .line 305
    goto :goto_0

    .line 308
    :pswitch_3
    const/16 v1, 0x4e27

    .line 309
    goto :goto_0

    .line 311
    :pswitch_4
    const/16 v1, 0x4e22

    .line 312
    .line 317
    :goto_0
    :pswitch_5
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method
