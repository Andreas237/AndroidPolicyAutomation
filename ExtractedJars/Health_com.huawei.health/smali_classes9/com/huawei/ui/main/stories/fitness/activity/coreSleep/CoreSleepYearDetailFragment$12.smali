.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fac$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)V
    .locals 0

    .line 463
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)V
    .locals 2

    .line 466
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;F)F

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;F)F

    .line 469
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->p(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 476
    return-void

    .line 479
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 480
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->o(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 481
    cmpg-float v0, v2, v3

    if-gez v0, :cond_1

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 483
    return-void

    .line 485
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$12;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseFitnessDetailActivity;->i:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 487
    return-void
.end method
