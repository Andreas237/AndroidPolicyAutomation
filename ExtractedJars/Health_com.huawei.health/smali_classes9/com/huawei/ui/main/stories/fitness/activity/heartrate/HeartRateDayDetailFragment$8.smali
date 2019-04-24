.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fba$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)V
    .locals 2

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;F)F

    .line 401
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    if-eqz v0, :cond_0

    .line 405
    return-void

    .line 407
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)F

    move-result v0

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)F

    move-result v0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    .line 410
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 412
    return-void

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a()V

    goto :goto_0

    .line 417
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b()V

    .line 419
    :goto_0
    invoke-static {}, Lo/evz;->a()Landroid/view/animation/Animation;

    move-result-object v3

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e:Lo/fba;

    invoke-virtual {v0, v3}, Lo/fba;->startAnimation(Landroid/view/animation/Animation;)V

    .line 421
    goto :goto_2

    .line 422
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b()V

    goto :goto_1

    .line 426
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 427
    return-void

    .line 429
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a()V

    .line 432
    :goto_1
    invoke-static {}, Lo/evz;->c()Landroid/view/animation/Animation;

    move-result-object v3

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e:Lo/fba;

    invoke-virtual {v0, v3}, Lo/fba;->startAnimation(Landroid/view/animation/Animation;)V

    .line 436
    :cond_6
    :goto_2
    return-void
.end method
