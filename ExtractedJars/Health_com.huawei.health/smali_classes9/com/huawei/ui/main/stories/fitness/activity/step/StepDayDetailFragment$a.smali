.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;>;"
        }
    .end annotation
.end field

.field e:I


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)V
    .locals 1

    .line 525
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 522
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;->d:Ljava/lang/ref/WeakReference;

    .line 526
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;->d:Ljava/lang/ref/WeakReference;

    .line 527
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;->e:I

    .line 528
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    .line 533
    if-nez v4, :cond_0

    .line 534
    return-void

    .line 536
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;->e:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 538
    :pswitch_0
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepDayDetailFragment requestBarChartDatas err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Z)Z

    .line 540
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 541
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 542
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepDayDetailFragment requestBarChartDatas response data success:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1773

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 547
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 548
    goto :goto_0

    .line 550
    :pswitch_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepDayDetailFragment requestTotalDatas err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 552
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepDayDetailFragment requestTotalDatas response data success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    :cond_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 556
    goto :goto_0

    .line 558
    :pswitch_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1774

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 559
    iput-object p2, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 560
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 561
    .line 565
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method