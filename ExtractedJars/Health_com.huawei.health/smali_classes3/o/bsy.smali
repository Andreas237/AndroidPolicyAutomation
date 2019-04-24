.class public Lo/bsy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/model/PlanStat;)Lorg/json/JSONObject;
    .locals 9

    .line 184
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 186
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll5KM()I

    move-result v5

    .line 187
    const-string v0, "204"

    invoke-static {v4, v0, v5}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 189
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll10KM()I

    move-result v6

    .line 190
    const-string v0, "205"

    invoke-static {v4, v0, v6}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 192
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllHalfMarathon()I

    move-result v7

    .line 193
    const-string v0, "206"

    invoke-static {v4, v0, v7}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 195
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllMarathon()I

    move-result v8

    .line 196
    const-string v0, "207"

    invoke-static {v4, v0, v8}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    goto :goto_0

    .line 198
    :catch_0
    move-exception v5

    .line 199
    const-class v0, Lo/bsy;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    :goto_0
    return-object v4
.end method

.method public static b(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lcom/huawei/health/suggestion/model/BestRecordFit;>;"
        }
    .end annotation

    .line 100
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 101
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 102
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 103
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 104
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 105
    new-instance v5, Lcom/huawei/health/suggestion/model/BestRecordFit;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/BestRecordFit;-><init>()V

    .line 107
    const-string v0, "id"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BestRecordFit;->saveActionId(Ljava/lang/String;)V

    .line 108
    const-string v0, "key"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BestRecordFit;->saveType(I)V

    .line 109
    const-string v0, "value"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BestRecordFit;->saveValue(Ljava/lang/String;)V

    .line 110
    const-string v0, "completeTime"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/BestRecordFit;->saveCompleteTime(J)V

    .line 111
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 115
    :cond_1
    return-object v2
.end method

.method private static b(Lorg/json/JSONObject;Ljava/lang/String;F)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 173
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    .line 174
    float-to-double v0, p2

    invoke-virtual {p0, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 176
    :cond_0
    return-void
.end method

.method public static c(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 4

    .line 63
    new-instance v3, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 64
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 65
    const-string v0, "103"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForFirst1KM(I)V

    .line 66
    const-string v0, "1"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setFarthestRunning(F)V

    .line 67
    const-string v0, "2"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setLongestRunning(I)V

    .line 68
    const-string v0, "3"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor1KM(I)V

    .line 69
    const-string v0, "4"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor5KM(I)V

    .line 70
    const-string v0, "5"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordFor10KM(I)V

    .line 71
    const-string v0, "6"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForHalfMarathon(I)V

    .line 72
    const-string v0, "7"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForMarathon(I)V

    .line 73
    const-string v0, "8"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveLongestTimePerWeek(I)V

    .line 74
    const-string v0, "9"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostCaloriePerWeek(F)V

    .line 75
    const-string v0, "10"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveMostWorkoutTimes(I)V

    .line 76
    const-string v0, "110"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setMostWorkoutName(Ljava/lang/String;)V

    .line 77
    const-string v0, "11"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Lo/bzr;->i(F)F

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->saveHighestCompleteRate(F)V

    .line 79
    :cond_0
    return-object v3
.end method

.method public static c(Lcom/huawei/health/suggestion/model/PlanStat;)Lorg/json/JSONObject;
    .locals 18

    .line 120
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 122
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForFirst1KM()I

    move-result v5

    .line 123
    const-string v0, "103"

    invoke-static {v4, v0, v5}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 124
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getFarthestRunning()F

    move-result v6

    .line 125
    const-string v0, "1"

    invoke-static {v6}, Lo/bzr;->e(F)I

    move-result v1

    invoke-static {v4, v0, v1}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestRunning()I

    move-result v7

    .line 129
    const-string v0, "2"

    invoke-static {v4, v0, v7}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 131
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor1KM()I

    move-result v8

    .line 132
    const-string v0, "3"

    invoke-static {v4, v0, v8}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 134
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor5KM()I

    move-result v9

    .line 135
    const-string v0, "4"

    invoke-static {v4, v0, v9}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 137
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor10KM()I

    move-result v10

    .line 138
    const-string v0, "5"

    invoke-static {v4, v0, v10}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 140
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForHalfMarathon()I

    move-result v11

    .line 141
    const-string v0, "6"

    invoke-static {v4, v0, v11}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 143
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForMarathon()I

    move-result v12

    .line 144
    const-string v0, "7"

    invoke-static {v4, v0, v12}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 146
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestTimePerWeek()I

    move-result v13

    .line 147
    const-string v0, "8"

    invoke-static {v4, v0, v13}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 149
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostCaloriePerWeek()F

    move-result v14

    .line 150
    const-string v0, "9"

    invoke-static {v4, v0, v14}, Lo/bsy;->b(Lorg/json/JSONObject;Ljava/lang/String;F)V

    .line 152
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostWorkoutTimes()I

    move-result v15

    .line 153
    const-string v0, "10"

    invoke-static {v4, v0, v15}, Lo/bsy;->c(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 155
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostWorkoutName()Ljava/lang/String;

    move-result-object v16

    .line 156
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    const-string v0, "110"

    move-object/from16 v1, v16

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getHighestCompleteRate()F

    move-result v17

    .line 160
    const-string v0, "11"

    move/from16 v1, v17

    invoke-static {v4, v0, v1}, Lo/bsy;->b(Lorg/json/JSONObject;Ljava/lang/String;F)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_0

    .line 162
    :catch_0
    move-exception v5

    .line 163
    const-class v0, Lo/bsy;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_0
    return-object v4
.end method

.method private static c(Lorg/json/JSONObject;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 168
    if-lez p2, :cond_0

    .line 169
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 171
    :cond_0
    return-void
.end method

.method public static d(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 2

    .line 89
    new-instance v1, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 90
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 91
    const-string v0, "204"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAll5KM(I)V

    .line 92
    const-string v0, "205"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAll10KM(I)V

    .line 93
    const-string v0, "206"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAllHalfMarathon(I)V

    .line 94
    const-string v0, "207"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanStat;->setBestRecordForAllMarathon(I)V

    .line 96
    :cond_0
    return-object v1
.end method
