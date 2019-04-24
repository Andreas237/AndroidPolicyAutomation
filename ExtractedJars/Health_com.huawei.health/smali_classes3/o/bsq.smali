.class public Lo/bsq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bsp;


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/ref/SoftReference<Ljava/lang/Object;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    .line 147
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 3452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(IIILjava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/lang/String;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 1127
    const/4 v9, 0x0

    .line 1128
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 1129
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->p()Lo/btd;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v8, p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/btd;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 1130
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p3, :cond_1

    .line 1131
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v8, p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/btf;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 1132
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p3, :cond_2

    .line 1133
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->n()Lo/btl;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v8, p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/btl;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 1135
    :cond_2
    :goto_0
    return-object v9
.end method

.method private a(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 1116
    const/4 v9, 0x0

    .line 1117
    const/4 v0, 0x0

    move/from16 v1, p9

    if-ne v0, v1, :cond_0

    .line 1118
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lo/bth;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 1120
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->l()Lo/btk;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lo/btk;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 1122
    :goto_0
    return-object v9
.end method

.method static synthetic a(Lo/bsq;IIILjava/lang/String;)Ljava/util/List;
    .locals 1

    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bsq;->a(IIILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/health/suggestion/model/AccountInfo;Lcom/huawei/health/suggestion/model/PlanStatistics;I)V
    .locals 4

    .line 3066
    invoke-static {p2}, Lo/bso;->e(Lcom/huawei/health/suggestion/model/PlanStatistics;)Ljava/lang/String;

    move-result-object v3

    .line 3067
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "planStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_type_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3068
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireType()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3067
    invoke-static {v0, v3}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 3069
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;I)V"
        }
    .end annotation

    .line 1191
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 1192
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bth;->c(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    .line 1194
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->l()Lo/btk;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btk;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 1196
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/bsq;IIILjava/util/List;Lo/bsr;)V
    .locals 0

    .line 108
    invoke-direct/range {p0 .. p5}, Lo/bsq;->e(IIILjava/util/List;Lo/bsr;)V

    return-void
.end method

.method static synthetic a(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2, p3}, Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/AccountInfo;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 6

    .line 292
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btq;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 293
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->g()Lo/btn;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lo/brx;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/btn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 295
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 298
    :cond_0
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v5}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    return-object v5

    .line 301
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;
    .locals 11

    .line 2998
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bsq;->d(Lcom/huawei/health/suggestion/model/AccountInfo;I)Ljava/lang/String;

    move-result-object v4

    .line 2999
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/bsq;->d(Lcom/huawei/health/suggestion/model/AccountInfo;I)Ljava/lang/String;

    move-result-object v5

    .line 3000
    const/4 v6, 0x0

    .line 3001
    const/4 v7, 0x0

    .line 3003
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    .line 3004
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    .line 3007
    goto :goto_0

    .line 3005
    :catch_0
    move-exception v8

    .line 3006
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3008
    :goto_0
    invoke-static {v6}, Lo/bso;->h(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v8

    .line 3009
    invoke-static {v7}, Lo/bso;->h(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v9

    .line 3010
    new-instance v10, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/PlanStatistics;-><init>()V

    .line 3012
    const/4 v0, 0x4

    if-ne v0, p2, :cond_0

    .line 3013
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    .line 3014
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveCalorie(J)V

    .line 3015
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveTotalPlan(I)V

    goto :goto_1

    .line 3016
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 3017
    move-object v10, v8

    goto :goto_1

    .line 3018
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p2, :cond_2

    .line 3019
    move-object v10, v9

    .line 3021
    :cond_2
    :goto_1
    return-object v10
.end method

.method private b(Lorg/json/JSONObject;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;
    .locals 12

    .line 3030
    new-instance v4, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/PlanStatistics;-><init>()V

    .line 3031
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 3032
    return-object v4

    .line 3035
    :cond_0
    invoke-static {p1}, Lo/bso;->k(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v5

    .line 3036
    const-wide/16 v6, 0x0

    .line 3037
    const-wide/16 v8, 0x0

    .line 3038
    const/4 v10, 0x0

    .line 3039
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 3043
    const/4 v0, 0x4

    if-ne v0, p3, :cond_1

    .line 3044
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v0

    add-long/2addr v6, v0

    .line 3045
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v0

    add-long/2addr v8, v0

    .line 3046
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v0

    add-int/2addr v10, v0

    goto/16 :goto_1

    .line 3047
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p3, :cond_2

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireType()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_2

    .line 3048
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v6

    .line 3049
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v8

    .line 3050
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v10

    goto :goto_1

    .line 3051
    :cond_2
    const/4 v0, 0x3

    if-ne v0, p3, :cond_3

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireType()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    .line 3052
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v6

    .line 3053
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v8

    .line 3054
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v10

    .line 3056
    :cond_3
    :goto_1
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-direct {p0, p2, v0, p3}, Lo/bsq;->a(Lcom/huawei/health/suggestion/model/AccountInfo;Lcom/huawei/health/suggestion/model/PlanStatistics;I)V

    .line 3039
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 3058
    :cond_4
    invoke-virtual {v4, v8, v9}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    .line 3059
    invoke-virtual {v4, v6, v7}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveCalorie(J)V

    .line 3060
    invoke-virtual {v4, v10}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveTotalPlan(I)V

    .line 3061
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalDuration = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "totalCalorie = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "totalPlan = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3062
    return-object v4
.end method

.method private b(Ljava/lang/String;I)V
    .locals 1

    .line 1181
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1182
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->p()Lo/btd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btd;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 1183
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 1184
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btf;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 1185
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p2, :cond_2

    .line 1186
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->n()Lo/btl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btl;->a(Ljava/lang/String;)V

    .line 1188
    :cond_2
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 2

    .line 433
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btq;->d(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)Z

    .line 436
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 437
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->f()V

    .line 439
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 440
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->f()V

    .line 442
    :cond_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;IILjava/lang/String;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;IILjava/lang/String;I)V"
        }
    .end annotation

    .line 1159
    if-nez p3, :cond_0

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bta;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v0, p4}, Lo/bsz;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1160
    :goto_0
    if-eqz v4, :cond_1

    .line 1161
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWorkouts -- clear operType: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    invoke-direct {p0, p4, p2}, Lo/bsq;->b(Ljava/lang/String;I)V

    .line 1163
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bta;->d(I)V

    .line 1165
    :cond_1
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWorkouts---data from net"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    invoke-direct {p0, p4, p1, p2}, Lo/bsq;->e(Ljava/lang/String;Ljava/util/List;I)V

    .line 1167
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p3, p5, p2}, Lo/bta;->c(III)V

    .line 1169
    return-void
.end method

.method static synthetic b(Lo/bsq;Ljava/util/List;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;IZILjava/lang/String;II)V
    .locals 0

    .line 108
    invoke-direct/range {p0 .. p11}, Lo/bsq;->e(Ljava/util/List;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;IZILjava/lang/String;II)V

    return-void
.end method

.method private b(ZI)V
    .locals 6

    .line 2250
    invoke-virtual {p0}, Lo/bsq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 2251
    return-void

    .line 2254
    :cond_0
    invoke-virtual {p0}, Lo/bsq;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 2255
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 2256
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOpenRemind = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2257
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remindTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2258
    invoke-virtual {p0}, Lo/bsq;->d()Z

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lo/bsq;->b()I

    move-result v0

    if-eq p2, v0, :cond_2

    :cond_1
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 2259
    :goto_0
    if-eqz v5, :cond_3

    .line 2261
    invoke-static {v4, p1, p2}, Lo/bsv;->e(Lcom/huawei/health/suggestion/model/Plan;ZI)V

    .line 2262
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->g()V

    .line 2265
    :cond_3
    return-void
.end method

