.class public Lo/bnw;
.super Landroid/widget/ListView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 6

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/bnw;->getChildCount()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 44
    invoke-virtual {p0, v3}, Lo/bnw;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 45
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v4, v0, p2}, Landroid/view/View;->measure(II)V

    .line 46
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 47
    if-le v5, v2, :cond_0

    .line 48
    move v2, v5

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p0}, Lo/bnw;->getPaddingLeft()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p0}, Lo/bnw;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 53
    invoke-super {p0, v3, p2}, Landroid/widget/ListView;->onMeasure(II)V

    .line 54
    return-void
.end method
