.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 1

    .line 542
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 540
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 543
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 544
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 6

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 584
    if-nez v4, :cond_0

    .line 585
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareActivity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    return-void

    .line 588
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 589
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 590
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 6

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 549
    if-nez v4, :cond_0

    .line 550
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareActivity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    return-void

    .line 553
    :cond_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    if-nez p1, :cond_1

    .line 555
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success but boj==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 557
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 558
    return-void

    .line 560
    :cond_1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 561
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "step"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D

    .line 562
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "carior"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D

    .line 563
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "distance"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D

    .line 564
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAverSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mMidLeftNum"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mMidRightNum"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 566
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 568
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 6

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 573
    if-nez v4, :cond_0

    .line 574
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareActivity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    return-void

    .line 577
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 578
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 579
    return-void
.end method
