.class Lcom/tencent/open/TaskGuide$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/TaskGuide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Z

.field b:F

.field final synthetic c:Lcom/tencent/open/TaskGuide;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TaskGuide;Z)V
    .locals 1

    .line 528
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 526
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide$c;->a:Z

    .line 532
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide$c;->b:F

    .line 529
    iput-boolean p2, p0, Lcom/tencent/open/TaskGuide$c;->a:Z

    .line 530
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 536
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v4

    .line 537
    iget v0, p0, Lcom/tencent/open/TaskGuide$c;->b:F

    float-to-double v0, v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/tencent/open/TaskGuide$c;->b:F

    .line 539
    iget v6, p0, Lcom/tencent/open/TaskGuide$c;->b:F

    .line 540
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v6, v0

    if-lez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    move v6, v0

    .line 543
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v6, v0

    if-ltz v0, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 547
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->m(Lcom/tencent/open/TaskGuide;)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-interface {v0, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->n(Lcom/tencent/open/TaskGuide;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v8, v0

    .line 548
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide$c;->a:Z

    if-eqz v0, :cond_2

    .line 549
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->o(Lcom/tencent/open/TaskGuide;)I

    move-result v1

    add-int/2addr v1, v8

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_2

    .line 551
    :cond_2
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->o(Lcom/tencent/open/TaskGuide;)I

    move-result v1

    sub-int/2addr v1, v8

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 553
    :goto_2
    const-string v0, "TAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mWinParams.y = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v2}, Lcom/tencent/open/TaskGuide;->h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "deltaDistence = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 556
    const/4 v7, 0x1

    goto :goto_3

    .line 558
    :cond_3
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->p(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v2}, Lcom/tencent/open/TaskGuide;->h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 561
    :goto_3
    if-eqz v7, :cond_4

    .line 562
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->q(Lcom/tencent/open/TaskGuide;)V

    goto :goto_4

    .line 564
    :cond_4
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->s(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->r(Lcom/tencent/open/TaskGuide;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 567
    :goto_4
    return-void
.end method
