.class public Lcom/huawei/operation/jsoperation/PluginOperationDataStored;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Opera_PluginOpera_DataStored"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static bloodpressureData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 76
    new-instance v0, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$2;

    invoke-direct {v0}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$2;-><init>()V

    invoke-static {p0, v0}, Lcom/huawei/operation/utils/OperationUtils;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 77
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 78
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodPressure.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 80
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/operation/jsoperation/BloodPressure;

    .line 81
    invoke-virtual {v6}, Lcom/huawei/operation/jsoperation/BloodPressure;->fetch_getSamplePoints()Ljava/util/List;

    move-result-object v7

    .line 82
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 83
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "samplePointsBeen.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v8, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 85
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2712

    invoke-direct {v9, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 86
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;

    .line 87
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->fetch_getValue()Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;

    move-result-object v11

    .line 88
    invoke-static {v11, v9}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->initBloodPressureData(Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V

    .line 89
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->fetch_getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 90
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->fetch_getEndTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 91
    invoke-virtual {v9, p1}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 92
    invoke-interface {p2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 79
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_1
    goto :goto_2

    .line 97
    :cond_2
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == bloodPressures"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 99
    return-void

    .line 101
    :goto_2
    return-void
.end method

.method private static initBloodPressureData(Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 10

    .line 177
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBloodPressureData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    invoke-virtual {p0}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->fetch_getBLOODPRESSURE_DIASTOLIC()D

    move-result-wide v4

    .line 179
    invoke-virtual {p0}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->fetch_getBLOODPRESSURE_SYSTOLIC()D

    move-result-wide v6

    .line 180
    invoke-virtual {p0}, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->fetch_getDATA_POINT_DYNAMIC_HEARTRATE()D

    move-result-wide v8

    .line 181
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodpressureDiastolic = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bloodpressureSystolic = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "heartRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-eqz v0, :cond_0

    .line 184
    const-string v0, "bloodpressure_diastolic"

    invoke-virtual {p1, v0, v4, v5}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 186
    :cond_0
    const-wide/16 v0, 0x0

    cmpl-double v0, v6, v0

    if-eqz v0, :cond_1

    .line 187
    const-string v0, "bloodpressure_systolic"

    invoke-virtual {p1, v0, v6, v7}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 189
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v8, v0

    if-eqz v0, :cond_2

    .line 190
    const-string v0, "heart_rate"

    invoke-virtual {p1, v0, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 192
    :cond_2
    return-void
.end method

.method private static initBloodSugarHealthData(Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 21

    .line 132
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initBloodSugarHealthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_BEFORE_DAWN()D

    move-result-wide v5

    .line 134
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_BF_AFTER()D

    move-result-wide v7

    .line 135
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_BF_BEFORE()D

    move-result-wide v9

    .line 136
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_DN_AFTER()D

    move-result-wide v11

    .line 137
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_DN_BEFORE()D

    move-result-wide v13

    .line 138
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_LC_AFTER()D

    move-result-wide v15

    .line 139
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_LC_BEFORE()D

    move-result-wide v17

    .line 140
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;->fetch_getBLOOD_SUGAR_SL_BEFORE()D

    move-result-wide v19

    .line 142
    const-wide/16 v0, 0x0

    cmpl-double v0, v5, v0

    if-eqz v0, :cond_0

    .line 143
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "before_down = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const-string v0, "bloodsugar_before_dawn"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 146
    :cond_0
    const-wide/16 v0, 0x0

    cmpl-double v0, v7, v0

    if-eqz v0, :cond_1

    .line 147
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bf_after = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "bloodsugar_bf_after"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v7, v8}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 150
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v9, v0

    if-eqz v0, :cond_2

    .line 151
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bf_before = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-string v0, "bloodsugar_bf_before"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 154
    :cond_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v11, v0

    if-eqz v0, :cond_3

    .line 155
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dn_after = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const-string v0, "bloodsugar_dn_after"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v11, v12}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 158
    :cond_3
    const-wide/16 v0, 0x0

    cmpl-double v0, v13, v0

    if-eqz v0, :cond_4

    .line 159
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dn_before = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const-string v0, "bloodsugar_dn_before"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v13, v14}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 162
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, v15, v0

    if-eqz v0, :cond_5

    .line 163
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lc_after = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "bloodsugar_lc_after"

    move-object/from16 v1, p1

    move-wide v2, v15

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 166
    :cond_5
    const-wide/16 v0, 0x0

    cmpl-double v0, v17, v0

    if-eqz v0, :cond_6

    .line 167
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lc_before = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const-string v0, "bloodsugar_lc_before"

    move-object/from16 v1, p1

    move-wide/from16 v2, v17

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 170
    :cond_6
    const-wide/16 v0, 0x0

    cmpl-double v0, v19, v0

    if-eqz v0, :cond_7

    .line 171
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sl_before = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const-string v0, "bloodsugar_sl_before"

    move-object/from16 v1, p1

    move-wide/from16 v2, v19

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 174
    :cond_7
    return-void
.end method

.method private static initWeightFatHealthData(Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 33

    .line 195
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWeightFatHealthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBodyWeight()D

    move-result-wide v5

    .line 197
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBodyFat()D

    move-result-wide v7

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBasalMetabolism()D

    move-result-wide v9

    .line 199
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBmi()D

    move-result-wide v11

    .line 200
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBodyAge()I

    move-result v13

    .line 201
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBodyFatRate()D

    move-result-wide v14

    .line 202
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBodyScore()D

    move-result-wide v16

    .line 203
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getBoneSalt()D

    move-result-wide v18

    .line 204
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getVisceralFatLevel()D

    move-result-wide v20

    .line 205
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getProteinRate()D

    move-result-wide v22

    .line 206
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getMuscleMass()D

    move-result-wide v24

    .line 207
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getMoistureRate()D

    move-result-wide v26

    .line 208
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getMoisture()D

    move-result-wide v28

    .line 209
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getImpedance()D

    move-result-wide v30

    .line 210
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;->fetch_getExtendAttribute()Ljava/lang/String;

    move-result-object v32

    .line 211
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bodyWeight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bodyFat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",metabolism = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bmi = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bodyAge = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bodyFatRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",bodyScore = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v16

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",boneScalt = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v18

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",visceralFatLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v20

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",proteinRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v22

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",muscleMass = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v24

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",moistureRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v26

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",moisture = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v28

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",impedance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v30

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",extendAttribute = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v32

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const-wide/16 v0, 0x0

    cmpl-double v0, v5, v0

    if-eqz v0, :cond_0

    .line 218
    const-string v0, "weight"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 220
    :cond_0
    const-wide/16 v0, 0x0

    cmpl-double v0, v7, v0

    if-eqz v0, :cond_1

    .line 221
    const-string v0, "weight_bodyfat"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v7, v8}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 223
    :cond_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v9, v0

    if-eqz v0, :cond_2

    .line 224
    const-string v0, "weight_bmr"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v9, v10}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 226
    :cond_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v11, v0

    if-eqz v0, :cond_3

    .line 227
    const-string v0, "weight_bmi"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v11, v12}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 229
    :cond_3
    if-eqz v13, :cond_4

    .line 230
    const-string v0, "weight_body_age"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v13}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 232
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, v14, v0

    if-eqz v0, :cond_5

    .line 233
    const-string v0, "weight_bodyfatvalue"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v14, v15}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 235
    :cond_5
    const-wide/16 v0, 0x0

    cmpl-double v0, v16, v0

    if-eqz v0, :cond_6

    .line 236
    const-string v0, "weight_body_score"

    move-object/from16 v1, p1

    move-wide/from16 v2, v16

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 238
    :cond_6
    const-wide/16 v0, 0x0

    cmpl-double v0, v18, v0

    if-eqz v0, :cond_7

    .line 239
    const-string v0, "weight_bone_mineral"

    move-object/from16 v1, p1

    move-wide/from16 v2, v18

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 241
    :cond_7
    const-wide/16 v0, 0x0

    cmpl-double v0, v20, v0

    if-eqz v0, :cond_8

    .line 242
    const-string v0, "weight_fatlevel"

    move-object/from16 v1, p1

    move-wide/from16 v2, v20

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 244
    :cond_8
    const-wide/16 v0, 0x0

    cmpl-double v0, v22, v0

    if-eqz v0, :cond_9

    .line 245
    const-string v0, "weight_protein"

    move-object/from16 v1, p1

    move-wide/from16 v2, v22

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 247
    :cond_9
    const-wide/16 v0, 0x0

    cmpl-double v0, v24, v0

    if-eqz v0, :cond_a

    .line 248
    const-string v0, "weight_muscles"

    move-object/from16 v1, p1

    move-wide/from16 v2, v24

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 250
    :cond_a
    const-wide/16 v0, 0x0

    cmpl-double v0, v26, v0

    if-eqz v0, :cond_b

    .line 251
    const-string v0, "weight_waterrate"

    move-object/from16 v1, p1

    move-wide/from16 v2, v26

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 253
    :cond_b
    const-wide/16 v0, 0x0

    cmpl-double v0, v28, v0

    if-eqz v0, :cond_c

    .line 254
    const-string v0, "weight_water"

    move-object/from16 v1, p1

    move-wide/from16 v2, v28

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 256
    :cond_c
    const-wide/16 v0, 0x0

    cmpl-double v0, v30, v0

    if-eqz v0, :cond_d

    .line 257
    const-string v0, "weight_impedance"

    move-object/from16 v1, p1

    move-wide/from16 v2, v30

    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 259
    :cond_d
    return-void
