.class public Lo/csu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csu;->e:Landroid/content/Context;

    .line 40
    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 67
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->fetchTotalMidHighIntensity()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 70
    if-lez v5, :cond_1

    .line 71
    int-to-double v0, v5

    const v2, 0xb7fd

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->fetchIntensityMap()Ljava/util/Map;

    move-result-object v6

    .line 74
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 75
    const-string v0, "HiH_ExerciseIntensitySwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalExerciseIntensityBasic intensityMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-object v4

    .line 78
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 79
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 80
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 81
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 82
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 83
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 84
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Integer;

    .line 85
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/Integer;

    .line 86
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_3

    .line 87
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb7fe

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_4

    .line 90
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb7ff

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_5

    .line 93
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb800

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v10, :cond_6

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_6

    .line 96
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb801

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v11, :cond_7

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_7

    .line 99
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb802

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_8

    .line 102
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb803

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_8
    const/4 v0, 0x0

    if-eq v0, v13, :cond_9

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_9

    .line 105
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb804

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v14, :cond_a

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_a

    .line 108
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const v2, 0xb805

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_a
    return-object v4
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;
    .locals 15

    .line 131
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;-><init>()V

    .line 132
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 133
    const-string v0, "TOTAL"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 134
    const-string v0, "STEP"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 135
    const-string v0, "RUN"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 136
    const-string v0, "CYCLE"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 137
    const-string v0, "FITNESS"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 138
    const-string v0, "HEART"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 139
    const-string v0, "CLIMB"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 140
    const-string v0, "SWIM"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 141
    const-string v0, "UNKNOWHIGH"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 142
    if-lez v6, :cond_0

    if-ltz v7, :cond_0

    if-ltz v8, :cond_0

    if-ltz v9, :cond_0

    if-ltz v10, :cond_0

    if-ltz v11, :cond_0

    if-ltz v12, :cond_0

    if-ltz v13, :cond_0

    if-gez v14, :cond_1

    .line 144
    :cond_0
    const-string v0, "HiH_ExerciseIntensitySwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error ExerciseIntensityBasic stat, some stat < 0 or total <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->configTotalMidHighIntensity(Ljava/lang/Integer;)V

    .line 156
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;->configIntensityMap(Ljava/util/Map;)V

    .line 157
    return-object v4
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 43
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 44
    const-string v0, "HiH_ExerciseIntensitySwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the ExerciseIntensityTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    iget-object v0, p0, Lo/csu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 48
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchExerciseIntensityBasic()Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/csu;->b(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;)Ljava/util/List;

    move-result-object v5

    .line 50
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 51
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 52
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->fetchGenerateTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 55
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 56
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 57
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v6}, Lo/cob;->c(I)V

    .line 58
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 59
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 60
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 61
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v9, v10}, Lo/cob;->e(J)V

    .line 55
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 63
    :cond_4
    return-object v5
.end method

.method public e(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;"
        }
    .end annotation

    .line 114
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 115
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 116
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;-><init>()V

    .line 117
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configTimeZone(Ljava/lang/String;)V

    .line 118
    const-string v0, "modified_time"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configGenerateTime(Ljava/lang/Long;)V

    .line 119
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configRecordDay(Ljava/lang/Integer;)V

    .line 120
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configDataSource(Ljava/lang/Integer;)V

    .line 121
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configDeviceCode(Ljava/lang/Long;)V

    .line 122
    invoke-direct {p0, v4}, Lo/csu;->c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;

    move-result-object v6

    .line 123
    if-nez v6, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;->configExerciseIntensityBasic(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityBasic;)V

    .line 125
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    return-object v2
.end method
