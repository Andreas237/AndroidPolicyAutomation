.class public Lo/csz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/csy;

.field private e:Lo/crc;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csz;->b:Landroid/content/Context;

    .line 43
    iget-object v0, p0, Lo/csz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/crc;->b(Landroid/content/Context;)Lo/crc;

    move-result-object v0

    iput-object v0, p0, Lo/csz;->e:Lo/crc;

    .line 44
    iget-object v0, p0, Lo/csz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/csy;->e(Landroid/content/Context;)Lo/csy;

    move-result-object v0

    iput-object v0, p0, Lo/csz;->c:Lo/csy;

    .line 45
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;JJILo/crd;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;JJILo/crd;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 179
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 180
    if-lez p6, :cond_0

    .line 181
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 184
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v14

    .line 185
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1e

    int-to-float v15, v0

    .line 186
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchAltitude()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v16, v0, v1

    .line 187
    sub-float v0, v15, v16

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    move/from16 v17, v15

    goto :goto_0

    :cond_1
    move/from16 v17, v16

    .line 188
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v18

    .line 189
    invoke-static {v13}, Lo/cno;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v14}, Lo/cno;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move/from16 v0, v17

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_3

    .line 190
    :cond_2
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportHealth STEP or CALORIE is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    return-object v12

    .line 193
    :cond_3
    invoke-static {v13}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 194
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    int-to-double v6, v13

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const/4 v5, 0x2

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_4
    invoke-static {v14}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 197
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    int-to-double v6, v14

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const/4 v5, 0x4

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    :cond_5
    invoke-static/range {v18 .. v18}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 200
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move/from16 v5, v18

    int-to-double v6, v5

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const/4 v5, 0x3

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_6
    invoke-static/range {v17 .. v17}, Lo/cno;->b(F)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 203
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move/from16 v5, v17

    float-to-double v6, v5

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const/4 v5, 0x5

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_7
    return-object v12
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 146
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getSamplePoints()Ljava/util/List;

    move-result-object v5

    .line 147
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 148
    :cond_0
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloudSportDataToHiHealthDatasBySamplePoint samplePoints is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 152
    :cond_1
    iget-object v0, p0, Lo/csz;->e:Lo/crc;

    iget-object v1, p0, Lo/csz;->b:Landroid/content/Context;

    invoke-static {v1}, Lo/cui;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move/from16 v4, p2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v6

    .line 153
    if-nez v6, :cond_2

    .line 154
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchToHiHealthDatas hiHealthContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/crd;->c(I)V

    .line 158
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 160
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getMetadata()Ljava/lang/String;

    move-result-object v9

    .line 161
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v10, v0

    .line 164
    const/4 v14, 0x0

    :goto_0
    int-to-long v0, v14

    cmp-long v0, v0, v10

    if-gez v0, :cond_4

    .line 165
    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    .line 166
    invoke-static {v12}, Lo/cue;->b(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v13

    .line 167
    const/4 v0, 0x0

    if-ne v0, v13, :cond_3

    .line 168
    goto :goto_1

    .line 170
    :cond_3
    invoke-virtual {v13, v8}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v13, v9}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 172
    invoke-static {v13, v6}, Lo/crd;->b(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V

    .line 173
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 175
    :cond_4
    return-object v7
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 72
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 74
    :sswitch_0
    invoke-direct {p0, p1, p2}, Lo/csz;->c(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 76
    :sswitch_1
    invoke-direct {p0, p1, p2}, Lo/csz;->a(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 78
    :goto_0
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloudSportDatasToHiHealthDatas no such hiSyncModel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 103
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v12

    .line 104
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getEndTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getSportBasicInfos()[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v16

    .line 106
    move-object/from16 v0, v16

    array-length v0, v0

    int-to-long v1, v0

    move-wide/from16 v17, v1

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csz;->e:Lo/crc;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getAppType()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move/from16 v4, p2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v19

    .line 109
    if-nez v19, :cond_0

    .line 110
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchToHiHealthDatas hiHealthContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, 0x0

    return-object v0

    .line 113
    :cond_0
    move-object/from16 v0, v19

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/crd;->c(I)V

    .line 114
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->e(I)I

    move-result v20

    .line 115
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getTimeZone()Ljava/lang/String;

    move-result-object v21

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getMetadata()Ljava/lang/String;

    move-result-object v22

    .line 117
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 119
    move/from16 v0, v20

    const/16 v1, 0x55f0

    if-le v0, v1, :cond_2

    move/from16 v0, v20

    const/16 v1, 0x5653

    if-ge v0, v1, :cond_2

    .line 120
    move-wide/from16 v24, v12

    :goto_0
    cmp-long v0, v24, v14

    if-gez v0, :cond_1

    .line 121
    move-object/from16 v0, p0

    move-wide/from16 v1, v24

    const-wide/32 v3, 0xea60

    add-long v3, v3, v24

    move/from16 v5, v20

    move-object/from16 v9, v19

    move-object/from16 v10, v22

    move-object/from16 v11, v21

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v11}, Lo/csz;->d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    const-wide/32 v0, 0xea60

    add-long v24, v24, v0

    goto :goto_0

    .line 124
    :cond_1
    return-object v23

    .line 131
    :cond_2
    const/16 v29, 0x0

    :goto_1
    move/from16 v0, v29

    int-to-long v0, v0

    cmp-long v0, v0, v17

    if-gez v0, :cond_4

    .line 132
    aget-object v28, v16, v29

    .line 133
    move/from16 v0, v29

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long v24, v12, v0

    .line 134
    const-wide/32 v0, 0xea60

    add-long v26, v24, v0

    .line 135
    move-object/from16 v0, p0

    move-object/from16 v1, v28

    move-wide/from16 v2, v24

    move-wide/from16 v4, v26

    move/from16 v6, v20

    move-object/from16 v7, v19

    move-object/from16 v8, v22

    move-object/from16 v9, v21

    invoke-direct/range {v0 .. v9}, Lo/csz;->a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;JJILo/crd;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v30

    .line 136
    invoke-interface/range {v30 .. v30}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    .line 137
    :cond_3
    move-object/from16 v0, v23

    move-object/from16 v1, v30

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 131
    :goto_2
    add-int/lit8 v29, v29, 0x1

    goto :goto_1

    .line 139
    :cond_4
    return-object v23
.end method

.method private d(JJIDILo/crd;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 1
    .param p9    # Lo/crd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 210
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 211
    invoke-virtual {v0, p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 212
    invoke-virtual {v0, p3, p4}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 213
    invoke-virtual {v0, p5}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 214
    invoke-virtual {v0, p6, p7}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 215
    invoke-virtual {v0, p10}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v0, p11}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v0, p8}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 218
    invoke-static {v0, p9}, Lo/crd;->b(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V

    .line 219
    return-object v0
.end method


# virtual methods
.method public b(Ljava/util/List;II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 51
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;

    .line 56
    if-nez v3, :cond_3

    .line 57
    goto :goto_0

    .line 59
    :cond_3
    invoke-direct {p0, v3, p2, p3}, Lo/csz;->b(Lcom/huawei/hwcloudmodel/model/unite/SportDetail;II)Ljava/util/List;

    move-result-object v4

    .line 60
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 61
    goto :goto_0

    .line 63
    :cond_4
    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 64
    goto :goto_0

    .line 65
    :cond_5
    return-object v1
.end method

.method public c(Ljava/util/List;II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;"
        }
    .end annotation

    .line 87
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 90
    :sswitch_0
    iget-object v0, p0, Lo/csz;->c:Lo/csy;

    invoke-virtual {v0, p1, p2}, Lo/csy;->e(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 92
    :sswitch_1
    iget-object v0, p0, Lo/csz;->c:Lo/csy;

    invoke-virtual {v0, p1}, Lo/csy;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 94
    :goto_0
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localDataToCloud no such hiSyncModel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
