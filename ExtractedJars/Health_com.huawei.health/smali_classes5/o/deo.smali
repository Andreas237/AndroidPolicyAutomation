.class public Lo/deo;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static d:Lo/deo;


# instance fields
.field private a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private b:Landroid/content/BroadcastReceiver;

.field private c:Landroid/content/Context;

.field private e:Lo/dde;

.field private f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 59
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 73
    new-instance v0, Lo/deo$3;

    invoke-direct {v0, p0}, Lo/deo$3;-><init>(Lo/deo;)V

    iput-object v0, p0, Lo/deo;->b:Landroid/content/BroadcastReceiver;

    .line 101
    new-instance v0, Lo/deo$4;

    invoke-direct {v0, p0}, Lo/deo$4;-><init>(Lo/deo;)V

    iput-object v0, p0, Lo/deo;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 60
    iput-object p1, p0, Lo/deo;->c:Landroid/content/Context;

    .line 61
    iget-object v0, p0, Lo/deo;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/deo;->e:Lo/dde;

    .line 62
    iget-object v0, p0, Lo/deo;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/deo;->e:Lo/dde;

    iget-object v1, p0, Lo/deo;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 66
    :cond_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceFontManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :goto_0
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lo/deo;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/deo;->b:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 70
    return-void
.end method