.method static synthetic c(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;
    .locals 1

    .line 108
    invoke-direct {p0, p1, p2}, Lo/bsq;->b(Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 108
    invoke-static {p0}, Lo/bsq;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Lo/bsr;)V"
        }
    .end annotation

    .line 1031
    const/16 v23, 0x32

    .line 1032
    move/from16 v0, p2

    const/16 v1, 0x32

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v24

    .line 1033
    const-string v0, "DataImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsFromCloud pageStart = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,adjustPageSize = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", userId = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1035
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    move/from16 v1, p1

    move/from16 v2, v24

    move/from16 v3, p6

    move-object/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p4

    move-object/from16 v7, p7

    move/from16 v8, p9

    new-instance v9, Lo/bsq$43;

    move-object/from16 v10, p0

    move-object/from16 v11, p11

    move-object/from16 v12, p10

    move/from16 v13, p1

    move/from16 v14, v24

    move/from16 v15, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    move/from16 v19, p6

    move-object/from16 v20, p7

    move-object/from16 v21, p8

    move/from16 v22, p9

    invoke-direct/range {v9 .. v22}, Lo/bsq$43;-><init>(Lo/bsq;Lo/bsr;Ljava/util/List;III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)V

    invoke-interface/range {v0 .. v9}, Lo/brz;->a(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;ILo/bsr;)V

    .line 1060
    return-void
.end method

.method private c(Ljava/lang/String;I)V
    .locals 1

    .line 1173
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1174
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bth;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 1176
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->l()Lo/btk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btk;->a(Ljava/lang/String;)V

    .line 1178
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 2131
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v0, p4, p1, p2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v4

    .line 2132
    invoke-static {v4}, Lo/bsw;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I

    move-result v0

    int-to-long v5, v0

    .line 2133
    invoke-static {}, Lo/bsm;->c()J

    move-result-wide v0

    const-wide/32 v2, 0x5f5e100

    sub-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-gez v0, :cond_0

    .line 2134
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x7

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x7

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2135
    return-void

    .line 2138
    :cond_0
    invoke-static {v4}, Lo/bsw;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v7

    .line 2139
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 2140
    invoke-virtual {p0, v7, v5, v6, p3}, Lo/bsq;->a(Ljava/util/List;JLo/bui;)V

    goto :goto_0

    .line 2142
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2144
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/bsq;ZI)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lo/bsq;->b(ZI)V

    return-void
.end method

