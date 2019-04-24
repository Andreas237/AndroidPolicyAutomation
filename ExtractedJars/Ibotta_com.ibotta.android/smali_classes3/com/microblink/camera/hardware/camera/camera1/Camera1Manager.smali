.class public abstract Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/ICameraManager;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;
    }
.end annotation


# instance fields
.field protected mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

.field protected mAutofocusSupported:Ljava/lang/Boolean;

.field protected mCamera:Landroid/hardware/Camera;

.field protected mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

.field private mCameraLikeActive:Z

.field private mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

.field private mCameraSensorOrientation:I

.field protected mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

.field private mCameraShuttingDown:Z

.field private mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

.field protected mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

.field private mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

.field protected mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

.field private mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

.field private mCurrentPreviewSize:Landroid/hardware/Camera$Size;

.field protected mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field protected mDeviceShaking:Z

.field private mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

.field private mLastRotation:I

.field protected volatile mPreviewActive:Z

.field protected mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

.field protected mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field private mTorchSupported:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceShaking:Z

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    iput v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mLastRotation:I

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraShuttingDown:Z

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mTorchSupported:Ljava/lang/Boolean;

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraLikeActive:Z

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->hasDeviceListsLoaded()Z

    move-result p1

    if-eqz p1, :cond_3

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iput-object p5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    if-nez p1, :cond_0

    new-instance p1, Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-direct {p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {p1, p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->setAccelerometerDelegate(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->INSTANCE:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Camera delegate can\'t be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Camera manager requires accelerometer manager and camera strategy factory to be non-null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Provided device manager must have device lists loaded!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera;
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->openCamera(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraShuttingDown:Z

    return p0
.end method

.method static synthetic access$1002(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraShuttingDown:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;FLandroid/hardware/Camera$Parameters;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->applyZoomLevel(FLandroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    return-object p0
.end method

.method static synthetic access$300(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    return p0
.end method

.method static synthetic access$302(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)I
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    return p1
.end method

.method static synthetic access$400(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mLastRotation:I

    return p0
.end method

.method static synthetic access$502(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)I
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mLastRotation:I

    return p1
.end method

.method static synthetic access$600(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$700(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    return-object p0
.end method

.method static synthetic access$800(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->localStartPreview()V

    return-void
.end method

.method static synthetic access$900(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->closeCamera()V

    return-void
.end method

.method private applyZoomLevel(FLandroid/hardware/Camera$Parameters;)V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/DeviceManager;->adjustZoomLevel(F)F

    move-result p1

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v1

    if-lez v2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    const/4 p1, 0x0

    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getMaxZoom()I

    move-result v0

    int-to-float v0, v0

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/hardware/Camera$Parameters;->setZoom(I)V

    return-void
.end method

.method private checkForAutofocus(I)Z
    .locals 2

    invoke-static {p1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const-string v1, "auto"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/hardware/Camera;->release()V

    return v0
.end method

.method private closeCamera()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->isUsingBufferedCallback()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_0
    const-string v0, "Stopping camera preview"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onPreviewStopped()V

    :cond_1
    const-string v0, "Releasing camera"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const-string v0, "Camera released"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mTorchSupported:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    :cond_2
    return-void
.end method

.method private determineIfTorchIsSupported()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "torch"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Camera supports torch!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mTorchSupported:Ljava/lang/Boolean;

    return-void

    :cond_0
    const-string v0, "Camera does not support torch!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mTorchSupported:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method

.method private determinePreviewSize(Lcom/microblink/camera/hardware/camera/CameraSurface;)V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-virtual {v0, v1, v2, v3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    if-eqz v0, :cond_0

    const-string v0, "For surface size {}x{} and preset {}, selected preview size is {}x{}"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getWidth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v2

    aput-object v2, v1, p1

    const/4 p1, 0x3

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, p1

    const/4 p1, 0x4

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, p1

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Lcom/microblink/camera/hardware/camera/CameraResolutionTooSmallException;

    const-string v0, "Camera preview size could not be chosen!"

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/camera/CameraResolutionTooSmallException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private localStartPreview()V
    .locals 12

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Preview is already active"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->isSurfaceSane()Z

    move-result v5

    if-eqz v5, :cond_a

    iget-boolean v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    if-nez v5, :cond_a

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v5, :cond_a

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    :goto_0
    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v5}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v5

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    if-nez v6, :cond_2

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->determinePreviewSize(Lcom/microblink/camera/hardware/camera/CameraSurface;)V

    :cond_2
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v6, v6, Landroid/hardware/Camera$Size;->width:I

    iget-object v7, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v7, v7, Landroid/hardware/Camera$Size;->height:I

    invoke-interface {v0, v6, v7}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onCameraPreviewSizeChosen(II)V

    const-string v0, "Resuming camera with preview size {}x{}"

    new-array v6, v3, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v7, v7, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    iget-object v7, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v7, v7, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {p0, v0, v6}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v6, v6, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v5, v0, v6}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    invoke-virtual {p0, v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->prepareCameraParameteresAndFocusManager(Landroid/hardware/Camera$Parameters;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getInitialZoomLevel()F

    move-result v0

    invoke-direct {p0, v0, v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->applyZoomLevel(FLandroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v0, "Setting following parameters to camera: {}"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {p0, v0, v6}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, v5}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    const-string v6, "Setting camera parameters failed!"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v6, v7}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Preview width: {} height: {}"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v6, v6, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v1

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v6, v6, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->isUsingBufferedCallback()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    invoke-virtual {v5}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v3

    invoke-virtual {p0, v0, v3}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->calculateBufferSize(Landroid/hardware/Camera$Size;I)I

    move-result v0

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->getPreviewCallback()Landroid/hardware/Camera$PreviewCallback;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getNumberOfCores()I

    move-result v3

    if-ne v3, v4, :cond_3

    move v8, v0

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    move v8, v0

    goto :goto_2

    :cond_4
    const/4 v2, 0x1

    const/4 v8, 0x0

    :goto_2
    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v6, v3, Landroid/hardware/Camera$Size;->width:I

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v7, v3, Landroid/hardware/Camera$Size;->height:I

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraFrameFactory()Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    move-result-object v11

    move-object v5, v0

    move-object v9, p0

    move v10, v2

    invoke-direct/range {v5 .. v11}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;-><init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;ILcom/microblink/camera/hardware/camera/CameraFrameFactory;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    new-array v0, v2, [Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_5

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-virtual {v5}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->obtain()Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object v5

    aput-object v5, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_6

    aget-object v5, v0, v3

    invoke-virtual {v5}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->recycle()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    const-string v2, "Focus manager: {}"

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v1

    invoke-static {p0, v2, v3}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_9

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-interface {v0, v2}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->setCamera(Landroid/hardware/Camera;)V

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->resumeFocusing()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    iput-boolean v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->determineIfTorchIsSupported()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->getCameraInitDelay()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v3, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$4;

    invoke-direct {v3, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$4;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    int-to-long v4, v0

    invoke-interface {v2, v3, v4, v5}, Lcom/microblink/camera/util/IProcessingQueue;->postJobDelayed(Ljava/lang/Runnable;J)V

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->startAccelerometer()V

    :cond_8
    :goto_5
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onPreviewStarted()V

    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Method prepareCameraParametersAndFocusManager did not prepare focus manager!"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    const-string v0, "Camera still hasn\'t got surface or preview already active or camera is null (due to error). Cannot start preview!"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v5}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "has surface: {}; previewActive: {}, camera: {}"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    :goto_6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v1

    iget-boolean v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v2, v4

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    aput-object v4, v2, v3

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_c

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v2, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    :cond_c
    return-void
.end method

.method private openCamera(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera;
    .locals 14

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    sget-object p1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x0

    :goto_0
    if-ge v4, v1, :cond_7

    invoke-static {v4, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v11, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_3

    if-ne v6, v2, :cond_1

    iget v6, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    const-string v8, "Front facing orientation: {}"

    new-array v9, v12, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v3

    invoke-static {p0, v8, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->checkForAutofocus(I)Z

    move-result v8

    move v9, v6

    move v6, v4

    goto :goto_2

    :cond_1
    if-nez v8, :cond_2

    invoke-direct {p0, v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->checkForAutofocus(I)Z

    move-result v11

    if-eqz v11, :cond_6

    iget v9, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    const-string v6, "Front facing orientation: {}"

    new-array v8, v12, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v8, v3

    invoke-static {p0, v6, v8}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move v6, v4

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const-string v11, "Handling multiple front cameras with autofocus currently not supported! Will use the first found \'{}\'"

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v3

    :goto_1
    invoke-static {p0, v11, v12}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget v11, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v11, :cond_6

    if-ne v5, v2, :cond_4

    iget v5, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    const-string v7, "Back facing orientation: {}"

    new-array v10, v12, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v3

    invoke-static {p0, v7, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->checkForAutofocus(I)Z

    move-result v7

    move v10, v7

    move v7, v5

    move v5, v4

    goto :goto_2

    :cond_4
    if-nez v10, :cond_5

    invoke-direct {p0, v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->checkForAutofocus(I)Z

    move-result v11

    if-eqz v11, :cond_6

    iget v7, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    move v5, v4

    const/4 v10, 0x1

    goto :goto_2

    :cond_5
    const-string v11, "Handling multiple back cameras with autofocus currently not supported. Will use the first found \'{}\'"

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v3

    goto :goto_1

    :cond_6
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_7
    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v0, :cond_9

    if-ltz v5, :cond_8

    sget-object p1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v7, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    invoke-static {v5}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Device does not have back facing camera!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v0, :cond_b

    if-ltz v6, :cond_a

    sget-object p1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v9, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    invoke-static {v6}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Device does not have front facing camera!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    if-ltz v5, :cond_c

    sget-object p1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v7, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    invoke-static {v5}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    return-object p1

    :cond_c
    if-ltz v6, :cond_d

    sget-object p1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v9, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    invoke-static {v6}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    return-object p1

    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Device does not have cameras!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public areOpenedCamerasPixelsLandscapeLeft()Z
    .locals 2

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    const/16 v1, 0x10e

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected calculateBufferSize(Landroid/hardware/Camera$Size;I)I
    .locals 1

    invoke-static {p2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/16 p2, 0x18

    :cond_0
    iget v0, p1, Landroid/hardware/Camera$Size;->width:I

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    mul-int v0, v0, p1

    mul-int v0, v0, p2

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public cameraSupportsTorch()Z
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mTorchSupported:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Camera not yet initialized. Unable to determine if torch is supported!"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method public dispose()V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDisposed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->dispose()V

    :cond_1
    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategyFactory:Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    :cond_2
    return-void
.end method

.method public doesCameraHaveSurface()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->dispose()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method protected getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-object v0
.end method

.method public getCameraSensorOrientation()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSensorOrientation:I

    return v0
.end method

.method public getCurrentPreviewSize()Lcom/microblink/camera/hardware/camera/ImageSize;
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lcom/microblink/camera/hardware/camera/ImageSize;

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCurrentPreviewSize:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v1, v0, v2}, Lcom/microblink/camera/hardware/camera/ImageSize;-><init>(II)V

    return-object v1
.end method

.method protected getFocusManager()Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    return-object v0
.end method

.method public final getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-object v0
.end method

.method protected abstract getPreviewCallback()Landroid/hardware/Camera$PreviewCallback;
.end method

.method public getSurfaceHolderCallback()Landroid/view/SurfaceHolder$Callback;
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-object v0
.end method

.method public getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-object v0
.end method

.method public isAutofocusSupported()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    return-object v0
.end method

.method public isCameraFocusing()Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->isAutofocusing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCameraInFocus()Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->isCameraFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDeviceShaking()Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceShaking:Z

    return v0
.end method

.method public isPreviewActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    return v0
.end method

.method protected isUsingBufferedCallback()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onShakingStarted()V
    .locals 5
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    const-string v0, "shaking started, this = {}, focus manager: {}, camera queue: {}"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    const/4 v4, 0x2

    aput-object v2, v1, v4

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceShaking:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    :cond_1
    return-void
.end method

.method public onShakingStopped()V
    .locals 5
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    const-string v0, "shaking stopped, this = {}, focus manager: {}, camera queue: {}"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    const/4 v4, 0x2

    aput-object v3, v1, v4

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    iput-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceShaking:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_1
    return-void
.end method

.method public performAutofocus()V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->isAutofocusing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$8;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$8;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method protected abstract prepareCameraParameteresAndFocusManager(Landroid/hardware/Camera$Parameters;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;
.end method

.method public recycleFrame(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;

    invoke-direct {v0, p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V

    invoke-virtual {p0, v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->runOnCameraThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public rotateCameraPreview(I)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mLastRotation:I

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method protected runOnCameraThread(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v1}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v0, p1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public setMeteringAreas([Landroid/graphics/Rect;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->isMeteringAreaBuggy()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mFocusManager:Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;[Landroid/graphics/Rect;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string p1, "Setting metering areas not supported on this device"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setShakeCallback(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method

.method public setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->cameraSupportsTorch()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera does not support torch! Cannot change torch state!"

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    invoke-interface {p2, v0}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;

    invoke-direct {v1, p0, p1, p2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;ZLcom/microblink/camera/hardware/SuccessCallback;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public setZoomLevel(F)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;F)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void
.end method

.method public startPreview(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraLikeActive:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "Start preview has already been called. Ignoring this call!"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "Camera1Manager.startPreview"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraLikeActive:Z

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iget-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;

    invoke-direct {v0, p0, p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/DeviceManager;)V

    invoke-interface {p3, v0}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopPreview()V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraLikeActive:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Stop preview has already been called. Ignoring this call!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraLikeActive:Z

    const-string v0, "Camera1Manager.stopPreview"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraShuttingDown:Z

    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v3, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;

    invoke-direct {v3, p0, v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v0, v3}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :try_start_0
    const-string v0, "Waiting for camera preview to stop..."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V

    const-string v0, "Camera preview has stopped."

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Interrupted while waiting for camera preview to stop"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
