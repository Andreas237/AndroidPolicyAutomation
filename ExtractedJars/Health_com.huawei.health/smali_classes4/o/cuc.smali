.class public Lo/cuc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 9
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 28
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 29
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cud;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 30
    if-gtz v6, :cond_0

    .line 31
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint so such type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const/4 v0, 0x0

    return-object v0

    .line 34
    :cond_0
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 36
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 39
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 41
    const-wide/high16 v0, 0x36a0000000000000L    # 1.401298464324817E-45

    cmpg-double v0, v7, v0

    if-gtz v0, :cond_1

    .line 42
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint NumberFormatException value is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    goto :goto_0

    .line 46
    :catch_0
    move-exception v7

    .line 47
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint NumberFormatException value is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :goto_0
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    return-object v4
.end method

.method static b(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 5
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 453
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v1

    .line 454
    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 455
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 456
    const-string v0, "WEIGHT_BODYWEIGHT"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    const-string v0, "WEIGHT_BODYFAT"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 458
    const-string v0, "DATA_POINT_DYNAMIC_HEARTRATE"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    const-string v0, "DATA_POINT_REST_HEARTRATE"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 460
    const-string v0, "STRESS_PASSIVE_MEASUREMENT"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    const-string v0, "STRESS_POSITIVE_MEASUREMENT"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    const-string v0, "BREATHING_RELAXATION"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 465
    const-string v0, "SLEEP_DEEP"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    const-string v0, "SLEEP_LIGHT"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 467
    const-string v0, "SLEEP_AWAKE"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    const-string v0, "PROFESSIONAL_SLEEP_SHALLOW"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 470
    const-string v0, "PROFESSIONAL_SLEEP_DREAM"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    const-string v0, "PROFESSIONAL_SLEEP_DEEP"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    const-string v0, "PROFESSIONAL_SLEEP_WAKE"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 473
    const-string v0, "PROFESSIONAL_SLEEP_NOON"

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 475
    const-string v0, "STRESS_DATA"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    const-string v0, "BIOFEEDBACK_GAMES"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    const-string v0, "RELAX_ASSESSMENT"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    const-string v0, "BREATHE_TRAINING"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 479
    const-string v0, "HEART_RATE_RISE_ALARM"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 481
    invoke-static {p0}, Lo/cuc;->a(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 483
    :cond_1
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 484
    invoke-static {p0}, Lo/cuc;->i(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 486
    :cond_2
    const-string v0, "BLOODPRESSURE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 487
    invoke-static {p0}, Lo/cuc;->d(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 489
    :cond_3
    const-string v0, "BLOODGLUCOSE_BLOODSUGAR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 490
    invoke-static {p0}, Lo/cuc;->f(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 492
    :cond_4
    const-string v0, "WEIGHT_BODYFAT_BROAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 493
    invoke-static {p0}, Lo/cuc;->g(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 495
    :cond_5
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 496
    invoke-static {p0}, Lo/cuc;->e(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 498
    :cond_6
    const-string v0, "EXERCISE_INTENSITY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 499
    invoke-static {p0}, Lo/cuc;->c(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 501
    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method private static c(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 8
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 83
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cud;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 85
    if-gtz v6, :cond_0

    .line 86
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint so such type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cue;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/sync/util/CloudIntensity;

    move-result-object v7

    .line 90
    if-nez v7, :cond_1

    .line 91
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint type is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " value is error"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/sync/util/CloudIntensity;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 95
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 96
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 97
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 98
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    return-object v4
.end method

.method private static d(Ljava/lang/String;)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 6

    .line 103
    const/4 v4, 0x0

    .line 105
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {p0, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 108
    goto :goto_0

    .line 106
    :catch_0
    move-exception v5

    .line 107
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transStress error ! e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_0
    return-object v4
.end method

.method private static d(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 12
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 113
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 114
    new-instance v5, Lo/cty;

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/cty;-><init>(Ljava/lang/String;)V

    .line 115
    const-string v0, "BLOOD_PRESSURE_DIASTOLIC"

    invoke-virtual {v5, v0}, Lo/cty;->b(Ljava/lang/String;)D

    move-result-wide v6

    .line 116
    const-string v0, "BLOOD_PRESSURE_SYSTOLIC"

    invoke-virtual {v5, v0}, Lo/cty;->b(Ljava/lang/String;)D

    move-result-wide v8

    .line 117
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x0

    cmpg-double v0, v8, v0

    if-gtz v0, :cond_1

    .line 118
    :cond_0
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "samplePointToBloodPressure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_1
    new-instance v10, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 122
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v10, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 123
    const/16 v0, 0x7d7

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 124
    const/4 v0, 0x7

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 125
    invoke-virtual {v10, v6, v7}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 126
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    new-instance v11, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v11}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 129
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v11, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 130
    const/16 v0, 0x7d6

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 131
    const/4 v0, 0x7

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 132
    invoke-virtual {v11, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 133
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    return-object v4
.end method

.method private static e(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 9
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 55
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 56
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 57
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cud;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    .line 58
    if-gtz v6, :cond_0

    .line 59
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint so such type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 63
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    :cond_1
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHealthSamplePoint type is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " metaData is null"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_2
    const/16 v0, 0x7f2

    if-ne v6, v0, :cond_5

    .line 69
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cuc;->d(Ljava/lang/String;)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v8

    .line 70
    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v0

    if-gtz v0, :cond_4

    :cond_3
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_4
    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 73
    :cond_5
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 74
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 77
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    return-object v4
.end method

.method private static f(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 13
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 399
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 400
    new-instance v5, Lo/cty;

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/cty;-><init>(Ljava/lang/String;)V

    .line 401
    invoke-virtual {v5}, Lo/cty;->b()Ljava/util/Map;

    move-result-object v6

    .line 402
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 403
    :cond_0
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "samplePointToBloodSugar error map is null or empty, samplePoint is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const/4 v0, 0x0

    return-object v0

    .line 408
    :cond_1
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 409
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/cud;->d(Ljava/lang/String;)I

    move-result v9

    .line 410
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    .line 411
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "samplePointToBloodSugar type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    const-wide/16 v0, 0x0

    cmpg-double v0, v10, v0

    if-gtz v0, :cond_2

    .line 414
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "samplePointToBloodSugar error value !samplePoint is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    goto :goto_0

    .line 417
    :cond_2
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 418
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 419
    invoke-virtual {v12, v9}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 420
    const/4 v0, 0x6

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 421
    invoke-virtual {v12, v10, v11}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 422
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    goto/16 :goto_0

    .line 424
    :cond_3
    return-object v4
.end method

.method private static g(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 32
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 139
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 140
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    .line 141
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getUserId()Ljava/lang/String;

    move-result-object v7

    .line 142
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getWeight()Ljava/lang/Double;

    move-result-object v8

    .line 143
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBodyFat()Ljava/lang/Double;

    move-result-object v9

    .line 144
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBodyFatRate()Ljava/lang/Double;

    move-result-object v10

    .line 145
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getImpedance()Ljava/lang/Double;

    move-result-object v11

    .line 146
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBMI()Ljava/lang/Double;

    move-result-object v12

    .line 147
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBMR()Ljava/lang/Double;

    move-result-object v13

    .line 148
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getWater()Ljava/lang/Double;

    move-result-object v14

    .line 149
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getMoistureRate()Ljava/lang/Double;

    move-result-object v15

    .line 150
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getMuscles()Ljava/lang/Double;

    move-result-object v16

    .line 151
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getFatLevel()Ljava/lang/Double;

    move-result-object v17

    .line 152
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getProtein()Ljava/lang/Double;

    move-result-object v18

    .line 153
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBoneMineral()Ljava/lang/Double;

    move-result-object v19

    .line 154
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBodyScore()Ljava/lang/Double;

    move-result-object v20

    .line 155
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBodyAge()Ljava/lang/Integer;

    move-result-object v21

    .line 156
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getHeartRate()Ljava/lang/Integer;

    move-result-object v22

    .line 157
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getPressure()Ljava/lang/Integer;

    move-result-object v23

    .line 158
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getSkeletalMusclelMass()Ljava/lang/Double;

    move-result-object v24

    .line 159
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getGender()Ljava/lang/Integer;

    move-result-object v25

    .line 160
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getAge()Ljava/lang/Integer;

    move-result-object v26

    .line 161
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getHeight()Ljava/lang/Integer;

    move-result-object v27

    .line 162
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getHealthyWeight()Ljava/lang/Double;

    move-result-object v28

    .line 163
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getHealthyFatRate()Ljava/lang/Double;

    move-result-object v29

    .line 164
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getBodySize()Ljava/lang/Integer;

    move-result-object v30

    .line 166
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 167
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 168
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 169
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 170
    move-object/from16 v0, v31

    const/16 v1, 0x7d4

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 171
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 172
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 173
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 177
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 178
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 179
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 180
    move-object/from16 v0, v31

    const/16 v1, 0x7ef

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 181
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 182
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 183
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 187
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 188
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 189
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 190
    move-object/from16 v0, v31

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 191
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 192
    move-object/from16 v0, v31

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 193
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 197
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 199
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 200
    move-object/from16 v0, v31

    const/16 v1, 0x7f0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 201
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 202
    move-object/from16 v0, v31

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 203
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 207
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 208
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 209
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 210
    move-object/from16 v0, v31

    const/16 v1, 0x7e6

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 211
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 212
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 213
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v13, :cond_5

    .line 217
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 218
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 219
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 220
    move-object/from16 v0, v31

    const/16 v1, 0x7e8

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 221
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 222
    move-object/from16 v0, v31

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 223
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v14, :cond_6

    .line 227
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 228
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 229
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 230
    move-object/from16 v0, v31

    const/16 v1, 0x7e9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 231
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 232
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 233
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v15, :cond_7

    .line 237
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 238
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 239
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 240
    move-object/from16 v0, v31

    const/16 v1, 0x7f1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 241
    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 242
    move-object/from16 v0, v31

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 243
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    :cond_7
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_8

    .line 247
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 248
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 249
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 250
    move-object/from16 v0, v31

    const/16 v1, 0x7e7

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 251
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 252
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 253
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_8
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_9

    .line 257
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 258
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 259
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 260
    move-object/from16 v0, v31

    const/16 v1, 0x7ea

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 261
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 262
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 263
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    :cond_9
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_a

    .line 267
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 268
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 269
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 270
    move-object/from16 v0, v31

    const/16 v1, 0x7ec

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 271
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 272
    move-object/from16 v0, v31

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 273
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    :cond_a
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_b

    .line 277
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 278
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 279
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 280
    move-object/from16 v0, v31

    const/16 v1, 0x7eb

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 281
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 282
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 283
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    :cond_b
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_c

    .line 287
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 288
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 289
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 290
    move-object/from16 v0, v31

    const/16 v1, 0x7ed

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 291
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 292
    move-object/from16 v0, v31

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 293
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    :cond_c
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_d

    .line 297
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 298
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 299
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 300
    move-object/from16 v0, v31

    const/16 v1, 0x7ee

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 301
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 302
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 303
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 306
    :cond_d
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_e

    .line 307
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 308
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 309
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 310
    move-object/from16 v0, v31

    const/16 v1, 0x803

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 311
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 312
    move-object/from16 v0, v31

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 313
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    :cond_e
    const/4 v0, 0x0

    move-object/from16 v1, v23

    if-eq v0, v1, :cond_f

    .line 317
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 318
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 319
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 320
    move-object/from16 v0, v31

    const/16 v1, 0x804

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 321
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 322
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 323
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_f
    const/4 v0, 0x0

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_10

    .line 327
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 328
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 329
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 330
    move-object/from16 v0, v31

    const/16 v1, 0x805

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 331
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 332
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 333
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    :cond_10
    const/4 v0, 0x0

    move-object/from16 v1, v25

    if-eq v0, v1, :cond_11

    .line 336
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 337
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 338
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 339
    move-object/from16 v0, v31

    const/16 v1, 0x806

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 340
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 341
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 342
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 345
    :cond_11
    const/4 v0, 0x0

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_12

    .line 346
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 347
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 348
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 349
    move-object/from16 v0, v31

    const/16 v1, 0x807

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 350
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 351
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 352
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    :cond_12
    const/4 v0, 0x0

    move-object/from16 v1, v27

    if-eq v0, v1, :cond_13

    .line 356
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 357
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 358
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 359
    move-object/from16 v0, v31

    const/16 v1, 0x808

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 360
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 361
    move-object/from16 v0, v31

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 362
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 365
    :cond_13
    const/4 v0, 0x0

    move-object/from16 v1, v28

    if-eq v0, v1, :cond_14

    .line 366
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 367
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 368
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 369
    move-object/from16 v0, v31

    const/16 v1, 0x809

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 370
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 371
    move-object/from16 v0, v31

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 372
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    :cond_14
    const/4 v0, 0x0

    move-object/from16 v1, v29

    if-eq v0, v1, :cond_15

    .line 376
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 377
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 378
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 379
    move-object/from16 v0, v31

    const/16 v1, 0x80a

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 380
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    move-object/from16 v2, v31

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 381
    move-object/from16 v0, v31

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 382
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 385
    :cond_15
    const/4 v0, 0x0

    move-object/from16 v1, v30

    if-eq v0, v1, :cond_16

    .line 386
    new-instance v31, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct/range {v31 .. v31}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 387
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v4, v31

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 388
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 389
    move-object/from16 v0, v31

    const/16 v1, 0x80b

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 390
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 391
    move-object/from16 v0, v31

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 392
    move-object/from16 v0, v31

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 395
    :cond_16
    return-object v5
.end method

.method private static i(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;
    .locals 13
    .param p0    # Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 432
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 433
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cud;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 434
    if-gtz v5, :cond_0

    .line 435
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "samplePointToSleep so such type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const/4 v0, 0x0

    return-object v0

    .line 438
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getStartTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v6

    .line 439
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getEndTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 440
    const-string v0, "HiDataSwitchUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "samplePointToSleep startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " endTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    move-wide v10, v6

    :goto_0
    cmp-long v0, v10, v8

    if-gez v0, :cond_1

    .line 442
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 443
    invoke-virtual {v12, v5}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 444
    const/16 v0, 0xf

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 445
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v10

    invoke-virtual {v12, v10, v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 446
    const-wide/32 v0, 0xea60

    add-long/2addr v10, v0

    .line 447
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    goto :goto_0

    .line 449
    :cond_1
    return-object v4
.end method
