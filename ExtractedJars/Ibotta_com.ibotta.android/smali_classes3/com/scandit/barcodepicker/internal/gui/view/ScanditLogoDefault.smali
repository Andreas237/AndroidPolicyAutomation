.class public Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;
.super Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;
.source "ScanditLogoDefault.java"


# instance fields
.field private final mLogoState:Lcom/scandit/base/view/SbImageButtonState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    const/16 v0, 0x28

    .line 29
    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v0

    const/16 v1, 0xc

    invoke-static {p1, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {p0, p2, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogo;-><init>(ZII)V

    const/4 p2, 0x2

    .line 31
    invoke-static {p1, p2}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v0

    const-string v1, "scandit_logo"

    const/4 v2, 0x6

    if-le v0, v2, :cond_0

    const-string v1, "scandit_logo3x"

    const p2, -0x25170bb

    goto :goto_0

    :cond_0
    if-le v0, p2, :cond_1

    const-string v1, "scandit_logo2x"

    const p2, -0x5426afd1

    goto :goto_0

    :cond_1
    const p2, -0x4b8cfb85

    .line 42
    :goto_0
    new-instance v0, Lcom/scandit/base/view/SbImageButtonState;

    const-string v2, "raw"

    .line 43
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {v0, p1, p2}, Lcom/scandit/base/view/SbImageButtonState;-><init>(II)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;->mLogoState:Lcom/scandit/base/view/SbImageButtonState;

    return-void
.end method


# virtual methods
.method public draw(Landroid/content/Context;Landroid/graphics/Canvas;IILandroid/graphics/Rect;)V
    .locals 9

    .line 48
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;->mLogoState:Lcom/scandit/base/view/SbImageButtonState;

    invoke-virtual {p3, p1}, Lcom/scandit/base/view/SbImageButtonState;->getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x6

    .line 53
    invoke-static {p1, p3}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result v5

    .line 54
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    mul-int p3, p3, v5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int v4, p3, v0

    .line 55
    iget-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;->mIsLegacy:Z

    if-eqz p3, :cond_1

    .line 56
    iget p3, p5, Landroid/graphics/Rect;->right:I

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    add-int v2, p3, p1

    .line 57
    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, p1

    add-int v3, p4, v4

    const/4 v6, 0x0

    const/16 v7, 0x10e

    const/4 v8, 0x0

    move-object v0, p2

    .line 58
    invoke-static/range {v0 .. v8}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    goto :goto_0

    .line 62
    :cond_1
    iget p3, p5, Landroid/graphics/Rect;->right:I

    const/4 p4, -0x2

    invoke-static {p1, p4}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    add-int/2addr p3, p1

    iget p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/ScanditLogoDefault;->mRightImageOffset:I

    sub-int/2addr p3, p1

    .line 63
    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    div-int/lit8 p4, v5, 0x2

    sub-int v3, p1, p4

    sub-int v2, p3, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p2

    .line 64
    invoke-static/range {v0 .. v8}, Lcom/scandit/base/draw/SbDrawUtils;->drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V

    :goto_0
    return-void
.end method
