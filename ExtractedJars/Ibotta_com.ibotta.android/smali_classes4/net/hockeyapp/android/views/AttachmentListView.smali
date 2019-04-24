.class public Lnet/hockeyapp/android/views/AttachmentListView;
.super Landroid/view/ViewGroup;
.source "AttachmentListView.java"


# instance fields
.field private mLineHeight:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 102
    instance-of p1, p1, Landroid/view/ViewGroup$LayoutParams;

    return p1
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 97
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public getAttachments()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 41
    :goto_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 42
    invoke-virtual {p0, v1}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lnet/hockeyapp/android/views/AttachmentView;

    .line 43
    invoke-virtual {v2}, Lnet/hockeyapp/android/views/AttachmentView;->getAttachmentUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .line 107
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildCount()I

    move-result p1

    sub-int/2addr p4, p2

    .line 109
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingLeft()I

    move-result p2

    .line 110
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingTop()I

    move-result p3

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p1, :cond_2

    .line 113
    invoke-virtual {p0, p5}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_1

    .line 116
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 117
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 118
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    add-int v4, p2, v1

    if-le v4, p4, :cond_0

    .line 122
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingLeft()I

    move-result p2

    .line 123
    iget v4, p0, Lnet/hockeyapp/android/views/AttachmentListView;->mLineHeight:I

    add-int/2addr p3, v4

    :cond_0
    add-int v4, p2, v1

    add-int/2addr v2, p3

    .line 125
    invoke-virtual {v0, p2, p3, v4, v2}, Landroid/view/View;->layout(IIII)V

    .line 126
    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v1, v2

    check-cast v0, Lnet/hockeyapp/android/views/AttachmentView;

    invoke-virtual {v0}, Lnet/hockeyapp/android/views/AttachmentView;->getGap()I

    move-result v0

    add-int/2addr v1, v0

    add-int/2addr p2, v1

    :cond_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    .line 50
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AttachmentListView"

    const-string v1, "Width is unspecified"

    .line 51
    invoke-static {v0, v1}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 56
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildCount()I

    move-result v0

    .line 60
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingLeft()I

    move-result v1

    .line 61
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingTop()I

    move-result v2

    const/4 v3, 0x0

    move v4, v1

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_0
    const/high16 v6, -0x80000000

    if-ge v3, v0, :cond_3

    .line 64
    invoke-virtual {p0, v3}, Lnet/hockeyapp/android/views/AttachmentListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 65
    move-object v7, v5

    check-cast v7, Lnet/hockeyapp/android/views/AttachmentView;

    .line 66
    invoke-virtual {v7}, Lnet/hockeyapp/android/views/AttachmentView;->getEffectiveMaxHeight()I

    move-result v8

    invoke-virtual {v7}, Lnet/hockeyapp/android/views/AttachmentView;->getPaddingTop()I

    move-result v7

    add-int/2addr v7, v8

    .line 68
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v8

    const/16 v9, 0x8

    if-eq v8, v9, :cond_2

    .line 69
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 70
    invoke-static {p1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    invoke-static {v7, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v5, v9, v6}, Landroid/view/View;->measure(II)V

    .line 72
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 73
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v9, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    add-int/2addr v5, v9

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int v5, v4, v6

    if-le v5, p1, :cond_1

    .line 76
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingLeft()I

    move-result v4

    add-int/2addr v2, v1

    .line 79
    :cond_1
    iget v5, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v6, v5

    add-int/2addr v4, v6

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v5, v7

    goto :goto_0

    .line 82
    :cond_3
    iput v1, p0, Lnet/hockeyapp/android/views/AttachmentListView;->mLineHeight:I

    .line 84
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_4

    add-int/2addr v2, v1

    .line 85
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingBottom()I

    move-result p2

    add-int v5, v2, p2

    goto :goto_1

    .line 87
    :cond_4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    if-ne p2, v6, :cond_5

    add-int/2addr v2, v1

    .line 88
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingBottom()I

    move-result p2

    add-int/2addr p2, v2

    if-ge p2, v5, :cond_5

    .line 89
    invoke-virtual {p0}, Lnet/hockeyapp/android/views/AttachmentListView;->getPaddingBottom()I

    move-result p2

    add-int v5, v2, p2

    .line 92
    :cond_5
    :goto_1
    invoke-virtual {p0, p1, v5}, Lnet/hockeyapp/android/views/AttachmentListView;->setMeasuredDimension(II)V

    return-void
.end method
