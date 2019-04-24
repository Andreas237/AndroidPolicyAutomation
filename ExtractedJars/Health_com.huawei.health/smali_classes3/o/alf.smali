.class public abstract Lo/alf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Landroid/content/Context;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const-string v0, "AchieveAMedalsInteractors"

    iput-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 189
    const/16 v0, 0x101

    if-eq v0, p1, :cond_0

    const/16 v0, 0x102

    if-eq v0, p1, :cond_0

    const/16 v0, 0x108

    if-eq v0, p1, :cond_0

    const/16 v0, 0x103

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 11

    .line 154
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceFileUrl()Ljava/lang/String;

    move-result-object v4

    .line 155
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_0
    iget-object v0, p0, Lo/alf;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/cea;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cex;

    move-result-object v5

    .line 160
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 161
    invoke-virtual {v5}, Lo/cex;->e()Ljava/util/Map;

    move-result-object v6

    .line 162
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 163
    const/4 v7, 0x0

    .line 164
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 165
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 167
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v10

    .line 168
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-nez v0, :cond_1

    .line 169
    move v7, v10

    .line 171
    :cond_1
    cmpg-float v0, v7, v10

    if-gez v0, :cond_2

    .line 172
    move v7, v10

    .line 174
    :cond_2
    goto :goto_0

    .line 175
    :cond_3
    return v7

    .line 179
    :cond_4
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 204
    iget-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "called when wear data changed !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    new-instance v5, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 206
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 207
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 208
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 210
    iget-object v0, p0, Lo/alf;->b:Landroid/content/Context;

    const-string v1, "_syncWearTimtstamp"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 211
    invoke-virtual {p0}, Lo/alf;->d()J

    move-result-wide v8

    .line 212
    iget-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sevendaybefore timestamp get is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-wide v0, v8

    goto :goto_0

    :cond_0
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lo/alf;->e:J

    .line 214
    iget-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timestamp get is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/alf;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/alf;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 217
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dxc;->c(JZ)J

    move-result-wide v0

    iput-wide v0, p0, Lo/alf;->e:J

    .line 218
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 219
    const-string v0, "_syncWearTimtstamp"

    iget-wide v1, p0, Lo/alf;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    iget-object v0, p0, Lo/alf;->b:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 223
    :cond_1
    iget-wide v0, p0, Lo/alf;->e:J

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->i(J)J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 226
    iget-object v0, p0, Lo/alf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/alf$5;

    invoke-direct {v1, p0, p1}, Lo/alf$5;-><init>(Lo/alf;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 266
    return-void

    nop

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method protected c(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/pluginachievement/manager/model/TrackData;>;)V"
        }
    .end annotation

    .line 57
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 59
    const-string v0, "track"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 60
    const-string v0, "com.huawei.healthcloud.action.sendSportTrackDistance"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    iget-object v0, p0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " ====sendDistanceBroadcast==== "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lo/alf;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/ccd;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 64
    :cond_0
    return-void
.end method

.method protected d()J
    .locals 6

    .line 193
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 196
    const/4 v3, -0x7

    .line 197
    const/4 v0, 0x6

    invoke-virtual {v2, v0, v3}, Ljava/util/Calendar;->add(II)V

    .line 198
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 199
    return-wide v4
.end method

.method protected d(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/ArrayList<Lcom/huawei/pluginachievement/manager/model/TrackData;>;"
        }
    .end annotation

    .line 69
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 71
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->b:Landroid/content/Context;

    const-string v1, "_syncWearTimtstamp"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 72
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "search recentstamp is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lo/alf;->d()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    move-object/from16 v2, p0

    iput-wide v0, v2, Lo/alf;->e:J

    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the size of singlerun records from HiHealth is 0! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    return-object v5

    .line 79
    :cond_1
    const/4 v8, -0x1

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "single records size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 83
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v12

    .line 84
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v13

    .line 85
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v15

    .line 86
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/alf;->e:J

    cmp-long v0, v13, v0

    if-lez v0, :cond_3

    .line 87
    move-object/from16 v0, p0

    iput-wide v13, v0, Lo/alf;->e:J

    .line 88
    const/4 v7, 0x1

    .line 91
    :cond_3
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v12, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_2

    .line 92
    :catch_0
    move-exception v17

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackMetaData is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    goto :goto_1

    .line 96
    :goto_2
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v17

    .line 97
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v18

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAbnormalTrack="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    move/from16 v1, v18

    if-eq v0, v1, :cond_4

    .line 100
    goto/16 :goto_1

    .line 102
    :cond_4
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v19

    .line 103
    const/4 v0, 0x2

    move/from16 v1, v19

    if-eq v0, v1, :cond_5

    const/4 v0, 0x3

    move/from16 v1, v19

    if-ne v0, v1, :cond_6

    .line 104
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SportDataSource="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    goto/16 :goto_1

    .line 107
    :cond_6
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v20

    .line 108
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v21

    .line 109
    new-instance v22, Lcom/huawei/pluginachievement/manager/model/TrackData;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/pluginachievement/manager/model/TrackData;-><init>()V

    .line 110
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveDistance(F)V

    .line 111
    move-object/from16 v0, v22

    invoke-virtual {v0, v13, v14}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveTrackTime(J)V

    .line 112
    move-object/from16 v0, v22

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveType(I)V

    .line 113
    move-object/from16 v0, v22

    move-wide v1, v15

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveEndTime(J)V

    .line 114
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->savePaceMap(Ljava/util/Map;)V

    .line 115
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->savePartTimeMap(Ljava/util/Map;)V

    .line 116
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestPace()F

    move-result v23

    .line 117
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_9

    .line 118
    :cond_7
    const/4 v0, 0x0

    cmpl-float v0, v23, v0

    if-nez v0, :cond_8

    .line 119
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/alf;->c(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v23

    .line 121
    :cond_8
    move-object/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveBestPace(F)V

    goto :goto_3

    .line 123
    :cond_9
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getBestPace()F

    move-result v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveBestPace(F)V

    .line 125
    :goto_3
    invoke-virtual {v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->saveSportDataSource(I)V

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "whole data from hihealth studio is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-direct {v0, v1}, Lo/alf;->a(I)Z

    move-result v0

    if-eqz v0, :cond_a

    move/from16 v0, v21

    if-le v0, v8, :cond_a

    .line 128
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 129
    move-object/from16 v0, v22

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_a
    goto/16 :goto_1

    .line 137
    :cond_b
    if-eqz v7, :cond_c

    .line 138
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 139
    const-string v0, "_syncWearTimtstamp"

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/alf;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->b:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/alf;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timestamp saved is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/alf;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :cond_c
    return-object v5
.end method
