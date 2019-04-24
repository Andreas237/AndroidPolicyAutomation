.class public Lo/ctg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctg$b;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Lo/ctg$4;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/ctg;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/ctg;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctg;->b:Landroid/content/Context;

    .line 44
    sget-object v0, Lo/ctg$b;->b:Lo/ctg;

    return-object v0
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V
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

    .line 118
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 119
    const/4 v8, 0x0

    .line 120
    const-string v0, "sport_step_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v9, v0

    .line 121
    const-string v0, "sport_distance_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v10, v0

    .line 122
    const-string v0, "sport_calorie_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v11, v0

    .line 123
    const-string v0, "sport_duration_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v12, v0

    .line 124
    const-string v0, "sport_altitude_offset_sum"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v13, v0

    .line 125
    invoke-static {v9}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v11}, Lo/cno;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    float-to-double v0, v13

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 126
    :cond_0
    const-string v0, "HiH_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addAllTotal STEPS or CALORIE or altitude is out of range hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void

    .line 129
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    move/from16 v1, p3

    if-ne v0, v1, :cond_2

    .line 130
    const-string v0, "HiH_SportDataSwitch"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addAllTotal date="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ": s="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", d="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", c="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :cond_2
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

    .line 135
    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 v5, v12, 0x3c

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 134
    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v14

    .line 136
    invoke-virtual {v7, v14}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 137
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 138
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 139
    move-object/from16 v0, p5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 140
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 141
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    return-void
.end method

.method private e(Ljava/util/List;Lcom/huawei/hwcloudmodel/model/unite/SportTotal;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Lcom/huawei/hwcloudmodel/model/unite/SportTotal;)Z"
        }
    .end annotation

    .line 97
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    .line 101
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getSportType()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasSameDeviceCode sportTotal="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v6

    .line 107
    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v7

    .line 108
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 109
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configSteps(Ljava/lang/Integer;)V

    .line 111
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_2
    goto/16 :goto_0

    .line 114
    :cond_3
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 64
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 66
    sget-object v0, Lo/ctg;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v5

    .line 67
    if-nez v5, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 71
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v7

    .line 72
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 73
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;-><init>()V

    .line 75
    const-string v0, "deviceStat"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configSteps(Ljava/lang/Integer;)V

    .line 76
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configCalorie(Ljava/lang/Integer;)V

    .line 77
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configDistance(Ljava/lang/Integer;)V

    .line 78
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;-><init>()V

    .line 79
    invoke-virtual {v10, v9}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 80
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 81
    invoke-virtual {v10, v8}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setTimeZone(Ljava/lang/String;)V

    .line 82
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setSportType(Ljava/lang/Integer;)V

    .line 83
    invoke-virtual {v5}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->setDeviceCode(Ljava/lang/Long;)V

    .line 84
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    goto/16 :goto_0

    .line 88
    :cond_1
    invoke-direct {p0, v2, v10}, Lo/ctg;->e(Ljava/util/List;Lcom/huawei/hwcloudmodel/model/unite/SportTotal;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    goto/16 :goto_0

    .line 91
    :cond_2
    invoke-interface {v2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 92
    goto/16 :goto_0

    .line 93
    :cond_3
    return-object v2
.end method

.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 48
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 49
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

    .line 50
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v10

    .line 52
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v11

    .line 53
    const/4 v12, 0x2

    .line 54
    move-object v0, p0

    move-object v1, v9

    move-object v2, v8

    move v3, v10

    move v4, v12

    move-object v5, v11

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/ctg;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IILjava/lang/String;)V

    .line 55
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {v6, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-object v6
.end method
