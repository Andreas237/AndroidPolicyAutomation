.class public Lo/cry;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqj;

.field private b:Lo/cqy;

.field private e:Lo/cqz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 47
    invoke-static {p1}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    iput-object v0, p0, Lo/cry;->a:Lo/cqj;

    .line 48
    iget-object v0, p0, Lo/cry;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/cry;->e:Lo/cqz;

    .line 49
    iget-object v0, p0, Lo/cry;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/cry;->b:Lo/cqy;

    .line 50
    return-void
.end method

.method private a(Lo/cob;Ljava/util/List;)Z
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cob;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 121
    invoke-static/range {p2 .. p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepData() sleepDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x0

    return v0

    .line 128
    :cond_0
    const-wide/16 v6, 0x0

    .line 129
    const-wide/16 v8, 0x0

    .line 130
    const-wide/16 v10, 0x0

    .line 131
    const/4 v12, 0x0

    .line 139
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v21

    .line 140
    const/16 v22, 0x0

    :goto_0
    move/from16 v0, v22

    move/from16 v1, v21

    if-ge v0, v1, :cond_4

    .line 141
    move-object/from16 v0, p2

    move/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 142
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v20

    .line 143
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v14

    .line 144
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v16

    .line 145
    sparse-switch v20, :sswitch_data_0

    goto :goto_1

    .line 147
    :sswitch_0
    sub-long v0, v16, v14

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    add-double/2addr v6, v0

    .line 148
    goto :goto_1

    .line 150
    :sswitch_1
    sub-long v0, v16, v14

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    add-double/2addr v8, v0

    .line 151
    .line 157
    :goto_1
    add-int/lit8 v0, v21, -0x1

    move/from16 v1, v22

    if-lt v1, v0, :cond_1

    .line 158
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statSleepData break i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    goto :goto_3

    .line 163
    :cond_1
    add-int/lit8 v0, v22, 0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    sub-long v18, v0, v16

    .line 166
    const-wide/32 v0, 0x2bf20

    cmp-long v0, v18, v0

    if-lez v0, :cond_3

    const-wide/32 v0, 0x1b7740

    cmp-long v0, v18, v0

    if-ltz v0, :cond_2

    .line 167
    goto :goto_2

    .line 170
    :cond_2
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statSleepData sleep wake is ture duration = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-wide/32 v3, 0xea60

    div-long v3, v18, v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    move-wide/from16 v0, v18

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    add-double/2addr v10, v0

    .line 172
    add-int/lit8 v12, v12, 0x1

    .line 140
    :cond_3
    :goto_2
    add-int/lit8 v22, v22, 0x1

    goto/16 :goto_0

    .line 178
    :cond_4
    :goto_3
    add-double v22, v6, v8

    .line 179
    const-wide v0, 0x40f5180000000000L    # 86400.0

    cmpl-double v0, v22, v0

    if-lez v0, :cond_5

    .line 180
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalDuration over "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-wide v2, 0x4096800000000000L    # 1440.0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mins, the value is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const-wide v22, 0x40f5180000000000L    # 86400.0

    .line 185
    :cond_5
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v24

    .line 188
    add-int/lit8 v0, v21, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v26

    .line 190
    invoke-static/range {p2 .. p2}, Lo/cuv;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v28

    .line 191
    const-string v0, "core_sleep_start_time_key"

    move-object/from16 v1, v28

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v29

    .line 192
    const-string v0, "core_sleep_end_time_key"

    move-object/from16 v1, v28

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v31

    .line 196
    const-string v0, "HiH_HiSleepStat"

    const/16 v1, 0x14

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nss=date "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ":"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

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

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xe

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x10

    aput-object v2, v1, v3

    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x12

    aput-object v2, v1, v3

    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x13

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v22

    const v4, 0xabe4

    const/16 v5, 0xd

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 198
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v6

    const v4, 0xabe1

    const/16 v5, 0xd

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 199
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v8

    const v4, 0xabe2

    const/16 v5, 0xd

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 200
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v2, v10

    const v4, 0xabe3

    const/16 v5, 0xd

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 201
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v24

    long-to-double v2, v2

    const v4, 0xabe6

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 202
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v26

    long-to-double v2, v2

    const v4, 0xabe7

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 203
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    int-to-double v2, v12

    const v4, 0xabe5

    const/16 v5, 0x10

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 204
    const-wide/16 v0, 0x0

    cmp-long v0, v29, v0

    if-lez v0, :cond_6

    .line 205
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v29

    long-to-double v2, v2

    const v4, 0xabe8

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 207
    :cond_6
    const-wide/16 v0, 0x0

    cmp-long v0, v31, v0

    if-lez v0, :cond_7

    .line 208
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, v31

    long-to-double v2, v2

    const v4, 0xabe9

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/cry;->c(Lo/cob;DII)Z

    .line 221
    :cond_7
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x55f1 -> :sswitch_0
        0x55f2 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Lo/cob;DII)Z
    .locals 1

    .line 304
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 305
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 306
    invoke-virtual {p1, p5}, Lo/cob;->i(I)V

    .line 307
    iget-object v0, p0, Lo/cry;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private d(JJLo/cob;I)Z
    .locals 9

    .line 76
    iget-object v0, p0, Lo/cry;->e:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p6, v2}, Lo/cqz;->a(III)I

    move-result v4

    .line 77
    invoke-virtual {p5, v4}, Lo/cob;->b(I)V

    .line 78
    if-gtz v4, :cond_0

    .line 79
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepDataByUser() statClient <= 0 userID = "

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
    :cond_0
    iget-object v0, p0, Lo/cry;->b:Lo/cqy;

    invoke-virtual {v0, p6}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v5

    .line 83
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statSleepDataByUser() statClients is null userID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_1
    new-instance v6, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 88
    invoke-virtual {v6, p1, p2}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 89
    invoke-virtual {v6, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 90
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 91
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 92
    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    iget-object v0, p0, Lo/cry;->a:Lo/cqj;

    invoke-virtual {v0, v6, v5, v7}, Lo/cqj;->a(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 96
    invoke-direct {p0, p5, v8}, Lo/cry;->a(Lo/cob;Ljava/util/List;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public d(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 16

    .line 54
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() sleepData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 56
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v9

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->m(J)J

    move-result-wide v10

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->p(J)J

    move-result-wide v12

    .line 59
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() sleepStartTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", sleepEndTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v14, Lo/cob;

    invoke-direct {v14}, Lo/cob;-><init>()V

    .line 62
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->n(J)J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lo/cob;->a(J)V

    .line 63
    invoke-virtual {v14, v9}, Lo/cob;->e(I)V

    .line 64
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/cob;->f(I)V

    .line 65
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/cob;->d(I)V

    .line 68
    move-object/from16 v0, p0

    move-wide v1, v10

    move-wide v3, v12

    move-object v5, v14

    move v6, v9

    invoke-direct/range {v0 .. v6}, Lo/cry;->d(JJLo/cob;I)Z

    move-result v15

    .line 70
    const-string v0, "Debug_HiSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() totalTime = "

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

    .line 71
    return v15
.end method
