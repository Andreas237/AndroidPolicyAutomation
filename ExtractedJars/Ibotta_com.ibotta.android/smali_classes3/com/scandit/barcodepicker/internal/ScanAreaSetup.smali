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

.method private static getScanAreaSettingsFromLegacy(ZLandroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 12

    .line 41
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p0, :cond_0

    .line 43
    invoke-virtual {p2, v1}, Lcom/scandit/barcodepicker/ScanSettings;->getActiveScanningArea(I)Landroid/graphics/RectF;

    move-result-object v3

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p2, v2}, Lcom/scandit/barcodepicker/ScanSettings;->getActiveScanningArea(I)Landroid/graphics/RectF;

    move-result-object v3

    .line 45
    :goto_0
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 46
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    const/4 v3, 0x2

    .line 47
    new-array v3, v3, [F

    iget v5, v0, Landroid/graphics/PointF;->x:F

    aput v5, v3, v1

    iget v0, v0, Landroid/graphics/PointF;->y:F

    aput v0, v3, v2

    .line 48
    invoke-virtual {p1, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 49
    aget p1, v3, v1

    aget v0, v3, v2

    invoke-static {p1, v0}, Lcom/scandit/recognition/Native;->sc_point_f_make(FF)J

    move-result-wide v0

    .line 50
    iget p1, v4, Landroid/graphics/RectF;->left:F

    iget v2, v4, Landroid/graphics/RectF;->top:F

    .line 51
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    .line 50
    invoke-static {p1, v2, v3, v4}, Lcom/scandit/recognition/Native;->sc_rectangle_f_make(FFFF)J

    move-result-wide v2

    .line 53
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getHandle()J

    move-result-wide v5

    move-wide v7, v2

    move-wide v9, v0

    move v11, p0

    .line 52
    invoke-static/range {v5 .. v11}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_settings_set_restricted_scan_area(JJJI)I

    .line 55
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScPoint(J)V

    .line 56
    invoke-static {v2, v3}, Lcom/scandit/recognition/Native;->delete_ScRectangleF(J)V

    .line 57
    new-instance p0, Lcom/scandit/barcodepicker/ScanAreaSettings;

    invoke-direct {p0}, Lcom/scandit/barcodepicker/ScanAreaSettings;-><init>()V

    .line 58
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationArea1d()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    .line 60
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationArea2d()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    .line 61
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getSearchArea()Landroid/graphics/RectF;

    move-result-object p2

    iput-object p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    .line 62
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationConstraint2d()I

    move-result p2

    iput p2, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 63
    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeLocationConstraint1d()I

    move-result p1

    iput p1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    return-object p0
.end method

.method public static getTransformedScanAreaSettings(Landroid/content/Context;Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 1

    if-eqz p0, :cond_1

    .line 69
    invoke-static {p0}, Lcom/scandit/base/system/SbSystemUtils;->isDisplayLandscape(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    if-eqz p0, :cond_2

    .line 72
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    .line 73
    invoke-static {p1, p0}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->transformScanAreaSettings(Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanAreaSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    goto :goto_2

    :cond_2
    if-nez p0, :cond_3

    .line 75
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 77
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    .line 76
    invoke-static {p1, p0}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->transformScanAreaSettings(Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanAreaSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    goto :goto_2

    .line 79
    :cond_3
    invoke-static {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->getScanAreaSettingsFromLegacy(ZLandroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object p0

    .line 82
    :goto_2
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->isMatrixScanEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 83
    sget p1, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_IGNORE:I

    iput p1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    .line 84
    sget p1, Lcom/scandit/recognition/BarcodeScannerSettings;->CODE_LOCATION_IGNORE:I

    iput p1, p0, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    :cond_4
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