.method static synthetic b(Lo/deo;[B)I
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/deo;->e([B)I

    move-result v0

    return v0
.end method

.method private b([B)I
    .locals 7

    .line 402
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter parseFitRunCourseResponseData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v4, -0x1

    .line 404
    invoke-direct {p0, p1}, Lo/deo;->d([B)Lo/dba;

    move-result-object v5

    .line 405
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 406
    iget-object v6, v5, Lo/dba;->e:Ljava/util/List;

    .line 407
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 409
    :cond_0
    return v4
.end method

.method private c(I)I
    .locals 1

    .line 607
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 614
    :pswitch_0
    const/4 v0, 0x0

    return v0

    .line 618
    :pswitch_1
    const/4 v0, 0x1

    return v0

    .line 620
    :goto_0
    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic c(Lo/deo;[B)I
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/deo;->b([B)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/deo;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/deo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;
    .locals 7

    .line 536
    const/4 v2, 0x0

    .line 538
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 540
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedL()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 541
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedH()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 542
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 544
    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p2, :cond_1

    .line 546
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 547
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 548
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 550
    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v0, p2, :cond_2

    .line 552
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateL()Ljava/lang/String;

    move-result-object v3

    .line 553
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateH()Ljava/lang/String;

    move-result-object v4

    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 556
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    if-ne v0, p2, :cond_3

    .line 558
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedL()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 559
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedH()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 560
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 561
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 562
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 564
    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x4

    if-ne v0, p2, :cond_4

    .line 566
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 567
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 568
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 570
    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x5

    if-ne v0, p2, :cond_5

    .line 572
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedL()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 573
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedH()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 574
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 575
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateH()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 576
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 578
    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x6

    if-ne v0, p2, :cond_6

    .line 580
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedL()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 581
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedH()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 582
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 583
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 584
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 585
    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x7

    if-ne v0, p2, :cond_7

    .line 587
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRatePercentL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 588
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRatePercentH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 589
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 590
    goto :goto_0

    :cond_7
    const/16 v0, 0x8

    if-ne v0, p2, :cond_8

    .line 592
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRateRangeL()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 593
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRateRangeH()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 595
    goto :goto_0

    :cond_8
    const/16 v0, 0x9

    if-ne v0, p2, :cond_9

    .line 598
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMAF180HeartRateBase()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 599
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMAF180HeartRateRange()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 600
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 602
    :cond_9
    :goto_0
    return-object v2
.end method

.method private d(III)Ljava/lang/String;
    .locals 7

    .line 432
    const/4 v4, 0x0

    .line 434
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 436
    :pswitch_0
    const/4 v4, 0x1

    .line 437
    invoke-static {p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 438
    goto :goto_1

    .line 440
    :pswitch_1
    const/4 v4, 0x2

    .line 441
    invoke-static {p2}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 442
    goto :goto_1

    .line 444
    :pswitch_2
    const/4 v4, 0x4

    .line 445
    int-to-long v0, p2

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v5

    .line 446
    goto :goto_1

    .line 448
    :goto_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "formTLVForIntType unknown valueType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    const-string v5, ""

    .line 452
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 453
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "formTLVForIntType() result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;
    .locals 25

    .line 473
    const/16 v0, 0x91

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 475
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 477
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getActionId()Ljava/lang/String;

    move-result-object v6

    .line 478
    const/16 v0, 0x12

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 479
    invoke-static {v6}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 481
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v9

    .line 482
    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v10

    .line 483
    const/16 v0, 0x13

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 484
    invoke-static {v10}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 486
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v13

    .line 487
    move-object/from16 v0, p0

    const/16 v1, 0x15

    const/4 v2, 0x2

    invoke-direct {v0, v1, v13, v2}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v14

    .line 489
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v15

    .line 490
    move-object/from16 v0, p0

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-direct {v0, v1, v15, v2}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v16

    .line 492
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireIntensityType()I

    move-result v17

    .line 493
    move-object/from16 v0, p0

    const/16 v1, 0x1a

    move/from16 v2, v17

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v18

    .line 495
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1}, Lo/deo;->c(I)I

    move-result v19

    .line 497
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-direct {v0, v1, v2}, Lo/deo;->c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;

    move-result-object v20

    .line 498
    const/16 v0, 0x1b

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 499
    invoke-static/range {v20 .. v20}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 501
    move-object/from16 v0, p0

    const/16 v1, 0x1c

    move/from16 v2, p2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v23

    .line 503
    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 504
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 505
    invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 507
    invoke-virtual {v5, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 508
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 509
    invoke-virtual {v5, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 511
    invoke-virtual {v5, v14}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 513
    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 516
    const/4 v0, -0x1

    move/from16 v1, v19

    if-eq v0, v1, :cond_0

    .line 517
    move-object/from16 v0, p0

    const/16 v1, 0x19

    move/from16 v2, v19

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v24

    .line 518
    move-object/from16 v0, v24

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 521
    :cond_0
    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 523
    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 524
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 525
    move-object/from16 v0, v22

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 527
    move-object/from16 v0, v23

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 529
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/deo;->e(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 530
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v4}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 532
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d([B)Lo/dba;
    .locals 9

    .line 413
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTLVList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 415
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const/4 v0, 0x0

    return-object v0

    .line 418
    :cond_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 419
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 420
    new-instance v6, Lo/daz;

    invoke-direct {v6}, Lo/daz;-><init>()V

    .line 421
    const/4 v7, 0x0

    .line 423
    :try_start_0
    invoke-virtual {v6, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 426
    goto :goto_0

    .line 424
    :catch_0
    move-exception v8

    .line 425
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resloveWatchStatus TLVException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_0
    return-object v7
.end method

.method public static d(Landroid/content/Context;)Lo/deo;
    .locals 4

    .line 46
    sget-object v0, Lo/deo;->d:Lo/deo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v0, Lo/deo;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/deo;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/deo;->d:Lo/deo;

    .line 50
    :cond_0
    sget-object v0, Lo/deo;->d:Lo/deo;

    return-object v0
.end method

.method private e(I)I
    .locals 3

    .line 458
    const/16 v0, 0x7f

    if-le p1, v0, :cond_0

    const/16 v0, 0x3fff

    if-gt p1, v0, :cond_0

    .line 460
    and-int/lit8 v0, p1, 0x7f

    and-int/lit16 v1, p1, 0x3f80

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    const v1, 0x8000

    add-int p1, v0, v1

    .line 461
    return p1

    .line 462
    :cond_0
    const/16 v0, 0x3fff

    if-le p1, v0, :cond_1

    const v0, 0x1fffff

    if-gt p1, v0, :cond_1

    goto :goto_0

    .line 464
    :cond_1
    const v0, 0x1fffff

    if-le p1, v0, :cond_2

    .line 468
    :cond_2
    :goto_0
    return p1
.end method

.method private e([B)I
    .locals 10

    .line 215
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter parseFitRunCourseInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v5, -0x1

    .line 219
    invoke-direct {p0, p1}, Lo/deo;->d([B)Lo/dba;

    move-result-object v6

    .line 220
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 221
    return v5

    .line 224
    :cond_0
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 225
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 226
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the case is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 229
    :pswitch_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RUNNING_COURSE_STURCT value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    goto/16 :goto_1

    .line 232
    :pswitch_1
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEVICE_FRAME_ABILITY value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    goto/16 :goto_1

    .line 235
    :pswitch_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEVICE_FRAME_VERSION value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    :try_start_0
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 240
    goto/16 :goto_1

    .line 238
    :catch_0
    move-exception v9

    .line 239
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    goto :goto_1

    .line 243
    :pswitch_3
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EXERCISE_ID_LIST value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    goto :goto_1

    .line 246
    :pswitch_4
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EXERCISE_VERSION_LIST value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    .line 247
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 252
    :cond_1
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 192
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 193
    const/16 v0, 0x16

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 194
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 196
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 198
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 201
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 206
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 207
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitRunCourseInfo deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/deo;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 209
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 132
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iput-object p1, p0, Lo/deo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 134
    return-void
.end method

.method public c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 38

    .line 259
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 260
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map is null,can not push to watch!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    return-void

    .line 264
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 265
    const/16 v0, 0x16

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 266
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 269
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v5

    .line 270
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 271
    invoke-static {v5}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 273
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v8

    .line 274
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 275
    invoke-static {v8}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 277
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v11

    .line 278
    move-object/from16 v0, p0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v11, v2}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v12

    .line 280
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v13

    .line 281
    double-to-int v0, v13

    move-object/from16 v1, p0

    const/4 v2, 0x4

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v15

    .line 283
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v16

    .line 284
    move-object/from16 v0, p0

    const/4 v1, 0x5

    move/from16 v2, v16

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v17

    .line 286
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v18

    .line 287
    move-object/from16 v0, p0

    const/4 v1, 0x7

    move/from16 v2, v18

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v19

    .line 289
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v20

    .line 290
    const/16 v0, 0x9

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 291
    invoke-static/range {v20 .. v20}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 293
    const/16 v23, 0x0

    .line 294
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireNarrowDesc()Ljava/lang/String;

    move-result-object v24

    .line 296
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v1, v24

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v0

    .line 297
    const-string v0, "extendMap"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "extendMap"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 298
    new-instance v0, Lorg/json/JSONObject;

    const-string v1, "extendMap"

    move-object/from16 v2, v25

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v26, v0

    .line 299
    const-string v0, "\u8bfe\u7a0b\u8bf4\u660e"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 300
    const-string v0, "\u8bfe\u7a0b\u8bf4\u660e"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object/from16 v23, v0

    .line 305
    :cond_1
    goto :goto_0

    .line 303
    :catch_0
    move-exception v25

    .line 304
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    :goto_0
    move-object/from16 v0, p0

    const/16 v1, 0xe

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v25

    .line 309
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireRunActionNum()I

    move-result v26

    .line 310
    move-object/from16 v0, p0

    const/16 v1, 0xf

    move/from16 v2, v26

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v27

    .line 312
    const/16 v28, -0x1

    .line 313
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExtendSeaMap()Ljava/lang/String;

    move-result-object v29

    .line 314
    invoke-static/range {v29 .. v29}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 316
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v1, v29

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v30, v0

    .line 317
    const-string v0, "workoutType"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v31

    .line 318
    if-eqz v31, :cond_2

    .line 319
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    const-string v1, "title"

    move-object/from16 v2, v31

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context"

    move-object/from16 v3, v31

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v32, v0

    .line 320
    invoke-virtual/range {v32 .. v32}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 321
    invoke-virtual/range {v32 .. v32}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move/from16 v28, v0

    .line 326
    :cond_2
    goto :goto_1

    .line 324
    :catch_1
    move-exception v30

    .line 325
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    :cond_3
    :goto_1
    new-instance v30, Ljava/lang/StringBuffer;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuffer;-><init>()V

    .line 332
    move-object/from16 v0, v30

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 333
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 334
    move-object/from16 v0, v30

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 336
    move-object/from16 v0, v30

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 337
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 338
    move-object/from16 v0, v30

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 340
    move-object/from16 v0, v30

    invoke-virtual {v0, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 342
    move-object/from16 v0, v30

    invoke-virtual {v0, v15}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 344
    move-object/from16 v0, v30

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 346
    move-object/from16 v0, v30

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 348
    move-object/from16 v0, v30

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 349
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 350
    move-object/from16 v0, v30

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 352
    const/4 v0, 0x0

    move-object/from16 v1, v23

    if-eq v0, v1, :cond_4

    .line 353
    invoke-static/range {v23 .. v23}, Lo/czx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    .line 354
    const/16 v0, 0xc

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v32

    .line 355
    move-object/from16 v0, v30

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 356
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/deo;->e(I)I

    move-result v33

    .line 357
    invoke-static/range {v33 .. v33}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 358
    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 361
    :cond_4
    move-object/from16 v0, v30

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 363
    move-object/from16 v0, v30

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 365
    const/4 v0, -0x1

    move/from16 v1, v28

    if-eq v0, v1, :cond_5

    .line 366
    move-object/from16 v0, p0

    const/16 v1, 0x1f

    move/from16 v2, v28

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/deo;->d(III)Ljava/lang/String;

    move-result-object v31

    .line 367
    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 370
    :cond_5
    const/16 v0, 0x10

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v31

    .line 372
    new-instance v32, Ljava/lang/StringBuilder;

    invoke-direct/range {v32 .. v32}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v33

    .line 375
    move-object/from16 v0, p0

    move-object/from16 v1, v33

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/deo;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;

    move-result-object v34

    .line 376
    move-object/from16 v0, v32

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v35

    .line 379
    invoke-interface/range {v35 .. v35}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v36

    :goto_2
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v37, v0

    check-cast v37, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 380
    move-object/from16 v0, p0

    move-object/from16 v1, v37

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/deo;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    goto :goto_2

    .line 383
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v36

    .line 384
    move-object/from16 v0, p0

    move-object/from16 v1, v36

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/deo;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;I)Ljava/lang/String;

    move-result-object v37

    .line 385
    move-object/from16 v0, v32

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 389
    invoke-virtual/range {v32 .. v32}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/deo;->e(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 390
    invoke-virtual/range {v32 .. v32}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 392
    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 393
    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 394
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushFitRunCourseData deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/deo;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 396
    return-void
.end method

.method public d()V
    .locals 4

    .line 137
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterDataCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lo/deo;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 139
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 55
    const/16 v0, 0x16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
