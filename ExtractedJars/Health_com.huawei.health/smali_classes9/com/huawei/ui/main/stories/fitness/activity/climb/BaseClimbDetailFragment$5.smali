.class Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fac$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->w:F

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->v:J

    .line 149
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 6

    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->v:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 154
    return-void

    .line 157
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->w:F

    sub-float v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->w:F

    cmpl-float v0, v4, v0

    if-lez v0, :cond_3

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 162
    return-void

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d()V

    goto :goto_0

    .line 167
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c()V

    .line 169
    :goto_0
    invoke-static {}, Lo/evz;->a()Landroid/view/animation/Animation;

    move-result-object v5

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e:Lo/fac;

    invoke-virtual {v0, v5}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 171
    goto :goto_2

    .line 172
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->c()V

    goto :goto_1

    .line 176
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 177
    return-void

    .line 179
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->d()V

    .line 182
    :goto_1
    invoke-static {}, Lo/evz;->c()Landroid/view/animation/Animation;

    move-result-object v5

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/BaseClimbDetailFragment;->e:Lo/fac;

    invoke-virtual {v0, v5}, Lo/fac;->startAnimation(Landroid/view/animation/Animation;)V

    .line 186
    :cond_6
    :goto_2
    return-void
.end method
