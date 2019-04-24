.class public abstract Lcom/scandit/barcodepicker/ScanOverlay;
.super Landroid/widget/RelativeLayout;
.source "ScanOverlay.java"


# static fields
.field public static final CAMERA_SWITCH_ALWAYS:I = 0x2

.field public static final CAMERA_SWITCH_NEVER:I = 0x0

.field public static final CAMERA_SWITCH_ON_TABLET:I = 0x1

.field public static final GUI_STYLE_DEFAULT:I = 0x0

.field public static final GUI_STYLE_LASER:I = 0x1

.field public static final GUI_STYLE_LOCATIONS_ONLY:I = 0x4

.field public static final GUI_STYLE_MATRIX_SCAN:I = 0x3

.field public static final GUI_STYLE_NONE:I = 0x2

.field public static final MATRIX_SCAN_HIGHLIGHTING_STATE_LOCALIZED:I = 0x1

.field public static final MATRIX_SCAN_HIGHLIGHTING_STATE_RECOGNIZED:I = 0x2

.field public static final MATRIX_SCAN_HIGHLIGHTING_STATE_REJECTED:I = 0x3


# instance fields
.field private pinchToZoomEnabled:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 119
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 114
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/ScanOverlay;->pinchToZoomEnabled:Z

    return-void
.end method


# virtual methods
.method public abstract drawViewfinder(Z)V
.end method

.method public abstract setBeepEnabled(Z)V
.end method

.method public abstract setCameraSwitchBackContentDescription(Ljava/lang/String;)V
.end method

.method public abstract setCameraSwitchButtonMarginsAndSize(IIII)V
.end method

.method public abstract setCameraSwitchFrontContentDescription(Ljava/lang/String;)V
.end method

.method public abstract setCameraSwitchImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
.end method

.method public abstract setCameraSwitchVisibility(I)V
.end method

.method public abstract setGuiStyle(I)V
.end method

.method public abstract setMatrixScanHighlightingColor(II)V
.end method

.method public abstract setMissingCameraPermissionInfoText(Ljava/lang/String;)V
.end method

.method public abstract setProperty(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract setTextRecognitionSwitchVisible(Z)V
.end method

.method public abstract setTorchButtonMarginsAndSize(IIII)V
.end method

.method public abstract setTorchEnabled(Z)V
.end method

.method public abstract setTorchOffContentDescription(Ljava/lang/String;)V
.end method

.method public abstract setTorchOffImage(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setTorchOffImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
.end method

.method public abstract setTorchOnContentDescription(Ljava/lang/String;)V
.end method

.method public abstract setTorchOnImage(Landroid/graphics/Bitmap;)V
.end method

.method public abstract setTorchOnImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
.end method

.method public abstract setVibrateEnabled(Z)V
.end method

.method public abstract setViewfinderColor(FFF)V
.end method

.method public abstract setViewfinderDecodedColor(FFF)V
.end method

.method public abstract setViewfinderDimension(FFFF)V
.end method

.method public abstract setViewfinderLandscapeDimension(FF)V
.end method

.method public abstract setViewfinderPortraitDimension(FF)V
.end method
