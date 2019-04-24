.class public Lcom/scandit/barcodepicker/BarcodePickerExternalActivity;
.super Lcom/scandit/barcodepicker/BarcodePickerActivity;
.source "BarcodePickerExternalActivity.java"


# static fields
.field public static final EXTRA_SECONDARY_APP_KEY:Ljava/lang/String; = "secondaryAppKey"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/scandit/barcodepicker/BarcodePickerActivity;-><init>()V

    return-void
.end method

.method private verifySecondaryAppKey(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/String;)Z
    .locals 5

    .line 49
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerExternalActivity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 51
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 52
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getHandle()J

    move-result-wide v3

    .line 52
    invoke-static {p2, v0, v2, v3, v4}, Lcom/scandit/recognition/Native;->sc_verify_license_key_and_restrict_settings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)I

    move-result p1

    .line 55
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method


# virtual methods
.method initializeAndStartBarcodeScanning(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 2

    .line 64
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerExternalActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "secondaryAppKey"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/BarcodePickerExternalActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "secondaryAppKey"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/BarcodePickerExternalActivity;->verifySecondaryAppKey(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->initializeAndStartBarcodeScanning(Lcom/scandit/barcodepicker/ScanSettings;)V

    :cond_0
    return-void
.end method

.method protected settingsFromIntent(Landroid/content/Intent;)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 0

    .line 44
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/BarcodePickerActivity;->settingsFromIntent(Landroid/content/Intent;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p1

    return-object p1
.end method
