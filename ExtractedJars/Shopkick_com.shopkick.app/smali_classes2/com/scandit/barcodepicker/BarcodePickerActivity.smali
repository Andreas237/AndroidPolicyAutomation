.class public Lcom/scandit/barcodepicker/BarcodePickerActivity;
.super Landroid/app/Activity;
.source "BarcodePickerActivity.java"

# interfaces
.implements Lcom/scandit/barcodepicker/OnScanListener;


# static fields
.field public static final EXTRA_APP_KEY:Ljava/lang/String; = "appKey"

.field public static final EXTRA_CAMERA_FACING_PREFERENCE:Ljava/lang/String; = "cameraFacingPreference"

.field public static final EXTRA_CAMERA_SWITCH_VISIBILITY:Ljava/lang/String; = "cameraSwitchVisibility"

.field public static final EXTRA_ENABLED_SYMBOLOGIES:Ljava/lang/String; = "enabledSymbologies"

.field public static final EXTRA_GUI_STYLE:Ljava/lang/String; = "guiStyle"

.field public static final EXTRA_RESTRICT_SCANNING_AREA:Ljava/lang/String; = "restrictScanningArea"

.field public static final EXTRA_SCANNING_AREA_HEIGHT:Ljava/lang/String; = "scanningAreaHeight"

.field public static final EXTRA_SHOW_TORCH_BUTTON:Ljava/lang/String; = "showTorchButton"


# instance fields
.field private final CAMERA_PERMISSION_REQUEST:I

.field private mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

.field private mCameraAccessDenied:Z

.field private mPaused:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x5

    .line 120
    iput v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->CAMERA_PERMISSION_REQUEST:I

    const/4 v0, 0x0

    .line 121
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mCameraAccessDenied:Z

    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mPaused:Z

    return-void
.end method

.method private grantCameraPermissionsThenStartScanning()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    const-string v0, "android.permission.CAMERA"

    .line 219
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mCameraAccessDenied:Z

    if-nez v0, :cond_1

    const-string v0, "android.permission.CAMERA"

    .line 224
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 230
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->startScanning()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected buildCancelResult(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "barcodeRecognized"

    const/4 v1, 0x0

    .line 319
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-void
.end method

.method protected buildSuccessResult(Landroid/content/Intent;Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 2

    .line 294
    invoke-interface {p2}, Lcom/scandit/barcodepicker/ScanSession;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/scandit/recognition/Barcode;

    const-string v0, "barcodeRecognized"

    const/4 v1, 0x1

    .line 295
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "barcodeRawData"

    .line 296
    invoke-virtual {p2}, Lcom/scandit/recognition/Barcode;->getRawData()[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    const-string v0, "barcodeData"

    .line 297
    invoke-virtual {p2}, Lcom/scandit/recognition/Barcode;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "barcodeSymbologyName"

    .line 298
    invoke-virtual {p2}, Lcom/scandit/recognition/Barcode;->getSymbologyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "barcodeSymbology"

    .line 299
    invoke-virtual {p2}, Lcom/scandit/recognition/Barcode;->getSymbology()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method

.method public didScan(Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 2

    .line 277
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 278
    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->buildSuccessResult(Landroid/content/Intent;Lcom/scandit/barcodepicker/ScanSession;)V

    const/4 v1, -0x1

    .line 279
    invoke-virtual {p0, v1, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->setResult(ILandroid/content/Intent;)V

    .line 280
    invoke-interface {p1}, Lcom/scandit/barcodepicker/ScanSession;->pauseScanning()V

    .line 281
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->finish()V

    return-void
.end method

.method initializeAndStartBarcodeScanning(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 2

    .line 254
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    const/4 v0, 0x1

    .line 256
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->requestWindowFeature(I)Z

    .line 260
    invoke-static {}, Lcom/scandit/barcodepicker/BarcodePicker;->canRunPortraitPicker()Z

    move-result v1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 262
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->setRequestedOrientation(I)V

    .line 264
    :cond_0
    new-instance v0, Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-direct {v0, p0, p1}, Lcom/scandit/barcodepicker/BarcodePicker;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    .line 268
    iget-object p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p1, p0}, Lcom/scandit/barcodepicker/BarcodePicker;->setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V

    .line 269
    iget-object p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->setupScanUIFromIntent(Lcom/scandit/barcodepicker/BarcodePicker;Landroid/content/Intent;)V

    .line 272
    iget-object p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 304
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->stopScanning()V

    .line 305
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 306
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->buildCancelResult(Landroid/content/Intent;)V

    const/4 v1, 0x0

    .line 307
    invoke-virtual {p0, v1, v0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->setResult(ILandroid/content/Intent;)V

    .line 308
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 127
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 129
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 131
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "appKey"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "appKey"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/scandit/barcodepicker/ScanditLicense;->setAppKey(Ljava/lang/String;)V

    .line 137
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->settingsFromIntent(Landroid/content/Intent;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->initializeAndStartBarcodeScanning(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 208
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x1

    .line 209
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mPaused:Z

    .line 212
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->stopScanning()V

    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 172
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/4 p2, 0x5

    if-ne p1, p2, :cond_2

    .line 174
    array-length p1, p3

    if-lez p1, :cond_0

    const/4 p1, 0x0

    aget p2, p3, p1

    if-nez p2, :cond_0

    .line 176
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mCameraAccessDenied:Z

    .line 177
    iget-boolean p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mPaused:Z

    if-nez p1, :cond_1

    .line 180
    iget-object p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/BarcodePicker;->startScanning()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 184
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mCameraAccessDenied:Z

    :cond_1
    :goto_0
    return-void

    :cond_2
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 236
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x0

    .line 237
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mPaused:Z

    .line 238
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    if-eqz v0, :cond_1

    .line 240
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 241
    invoke-direct {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->grantCameraPermissionsThenStartScanning()V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/BarcodePickerActivity;->mBarcodePicker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->startScanning()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected settingsFromIntent(Landroid/content/Intent;)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 7

    .line 150
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    const-string v1, "enabledSymbologies"

    .line 151
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "enabledSymbologies"

    .line 152
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v1

    if-eqz v1, :cond_0

    .line 154
    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v1, v4

    const/4 v6, 0x1

    .line 155
    invoke-virtual {v0, v5, v6}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "cameraFacingPreference"

    .line 159
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setCameraFacingPreference(I)V

    const-string v1, "restrictScanningArea"

    .line 161
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setRestrictedAreaScanningEnabled(Z)V

    const-string v1, "scanningAreaHeight"

    .line 163
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "scanningAreaHeight"

    const v2, 0x3dcccccd    # 0.1f

    .line 164
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ScanSettings;->setScanningHotSpotHeight(F)V

    :cond_1
    return-object v0
.end method

.method protected setupScanUIFromIntent(Lcom/scandit/barcodepicker/BarcodePicker;Landroid/content/Intent;)V
    .locals 2

    .line 199
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/BarcodePicker;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object p1

    const-string/jumbo v0, "showTorchButton"

    const/4 v1, 0x0

    .line 200
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setTorchEnabled(Z)V

    const-string v0, "cameraSwitchVisibility"

    .line 201
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setCameraSwitchVisibility(I)V

    const-string v0, "guiStyle"

    .line 203
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/ScanOverlay;->setGuiStyle(I)V

    return-void
.end method
