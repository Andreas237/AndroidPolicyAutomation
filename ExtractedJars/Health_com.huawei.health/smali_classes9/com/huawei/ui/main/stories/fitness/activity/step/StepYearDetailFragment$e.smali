.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;>;"
        }
    .end annotation
.end field

.field b:I


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;I)V
    .locals 1

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 356
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;->a:Ljava/lang/ref/WeakReference;

    .line 360
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;->a:Ljava/lang/ref/WeakReference;

    .line 361
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;->b:I

    .line 362
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;

    .line 367
    if-nez v4, :cond_0

    .line 368
    return-void

    .line 370
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment$e;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 372
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;Z)Z

    .line 373
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepYearDetailFragment requestBarChartDatas response err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 375
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 376
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepYearDetailFragment requestBarChartDatas response data success:"

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

    .line 380
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1773

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 382
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 383
    goto :goto_0

    .line 385
    :sswitch_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StepYearDetailFragment requestTotalDatas response err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 387
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepYearDetailFragment requestTotalDatas response data success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :cond_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 391
    .line 395
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
