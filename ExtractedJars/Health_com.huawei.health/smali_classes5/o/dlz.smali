.class public Lo/dlz;
.super Lo/dlv;
.source "SourceFile"

# interfaces
.implements Lo/dml;


# instance fields
.field private a:Lo/dly;

.field private c:Lo/dln;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 50
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/dlz;->e:I

    .line 48
    const/4 v0, 0x5

    iput v0, p0, Lo/dlz;->d:I

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    .line 52
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlz;->c:Lo/dln;

    .line 53
    new-instance v0, Lo/dly;

    iget-object v1, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dly;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlz;->a:Lo/dly;

    .line 54
    return-void
.end method

.method static synthetic a(Lo/dlz;)Lo/dln;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/dlz;->c:Lo/dln;

    return-object v0
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 5

    .line 643
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dmn;->c(J)[J

    move-result-object v4

    .line 645
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly,timeperiod = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    new-instance v1, Lo/dlz$7;

    invoke-direct {v1, p0, v4}, Lo/dlz$7;-><init>(Lo/dlz;[J)V

    invoke-virtual {v0, v4, v1}, Lo/dly;->c([JLo/egg;)V

    .line 667
    return-void
.end method

.method private a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 8

    .line 558
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSuggestVideoMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    new-instance v4, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 560
    const/16 v0, 0x4e26

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 561
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 562
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 564
    new-instance v5, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-direct {v5, p1}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;-><init>(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 565
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0, v5, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v6

    .line 566
    invoke-virtual {v4, v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 567
    const-string v0, "00002400"

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 568
    const-string v0, "110000"

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 569
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 570
    const-string v0, "ai-weight-006"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 572
    iget-object v0, p0, Lo/dlz;->c:Lo/dln;

    const/16 v1, 0x4e26

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 573
    iget-object v0, p0, Lo/dlz;->c:Lo/dln;

    invoke-virtual {v0, v4}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v7

    .line 574
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSuggestVideoMsg result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    return-void
.end method

.method static synthetic a(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/dlz;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic a(Lo/dlz;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/dlz;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

.method private a(Lo/egg;)V
    .locals 6

    .line 279
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedSetWeightGoal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    const-string v0, "ai-weight-001"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v4

    .line 282
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ask_user_set_weight_target"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 284
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightGoalMsg sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedSetWeightGoal ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    if-eqz v4, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dlz;->b:Landroid/content/Context;

    new-instance v2, Lo/dlz$12;

    invoke-direct {v2, p0, p1}, Lo/dlz$12;-><init>(Lo/dlz;Lo/egg;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 301
    :cond_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedSetWeightGoal rule close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 304
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/dlz;)I
    .locals 1

    .line 42
    iget v0, p0, Lo/dlz;->d:I

    return v0
.end method

.method static synthetic b(Lo/dlz;I)I
    .locals 0

    .line 42
    iput p1, p0, Lo/dlz;->e:I

    return p1
.end method

.method static synthetic c(Lo/dlz;)I
    .locals 1

    .line 42
    iget v0, p0, Lo/dlz;->e:I

    return v0
.end method

.method private c()V
    .locals 7

    .line 336
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightGoalMsg enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    new-instance v4, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 339
    const/16 v0, 0x4e20

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 340
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 341
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 342
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 343
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 344
    const-string v0, "00002400"

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 345
    const-string v0, "110000"

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 346
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 347
    const-string v0, "ai-weight-001"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 348
    iget-object v0, p0, Lo/dlz;->c:Lo/dln;

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 349
    iget-object v0, p0, Lo/dlz;->c:Lo/dln;

    invoke-virtual {v0, v4}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v6

    .line 350
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightGoalMsg result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    return-void
.end method

.method private c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 508
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeFitVideoUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/Integer;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 511
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-object v3, v8

    new-instance v7, Lo/dlz$1;

    invoke-direct {v7, p0, p1}, Lo/dlz$1;-><init>(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/brt;->d(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui;)V

    .line 551
    return-void
.end method

.method private c(Lo/egg;)V
    .locals 6

    .line 359
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const-string v1, "weight_device"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 361
    const-string v0, "ai-weight-004"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 362
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightDevice rule = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightDevice isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dly;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 366
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    const-string v1, "ai-weight-004"

    invoke-virtual {v0, v1, p1}, Lo/dly;->a(Ljava/lang/String;Lo/egg;)V

    goto :goto_0

    .line 368
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 370
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/dlz;)Lo/dly;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    return-object v0
.end method

.method static synthetic d(Lo/dlz;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/dlz;->a(Lcom/huawei/hihealth/HiHealthData;)V

    return-void
.end method

.method private d(Lo/egg;)V
    .locals 6

    .line 416
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const-string v1, "weight_sevice"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 418
    const-string v0, "ai-weight-008"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 419
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightService rule = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightService isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    new-instance v1, Lo/dlz$17;

    invoke-direct {v1, p0, p1}, Lo/dlz$17;-><init>(Lo/dlz;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dly;->d(Lo/egg;)V

    goto :goto_0

    .line 434
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 436
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/dlz;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lo/dlz;->c()V

    return-void
.end method

.method private f(Lo/egg;)V
    .locals 10

    .line 581
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthWeekly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    const-string v0, "ai-weight-007"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v8

    .line 583
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeigthWeekly ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    if-eqz v8, :cond_0

    .line 586
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x240c8400

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/dmn;->c(J)[J

    move-result-object v9

    .line 587
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dlz;->b:Landroid/content/Context;

    const/4 v2, 0x0

    aget-wide v2, v9, v2

    const/4 v4, 0x1

    aget-wide v4, v9, v4

    new-instance v7, Lo/dlz$2;

    invoke-direct {v7, p0, p1}, Lo/dlz$2;-><init>(Lo/dlz;Lo/egg;)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 611
    goto :goto_0

    .line 612
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 614
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 176
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const-string v0, "ai-weight-005"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v4

    .line 178
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ask_user_measure_weight"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 181
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    if-eqz v4, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dly;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const-string v0, "ai-weight-005"

    const-string v1, "recently_num_days_no_data"

    const/16 v2, 0x7531

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 185
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg daystr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-string v0, "ai-weight-005"

    const-string v1, "recommended_time"

    const/16 v2, 0x7531

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 188
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg recommendTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-static {v7}, Lo/dlu;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 190
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg showTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dlz;->d:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v9

    .line 194
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 199
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    new-instance v1, Lo/dlz$15;

    invoke-direct {v1, p0, v9, v10, v8}, Lo/dlz$15;-><init>(Lo/dlz;JLjava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lo/dlz;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 220
    goto :goto_1

    .line 221
    :cond_0
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x4e25

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 223
    :goto_1
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 259
    const-wide/16 v8, 0x0

    .line 260
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v7, Lo/dlz$14;

    invoke-direct {v7, p0, p2}, Lo/dlz$14;-><init>(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const-wide/16 v2, 0x0

    const v6, 0x1869f

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 271
    return-void
.end method

.method public b()V
    .locals 4

    .line 482
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteSuggestVideo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    new-instance v1, Lo/dlz$4;

    invoke-direct {v1, p0}, Lo/dlz$4;-><init>(Lo/dlz;)V

    invoke-virtual {v0, v1}, Lo/dly;->a(Lo/egg;)V

    .line 501
    return-void
.end method

.method public b(Lo/egg;)V
    .locals 4

    .line 377
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightDeviceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    new-instance v0, Lo/dlz$20;

    invoke-direct {v0, p0, p1}, Lo/dlz$20;-><init>(Lo/dlz;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlz;->c(Lo/egg;)V

    .line 408
    return-void
.end method

.method public c(DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 15

    .line 124
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    sub-double v0, p1, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 126
    :goto_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalChanged = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    if-eqz v8, :cond_1

    .line 128
    move-object/from16 v0, p5

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 129
    return-void

    .line 131
    :cond_1
    const-wide/high16 v9, 0x4014000000000000L    # 5.0

    .line 132
    const-string v0, "ai-weight-002"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v11

    .line 133
    if-eqz v11, :cond_2

    .line 134
    const/4 v12, 0x0

    .line 136
    const-string v0, "ai-weight-002"

    const-string v1, "suggest_to_set_rational_weight_goal_gap"

    const/16 v2, 0x7531

    :try_start_0
    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 138
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal paramStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v12, v0

    .line 142
    goto :goto_1

    .line 140
    :catch_0
    move-exception v13

    .line 141
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    :goto_1
    int-to-double v9, v12

    .line 144
    move-wide v13, v9

    .line 146
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    new-instance v1, Lo/dlz$11;

    move-object v2, p0

    move-wide/from16 v3, p3

    move-wide v5, v13

    move-object/from16 v7, p5

    invoke-direct/range {v1 .. v7}, Lo/dlz$11;-><init>(Lo/dlz;DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-static {v0, v1}, Lo/dmn;->c(Landroid/content/Context;Lo/egg;)V

    .line 165
    goto :goto_2

    .line 166
    :cond_2
    move-object/from16 v0, p5

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 169
    :goto_2
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 781
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 782
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 783
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    invoke-static {v4, v5}, Lo/dly;->c(Ljava/util/List;Ljava/util/List;)[Z

    move-result-object v6

    .line 785
    const/4 v0, 0x0

    aget-boolean v0, v6, v0

    if-eqz v0, :cond_0

    .line 786
    invoke-virtual {p0}, Lo/dlz;->d()V

    .line 787
    invoke-virtual {p0}, Lo/dlz;->b()V

    .line 788
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dlz;->c(Z)V

    .line 790
    :cond_0
    const/4 v0, 0x1

    aget-boolean v0, v6, v0

    if-eqz v0, :cond_1

    .line 791
    invoke-virtual {p0}, Lo/dlz;->b()V

    .line 793
    :cond_1
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 621
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteWeightWeekly paramChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    new-instance v0, Lo/dlz$6;

    invoke-direct {v0, p0, p1}, Lo/dlz$6;-><init>(Lo/dlz;Z)V

    invoke-direct {p0, v0}, Lo/dlz;->f(Lo/egg;)V

    .line 639
    return-void
.end method

.method public d()V
    .locals 4

    .line 311
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteSetWeightGoalMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    new-instance v0, Lo/dlz$18;

    invoke-direct {v0, p0}, Lo/dlz$18;-><init>(Lo/dlz;)V

    invoke-direct {p0, v0}, Lo/dlz;->a(Lo/egg;)V

    .line 330
    return-void
.end method

.method public d(DJ)V
    .locals 8

    .line 675
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_last_weight"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 677
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAndUpToCloud value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAndUpToCloud lastValueStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 680
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    invoke-virtual {v0, p1, p2}, Lo/dly;->b(D)V

    .line 681
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/dly;->b(DJ)V

    goto :goto_0

    .line 683
    :cond_0
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 685
    sub-double v0, p1, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3fa999999999999aL    # 0.05

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 686
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/dly;->b(DJ)V

    .line 688
    :cond_1
    iget-object v0, p0, Lo/dlz;->a:Lo/dly;

    invoke-virtual {v0, p1, p2}, Lo/dly;->b(D)V

    .line 691
    :goto_0
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_last_weight"

    .line 692
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 691
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v6

    .line 693
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAndUpToCloud result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    return-void
.end method

.method public e()V
    .locals 4

    .line 60
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-super {p0}, Lo/dlv;->e()V

    .line 62
    invoke-virtual {p0}, Lo/dlz;->d()V

    .line 63
    invoke-virtual {p0}, Lo/dlz;->a()V

    .line 64
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dlz;->c(Z)V

    .line 65
    invoke-virtual {p0}, Lo/dlz;->b()V

    .line 66
    return-void
.end method

.method public e(DLo/egg;)V
    .locals 5

    .line 75
    const-string v0, "ai-weight-003"

    const/16 v1, 0x7531

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " jugdeGoalWeight  Rule Open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_goal_change"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 79
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-string v0, "false"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dlz;->b:Landroid/content/Context;

    new-instance v2, Lo/dlz$3;

    invoke-direct {v2, p0, p3, p1, p2}, Lo/dlz$3;-><init>(Lo/dlz;Lo/egg;D)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 112
    :cond_0
    goto :goto_0

    .line 113
    :cond_1
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " jugdeGoalWeight  Rule close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;D)V
    .locals 8

    .line 757
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v7, Lo/dlz$10;

    invoke-direct {v7, p0, p2, p3}, Lo/dlz$10;-><init>(Lo/dlz;D)V

    const-wide/16 v2, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 775
    return-void
.end method

.method public e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 232
    const-wide/16 v8, 0x0

    .line 233
    const/4 v10, 0x2

    .line 234
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move v6, v10

    new-instance v7, Lo/dlz$13;

    invoke-direct {v7, p0, p2}, Lo/dlz$13;-><init>(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    const-wide/16 v2, 0x0

    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 250
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 701
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestWeightpDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    iget-object v0, p0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_last_suggest_kind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 705
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 707
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "show_service"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 708
    :cond_0
    new-instance v0, Lo/dlz$9;

    invoke-direct {v0, p0, v5, p1}, Lo/dlz$9;-><init>(Lo/dlz;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, v0}, Lo/dlz;->b(Lo/egg;)V

    goto :goto_0

    .line 729
    :cond_1
    new-instance v0, Lo/dlz$8;

    invoke-direct {v0, p0, v5, p1}, Lo/dlz$8;-><init>(Lo/dlz;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, v0}, Lo/dlz;->e(Lo/egg;)V

    .line 750
    :goto_0
    return-void
.end method

.method public e(Lo/egg;)V
    .locals 4

    .line 443
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightServiceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v0, Lo/dlz$5;

    invoke-direct {v0, p0, p1}, Lo/dlz$5;-><init>(Lo/dlz;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlz;->d(Lo/egg;)V

    .line 474
    return-void
.end method
