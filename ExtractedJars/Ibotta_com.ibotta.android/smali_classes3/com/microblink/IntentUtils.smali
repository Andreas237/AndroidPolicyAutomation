.class public final Lcom/microblink/IntentUtils;
.super Ljava/lang/Object;


# static fields
.field public static final BOTTOM_SCANNED_HINT_EXTRA:Ljava/lang/String; = "bottomScannedHintExtra"

.field public static final BOTTOM_SCANNING_HINT_EXTRA:Ljava/lang/String; = "bottomHintExtra"

.field public static final BUNDLE_EXTRA:Ljava/lang/String; = "bundleExtra"

.field public static final CAMERA_RECOGNIZER_CALLBACK_EXTRA:Ljava/lang/String; = "cameraRecognizerCallbackExtra"

.field public static final DATA_EXTRA:Ljava/lang/String; = "dataExtra"

.field public static final ENABLE_ENHANCED_AUTO_FOCUS_EXTRA:Ljava/lang/String; = "enhancedAutoFocusExtra"

.field public static final ENABLE_ORIENTATION_CHANGE:Ljava/lang/String; = "enableOrientationChangeExtra"

.field public static final FINISH_SCANNED_EXTRA:Ljava/lang/String; = "finishScannedExtra"

.field public static final FULL_SCREEN_EXTRA:Ljava/lang/String; = "fullScreenExtra"

.field public static final KEEP_SCREEN_ON_EXTRA:Ljava/lang/String; = "keepScreenOnExtra"

.field public static final LICENSE_KEY_EXTRA:Ljava/lang/String; = "licenseKeyExtra"

.field public static final MEDIA_EXTRA:Ljava/lang/String; = "mediaExtra"

.field public static final MOVE_CLOSER_MESSAGE:Ljava/lang/String; = "moveCloserMessage"

.field public static final SCANNED_CANCEL_EXTRA:Ljava/lang/String; = "scannedCancelExtra"

.field public static final SCANNING_CANCEL_EXTRA:Ljava/lang/String; = "scanningCancelExtra"

.field public static final SCAN_OPTIONS_EXTRA:Ljava/lang/String; = "scanOptionsExtra"

.field public static final TOP_SCANNED_HINT_EXTRA:Ljava/lang/String; = "topScannedHintExtra"

.field public static final TOP_SCANNING_HINT_EXTRA:Ljava/lang/String; = "topScanningHintExtra"

.field public static final VIEW_PORT_EXTRA:Ljava/lang/String; = "viewPortExtra"


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/InstantiationError;

    const-string v1, "IntentUtils constructor can\'t be called!"

    invoke-direct {v0, v1}, Ljava/lang/InstantiationError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static cameraScan(Landroid/content/Context;Lcom/microblink/ScanOptions;)Landroid/content/Intent;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "scanOptionsExtra"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/microblink/CameraScanActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "bundleExtra"

    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
