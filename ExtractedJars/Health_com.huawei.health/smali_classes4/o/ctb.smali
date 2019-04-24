.class public Lo/ctb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctb$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method synthetic constructor <init>(Lo/ctb$1;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/ctb;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ctb;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctb;->e:Landroid/content/Context;

    .line 48
    sget-object v0, Lo/ctb$d;->c:Lo/ctb;

    return-object v0
.end method

.method private static e(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 109
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 110
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    return-object v2

    .line 113
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 114
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    return-object v2
.end method


# virtual methods
.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;>;"
        }
    .end annotation

    .line 120
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 123
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 125
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 126
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;-><init>()V

    .line 127
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 128
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v14

    .line 129
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v16

    .line 130
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setStartTime(Ljava/lang/Long;)V

    .line 131
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setEndTime(Ljava/lang/Long;)V

    .line 132
    move-object/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTimeZone(Ljava/lang/String;)V

    .line 133
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v17

    .line 134
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v18

    .line 135
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    move-object/from16 v1, v17

    invoke-static {v1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 136
    if-eqz v19, :cond_2

    if-nez v18, :cond_3

    .line 137
    goto :goto_0

    .line 139
    :cond_3
    sget-object v0, Lo/ctb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v20

    .line 140
    if-nez v20, :cond_4

    .line 141
    goto/16 :goto_0

    .line 143
    :cond_4
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setAbnormalTrack(Ljava/lang/Integer;)V

    .line 144
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setDuplicateTrack(Ljava/lang/Integer;)V

    .line 145
    invoke-virtual/range {v20 .. v20}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 146
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalSteps()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalSteps(Ljava/lang/Integer;)V

    .line 147
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalCalories(Ljava/lang/Integer;)V

    .line 148
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalDistance(Ljava/lang/Integer;)V

    .line 149
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalTime(Ljava/lang/Long;)V

    .line 151
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 152
    const-string v0, "TRACK_METADATA"

    move-object/from16 v1, v17

    move-wide v2, v12

    move-wide v4, v14

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    const-string v0, "TRACK_SEQUENCE_DATA"

    move-object/from16 v1, v18

    move-wide v2, v12

    move-wide v4, v14

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    move-object/from16 v0, v21

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setSamplePoints(Ljava/util/List;)V

    .line 156
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    goto/16 :goto_0

    .line 158
    :cond_5
    return-object v8
.end method

.method public c(Lo/crd;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;)Lcom/huawei/hihealth/HiHealthData;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 199
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 200
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->c(I)V

    .line 201
    invoke-static {v2, p1}, Lo/crd;->b(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V

    .line 202
    const/16 v0, 0x7531

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 203
    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 204
    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 205
    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getEndTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 206
    return-object v2
.end method

.method public d(Lo/crd;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 191
    invoke-virtual {p0, p1, p2}, Lo/ctb;->c(Lo/crd;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    .line 192
    invoke-virtual {v0, p3}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 193
    invoke-virtual {v0, p4}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 194
    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/data/model/HiTrackMetaData;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;)Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;
    .locals 14

    .line 162
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getTotalTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 163
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getTotalDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 164
    invoke-virtual {p1, v4, v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 165
    invoke-virtual {p1, v6}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 166
    if-nez v6, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    long-to-float v0, v4

    int-to-float v1, v6

    div-float v7, v0, v1

    .line 167
    :goto_0
    invoke-virtual {p1, v7}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 168
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getTotalSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 169
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getTotalCalories()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 170
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getRecordId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportId(Ljava/lang/String;)V

    .line 171
    const-string v0, "Debug_MotionPathDataSwitchHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getSportType()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->b(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 173
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getPaceMap()Ljava/util/Map;

    move-result-object v8

    .line 174
    new-instance v9, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;

    invoke-direct {v9}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;-><init>()V

    .line 175
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 176
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 177
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    .line 178
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map$Entry;

    .line 179
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    goto :goto_1

    .line 181
    :cond_1
    invoke-virtual {p1, v10}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 182
    invoke-virtual {v9, v10}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 184
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getAbnormalTrack()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAbnormalTrack(I)V

    .line 185
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getDuplicateTrack()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 186
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 187
    return-object v9
.end method

.method public e(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;>;"
        }
    .end annotation

    .line 56
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_1
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v4

    .line 60
    sget-object v0, Lo/ctb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v5

    .line 61
    if-nez v5, :cond_2

    .line 62
    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 67
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;-><init>()V

    .line 68
    invoke-virtual {v5}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 69
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setStartTime(Ljava/lang/Long;)V

    .line 70
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setEndTime(Ljava/lang/Long;)V

    .line 71
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTimeZone(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v10

    .line 73
    invoke-static {v10}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    const-string v0, "Debug_MotionPathDataSwitchHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localTrackToCloudByUnite localTrack metaData error ,it is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    goto :goto_0

    .line 77
    :cond_3
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v10, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 78
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setAbnormalTrack(Ljava/lang/Integer;)V

    .line 79
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setDuplicateTrack(Ljava/lang/Integer;)V

    .line 80
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v0

    invoke-static {v0}, Lo/cva;->c(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setSportType(Ljava/lang/Integer;)V

    .line 81
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalCalories(Ljava/lang/Integer;)V

    .line 82
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalDistance(Ljava/lang/Integer;)V

    .line 83
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalSteps()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalSteps(Ljava/lang/Integer;)V

    .line 84
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setTotalTime(Ljava/lang/Long;)V

    .line 85
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setPartTimeMap(Ljava/util/Map;)V

    .line 86
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getVendor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setVendor(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCoordinate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setCoordinate(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lo/ctb;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setPaceMap(Ljava/util/Map;)V

    .line 90
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setSportDataSource(I)V

    .line 91
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 92
    new-instance v13, Lcom/huawei/hwcloudmodel/model/unite/Location;

    invoke-direct {v13}, Lcom/huawei/hwcloudmodel/model/unite/Location;-><init>()V

    .line 93
    const-string v0, "gps point is in attribute HW_EXT_TRACK_DETAIL,not here"

    invoke-virtual {v13, v0}, Lcom/huawei/hwcloudmodel/model/unite/Location;->setName(Ljava/lang/String;)V

    .line 94
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {v7, v12}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setLocation(Ljava/util/List;)V

    .line 96
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v14

    .line 97
    invoke-static {v14}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 98
    const-string v0, "Debug_MotionPathDataSwitchHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localTrackToCloudByUnite localTrack sequenceData error ,it is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    goto/16 :goto_0

    .line 101
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HW_EXT_TRACK_DETAIL@is"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "HW_EXT_TRACK_SIMPLIFY"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "@is"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 102
    invoke-virtual {v7, v15}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->setAttribute(Ljava/lang/String;)V

    .line 103
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    goto/16 :goto_0

    .line 105
    :cond_5
    return-object v6
.end method
