.class public final Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;
.super Ljava/lang/Object;
.source "BarcodePickerInternalSettings.java"


# instance fields
.field mCameraListener:Lcom/scandit/base/camera/SbCameraListener;

.field mScanOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

.field mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    .line 16
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mCameraListener:Lcom/scandit/base/camera/SbCameraListener;

    .line 18
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    return-void
.end method

.method public static create()Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;
    .locals 1

    .line 21
    new-instance v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    return-object v0
.end method

.method public setCameraListener(Lcom/scandit/base/camera/SbCameraListener;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mCameraListener:Lcom/scandit/base/camera/SbCameraListener;

    return-void
.end method

.method public setScanOverlay(Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    return-void
.end method

.method public setSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    return-void
.end method
