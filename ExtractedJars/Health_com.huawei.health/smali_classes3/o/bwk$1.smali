.class Lo/bwk$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bwk;


# direct methods
.method constructor <init>(Lo/bwk;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 73
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-virtual {v0}, Lo/bwk;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 75
    :cond_0
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->b(Lo/bwk;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/bwk;->a(Lo/bwk;Z)Z

    .line 77
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->e(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->a(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 78
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->e(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 80
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->c(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->d(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 81
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->c(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 83
    const/4 v0, 0x1

    return v0
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    .line 116
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->f(Lo/bwk;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->i(Lo/bwk;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bwk;->b(Lo/bwk;Z)Z

    .line 119
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->p(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->h(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 120
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->p(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 121
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->e(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->a(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 122
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->e(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    .line 125
    :cond_0
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->i(Lo/bwk;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bwk;->b(Lo/bwk;Z)Z

    .line 127
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->p(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->h(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 128
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->p(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 131
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 90
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 94
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 96
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->i(Lo/bwk;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/bwk;->d(Lo/bwk;Z)Z

    .line 98
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->k(Lo/bwk;)Z

    move-result v0

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->b(Lo/bwk;)Z

    move-result v1

    if-ne v0, v1, :cond_2

    .line 99
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->b(Lo/bwk;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lo/bwk;->d(Lo/bwk;Z)Z

    .line 100
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->i(Lo/bwk;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Lo/bwk;->b(Lo/bwk;Z)Z

    .line 102
    :cond_2
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->i(Lo/bwk;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/bwk;->c(Lo/bwk;Z)V

    .line 103
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->c(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->d(Lo/bwk;)F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 104
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->c(Lo/bwk;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 106
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->g(Lo/bwk;)Lo/bwk$c;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->b(Lo/bwk;)Z

    move-result v0

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v1}, Lo/bwk;->k(Lo/bwk;)Z

    move-result v1

    if-eq v0, v1, :cond_3

    .line 107
    iget-object v0, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v0}, Lo/bwk;->g(Lo/bwk;)Lo/bwk$c;

    move-result-object v0

    iget-object v1, p0, Lo/bwk$1;->a:Lo/bwk;

    iget-object v2, p0, Lo/bwk$1;->a:Lo/bwk;

    invoke-static {v2}, Lo/bwk;->b(Lo/bwk;)Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/bwk$c;->d(Landroid/view/View;Z)V

    .line 110
    :cond_3
    const/4 v0, 0x1

    return v0
.end method
