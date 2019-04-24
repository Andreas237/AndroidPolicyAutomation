.class public Lo/cru;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqz;

.field private b:Lo/cpv;

.field private e:Lo/cqy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-static {p1}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    iput-object v0, p0, Lo/cru;->b:Lo/cpv;

    .line 43
    iget-object v0, p0, Lo/cru;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/cru;->a:Lo/cqz;

    .line 44
    iget-object v0, p0, Lo/cru;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/cru;->e:Lo/cqy;

    .line 45
    return-void
.end method

.method private a(JJLo/cob;I)Z
    .locals 8

    .line 71
    iget-object v0, p0, Lo/cru;->a:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p6, v2}, Lo/cqz;->a(III)I

    move-result v4

    .line 72
    invoke-virtual {p5, v4}, Lo/cob;->b(I)V

    .line 73
    if-gtz v4, :cond_0

    .line 74
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepDataByUser() statClient <= 0, userID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    iget-object v0, p0, Lo/cru;->e:Lo/cqy;

    invoke-virtual {v0, p6}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v5

    .line 78
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepDataByUser() statClients is null, userID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_1
    new-instance v6, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 83
    invoke-virtual {v6, p1, p2}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 84
    invoke-virtual {v6, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 86
    iget-object v0, p0, Lo/cru;->b:Lo/cpv;

    const/16 v1, 0x5654

    const/16 v2, 0x56b7

    invoke-virtual {v0, v6, v5, v1, v2}, Lo/cpv;->e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v7

    .line 90
    invoke-direct {p0, p5, v7}, Lo/cru;->d(Lo/cob;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method private a(Lo/cob;DII)Z
    .locals 1

    .line 204
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 205
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 206
    invoke-virtual {p1, p5}, Lo/cob;->i(I)V

    .line 207
    iget-object v0, p0, Lo/cru;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private c(Lo/cob;Ljava/util/List;II)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cob;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)Z"
        }
    .end annotation

    .line 162
    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statCount() sleepDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x0

    return v0

    .line 166
    :cond_0
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statCount() deepDatas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",minTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",statType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v7, 0x0

    .line 172
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v12

    .line 173
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_4

    .line 174
    add-int/lit8 v7, v7, 0x1

    .line 175
    move-object/from16 v0, p2

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v8

    .line 177
    add-int/lit8 v0, v12, -0x1

    if-lt v13, v0, :cond_1

    .line 178
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statCount break i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    move/from16 v0, p3

    if-lt v7, v0, :cond_4

    .line 180
    add-int/lit8 v6, v6, 0x1

    .line 181
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statCount break count 2 is ture count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 185
    :cond_1
    add-int/lit8 v0, v13, 0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    sub-long/2addr v0, v8

    const-wide/32 v2, 0xea60

    div-long v10, v0, v2

    .line 187
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-gtz v0, :cond_2

    .line 188
    goto :goto_1

    .line 191
    :cond_2
    move/from16 v0, p3

    if-lt v7, v0, :cond_3

    .line 192
    add-int/lit8 v6, v6, 0x1

    .line 193
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statCount count 1 is ture count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ", duration = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :cond_3
    const/4 v7, 0x0

    .line 173
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 198
    :cond_4
    :goto_2
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statCount statType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",count = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ",date = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    move-object v0, p0

    move-object v1, p1

    int-to-double v2, v6

    move/from16 v4, p4

    const/16 v5, 0x10

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 200
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lo/cob;Ljava/util/List;)Z
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cob;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 94
    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepData() sleepDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_0
    const-string v0, "HiH_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepData, date="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepData() sleepDatas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const-wide/16 v6, 0x0

    .line 101
    const-wide/16 v8, 0x0

    .line 102
    const-wide/16 v10, 0x0

    .line 103
    const-wide/16 v12, 0x0

    .line 104
    const-wide/16 v14, 0x0

    .line 108
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v19

    .line 110
    const/16 v20, 0x0

    :goto_0
    move/from16 v0, v20

    move/from16 v1, v19

    if-ge v0, v1, :cond_1

    .line 111
    move-object/from16 v0, p2

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealth/HiHealthData;

    .line 112
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v17

    .line 113
    packed-switch v17, :pswitch_data_0

    goto :goto_1

    .line 115
    :pswitch_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v6, v0

    .line 116
    goto :goto_1

    .line 118
    :pswitch_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v8, v0

    .line 119
    goto :goto_1

    .line 121
    :pswitch_2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v12, v0

    .line 122
    goto :goto_1

    .line 124
    :pswitch_3
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v10, v0

    .line 125
    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    goto :goto_1

    .line 128
    :pswitch_4
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v14, v0

    .line 110
    .line 129
    :goto_1
    add-int/lit8 v20, v20, 0x1

    goto :goto_0

    .line 135
    :cond_1
    add-double v0, v6, v8

    add-double v20, v0, v12

    .line 137
    invoke-static/range {p2 .. p2}, Lo/cuv;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v22

    .line 138
    const-string v0, "core_sleep_start_time_key"

    move-object/from16 v1, v22

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    .line 139
    const-string v0, "core_sleep_end_time_key"

    move-object/from16 v1, v22

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v25

    .line 143
    const-string v0, "HiH_HiCoreSleepStat"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cst="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xe

    aput-object v2, v1, v3

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v20

    const v4, 0xac49

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 145
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v6

    const v4, 0xac46

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 146
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v8

    const v4, 0xac47

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 147
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v12

    const v4, 0xac45

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 148
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v10

    const v4, 0xac48

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 149
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v14

    const v4, 0xac4c

    const/16 v5, 0xf

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 150
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    const/4 v3, 0x1

    const v4, 0xac4b

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cru;->c(Lo/cob;Ljava/util/List;II)Z

    .line 151
    const-wide/16 v0, 0x0

    cmp-long v0, v23, v0

    if-lez v0, :cond_2

    .line 152
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v23

    long-to-double v2, v2

    const v4, 0xaca9

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 154
    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, v25, v0

    if-lez v0, :cond_3

    .line 155
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v25

    long-to-double v2, v2

    const v4, 0xacaa

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cru;->a(Lo/cob;DII)Z

    .line 157
    :cond_3
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x5655
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 16

    .line 49
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() coreSleepData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 51
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v9

    .line 52
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->m(J)J

    move-result-wide v10

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->p(J)J

    move-result-wide v12

    .line 54
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() coreSleepStartTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", coreSleepEndTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    new-instance v14, Lo/cob;

    invoke-direct {v14}, Lo/cob;-><init>()V

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->n(J)J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lo/cob;->a(J)V

    .line 58
    invoke-virtual {v14, v9}, Lo/cob;->e(I)V

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/cob;->f(I)V

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/cob;->d(I)V

    .line 63
    move-object/from16 v0, p0

    move-wide v1, v10

    move-wide v3, v12

    move-object v5, v14

    move v6, v9

    invoke-direct/range {v0 .. v6}, Lo/cru;->a(JJLo/cob;I)Z

    move-result v15

    .line 65
    const-string v0, "Debug_HiCoreSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() coreSleepTotalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return v15
.end method
