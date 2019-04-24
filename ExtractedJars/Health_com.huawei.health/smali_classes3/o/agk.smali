.class public Lo/agk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# instance fields
.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private c:Lo/abz;

.field d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/agk;->d:I

    .line 87
    iput p1, p0, Lo/agk;->d:I

    .line 88
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/agk;->d:I

    .line 72
    iput p3, p0, Lo/agk;->d:I

    .line 73
    return-void
.end method

.method private a(Lo/afz;Lo/acl;)Lcom/huawei/hihealth/HiHealthData;
    .locals 17

    .line 91
    if-nez p1, :cond_0

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_0
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v0, p0

    iget v0, v0, Lo/agk;->d:I

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 96
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataHandler starTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    .line 99
    invoke-virtual/range {p1 .. p1}, Lo/afz;->h()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/afz;->k()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    .line 100
    invoke-virtual/range {p1 .. p1}, Lo/afz;->h()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 101
    invoke-virtual/range {p1 .. p1}, Lo/afz;->k()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v8, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 104
    invoke-virtual {v8, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 106
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 107
    move-object/from16 v0, p0

    iget v0, v0, Lo/agk;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    .line 109
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler HiHealthDataType.DATA_SET_WEIGHT_EX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/agg;

    if-eqz v0, :cond_a

    .line 111
    move-object/from16 v11, p1

    check-cast v11, Lo/agg;

    .line 112
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataHandler HiHealthDataType.DATA_SET_WEIGHT_EX bodyDatas "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const-string v0, "weight"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 114
    const-string v0, "weight_bodyfat"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 115
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v12

    .line 116
    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/acu;->e(F)V

    .line 117
    sget-object v0, Lo/act;->a:Lo/act;

    new-instance v1, Lo/agk$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/agk$2;-><init>(Lo/agk;)V

    invoke-virtual {v0, v12, v1}, Lo/act;->e(Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 123
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v13

    .line 124
    invoke-virtual {v12}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v14

    .line 125
    if-nez v14, :cond_2

    .line 126
    sget-object v0, Lo/act;->a:Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 129
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v13, :cond_3

    .line 130
    const-string v0, "0"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 133
    const-string v0, "0"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v8, v14}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 139
    :goto_1
    new-instance v15, Lo/acn;

    invoke-direct {v15}, Lo/acn;-><init>()V

    .line 141
    const-string v0, "weight_age"

    invoke-virtual {v12}, Lo/acu;->b()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 142
    const-string v0, "weight_height"

    invoke-virtual {v12}, Lo/acu;->d()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 143
    const-string v0, "weight_gender"

    invoke-virtual {v12}, Lo/acu;->c()B

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 145
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    invoke-virtual {v0}, Lo/agl;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v11}, Lo/agg;->f()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    .line 146
    new-instance v0, Lo/ahl;

    invoke-virtual {v12}, Lo/acu;->d()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v12}, Lo/acu;->f()F

    move-result v2

    invoke-virtual {v12}, Lo/acu;->c()B

    move-result v3

    invoke-virtual {v12}, Lo/acu;->b()I

    move-result v4

    .line 147
    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v5

    invoke-virtual {v11}, Lo/agg;->b()D

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lo/ahl;-><init>(FFBIFD)V

    move-object/from16 v16, v0

    .line 149
    const-string v0, "weight_bmi"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->h()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 150
    const-string v0, "weight_bmr"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->d()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 151
    const-string v0, "weight_body_age"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->f()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 152
    const-string v0, "weight_body_score"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->i()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 153
    const-string v0, "weight_bone_mineral"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->k()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 154
    const-string v0, "weight_muscles"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->c()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 155
    const-string v0, "weight_protein"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->g()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 156
    const-string v0, "weight_waterrate"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->b()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 157
    const-string v0, "weight_fatlevel"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->a()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 158
    const-string v0, "weight_impedance"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->e()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 159
    const-string v0, "weight_skeletalmusclelmass"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->m()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v8, v0, v1, v2}, Lo/agk;->d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V

    .line 161
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->m(D)V

    .line 162
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->i()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->o(D)V

    .line 163
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->g()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->n(D)V

    .line 164
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->h()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->k(D)V

    .line 165
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->h(D)V

    .line 166
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->p(D)V

    .line 167
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->i(D)V

    .line 168
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->k()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->g(D)V

    .line 169
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->b()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->f(D)V

    .line 170
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->m()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->r(D)V

    .line 174
    :cond_5
    invoke-virtual {v11}, Lo/agg;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 175
    invoke-virtual {v11}, Lo/agg;->h()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 176
    invoke-virtual {v11}, Lo/agg;->k()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 179
    :cond_6
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 180
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 181
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 182
    :cond_7
    const/4 v0, -0x1

    invoke-virtual {v15, v0}, Lo/acn;->a(I)V

    .line 183
    const-string v0, "-1"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    goto :goto_2

    .line 185
    :cond_8
    const/4 v0, 0x2

    invoke-virtual {v15, v0}, Lo/acn;->a(I)V

    .line 187
    :goto_2
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "convertData, currentUser.getHeight1=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lo/acu;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->a(J)V

    .line 190
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->c(J)V

    .line 191
    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->c(D)V

    .line 192
    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->e(D)V

    .line 193
    invoke-virtual {v12}, Lo/acu;->b()I

    move-result v0

    invoke-virtual {v15, v0}, Lo/acn;->b(I)V

    .line 194
    invoke-virtual {v12}, Lo/acu;->d()I

    move-result v0

    invoke-virtual {v15, v0}, Lo/acn;->d(I)V

    .line 195
    invoke-virtual {v12}, Lo/acu;->c()B

    move-result v0

    invoke-virtual {v15, v0}, Lo/acn;->a(B)V

    .line 196
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v15, v14}, Lo/acs;->a(Lo/acn;Ljava/lang/String;)V

    .line 197
    goto/16 :goto_4

    .line 200
    :sswitch_1
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/age;

    if-eqz v0, :cond_a

    .line 201
    move-object/from16 v11, p1

    check-cast v11, Lo/age;

    .line 202
    const-string v0, "bloodpressure_diastolic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/age;->c()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 203
    const-string v0, "bloodpressure_systolic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/age;->a()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 204
    const-string v0, "heart_rate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/age;->b()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 205
    goto/16 :goto_4

    .line 208
    :sswitch_2
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/afy;

    if-eqz v0, :cond_a

    .line 209
    move-object/from16 v11, p1

    check-cast v11, Lo/afy;

    .line 210
    invoke-virtual {v11}, Lo/afy;->c()F

    move-result v12

    .line 212
    invoke-virtual/range {p1 .. p1}, Lo/afz;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dnurse"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 213
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is dnurse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-virtual {v11}, Lo/afy;->h()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 216
    invoke-virtual {v8, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    goto :goto_3

    .line 218
    :cond_9
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is johnson"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    invoke-virtual {v11}, Lo/afy;->h()J

    move-result-wide v13

    .line 221
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStartTime "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {v13, v14}, Lo/afy;->c(J)I

    move-result v15

    .line 223
    invoke-virtual {v8, v15}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 224
    invoke-virtual {v8, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 226
    :goto_3
    goto :goto_4

    .line 231
    :sswitch_3
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/aga;

    if-eqz v0, :cond_a

    .line 232
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is heartRate device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    move-object/from16 v11, p1

    check-cast v11, Lo/aga;

    .line 234
    invoke-virtual {v11}, Lo/aga;->c()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 235
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler heartRate is ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    .line 241
    :cond_a
    :goto_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataHandler endTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-object v8

    :sswitch_data_0
    .sparse-switch
        0x7d2 -> :sswitch_3
        0x2711 -> :sswitch_2
        0x2712 -> :sswitch_1
        0x2716 -> :sswitch_0
        0xc351 -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic c(Lo/agk;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/agk;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;D)V
    .locals 2

    .line 302
    const-wide/16 v0, 0x0

    cmpl-double v0, p3, v0

    if-lez v0, :cond_0

    .line 303
    invoke-virtual {p1, p2, p3, p4}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 306
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/agk;)Lo/abz;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/agk;->c:Lo/abz;

    return-object v0
.end method


# virtual methods
.method public a(Lo/abz;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/agk;->c:Lo/abz;

    .line 84
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/agk;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 80
    return-void
.end method

.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 284
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 7

    .line 248
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 249
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler onDataChanged parameter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    return-void

    .line 252
    :cond_1
    invoke-direct {p0, p2, p1}, Lo/agk;->a(Lo/afz;Lo/acl;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v4

    .line 253
    if-eqz v4, :cond_2

    .line 254
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 255
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 257
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 259
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v6

    .line 260
    new-instance v0, Lo/agk$3;

    invoke-direct {v0, p0}, Lo/agk$3;-><init>(Lo/agk;)V

    invoke-interface {v6, v5, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 279
    :cond_2
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 0

    .line 299
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 289
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 0

    .line 294
    return-void
.end method
