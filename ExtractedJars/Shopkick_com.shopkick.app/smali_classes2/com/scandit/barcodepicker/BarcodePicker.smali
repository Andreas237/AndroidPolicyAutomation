.class public Lcom/scandit/barcodepicker/BarcodePicker;
.super Landroid/widget/RelativeLayout;
.source "BarcodePicker.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;


# instance fields
.field picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/BarcodePicker;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-static {}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->create()Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;

    move-result-object v0

    .line 46
    invoke-virtual {v0, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->setSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 47
    new-instance p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p2, p1, v0, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    return-void
.end method

.method public static canRunPortraitPicker()Z
    .locals 2

    .line 272
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-P1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-P1010"

    .line 273
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5360"

    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5830"

    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5830i"

    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S6102"

    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "YP-G70"

    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "MT27i"

    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V

    return-void
.end method

.method public applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V

    return-void
.end method

.method public convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object v0

    return-object v0
.end method

.method public pauseScanning()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->pauseScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public pauseScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->pauseScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeScanning()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->resumeScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->resumeScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setAutoFocusOnTapEnabled(Z)V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setAutoFocusOnTapEnabled(Z)V

    return-void
.end method

.method public setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V

    return-void
.end method

.method public setPinchToZoomEnabled(Z)V
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setPinchToZoomEnabled(Z)V

    return-void
.end method

.method public setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V

    return-void
.end method

.method public setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V

    return-void
.end method

.method public setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V

    return-void
.end method

.method public startScanning()V
    .locals 3

    .line 201
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public startScanning(Z)V
    .locals 2

    .line 212
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public startScanning(ZLjava/lang/Runnable;)V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public stopScanning()V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->stopScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->stopScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public switchTorchOn(Z)V
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->switchTorchOn(Z)V

    return-void
.end method
