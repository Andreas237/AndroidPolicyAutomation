.class Lo/bdz$b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lo/bdz;


# direct methods
.method public constructor <init>(Lo/bdz;Landroid/content/Context;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lo/bdz$b;->b:Lo/bdz;

    .line 329
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 330
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 3

    .line 334
    iget-object v0, p0, Lo/bdz$b;->b:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lo/bdz$b;->getPaddingLeft()I

    move-result v1

    add-int v2, v0, v1

    .line 335
    if-eq v2, p2, :cond_0

    .line 336
    sub-int v0, v2, p2

    invoke-virtual {p0, v0}, Lo/bdz$b;->offsetLeftAndRight(I)V

    .line 338
    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 339
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 343
    iget-object v0, p0, Lo/bdz$b;->b:Lo/bdz;

    invoke-virtual {v0}, Lo/bdz;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lo/bdz$b;->b:Lo/bdz;

    invoke-virtual {v1}, Lo/bdz;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/bdz$b;->b:Lo/bdz;

    invoke-virtual {v1}, Lo/bdz;->getPaddingRight()I

    move-result v1

    sub-int v2, v0, v1

    .line 344
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 345
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 346
    return-void
.end method
