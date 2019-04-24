.class Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fac$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)V
    .locals 2

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->S:F

    .line 310
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->J:Z

    if-eqz v0, :cond_0

    .line 314
    return-void

    .line 316
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->S:F

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->S:F

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    .line 320
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 322
    return-void

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b()V

    goto :goto_0

    .line 327
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e()V

    .line 330
    :goto_0
    invoke-static {}, Lo/evz;->a()Landroid/view/animation/Animation;

    move-result-object v3

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    invoke-virtual {v0, v3}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 332
    goto :goto_2

    .line 333
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e()V

    goto :goto_1

    .line 337
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 338
    return-void

    .line 340
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b()V

    .line 342
    :goto_1
    invoke-static {}, Lo/evz;->c()Landroid/view/animation/Animation;

    move-result-object v3

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    invoke-virtual {v0, v3}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 346
    :cond_6
    :goto_2
    return-void
.end method
