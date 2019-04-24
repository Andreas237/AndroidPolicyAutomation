.class Lo/bwm$5;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwm;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bwm;


# direct methods
.method constructor <init>(Lo/bwm;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 1

    .line 60
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->b(Lo/bwm;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    return v0
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 2

    .line 65
    if-lez p2, :cond_0

    .line 66
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->a(Lo/bwm;)Lo/bwf;

    move-result-object v0

    int-to-float v1, p2

    invoke-interface {v0, v1}, Lo/bwf;->a(F)V

    .line 67
    return p2

    .line 69
    :cond_0
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->b(Lo/bwm;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    return v0
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 3

    .line 75
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->b(Lo/bwm;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v1}, Lo/bwm;->d(Lo/bwm;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v1, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v1}, Lo/bwm;->c(Lo/bwm;)I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    if-ge v0, v1, :cond_0

    .line 76
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->e(Lo/bwm;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v1}, Lo/bwm;->d(Lo/bwm;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v2}, Lo/bwm;->d(Lo/bwm;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v0}, Lo/bwm;->e(Lo/bwm;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v1}, Lo/bwm;->d(Lo/bwm;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget-object v2, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-static {v2}, Lo/bwm;->c(Lo/bwm;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 80
    :goto_0
    iget-object v0, p0, Lo/bwm$5;->c:Lo/bwm;

    invoke-virtual {v0}, Lo/bwm;->postInvalidate()V

    .line 81
    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 1

    .line 55
    const/4 v0, 0x1

    return v0
.end method
