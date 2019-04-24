.class Lo/bwc$1;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwc;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bwc;


# direct methods
.method constructor <init>(Lo/bwc;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 6

    .line 70
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-virtual {v0}, Lo/bwc;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwb;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v3, v0, 0xa

    .line 71
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-virtual {v0}, Lo/bwc;->getWidth()I

    move-result v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwb;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwb;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v4, v0, -0xa

    .line 72
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 73
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    sub-int v1, v5, v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    invoke-virtual {v0, v1}, Lo/bwc;->setAlpha(F)V

    .line 74
    return v5
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 1

    .line 79
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwb;->getTop()I

    move-result v0

    return v0
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 7

    .line 84
    const-string v0, "LockScreenView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--Math.abs(mDragView.getLeft() - mAutoBackPoint.x): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v3}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v3

    invoke-virtual {v3}, Lo/bwb;->getLeft()I

    move-result v3

    iget-object v4, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v4}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v3}, Lo/bwc;->b(Lo/bwc;)I

    move-result v3

    div-int/lit8 v3, v3, 0x4

    iget-object v4, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v4}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v4

    invoke-virtual {v4}, Lo/bwb;->getWidth()I

    move-result v4

    iget-object v5, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v5}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v5

    invoke-virtual {v5}, Lo/bwb;->getPaddingLeft()I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwb;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->b(Lo/bwc;)I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwb;->getWidth()I

    move-result v2

    iget-object v3, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v3}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v3

    invoke-virtual {v3}, Lo/bwb;->getPaddingLeft()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 86
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->a(Lo/bwc;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwb;->getLeft()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 89
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->a(Lo/bwc;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->b(Lo/bwc;)I

    move-result v1

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwb;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwb;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v0}, Lo/bwc;->a(Lo/bwc;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v1}, Lo/bwc;->e(Lo/bwc;)Lo/bwb;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwb;->getPaddingLeft()I

    move-result v1

    neg-int v1, v1

    iget-object v2, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-static {v2}, Lo/bwc;->d(Lo/bwc;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 94
    :goto_0
    iget-object v0, p0, Lo/bwc$1;->e:Lo/bwc;

    invoke-virtual {v0}, Lo/bwc;->postInvalidate()V

    .line 95
    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 1

    .line 65
    const/4 v0, 0x1

    return v0
.end method
