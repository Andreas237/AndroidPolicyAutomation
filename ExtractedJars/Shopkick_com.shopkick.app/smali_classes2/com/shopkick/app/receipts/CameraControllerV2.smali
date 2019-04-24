.class public Lcom/shopkick/app/receipts/CameraControllerV2;
.super Lcom/shopkick/app/receipts/AbstractCameraController;
.source "CameraControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/receipts/CameraControllerV2$CompareSizesByArea;,
        Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;
    }
.end annotation


# static fields
.field private static final CAMERA_BACKGROUND:Ljava/lang/String; = "CameraBackground"

.field private static final LOG_TAG:Ljava/lang/String; = "CameraControllerV2"

.field private static final MAX_PREVIEW_HEIGHT:I = 0x438

.field private static final MAX_PREVIEW_WIDTH:I = 0x780

.field private static final ORIENTATIONS:Landroid/util/SparseIntArray;


# instance fields
.field private alignHereImage:Landroid/graphics/Bitmap;

.field private backgroundHandler:Landroid/os/Handler;

.field private backgroundThread:Landroid/os/HandlerThread;

.field private cameraDevice:Landroid/hardware/camera2/CameraDevice;

.field private cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

.field private cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

.field private captureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

.field private captureInProgress:Z

.field private captureSession:Landroid/hardware/camera2/CameraCaptureSession;

.field private currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field private imageReader:Landroid/media/ImageReader;

.field private oldAlignHereImage:Landroid/graphics/Bitmap;

.field private final onImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

.field private previewRequest:Landroid/hardware/camera2/CaptureRequest;

.field private previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private previewSize:Landroid/util/Size;

.field private sensorOrientation:I

.field private shutter:Landroid/media/MediaActionSound;

.field private final stateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field private final surfaceListener:Landroid/view/TextureView$SurfaceTextureListener;

