.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 1

    .line 601
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 599
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;->a:Ljava/lang/ref/WeakReference;

    .line 602
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;->a:Ljava/lang/ref/WeakReference;

    .line 603
    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;

    .line 608
    if-nez v4, :cond_0

    .line 609
    return-void

    .line 611
    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 612
    :cond_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTotalCaloriesDatas ReadStaticDealCallback onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0xea6a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 614
    return-void

    .line 616
    :cond_2
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 617
    const-string v0, "calorie_sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)I

    .line 618
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTotalCaloriesDatas  totalCalories"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0xea6a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 620
    return-void
.end method
