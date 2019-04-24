.class public Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addSyncDoneClimbStat(Ljava/util/Map;Ljava/util/List;III)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<Lo/cob;>;III)V"
        }
    .end annotation

    .line 204
    const-string v0, "storey_sum"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 205
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;)D

    move-result-wide v3

    .line 206
    const-wide/16 v0, 0x0

    cmpl-double v0, v3, v0

    if-lez v0, :cond_0

    .line 207
    new-instance v5, Lo/cob;

    invoke-direct {v5}, Lo/cob;-><init>()V

    .line 208
    invoke-virtual {v5, p3}, Lo/cob;->c(I)V

    .line 209
    const/16 v0, 0x4e21

    invoke-virtual {v5, v0}, Lo/cob;->d(I)V

    .line 210
    const v0, 0x9c45

    invoke-virtual {v5, v0}, Lo/cob;->a(I)V

    .line 211
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    mul-double/2addr v0, v3

    invoke-virtual {v5, v0, v1}, Lo/cob;->e(D)V

    .line 212
    invoke-virtual {v5, p4}, Lo/cob;->e(I)V

    .line 213
    invoke-virtual {v5, p5}, Lo/cob;->b(I)V

    .line 214
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lo/cob;->i(I)V

    .line 215
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cob;->f(I)V

    .line 216
    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_0
    return-void
.end method

