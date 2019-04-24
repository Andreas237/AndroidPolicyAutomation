.class public abstract Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;
.super Ljava/lang/Object;
.source "ViewFinderBase.java"


# instance fields
.field private mActive:Z

.field private final mColors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private mCornerRadius:I

.field private final mIsLegacy:Z

.field private mLandscapeRect:Landroid/graphics/RectF;

.field private mLineWidth:I

.field protected mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

.field private mPortraitRect:Landroid/graphics/RectF;

.field private mShouldDrawIndicator:Z

.field private mShouldDrawLogo:Z

.field private mViewHeight:I

.field private mViewWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawLogo:Z

    .line 62
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    .line 63
    iput-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mIsLegacy:Z

    .line 65
    invoke-virtual {p0, p4}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLogoForGuiStyle(I)V

    .line 66
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mColors:Ljava/util/Map;

    .line 68
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->restoreDefaults()V

    if-eqz p3, :cond_0

    .line 70
    invoke-direct {p3, p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setPropertiesOnViewfinder(Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;)V

    :cond_0
    return-void
.end method

.method private restoreDefaultRects()V
    .locals 5

    .line 141
    new-instance v0, Landroid/graphics/RectF;

    const v1, 0x3f333333    # 0.7f

    const v2, 0x3e99999a    # 0.3f

    const v3, 0x3d4cccd0    # 0.050000012f

    const v4, 0x3f733333    # 0.95f

    invoke-direct {v0, v3, v2, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    .line 142
    new-instance v0, Landroid/graphics/RectF;

    const v3, 0x3e4ccccc    # 0.19999999f

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct {v0, v3, v2, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    return-void
.end method

.method private setPropertiesOnViewfinder(Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;)V
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawIndicator:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 154
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mColors:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    .line 155
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setPortraitRect(Landroid/graphics/RectF;)V

    .line 156
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLandscapeRect(Landroid/graphics/RectF;)V

    .line 157
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mActive:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setActive(Z)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 218
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getViewfinderRect()Landroid/graphics/Rect;

    move-result-object v6

    .line 219
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawLogo:Z

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    iget v3, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewWidth:I

    iget v4, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewHeight:I

    move-object v2, p1

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;->draw(Landroid/content/Context;Landroid/graphics/Canvas;IILandroid/graphics/Rect;)V

    .line 223
    :cond_0
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawIndicator:Z

    if-nez v0, :cond_1

    return-void

    .line 226
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0, p1, v6}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->drawIndicatorInRect(Landroid/content/Context;Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    return-void
.end method

.method abstract drawIndicatorInRect(Landroid/content/Context;Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
.end method

.method public getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mColors:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public getCornerRadius()I
    .locals 1

    .line 202
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mCornerRadius:I

    return v0
.end method

.method public getLandscapeRect()Landroid/graphics/RectF;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getPortraitRect()Landroid/graphics/RectF;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    return-object v0
.end method

.method protected getViewfinderRect()Landroid/graphics/Rect;
    .locals 8

    .line 232
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/scandit/base/system/SbSystemUtils;->getDisplayRotation(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    .line 233
    invoke-static {v0}, Lcom/scandit/base/system/SbSystemUtils;->getDisplayRotation(Landroid/content/Context;)I

    move-result v0

    const/16 v3, 0xb4

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 235
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    .line 239
    :goto_2
    iget v4, v3, Landroid/graphics/RectF;->left:F

    const v5, 0x3ba3d70a    # 0.005f

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_6

    iget v4, v3, Landroid/graphics/RectF;->right:F

    float-to-double v4, v4

    const-wide v6, 0x3fefd70a3d70a3d7L    # 0.995

    cmpl-double v4, v4, v6

    if-lez v4, :cond_3

    goto :goto_4

    .line 243
    :cond_3
    iget v4, v3, Landroid/graphics/RectF;->top:F

    const v5, 0x3cf5c28f    # 0.03f

    cmpg-float v4, v4, v5

    const v5, 0x3f7851ec    # 0.97f

    if-ltz v4, :cond_5

    iget v4, v3, Landroid/graphics/RectF;->bottom:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_4

    goto :goto_3

    :cond_4
    move v2, v1

    goto :goto_5

    :cond_5
    :goto_3
    const-string v1, "ScanditBarcodeScanner"

    const-string v4, "The viewfinder can\'t extend past the picker\'s view on either side of the y axis - resetting to defaults\""

    .line 244
    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    iput v5, v3, Landroid/graphics/RectF;->bottom:F

    goto :goto_5

    :cond_6
    :goto_4
    const-string v1, "ScanditBarcodeScanner"

    const-string v4, "The viewfinder can\'t extend past the picker\'s view on either side of the x axis - resetting to defaults"

    .line 240
    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_5
    if-eqz v2, :cond_8

    const-string v1, "ScanditBarcodeScanner"

    const-string v2, "Check your settings for the scanningHotSpot and viewfinder size and adjust them to fit within the picker\'s view."

    .line 251
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->restoreDefaultRects()V

    if-eqz v0, :cond_7

    .line 254
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    goto :goto_6

    :cond_7
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    :goto_6
    move-object v3, v0

    .line 257
    :cond_8
    new-instance v0, Landroid/graphics/Rect;

    iget v1, v3, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewWidth:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iget v2, v3, Landroid/graphics/RectF;->top:F

    iget v4, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewHeight:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    float-to-int v2, v2

    iget v4, v3, Landroid/graphics/RectF;->right:F

    iget v5, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewWidth:I

    int-to-float v5, v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    iget v5, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewHeight:I

    int-to-float v5, v5

    mul-float/2addr v3, v5

    float-to-int v3, v3

    invoke-direct {v0, v1, v2, v4, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method protected isActive()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mActive:Z

    return v0
.end method

.method protected isLegacy()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mIsLegacy:Z

    return v0
.end method

.method public onSizeChanged(II)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewWidth:I

    .line 162
    iput p2, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mViewHeight:I

    return-void
.end method

.method protected pxFromDp(I)I
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public restoreDefaults()V
    .locals 5

    const/4 v0, 0x0

    .line 125
    invoke-virtual {p0, v0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->onSizeChanged(II)V

    .line 126
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->restoreDefaultRects()V

    const/4 v1, 0x1

    .line 128
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    const/16 v2, 0xa

    .line 129
    invoke-virtual {p0, v2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setCornerRadius(I)V

    .line 130
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLineWidth(I)V

    .line 131
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setActive(Z)V

    .line 133
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mColors:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 135
    sget-object v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    sget-object v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    const/16 v2, 0x39

    const/16 v3, 0xc0

    const/16 v4, 0xcc

    invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    return-void
.end method

.method public setActive(Z)V
    .locals 0

    .line 117
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mActive:Z

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

    .line 214
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mColors:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public setCornerRadius(I)V
    .locals 0

    .line 206
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mCornerRadius:I

    return-void
.end method

.method public setLandscapeRect(Landroid/graphics/RectF;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLandscapeRect:Landroid/graphics/RectF;

    return-void
.end method

.method public setLineWidth(I)V
    .locals 0

    .line 198
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->pxFromDp(I)I

    move-result p1

    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLineWidth:I

    return-void
.end method

.method public setLogoForGuiStyle(I)V
    .locals 2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 76
    new-instance p1, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 81
    :cond_1
    new-instance p1, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mIsLegacy:Z

    invoke-direct {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    goto :goto_1

    .line 79
    :cond_2
    :goto_0
    new-instance p1, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mContext:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mLogo:Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;

    :goto_1
    return-void
.end method

.method public setPortraitRect(Landroid/graphics/RectF;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mPortraitRect:Landroid/graphics/RectF;

    return-void
.end method

.method public setShouldDrawIndicator(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawIndicator:Z

    return-void
.end method

.method public setShouldDrawLogo(Z)V
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawLogo:Z

    return-void
.end method

.method public shouldEmbedLogoInViewfinderRect()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mShouldDrawLogo:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->mIsLegacy:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
