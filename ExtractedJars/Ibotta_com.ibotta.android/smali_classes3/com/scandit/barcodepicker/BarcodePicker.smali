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

    .line 34
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/BarcodePicker;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-static {}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->create()Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;

    move-result-object p2

    .line 54
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->setSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 55
    new-instance v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {v0, p1, p2, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    invoke-static {}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->create()Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;

    move-result-object p2

    .line 61
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->setSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 62
    new-instance p3, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p3, p1, p2, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V

    iput-object p3, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-static {}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->create()Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;

    move-result-object v0

    .line 47
    invoke-virtual {v0, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->setSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 48
    new-instance p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p2, p1, v0, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    return-void
.end method

.method public static canRunPortraitPicker()Z
    .locals 2

    .line 293
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-P1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-P1010"

    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5360"

    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5830"

    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S5830i"

    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-S6102"

    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "YP-G70"

    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "MT27i"

    .line 300
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

    .line 74
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V

    return-void
.end method

.method public applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V

    return-void
.end method

.method public convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public createParserForFormat(I)Lcom/scandit/parser/Parser;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->createParserForFormat(I)Lcom/scandit/parser/Parser;

    move-result-object p1

    return-object p1
.end method

.method public getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object v0

    return-object v0
.end method

.method public pauseScanning()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->pauseScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public pauseScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->pauseScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeScanning()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->resumeScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->resumeScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setAutoFocusOnTapEnabled(Z)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setAutoFocusOnTapEnabled(Z)V

    return-void
.end method

.method public setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V

    return-void
.end method

.method public setPinchToZoomEnabled(Z)V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setPinchToZoomEnabled(Z)V

    return-void
.end method

.method public setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V

    return-void
.end method

.method public setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V

    return-void
.end method

.method public setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V

    return-void
.end method

.method public startScanning()V
    .locals 3

    .line 221
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public startScanning(Z)V
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public startScanning(ZLjava/lang/Runnable;)V
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method

.method public stopScanning()V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->stopScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->stopScanning(Ljava/lang/Runnable;)V

    return-void
.end method

.method public switchTorchOn(Z)V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePicker;->picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;->switchTorchOn(Z)V

    return-void
.end method
