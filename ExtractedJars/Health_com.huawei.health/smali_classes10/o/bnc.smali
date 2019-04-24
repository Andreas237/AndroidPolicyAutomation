.class public Lo/bnc;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method private e(I)V
    .locals 12

    .line 58
    invoke-virtual {p0}, Lo/bnc;->getChildCount()I

    move-result v2

    .line 60
    const/4 v0, 0x2

    if-eq v2, v0, :cond_0

    .line 62
    return-void

    .line 65
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bnc;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    return-void

    .line 72
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bnc;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 75
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 77
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/View;->measure(II)V

    .line 79
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 81
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/View;->measure(II)V

    .line 83
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 88
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 89
    if-eqz v9, :cond_2

    .line 91
    iget v0, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/lit8 v8, v0, 0x0

    .line 92
    iget v0, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v8, v0

    goto :goto_0

    .line 96
    :cond_2
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v9, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 99
    :goto_0
    if-eqz v10, :cond_3

    .line 101
    iget v0, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v8, v0

    .line 102
    iget v0, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v8, v0

    .line 106
    :cond_3
    add-int v0, v6, v7

    add-int/2addr v0, v8

    if-ge v5, v0, :cond_5

    .line 108
    sub-int v0, v5, v7

    sub-int v11, v0, v8

    .line 109
    iget v0, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-eq v11, v0, :cond_4

    .line 111
    iput v11, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 112
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    :cond_4
    goto :goto_1

    .line 117
    :cond_5
    const/4 v0, -0x2

    iput v0, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 118
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    :goto_1
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/bnc;->e(I)V

    .line 48
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 49
    return-void
.end method
