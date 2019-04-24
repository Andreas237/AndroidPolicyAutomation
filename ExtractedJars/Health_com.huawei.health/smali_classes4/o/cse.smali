.class public Lo/cse;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqh;

.field private b:Lo/cqz;

.field private e:Lo/cqy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 38
    iget-object v0, p0, Lo/cse;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/cse;->b:Lo/cqz;

    .line 39
    iget-object v0, p0, Lo/cse;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/cse;->e:Lo/cqy;

    .line 40
    iget-object v0, p0, Lo/cse;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/cse;->a:Lo/cqh;

    .line 41
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 9

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v4

    .line 54
    iget-object v0, p0, Lo/cse;->b:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lo/cqz;->a(III)I

    move-result v5

    .line 55
    if-gtz v5, :cond_0

    .line 56
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statStressAndRelaxationDataByUser()  statClient <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    iget-object v0, p0, Lo/cse;->e:Lo/cqy;

    invoke-virtual {v0, v4}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v6

    .line 60
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statStressAndRelaxationDataByUser()  statClients <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    invoke-direct {p0, v6, v5, v4, p1}, Lo/cse;->e(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z

    move-result v7

    .line 65
    invoke-direct {p0, v6, v5, v4, p1}, Lo/cse;->c(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z

    move-result v8

    .line 66
    and-int v0, v7, v8

    return v0
.end method

.method private a(Ljava/util/List;Ljava/util/List;Lo/cob;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/cob;)Z"
        }
    .end annotation

    .line 129
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressStat()  statDatas is null day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    return v0

    .line 138
    :cond_0
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 139
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 140
    const-string v0, "stress_score_max"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 141
    const-string v0, "stress_score_min"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 142
    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 143
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 144
    const-string v0, "stress_score_max"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v0, v6, v0

    if-lez v0, :cond_1

    move-wide v0, v6

    goto :goto_0

    :cond_1
    const-string v0, "stress_score_max"

    .line 145
    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    :goto_0
    move-wide v6, v0

    .line 146
    const-string v0, "stress_score_min"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_2

    move-wide v0, v8

    goto :goto_1

    :cond_2
    const-string v0, "stress_score_min"

    .line 147
    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    :goto_1
    move-wide v8, v0

    goto :goto_2

    .line 150
    :cond_3
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 151
    const-string v0, "stress_score_max"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 152
    const-string v0, "stress_score_min"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 155
    :cond_4
    :goto_2
    const v0, 0xad6f

    invoke-direct {p0, p3, v6, v7, v0}, Lo/cse;->e(Lo/cob;DI)Z

    move-result v10

    .line 156
    const v0, 0xad0c

    invoke-direct {p0, p3, v8, v9, v0}, Lo/cse;->e(Lo/cob;DI)Z

    move-result v11

    .line 157
    if-eqz v10, :cond_5

    if-eqz v11, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    return v0
.end method

.method private c(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;IILcom/huawei/hihealth/HiHealthData;)Z"
        }
    .end annotation

    .line 103
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v7

    .line 104
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v9

    .line 105
    const/16 v11, 0x7e5

    .line 107
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cse;->a:Lo/cqh;

    move-object/from16 v1, p1

    move-wide v2, v7

    move-wide v4, v9

    move v6, v11

    const/16 v6, 0x7e5

    invoke-virtual/range {v0 .. v6}, Lo/cqh;->a(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v12

    .line 108
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRelaxationDataStat()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    new-instance v13, Lo/cob;

    invoke-direct {v13}, Lo/cob;-><init>()V

    .line 111
    invoke-virtual {v13, v7, v8}, Lo/cob;->a(J)V

    .line 112
    move/from16 v0, p3

    invoke-virtual {v13, v0}, Lo/cob;->e(I)V

    .line 113
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v13, v0}, Lo/cob;->f(I)V

    .line 114
    invoke-virtual {v13, v11}, Lo/cob;->d(I)V

    .line 115
    const/16 v0, 0x10

    invoke-virtual {v13, v0}, Lo/cob;->i(I)V

    .line 116
    move/from16 v0, p2

    invoke-virtual {v13, v0}, Lo/cob;->b(I)V

    .line 118
    const-wide/16 v14, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 121
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    add-long/2addr v14, v0

    .line 122
    add-int/lit8 v16, v16, 0x1

    .line 123
    goto :goto_0

    .line 125
    :cond_0
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v14, v15, v1, v13}, Lo/cse;->e(JILo/cob;)Z

    move-result v0

    return v0
