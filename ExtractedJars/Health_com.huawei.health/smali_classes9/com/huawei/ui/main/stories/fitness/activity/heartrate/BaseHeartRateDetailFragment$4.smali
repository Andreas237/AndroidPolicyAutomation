.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fac$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)V
    .locals 2

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->B:F

    .line 285
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->v:Z

    if-eqz v0, :cond_0

    .line 251
    return-void

    .line 253
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->B:F

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->B:F

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    .line 256
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 258
    return-void

    .line 260
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b()V

    goto :goto_0

    .line 262
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e()V

    .line 265
    :goto_0
    invoke-static {}, Lo/evz;->a()Landroid/view/animation/Animation;

    move-result-object v3

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    invoke-virtual {v0, v3}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 267
    goto :goto_2

    .line 268
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e()V

    goto :goto_1

    .line 271
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 272
    return-void

    .line 274
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b()V

    .line 276
    :goto_1
    invoke-static {}, Lo/evz;->c()Landroid/view/animation/Animation;

    move-result-object v3

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    invoke-virtual {v0, v3}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 280
    :cond_6
    :goto_2
    return-void
.end method
