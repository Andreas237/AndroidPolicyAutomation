.class public Lo/crx;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqg;

.field private b:Lo/cqz;

.field private e:Lo/cqn;

.field private f:Lo/cqy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-static {p1}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/crx;->e:Lo/cqn;

    .line 42
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crx;->b:Lo/cqz;

    .line 43
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crx;->f:Lo/cqy;

    .line 44
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/crx;->a:Lo/cqg;

    .line 45
    return-void
.end method

.method private b(Lo/cob;DI)Z
    .locals 4

    .line 197
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    .line 198
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneStat()  statValue <= 0 statType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x0

    return v0

    .line 201
    :cond_0
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 202
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 203
    iget-object v0, p0, Lo/crx;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/util/List;Ljava/util/List;Lo/cob;)Z
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/cob;)Z"
        }
    .end annotation

    .line 127
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHeartRateStat()  statDatas and statDatas2 are null day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p3 .. p3}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_0
    const-wide/16 v9, 0x0

    .line 137
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "maxHeartRate"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 139
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "minHeartRate"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 140
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "avgRestingHeartRate"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 142
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c2

    invoke-direct {v0, v1, v11, v12, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v4

    .line 143
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c0

    invoke-direct {v0, v1, v7, v8, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v5

    .line 144
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c1

    invoke-direct {v0, v1, v9, v10, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v6

    .line 145
    if-eqz v4, :cond_1

    if-eqz v5, :cond_1

    if-eqz v6, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 147
    :cond_2
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "maxHeartRate"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 149
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "minHeartRate"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 151
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c0

    invoke-direct {v0, v1, v7, v8, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v5

    .line 152
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c1

    invoke-direct {v0, v1, v9, v10, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v6

    .line 153
    if-eqz v5, :cond_3

    if-eqz v6, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 155
    :cond_4
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 156
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 157
    const-string v0, "maxHeartRate"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v15

    .line 158
    const-string v0, "maxHeartRate"

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v17

    .line 159
    const-string v0, "minHeartRate"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v19

    .line 160
    const-string v0, "minHeartRate"

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v21

    .line 162
    const-string v0, "avgRestingHeartRate"

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 163
    cmpl-double v0, v15, v17

    if-lez v0, :cond_5

    move-wide v7, v15

    goto :goto_2

    :cond_5
    move-wide/from16 v7, v17

    .line 164
    :goto_2
    cmpg-double v0, v19, v21

    if-gez v0, :cond_6

    move-wide/from16 v9, v19

    goto :goto_3

    :cond_6
    move-wide/from16 v9, v21

    .line 166
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c2

    invoke-direct {v0, v1, v11, v12, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v4

    .line 167
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c0

    invoke-direct {v0, v1, v7, v8, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v5

    .line 168
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v9, v0

    if-lez v0, :cond_7

    .line 169
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const v2, 0xb3c1

    invoke-direct {v0, v1, v9, v10, v2}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v6

    goto :goto_4

    .line 171
    :cond_7
    const/4 v6, 0x1

    .line 173
    :goto_4
    if-eqz v4, :cond_8

    if-eqz v5, :cond_8

    if-eqz v6, :cond_8

    const/4 v0, 0x1

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    :goto_5
    return v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 29

    .line 73
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v11

    .line 74
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->b:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v11, v2}, Lo/cqz;->a(III)I

    move-result v12

    .line 75
    if-gtz v12, :cond_0

    .line 76
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statHeartRateDataByUser()  statClient <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x0

    return v0

    .line 79
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->f:Lo/cqy;

    invoke-virtual {v0, v11}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v13

    .line 80
    invoke-static {v13}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statHeartRateDataByUser()  statClients <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x0

    return v0

    .line 84
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v14

    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v16

    .line 86
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() statHeartRateDataByUser startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/16 v18, 0x7d2

    .line 88
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v19, v0

    const-string v0, "avgRestingHeartRate"

    const/4 v1, 0x0

    aput-object v0, v19, v1

    const-string v0, "maxHeartRate"

    const/4 v1, 0x1

    aput-object v0, v19, v1

    const-string v0, "minHeartRate"

    const/4 v1, 0x2

    aput-object v0, v19, v1

    .line 92
    const/16 v20, 0x7e2

    .line 93
    const/16 v21, 0x3

    move/from16 v0, v21

    new-array v0, v0, [I

    move-object/from16 v21, v0

    fill-array-data v21, :array_0

    .line 95
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->e:Lo/cqn;

    move-object v1, v13

    move-wide v2, v14

    move-wide/from16 v4, v16

    move/from16 v7, v18

    move-object/from16 v8, v19

    move-object/from16 v9, v21

    const/4 v6, 0x3

    const/16 v7, 0x7d2

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/cqn;->c(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;

    move-result-object v22

    .line 97
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statHeartRateDataByUser()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v22, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->e:Lo/cqn;

    move-object v1, v13

    move-wide v2, v14

    move-wide/from16 v4, v16

    move/from16 v7, v20

    move-object/from16 v8, v19

    move-object/from16 v9, v21

    const/4 v6, 0x3

    const/16 v7, 0x7e2

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/cqn;->c(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;

    move-result-object v23

    .line 100
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statRestHeartRateDataByUser()  statDatas2 is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v23, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    new-instance v24, Lo/cob;

    invoke-direct/range {v24 .. v24}, Lo/cob;-><init>()V

    .line 103
    move-object/from16 v0, v24

    invoke-virtual {v0, v14, v15}, Lo/cob;->a(J)V

    .line 104
    move-object/from16 v0, v24

    invoke-virtual {v0, v11}, Lo/cob;->e(I)V

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cob;->f(I)V

    .line 106
    move-object/from16 v0, v24

    const v1, 0xb3bf

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 107
    move-object/from16 v0, v24

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/cob;->i(I)V

    .line 108
    move-object/from16 v0, v24

    invoke-virtual {v0, v12}, Lo/cob;->b(I)V

    .line 109
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statHeartRateDataByUser()  statTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v24, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    invoke-direct {v0, v1, v2, v3}, Lo/crx;->c(Ljava/util/List;Ljava/util/List;Lo/cob;)Z

    move-result v25

    .line 113
    new-instance v26, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct/range {v26 .. v26}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 114
    move-object/from16 v0, v26

    invoke-virtual {v0, v14, v15}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 115
    move-object/from16 v0, v26

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 116
    move-object/from16 v0, v26

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 117
    move-object/from16 v0, v26

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->a:Lo/cqg;

    move-object/from16 v1, v26

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2, v13}, Lo/cqg;->c(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v27

    .line 119
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statHeartRateDataByUser()  statLastDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v27, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crx;->a:Lo/cqg;

    move-object/from16 v1, v26

    move/from16 v2, v20

    invoke-virtual {v0, v1, v2, v13}, Lo/cqg;->c(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v28

    .line 121
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statRestHeartRateDataByUser()  statLastDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v27, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    move-object/from16 v3, v24

    invoke-direct {v0, v1, v2, v3}, Lo/crx;->d(Ljava/util/List;Ljava/util/List;Lo/cob;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v25, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :array_0
    .array-data 4
        0x3
        0x4
        0x5
    .end array-data
.end method

.method private d(Ljava/util/List;Ljava/util/List;Lo/cob;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/cob;)Z"
        }
    .end annotation

    .line 177
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveLastHeartRateStat()  statLastDatas and StatLastDatas2 are null day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_0
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v4

    .line 184
    const v0, 0xb3c3

    invoke-direct {p0, p3, v4, v5, v0}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v0

    return v0

    .line 186
    :cond_1
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v4

    .line 188
    const v0, 0xb3c3

    invoke-direct {p0, p3, v4, v5, v0}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v0

    return v0

    .line 190
    :cond_2
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    long-to-double v6, v0

    .line 191
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    long-to-double v8, v0

    .line 192
    cmpl-double v0, v6, v8

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v4

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v4

    .line 193
    :goto_0
    const v0, 0xb3c3

    invoke-direct {p0, p3, v4, v5, v0}, Lo/crx;->b(Lo/cob;DI)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 4

    .line 49
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-direct {p0, p1}, Lo/crx;->d(Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    return v0
.end method

.method public c(ILjava/util/List;JJ)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;JJ)V"
        }
    .end annotation

    .line 56
    const-string v0, "Debug_HiHeartRateAndRestHeartRateStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDBOldHeartRateData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 58
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v8

    .line 59
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    move-object v1, p2

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    const/16 v6, 0x7d2

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->b(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v9

    .line 60
    iget-object v0, p0, Lo/crx;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    move-object v1, p2

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    const/16 v6, 0x7e2

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->b(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v10

    .line 61
    invoke-interface {v7, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 62
    invoke-interface {v7, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 63
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 64
    invoke-virtual {v12, p1}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 65
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v8, v7}, Lo/crf;->c(Ljava/util/List;)V

    .line 68
    invoke-virtual {v8}, Lo/crf;->e()V

    .line 69
    return-void
.end method