.method static synthetic d(Lo/bsq;)Landroid/os/Handler;
    .locals 1

    .line 108
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lo/bsq;Lorg/json/JSONObject;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;
    .locals 1

    .line 108
    invoke-direct {p0, p1, p2, p3}, Lo/bsq;->b(Lorg/json/JSONObject;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/health/suggestion/model/AccountInfo;I)Ljava/lang/String;
    .locals 2

    .line 3025
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "planStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3026
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_type_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3025
    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/bsq;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 108
    invoke-direct {p0, p1, p2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List;
    .locals 1

    .line 108
    invoke-direct/range {p0 .. p9}, Lo/bsq;->a(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(JLjava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 3260
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$34;

    invoke-direct {v1, p0, p4, p5}, Lo/bsq$34;-><init>(Lo/bsq;Ljava/lang/String;Lo/bui;)V

    invoke-interface {v0, p1, p2, p3, v1}, Lo/brz;->d(JLjava/lang/String;Lo/bsr;)V

    .line 3311
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 13

    .line 762
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireRecordType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 763
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 765
    const/4 v4, 0x0

    .line 767
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v5

    .line 768
    const/16 v0, 0x65

    if-ne v0, v5, :cond_0

    .line 769
    const/4 v5, 0x0

    goto :goto_0

    .line 770
    :cond_0
    const/16 v0, 0x66

    if-ne v0, v5, :cond_1

    .line 771
    const/4 v5, 0x1

    goto :goto_0

    .line 773
    :cond_1
    return-void

    .line 776
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "planStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 777
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_type_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 776
    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 778
    const/4 v6, 0x0

    .line 780
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    .line 783
    goto :goto_1

    .line 781
    :catch_0
    move-exception v7

    .line 782
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    :goto_1
    invoke-static {v6}, Lo/bso;->h(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v7

    .line 785
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v8

    .line 786
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v10

    .line 787
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 788
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    add-long/2addr v0, v8

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    goto :goto_2

    .line 790
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v8

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveDuration(J)V

    .line 792
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-int v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v10

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->saveCalorie(J)V

    .line 793
    invoke-static {v7}, Lo/bso;->e(Lcom/huawei/health/suggestion/model/PlanStatistics;)Ljava/lang/String;

    move-result-object v12

    .line 795
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "planStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 798
    :cond_3
    return-void
.end method

.method static synthetic d(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V
    .locals 0

    .line 108
    invoke-direct/range {p0 .. p11}, Lo/bsq;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V

    return-void
.end method

.method static synthetic d(Lo/bsq;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lo/bsq;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method

.method static synthetic d(Lo/bsq;Ljava/lang/String;J)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2, p3}, Lo/bsq;->e(Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic d(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lo/bsq;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method

.method static synthetic d(Lo/bsq;Ljava/lang/String;Lo/bui;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lo/bsq;->m(Ljava/lang/String;Lo/bui;)V

    return-void
.end method

.method static synthetic d(Lo/bsq;Ljava/util/ArrayList;IILjava/lang/String;I)V
    .locals 0

    .line 108
    invoke-direct/range {p0 .. p5}, Lo/bsq;->b(Ljava/util/ArrayList;IILjava/lang/String;I)V

    return-void
.end method

.method static synthetic e(Lo/bsq;)Ljava/util/HashMap;
    .locals 1

    .line 108
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    return-object v0
.end method

.method private static e(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;"
        }
    .end annotation

    .line 3175
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filterOperationPageShow  operationPageList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 3177
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 3178
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/OperationPage;

    .line 3179
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireBeginDate()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_1

    .line 3180
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireEndDate()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    .line 3181
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 3183
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireEndSolution()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3184
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3188
    :cond_1
    :goto_1
    goto :goto_0

    .line 3189
    :cond_2
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filterOperationPageShow  operationPagesNew = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3190
    return-object v6
.end method

.method private e(IIILjava/util/List;Lo/bsr;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Lo/bsr;)V"
        }
    .end annotation

    .line 1674
    const/16 v9, 0x32

    .line 1675
    const/16 v0, 0x32

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 1676
    const-string v0, "DataImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorListCloud pageStart = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,adjustPageSize = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1677
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$11;

    move-object v2, p0

    move-object/from16 v3, p5

    move-object v4, p4

    move v5, p1

    move v6, v10

    move v7, p2

    move v8, p3

    invoke-direct/range {v1 .. v8}, Lo/bsq$11;-><init>(Lo/bsq;Lo/bsr;Ljava/util/List;IIII)V

    invoke-interface {v0, p1, v10, p3, v1}, Lo/brz;->e(IIILo/bsr;)V

    .line 1700
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 6

    .line 557
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v5

    .line 558
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 559
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createJoinRunPlan(Plan plan):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    return-void

    .line 563
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/bsq;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 565
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->g()Lo/btn;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lo/brx;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/btn;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 566
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    return-void
.end method

.method private e(Ljava/lang/String;J)V
    .locals 5

    .line 1339
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1340
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1341
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan(String planId, long finishTime):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1342
    return-void

    .line 1345
    :cond_0
    invoke-direct {p0}, Lo/bsq;->l()V

    .line 1346
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_1

    .line 1348
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/btq;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    goto :goto_0

    .line 1351
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btq;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1354
    :goto_0
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 1355
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->f()V

    .line 1357
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1358
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->i()V

    .line 1361
    :cond_2
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1363
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bsz;->d(Ljava/lang/String;)V

    .line 1365
    invoke-static {p1}, Lo/btw;->c(Ljava/lang/String;)V

    .line 1367
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1370
    :cond_3
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1371
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 3314
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 3315
    invoke-static {p1}, Lo/bsm;->m(Ljava/lang/String;)Z

    move-result v4

    .line 3316
    if-eqz v4, :cond_1

    .line 3317
    invoke-static {p2}, Lo/bsm;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3318
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3319
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3320
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v7

    .line 3321
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downLoadFitnessAudioXMl file delete: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3323
    :cond_0
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$31;

    invoke-direct {v1, p0, p3, p1}, Lo/bsq$31;-><init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V

    invoke-interface {v0, p1, v5, v1}, Lo/brz;->c(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 3338
    goto :goto_0

    .line 3339
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p3, v0}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 3341
    :goto_0
    goto :goto_1

    .line 3342
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p3, v0}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 3344
    :goto_1
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;I)V"
        }
    .end annotation

    .line 1199
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 1200
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->p()Lo/btd;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btd;->c(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    .line 1201
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p3, :cond_1

    .line 1202
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btf;->c(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    .line 1203
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p3, :cond_2

    .line 1204
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->n()Lo/btl;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/btl;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 1206
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;IZILjava/lang/String;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;IZILjava/lang/String;II)V"
        }
    .end annotation

    .line 1141
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-ne v0, v1, :cond_0

    move/from16 v0, p6

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    .line 1142
    :goto_0
    if-eqz v9, :cond_3

    .line 1143
    if-nez p8, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    move/from16 v1, p10

    invoke-virtual {v0, v1}, Lo/bta;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v0}, Lo/bsz;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 1144
    :goto_1
    if-eqz v10, :cond_3

    .line 1145
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWorkouts -- clear isRecommend: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez p10, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1147
    move-object/from16 v0, p9

    move/from16 v1, p10

    invoke-direct {p0, v0, v1}, Lo/bsq;->c(Ljava/lang/String;I)V

    .line 1148
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    move/from16 v1, p10

    invoke-virtual {v0, v1}, Lo/bta;->b(I)V

    .line 1151
    :cond_3
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWorkouts---data from net"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    move-object/from16 v0, p9

    move/from16 v1, p10

    invoke-direct {p0, v0, p1, v1}, Lo/bsq;->a(Ljava/lang/String;Ljava/util/List;I)V

    .line 1154
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    move/from16 v1, p8

    move/from16 v2, p11

    move/from16 v3, p6

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    move-object/from16 v7, p5

    move/from16 v8, p10

    invoke-virtual/range {v0 .. v8}, Lo/bta;->c(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)V

    .line 1155
    return-void
.end method

.method static synthetic e(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bsq;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V

    return-void
.end method

.method private e(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 1077
    invoke-direct/range {p0 .. p0}, Lo/bsq;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1078
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x4

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p11

    const/4 v3, -0x4

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1079
    return-void

    .line 1081
    :cond_0
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p7

    move-object/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p5

    move-object/from16 v7, p8

    move/from16 v8, p10

    invoke-virtual/range {v0 .. v8}, Lo/bta;->b(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1083
    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 1084
    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move/from16 v9, p10

    move-object/from16 v10, v25

    new-instance v11, Lo/bsq$42;

    move-object/from16 v12, p0

    move/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    move-object/from16 v17, p6

    move/from16 v18, p7

    move-object/from16 v19, p8

    move-object/from16 v20, p9

    move/from16 v21, p10

    move-object/from16 v22, p11

    move-object/from16 v23, v25

    move/from16 v24, p1

    invoke-direct/range {v11 .. v24}, Lo/bsq$42;-><init>(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;Ljava/util/ArrayList;Z)V

    invoke-direct/range {v0 .. v11}, Lo/bsq;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V

    .line 1106
    goto :goto_0

    .line 1107
    :cond_1
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts---data from local"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move/from16 v9, p10

    invoke-direct/range {v0 .. v9}, Lo/bsq;->a(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v25

    .line 1111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p11

    move-object/from16 v2, v25

    invoke-virtual {v1, v0, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1113
    :goto_0
    return-void
.end method

.method private l()V
    .locals 3

    .line 2271
    invoke-virtual {p0}, Lo/bsq;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2272
    return-void

    .line 2274
    :cond_0
    invoke-virtual {p0}, Lo/bsq;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 2275
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 2277
    invoke-static {v2}, Lo/bsv;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 2279
    invoke-static {}, Lo/bsv;->d()V

    .line 2280
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2281
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->g()V

    .line 2284
    :cond_1
    return-void
.end method

.method private l(Ljava/lang/String;Lo/bui;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1830
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1831
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1832
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWorkoutRecords(final String planId, final UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1833
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1834
    return-void

    .line 1836
    :cond_0
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$13;

    invoke-direct {v1, p0, p2, v4, p1}, Lo/bsq$13;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->d(Ljava/lang/String;Lo/bsr;)V

    .line 1857
    return-void
.end method

.method private m(Ljava/lang/String;Lo/bui;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1428
    invoke-virtual/range {p0 .. p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v13

    .line 1429
    const/4 v0, 0x0

    if-ne v0, v13, :cond_0

    .line 1430
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postFinishPlan(final String planId, long UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1431
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1432
    return-void

    .line 1434
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 1435
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v0, v1, v2}, Lo/btq;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v16

    .line 1436
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_1

    .line 1438
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e29

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    const/16 v3, 0x4e29

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1439
    return-void

    .line 1441
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v2

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualDistance()F

    move-result v3

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualCalorie()F

    move-result v4

    move-wide v5, v14

    new-instance v7, Lo/bsq$4;

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p1

    move-wide v11, v14

    invoke-direct/range {v7 .. v12}, Lo/bsq$4;-><init>(Lo/bsq;Lo/bui;Ljava/lang/String;J)V

    invoke-interface/range {v0 .. v7}, Lo/brz;->c(Ljava/lang/String;FFFJLo/bsr;)V

    .line 1458
    return-void
.end method

.method private o()Z
    .locals 1

    .line 3371
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3372
    const/4 v0, 0x0

    return v0

    .line 3374
    :cond_0
    invoke-static {}, Lo/bzu$e;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private p()Z
    .locals 1

    .line 3378
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Lcom/huawei/health/suggestion/model/Plan;
    .locals 2

    .line 264
    invoke-virtual {p0}, Lo/bsq;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 266
    if-nez v1, :cond_0

    .line 267
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 269
    :cond_0
    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;
    .locals 6

    .line 1282
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1283
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1284
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanProgress(String planId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    const/4 v0, 0x0

    return-object v0

    .line 1287
    :cond_0
    invoke-virtual {p0}, Lo/bsq;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 1288
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1289
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    return-object v0

    .line 1290
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 1291
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btq;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    return-object v0

    .line 1294
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 1778
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1779
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1780
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords(String planId, int startDate, int endDate)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1781
    const/4 v0, 0x0

    return-object v0

    .line 1783
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation

    .line 3195
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 3196
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 3197
    const/4 v0, 0x0

    return-object v0

    .line 3200
    :cond_0
    invoke-static {p1}, Lo/bzv;->b(Ljava/util/Date;)I

    move-result v5

    .line 3201
    invoke-static {p2}, Lo/bzv;->b(Ljava/util/Date;)I

    move-result v6

    .line 3202
    const-string v0, "DataImpl"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecordsByDateRange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3203
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->r()Lo/btc;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5, v6}, Lo/btc;->a(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 468
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v5

    .line 469
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 470
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWorkoutRecords null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    return-void

    .line 474
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWorkoutRecords ids = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 477
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 476
    const/16 v4, 0x9

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/bsz;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z

    .line 478
    return-void
.end method

.method public a(ILo/bui;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 808
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v12

    .line 809
    const/4 v0, 0x0

    if-ne v0, v12, :cond_0

    .line 810
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecommendWorkouts(final int count, final UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo()==null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 812
    return-void

    .line 814
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 815
    move-object v0, p0

    move v3, p1

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Lo/bsq$36;

    move-object/from16 v1, p2

    invoke-direct {v11, p0, p1, v12, v1}, Lo/bsq$36;-><init>(Lo/bsq;ILcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v11}, Lo/bsq;->e(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 833
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    move v2, p1

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/bth;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 834
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v13}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 836
    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Map;Lo/bui;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;)V"
        }
    .end annotation

    .line 489
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 490
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 491
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createRunPlan(final RunPlanParams planParams, final UICallback<Plan> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 493
    return-void

    .line 495
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 497
    const-string v0, "coachVars"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireCoachVars()Lfi/firstbeat/coach/CoachVars;

    move-result-object v1

    invoke-virtual {v1}, Lfi/firstbeat/coach/CoachVars;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bsq;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 498
    const-string v0, "plan"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/Plan;

    .line 499
    const-string v0, "workouts"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 501
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v6}, Lo/bsu;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 504
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 505
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-static {v5}, Lo/bsx;->b(Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lo/bsx;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/bsq$33;

    invoke-direct {v3, p0, p3, v5}, Lo/bsq$33;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/Plan;)V

    invoke-interface {v0, v1, v2, v3}, Lo/brz;->a(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    goto :goto_0

    .line 523
    :cond_1
    invoke-direct {p0, v5}, Lo/bsq;->e(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 524
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 527
    :goto_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 528
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 530
    :try_start_0
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 531
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 532
    const-string v0, "movementTimes"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireWeekTimes()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 533
    const/4 v9, 0x0

    .line 534
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireEventDate()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 535
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireEventDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 537
    :cond_2
    const-string v0, "matchDate"

    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 539
    :cond_3
    const-string v0, "goal"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 540
    const-string v0, "excludedDate"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireExcludedDates()Ljava/util/TreeSet;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 541
    const-string v0, "data"

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    const-string v0, "1120008"

    invoke-static {v0, v7}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 545
    goto :goto_1

    .line 543
    :catch_0
    move-exception v9

    .line 544
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    :goto_1
    goto :goto_2

    .line 547
    :cond_4
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const v1, 0x30d51

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x30d51

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 549
    :goto_2
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 9

    .line 708
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v6

    .line 709
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    if-nez p1, :cond_1

    .line 710
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatePlanProgress(WorkoutRecord workoutRecord):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    return-void

    .line 716
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/btg;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/btw;->c(Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 722
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bsz;->e(Ljava/lang/String;Ljava/lang/String;J)Z

    .line 725
    invoke-direct {p0, p1, v6}, Lo/bsq;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/AccountInfo;)V

    .line 727
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->isSingle()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 728
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v7

    .line 729
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v8

    .line 731
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    invoke-virtual {v0, v7, v8, p1}, Lo/bss;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 733
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bss;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 734
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bsz;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 738
    :cond_2
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v7

    .line 739
    if-nez v7, :cond_3

    .line 740
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatePlanProgress(WorkoutRecord workoutRecord):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "currentPlan\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    return-void

    .line 744
    :cond_3
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 745
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatePlanProgress(WorkoutRecord workoutRecord):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "not current plan"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    return-void

    .line 749
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 751
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    .line 752
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v5

    invoke-static {v3, v4, v5}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v3

    .line 751
    invoke-virtual {v0, v1, v2, v3}, Lo/bsj;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V

    .line 754
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bsj;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 755
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bsz;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 757
    :cond_5
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/btq;->e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanRecord;)V

    .line 759
    :cond_6
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;ILo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;ILo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1495
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$8;

    invoke-direct {v1, p0, p4}, Lo/bsq$8;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, p1, p2, p3, v1}, Lo/brz;->c(Ljava/lang/String;Ljava/lang/String;ILo/bsr;)V

    .line 1508
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2072
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2073
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, -0x194

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p3

    const/16 v3, -0x194

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2074
    return-void

    .line 2078
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v11

    .line 2079
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2080
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadWorkoutMediaFiles(String workoutId, String version, final UICallback<String> callback) :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == userId"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2081
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p3

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2082
    return-void

    .line 2086
    :cond_1
    invoke-static {}, Lo/bsm;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->t(Ljava/lang/String;)J

    move-result-wide v12

    .line 2088
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2089
    const-string v14, "zh_CN"

    goto :goto_0

    .line 2091
    :cond_2
    const-string v14, "en_US"

    .line 2093
    :goto_0
    move-object v0, p0

    move-wide v1, v12

    move-object v3, v14

    invoke-static/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lo/bsq$18;

    move-object v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object v10, v11

    invoke-direct/range {v5 .. v10}, Lo/bsq$18;-><init>(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V

    invoke-direct/range {v0 .. v5}, Lo/bsq;->d(JLjava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 2112
    return-void
.end method

.method public a(Ljava/lang/String;Lo/bui;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1244
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1245
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1246
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postPlanProgress(String exerciseTime, final UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1247
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1248
    return-void

    .line 1251
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bts;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v5

    .line 1252
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 1253
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireRecordType()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v6, 0x0

    goto :goto_0

    :cond_1
    const/4 v6, 0x1

    .line 1254
    :goto_0
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$3;

    invoke-direct {v1, p0, p2, v5}, Lo/bsq$3;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    invoke-interface {v0, v6, v5, v1}, Lo/brz;->c(ILcom/huawei/health/suggestion/model/WorkoutRecord;Lo/bsr;)V

    .line 1269
    goto :goto_1

    .line 1270
    :cond_2
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1272
    :goto_1
    return-void
.end method

.method public a(Ljava/util/List;JLo/bui;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;JLo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2180
    invoke-static {p1}, Lo/bsu;->a(Ljava/util/List;)Lcom/huawei/health/suggestion/model/Media;

    move-result-object v2

    .line 2181
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 2183
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2184
    return-void

    .line 2187
    :cond_0
    new-instance v0, Lo/btb;

    invoke-direct {v0, p1, p2, p3, p4}, Lo/btb;-><init>(Ljava/util/List;JLo/bui;)V

    invoke-virtual {v0}, Lo/btb;->a()V

    .line 2188
    return-void
.end method

.method public a(Ljava/util/List;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2497
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2498
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2499
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postDeleteUserWorkout(List<FitWorkout> fitWorkouts, final UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2500
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2501
    return-void

    .line 2504
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2505
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$25;

    invoke-direct {v1, p0, p2, v4, v5}, Lo/bsq$25;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/util/ArrayList;)V

    invoke-interface {v0, v5, v1}, Lo/brz;->a(Ljava/util/List;Lo/bsr;)V

    .line 2519
    return-void
.end method

.method public a(Lo/bui;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/PlanStat;>;)V"
        }
    .end annotation

    .line 2416
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2417
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2418
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBestRecords(final UICallback<PlanStat> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2419
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p1, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2420
    return-void

    .line 2423
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2424
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$22;

    invoke-direct {v1, p0, p1, v4}, Lo/bsq$22;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V

    invoke-interface {v0, v1}, Lo/brz;->a(Lo/bsr;)V

    goto :goto_0

    .line 2441
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/bsj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2443
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;II)Z
    .locals 5

    .line 1868
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1869
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1870
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBestRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1871
    const/4 v0, 0x0

    return v0

    .line 1873
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 2

    .line 2555
    const-string v0, "remindTime"

    invoke-virtual {p0, v0}, Lo/bsq;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/caj;->b(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public b(IILo/bui;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation

    .line 160
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v7

    .line 161
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 162
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedPlans(final int pageStart, final int pageSize, final UICallback<List<PlanRecord>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 164
    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lo/btq;->b(IILjava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 169
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bta;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$1;

    move-object v2, p0

    move-object v3, p3

    move v4, p1

    move v5, p2

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Lo/bsq$1;-><init>(Lo/bsq;Lo/bui;IILcom/huawei/health/suggestion/model/AccountInfo;)V

    invoke-interface {v0, p1, p2, v1}, Lo/brz;->e(IILo/bsr;)V

    goto :goto_0

    .line 194
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, v8}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 196
    :goto_0
    return-object v8
.end method

.method public b(IIILo/bui;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 1629
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v13

    .line 1630
    const/4 v0, 0x0

    if-ne v0, v13, :cond_0

    .line 1631
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorList(final int pageStart, final int pageSize, final int operType, final UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo()==null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1632
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p4

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1633
    return-void

    .line 1636
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1637
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x4

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p4

    const/4 v3, -0x4

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1638
    return-void

    .line 1640
    :cond_1
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v0, v1, v2, v3}, Lo/bta;->d(III)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1642
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1643
    move-object v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v14

    new-instance v5, Lo/bsq$9;

    move-object v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move-object v10, v13

    move-object/from16 v11, p4

    move-object v12, v14

    invoke-direct/range {v5 .. v12}, Lo/bsq$9;-><init>(Lo/bsq;IIILcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;Ljava/util/ArrayList;)V

    invoke-direct/range {v0 .. v5}, Lo/bsq;->e(IIILjava/util/List;Lo/bsr;)V

    .line 1661
    goto :goto_0

    .line 1662
    :cond_2
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorList---data from local"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1663
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {p0, v1, v2, v3, v0}, Lo/bsq;->a(IIILjava/lang/String;)Ljava/util/List;

    move-result-object v14

    .line 1664
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    .line 1665
    invoke-static {v14}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1667
    :cond_3
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p4

    invoke-virtual {v1, v0, v14}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1669
    :goto_0
    return-void
.end method

.method public b(ILo/bui;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Lcom/huawei/health/suggestion/model/TrainStatistics;>;)V"
        }
    .end annotation

    .line 2910
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrainStatistics type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2911
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2912
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2913
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPageLocal(final UICallback<List<OperationPage>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2914
    const/16 v0, 0x4e21

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4e21

    invoke-virtual {p2, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 2915
    return-void

    .line 2918
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2919
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanStatistics is oversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2920
    const-string v0, "this version is oversea version"

    const/16 v1, 0x63

    invoke-virtual {p2, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 2921
    return-void

    .line 2924
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$29;

    invoke-direct {v1, p0, v4, p2}, Lo/bsq$29;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->e(ILo/bsr;)V

    .line 2963
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 3226
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 3227
    return-void

    .line 3229
    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 3230
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm\'\'ss\""

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 3231
    const/4 v8, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 3232
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 3233
    const-string v0, "-time:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-formatTime:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3231
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 3235
    :cond_1
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertFitnessIntensityData:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3236
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 3237
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 3238
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Long;

    .line 3239
    new-instance v12, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 3240
    invoke-virtual {v12, v8}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 3241
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 3242
    const/4 v0, 0x7

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 3243
    const/4 v0, 0x4

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 3244
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3245
    goto :goto_1

    .line 3247
    :cond_2
    new-instance v10, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 3248
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 3249
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/bsq$32;

    invoke-direct {v1, p0}, Lo/bsq$32;-><init>(Lo/bsq;)V

    invoke-virtual {v0, v10, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 3255
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .line 1516
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "collectBehavior workoutId="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1518
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1519
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "collectBehavior(String workoutId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1520
    return-void

    .line 1522
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bsz;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1524
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 1525
    if-nez v5, :cond_1

    .line 1526
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "collectBehavior(String workoutId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "workout\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1527
    return-void

    .line 1529
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/btf;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 1531
    return-void
.end method

.method public b(Ljava/lang/String;ILo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2294
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$17;

    invoke-direct {v1, p0, p3}, Lo/bsq$17;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, p1, p2, v1}, Lo/brz;->a(Ljava/lang/String;ILo/bsr;)V

    .line 2306
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 409
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 410
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 411
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatePlanName(String planId, String name) "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    return-void

    .line 415
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btq;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 417
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 418
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 419
    invoke-virtual {v5, p2}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 420
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v5}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bsz;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 424
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 452
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$23;

    invoke-direct {v1, p0, p3}, Lo/bsq$23;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, p1, p2, v1}, Lo/brz;->b(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 464
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/bui;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 2148
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2149
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2150
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadWorkoutMediaFiles(String workoutId, String version, final UICallback<String> callback) :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == accountInfo"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2151
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2152
    return-void

    .line 2155
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 2156
    invoke-static {v5, p4}, Lo/bsw;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)I

    move-result v0

    int-to-long v6, v0

    .line 2157
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mediaFileLength:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2158
    invoke-static {}, Lo/bsm;->c()J

    move-result-wide v0

    const-wide/32 v2, 0x5f5e100

    sub-long/2addr v0, v2

    cmp-long v0, v0, v6

    if-gez v0, :cond_1

    .line 2159
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x7

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x7

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2160
    return-void

    .line 2163
    :cond_1
    invoke-static {v5, p4}, Lo/bsw;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)Ljava/util/List;

    move-result-object v8

    .line 2164
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 2165
    invoke-virtual {p0, v8, v6, v7, p3}, Lo/bsq;->a(Ljava/util/List;JLo/bui;)V

    goto :goto_0

    .line 2167
    :cond_2
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2169
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1535
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$10;

    invoke-direct {v1, p0, p2}, Lo/bsq$10;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->a(Ljava/lang/String;Lo/bsr;)V

    .line 1548
    return-void
.end method

.method public b(Lo/bui;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 3352
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 3353
    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.health.suggestion.config.MoveService.DEL_ACTION"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 3354
    new-instance v0, Lo/bsq$40;

    invoke-direct {v0, p0, p1}, Lo/bsq$40;-><init>(Lo/bsq;Lo/bui;)V

    invoke-virtual {v2, v0, v3}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 3362
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/config/MoveService;->c(Landroid/content/Context;I)V

    .line 3363
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 6

    .line 2028
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2029
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2030
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutMediaFilesLength null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2031
    const/4 v0, 0x0

    return v0

    .line 2033
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo/bsq;->c(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    .line 2034
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mediaFilesLength:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2035
    if-nez v5, :cond_1

    .line 2036
    const/4 v0, 0x1

    return v0

    .line 2038
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 2006
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2007
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2008
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutMediaFilesLength null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2009
    const/4 v0, 0x0

    return v0

    .line 2011
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2012
    const/4 v0, 0x0

    return v0

    .line 2014
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 2015
    invoke-static {v5}, Lo/bsw;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I

    move-result v6

    .line 2016
    return v6
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 7

    .line 2051
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2052
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2053
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireWorkoutMediaFileSize null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2054
    const/4 v0, 0x0

    return v0

    .line 2056
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 2057
    invoke-static {v5, p3}, Lo/bsw;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)I

    move-result v6

    .line 2059
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireWorkoutMediaFileSize:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2060
    return v6
.end method

.method public c(J)Lcom/huawei/health/suggestion/model/DataSync;
    .locals 5

    .line 2601
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2602
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2603
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSyncRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2604
    const/4 v0, 0x0

    return-object v0

    .line 2606
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bsz;->c(Ljava/lang/String;J)Lcom/huawei/health/suggestion/model/DataSync;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;"
        }
    .end annotation

    .line 1233
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bui;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 2567
    const-string v0, "workoutFilters"

    invoke-virtual {p0, v0}, Lo/bsq;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2568
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2569
    :cond_0
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$21;

    invoke-direct {v1, p0, p1}, Lo/bsq$21;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, v1}, Lo/brz;->c(Lo/bsr;)V

    goto :goto_0

    .line 2589
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2591
    :goto_0
    return-object v2
.end method

.method public c()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;"
        }
    .end annotation

    .line 649
    const/4 v1, 0x0

    .line 650
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 651
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 652
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 653
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v3

    .line 654
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 655
    invoke-static {v5}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v6

    .line 656
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->putWorkoutDate(Ljava/lang/String;)V

    .line 657
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    goto :goto_0

    .line 660
    :cond_0
    return-object v1
.end method

.method public c(Ljava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 693
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 694
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 695
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireWorkoutOrder(String planId, String date):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    .line 698
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bts;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(IILo/bui;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 2797
    const-string v0, "DataImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId pageNum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , topicId = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2798
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v7

    .line 2799
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 2800
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId(String topicId, int pageNum, final UICallback<FitWorkout> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2801
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2802
    return-void

    .line 2805
    :cond_0
    invoke-direct {p0}, Lo/bsq;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bta;->d(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2806
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId from cloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2807
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$27;

    move-object v2, p0

    move-object v3, v7

    move v4, p2

    move v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lo/bsq$27;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;IILo/bui;)V

    invoke-interface {v0, p1, p2, v1}, Lo/brz;->d(IILo/bsr;)V

    goto :goto_0

    .line 2829
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p1}, Lo/btp;->d(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v8

    .line 2830
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId form db "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2831
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, v8}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2833
    :goto_0
    return-void
.end method

.method public c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 933
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v12

    .line 934
    const/4 v0, 0x0

    if-ne v0, v12, :cond_0

    .line 935
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecommendWorkouts(int pageStart, int pageSize, Integer[] types, Integer[] difficulties, Integer[] trainingPoints, int isSupportDevice, Integer[] equipments, final UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo()==null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 936
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p8

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 937
    return-void

    .line 939
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 940
    move-object v0, p0

    move v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v11, p8

    const/4 v1, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v11}, Lo/bsq;->e(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 943
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    move v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v0 .. v8}, Lo/bth;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 945
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p8

    invoke-virtual {v1, v0, v13}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 947
    :goto_0
    return-void
.end method

.method public c(ILo/bui;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;)V"
        }
    .end annotation

    .line 2712
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessCourseTopicList pageNum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2713
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2714
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2715
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBestRecords(final UICallback<CourseTopic> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2716
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2717
    return-void

    .line 2721
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2722
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btp;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 2723
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 2724
    :cond_1
    const-string v6, "recommend_three_course.txt"

    .line 2725
    const-string v0, "suggestion"

    invoke-static {v0, v6}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lo/bzw;->b(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v7

    .line 2726
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommend_three_course = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2727
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->h(I)V

    .line 2728
    const/4 v8, 0x0

    .line 2730
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2731
    invoke-static {v8}, Lo/bso;->d(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    move-object v5, v0

    .line 2732
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5, p1}, Lo/btp;->b(Ljava/lang/String;Ljava/util/List;I)V

    .line 2733
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/Topic;

    .line 2734
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bta;->f(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2735
    goto :goto_0

    .line 2739
    :cond_2
    goto :goto_1

    .line 2737
    :catch_0
    move-exception v9

    .line 2738
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse fileUrlJson exception, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2741
    :goto_1
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2743
    const-string v10, "fitworkouts.txt"

    .line 2744
    const-string v0, "suggestion"

    invoke-static {v0, v10}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lo/bzw;->b(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v11

    .line 2745
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workouStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2746
    const-class v0, [Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v11, v0}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v9

    .line 2747
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->o()Lo/bth;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v9}, Lo/bth;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 2748
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v9, v0

    .line 2749
    const/4 v12, 0x0

    :goto_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_3

    .line 2750
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1, v2}, Lo/btg;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 2749
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 2754
    :cond_3
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2755
    return-void

    .line 2757
    :cond_4
    invoke-direct {p0}, Lo/bsq;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->c(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2758
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$30;

    invoke-direct {v1, p0, v4, p1, p2}, Lo/bsq$30;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;ILo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->a(ILo/bsr;)V

    goto :goto_3

    .line 2784
    :cond_5
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btp;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 2785
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2787
    :goto_3
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 8

    .line 3090
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 3091
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    if-nez p1, :cond_1

    .line 3092
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savetrainstatis(WorkoutRecord record):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3093
    return-void

    .line 3096
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trainStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3097
    invoke-static {v5}, Lo/bso;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/TrainStatistics;

    move-result-object v6

    .line 3098
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveDuration(J)V

    .line 3099
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveTotalTimes(J)V

    .line 3100
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v2

    float-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveCalorie(J)V

    .line 3101
    invoke-static {v6}, Lo/bso;->c(Lcom/huawei/health/suggestion/model/TrainStatistics;)Ljava/lang/String;

    move-result-object v7

    .line 3103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trainStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 3104
    return-void
.end method

.method public c(Ljava/lang/String;ILo/bui;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2448
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v7

    .line 2449
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 2450
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrainBestRecords(final UICallback<BestRecordFitStat> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2451
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2452
    return-void

    .line 2455
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2456
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$24;

    move-object v2, p0

    move-object v3, v7

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lo/bsq$24;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;ILo/bui;)V

    invoke-interface {v0, v1}, Lo/brz;->d(Lo/bsr;)V

    goto :goto_0

    .line 2474
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bss;->e(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    .line 2475
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p3, v0, v8}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2477
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Lo/bui;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Lcom/huawei/health/suggestion/model/PlanRecord;>;)V"
        }
    .end annotation

    .line 1305
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1306
    invoke-static {p1}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v0, v1, :cond_0

    .line 1307
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessPlan "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1308
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v1

    invoke-virtual {v1, p1}, Lo/btj;->b(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 1310
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1311
    new-instance v0, Lo/bsq$2;

    invoke-direct {v0, p0, p2, p1}, Lo/bsq$2;-><init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lo/bsq;->l(Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 1327
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Lo/bsq;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1330
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 2661
    invoke-static {p1, p2}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 6

    .line 671
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 672
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 673
    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v2

    .line 674
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 675
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 676
    invoke-static {v4}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v5

    .line 677
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->putWorkoutDate(Ljava/lang/String;)V

    .line 678
    return-object v5

    .line 680
    :cond_0
    goto :goto_0

    .line 682
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(IILjava/lang/String;Lo/bui;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/lang/String;Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 859
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v9

    .line 860
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 861
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList(final int pageStart, final int pageSize, String searchText, final UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo()==null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 862
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p4

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 863
    return-void

    .line 866
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 867
    array-length v0, v10

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 868
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList searchText  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v10, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v10, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v10, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 870
    const/4 v0, 0x3

    new-array v10, v0, [Ljava/lang/String;

    .line 871
    const/4 v0, 0x0

    aget-object v0, v10, v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 872
    const/4 v0, 0x1

    aget-object v0, v10, v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 873
    const/4 v0, 0x2

    aget-object v0, v10, v0

    const/4 v1, 0x2

    aput-object v0, v10, v1

    .line 874
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "searchWorkoutList change searchText  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 877
    :cond_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 878
    move-object/from16 v11, p3

    .line 879
    move-object v12, v10

    .line 880
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$45;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, v12

    move-object v6, v9

    move-object/from16 v7, p4

    move-object v8, v11

    invoke-direct/range {v1 .. v8}, Lo/bsq$45;-><init>(Lo/bsq;II[Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2, v11, v1}, Lo/brz;->d(IILjava/lang/String;Lo/bsr;)V

    .line 909
    goto :goto_0

    .line 911
    :cond_2
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 912
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v10, v1}, Lo/btg;->b(II[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    .line 915
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p4

    invoke-virtual {v1, v0, v11}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 917
    :goto_0
    return-void
.end method

.method public d(ILo/bui;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Lcom/huawei/health/suggestion/model/PlanStatistics;>;)V"
        }
    .end annotation

    .line 2967
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanStatistics type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2968
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2969
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2970
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPageLocal(final UICallback<List<OperationPage>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2971
    const/16 v0, 0x4e21

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4e21

    invoke-virtual {p2, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 2972
    return-void

    .line 2975
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2976
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanStatistics is oversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2977
    const-string v0, "this version is oversea version"

    const/16 v1, 0x63

    invoke-virtual {p2, v1, v0}, Lo/bui;->b(ILjava/lang/String;)V

    .line 2978
    return-void

    .line 2981
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$28;

    invoke-direct {v1, p0, p2, v4, p1}, Lo/bsq$28;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;I)V

    invoke-interface {v0, p1, v1}, Lo/brz;->b(ILo/bsr;)V

    .line 2995
    return-void
.end method

.method public d(JIIILjava/util/TreeSet;Lo/bui;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIIILjava/util/TreeSet<Ljava/lang/Integer;>;Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;)V"
        }
    .end annotation

    .line 597
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v10

    .line 598
    invoke-virtual {p0}, Lo/bsq;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v11

    .line 599
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    const/4 v0, 0x0

    if-ne v0, v11, :cond_1

    .line 600
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitPlan(FitnessPlanParams planParams, final UICallback<Plan> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p7

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 602
    return-void

    .line 603
    :cond_1
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-nez v0, :cond_2

    .line 604
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x4

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p7

    const/4 v3, -0x4

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 605
    return-void

    .line 607
    :cond_2
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v1

    move-wide v2, p1

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-static/range {p6 .. p6}, Lo/bsu;->c(Ljava/util/TreeSet;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lo/bsq$37;

    move-object/from16 v9, p7

    invoke-direct {v8, p0, v9, v10}, Lo/bsq$37;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V

    invoke-interface/range {v0 .. v8}, Lo/brz;->b(FJIIILjava/lang/String;Lo/bsr;)V

    .line 632
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/bui<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 1963
    invoke-virtual {p0}, Lo/bsq;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v9

    .line 1964
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v10

    .line 1965
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    const/4 v0, 0x0

    if-ne v0, v10, :cond_1

    .line 1966
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutCount(final String workoutId, final String version, final UICallback<Integer> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == userInfo || null == accountInfo"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1967
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p3, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1968
    return-void

    .line 1971
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p0, p1, p2}, Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1973
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/Userinfo;->getGender()I

    move-result v1

    invoke-static {v1}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lo/bta;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1974
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/Userinfo;->getGender()I

    move-result v1

    invoke-static {v1}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bsq$12;

    move-object v3, p0

    move-object v4, p1

    move-object v5, v9

    move-object v6, p2

    move-object v7, v10

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Lo/bsq$12;-><init>(Lo/bsq;Ljava/lang/String;Lcom/huawei/health/suggestion/model/Userinfo;Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V

    invoke-interface {v0, p1, v1, p2, v2}, Lo/brz;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 1994
    :cond_2
    return-void
.end method

.method public d(Ljava/lang/String;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 1552
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 1553
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1554
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCollectBehavior(String workoutId, UICallback<Boolean> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " LoginInit.getuserid = null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1555
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1556
    return-void

    .line 1559
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1560
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, -0x4

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x4

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1561
    return-void

    .line 1563
    :cond_1
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Lo/bta;->d(III)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1565
    new-instance v0, Lo/bsq$6;

    invoke-direct {v0, p0, v4, p1, p2}, Lo/bsq$6;-><init>(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x2

    invoke-virtual {p0, v1, v2, v3, v0}, Lo/bsq;->b(IIILo/bui;)V

    goto :goto_0

    .line 1580
    :cond_2
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    invoke-virtual {v0, v4, p1}, Lo/btf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1581
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 1583
    :goto_0
    return-void
.end method

.method public d(Ljava/util/List;Lo/bui;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;>;)V"
        }
    .end annotation

    .line 3456
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActions actionIds = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3457
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 3458
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 3459
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3460
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActions(final List<String> actionIds, final UICallback<List<TrainAction>> callback) :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == userInfo ||TextUtils.isEmpty(userId)"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3461
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3462
    return-void

    .line 3465
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->s()Lo/bto;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bto;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 3468
    const/4 v7, 0x1

    .line 3469
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-nez v0, :cond_2

    .line 3470
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v7

    .line 3474
    :cond_2
    invoke-direct {p0}, Lo/bsq;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3475
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$38;

    invoke-direct {v1, p0, v6, p2, v5}, Lo/bsq$38;-><init>(Lo/bsq;Ljava/util/List;Lo/bui;Ljava/lang/String;)V

    invoke-interface {v0, p1, v7, v1}, Lo/brz;->b(Ljava/util/List;ILo/bsr;)V

    goto :goto_0

    .line 3530
    :cond_3
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3531
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v6}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 3534
    :goto_0
    return-void
.end method

.method public d(Lo/bui;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lfi/firstbeat/coach/CoachVars;>;)V"
        }
    .end annotation

    .line 576
    const-string v0, "coachVars"

    invoke-virtual {p0, v0}, Lo/bsq;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 577
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 580
    :cond_0
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const-string v1, "coachVars"

    invoke-virtual {p0, v1}, Lo/bsq;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lfi/firstbeat/coach/CoachVars;

    invoke-static {v1, v2}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 582
    :goto_0
    return-void
.end method

.method public d(ZI)V
    .locals 10

    .line 2205
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2206
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2207
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setExerciseRemind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2208
    return-void

    .line 2211
    :cond_0
    invoke-virtual {p0}, Lo/bsq;->d()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_2

    :cond_1
    invoke-virtual {p0}, Lo/bsq;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lo/bsq;->b()I

    move-result v0

    if-ne p2, v0, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    .line 2213
    :goto_0
    if-eqz v5, :cond_4

    .line 2214
    return-void

    .line 2218
    :cond_4
    invoke-direct {p0, p1, p2}, Lo/bsq;->b(ZI)V

    .line 2220
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 2221
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 2223
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/bsz;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2225
    const/4 v7, 0x0

    .line 2226
    const/4 v8, 0x1

    .line 2227
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 2228
    const-string v0, "plan_name"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2229
    const-string v0, "type"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2230
    const-string v0, "state"

    if-eqz p1, :cond_5

    move v1, v8

    goto :goto_1

    :cond_5
    move v1, v7

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2231
    const-string v0, "1130004"

    invoke-static {v0, v9}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 2233
    :cond_6
    return-void
.end method

.method public d()Z
    .locals 2

    .line 2528
    const-string v0, "isOpenRemind"

    invoke-virtual {p0, v0}, Lo/bsq;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/health/suggestion/model/DataSync;)Z
    .locals 2

    .line 2627
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bsz;->b(Lcom/huawei/health/suggestion/model/DataSync;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 1940
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1941
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1942
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutCount(String workoutId, String version)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1943
    const/4 v0, 0x0

    return v0

    .line 1945
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1947
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btg;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 1948
    return v5

    .line 1950
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 5

    .line 248
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 249
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 250
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedPlan(String planId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    const/4 v0, 0x0

    return-object v0

    .line 253
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btq;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bui;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;)Lcom/huawei/health/suggestion/model/Plan;"
        }
    .end annotation

    .line 313
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 314
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 315
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan(final UICallback<Plan> callback) "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p1, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 317
    const/4 v0, 0x0

    return-object v0

    .line 319
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$14;

    invoke-direct {v1, p0, p1, v4}, Lo/bsq$14;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V

    invoke-interface {v0, v1}, Lo/brz;->b(Lo/bsr;)V

    goto :goto_0

    .line 379
    :cond_1
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 381
    :goto_0
    invoke-virtual {p0}, Lo/bsq;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 17
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;"
        }
    .end annotation

    .line 3393
    const-string v0, "DataImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " version "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, " language "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3394
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v14

    .line 3395
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v15

    .line 3396
    const/4 v0, 0x0

    if-eq v0, v14, :cond_0

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3397
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkout(final String workoutId, final String version, final UICallback<FitWorkout> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "null == userInfo ||TextUtils.isEmpty(userId)"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3398
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p4

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3399
    const/4 v0, 0x0

    return-object v0

    .line 3402
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v0, v15, v1, v2, v3}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v16

    .line 3403
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3404
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p4

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 3405
    return-object v16

    .line 3407
    :cond_2
    invoke-direct/range {p0 .. p0}, Lo/bsq;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3408
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v14}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    invoke-static {v1}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v0, v2, v1, v3, v4}, Lo/bta;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3409
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkout() from cloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3410
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v14}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v2

    invoke-static {v2}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    new-instance v5, Lo/bsq$39;

    move-object/from16 v6, p0

    move-object/from16 v7, v16

    move-object/from16 v8, p4

    move-object/from16 v9, p3

    move-object/from16 v10, p1

    move-object v11, v14

    move-object/from16 v12, p2

    move-object v13, v15

    invoke-direct/range {v5 .. v13}, Lo/bsq$39;-><init>(Lo/bsq;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bui;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface/range {v0 .. v5}, Lo/brz;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 3444
    return-object v16

    .line 3446
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p4

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 3447
    return-object v16
.end method

.method public e()V
    .locals 1

    .line 2194
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-interface {v0}, Lo/brz;->b()V

    .line 2195
    return-void
.end method

.method public e(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;)V"
        }
    .end annotation

    .line 963
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v12

    .line 964
    const/4 v0, 0x0

    if-ne v0, v12, :cond_0

    .line 965
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedWorkouts(int pageStart, int pageSize, Integer[] types, Integer[] difficulties, Integer[] trainingPoints, int isSupportDevice, Integer[] equipments, final UICallback<List<FitWorkout>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo()==null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p8

    const/16 v3, 0x4e21

    invoke-virtual {v2, v0, v3, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 967
    return-void

    .line 969
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 970
    invoke-virtual {p0}, Lo/bsq;->n()V

    .line 971
    move-object v0, p0

    move v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v11, p8

    const/4 v1, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v0 .. v11}, Lo/bsq;->e(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 974
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->l()Lo/btk;

    move-result-object v0

    move v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v0 .. v8}, Lo/btk;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 975
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    move-object/from16 v1, p8

    invoke-virtual {v1, v0, v13}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 977
    :goto_0
    return-void
.end method

.method public e(ILo/bui;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;>;)V"
        }
    .end annotation

    .line 2843
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPage pageType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2844
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2845
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2846
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPage(final UICallback<List<OperationPage>> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2847
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2848
    return-void

    .line 2851
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->k(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2852
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$26;

    invoke-direct {v1, p0, v4, p1, p2}, Lo/bsq$26;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;ILo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->d(ILo/bsr;)V

    goto :goto_0

    .line 2879
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->k()Lo/bti;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bti;->b(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 2880
    invoke-static {v5}, Lo/bsq;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 2881
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v6}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2884
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 4

    .line 3209
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    const v0, 0x9c76

    invoke-direct {v2, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 3210
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 3211
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 3212
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 3213
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 3214
    new-instance v3, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 3215
    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 3216
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/bsq$35;

    invoke-direct {v1, p0}, Lo/bsq$35;-><init>(Lo/bsq;)V

    invoke-interface {v0, v3, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 3222
    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 1

    .line 2616
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bsz;->c(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 2617
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1468
    const-string v0, "DataImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postExerciseBehavior workoutId="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "  ,version = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ",operType="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v5

    .line 1470
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1471
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postExerciseBehavior(final String workoutId, String version, final int operType):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1472
    return-void

    .line 1474
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lo/bsz;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 1477
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/btg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v6

    .line 1478
    if-nez v6, :cond_1

    .line 1479
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postExerciseBehavior(final String workoutId, String version, final int operType):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "workout\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1480
    return-void

    .line 1483
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->l()Lo/btk;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/btk;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 1484
    return-void
.end method

.method public e(Ljava/lang/String;Lo/bui;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1381
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1382
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1383
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan(final String planId, final UICallback<String> callback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1384
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1385
    return-void

    .line 1387
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1389
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1390
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, -0x194

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, -0x194

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1391
    return-void

    .line 1396
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bsz;->e(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 1397
    new-instance v0, Lo/bsq$5;

    invoke-direct {v0, p0, p2, p1}, Lo/bsq$5;-><init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V

    invoke-static {v0}, Lo/bsu;->a(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V

    goto :goto_0

    .line 1413
    :cond_2
    invoke-direct {p0, p1, p2}, Lo/bsq;->m(Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 1416
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lo/bsq;->e(Ljava/lang/String;J)V

    .line 1417
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1419
    :goto_0
    return-void
.end method

.method public f()Lcom/huawei/health/suggestion/model/AccountInfo;
    .locals 7

    .line 2692
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v5

    .line 2693
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 2694
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == adapterImpl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2695
    const/4 v0, 0x0

    return-object v0

    .line 2697
    :cond_0
    invoke-interface {v5}, Lo/brr;->d()Lo/brs;

    move-result-object v6

    .line 2698
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 2699
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == accountInfoAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2700
    const/4 v0, 0x0

    return-object v0

    .line 2702
    :cond_1
    new-instance v0, Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-interface {v6}, Lo/brs;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6}, Lo/brs;->a()Z

    move-result v2

    invoke-interface {v6}, Lo/brs;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v6}, Lo/brs;->d()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/model/AccountInfo;-><init>(Ljava/lang/String;ZLjava/lang/String;I)V

    return-object v0
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2650
    invoke-static {p1}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Lo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 1604
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$7;

    invoke-direct {v1, p0, p2}, Lo/bsq$7;-><init>(Lo/bsq;Lo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->b(Ljava/lang/String;Lo/bsr;)V

    .line 1617
    return-void
.end method

.method public g()Lcom/huawei/health/suggestion/model/Userinfo;
    .locals 7

    .line 2671
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v5

    .line 2672
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 2673
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == adapterImpl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2674
    const/4 v0, 0x0

    return-object v0

    .line 2677
    :cond_0
    invoke-interface {v5}, Lo/brr;->a()Lo/brw;

    move-result-object v6

    .line 2678
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 2679
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == userinfoAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2680
    const/4 v0, 0x0

    return-object v0

    .line 2682
    :cond_1
    new-instance v0, Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-interface {v6}, Lo/brw;->getAge()I

    move-result v1

    invoke-interface {v6}, Lo/brw;->getGender()I

    move-result v2

    invoke-interface {v6}, Lo/brw;->getHeight()I

    move-result v3

    invoke-interface {v6}, Lo/brw;->getWeight()F

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/model/Userinfo;-><init>(IIIF)V

    return-object v0
.end method

.method public g(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 1710
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1711
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1712
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords(final String planId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1713
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 1715
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bts;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2379
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2380
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2381
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryTrainCountByWorkoutId(String workoutId, UICallback<Integer> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2382
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2383
    return-void

    .line 2386
    :cond_0
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2387
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$20;

    invoke-direct {v1, p0, v4, p1, p2}, Lo/bsq$20;-><init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;Lo/bui;)V

    invoke-interface {v0, p1, v1}, Lo/brz;->e(Ljava/lang/String;Lo/bsr;)V

    goto :goto_0

    .line 2403
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->q()Lo/btt;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btt;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 2404
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2406
    :goto_0
    return-void
.end method

.method public h(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 5

    .line 2539
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2540
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2541
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanStat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2542
    new-instance v0, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    return-object v0

    .line 2544
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 5

    .line 2635
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2636
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2637
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bsz;->e(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 2638
    invoke-static {}, Lo/bsu;->a()V

    .line 2640
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2641
    return-void
.end method

.method public h(Ljava/lang/String;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2316
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2317
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2318
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postBestRecord(String planId, int type, UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2319
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2320
    return-void

    .line 2323
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bsj;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v5

    .line 2324
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 2325
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 2326
    return-void

    .line 2329
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$19;

    invoke-direct {v1, p0, p2, v4, p1}, Lo/bsq$19;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;)V

    invoke-interface {v0, p1, v5, v1}, Lo/brz;->a(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;Lo/bsr;)V

    .line 2343
    return-void
.end method

.method public i()Lcom/huawei/health/suggestion/model/Plan;
    .locals 7

    .line 274
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 275
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 276
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentPlan():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const/4 v0, 0x0

    return-object v0

    .line 279
    :cond_0
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/ref/SoftReference;

    .line 280
    const/4 v6, 0x0

    .line 281
    if-eqz v5, :cond_1

    .line 282
    invoke-virtual {v5}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/Plan;

    .line 284
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 285
    invoke-direct {p0, v4}, Lo/bsq;->b(Lcom/huawei/health/suggestion/model/AccountInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 288
    :cond_2
    return-object v6
.end method

.method public i(Ljava/lang/String;Lo/bui;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 1727
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1728
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1729
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords(final String planId, final UICallback<List<WorkoutRecord>> callback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1730
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1731
    const/4 v0, 0x0

    return-object v0

    .line 1734
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bts;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 1736
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1737
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1738
    return-object v5

    .line 1740
    :cond_1
    invoke-direct {p0}, Lo/bsq;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bta;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1742
    invoke-static {p1}, Lo/bsu;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btq;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1743
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 1745
    :cond_2
    new-instance v0, Lo/bsq$15;

    invoke-direct {v0, p0, p2, p1, v4}, Lo/bsq$15;-><init>(Lo/bsq;Lo/bui;Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;)V

    invoke-direct {p0, p1, v0}, Lo/bsq;->l(Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 1763
    :cond_3
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    invoke-virtual {p2, v0, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1765
    :goto_0
    return-object v5
.end method

.method public k()J
    .locals 2

    .line 3348
    invoke-static {}, Lo/bsm;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 5

    .line 1592
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBehavior workoutId="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1593
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 1594
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1595
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBehavior(String workoutId):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1596
    return-void

    .line 1598
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bsz;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1599
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/btf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1600
    return-void
.end method

.method public k(Ljava/lang/String;Lo/bui;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 2347
    invoke-virtual {p0}, Lo/bsq;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 2348
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2349
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postBestRecordFit(String actionId, int type, UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAccountInfo\u4e3anull"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2350
    iget-object v0, p0, Lo/bsq;->b:Landroid/os/Handler;

    const/16 v1, 0x4e21

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e21

    invoke-virtual {p2, v0, v2, v1}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2351
    return-void

    .line 2354
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/bss;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/BestRecordFitStat;

    move-result-object v5

    .line 2355
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 2356
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 2357
    return-void

    .line 2360
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    new-instance v1, Lo/bsq$16;

    invoke-direct {v1, p0, p2, v4, p1}, Lo/bsq$16;-><init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;)V

    invoke-interface {v0, v5, v1}, Lo/brz;->b(Lcom/huawei/health/suggestion/model/BestRecordFitStat;Lo/bsr;)V

    .line 2375
    return-void
.end method

.method public m()V
    .locals 2

    .line 3537
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    invoke-virtual {v0}, Lo/btq;->c()V

    .line 3538
    iget-object v0, p0, Lo/bsq;->c:Ljava/util/HashMap;

    const-string v1, "plan"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3539
    return-void
.end method

.method public n()V
    .locals 1

    .line 1010
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-interface {v0}, Lo/brz;->a()V

    .line 1011
    return-void
.end method
