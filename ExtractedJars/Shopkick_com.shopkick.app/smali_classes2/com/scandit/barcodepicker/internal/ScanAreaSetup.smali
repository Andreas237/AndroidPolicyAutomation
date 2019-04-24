.class public Lcom/scandit/barcodepicker/internal/ScanAreaSetup;
.super Ljava/lang/Object;
.source "ScanAreaSetup.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getTransformedScanAreaSettings(Landroid/content/Context;Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 10

    .line 40
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p0, :cond_1

    .line 41
    invoke-static {p0}, Lcom/scandit/base/system/SbSystemUtils;->isDisplayLandscape(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v9, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v9, v2

    :goto_1
    if-eqz v9, :cond_2

    .line 42
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 43
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->transformScanAreaSettings(Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanAreaSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    return-object p0

    :cond_2
    if-nez v9, :cond_3

    .line 45
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 46
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->transformScanAreaSettings(Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanAreaSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    return-object p0

    :cond_3
    if-eqz v9, :cond_4

    .line 49
    invoke-virtual {p2, v1}, Lcom/scandit/barcodepicker/ScanSettings;->getActiveScanningArea(I)Landroid/graphics/RectF;

    move-result-object p0

    goto :goto_2

    .line 50
    :cond_4
    invoke-virtual {p2, v2}, Lcom/scandit/barcodepicker/ScanSettings;->getActiveScanningArea(I)Landroid/graphics/RectF;

    move-result-object p0

    .line 51
    :goto_2
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 52
    invoke-virtual {p1, v3, p0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    const/4 p0, 0x2

    .line 53
    new-array p0, p0, [F

    iget v4, v0, Landroid/graphics/PointF;->x:F

    aput v4, p0, v1

    iget v0, v0, Landroid/graphics/PointF;->y:F

    aput v0, p0, v2

    .line 54
    invoke-virtual {p1, p0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 55
    aget p1, p0, v1

    aget p0, p0, v2

    invoke-static {p1, p0}, Lcom/scandit/recognition/Native;->sc_point_f_make(FF)J

    move-result-wide p0

    .line 56
    iget v0, v3, Landroid/graphics/RectF;->left:F

    iget v1, v3, Landroid/graphics/RectF;->top:F

    .line 57
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    .line 56
    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_rectangle_f_make(FFFF)J

    move-result-wide v0

    .line 59
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/scandit/recognition/BarcodeScannerSettings;->getHandle()J

    move-result-wide v3

    move-wide v5, v0

    move-wide v7, p0

    .line 58
    invoke-static/range {v3 .. v9}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_restricted_scan_area(JJJI)I

    .line 61
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->delete_ScPoint(J)V

    .line 62
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScRectangleF(J)V

    .line 63
    new-instance p0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {p0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 64
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationArea1d()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    .line 66
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationArea2d()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    .line 67
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getSearchArea()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    .line 68
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationConstraint2d()I

    move-result p2

    iput p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 69
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationConstraint1d()I

    move-result p1

    iput p1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    return-object p0
.end method

.method private static transformScanAreaSettings(Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanAreaSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 3

    .line 29
    new-instance v0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 30
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    iget-object v2, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 31
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    iget-object v2, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 32
    iget-object v1, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    iget-object v2, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 33
    iget p0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    iput p0, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 34
    iget p0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    iput p0, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    return-object v0
.end method