.method private addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/util/List<Lo/cob;>;IIIIII)V"
        }
    .end annotation

    .line 222
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 223
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;)D

    move-result-wide v3

    .line 224
    const-wide/16 v0, 0x0

    cmpl-double v0, v3, v0

    if-lez v0, :cond_0

    .line 225
    new-instance v5, Lo/cob;

    invoke-direct {v5}, Lo/cob;-><init>()V

    .line 226
    invoke-virtual {v5, p4}, Lo/cob;->c(I)V

    .line 227
    invoke-virtual {v5, p5}, Lo/cob;->d(I)V

    .line 228
    invoke-virtual {v5, p6}, Lo/cob;->a(I)V

    .line 229
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    mul-double/2addr v0, v3

    invoke-virtual {v5, v0, v1}, Lo/cob;->e(D)V

    .line 230
    invoke-virtual {v5, p7}, Lo/cob;->e(I)V

    .line 231
    invoke-virtual {v5, p8}, Lo/cob;->b(I)V

    .line 232
    invoke-virtual {v5, p9}, Lo/cob;->i(I)V

    .line 233
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cob;->f(I)V

    .line 234
    invoke-interface {p3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    :cond_0
    return-void
.end method

.method private addSyncDoneMergeStat(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIII)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lo/cob;>;IIIIII)V"
        }
    .end annotation

    .line 185
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 186
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 187
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;)D

    move-result-wide v6

    .line 188
    invoke-static {v5}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;)D

    move-result-wide v8

    .line 189
    add-double v0, v6, v8

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 190
    new-instance v10, Lo/cob;

    invoke-direct {v10}, Lo/cob;-><init>()V

    .line 191
    move/from16 v0, p5

    invoke-virtual {v10, v0}, Lo/cob;->c(I)V

    .line 192
    move/from16 v0, p6

    invoke-virtual {v10, v0}, Lo/cob;->d(I)V

    .line 193
    move/from16 v0, p7

    invoke-virtual {v10, v0}, Lo/cob;->a(I)V

    .line 194
    add-double v0, v6, v8

    invoke-virtual {v10, v0, v1}, Lo/cob;->e(D)V

    .line 195
    move/from16 v0, p8

    invoke-virtual {v10, v0}, Lo/cob;->e(I)V

    .line 196
    move/from16 v0, p9

    invoke-virtual {v10, v0}, Lo/cob;->b(I)V

    .line 197
    move/from16 v0, p10

    invoke-virtual {v10, v0}, Lo/cob;->i(I)V

    .line 198
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/cob;->f(I)V

    .line 199
    invoke-interface {p4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    :cond_0
    return-void
.end method

.method private addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/util/List<Lo/cob;>;IIIIII)V"
        }
    .end annotation

    .line 167
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 168
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;)D

    move-result-wide v3

    .line 169
    const-wide/16 v0, 0x0

    cmpl-double v0, v3, v0

    if-lez v0, :cond_0

    .line 170
    new-instance v5, Lo/cob;

    invoke-direct {v5}, Lo/cob;-><init>()V

    .line 171
    invoke-virtual {v5, p4}, Lo/cob;->c(I)V

    .line 172
    invoke-virtual {v5, p5}, Lo/cob;->d(I)V

    .line 173
    invoke-virtual {v5, p6}, Lo/cob;->a(I)V

    .line 174
    invoke-virtual {v5, v3, v4}, Lo/cob;->e(D)V

    .line 175
    invoke-virtual {v5, p7}, Lo/cob;->e(I)V

    .line 176
    invoke-virtual {v5, p8}, Lo/cob;->b(I)V

    .line 177
    invoke-virtual {v5, p9}, Lo/cob;->i(I)V

    .line 178
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cob;->f(I)V

    .line 179
    invoke-interface {p3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    :cond_0
    return-void
.end method


# virtual methods
.method public switchStatTable(Lcom/huawei/hihealthservice/old/db/dao/StatTable;III)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/db/dao/StatTable;III)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getTimespan()I

    move-result v11

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->getStatData()Ljava/lang/String;

    move-result-object v12

    .line 30
    invoke-static {v12}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->isJsonData(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    const-class v0, Ljava/util/Map;

    invoke-static {v12, v0}, Lo/cnj;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map;

    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v12}, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;->parseStatisticsData(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    .line 38
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v13, :cond_1

    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_2
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 43
    const v0, 0x1dcd6500

    rem-int v15, v11, v0

    .line 44
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_1

    .line 46
    :sswitch_0
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "steps_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c42

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 49
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "walk_steps_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c4b

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 52
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "run_steps_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c4c

    const/4 v9, 0x1

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 59
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "stairs_steps_sum"

    const-string v3, "climb_steps_sum"

    move-object v4, v14

    move v5, v15

    move/from16 v8, p4

    move/from16 v9, p3

    const/16 v6, 0x4e21

    const v7, 0x9c4d

    const/4 v10, 0x1

    invoke-direct/range {v0 .. v10}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneMergeStat(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 62
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c43

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 65
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "walk_calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c55

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 68
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "run_calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c56

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 71
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "cycle_calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c57

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 74
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "cycle_calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c57

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 83
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "climb_calories_sum"

    const-string v3, "stairs_calories_sum"

    move-object v4, v14

    move v5, v15

    move/from16 v8, p4

    move/from16 v9, p3

    const/16 v6, 0x4e21

    const v7, 0x9c58

    const/4 v10, 0x3

    invoke-direct/range {v0 .. v10}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneMergeStat(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 86
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "distances_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c44

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 89
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "walk_distances_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c5f

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 92
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "run_distances_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c60

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 95
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "cycle_distances_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c61

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 104
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "climb_distances_sum"

    const-string v3, "stairs_distances_sum"

    move-object v4, v14

    move v5, v15

    move/from16 v8, p4

    move/from16 v9, p3

    const/16 v6, 0x4e21

    const v7, 0x9c62

    const/4 v10, 0x2

    invoke-direct/range {v0 .. v10}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneMergeStat(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 107
    move-object/from16 v0, p0

    move-object v1, v13

    move-object v2, v14

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneClimbStat(Ljava/util/Map;Ljava/util/List;III)V

    .line 109
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c46

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 112
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "walk_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c69

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 115
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "run_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c6a

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 118
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "cycle_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x4e21

    const v6, 0x9c6b

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 127
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "climb_duration_sum"

    const-string v3, "stairs_duration_sum"

    move-object v4, v14

    move v5, v15

    move/from16 v8, p4

    move/from16 v9, p3

    const/16 v6, 0x4e21

    const v7, 0x9c6c

    const/16 v10, 0xd

    invoke-direct/range {v0 .. v10}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneMergeStat(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 129
    goto/16 :goto_1

    .line 132
    :sswitch_1
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x7531

    const v6, 0xa411

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 135
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "calories_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x7531

    const v6, 0xa412

    const/4 v9, 0x3

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 138
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "distances_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x7531

    const v6, 0xa413

    const/4 v9, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 141
    goto :goto_1

    .line 143
    :sswitch_2
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x55f0

    const v6, 0xabe4

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 146
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "deep_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x55f0

    const v6, 0xabe1

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 149
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "shallow_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x55f0

    const v6, 0xabe2

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 152
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "wake_duration_sum"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x55f0

    const v6, 0xabe3

    const/16 v9, 0xd

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneDurationStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 155
    move-object/from16 v0, p0

    move-object v1, v13

    const-string v2, "wake_duration_count"

    move-object v3, v14

    move v4, v15

    move/from16 v7, p4

    move/from16 v8, p3

    const/16 v5, 0x55f0

    const v6, 0xabe5

    const/16 v9, 0x10

    invoke-direct/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->addSyncDoneStat(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IIIIII)V

    .line 157
    .line 162
    :goto_1
    return-object v14

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_2
        0x400 -> :sswitch_1
    .end sparse-switch
.end method
