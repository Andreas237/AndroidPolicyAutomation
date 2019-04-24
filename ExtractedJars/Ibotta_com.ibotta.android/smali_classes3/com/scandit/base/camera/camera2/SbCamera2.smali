.class public Lcom/scandit/base/camera/camera2/SbCamera2;
.super Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;
.source "SbCamera2.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;,
        Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;,
        Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;,
        Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;,
        Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;,
        Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;
    }
.end annotation


# static fields
.field private static final CALL_ON_CAMERA_THREAD:Ljava/lang/String; = "Make sure you call this method only on the camera\'s looper thread."

.field private static final CHECK_LOOP:Z = true

.field private static final FAILED_TO_GIVE_ACCESS:Ljava/lang/String; = "the camera failed to give access"

.field static final LOG_IDENTIFIER:Ljava/lang/String; = "ScanditSDK"


# instance fields
.field private mCameraCharacteristics:Landroid/hardware/camera2/CameraCharacteristics;

.field private mCameraFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

.field private mCameraReadyRequestUpdaters:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;",
            ">;"
        }
    .end annotation
.end field

.field private mCameraReadyRunnables:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private mCaptureRequestCallback:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

.field private mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

.field private mContext:Landroid/content/Context;

.field private mDevice:Landroid/hardware/camera2/CameraDevice;

.field private final mHandler:Landroid/os/Handler;

.field private final mHandlerThread:Landroid/os/HandlerThread;

.field private mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

.field private mManager:Landroid/hardware/camera2/CameraManager;

.field private mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

.field private mSession:Landroid/hardware/camera2/CameraCaptureSession;

.field private mView:Lcom/scandit/base/camera/SbTextureViewPreview;


