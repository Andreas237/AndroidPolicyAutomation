.class public Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;
.super Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;
.source "ViewFinder.java"


# instance fields
.field private final guiStyle:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPath:Landroid/graphics/Path;

.field private mViewfinderRectForCurrentPath:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZI)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mViewfinderRectForCurrentPath:Landroid/graphics/Rect;

    .line 34
    iput p4, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->guiStyle:I

    return-void
.end method

.method private addArc(FFFFFF)V
    .locals 7

    .line 133
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    sub-float v1, p3, p1

    const v2, 0x3f0d5ed8

    mul-float/2addr v1, v2

    add-float/2addr v1, p1

    sub-float p1, p4, p2

    mul-float/2addr p1, v2

    add-float/2addr p1, p2

    sub-float/2addr p3, p5

    mul-float/2addr p3, v2

    add-float v3, p3, p5

    sub-float/2addr p4, p6

    mul-float/2addr p4, v2

    add-float v4, p4, p6

    move v2, p1

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    return-void
.end method


# virtual methods
.method drawIndicatorInRect(Landroid/content/Context;Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 12

    .line 81
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mViewfinderRectForCurrentPath:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 82
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 83
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->getWidth()I

    move-result p1

    .line 84
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->getRightImageOffset()I

    move-result v0

    const/4 v1, 0x2

    .line 85
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->pxFromDp(I)I

    move-result v2

    .line 86
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->shouldEmbedLogoInViewfinderRect()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    move p1, v4

    move v0, p1

    move v2, v0

    .line 92
    :cond_1
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result v4

    div-int/2addr v4, v1

    .line 93
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result v5

    div-int/2addr v5, v1

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->getCornerRadius()I

    move-result v6

    invoke-virtual {p0, v6}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->pxFromDp(I)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-nez v3, :cond_2

    .line 96
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v4

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_0

    .line 98
    :cond_2
    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v6, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, p1

    mul-int/2addr v2, v1

    sub-int/2addr v6, v2

    sub-int/2addr v6, v0

    int-to-float p1, v6

    iget v1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    invoke-virtual {v5, p1, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 102
    :goto_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v4

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 103
    iget p1, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v4

    int-to-float v6, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, p1

    iget p1, p3, Landroid/graphics/Rect;->left:I

    int-to-float v8, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v9, p1

    iget p1, p3, Landroid/graphics/Rect;->left:I

    int-to-float v10, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v4

    int-to-float v11, p1

    move-object v5, p0

    invoke-direct/range {v5 .. v11}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->addArc(FFFFFF)V

    .line 106
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 107
    iget p1, p3, Landroid/graphics/Rect;->left:I

    int-to-float v6, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v4

    int-to-float v7, p1

    iget p1, p3, Landroid/graphics/Rect;->left:I

    int-to-float v8, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float v9, p1

    iget p1, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v4

    int-to-float v10, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float v11, p1

    invoke-direct/range {v5 .. v11}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->addArc(FFFFFF)V

    .line 110
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v4

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 111
    iget p1, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, v4

    int-to-float v6, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float v7, p1

    iget p1, p3, Landroid/graphics/Rect;->right:I

    int-to-float v8, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float v9, p1

    iget p1, p3, Landroid/graphics/Rect;->right:I

    int-to-float v10, p1

    iget p1, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v4

    int-to-float v11, p1

    invoke-direct/range {v5 .. v11}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->addArc(FFFFFF)V

    .line 114
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 115
    iget p1, p3, Landroid/graphics/Rect;->right:I

    int-to-float v6, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v4

    int-to-float v7, p1

    iget p1, p3, Landroid/graphics/Rect;->right:I

    int-to-float v8, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v9, p1

    iget p1, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, v4

    int-to-float v10, p1

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v11, p1

    invoke-direct/range {v5 .. v11}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->addArc(FFFFFF)V

    if-nez v3, :cond_3

    .line 119
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v0, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v4

    int-to-float v0, v0

    iget v1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_1

    .line 121
    :cond_3
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v0

    int-to-float v0, v1

    iget v1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 123
    :goto_1
    iput-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mViewfinderRectForCurrentPath:Landroid/graphics/Rect;

    .line 126
    :cond_4
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, p1, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public restoreDefaults()V
    .locals 2

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    .line 40
    invoke-super {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->restoreDefaults()V

    .line 42
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPath:Landroid/graphics/Path;

    .line 43
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 45
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 46
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    return-void
.end method

.method public setColors(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    .line 54
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setCornerRadius(I)V
    .locals 0

    .line 65
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setCornerRadius(I)V

    return-void
.end method

.method public setLineWidth(I)V
    .locals 1

    .line 59
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLineWidth(I)V

    .line 60
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->pxFromDp(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public shouldEmbedLogoInViewfinderRect()Z
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    .line 71
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    invoke-virtual {v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->getRightImageOffset()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->getCornerRadius()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    const/4 v1, 0x6

    .line 72
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->pxFromDp(I)I

    move-result v1

    .line 73
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;->getViewfinderRect()Landroid/graphics/Rect;

    move-result-object v2

    .line 74
    invoke-super {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->shouldEmbedLogoInViewfinderRect()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 75
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 76
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
