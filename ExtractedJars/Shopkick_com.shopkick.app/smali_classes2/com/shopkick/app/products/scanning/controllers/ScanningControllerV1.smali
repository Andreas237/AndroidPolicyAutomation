.class public Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;
.super Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;
.source "ScanningControllerV1.java"

# interfaces
.implements Lcom/scandit/barcodepicker/ProcessFrameListener;
.implements Lcom/scandit/barcodepicker/OnScanListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;
    }
.end annotation


# static fields
.field private static final sScanditSdkAppKey:Ljava/lang/String; = "kJy6LKqpEeGcdy5tA28SepCdUJqqqRHhkT6PG+x1VcU"


# instance fields
.field private isBCScanning:Z

.field private mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 0

    .line 40
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->isBCScanning:Z

    return-void
.end method

.method private configureSettings()Lcom/scandit/barcodepicker/ScanSettings;
    .locals 3

    .line 141
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    .line 144
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 145
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCE:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 146
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE39:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 147
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE93:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 148
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE128:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 149
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DATA_MATRIX:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 150
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN8:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 151
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN13:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 152
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_QR:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 153
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_PDF417:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 154
    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_INTERLEAVED_2_OF_5:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    const v1, 0x3d4ccccd    # 0.05f

    .line 155
    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setScanningHotSpotHeight(F)V

    .line 156
    iget v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanningHotSpotX:F

    iget v2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanningHotSpotY:F

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setScanningHotSpot(FF)V

    return-object v0
.end method


# virtual methods
.method public didProcess([BIILcom/scandit/barcodepicker/ScanSession;)V
    .locals 2

    .line 173
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrame:[B

    .line 174
    iput p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameWidth:I

    .line 175
    iput p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameHeight:I

    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->bcLastFrameTime:J

    .line 180
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->areWeDoingIR()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 181
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->processFrameIR([BII)V

    :cond_0
    return-void
.end method

.method public didScan(Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 4

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrame:[B

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->areWeDoingIR()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanBCListener:Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;

    if-eqz v0, :cond_2

    .line 193
    invoke-interface {p1}, Lcom/scandit/barcodepicker/ScanSession;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object v0

    .line 194
    invoke-interface {p1}, Lcom/scandit/barcodepicker/ScanSession;->pauseScanning()V

    .line 195
    invoke-interface {p1}, Lcom/scandit/barcodepicker/ScanSession;->clear()V

    const/4 p1, 0x0

    .line 197
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/scandit/recognition/Barcode;

    invoke-virtual {p1}, Lcom/scandit/recognition/Barcode;->getData()Ljava/lang/String;

    move-result-object p1

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendScanImage:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrame:[B

    iget v2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameWidth:I

    iget v3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameHeight:I

    invoke-static {v0, v2, v3}, Lcom/shopkick/app/util/TileUtils;->compressImage([BII)[B

    move-result-object v0

    .line 205
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrame:[B

    .line 209
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mainHandler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$1;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;Ljava/lang/String;[B)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    const/16 p1, 0x401

    .line 216
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    :goto_1
    return-void

    :cond_3
    :goto_2
    return-void
.end method

.method public initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 3

    .line 102
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V

    const-string p2, "kJy6LKqpEeGcdy5tA28SepCdUJqqqRHhkT6PG+x1VcU"

    .line 105
    invoke-static {p2}, Lcom/scandit/barcodepicker/ScanditLicense;->setAppKey(Ljava/lang/String;)V

    .line 108
    new-instance p2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->configureSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    invoke-direct {p2, p0, p1, p0, p3}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;Landroid/content/Context;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;Lcom/scandit/barcodepicker/ScanSettings;)V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V

    .line 111
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->setPinchToZoomEnabled(Z)V

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object p1

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    .line 119
    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setGuiStyle(I)V

    const v0, 0x3f6e147b    # 0.93f

    const v1, 0x3edc28f6    # 0.43f

    const/4 v2, 0x0

    .line 120
    invoke-virtual {p1, v0, v1, v2, v2}, Lcom/scandit/barcodepicker/ScanOverlay;->setViewfinderDimension(FFFF)V

    .line 121
    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/ScanOverlay;->setBeepEnabled(Z)V

    .line 122
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/ScanOverlay;->setVibrateEnabled(Z)V

    .line 123
    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/ScanOverlay;->setTorchEnabled(Z)V

    .line 124
    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/ScanOverlay;->setBeepEnabled(Z)V

    .line 125
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/ScanOverlay;->setVibrateEnabled(Z)V

    .line 130
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {p1, p3, p3, p3, p3}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->setPadding(IIII)V

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->parentView:Landroid/view/ViewGroup;

    iget-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {p1, p3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_1

    .line 45
    iget-boolean v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->isBCScanning:Z

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->stopScanning()V

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->parentView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->parentView:Landroid/view/ViewGroup;

    .line 50
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    .line 52
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    .line 53
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanBCListener:Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;

    .line 54
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanIRListener:Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;

    .line 56
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrame:[B

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameHeight:I

    .line 58
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->lastUpdatedFrameWidth:I

    .line 60
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDestroy()V

    return-void
.end method

.method public pauseBCScanning()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->pauseScanning()V

    :cond_0
    return-void
.end method

.method public resumeBCScanning()V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->resumeScanning()V

    :cond_0
    return-void
.end method

.method public startBCScanning()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->startScanning()V

    :cond_0
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->isBCScanning:Z

    return-void
.end method

.method public startIRScanning()V
    .locals 2

    .line 93
    invoke-super {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->startIRScanning()V

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanOverlay;->setVibrateEnabled(Z)V

    :cond_0
    return-void
.end method

.method public stopBCScanning()V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->stopScanning()V

    :cond_0
    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->isBCScanning:Z

    return-void
.end method

.method public switchTorchOn(Z)V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mBarcodePickerLayout:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->switchTorchOn(Z)V

    .line 136
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->logTorchButtonTapped()V

    return-void
.end method
