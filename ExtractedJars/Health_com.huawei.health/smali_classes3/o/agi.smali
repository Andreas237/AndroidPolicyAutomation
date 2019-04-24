.class public Lo/agi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# instance fields
.field a:I

.field c:I


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/agi;->a:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/agi;->c:I

    .line 52
    iput p3, p0, Lo/agi;->a:I

    .line 53
    return-void
.end method

.method private e(Lo/afz;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 17

    .line 64
    if-nez p1, :cond_0

    .line 65
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_0
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v0, p0

    iget v0, v0, Lo/agi;->a:I

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 69
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

    .line 71
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    .line 72
    invoke-virtual {v8, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 73
    invoke-virtual {v8, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 74
    move-object/from16 v0, p2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 75
    move-object/from16 v0, p0

    iget v0, v0, Lo/agi;->a:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 77
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler HiHealthDataType.DATA_SET_WEIGHT_EX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/agg;

    if-eqz v0, :cond_8

    .line 79
    move-object/from16 v11, p1

    check-cast v11, Lo/agg;

    .line 80
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

    .line 81
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

    .line 82
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

    .line 84
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v12

    .line 85
    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/acu;->e(F)V

    .line 87
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v13

    .line 89
    invoke-virtual {v12}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v14

    .line 90
    if-nez v14, :cond_1

    .line 91
    sget-object v0, Lo/act;->a:Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 94
    :cond_1
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    const-string v0, "0"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {v8, v14}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 100
    :goto_0
    new-instance v15, Lo/acn;

    invoke-direct {v15}, Lo/acn;-><init>()V

    .line 102
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    invoke-virtual {v0}, Lo/agl;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v11}, Lo/agg;->f()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 103
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

    .line 104
    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v5

    invoke-virtual {v11}, Lo/agg;->b()D

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lo/ahl;-><init>(FFBIFD)V

    move-object/from16 v16, v0

    .line 106
    const-string v0, "weight_bmi"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->h()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 107
    const-string v0, "weight_bmr"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->d()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 108
    const-string v0, "weight_body_age"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->f()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 109
    const-string v0, "weight_body_score"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->i()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 110
    const-string v0, "weight_bone_mineral"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->k()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 111
    const-string v0, "weight_muscles"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->c()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 112
    const-string v0, "weight_protein"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->g()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 113
    const-string v0, "weight_waterrate"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->b()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 114
    const-string v0, "weight_fatlevel"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->a()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 115
    const-string v0, "weight_impedance"

    invoke-virtual/range {v16 .. v16}, Lo/ahl;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 117
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->m(D)V

    .line 118
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->i()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->o(D)V

    .line 119
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->g()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->n(D)V

    .line 120
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->h()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->k(D)V

    .line 121
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->h(D)V

    .line 122
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->p(D)V

    .line 123
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->i(D)V

    .line 124
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->k()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->g(D)V

    .line 125
    invoke-virtual/range {v16 .. v16}, Lo/ahl;->b()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->f(D)V

    .line 128
    :cond_3
    invoke-virtual {v11}, Lo/agg;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 129
    invoke-virtual {v11}, Lo/agg;->h()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 130
    invoke-virtual {v11}, Lo/agg;->k()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 133
    :cond_4
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 134
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 135
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 136
    :cond_5
    const/4 v0, -0x1

    invoke-virtual {v15, v0}, Lo/acn;->a(I)V

    .line 137
    const-string v0, "-1"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    goto :goto_1

    .line 139
    :cond_6
    const/4 v0, 0x2

    invoke-virtual {v15, v0}, Lo/acn;->a(I)V

    .line 144
    :goto_1
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->a(J)V

    .line 145
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->c(J)V

    .line 146
    invoke-virtual {v11}, Lo/agg;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->c(D)V

    .line 147
    invoke-virtual {v11}, Lo/agg;->a()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v15, v0, v1}, Lo/acn;->e(D)V

    .line 148
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v15, v14}, Lo/acs;->a(Lo/acn;Ljava/lang/String;)V

    .line 149
    goto/16 :goto_3

    .line 152
    :sswitch_1
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/age;

    if-eqz v0, :cond_8

    .line 153
    move-object/from16 v11, p1

    check-cast v11, Lo/age;

    .line 154
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

    .line 155
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

    .line 156
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

    .line 157
    goto/16 :goto_3

    .line 160
    :sswitch_2
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/afy;

    if-eqz v0, :cond_8

    .line 161
    move-object/from16 v11, p1

    check-cast v11, Lo/afy;

    .line 162
    invoke-virtual {v11}, Lo/afy;->c()F

    move-result v12

    .line 164
    invoke-virtual/range {p1 .. p1}, Lo/afz;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dnurse"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 165
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is dnurse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v11}, Lo/afy;->h()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 168
    invoke-virtual {v8, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    goto :goto_2

    .line 170
    :cond_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is johnson"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-virtual {v11}, Lo/afy;->h()J

    move-result-wide v13

    .line 173
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

    .line 174
    invoke-static {v13, v14}, Lo/afy;->c(J)I

    move-result v15

    .line 175
    invoke-virtual {v8, v15}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 176
    invoke-virtual {v8, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 178
    :goto_2
    goto :goto_3

    .line 183
    :sswitch_3
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/aga;

    if-eqz v0, :cond_8

    .line 184
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler current device is heartRate device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    move-object/from16 v11, p1

    check-cast v11, Lo/aga;

    .line 186
    invoke-virtual {v11}, Lo/aga;->c()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 187
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler heartRate is ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    .line 193
    :cond_8
    :goto_3
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

    .line 195
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


# virtual methods
.method public a(I)V
    .locals 0

    .line 60
    iput p1, p0, Lo/agi;->c:I

    .line 61
    return-void
.end method

.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 8

    .line 200
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 201
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataHandler onDataChanged parameter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    return-void

    .line 204
    :cond_1
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v4

    .line 205
    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DnurseGlucose"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 207
    const-string v0, "dnurse"

    invoke-virtual {v4, v0}, Lo/afz;->d(Ljava/lang/String;)V

    .line 208
    iget v0, p0, Lo/agi;->c:I

    int-to-long v0, v0

    invoke-virtual {v4, v0, v1}, Lo/afz;->e(J)V

    .line 211
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/agi;->e(Lo/afz;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v5

    .line 212
    if-eqz v5, :cond_3

    .line 213
    new-instance v6, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 214
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 216
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 218
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v7

    .line 219
    new-instance v0, Lo/agi$2;

    invoke-direct {v0, p0}, Lo/agi$2;-><init>(Lo/agi;)V

    invoke-interface {v7, v6, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 226
    :cond_3
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 241
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 231
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 236
    return-void
.end method
