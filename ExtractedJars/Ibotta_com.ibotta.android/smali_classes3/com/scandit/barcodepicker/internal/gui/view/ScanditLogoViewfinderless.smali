.class public Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;
.super Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;
.source "ScanditLogoViewfinderless.java"


# instance fields
.field private final mLogoState:Lcom/scandit/base/view/SbImageButtonState;

.field private final mMovable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    const/16 v0, 0x78

    .line 31
    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v0

    const/16 v1, 0xc

    invoke-static {p1, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;-><init>(ZII)V

    const/4 v0, 0x2

    .line 33
    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v1

    const-string v2, "scandit_tracking_logo"

    const/4 v3, 0x6

    if-le v1, v3, :cond_0

    const-string v2, "scandit_tracking_logo3x"

    goto :goto_0

    :cond_0
    if-le v1, v0, :cond_1

    const-string v2, "scandit_tracking_logo2x"

    .line 44
    :cond_1
    :goto_0
    iput-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mMovable:Z

    .line 45
    new-instance p2, Lcom/scandit/base/view/SbImageButtonState;

    const-string v0, "raw"

    .line 46
    invoke-static {p1, v2, v0}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {p2, p1}, Lcom/scandit/base/view/SbImageButtonState;-><init>(I)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mLogoState:Lcom/scandit/base/view/SbImageButtonState;

    return-void
.end method


# virtual methods
.method public draw(Landroid/content/Context;Landroid/graphics/Canvas;IILandroid/graphics/Rect;)V
    .locals 10

    .line 51
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mLogoState:Lcom/scandit/base/view/SbImageButtonState;

    invoke-virtual {v0, p1}, Lcom/scandit/base/view/SbImageButtonState;->getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x9

    .line 56
    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v6

    .line 57
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    mul-int v0, v0, v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int v5, v0, v1

    .line 59
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mMovable:Z

    const/4 v1, -0x2

    if-nez v0, :cond_1

    const-wide v3, 0x3fee666666666666L    # 0.95

    int-to-double v7, p3

    mul-double v7, v7, v3

    double-to-int p3, v7

    .line 60
    invoke-static {p1, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p5

    add-int/2addr p3, p5

    iget p5, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mRightImageOffset:I

    sub-int/2addr p3, p5

    const/16 p5, 0x6e

    .line 61
    invoke-static {p1, p5}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    sub-int v4, p4, p1

    sub-int v3, p3, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p2

    .line 63
    invoke-static/range {v1 .. v9}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    goto :goto_0

    .line 66
    :cond_1
    iget-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mIsLegacy:Z

    if-eqz p3, :cond_2

    .line 67
    iget p3, p5, Landroid/graphics/Rect;->right:I

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    add-int v3, p3, p1

    .line 68
    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, p1

    add-int v4, p4, v5

    const/4 v7, 0x0

    const/16 v8, 0x10e

    const/4 v9, 0x0

    move-object v1, p2

    .line 69
    invoke-static/range {v1 .. v9}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    goto :goto_0

    .line 73
    :cond_2
    iget p3, p5, Landroid/graphics/Rect;->right:I

    invoke-static {p1, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    add-int/2addr p3, p1

    iget p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoViewfinderless;->mRightImageOffset:I

    sub-int/2addr p3, p1

    .line 74
    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    div-int/lit8 p4, v6, 0x2

    sub-int v4, p1, p4

    sub-int v3, p3, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p2

    .line 75
    invoke-static/range {v1 .. v9}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    :goto_0
    return-void
.end method