# direct methods
.method public constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2Listener;)V
    .locals 1

    .line 334
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mManager:Landroid/hardware/camera2/CameraManager;

    .line 60
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    .line 61
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraCharacteristics:Landroid/hardware/camera2/CameraCharacteristics;

    .line 71
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    .line 72
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    .line 335
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    .line 336
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "CameraHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    .line 337
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 338
    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2Listener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/scandit/base/camera/camera2/SbCamera2;I)Ljava/lang/String;
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->errorCodeToString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1100(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->startNoLoop(Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/scandit/base/camera/camera2/SbCamera2;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeNoLoop()V

    return-void
.end method

.method static synthetic access$1302(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbTextureViewPreview;)Lcom/scandit/base/camera/SbTextureViewPreview;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    return-object p1
.end method

.method static synthetic access$1500(Lcom/scandit/base/camera/camera2/SbCamera2;)Ljava/util/ArrayList;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestNoLoop(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureRequestCallback:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    return-object p0
.end method

.method static synthetic access$302(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;)Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureRequestCallback:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    return-object p1
.end method

.method static synthetic access$400(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p0
.end method

.method static synthetic access$402(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p1
.end method

.method static synthetic access$500(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p0
.end method

.method static synthetic access$502(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p1
.end method

.method static synthetic access$600(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-object p0
.end method

.method static synthetic access$700(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/os/Handler;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$800(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$900(Lcom/scandit/base/camera/camera2/SbCamera2;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->tryCreateCaptureSession()V

    return-void
.end method

.method private closeCameraOnError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "ScanditSDK"

    .line 380
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 381
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    const/4 v1, 0x2

    invoke-interface {v0, v1, p1}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->onError(ILjava/lang/String;)V

    .line 382
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->forceStop()V

    return-void
.end method

.method private closeNoLoop()V
    .locals 1

    const/4 v0, 0x2

    .line 407
    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->setDesiredState(I)V

    return-void
.end method

.method private computeBestCaptureResolution()Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;
    .locals 7

    .line 451
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraCharacteristics:Landroid/hardware/camera2/CameraCharacteristics;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 452
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v0, :cond_2

    .line 454
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->supportsYuv420(Landroid/hardware/camera2/params/StreamConfigurationMap;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 460
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x23

    .line 463
    invoke-virtual {v0, v2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .line 464
    new-instance v5, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v6

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-direct {v5, v6, v4}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;-><init>(II)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 467
    :cond_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy;->getResolution(Landroid/content/Context;Ljava/util/List;)Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    const-string v0, "ScanditSDK"

    const-string v1, "Could not compute best capture resolution. Unsupported camera."

    .line 455
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 456
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    const/4 v1, 0x2

    const-string v2, "Unsupported camera."

    invoke-interface {v0, v1, v2}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->onError(ILjava/lang/String;)V

    .line 457
    sget-object v0, Lcom/scandit/base/camera/resolution/SbResolutionStrategy;->INVALID_SIZE:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    return-object v0
.end method

.method private doOpenCamera(Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;Ljava/lang/String;)V
    .locals 2

    .line 432
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mManager:Landroid/hardware/camera2/CameraManager;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p2, p1, v1}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    .line 433
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mManager:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {p1, p2}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraCharacteristics:Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "the camera failed to give access"

    .line 437
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string p1, "the camera failed to give access"

    .line 435
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private errorCodeToString(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, "unknown error"

    return-object p1

    :pswitch_0
    const-string p1, "camera service encountered a fatal error"

    return-object p1

    :pswitch_1
    const-string p1, "fatal camera error"

    return-object p1

    :pswitch_2
    const-string p1, "camera is disabled"

    return-object p1

    :pswitch_3
    const-string p1, "max number of used cameras reached"

    return-object p1

    :pswitch_4
    const-string p1, "camera already in use"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private findMatchingCamera(Landroid/hardware/camera2/CameraManager;Lcom/scandit/base/camera/SbICamera$CameraFacing;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    .line 651
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v0

    .line 652
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 653
    invoke-virtual {p1, v4}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v5

    .line 654
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v5, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-nez v5, :cond_0

    goto :goto_1

    .line 658
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    .line 660
    sget-object v6, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne p2, v6, :cond_1

    return-object v4

    :cond_1
    if-nez v5, :cond_2

    .line 664
    sget-object v5, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne p2, v5, :cond_2

    return-object v4

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 670
    :cond_3
    array-length p1, v0

    if-lez p1, :cond_4

    .line 671
    aget-object p1, v0, v2

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method private runQueuedWhenReadyHandlers()V
    .locals 5

    .line 524
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    .line 527
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 528
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 530
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 531
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;

    .line 532
    invoke-direct {p0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestNoLoop(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 536
    :cond_2
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    .line 525
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private startNoLoop(Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V
    .locals 1

    .line 387
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-void

    .line 391
    :cond_0
    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    .line 393
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    const/4 p1, 0x1

    .line 394
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->setDesiredState(I)V

    return-void
.end method

.method private supportsYuv420(Landroid/hardware/camera2/params/StreamConfigurationMap;)Z
    .locals 5

    .line 442
    invoke-virtual {p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    const/16 v4, 0x23

    if-ne v3, v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private tryCreateCaptureSession()V
    .locals 7

    .line 471
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 475
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    .line 476
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 478
    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbTextureViewPreview;->getView()Landroid/view/TextureView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    .line 485
    :cond_1
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->computeBestCaptureResolution()Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    move-result-object v3

    iput-object v3, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    .line 487
    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v3, v3, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget-object v4, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v4, v4, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    const/16 v5, 0x23

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v3

    .line 490
    iget-object v4, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v4, v4, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget-object v5, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v5, v5, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-virtual {v2, v4, v5}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 491
    new-instance v4, Landroid/view/Surface;

    invoke-direct {v4, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 492
    invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v2

    .line 493
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 494
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 496
    new-instance v5, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;

    invoke-direct {v5, p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$1;)V

    .line 497
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {v3, v5, v0}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 499
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 500
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 501
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 502
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    new-instance v2, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;

    iget-object v4, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    invoke-direct {v2, p0, v3, v5, v4}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/media/ImageReader;Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V

    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 507
    invoke-virtual {p0, v6}, Lcom/scandit/base/camera/camera2/SbCamera2;->setCurrentState(I)V

    .line 508
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->notify(ILjava/lang/String;)V

    .line 509
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->runQueuedWhenReadyHandlers()V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "the camera failed to give access"

    .line 518
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string v0, "the camera failed to give access"

    .line 516
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    const-string v0, "the camera failed to give access"

    .line 514
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    const-string v0, "the camera failed to give access"

    .line 512
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
    .locals 5

    .line 554
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    .line 555
    invoke-interface {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;->run(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 556
    invoke-direct {p0, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestNoLoop(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z

    return-void

    .line 559
    :cond_0
    new-instance v0, Lcom/scandit/base/camera/camera2/SbCamera2$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2$4;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->postToLoop(Ljava/lang/Runnable;)V

    return-void
.end method

.method private updateCaptureRequestNoLoop(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z
    .locals 4

    .line 624
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-nez v0, :cond_0

    goto :goto_0

    .line 628
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 630
    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-interface {p1, v2}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;->run(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 632
    :cond_1
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureRequestCallback:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const-string p1, "the camera failed to give access"

    .line 643
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    return v1

    :catch_1
    const-string p1, "the camera failed to give access"

    .line 640
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    return v1

    :catch_2
    const-string p1, "the camera failed to give access"

    .line 637
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    return v1

    :catch_3
    const-string p1, "the camera failed to give access"

    .line 634
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    return v1

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method adjustToDisplayRotation(I)V
    .locals 2

    .line 350
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->finishedInitialization()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbTextureViewPreview;->getView()Landroid/view/TextureView;

    move-result-object v0

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    invoke-static {v0, p1, v1, p0}, Lcom/scandit/base/camera/camera2/TextureViewTransformation;->getViewTransformation(Landroid/view/TextureView;ILandroid/content/Context;Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/graphics/Matrix;

    move-result-object p1

    .line 355
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbTextureViewPreview;->applyTransformation(Landroid/graphics/Matrix;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public closeAsync()V
    .locals 2

    .line 398
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbCamera2$2;

    invoke-direct {v1, p0}, Lcom/scandit/base/camera/camera2/SbCamera2$2;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method finishedInitialization()Z
    .locals 2

    .line 342
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCurrentState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method getCameraToNativeDeviceOrientation()I
    .locals 3

    .line 694
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 698
    :cond_0
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 699
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    return v1
.end method

.method getCaptureResolution()Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    return-object v0
.end method

.method getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraCharacteristics:Landroid/hardware/camera2/CameraCharacteristics;

    return-object v0
.end method

.method isCameraFacingFront()Z
    .locals 3

    .line 703
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 708
    :cond_0
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 709
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isRunning()Z
    .locals 1

    .line 426
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 587
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 590
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-nez v0, :cond_0

    return-void

    .line 594
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    .line 588
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method modifyCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
    .locals 5

    .line 574
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 575
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-interface {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;->run(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    goto :goto_0

    .line 577
    :cond_0
    new-instance v0, Lcom/scandit/base/camera/camera2/SbCamera2$5;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2$5;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->postToLoop(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method postToLoop(Ljava/lang/Runnable;)V
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method runWhenReady(Lcom/scandit/base/camera/camera2/ParameterAdjuster;)V
    .locals 5

    .line 77
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 80
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method setResolutionStrategy(Lcom/scandit/base/camera/resolution/SbResolutionStrategy;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    return-void
.end method

.method public setViewAsync(Lcom/scandit/base/camera/SbTextureViewPreview;)V
    .locals 2

    .line 412
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbCamera2$3;

    invoke-direct {v1, p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2$3;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbTextureViewPreview;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public startAsync(Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V
    .locals 2

    .line 371
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbCamera2$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2$1;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected transitionToStartedStateAsync()V
    .locals 5

    .line 85
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 v0, 0x3

    .line 88
    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->setCurrentState(I)V

    .line 89
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 90
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 91
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    const-string v1, "camera"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraManager;

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mManager:Landroid/hardware/camera2/CameraManager;

    .line 93
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mManager:Landroid/hardware/camera2/CameraManager;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    invoke-direct {p0, v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->findMatchingCamera(Landroid/hardware/camera2/CameraManager;Lcom/scandit/base/camera/SbICamera$CameraFacing;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ScanditSDK"

    const-string v2, "open camera"

    .line 97
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    new-instance v1, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;

    invoke-direct {v1, p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V

    invoke-direct {p0, v1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->doOpenCamera(Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "no camera available"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "No camera available."

    .line 100
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    :goto_0
    return-void

    .line 86
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected transitionToStoppedStateAsync()V
    .locals 5

    .line 106
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    const/4 v0, 0x4

    .line 109
    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->setCurrentState(I)V

    .line 110
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ScanditSDK"

    const-string v1, "close camera"

    .line 113
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 116
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :catch_0
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    .line 125
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    :catch_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRequestUpdaters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 130
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCameraReadyRunnables:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 131
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    .line 132
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureResolution:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    .line 133
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mView:Lcom/scandit/base/camera/SbTextureViewPreview;

    .line 134
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    .line 135
    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mContext:Landroid/content/Context;

    .line 136
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mListener:Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    invoke-interface {v0}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->didClose()V

    const-string v0, "ScanditSDK"

    const-string v1, "camera completely closed"

    .line 137
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 107
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method triggerCaptureRequest()V
    .locals 5

    .line 606
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    .line 609
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-nez v0, :cond_0

    goto :goto_1

    .line 613
    :cond_0
    :try_start_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 614
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    .line 615
    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 616
    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mCaptureRequestCallback:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "the camera failed to give access"

    .line 619
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeCameraOnError(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    :goto_1
    return-void

    .line 607
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
    .locals 1

    const/4 v0, 0x0

    .line 544
    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method

.method updateRepeatingCaptureRequest()V
    .locals 5

    .line 598
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getId()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x0

    .line 602
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestNoLoop(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)Z

    return-void

    .line 599
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Make sure you call this method only on the camera\'s looper thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
