.class public Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;
.super Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;
.source "LaserLine.java"


# instance fields
.field private final mLineBlue:Lcom/scandit/base/view/SbImageButtonState;

.field private final mLineWhite:Lcom/scandit/base/view/SbImageButtonState;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    .line 29
    new-instance p2, Lcom/scandit/base/view/SbImageButtonState;

    const-string p3, "scan_line_blue"

    const-string p4, "raw"

    invoke-static {p1, p3, p4}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    invoke-direct {p2, p3}, Lcom/scandit/base/view/SbImageButtonState;-><init>(I)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->mLineBlue:Lcom/scandit/base/view/SbImageButtonState;

    .line 30
    new-instance p2, Lcom/scandit/base/view/SbImageButtonState;

    const-string p3, "scan_line_white"

    const-string p4, "raw"

    invoke-static {p1, p3, p4}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {p2, p1}, Lcom/scandit/base/view/SbImageButtonState;-><init>(I)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->mLineWhite:Lcom/scandit/base/view/SbImageButtonState;

    return-void
.end method


# virtual methods
.method drawIndicatorInRect(Landroid/content/Context;Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 11

    .line 44
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->isActive()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->mLineWhite:Lcom/scandit/base/view/SbImageButtonState;

    invoke-virtual {v0, p1}, Lcom/scandit/base/view/SbImageButtonState;->getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 46
    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I

    move-result v0

    const/16 v2, 0x39

    const/16 v3, 0xc0

    const/16 v4, 0xcc

    invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 47
    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I

    move-result v0

    move-object v3, p1

    move v10, v0

    goto :goto_0

    :cond_0
    move-object v3, p1

    const/4 v10, 0x0

    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->mLineBlue:Lcom/scandit/base/view/SbImageButtonState;

    invoke-virtual {v0, p1}, Lcom/scandit/base/view/SbImageButtonState;->getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 51
    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    .line 52
    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->getColor(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;)I

    move-result v0

    move-object v3, p1

    move v10, v0

    goto :goto_0

    :cond_2
    move-object v3, p1

    const/4 v10, 0x0

    .line 56
    :goto_0
    iget v4, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    move-result p1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->pxFromDp(I)I

    move-result v0

    sub-int v5, p1, v0

    iget p1, p3, Landroid/graphics/Rect;->right:I

    iget p3, p3, Landroid/graphics/Rect;->left:I

    sub-int v6, p1, p3

    const/16 p1, 0xe

    .line 57
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->pxFromDp(I)I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->isLegacy()Z

    move-result p1

    if-eqz p1, :cond_3

    const/16 v1, 0x10e

    const/16 v9, 0x10e

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    move-object v2, p2

    .line 56
    invoke-static/range {v2 .. v10}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    return-void
.end method

.method protected getViewfinderRect()Landroid/graphics/Rect;
    .locals 6

    .line 35
    invoke-super {p0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getViewfinderRect()Landroid/graphics/Rect;

    move-result-object v0

    const/16 v1, 0xf

    .line 36
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;->pxFromDp(I)I

    move-result v1

    .line 37
    new-instance v2, Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    sub-int/2addr v4, v1

    iget v5, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    add-int/2addr v0, v1

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2
.end method
