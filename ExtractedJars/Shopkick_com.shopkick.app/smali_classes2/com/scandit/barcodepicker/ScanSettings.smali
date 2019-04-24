.class public Lcom/scandit/barcodepicker/ScanSettings;
.super Ljava/lang/Object;
.source "ScanSettings.java"


# static fields
.field public static final CAMERA_FACING_BACK:I = 0x0

.field public static final CAMERA_FACING_FRONT:I = 0x1

.field private static final DUPLICATE_FILTER_DEFAULT:I = 0x1f4

.field public static final ORIENTATION_LANDSCAPE:I = 0x0

.field public static final ORIENTATION_PORTRAIT:I = 0x1

.field public static final RECOGNITION_MODE_CODE:I = 0x2

.field public static final RECOGNITION_MODE_CODE_AND_TEXT:I = 0x3

.field public static final RECOGNITION_MODE_TEXT:I = 0x1

.field public static final WORKING_RANGE_LONG:I = 0x2

.field public static final WORKING_RANGE_STANDARD:I = 0x1


# instance fields
.field private mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

.field private mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

.field private mCameraFacingPreference:I

.field private mCodeRejectionEnabled:Z

.field private mDeviceName:Ljava/lang/String;

.field private mEnableRestrictedAreaScanning:Z

.field protected mFocusRange:I

.field private mHighDensityModeEnabled:Z

.field private mLandscapeScanArea:Landroid/graphics/RectF;

.field private mMatrixScanEnabled:Z

.field private mPortraitScanArea:Landroid/graphics/RectF;

.field private mProperties:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mRecognitionMode:I

.field private mScanningHotSpot:Landroid/graphics/PointF;

.field protected mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

.field private mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

.field private mZoomPercentage:F


