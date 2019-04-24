.class public Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;
.super Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;
.source "ScanningControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;,
        Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;,
        Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;
    }
.end annotation


# static fields
.field public static final PREVIEW_HEIGHT_PX:I = 0x2d0

.field public static final PREVIEW_WIDTH_PX:I = 0x500


# instance fields
.field private FOCUS_AREA_SIZE:F

.field private final LOG_TAG:Ljava/lang/String;

.field private PREVIEW_FPS:F

.field private cameraSource:Lcom/google/android/gms/vision/CameraSource;

.field private isInitialized:Z

.field private onFocusing:Z

.field private onProcessing:Z

.field private preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

.field private skDetector:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 0

    .line 60
    invoke-direct/range {p0 .. p5}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V

    const-string p1, "ScanningControllerV2"

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->LOG_TAG:Ljava/lang/String;

    const/high16 p1, 0x41700000    # 15.0f

    .line 44
    iput p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->PREVIEW_FPS:F

    const p1, 0x3dcccccd    # 0.1f

    .line 45
    iput p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->FOCUS_AREA_SIZE:F

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;II)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->tryFocusOnHotSpot(II)V

    return-void
.end method

.method static synthetic access$202(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->isInitialized:Z

    return p1
.end method

.method static synthetic access$302(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onFocusing:Z

    return p1
.end method

.method static synthetic access$500(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onProcessing:Z

    return p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onProcessing:Z

    return p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->skDetector:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    return-object p0
.end method

.method private calculateFocusArea(II)Landroid/graphics/Rect;
    .locals 5

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->getWidth()I

    move-result v0

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    invoke-virtual {v1}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->getHeight()I

    move-result v1

    const/4 v2, 0x2

    .line 188
    new-array v2, v2, [I

    .line 189
    iget-object v3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    .line 191
    aget v3, v2, v3

    add-int/2addr p1, v3

    const/4 v3, 0x1

    .line 192
    aget v2, v2, v3

    add-int/2addr p2, v2

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    int-to-float p2, p2

    int-to-float v0, v1

    div-float/2addr p2, v0

    const/high16 v0, 0x44fa0000    # 2000.0f

    mul-float/2addr p1, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    sub-float/2addr p1, v1

    .line 197
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-float/2addr p2, v0

    sub-float/2addr p2, v1

    .line 198
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 199
    iget v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->FOCUS_AREA_SIZE:F

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 203
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->getCameraInfo()Landroid/hardware/Camera$CameraInfo;

    move-result-object v1

    .line 204
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    const/16 v2, 0x10e

    if-ne v1, v2, :cond_0

    neg-int p2, p2

    goto :goto_0

    :cond_0
    neg-int p1, p1

    .line 208
    :goto_0
    new-instance v1, Landroid/graphics/Rect;

    sub-int v2, p2, v0

    const/16 v3, -0x3e8

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v4, p1, v0

    .line 209
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr p2, v0

    const/16 v4, 0x3e8

    .line 210
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p1, v0

    .line 211
    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {v1, v2, v3, p2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method private getCamera()Landroid/hardware/Camera;
    .locals 7

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 158
    :cond_0
    const-class v0, Lcom/google/android/gms/vision/CameraSource;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 160
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    .line 161
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Landroid/hardware/Camera;

    if-ne v5, v6, :cond_2

    const/4 v0, 0x1

    .line 162
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 164
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    return-object v1

    :catch_0
    move-exception v0

    const-string v2, "ScanningControllerV2"

    const-string v3, "getCamera failed"

    .line 171
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 172
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method private tryFocusOnHotSpot(II)V
    .locals 4

    .line 216
    iget-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onFocusing:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 217
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onFocusing:Z

    .line 219
    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->getCamera()Landroid/hardware/Camera;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 222
    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    .line 223
    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v2

    const-string v3, "auto"

    if-eq v2, v3, :cond_2

    const-string v2, "auto"

    .line 224
    invoke-virtual {v1, v2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 228
    :cond_2
    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    move-result v2

    if-lez v2, :cond_3

    .line 229
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 230
    new-instance v3, Landroid/hardware/Camera$Area;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->calculateFocusArea(II)Landroid/graphics/Rect;

    move-result-object p1

    const/16 p2, 0x3e8

    invoke-direct {v3, p1, p2}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    invoke-virtual {v1, v2}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    goto :goto_0

    .line 233
    :cond_3
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    const-string p2, "ScanningControllerV2"

    const-string v2, "Manual focus failed since the camera does not have it"

    invoke-virtual {p1, p2, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 239
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 240
    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 241
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$3;

    invoke-direct {p1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$3;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 248
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p2

    const-string v0, "ScanningControllerV2"

    const-string v1, "Manual focus failed"

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 3

    .line 64
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V

    .line 66
    new-instance p3, Lcom/shopkick/app/view/ScanCameraSurfaceView;

    const/4 v0, 0x0

    invoke-direct {p3, p1, v0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    .line 67
    iget-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    new-instance v1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V

    invoke-virtual {p3, v1}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 76
    iget-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    const/4 v1, 0x0

    invoke-virtual {p2, p3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 78
    new-instance p2, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    invoke-direct {p2, p1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;-><init>(Landroid/content/Context;)V

    const/16 p3, 0xff7

    invoke-virtual {p2, p3}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->setBarcodeFormats(I)Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    move-result-object p2

    .line 81
    invoke-virtual {p2}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->build()Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    move-result-object p2

    .line 83
    new-instance p3, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    invoke-direct {p3, p0, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/google/android/gms/vision/barcode/BarcodeDetector;)V

    iput-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->skDetector:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    .line 84
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->skDetector:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    new-instance p3, Lcom/google/android/gms/vision/MultiProcessor$Builder;

    new-instance v2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;)V

    invoke-direct {p3, v2}, Lcom/google/android/gms/vision/MultiProcessor$Builder;-><init>(Lcom/google/android/gms/vision/MultiProcessor$Factory;)V

    invoke-virtual {p3}, Lcom/google/android/gms/vision/MultiProcessor$Builder;->build()Lcom/google/android/gms/vision/MultiProcessor;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->setProcessor(Lcom/google/android/gms/vision/Detector$Processor;)V

    .line 86
    new-instance p2, Lcom/google/android/gms/vision/CameraSource$Builder;

    iget-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->skDetector:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/vision/CameraSource$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/Detector;)V

    invoke-virtual {p2, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setFacing(I)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 87
    invoke-virtual {p1, p2}, Lcom/google/android/gms/vision/CameraSource$Builder;->setAutoFocusEnabled(Z)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object p1

    const/16 p2, 0x500

    const/16 p3, 0x2d0

    .line 88
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/vision/CameraSource$Builder;->setRequestedPreviewSize(II)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object p1

    iget p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->PREVIEW_FPS:F

    .line 90
    invoke-virtual {p1, p2}, Lcom/google/android/gms/vision/CameraSource$Builder;->setRequestedFps(F)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lcom/google/android/gms/vision/CameraSource$Builder;->build()Lcom/google/android/gms/vision/CameraSource;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    return-void
.end method

.method public pauseBCScanning()V
    .locals 0

    .line 123
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->stopBCScanning()V

    return-void
.end method

.method public resumeBCScanning()V
    .locals 0

    .line 127
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->startBCScanning()V

    return-void
.end method

.method public startBCScanning()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->start(Lcom/google/android/gms/vision/CameraSource;)V

    const/4 v0, 0x0

    .line 98
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->onProcessing:Z

    .line 101
    iget-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->isInitialized:Z

    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ScanningControllerV2"

    const-string v2, "Unable to start cameraSource"

    .line 114
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 115
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->release()V

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    :cond_0
    :goto_0
    return-void
.end method

.method public stopBCScanning()V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->preview:Lcom/shopkick/app/view/ScanCameraSurfaceView;

    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {v0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->stop()V

    :cond_0
    return-void
.end method

.method public switchTorchOn(Z)V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_1

    .line 140
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->getCamera()Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 142
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    if-eqz p1, :cond_0

    const-string/jumbo p1, "torch"

    goto :goto_0

    :cond_0
    const-string p1, "off"

    .line 143
    :goto_0
    invoke-virtual {v1, p1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 145
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->logTorchButtonTapped()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "ScanningControllerV2"

    const-string v1, "Unable to switch torch"

    .line 148
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 149
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method
