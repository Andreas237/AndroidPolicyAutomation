.class public Lo/cue;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 295
    invoke-static {p0}, Lo/cud;->b(I)I

    move-result v0

    return v0
.end method

.method public static a(Ljava/lang/String;)Lcom/huawei/hihealthservice/sync/util/CloudIntensity;
    .locals 6

    .line 316
    const/4 v4, 0x0

    .line 318
    :try_start_0
    const-class v0, Lcom/huawei/hihealthservice/sync/util/CloudIntensity;

    invoke-static {p0, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/sync/util/CloudIntensity;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v4, v0

    .line 323
    goto :goto_0

    .line 319
    :catch_0
    move-exception v5

    .line 320
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudIntensityValue JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    goto :goto_0

    .line 321
    :catch_1
    move-exception v5

    .line 322
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudIntensityValue error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    :goto_0
    return-object v4
.end method

.method public static b(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Lcom/huawei/hihealth/HiHealthData;
    .locals 7
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 40
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cue;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 41
    if-gtz v5, :cond_0

    .line 42
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportSamplePoint so such type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 49
    :catch_0
    move-exception v6

    .line 50
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportSamplePoint NumberFormatException value is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 54
    :goto_0
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 55
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 56
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 57
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportSamplePoint hiHealthData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-object v4
.end method

.method private static b(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 17
    .param p0    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 201
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 202
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 204
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->c(I)Ljava/lang/String;

    move-result-object v13

    .line 205
    if-nez v13, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 206
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->b(I)Ljava/lang/String;

    move-result-object v14

    .line 207
    new-instance v15, Lo/cty;

    invoke-direct {v15}, Lo/cty;-><init>()V

    .line 208
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v15, v14, v0, v1}, Lo/cty;->b(Ljava/lang/String;D)V

    .line 209
    invoke-virtual {v15}, Lo/cty;->a()Ljava/lang/String;

    move-result-object v12

    .line 210
    if-nez v12, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 211
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v16

    .line 212
    move-object v0, v13

    move-object v1, v12

    move-wide v2, v8

    move-wide v4, v10

    move-object/from16 v7, v16

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;
    .locals 5
    .param p0    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 75
    const/4 v0, -0x1

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_0
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;-><init>()V

    .line 78
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 79
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 81
    :pswitch_0
    invoke-static {p0}, Lo/cue;->c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v3

    .line 82
    goto :goto_1

    .line 84
    :pswitch_1
    invoke-static {p0}, Lo/cue;->b(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v3

    .line 85
    goto :goto_1

    .line 88
    :pswitch_2
    invoke-static {p0}, Lo/cue;->d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v3

    .line 89
    goto :goto_1

    .line 91
    :goto_0
    :pswitch_3
    invoke-static {p0, p1}, Lo/cue;->d(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v3

    .line 93
    :goto_1
    if-nez v3, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setStartTime(Ljava/lang/Long;)V

    .line 96
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setEndTime(Ljava/lang/Long;)V

    .line 97
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setTimeZone(Ljava/lang/String;)V

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setType(Ljava/lang/Integer;)V

    .line 99
    invoke-virtual {v2, v4}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setSamplePoints(Ljava/util/List;)V

    .line 100
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    .line 300
    invoke-static {p0}, Lo/cud;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(IDI)Lo/cob;
    .locals 1

    .line 287
    new-instance v0, Lo/cob;

    invoke-direct {v0}, Lo/cob;-><init>()V

    .line 288
    invoke-virtual {v0, p1, p2}, Lo/cob;->e(D)V

    .line 289
    invoke-virtual {v0, p0}, Lo/cob;->a(I)V

    .line 290
    invoke-virtual {v0, p3}, Lo/cob;->i(I)V

    .line 291
    return-object v0
.end method

.method private static c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 16
    .param p0    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 186
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 187
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 189
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->c(I)Ljava/lang/String;

    move-result-object v13

    .line 190
    if-nez v13, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_0
    new-instance v14, Lo/cty;

    invoke-direct {v14}, Lo/cty;-><init>()V

    .line 192
    const-string v0, "BLOOD_PRESSURE_SYSTOLIC"

    const-string v1, "bloodpressure_systolic"

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-virtual {v14, v0, v1, v2}, Lo/cty;->b(Ljava/lang/String;D)V

    .line 193
    const-string v0, "BLOOD_PRESSURE_DIASTOLIC"

    const-string v1, "bloodpressure_diastolic"

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-virtual {v14, v0, v1, v2}, Lo/cty;->b(Ljava/lang/String;D)V

    .line 194
    invoke-virtual {v14}, Lo/cty;->a()Ljava/lang/String;

    move-result-object v12

    .line 195
    if-nez v12, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 196
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v15

    .line 197
    move-object v0, v13

    move-object v1, v12

    move-wide v2, v8

    move-wide v4, v10

    move-object v7, v15

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 2

    .line 264
    new-instance v1, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;-><init>()V

    .line 265
    invoke-virtual {v1, p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setKey(Ljava/lang/String;)V

    .line 266
    invoke-virtual {v1, p1}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setValue(Ljava/lang/String;)V

    .line 267
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setStartTime(Ljava/lang/Long;)V

    .line 268
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setEndTime(Ljava/lang/Long;)V

    .line 269
    invoke-virtual {v1, p7}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setUnit(Ljava/lang/String;)V

    .line 270
    return-object v1
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    .line 227
    invoke-static {p0}, Lo/cud;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 66
    invoke-static {p0, p1}, Lo/cud;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private static d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 15
    .param p0    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 216
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 217
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 219
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->c(I)Ljava/lang/String;

    move-result-object v13

    .line 220
    if-nez v13, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 221
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v12

    .line 222
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    .line 223
    move-object v0, v13

    move-object v1, v12

    move-wide v2, v8

    move-wide v4, v10

    move-object v7, v14

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 15
    .param p0    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 159
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 160
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 162
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->c(I)Ljava/lang/String;

    move-result-object v13

    .line 163
    if-nez v13, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 168
    :pswitch_0
    const-string v12, ""

    .line 169
    goto :goto_1

    .line 172
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v12

    .line 173
    goto :goto_1

    .line 175
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/cue;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 176
    goto :goto_1

    .line 178
    :goto_0
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v12

    .line 181
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    .line 182
    move-object v0, v13

    move-object v1, v12

    move-wide v2, v8

    move-wide v4, v10

    move-object v7, v14

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/cue;->c(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;
    .locals 1

    .line 275
    new-instance v0, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-direct {v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;-><init>()V

    .line 276
    invoke-virtual {v0, p3}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configAltitude(Ljava/lang/Float;)V

    .line 277
    invoke-virtual {v0, p2}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configCalorie(Ljava/lang/Integer;)V

    .line 278
    invoke-virtual {v0, p1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configDistance(Ljava/lang/Integer;)V

    .line 279
    invoke-virtual {v0, p5}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configDuration(Ljava/lang/Integer;)V

    .line 280
    invoke-virtual {v0, p4}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configFloor(Ljava/lang/Integer;)V

    .line 281
    invoke-virtual {v0, p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configSteps(Ljava/lang/Integer;)V

    .line 282
    invoke-virtual {v0, p6}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configCount(Ljava/lang/Integer;)V

    .line 283
    return-object v0
.end method

.method public static d(I)Ljava/lang/String;
    .locals 1

    .line 312
    new-instance v0, Lcom/huawei/hihealthservice/sync/util/CloudIntensity;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/sync/util/CloudIntensity;-><init>(I)V

    invoke-static {v0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/List;Ljava/util/List;IJ)V
    .locals 19
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IJ)V"
        }
    .end annotation

    .line 104
    const-wide/16 v4, 0x0

    .line 105
    const-wide/16 v6, 0x0

    .line 106
    const-wide/high16 v8, -0x8000000000000000L

    .line 107
    const-wide v10, 0x7fffffffffffffffL

    .line 108
    new-instance v12, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    invoke-direct {v12}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;-><init>()V

    .line 109
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 111
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setType(Ljava/lang/Integer;)V

    .line 112
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setTimeZone(Ljava/lang/String;)V

    .line 113
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 114
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v14

    .line 115
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealth/HiHealthData;

    .line 116
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v4

    .line 117
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v6

    .line 118
    invoke-static {v4, v5}, Lo/cnk;->a(J)I

    move-result v17

    .line 119
    move-object/from16 v0, v16

    move/from16 v1, p2

    invoke-static {v0, v1}, Lo/cue;->d(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v18

    .line 120
    if-nez v18, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    move/from16 v0, v17

    if-eq v14, v0, :cond_1

    .line 122
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setStartTime(Ljava/lang/Long;)V

    .line 123
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setEndTime(Ljava/lang/Long;)V

    .line 124
    invoke-virtual {v12, v13}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setSamplePoints(Ljava/util/List;)V

    .line 125
    move-object/from16 v0, p0

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    const-string v0, "HiDataSwitchUtil"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "integrateData day is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " and "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", minTempTime is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 127
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " maxTempTime is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 126
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v12, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    invoke-direct {v12}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;-><init>()V

    .line 130
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setType(Ljava/lang/Integer;)V

    .line 132
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setTimeZone(Ljava/lang/String;)V

    .line 133
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 134
    const-wide/high16 v8, -0x8000000000000000L

    .line 135
    const-wide v10, 0x7fffffffffffffffL

    .line 137
    :cond_1
    move-object/from16 v0, v18

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    cmp-long v0, v6, v8

    if-ltz v0, :cond_2

    .line 140
    move-wide v8, v6

    .line 142
    :cond_2
    cmp-long v0, v4, v10

    if-gtz v0, :cond_3

    .line 143
    move-wide v10, v4

    .line 145
    :cond_3
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v14

    .line 146
    goto/16 :goto_0

    .line 147
    :cond_4
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_5

    .line 148
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setStartTime(Ljava/lang/Long;)V

    .line 149
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setEndTime(Ljava/lang/Long;)V

    .line 150
    invoke-virtual {v12, v13}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setSamplePoints(Ljava/util/List;)V

    .line 151
    move-object/from16 v0, p0

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    const-string v0, "HiDataSwitchUtil"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "integrateData day is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " and "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", minTempTime is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 153
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " maxTempTime is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 152
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    :cond_5
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "integrateData data finished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void
.end method

.method public static e(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 1
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 70
    invoke-static {p0}, Lo/cuc;->b(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e(I)Z
    .locals 1

    .line 308
    invoke-static {p0}, Lo/cud;->c(I)Z

    move-result v0

    return v0
.end method