# direct methods
.method protected constructor <init>()V
    .locals 3

    .line 503
    sget v0, Lcom/scandit/recognition/BarcodeScannerSettings;->PRESET_NONE:I

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/ScanSettings;-><init>(I)V

    .line 504
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object v0

    const-string v1, "remove_leading_zero"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/scandit/recognition/SymbologySettings;->setExtensionEnabled(Ljava/lang/String;Z)V

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 6

    .line 494
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 103
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    .line 104
    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    .line 107
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    const/4 v1, 0x0

    .line 109
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    .line 111
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    .line 116
    new-instance v2, Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3ec00000    # 0.375f

    const/high16 v5, 0x3f200000    # 0.625f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    .line 117
    new-instance v2, Landroid/graphics/RectF;

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3f19999a    # 0.6f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    const/4 v1, 0x0

    .line 119
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    .line 121
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    .line 122
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    .line 127
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 128
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 130
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    const/4 v1, 0x2

    .line 131
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    .line 133
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    .line 495
    invoke-static {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->createWithPreset(I)Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    return-void
.end method

.method protected constructor <init>(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 6

    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 103
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    .line 104
    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    .line 107
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    const/4 v1, 0x0

    .line 109
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    .line 111
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    .line 116
    new-instance v2, Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3ec00000    # 0.375f

    const/high16 v5, 0x3f200000    # 0.625f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    .line 117
    new-instance v2, Landroid/graphics/RectF;

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3f19999a    # 0.6f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    const/4 v1, 0x0

    .line 119
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    .line 121
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    .line 122
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    .line 127
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 128
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 130
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    const/4 v1, 0x2

    .line 131
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    .line 133
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    .line 508
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->clone()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    .line 509
    iget v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    .line 510
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    .line 511
    iget-boolean v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    .line 513
    iget-boolean v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    .line 514
    iget v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    .line 515
    iget v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    .line 516
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    .line 517
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    .line 518
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    .line 519
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    .line 520
    iget-boolean v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    .line 521
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    if-eqz v0, :cond_0

    .line 522
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->clone()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 524
    :cond_0
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    if-eqz v0, :cond_1

    .line 525
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->clone()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 527
    :cond_1
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    if-eqz v0, :cond_2

    .line 528
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;->clone()Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    .line 530
    :cond_2
    iget v0, p1, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    .line 531
    iget-boolean p1, p1, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/ScanSettings;->setMatrixScanEnabled(Z)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 498
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 103
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    .line 104
    new-instance v0, Landroid/graphics/PointF;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    const/4 v0, 0x0

    .line 106
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    .line 107
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    const/4 v1, 0x0

    .line 109
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    .line 111
    iput v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    .line 116
    new-instance v2, Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3ec00000    # 0.375f

    const/high16 v5, 0x3f200000    # 0.625f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    .line 117
    new-instance v2, Landroid/graphics/RectF;

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3f19999a    # 0.6f

    invoke-direct {v2, v1, v4, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    const/4 v1, 0x0

    .line 119
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    .line 121
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    .line 122
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    .line 127
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 128
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    .line 130
    iput-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    const/4 v1, 0x2

    .line 131
    iput v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    .line 133
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    .line 499
    invoke-static {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->createWithJson(Ljava/lang/String;)Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    return-void
.end method

.method public static create()Lcom/scandit/barcodepicker/ScanSettings;
    .locals 2

    .line 540
    new-instance v0, Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/ScanSettings;-><init>()V

    const/16 v1, 0x1f4

    .line 541
    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeDuplicateFilter(I)V

    return-object v0
.end method

.method public static createWithJson(Lorg/json/JSONObject;)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 569
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 570
    new-instance v1, Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;-><init>(Ljava/lang/String;)V

    const-string v0, "recognitionMode"

    const/4 v2, 0x0

    .line 572
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    const-string v0, "recognitionMode"

    const-string v5, "code"

    .line 573
    invoke-static {p0, v0, v5}, Lcom/scandit/base/util/JSONHelpers;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v5, "text"

    .line 574
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setRecognitionMode(I)V

    .line 580
    :cond_1
    invoke-static {p0}, Lcom/scandit/barcodepicker/ScanSettings;->shouldEnableLeadingZeroExtension(Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 581
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object v0

    const-string v5, "remove_leading_zero"

    invoke-virtual {v0, v5, v4}, Lcom/scandit/recognition/SymbologySettings;->setExtensionEnabled(Ljava/lang/String;Z)V

    :cond_2
    const-string v0, "codeDuplicateFilter"

    .line 585
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const/16 v0, 0x1f4

    .line 586
    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeDuplicateFilter(I)V

    :cond_3
    const-string v0, "cameraFacingPreference"

    .line 589
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_0
    const-string v0, "cameraFacingPreference"

    .line 591
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "back"

    .line 592
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 593
    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setCameraFacingPreference(I)V

    goto :goto_1

    :cond_4
    const-string v5, "front"

    .line 594
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 595
    invoke-virtual {v1, v4}, Lcom/scandit/barcodepicker/ScanSettings;->setCameraFacingPreference(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 598
    :catch_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    const-string v0, "\'cameraFacingPreference\' must be a string"

    invoke-direct {p0, v0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    const-string/jumbo v0, "workingRange"

    .line 602
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    :try_start_1
    const-string/jumbo v0, "workingRange"

    .line 604
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v5, "standard"

    .line 605
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 606
    invoke-virtual {v1, v4}, Lcom/scandit/barcodepicker/ScanSettings;->setWorkingRange(I)V

    goto :goto_2

    :cond_6
    const-string v5, "long"

    .line 607
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 608
    invoke-virtual {v1, v3}, Lcom/scandit/barcodepicker/ScanSettings;->setWorkingRange(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 611
    :catch_1
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    const-string v0, "\'workingRange\' must be a string"

    invoke-direct {p0, v0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    :goto_2
    const-string v0, "deviceName"

    .line 615
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    :try_start_2
    const-string v0, "deviceName"

    .line 617
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setDeviceName(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    .line 619
    :catch_2
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    const-string v0, "\'deviceName\' must be a string"

    invoke-direct {p0, v0}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_3
    const-string v0, "relativeZoom"

    .line 623
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "relativeZoom"

    .line 624
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v5

    double-to-float v0, v5

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setRelativeZoom(F)V

    :cond_9
    const-string v0, "highDensityModeEnabled"

    .line 626
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "highDensityModeEnabled"

    .line 627
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setHighDensityModeEnabled(Z)V

    :cond_a
    const-string v0, "codeRejectionEnabled"

    .line 629
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "codeRejectionEnabled"

    .line 630
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeRejectionEnabled(Z)V

    :cond_b
    const-string v0, "restrictedAreaScanningEnabled"

    .line 632
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "restrictedAreaScanningEnabled"

    .line 633
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setRestrictedAreaScanningEnabled(Z)V

    :cond_c
    const-string v0, "scanningHotSpot"

    .line 635
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "scanningHotSpot"

    .line 636
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->getPoint(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/PointF;

    move-result-object v0

    .line 637
    iget v3, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v1, v3, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setScanningHotSpot(FF)V

    :cond_d
    const-string v0, "activeScanningAreaLandscape"

    .line 639
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "activeScanningAreaLandscape"

    .line 641
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v0

    .line 640
    invoke-virtual {v1, v2, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setActiveScanningArea(ILandroid/graphics/RectF;)V

    :cond_e
    const-string v0, "areaSettingsPortrait"

    .line 643
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 645
    invoke-static {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->createWithJson(Lorg/json/JSONObject;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setAreaSettingsPortrait(Lcom/scandit/barcodepicker/ScanAreaSettings;)V

    :cond_f
    const-string v0, "areaSettingsLandscape"

    .line 647
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 649
    invoke-static {v0}, Lcom/scandit/barcodepicker/ScanAreaSettings;->createWithJson(Lorg/json/JSONObject;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setAreaSettingsLandscape(Lcom/scandit/barcodepicker/ScanAreaSettings;)V

    :cond_10
    const-string v0, "activeScanningAreaPortrait"

    .line 651
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "activeScanningAreaPortrait"

    .line 653
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;

    move-result-object v0

    .line 652
    invoke-virtual {v1, v4, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setActiveScanningArea(ILandroid/graphics/RectF;)V

    :cond_11
    const-string/jumbo v0, "textRecognition"

    .line 655
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 656
    new-instance v0, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    const-string/jumbo v3, "textRecognition"

    .line 657
    invoke-static {p0, v3}, Lcom/scandit/base/util/JSONHelpers;->getObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;-><init>(Lorg/json/JSONObject;)V

    .line 658
    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->setTextRecognitionSettings(Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;)V

    :cond_12
    const-string v0, "matrixScanEnabled"

    .line 661
    invoke-static {p0, v0, v2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "matrixScanEnabled"

    .line 662
    invoke-static {p0, v0}, Lcom/scandit/base/util/JSONHelpers;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    invoke-virtual {v1, p0}, Lcom/scandit/barcodepicker/ScanSettings;->setMatrixScanEnabled(Z)V

    :cond_13
    return-object v1
.end method

.method public static createWithPreset(I)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 1

    .line 547
    new-instance v0, Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {v0, p0}, Lcom/scandit/barcodepicker/ScanSettings;-><init>(I)V

    const/16 p0, 0x1f4

    .line 548
    invoke-virtual {v0, p0}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeDuplicateFilter(I)V

    return-object v0
.end method

.method private static shouldEnableLeadingZeroExtension(Lorg/json/JSONObject;)Z
    .locals 6

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string/jumbo v1, "symbologies"

    .line 555
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string/jumbo v1, "upca"

    const-string v2, "UPCA"

    const-string/jumbo v3, "upc12"

    const-string v4, "UPC12"

    .line 559
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    .line 560
    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    .line 561
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const-string p0, "extensions"

    .line 563
    invoke-virtual {v5, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    move v0, v3

    :goto_1
    return v0

    :cond_4
    return v0
.end method


# virtual methods
.method public clone()Lcom/scandit/barcodepicker/ScanSettings;
    .locals 1

    .line 898
    new-instance v0, Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {v0, p0}, Lcom/scandit/barcodepicker/ScanSettings;-><init>(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 34
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ScanSettings;->clone()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    return-object v0
.end method

.method public getActiveScanningArea(I)Landroid/graphics/RectF;
    .locals 2

    .line 434
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    if-nez v0, :cond_0

    .line 435
    new-instance p1, Landroid/graphics/RectF;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 438
    iget-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    return-object p1

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 441
    iget-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 1

    .line 948
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    return-object v0
.end method

.method public getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;
    .locals 1

    .line 936
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    return-object v0
.end method

.method public getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;
    .locals 1

    .line 867
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    return-object v0
.end method

.method public getCameraFacingPreference()I
    .locals 1

    .line 786
    iget v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    return v0
.end method

.method public getCodeCachingDuration()I
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeCachingDuration()I

    move-result v0

    return v0
.end method

.method public getCodeDuplicateFilter()I
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->getCodeDuplicateFilter()I

    move-result v0

    return v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 462
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxNumberOfCodesPerFrame()I
    .locals 1

    .line 887
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->getMaxNumberOfCodesPerFrame()I

    move-result v0

    return v0
.end method

.method public getProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 892
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)I
    .locals 1

    .line 688
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getProperty(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getRecognitionMode()I
    .locals 1

    .line 998
    iget v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    return v0
.end method

.method public getRelativeZoom()F
    .locals 1

    .line 863
    iget v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    return v0
.end method

.method public getScanningHotSpot()Landroid/graphics/PointF;
    .locals 1

    .line 846
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    return-object v0
.end method

.method public getScanningHotSpotHeight()F
    .locals 1

    .line 372
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    return v0
.end method

.method public getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;
    .locals 1

    .line 677
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object p1

    return-object p1
.end method

.method public getTextRecognitionSettings()Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;
    .locals 1

    .line 979
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    return-object v0
.end method

.method public getWorkingRange()I
    .locals 1

    .line 201
    iget v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    return v0
.end method

.method public isCodeRejectionEnabled()Z
    .locals 1

    .line 912
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    return v0
.end method

.method public isForce2dRecognitionEnabled()Z
    .locals 2

    .line 270
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    const-string v1, "force_2d_recognition"

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getProperty(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isHighDensityModeEnabled()Z
    .locals 1

    .line 314
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    return v0
.end method

.method public isMatrixScanEnabled()Z
    .locals 1

    .line 1041
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    return v0
.end method

.method public isMicroDataMatrixEnabled()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 166
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DATA_MATRIX:I

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object v0

    const-string/jumbo v1, "tiny"

    .line 167
    invoke-virtual {v0, v1}, Lcom/scandit/recognition/SymbologySettings;->isExtensionEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isRestrictedAreaScanningEnabled()Z
    .locals 1

    .line 337
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    return v0
.end method

.method public isSymbologyEnabled(I)Z
    .locals 1

    .line 776
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/SymbologySettings;->isEnabled()Z

    move-result p1

    return p1
.end method

.method public setActiveScanningArea(ILandroid/graphics/RectF;)V
    .locals 3

    .line 401
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->left:F

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_3

    iget v0, p2, Landroid/graphics/RectF;->right:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 411
    iget-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    invoke-virtual {v1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 412
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    :cond_1
    if-ne p1, v0, :cond_2

    .line 415
    iget-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 416
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    :cond_2
    return-void

    :cond_3
    :goto_0
    const-string p1, "ScanditSDK"

    const-string p2, "calling setActiveScanningArea with an invalid rectangle."

    .line 406
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setAreaSettingsLandscape(Lcom/scandit/barcodepicker/ScanAreaSettings;)V
    .locals 0

    .line 958
    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsLandscape:Lcom/scandit/barcodepicker/ScanAreaSettings;

    return-void
.end method

.method public setAreaSettingsPortrait(Lcom/scandit/barcodepicker/ScanAreaSettings;)V
    .locals 0

    .line 968
    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mAreaSettingsPortrait:Lcom/scandit/barcodepicker/ScanAreaSettings;

    return-void
.end method

.method public setCameraFacingPreference(I)V
    .locals 0

    .line 804
    iput p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCameraFacingPreference:I

    return-void
.end method

.method public setCodeCachingDuration(I)V
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeCachingDuration(I)V

    return-void
.end method

.method public setCodeDuplicateFilter(I)V
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeDuplicateFilter(I)V

    return-void
.end method

.method public setCodeRejectionEnabled(Z)V
    .locals 0

    .line 922
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mCodeRejectionEnabled:Z

    return-void
.end method

.method public setDeviceName(Ljava/lang/String;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mDeviceName:Ljava/lang/String;

    return-void
.end method

.method public setForce2dRecognitionEnabled(Z)V
    .locals 2

    .line 288
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    const-string v1, "force_2d_recognition"

    invoke-virtual {v0, v1, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setProperty(Ljava/lang/String;I)V

    return-void
.end method

.method public setHighDensityModeEnabled(Z)V
    .locals 0

    .line 306
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mHighDensityModeEnabled:Z

    return-void
.end method

.method public setMatrixScanEnabled(Z)V
    .locals 1

    .line 1031
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mMatrixScanEnabled:Z

    const-string v0, "check_default_location"

    xor-int/lit8 p1, p1, 0x1

    .line 1032
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/ScanSettings;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setMaxNumberOfCodesPerFrame(I)V
    .locals 1

    .line 878
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setMaxNumberOfCodesPerFrame(I)V

    return-void
.end method

.method public setMicroDataMatrixEnabled(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 154
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DATA_MATRIX:I

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object v0

    const-string/jumbo v1, "tiny"

    .line 155
    invoke-virtual {v0, v1, p1}, Lcom/scandit/recognition/SymbologySettings;->setExtensionEnabled(Ljava/lang/String;Z)V

    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 704
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "blurryRecognition"

    .line 706
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "blurry_enabled"

    :cond_0
    const-string/jumbo v0, "sharpRecognition"

    .line 709
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo p1, "sharp_enabled"

    :cond_1
    const-string v0, "checkDefaultLocation"

    .line 712
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "check_default_location"

    :cond_2
    const-string v0, "glareCompensation"

    .line 715
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "glare_compensation_enabled"

    :cond_3
    const-string v0, "highQualityGradients"

    .line 718
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "high_quality_localization_gradients"

    :cond_4
    const-string v0, "code39FullAsciiMode"

    .line 721
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 722
    instance-of p1, p2, Ljava/lang/Boolean;

    if-eqz p1, :cond_5

    .line 723
    sget p1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE39:I

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object p1

    const-string v0, "full_ascii"

    .line 724
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, v0, p2}, Lcom/scandit/recognition/SymbologySettings;->setExtensionEnabled(Ljava/lang/String;Z)V

    :cond_5
    return-void

    :cond_6
    const-string v0, "location_highlighting_only"

    .line 728
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    .line 729
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 730
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ScanSettings;->getMaxNumberOfCodesPerFrame()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_7

    .line 731
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setMaxNumberOfCodesPerFrame(I)V

    .line 734
    :cond_7
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 735
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->setProperty(Ljava/lang/String;I)V

    goto :goto_0

    .line 736
    :cond_8
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_9

    .line 737
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->setProperty(Ljava/lang/String;I)V

    goto :goto_0

    .line 738
    :cond_9
    instance-of v0, p2, Ljava/lang/Short;

    if-eqz v0, :cond_a

    .line 739
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    check-cast p2, Ljava/lang/Short;

    invoke-virtual {p2}, Ljava/lang/Short;->shortValue()S

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->setProperty(Ljava/lang/String;I)V

    goto :goto_0

    .line 740
    :cond_a
    instance-of v0, p2, Ljava/lang/Byte;

    if-eqz v0, :cond_b

    .line 741
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    check-cast p2, Ljava/lang/Byte;

    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->setProperty(Ljava/lang/String;I)V

    :cond_b
    :goto_0
    return-void
.end method

.method public setRecognitionMode(I)V
    .locals 0

    .line 1012
    iput p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mRecognitionMode:I

    return-void
.end method

.method public setRelativeZoom(F)V
    .locals 0

    .line 856
    iput p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mZoomPercentage:F

    return-void
.end method

.method public setRestrictedAreaScanningEnabled(Z)V
    .locals 0

    .line 330
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    return-void
.end method

.method public setScanningHotSpot(FF)V
    .locals 5

    .line 832
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 833
    iget-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    .line 834
    iget-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    sub-float v2, p2, p1

    add-float/2addr p1, p2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 836
    iget-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float/2addr p1, v0

    .line 837
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    sub-float v1, p2, p1

    add-float/2addr p2, p1

    invoke-virtual {v0, v4, v1, v3, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public setScanningHotSpotHeight(F)V
    .locals 5

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    .line 361
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mPortraitScanArea:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p1

    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v1, v3, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 363
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mLandscapeScanArea:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p1

    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mScanningHotSpot:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, p1

    invoke-virtual {v0, v4, v1, v3, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public setSymbologyEnabled(IZ)V
    .locals 1

    .line 767
    iget-object v0, p0, Lcom/scandit/barcodepicker/ScanSettings;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    invoke-virtual {v0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->enableSymbology(IZ)V

    return-void
.end method

.method public setTextRecognitionSettings(Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;)V
    .locals 0

    .line 987
    iput-object p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mTextRecognitionSettings:Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    return-void
.end method

.method public setWorkingRange(I)V
    .locals 0

    .line 193
    iput p1, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    return-void
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 474
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 475
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 476
    sget-object v2, Lcom/scandit/recognition/Barcode;->ALL_SYMBOLOGIES:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget v5, v2, v4

    .line 477
    invoke-virtual {p0, v5}, Lcom/scandit/barcodepicker/ScanSettings;->isSymbologyEnabled(I)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 478
    invoke-static {v5}, Lcom/scandit/recognition/Barcode;->symbologyToString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const-string v2, "enabledSymbologies"

    .line 481
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "workingRange"

    .line 482
    iget v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mFocusRange:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "microDataMatrixEnabled"

    .line 483
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ScanSettings;->isMicroDataMatrixEnabled()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "2dRecognitionForced"

    .line 484
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/ScanSettings;->isForce2dRecognitionEnabled()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "restrictedAreaScanning"

    .line 485
    iget-boolean v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mEnableRestrictedAreaScanning:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 486
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 487
    iget-object v2, p0, Lcom/scandit/barcodepicker/ScanSettings;->mProperties:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 488
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_2
    const-string v2, "properties"

    .line 490
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method
