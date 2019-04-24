.class public Lo/dly;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dly$c;
    }
.end annotation


# instance fields
.field private b:Lo/dln;

.field e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lo/dly;->e:Landroid/content/Context;

    .line 57
    invoke-static {p1}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dly;->b:Lo/dln;

    .line 58
    return-void
.end method

.method static synthetic a(Lo/dly;)Lo/dln;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/dly;->b:Lo/dln;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 215
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadWeightGoalToCloud "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 218
    const-string v0, "scenarioId"

    const-string v1, "101"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    const-string v0, "date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/dmn;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    invoke-static {}, Lo/dmk;->b()Lo/dmk;

    move-result-object v5

    .line 221
    new-instance v0, Lo/dmf;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/dmf;-><init>(I)V

    const/4 v1, 0x2

    invoke-virtual {v5, v1, v0}, Lo/dmk;->c(ILo/dmj;)V

    .line 222
    new-instance v0, Lo/dly$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dly$c;-><init>(Lo/dly;Lo/dly$2;)V

    const/4 v1, 0x2

    invoke-virtual {v5, v1, v4, v0}, Lo/dmk;->c(ILjava/util/Map;Lo/dmd;)V

    .line 223
    return-void
.end method

.method static synthetic c(Lo/dly;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lo/dly;->c()V

    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/List;)[Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)[Z"
        }
    .end annotation

    .line 496
    const/4 v0, 0x2

    new-array v1, v0, [Z

    .line 497
    const/4 v2, 0x0

    .line 498
    const/4 v3, 0x0

    .line 499
    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 500
    const-string v0, "bmi_l3"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "bmi_l4"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "bmi_l5"

    .line 501
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 502
    :cond_0
    const/4 v2, 0x1

    .line 505
    :cond_1
    const-string v0, "SportFitness_0"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "SportFitness_1"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 506
    :cond_2
    const/4 v3, 0x1

    .line 510
    :cond_3
    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 511
    const-string v0, "bmi_l3"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "bmi_l4"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "bmi_l5"

    .line 512
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 513
    :cond_4
    const/4 v2, 0x1

    .line 516
    :cond_5
    const-string v0, "SportFitness_0"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "SportFitness_1"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 517
    :cond_6
    const/4 v3, 0x1

    .line 520
    :cond_7
    const/4 v0, 0x0

    aput-boolean v2, v1, v0

    .line 521
    const/4 v0, 0x1

    aput-boolean v3, v1, v0

    .line 522
    return-object v1
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .line 532
    const/4 v1, 0x0

    .line 533
    const-string v0, "HDK_WEIGHT"

    invoke-static {p0, v0}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 534
    const/4 v1, 0x1

    .line 536
    :cond_0
    return v1
.end method


# virtual methods
.method public a(Ljava/lang/String;Lo/egg;)V
    .locals 8

    .line 569
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkWeightCommon ruleConstants="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v4

    .line 571
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkWeightCommon isFollowWeight="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    if-eqz v4, :cond_0

    .line 573
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 575
    :cond_0
    invoke-static {}, Lo/dlj;->e()Z

    move-result v5

    .line 576
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWeightCommon outBMI = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    if-eqz v5, :cond_1

    .line 579
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 583
    :cond_1
    const-string v0, "recently_num_days_have_data"

    const/16 v1, 0x7531

    :try_start_0
    invoke-static {v1, p1, v0}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 585
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 586
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWeightCommon days = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    new-instance v1, Lo/dly$10;

    invoke-direct {v1, p0, p2}, Lo/dly$10;-><init>(Lo/dly;Lo/egg;)V

    invoke-virtual {p0, v0, v7, v1}, Lo/dly;->b(Landroid/content/Context;ILo/egg;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    goto :goto_0

    .line 598
    :catch_0
    move-exception v6

    .line 599
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWeightCommon NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    :goto_0
    return-void
.end method

.method public a(Lo/egg;)V
    .locals 7

    .line 545
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthVideo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    invoke-static {}, Lo/dlj;->c()Z

    move-result v4

    .line 547
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthVideo exerciseTimes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    const-string v0, "ai-weight-006"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 549
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "recommend_reduce_fat_video"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 551
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthVideo sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthVideo ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    if-eqz v5, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v4, :cond_0

    .line 556
    const-string v0, "ai-weight-006"

    invoke-virtual {p0, v0, p1}, Lo/dly;->a(Ljava/lang/String;Lo/egg;)V

    goto :goto_0

    .line 558
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 560
    :goto_0
    return-void
.end method

.method public b(D)V
    .locals 5

    .line 98
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDataToUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v4, v0

    .line 101
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    new-instance v1, Lo/dly$2;

    invoke-direct {v1, p0, v4}, Lo/dly$2;-><init>(Lo/dly;I)V

    invoke-static {v0, v1}, Lo/dmn;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 135
    return-void
.end method

.method public b(DJ)V
    .locals 14

    .line 166
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight lastestData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_last_up_cloud_weight_goal_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 170
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight lastUpCloudGoalTimeStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    const/4 v6, 0x0

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 174
    sub-long v9, v7, p3

    .line 175
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight timeInterval = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const-wide/32 v0, 0x240c8400

    cmp-long v0, v9, v0

    if-gez v0, :cond_2

    .line 179
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const/4 v6, 0x1

    goto :goto_1

    .line 183
    :cond_0
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 184
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dmn;->c(J)[J

    move-result-object v13

    .line 185
    const/4 v0, 0x0

    aget-wide v0, v13, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v0, v11, v0

    if-gez v0, :cond_1

    .line 186
    const/4 v6, 0x1

    goto :goto_0

    .line 188
    :cond_1
    const/4 v6, 0x0

    .line 192
    :goto_0
    goto :goto_1

    .line 190
    :catch_0
    move-exception v11

    .line 191
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight NumberFormatException e= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :cond_2
    :goto_1
    move v11, v6

    .line 197
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeUploadAcheiveWeight finalIsUpTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dly;->e:Landroid/content/Context;

    new-instance v2, Lo/dly$3;

    move-wide v3, p1

    invoke-direct {v2, p0, v11, v3, v4}, Lo/dly$3;-><init>(Lo/dly;ZD)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void
.end method

.method public b(Landroid/content/Context;ILo/egg;)V
    .locals 12

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 147
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v10, v8, v0

    .line 148
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, v10

    move-wide v4, v8

    new-instance v7, Lo/dly$5;

    invoke-direct {v7, p0, p3}, Lo/dly$5;-><init>(Lo/dly;Lo/egg;)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 159
    return-void
.end method

.method public c(ILjava/lang/String;I)V
    .locals 10

    .line 67
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    new-instance v6, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 69
    const/16 v0, 0x4e25

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 70
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 71
    invoke-static {v6, p2, p1}, Lo/dlu;->c(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;Ljava/lang/String;I)V

    .line 72
    const-string v0, "ai-weight-005"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 74
    iget-object v0, p0, Lo/dly;->b:Lo/dln;

    const/16 v1, 0x4e25

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v7

    .line 75
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 76
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg smartMsgDBObject = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/dly;->b:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v8

    .line 80
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg createTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v8, v9}, Ljava/util/Date;-><init>(J)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v8

    int-to-long v2, p3

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 82
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lo/dly;->b:Lo/dln;

    const/16 v1, 0x4e25

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 84
    iget-object v0, p0, Lo/dly;->b:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 90
    :cond_1
    :goto_0
    return-void
.end method

.method public c([JLo/egg;)V
    .locals 9

    .line 258
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPeriodWeightData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v0, 0x2

    new-array v8, v0, [D

    .line 260
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 261
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dly;->e:Landroid/content/Context;

    const/4 v2, 0x0

    aget-wide v2, p1, v2

    const/4 v4, 0x1

    aget-wide v4, p1, v4

    new-instance v7, Lo/dly$1;

    invoke-direct {v7, p0, p2, v8}, Lo/dly$1;-><init>(Lo/dly;Lo/egg;[D)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 278
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List<Ljava/lang/Object;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 368
    const-string v0, "show_device"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_last_suggest_kind"

    const-string v3, "show_device"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 372
    const/16 v0, 0x6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 374
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 376
    :cond_0
    iget-object v0, p0, Lo/dly;->e:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_last_suggest_kind"

    const-string v3, "show_service"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 378
    const/16 v0, 0x6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 380
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 382
    :goto_0
    return-void
.end method

.method public d(Lo/egg;)V
    .locals 12

    .line 319
    const-string v0, "ai-weight-008"

    const-string v1, "recently_num_days_change"

    const/16 v2, 0x7531

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 321
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeWeightUpSlowly daysStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const/16 v9, 0x1e

    .line 324
    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v9, v0

    .line 327
    goto :goto_0

    .line 325
    :catch_0
    move-exception v10

    .line 326
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeWeightUpSlowly NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, v9

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long v10, v0, v2

    .line 331
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dly;->e:Landroid/content/Context;

    move-wide v4, v10

    new-instance v7, Lo/dly$7;

    invoke-direct {v7, p0, p1, v10, v11}, Lo/dly$7;-><init>(Lo/dly;Lo/egg;J)V

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 364
    return-void
.end method

.method public d([JLo/egg;)V
    .locals 6

    .line 285
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAchieveGoalFromCloud "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 287
    const-string v0, "scenarioId"

    const-string v1, "101"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 289
    const-string v0, "startDate"

    const/4 v1, 0x0

    aget-wide v1, p1, v1

    invoke-static {v1, v2}, Lo/dmn;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    const-string v0, "endDate"

    const/4 v1, 0x1

    aget-wide v1, p1, v1

    invoke-static {v1, v2}, Lo/dmn;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    invoke-static {}, Lo/dmk;->b()Lo/dmk;

    move-result-object v5

    .line 292
    new-instance v0, Lo/dmh;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lo/dmh;-><init>(I)V

    const/4 v1, 0x3

    invoke-virtual {v5, v1, v0}, Lo/dmk;->c(ILo/dmj;)V

    .line 293
    new-instance v0, Lo/dly$4;

    invoke-direct {v0, p0, p2}, Lo/dly$4;-><init>(Lo/dly;Lo/egg;)V

    const/4 v1, 0x3

    invoke-virtual {v5, v1, v4, v0}, Lo/dmk;->c(ILjava/util/Map;Lo/dmd;)V

    .line 312
    :cond_0
    return-void
.end method

.method public e([J[DD)V
    .locals 12

    .line 392
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    const/4 v6, 0x0

    .line 396
    const-wide/16 v7, 0x0

    .line 397
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    const/4 v2, 0x1

    aget-wide v2, p2, v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3fa999999999999aL    # 0.05

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 398
    const/4 v6, 0x0

    .line 399
    const-wide/16 v7, 0x0

    goto :goto_0

    .line 400
    :cond_0
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    const/4 v2, 0x1

    aget-wide v2, p2, v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 401
    const/4 v6, 0x1

    .line 402
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    const/4 v2, 0x1

    aget-wide v2, p2, v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    goto :goto_0

    .line 404
    :cond_1
    const/4 v6, 0x2

    .line 405
    const/4 v0, 0x0

    aget-wide v0, p2, v0

    const/4 v2, 0x1

    aget-wide v2, p2, v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    .line 407
    :goto_0
    const/4 v0, 0x1

    aget-wide v0, p2, v0

    cmpg-double v0, v0, p3

    if-gtz v0, :cond_2

    .line 408
    const/4 v6, 0x3

    .line 410
    :cond_2
    move v9, v6

    .line 411
    move-wide v10, v7

    .line 412
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg finalWeekUpDown = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateWeightWeeklyMsg finalWeightChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    new-instance v0, Lo/dly$8;

    move-object v1, p0

    move-object v2, p1

    move-wide v3, v10

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lo/dly$8;-><init>(Lo/dly;[JDI)V

    invoke-virtual {p0, p1, v0}, Lo/dly;->d([JLo/egg;)V

    .line 487
    return-void
.end method