.end method

.method private e(JILo/cob;)Z
    .locals 10

    .line 161
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    .line 162
    :cond_0
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRelaxationStat() toatltime or totalcount is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_1
    int-to-double v4, p3

    .line 166
    long-to-double v0, p1

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double v6, v0, v2

    .line 167
    const v0, 0xad0f

    invoke-direct {p0, p4, v4, v5, v0}, Lo/cse;->e(Lo/cob;DI)Z

    move-result v8

    .line 168
    const/16 v0, 0xf

    invoke-virtual {p4, v0}, Lo/cob;->i(I)V

    .line 169
    const v0, 0xad0e

    invoke-direct {p0, p4, v6, v7, v0}, Lo/cse;->e(Lo/cob;DI)Z

    move-result v9

    .line 171
    if-eqz v8, :cond_2

    if-eqz v9, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;IILcom/huawei/hihealth/HiHealthData;)Z"
        }
    .end annotation

    .line 70
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v11

    .line 71
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v13

    .line 72
    const/16 v15, 0x7e3

    .line 73
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v16, v0

    const-string v0, "stress_score_max"

    const/4 v1, 0x0

    aput-object v0, v16, v1

    const-string v0, "stress_score_min"

    const/4 v1, 0x1

    aput-object v0, v16, v1

    .line 76
    const/16 v17, 0x2

    move/from16 v0, v17

    new-array v0, v0, [I

    move-object/from16 v17, v0

    fill-array-data v17, :array_0

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cse;->a:Lo/cqh;

    move-object/from16 v1, p1

    move-wide v2, v11

    move-wide v4, v13

    move v7, v15

    move-object/from16 v8, v16

    move-object/from16 v9, v17

    const/4 v6, 0x3

    const/16 v7, 0x7e3

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/cqh;->e(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;

    move-result-object v18

    .line 80
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDataStat()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v18, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/16 v15, 0x7e4

    .line 84
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cse;->a:Lo/cqh;

    move-object/from16 v1, p1

    move-wide v2, v11

    move-wide v4, v13

    move v7, v15

    move-object/from16 v8, v16

    move-object/from16 v9, v17

    const/4 v6, 0x3

    const/16 v7, 0x7e4

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/cqh;->e(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;

    move-result-object v19

    .line 86
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDataStat()  statDatas is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    new-instance v20, Lo/cob;

    invoke-direct/range {v20 .. v20}, Lo/cob;-><init>()V

    .line 89
    move-object/from16 v0, v20

    invoke-virtual {v0, v11, v12}, Lo/cob;->a(J)V

    .line 90
    move-object/from16 v0, v20

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/cob;->e(I)V

    .line 91
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/cob;->f(I)V

    .line 92
    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lo/cob;->d(I)V

    .line 93
    move-object/from16 v0, v20

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/cob;->i(I)V

    .line 94
    move-object/from16 v0, v20

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cob;->b(I)V

    .line 95
    const-string v0, "Debug_HiStressAndRelaxtionStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDataStat()  statTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    invoke-direct {v0, v1, v2, v3}, Lo/cse;->a(Ljava/util/List;Ljava/util/List;Lo/cob;)Z

    move-result v21

    .line 99
    return v21

    :array_0
    .array-data 4
        0x4
        0x5
    .end array-data
.end method

.method private e(Lo/cob;DI)Z
    .locals 4

    .line 175
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    .line 176
    const-string v0, "Debug_HiStressAndRelaxtionStat"

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

    .line 177
    const/4 v0, 0x0

    return v0

    .line 179
    :cond_0
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 180
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 181
    iget-object v0, p0, Lo/cse;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 4

    .line 45
    const-string v0, "Debug_HiStressAndRelaxtionStat"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-direct {p0, p1}, Lo/cse;->a(Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    return v0
.end method