.end method

.method public static parseHealthData(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 24
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseHealthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseHealthData dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",appID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    :cond_0
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertData data == null OR TextUtils.isEmpty(appID)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    invoke-interface {p3}, Ljava/util/List;->clear()V

    .line 29
    return-void

    .line 32
    :cond_1
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 34
    :pswitch_0
    invoke-static {p1, p2, p3}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->sugarData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 35
    goto :goto_0

    .line 37
    :pswitch_1
    invoke-static {p1, p2, p3}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->bloodpressureData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 38
    goto :goto_0

    .line 40
    :pswitch_2
    invoke-static {p1, p2, p3}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->weightFatData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 41
    .line 45
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private static sugarData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$1;

    invoke-direct {v0}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$1;-><init>()V

    invoke-static {p0, v0}, Lcom/huawei/operation/utils/OperationUtils;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 49
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 50
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodSugars.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 52
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/operation/jsoperation/BloodSugar;

    .line 53
    invoke-virtual {v6}, Lcom/huawei/operation/jsoperation/BloodSugar;->fetch_getSamplePoints()Ljava/util/List;

    move-result-object v7

    .line 54
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 55
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "samplePointsBeen.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v8, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 57
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2711

    invoke-direct {v9, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 58
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;

    .line 59
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->fetch_getValue()Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;

    move-result-object v11

    .line 60
    invoke-static {v11, v9}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->initBloodSugarHealthData(Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V

    .line 61
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->fetch_getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 62
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->fetch_getEndTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 63
    invoke-virtual {v9, p1}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 64
    invoke-interface {p2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_1
    goto :goto_2

    .line 69
    :cond_2
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == bloodSugars"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 71
    return-void

    .line 73
    :goto_2
    return-void
.end method

.method private static weightFatData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 104
    new-instance v0, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$3;

    invoke-direct {v0}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored$3;-><init>()V

    invoke-static {p0, v0}, Lcom/huawei/operation/utils/OperationUtils;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 105
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 106
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weightBodyFats.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 108
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/operation/jsoperation/WeightBodyFat;

    .line 109
    invoke-virtual {v6}, Lcom/huawei/operation/jsoperation/WeightBodyFat;->fetch_getSamplePoints()Ljava/util/List;

    move-result-object v7

    .line 110
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 111
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "samplePointsBean.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v8, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 113
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2716

    invoke-direct {v9, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 114
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;

    .line 115
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;->fetch_getValue()Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;

    move-result-object v11

    .line 116
    invoke-static {v11, v9}, Lcom/huawei/operation/jsoperation/PluginOperationDataStored;->initWeightFatHealthData(Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean$ValueBean;Lcom/huawei/hihealth/HiHealthData;)V

    .line 117
    invoke-virtual {v9, p1}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;->fetch_getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 119
    invoke-virtual {v10}, Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;->fetch_getEndTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 120
    invoke-interface {p2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 107
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_1
    goto :goto_2

    .line 125
    :cond_2
    const-string v0, "Opera_PluginOpera_DataStored"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == weightBodyFats"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 127
    return-void

    .line 129
    :goto_2
    return-void
.end method
