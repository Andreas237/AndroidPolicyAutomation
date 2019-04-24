.class public Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;
.super Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;
.source "HorizontalDividerItemDecoration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;,
        Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;
    }
.end annotation


# instance fields
.field private mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;


# direct methods
.method protected constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V

    .line 20
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->access$000(Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    return-void
.end method

.method private getDividerSize(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    invoke-interface {v0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;->dividerPaint(ILandroid/support/v7/widget/RecyclerView;)Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p1

    float-to-int p1, p1

    return p1

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    if-eqz v0, :cond_1

    .line 87
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    invoke-interface {v0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;->dividerSize(ILandroid/support/v7/widget/RecyclerView;)I

    move-result p1

    return p1

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    if-eqz v0, :cond_2

    .line 89
    iget-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    invoke-interface {v0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;->drawableProvider(ILandroid/support/v7/widget/RecyclerView;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 90
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    return p1

    .line 92
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "failed to get size"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected getDividerBound(ILandroid/support/v7/widget/RecyclerView;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 6

    .line 25
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 26
    invoke-static {p3}, Landroid/support/v4/view/ViewCompat;->getTranslationX(Landroid/view/View;)F

    move-result v1

    float-to-int v1, v1

    .line 27
    invoke-static {p3}, Landroid/support/v4/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    move-result v2

    float-to-int v2, v2

    .line 28
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 29
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v4

    iget-object v5, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    .line 30
    invoke-interface {v5, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;->dividerLeftMargin(ILandroid/support/v7/widget/RecyclerView;)I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v4, v1

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 31
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v4

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mMarginProvider:Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;

    .line 32
    invoke-interface {v5, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$MarginProvider;->dividerRightMargin(ILandroid/support/v7/widget/RecyclerView;)I

    move-result v5

    sub-int/2addr v4, v5

    add-int/2addr v4, v1

    iput v4, v0, Landroid/graphics/Rect;->right:I

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->getDividerSize(ILandroid/support/v7/widget/RecyclerView;)I

    move-result p1

    .line 35
    invoke-virtual {p0, p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->isReverseLayout(Landroid/support/v7/widget/RecyclerView;)Z

    move-result p2

    .line 36
    iget-object v1, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    sget-object v4, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    if-ne v1, v4, :cond_1

    if-eqz p2, :cond_0

    .line 39
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p3

    iget v1, v3, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    sub-int/2addr p3, v1

    add-int/2addr p3, v2

    iput p3, v0, Landroid/graphics/Rect;->bottom:I

    .line 40
    iget p3, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p3, p1

    iput p3, v0, Landroid/graphics/Rect;->top:I

    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result p3

    iget v1, v3, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr p3, v1

    add-int/2addr p3, v2

    iput p3, v0, Landroid/graphics/Rect;->top:I

    .line 43
    iget p3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, p1

    iput p3, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 47
    :cond_1
    div-int/lit8 v1, p1, 0x2

    if-eqz p2, :cond_2

    .line 49
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p3

    iget v3, v3, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    sub-int/2addr p3, v3

    sub-int/2addr p3, v1

    add-int/2addr p3, v2

    iput p3, v0, Landroid/graphics/Rect;->top:I

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result p3

    iget v3, v3, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr p3, v3

    add-int/2addr p3, v1

    add-int/2addr p3, v2

    iput p3, v0, Landroid/graphics/Rect;->top:I

    .line 53
    :goto_0
    iget p3, v0, Landroid/graphics/Rect;->top:I

    iput p3, v0, Landroid/graphics/Rect;->bottom:I

    .line 56
    :goto_1
    iget-boolean p3, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mPositionInsideItem:Z

    if-eqz p3, :cond_4

    if-eqz p2, :cond_3

    .line 58
    iget p2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, p1

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 59
    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, p1

    iput p2, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 61
    :cond_3
    iget p2, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr p2, p1

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 62
    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p2, p1

    iput p2, v0, Landroid/graphics/Rect;->bottom:I

    :cond_4
    :goto_2
    return-object v0
.end method

.method protected setItemOffsets(Landroid/graphics/Rect;ILandroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .line 71
    iget-boolean v0, p0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->mPositionInsideItem:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 76
    :cond_0
    invoke-virtual {p0, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->isReverseLayout(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    invoke-direct {p0, p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->getDividerSize(ILandroid/support/v7/widget/RecyclerView;)I

    move-result p2

    invoke-virtual {p1, v1, p2, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 79
    :cond_1
    invoke-direct {p0, p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;->getDividerSize(ILandroid/support/v7/widget/RecyclerView;)I

    move-result p2

    invoke-virtual {p1, v1, v1, v1, p2}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    return-void
.end method
