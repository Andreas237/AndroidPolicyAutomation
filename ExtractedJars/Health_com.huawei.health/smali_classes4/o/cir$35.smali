.class Lo/cir$35;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 553
    iput-object p1, p0, Lo/cir$35;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 11

    .line 556
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    .line 557
    return-void

    .line 559
    :cond_0
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 560
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->i(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 561
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 562
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 563
    const/4 v0, 0x2

    new-array v7, v0, [I

    .line 564
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->getLocationInWindow([I)V

    .line 565
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 566
    const/4 v0, 0x1

    aget v0, v7, v0

    const/4 v1, 0x0

    aget v1, v7, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v0, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 568
    :cond_1
    const/4 v0, 0x0

    aget v0, v7, v0

    const/4 v1, 0x1

    aget v1, v7, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 570
    :goto_0
    iget v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double v8, v0, v2

    .line 571
    const/4 v0, 0x0

    aget v0, v7, v0

    int-to-double v0, v0

    add-double/2addr v0, v8

    const/4 v2, 0x0

    aget v2, v7, v2

    int-to-double v2, v2

    add-double/2addr v2, v8

    mul-double/2addr v0, v2

    const/4 v2, 0x1

    aget v2, v7, v2

    int-to-double v2, v2

    add-double/2addr v2, v8

    const/4 v4, 0x1

    aget v4, v7, v4

    int-to-double v4, v4

    add-double/2addr v4, v8

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    div-double/2addr v0, v8

    double-to-int v0, v0

    add-int/lit8 v10, v0, 0x1

    .line 572
    int-to-float v0, v10

    iget-object v1, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->k(Lo/cir;)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 573
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    int-to-float v1, v10

    invoke-static {v0, v1}, Lo/cir;->e(Lo/cir;F)F

    .line 575
    :cond_2
    iget-object v0, p0, Lo/cir$35;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->i(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 576
    return-void
.end method
