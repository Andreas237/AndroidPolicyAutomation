.class public Lo/ctd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctd$d;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Lo/ctd$3;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/ctd;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ctd;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctd;->c:Landroid/content/Context;

    .line 40
    sget-object v0, Lo/ctd$d;->c:Lo/ctd;

    return-object v0
.end method

.method private a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
    .locals 13
    .param p2    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V"
        }
    .end annotation

    .line 108
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 109
    const/4 v8, 0x3

    .line 110
    const-string v0, "sport_cycle_distance_sum"

    invoke-virtual {p2, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v9, v0

    .line 111
    const-string v0, "sport_cycle_calorie_sum"

    invoke-virtual {p2, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 112
    const-string v0, "sport_cycle_duration_sum"

    invoke-virtual {p2, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 113
    invoke-static {v10}, Lo/cno;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRideTotal calorie is out of range hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void

    .line 118
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v11, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v12

    .line 119
    invoke-virtual {v7, v12}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 120
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 121
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 122
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 123
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 124
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    return-void
.end method

.method private b(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
    .locals 15
    .param p2    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V"
        }
    .end annotation

    .line 128
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 129
    const/4 v8, 0x2

    .line 130
    const-string v0, "sport_climb_step_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v9, v0

    .line 131
    const-string v0, "sport_climb_distance_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 132
    const-string v0, "sport_climb_calorie_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 133
    const-string v0, "sport_climb_duration_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v12, v0

    .line 134
    const-string v0, "sport_altitude_offset_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v13, v0

    .line 135
    invoke-static {v9}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    float-to-double v0, v13

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    :cond_0
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMountainTotal STEPS is out of range hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 141
    :cond_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/high16 v3, 0x41200000    # 10.0f

    div-float v3, v13, v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 142
    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v12, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 141
    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v14

    .line 143
    invoke-virtual {v7, v14}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 144
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 145
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 146
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 147
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 148
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    return-void
.end method

.method private c(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
    .locals 14
    .param p2    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V"
        }
    .end annotation

    .line 152
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 153
    const/16 v8, 0x9

    .line 154
    const/4 v9, 0x0

    .line 155
    const-string v0, "sport_swim_distance_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 156
    const-string v0, "sport_swim_calorie_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 157
    const-string v0, "sport_swim_duration_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v12, v0

    .line 160
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v12, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v13

    .line 161
    invoke-virtual {v7, v13}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 162
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 163
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 164
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 165
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 166
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    return-void
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
    .locals 14
    .param p2    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V"
        }
    .end annotation

    .line 66
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 67
    const/4 v8, 0x5

    .line 68
    const-string v0, "sport_walk_step_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v9, v0

    .line 69
    const-string v0, "sport_walk_distance_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 70
    const-string v0, "sport_walk_calorie_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 71
    const-string v0, "sport_walk_duration_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v12, v0

    .line 72
    invoke-static {v9}, Lo/cno;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addWalkTotal steps is out of range hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void

    .line 77
    :cond_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v12, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v13

    .line 78
    invoke-virtual {v7, v13}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 79
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 80
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 81
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 82
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 83
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    return-void
.end method

.method private e(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
    .locals 14
    .param p2    # Lcom/huawei/hihealth/HiHealthData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V"
        }
    .end annotation

    .line 87
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 88
    const/4 v8, 0x4

    .line 89
    const-string v0, "sport_run_step_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v9, v0

    .line 90
    const-string v0, "sport_run_distance_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 91
    const-string v0, "sport_run_calorie_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 92
    const-string v0, "sport_run_duration_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v12, v0

    .line 93
    invoke-static {v9}, Lo/cno;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunTotal steps is out of range hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 98
    :cond_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v12, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v13

    .line 99
    invoke-virtual {v7, v13}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 100
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 101
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 102
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 103
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 104
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 46
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 48
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v10

    .line 50
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v11

    .line 51
    const/4 v12, 0x2

    .line 52
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctd;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 53
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctd;->e(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 54
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctd;->a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 55
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctd;->b(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 56
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctd;->c(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 57
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    goto/16 :goto_0

    .line 60
    :cond_0
    invoke-interface {v6, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 61
    goto/16 :goto_0

    .line 62
    :cond_1
    return-object v6
.end method
