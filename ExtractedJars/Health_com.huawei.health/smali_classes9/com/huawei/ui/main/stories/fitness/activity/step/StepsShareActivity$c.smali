.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;>;"
        }
    .end annotation
.end field

.field d:I


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;I)V
    .locals 1

    .line 477
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 474
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 478
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 479
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;->d:I

    .line 480
    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    .line 485
    if-nez v4, :cond_0

    .line 486
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareActivity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    return-void

    .line 490
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$c;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 492
    :sswitch_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 493
    :cond_1
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DayMaxStepsOfYearCallback onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 495
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 496
    return-void

    .line 498
    :cond_2
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 500
    const-string v0, "step_max"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D

    .line 501
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DayMaxStepsOfYearCallback onResult: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DayMaxStepsOfYearCallback onResult: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 506
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 507
    goto/16 :goto_1

    .line 509
    :sswitch_1
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 510
    :cond_3
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDailySportDataWithDB ReadStaticDealCallback onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 512
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 513
    return-void

    .line 515
    :cond_4
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 516
    const-string v0, "step_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D

    .line 517
    const-string v0, "calorie_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D

    .line 518
    const-string v0, "distance_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D

    .line 519
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDailySportDataWithDB  mAverSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mMidLeftNum"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mMidRightNum"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v8

    .line 521
    invoke-virtual {v8}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    .line 522
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 523
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->u(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lo/dgv;->b(II)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double v9, v0, v2

    .line 524
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDailySportDataWithDB calculateDistance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mMidRightNum"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v0

    cmpl-double v0, v0, v9

    if-lez v0, :cond_5

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)D

    move-result-wide v11

    goto :goto_0

    :cond_5
    move-wide v11, v9

    .line 526
    :goto_0
    invoke-static {v4, v11, v12}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;D)D

    .line 528
    :cond_6
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 529
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 530
    .line 535
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
