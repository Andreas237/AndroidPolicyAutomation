.class Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;>;"
        }
    .end annotation
.end field

.field d:I


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;I)V
    .locals 1

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 289
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;->b:Ljava/lang/ref/WeakReference;

    .line 293
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;->b:Ljava/lang/ref/WeakReference;

    .line 294
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;->d:I

    .line 295
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;

    .line 300
    if-nez v4, :cond_0

    .line 301
    return-void

    .line 303
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment$a;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 305
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;Z)Z

    .line 306
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DistanceWeekDetailFragment requestBarChartDatas err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 308
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 309
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DistanceWeekDetailFragment requestBarChartDatas response data success:"

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

    .line 315
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 316
    goto :goto_0

    .line 318
    :sswitch_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DistanceWeekDetailFragment requestTotalDatas err_code = "

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

    .line 319
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 320
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceWeekDetailFragment requestTotalDatas response data success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceWeekDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 328
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