.field private theCameraId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 70
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    .line 79
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    const/16 v2, 0x5a

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 80
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 81
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    const/4 v1, 0x2

    const/16 v2, 0x10e

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 82
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    const/4 v1, 0x3

    const/16 v2, 0xb4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/widget/RelativeLayout;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/receipts/ReceiptScanScreen;",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/RelativeLayout;",
            ")V"
        }
    .end annotation

    .line 382
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/receipts/AbstractCameraController;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    const/4 p2, 0x0

    .line 75
    iput-boolean p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    .line 111
    new-instance p3, Lcom/shopkick/app/receipts/CameraControllerV2$1;

    invoke-direct {p3, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$1;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 160
    new-instance p3, Lcom/shopkick/app/receipts/CameraControllerV2$2;

    invoke-direct {p3, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$2;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->stateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 197
    sget-object p3, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const/4 p3, 0x0

    .line 198
    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    .line 202
    new-instance p3, Landroid/os/HandlerThread;

    const-string v0, "CameraBackground"

    invoke-direct {p3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    .line 204
    new-instance p3, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    .line 209
    new-instance p3, Lcom/shopkick/app/receipts/CameraControllerV2$3;

    invoke-direct {p3, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$3;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->surfaceListener:Landroid/view/TextureView$SurfaceTextureListener;

    .line 262
    new-instance p3, Lcom/shopkick/app/receipts/CameraControllerV2$4;

    invoke-direct {p3, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$4;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->onImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

    const p3, 0x7f0900c4

    .line 386
    invoke-virtual {p4, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 387
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 389
    new-instance v1, Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/shopkick/app/receipts/AutoScaleSurface;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    .line 390
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 392
    invoke-virtual {p4, p3}, Landroid/widget/RelativeLayout;->indexOfChild(Landroid/view/View;)I

    move-result p1

    .line 393
    invoke-virtual {p4, p1}, Landroid/widget/RelativeLayout;->removeViewAt(I)V

    .line 394
    iget-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {p4, p3, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;I)V

    .line 397
    iput p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->scanCount:I

    .line 400
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 401
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->clearCache(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/CameraControllerV2;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I
    .locals 0

    .line 58
    iget p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    return p0
.end method

.method static synthetic access$1202(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->oldAlignHereImage:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/graphics/Bitmap;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->alignHereImage:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method static synthetic access$1302(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->alignHereImage:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/os/Handler;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/media/ImageReader;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    return-object p0
.end method

.method static synthetic access$1602(Lcom/shopkick/app/receipts/CameraControllerV2;Z)Z
    .locals 0

    .line 58
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    return p1
.end method

.method static synthetic access$1700(Lcom/shopkick/app/receipts/CameraControllerV2;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateUiThread(I)V

    return-void
.end method

.method static synthetic access$1900(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p0
.end method

.method static synthetic access$1902(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->takePicture()V

    return-void
.end method

.method static synthetic access$2000(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-object p0
.end method

.method static synthetic access$2100(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CaptureRequest;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequest:Landroid/hardware/camera2/CaptureRequest;

    return-object p0
.end method

.method static synthetic access$2102(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CaptureRequest;)Landroid/hardware/camera2/CaptureRequest;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequest:Landroid/hardware/camera2/CaptureRequest;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/CameraControllerV2;)Ljava/util/concurrent/Semaphore;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p1
.end method

.method static synthetic access$500(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->createCameraPreviewSession()V

    return-void
.end method

.method static synthetic access$600()Ljava/lang/String;
    .locals 1

    .line 58
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/shopkick/app/receipts/CameraControllerV2;II)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/receipts/CameraControllerV2;->openCamera(II)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/receipts/CameraControllerV2;II)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/receipts/CameraControllerV2;->configureTransform(II)V

    return-void
.end method

.method static synthetic access$900(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->closeCamera()V

    return-void
.end method

.method private static chooseOptimalSize([Landroid/util/Size;IIIILandroid/util/Size;)Landroid/util/Size;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    .line 796
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 798
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 799
    invoke-virtual/range {p5 .. p5}, Landroid/util/Size;->getWidth()I

    move-result v5

    .line 800
    invoke-virtual/range {p5 .. p5}, Landroid/util/Size;->getHeight()I

    move-result v6

    .line 801
    array-length v7, v0

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v9, v7, :cond_4

    aget-object v10, v0, v9

    .line 802
    invoke-virtual {v10}, Landroid/util/Size;->getWidth()I

    move-result v11

    if-gt v11, v1, :cond_3

    invoke-virtual {v10}, Landroid/util/Size;->getHeight()I

    move-result v11

    if-gt v11, v2, :cond_3

    .line 803
    invoke-virtual {v10}, Landroid/util/Size;->getHeight()I

    move-result v11

    invoke-virtual {v10}, Landroid/util/Size;->getWidth()I

    move-result v12

    mul-int/2addr v12, v6

    div-int/2addr v12, v5

    if-ne v11, v12, :cond_2

    .line 804
    invoke-virtual {v10}, Landroid/util/Size;->getWidth()I

    move-result v11

    move/from16 v12, p1

    if-lt v11, v12, :cond_0

    invoke-virtual {v10}, Landroid/util/Size;->getHeight()I

    move-result v11

    move/from16 v13, p2

    if-lt v11, v13, :cond_1

    .line 805
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    move/from16 v13, p2

    .line 807
    :cond_1
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move/from16 v12, p1

    move/from16 v13, p2

    goto :goto_1

    :cond_3
    move/from16 v12, p1

    move/from16 v13, p2

    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 814
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    const/4 v9, 0x0

    if-lez v7, :cond_5

    .line 815
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CompareSizesByArea;

    invoke-direct {v0, v9}, Lcom/shopkick/app/receipts/CameraControllerV2$CompareSizesByArea;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2$1;)V

    invoke-static {v3, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    return-object v0

    .line 816
    :cond_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_6

    .line 817
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CompareSizesByArea;

    invoke-direct {v0, v9}, Lcom/shopkick/app/receipts/CameraControllerV2$CompareSizesByArea;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2$1;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    return-object v0

    .line 819
    :cond_6
    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Couldn\'t find exact preview size: try to get one with tolerance"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    int-to-float v3, v5

    int-to-float v4, v6

    div-float/2addr v3, v4

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    mul-int/2addr v1, v2

    int-to-double v1, v1

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v5, v1

    .line 823
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    const-wide/high16 v9, 0x4002000000000000L    # 2.25

    mul-double/2addr v1, v9

    .line 824
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    .line 825
    aget-object v7, v0, v8

    .line 827
    array-length v9, v0

    move v10, v4

    move v4, v8

    :goto_2
    if-ge v4, v9, :cond_9

    aget-object v11, v0, v4

    .line 828
    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    move-result v12

    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    move-result v13

    mul-int/2addr v12, v13

    int-to-long v12, v12

    .line 829
    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    move-result v15

    int-to-float v15, v15

    div-float/2addr v14, v15

    sub-float v15, v14, v3

    .line 830
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmp-long v16, v12, v5

    if-ltz v16, :cond_8

    cmp-long v12, v12, v1

    if-gtz v12, :cond_8

    .line 833
    sget-object v12, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Checking resolution: "

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v8, "x"

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    move-result v8

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "/ raito: "

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, "/ diff: "

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v12, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v8, 0x0

    .line 835
    aget-object v12, v0, v8

    if-ne v7, v12, :cond_7

    move-object v7, v11

    :cond_7
    cmpg-float v12, v15, v10

    if-gez v12, :cond_8

    move-object v7, v11

    move v10, v15

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 843
    :cond_9
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Picked preview size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v7
.end method

.method private closeCamera()V
    .locals 3

    .line 483
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 484
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 486
    iput-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    .line 488
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    .line 489
    new-instance v0, Lcom/shopkick/app/receipts/-$$Lambda$CameraControllerV2$Z_uOYt-YlVBwMFBQJciW34bSPEM;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/-$$Lambda$CameraControllerV2$Z_uOYt-YlVBwMFBQJciW34bSPEM;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V

    .line 497
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    if-nez v0, :cond_2

    .line 498
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 499
    iput-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 502
    :try_start_1
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Interrupted while trying to lock camera closing."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 503
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 504
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Camera closing lock interrupted."

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 506
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V

    throw v0
.end method

.method private configureTransform(II)V
    .locals 9

    .line 1047
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 1048
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    if-eqz v1, :cond_4

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 1051
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 1052
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 1053
    new-instance v2, Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1054
    new-instance v4, Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-direct {v4, v3, v3, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1055
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    .line 1056
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eq v6, v0, :cond_2

    const/4 v6, 0x3

    if-ne v6, v0, :cond_1

    goto :goto_0

    :cond_1
    if-ne v7, v0, :cond_3

    const/high16 p1, 0x43340000    # 180.0f

    .line 1065
    invoke-virtual {v1, p1, v3, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    goto :goto_1

    .line 1058
    :cond_2
    :goto_0
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    sub-float v6, v3, v6

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v8

    sub-float v8, v5, v8

    invoke-virtual {v4, v6, v8}, Landroid/graphics/RectF;->offset(FF)V

    .line 1059
    sget-object v6, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v1, v2, v4, v6}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 1060
    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr p2, v2

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    .line 1061
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr p1, v2

    .line 1060
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 1062
    invoke-virtual {v1, p1, p1, v3, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    sub-int/2addr v0, v7

    mul-int/lit8 v0, v0, 0x5a

    int-to-float p1, v0

    .line 1063
    invoke-virtual {v1, p1, v3, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1067
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setTransform(Landroid/graphics/Matrix;)V

    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method private createCameraPreviewSession()V
    .locals 5

    .line 1075
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    .line 1078
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 1081
    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 1084
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 1085
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 1088
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/view/Surface;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v1

    aput-object v1, v3, v2

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/receipts/CameraControllerV2$6;

    invoke-direct {v2, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$6;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1130
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "CameraPreviewSession ailed to create."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private findBestSize(Ljava/util/ArrayList;I)Landroid/util/Size;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/util/Size;",
            ">;I)",
            "Landroid/util/Size;"
        }
    .end annotation

    .line 747
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7fffffff

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    .line 751
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v4

    mul-int/2addr v3, v4

    sub-int v4, p2, v3

    .line 755
    sget-object v5, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Checking "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " with diff "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " with tempDiff "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " with requested"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " size "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " size "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-ge v4, v1, :cond_0

    if-ltz v4, :cond_0

    .line 760
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Found a candidate! Size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " with diff "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " with tempDiff "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " with requested "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " size "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " size "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v2

    move v1, v4

    goto/16 :goto_0

    :cond_1
    return-object v0
.end method

.method public static synthetic lambda$closeCamera$207(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 1

    .line 490
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_0

    .line 491
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    const/4 v0, 0x0

    .line 492
    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    :cond_0
    return-void
.end method

.method private lockFocus()V
    .locals 4

    .line 856
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 857
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    .line 858
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 857
    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 860
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_FOCUS_LOCK:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    .line 863
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 865
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private maybeGetHighRes(Landroid/hardware/camera2/params/StreamConfigurationMap;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/params/StreamConfigurationMap;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/16 v0, 0x100

    .line 729
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 730
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 732
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method private openCamera(II)V
    .locals 3

    .line 515
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/receipts/CameraControllerV2;->setUpCameraOutputs(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 516
    sget-object p1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    return-void

    .line 519
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/receipts/CameraControllerV2;->configureTransform(II)V

    .line 520
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const-string p2, "camera"

    .line 521
    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    .line 523
    :try_start_0
    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraOpenCloseLock:Ljava/util/concurrent/Semaphore;

    const-wide/16 v0, 0x9c4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 526
    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->theCameraId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->stateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {p1, p2, v0, v1}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    goto :goto_0

    .line 524
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Time out waiting to lock camera opening."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 532
    sget-object p2, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Should not reach here, since CameraController will open camera after permission check on the screen"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 530
    sget-object p2, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Interrupted while trying to lock camera opening."

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 528
    sget-object p2, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Problem in OpenCamera. CameraAccessException thrown."

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private setUpCameraOutputs(II)Z
    .locals 17

    move-object/from16 v1, p0

    .line 546
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->hasValidFragment()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    .line 549
    :cond_0
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 550
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "camera"

    .line 551
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 556
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move v5, v2

    :goto_0
    const/4 v9, 0x1

    if-ge v5, v4, :cond_2

    aget-object v8, v3, v5

    .line 558
    invoke-virtual {v0, v8}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v7

    .line 559
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v7, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 560
    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v7, v10}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_1

    .line 561
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v9, :cond_1

    if-nez v6, :cond_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-nez v6, :cond_3

    .line 570
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Only found cameras without Stream Configuration maps. This is a serious problem and we cannot continue. It is possibly indicative of a broken phone"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    return v2

    .line 579
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v3, 0x100

    .line 580
    invoke-virtual {v6, v3}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 582
    invoke-direct {v1, v6}, Lcom/shopkick/app/receipts/CameraControllerV2;->maybeGetHighRes(Landroid/hardware/camera2/params/StreamConfigurationMap;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 584
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 585
    iget-object v5, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    iget-object v10, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v5, v10

    .line 587
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Size;

    .line 588
    sget-object v12, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Checking Size "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroid/util/Size;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 589
    invoke-virtual {v11}, Landroid/util/Size;->getWidth()I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v11}, Landroid/util/Size;->getHeight()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v12, v13

    cmpl-float v12, v5, v12

    if-nez v12, :cond_4

    .line 591
    sget-object v12, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Found a propirtional Size: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Landroid/util/Size;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 592
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 596
    :cond_5
    sget-object v5, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Requested size: Width="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v11, v11, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " Height="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v11, v11, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 598
    iget-object v5, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v10, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    mul-int/2addr v5, v10

    .line 599
    invoke-direct {v1, v4, v5}, Lcom/shopkick/app/receipts/CameraControllerV2;->findBestSize(Ljava/util/ArrayList;I)Landroid/util/Size;

    move-result-object v10

    .line 601
    sget-object v11, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Best Size Found:  "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " from "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v10, :cond_6

    .line 605
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v10

    sget-object v11, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v12, "Unable to find a high resolution size smaller than the requested size. Using standard sizes."

    .line 606
    invoke-virtual {v10, v11, v12}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    invoke-direct {v1, v0, v5}, Lcom/shopkick/app/receipts/CameraControllerV2;->findBestSize(Ljava/util/ArrayList;I)Landroid/util/Size;

    move-result-object v10

    move-object/from16 v16, v10

    goto :goto_2

    :cond_6
    move-object/from16 v16, v10

    :goto_2
    if-nez v16, :cond_7

    return v2

    .line 617
    :cond_7
    invoke-virtual/range {v16 .. v16}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual/range {v16 .. v16}, Landroid/util/Size;->getHeight()I

    move-result v5

    const/4 v10, 0x2

    invoke-static {v0, v5, v3, v10}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    .line 621
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 622
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 623
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    .line 624
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 626
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v7, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    packed-switch v0, :pswitch_data_0

    .line 642
    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    goto :goto_3

    .line 637
    :pswitch_0
    iget v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    if-eqz v0, :cond_8

    iget v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    const/16 v3, 0xb4

    if-ne v0, v3, :cond_a

    :cond_8
    move v0, v9

    goto :goto_4

    .line 631
    :pswitch_1
    iget v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    const/16 v3, 0x5a

    if-eq v0, v3, :cond_9

    iget v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->sensorOrientation:I

    const/16 v3, 0x10e

    if-ne v0, v3, :cond_a

    :cond_9
    move v0, v9

    goto :goto_4

    .line 642
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Display rotation is invalid: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 643
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v3

    sget-object v5, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Display rotation is invalid: "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    move v0, v2

    .line 646
    :goto_4
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 649
    iget-object v5, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v5}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 652
    iget v5, v3, Landroid/graphics/Point;->x:I

    .line 653
    iget v7, v3, Landroid/graphics/Point;->y:I

    if-eqz v0, :cond_b

    .line 658
    iget v5, v3, Landroid/graphics/Point;->y:I

    .line 659
    iget v7, v3, Landroid/graphics/Point;->x:I

    move/from16 v13, p1

    move/from16 v12, p2

    goto :goto_5

    :cond_b
    move/from16 v12, p1

    move/from16 v13, p2

    :goto_5
    const/16 v0, 0x780

    if-le v5, v0, :cond_c

    move v14, v0

    goto :goto_6

    :cond_c
    move v14, v5

    :goto_6
    const/16 v0, 0x438

    if-le v7, v0, :cond_d

    move v15, v0

    goto :goto_7

    :cond_d
    move v15, v7

    :goto_7
    mul-int v0, v15, v14

    .line 673
    invoke-direct {v1, v4, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->findBestSize(Ljava/util/ArrayList;I)Landroid/util/Size;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    .line 674
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    if-nez v0, :cond_e

    .line 675
    const-class v0, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v6, v0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v11

    invoke-static/range {v11 .. v16}, Lcom/shopkick/app/receipts/CameraControllerV2;->chooseOptimalSize([Landroid/util/Size;IIIILandroid/util/Size;)Landroid/util/Size;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    .line 681
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not find a valid preview size using findBestSize, using a new preview size instead: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 682
    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 688
    :cond_e
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 689
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 690
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 691
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v10, :cond_f

    .line 693
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setAspectRatio(II)V

    goto :goto_8

    .line 695
    :cond_f
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->previewSize:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setAspectRatio(II)V

    .line 698
    :goto_8
    iput-object v8, v1, Lcom/shopkick/app/receipts/CameraControllerV2;->theCameraId:Ljava/lang/String;
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return v9

    :catch_0
    move-exception v0

    .line 708
    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Null Pointer exception returned. This is most likely due to the device not supporting Camera2, or due to a sizing issue."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 712
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v3

    sget-object v4, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Null Pointer exception returned. This is most likely due to the device not supporting Camera2, or due to a sizing issue. Stack trace: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 716
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 713
    invoke-virtual {v3, v4, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :catch_1
    move-exception v0

    .line 701
    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Camera Access Exception in setup."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 702
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v3

    sget-object v4, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CameraAccessException returned. This is most likely due to the device not supporting Camera2, or due to bad app behavior by other Camera consumers. Stack trace: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 703
    invoke-virtual {v3, v4, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    :goto_9
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private startBackgroundThread()V
    .locals 2

    .line 440
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraBackground"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 442
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    return-void
.end method

.method private stopBackgroundThread()V
    .locals 3

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 452
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->join()V

    const/4 v0, 0x0

    .line 453
    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    .line 454
    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 456
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Problem quitting thread safely."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private takePicture()V
    .locals 5

    .line 993
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 994
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 998
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->onImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v1, v2, v3}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 999
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->shutter:Landroid/media/MediaActionSound;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/media/MediaActionSound;->play(I)V

    .line 1001
    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    const/4 v3, 0x2

    .line 1002
    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1

    .line 1003
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->imageReader:Landroid/media/ImageReader;

    invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 1006
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 1007
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v3}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "camera"

    .line 1008
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/camera2/CameraManager;

    .line 1009
    invoke-virtual {v3}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v4

    aget-object v2, v4, v2

    .line 1010
    invoke-virtual {v3, v2}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v2

    .line 1017
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 1019
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->NOISE_REDUCTION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 1020
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->EDGE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 1023
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 1024
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    sget-object v3, Lcom/shopkick/app/receipts/CameraControllerV2;->ORIENTATIONS:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 1026
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    .line 1029
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    .line 1031
    :goto_1
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Problems with capturing a picture"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method

.method private unlockFocus()V
    .locals 4

    .line 891
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 892
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 895
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->previewRequest:Landroid/hardware/camera2/CaptureRequest;

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 897
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Error occurred unlocking the focus."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private updateCameraState(I)V
    .locals 2

    .line 930
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->values()[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    move-result-object v0

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    .line 936
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 950
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    goto :goto_0

    .line 947
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    goto :goto_0

    .line 944
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    goto :goto_0

    .line 941
    :pswitch_3
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    goto :goto_0

    .line 938
    :pswitch_4
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    .line 954
    :goto_0
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    return-void

    .line 932
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'currentState\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private declared-synchronized updateUiThread(I)V
    .locals 2

    monitor-enter p0

    .line 961
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 962
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV2$5;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2$5;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2;I)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 972
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public addSection()V
    .locals 2

    .line 874
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->scanCount:I

    iget v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->maxScanCount:I

    if-lt v0, v1, :cond_0

    .line 875
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->showDialogScanCountThreshold()V

    goto :goto_0

    .line 877
    :cond_0
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->scanCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->scanCount:I

    .line 878
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    .line 879
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->unlockFocus()V

    :goto_0
    return-void
.end method

.method protected canCancel()Z
    .locals 2

    .line 410
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 414
    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public freeResourcesForPause()V
    .locals 2

    .line 462
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->closeCamera()V

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->backgroundThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 464
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->stopBackgroundThread()V

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_1

    .line 468
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 470
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 471
    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 473
    :cond_2
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 474
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    .line 476
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->shutter:Landroid/media/MediaActionSound;

    invoke-virtual {v0}, Landroid/media/MediaActionSound;->release()V

    .line 477
    invoke-super {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->freeResourcesForPause()V

    return-void
.end method

.method public isCameraReady()Z
    .locals 1

    .line 976
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public performResumeActions()V
    .locals 2

    .line 419
    invoke-super {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->performResumeActions()V

    .line 420
    new-instance v0, Landroid/media/MediaActionSound;

    invoke-direct {v0}, Landroid/media/MediaActionSound;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->shutter:Landroid/media/MediaActionSound;

    .line 421
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->shutter:Landroid/media/MediaActionSound;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaActionSound;->load(I)V

    .line 422
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->startBackgroundThread()V

    .line 428
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->openCamera(II)V

    goto :goto_0

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->cameraUISurface:Lcom/shopkick/app/receipts/AutoScaleSurface;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->surfaceListener:Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 433
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    return-void
.end method

.method public retake()V
    .locals 3

    .line 905
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->lastImageCache:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 906
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 907
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->lastImageCache:Ljava/io/File;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->deleteImage(Landroid/content/Context;Ljava/io/File;)V

    .line 909
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->oldAlignHereImage:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 910
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->oldAlignHereImage:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->alignHereImage:Landroid/graphics/Bitmap;

    .line 911
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->alignHereImage:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setTempAlignHerePreviewBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 915
    :cond_0
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2;->LOG_TAG:Ljava/lang/String;

    const-string v1, "retake() called with no previous image set"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 920
    :cond_1
    :goto_0
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->scanCount:I

    if-nez v0, :cond_2

    .line 921
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    goto :goto_1

    .line 923
    :cond_2
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->updateCameraState(I)V

    .line 926
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->unlockFocus()V

    return-void
.end method

.method public takePhoto()V
    .locals 1

    .line 981
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 982
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2;->captureInProgress:Z

    .line 983
    invoke-direct {p0}, Lcom/shopkick/app/receipts/CameraControllerV2;->lockFocus()V

    :cond_0
    return-void
.end method
