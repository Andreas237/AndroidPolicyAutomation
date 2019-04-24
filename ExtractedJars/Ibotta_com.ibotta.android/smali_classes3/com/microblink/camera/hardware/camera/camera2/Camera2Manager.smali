.class public Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/ICameraManager;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;,
        Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;,
        Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;
    }
.end annotation


# static fields
.field private static final kMaxFramesInQueue:I = 0x3


# instance fields
.field protected mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

.field private mActiveScalerCropRegion:Landroid/graphics/Rect;

.field private mActiveSensorArraySize:Landroid/graphics/Rect;

.field private mAutofocusSupported:Z

.field private mCamera2FramePool:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

.field protected mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

.field private mCameraDevice:Landroid/hardware/camera2/CameraDevice;

.field private mCameraFrameQueue:Lcom/microblink/camera/util/IProcessingQueue;

.field private mCameraLikeActive:Z

.field private mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

.field private mCameraSensorOrientation:I

.field protected mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

.field private mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

.field private mCameraStateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field private mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

.field private mCaptureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

.field private mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field private mDisposed:Z

.field private mFrameRequest:Landroid/hardware/camera2/CaptureRequest;

.field private mImageReader:Landroid/media/ImageReader;

.field private mMaxAERegions:I

.field private mMaxAFRegions:I

.field private mMaxAWBRegions:I

.field private mMaxActiveToCropRegionRatio:F

.field private mMeteringAreas:[Landroid/graphics/Rect;

.field private mNumImagesAlive:Ljava/util/concurrent/atomic/AtomicInteger;

.field private mOISSupported:Z

.field private mOnImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

.field private mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

.field private mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

.field private mPreviewSize:Landroid/util/Size;

.field private mSamsungOISPictureModeSupported:Z

.field private mSamsungPhaseAFSupported:Z

.field private mSessionActive:Z

.field private mSessionCallback:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;

.field private mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field private mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field private mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

.field private mTorchCallback:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/microblink/camera/hardware/SuccessCallback;",
            ">;"
        }
    .end annotation
.end field

.field private mTorchSupported:Z

.field private mUIQueue:Lcom/microblink/camera/util/IProcessingQueue;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionActive:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDisposed:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mTorchSupported:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAutofocusSupported:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOISSupported:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungOISPictureModeSupported:Z

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-direct {v2, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mTorchCallback:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxActiveToCropRegionRatio:F

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMeteringAreas:[Landroid/graphics/Rect;

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    const/4 v2, -0x1

    iput v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mNumImagesAlive:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraLikeActive:Z

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOnImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCaptureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;

    invoke-direct {v0, p0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionCallback:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {p4}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getSlaveAccelerometerDelegate()Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    if-nez p1, :cond_0

    new-instance p1, Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-direct {p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {p1, p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->setAccelerometerDelegate(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;->INSTANCE:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;->getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;->INSTANCE:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraThreadHolder;->getCameraFrameQueue()Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraFrameQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance p1, Lcom/microblink/camera/util/MainQueue;

    invoke-direct {p1}, Lcom/microblink/camera/util/MainQueue;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mUIQueue:Lcom/microblink/camera/util/IProcessingQueue;

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
.end method

.method static synthetic access$000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->openCamera()V

    return-void
.end method

.method static synthetic access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionActive:Z

    return p0
.end method

.method static synthetic access$1002(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionActive:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->setupFrameRequest()V

    return-void
.end method

.method static synthetic access$1300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCaptureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mTorchCallback:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p0
.end method

.method static synthetic access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    return-object p1
.end method

.method static synthetic access$1800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mNumImagesAlive:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic access$1900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/media/ImageReader;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    return-object p0
.end method

.method static synthetic access$1902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/media/ImageReader;)Landroid/media/ImageReader;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    return-object p1
.end method

.method static synthetic access$2100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->localStartPreview()V

    return-void
.end method

.method static synthetic access$2200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/DeviceManager;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCamera2FramePool:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    return-object p0
.end method

.method static synthetic access$2400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraFrameQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-object p0
.end method

.method static synthetic access$2500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)[Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMeteringAreas:[Landroid/graphics/Rect;

    return-object p0
.end method

.method static synthetic access$2600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->resumeContinuousAutofocus()V

    return-void
.end method

.method static synthetic access$2800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->startGrabbingFrames()V

    return-void
.end method

.method static synthetic access$302(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraType;)Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-object p1
.end method

.method static synthetic access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    return-object p0
.end method

.method static synthetic access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    return-object p0
.end method

.method static synthetic access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    return-object p0
.end method

.method static synthetic access$702(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraSurface;)Lcom/microblink/camera/hardware/camera/CameraSurface;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    return-object p1
.end method

.method static synthetic access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-object p0
.end method

.method static synthetic access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p0
.end method

.method static synthetic access$902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object p1
.end method

.method private calcAbsoluteMeteringArea(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 5

    iget v0, p1, Landroid/graphics/Rect;->left:I

    add-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const/high16 v1, 0x44fa0000    # 2000.0f

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/Rect;->right:I

    add-int/lit16 v2, v2, 0x3e8

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget v3, p1, Landroid/graphics/Rect;->top:I

    add-int/lit16 v3, v3, 0x3e8

    int-to-float v3, v3

    div-float/2addr v3, v1

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/lit16 p1, p1, 0x3e8

    int-to-float p1, p1

    div-float/2addr p1, v1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    mul-float v0, v0, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    mul-float v2, v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    mul-float p1, p1, v4

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    add-int/2addr v3, p1

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v1, v2, v0, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method private calcSizeCompatibility(Landroid/util/Size;DJ)D
    .locals 4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    mul-int v0, v0, v1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getMinAllowedVideoResolution()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-double v2, v2

    mul-double v0, v0, v2

    long-to-double p4, p4

    div-double/2addr v0, p4

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p4

    const-wide v0, 0x4092c00000000000L    # 1200.0

    mul-double p4, p4, v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-double v2, p1

    div-double/2addr v0, v2

    sub-double/2addr v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide v0, 0x4091300000000000L    # 1100.0

    mul-double p1, p1, v0

    add-double/2addr p4, p1

    return-wide p4

    :cond_0
    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    return-wide p1
.end method

.method private captureFrameForRecognition()V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v1, :cond_0

    const-string v1, "Capturing another frame for recognition. Currently alive images: {}"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mNumImagesAlive:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mFrameRequest:Landroid/hardware/camera2/CaptureRequest;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v4}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    return-void

    :cond_0
    const-string v1, "Session is already closed. Cannot capture another frame for recognition."

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v2, "Failed to capture frame for recognition"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static doesCameraHaveAutofocus(Landroid/content/Context;Lcom/microblink/camera/hardware/camera/CameraType;)Z
    .locals 5
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "camera"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CameraManager;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "Cannot obtain camera manager from context!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->getCameraId(Landroid/hardware/camera2/CameraManager;Lcom/microblink/camera/hardware/camera/CameraType;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Cannot obtain information for camera type {}"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_2

    const-class v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "{} minimum focus distance: {}"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    aput-object p0, v4, v2

    invoke-static {v1, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    cmpl-float p0, p0, p1

    if-nez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_3

    return v2

    :catch_0
    :cond_3
    return v0
.end method

.method private static getCameraId(Landroid/hardware/camera2/CameraManager;Lcom/microblink/camera/hardware/camera/CameraType;)Ljava/lang/String;
    .locals 12
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5

    array-length v3, v2

    move-object v5, v1

    move-object v6, v5

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v7, v2, v4

    :try_start_1
    invoke-virtual {p0, v7}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v8

    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v8, v9}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_0

    const-class v8, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v9, "Obtained null value for lens facing info. This is a bug in device!"

    new-array v10, v0, [Ljava/lang/Object;

    invoke-static {v8, v9, v10}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-nez v9, :cond_1

    if-nez v6, :cond_2

    move-object v6, v7

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v9, 0x1

    if-ne v8, v9, :cond_2

    if-nez v5, :cond_2

    move-object v5, v7

    goto :goto_1

    :catch_0
    move-exception p0

    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v2, "There was unhandled exception when calling getCameraCharacteristics. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, v2, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_1
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was a NumberFormatException when calling getCameraCharacteristics. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_2
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was a NullPointerException when calling getCameraCharacteristics. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_3
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was assertion error when calling getCameraCharacteristics. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_4
    move-exception v8

    const-class v9, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Unable to access camera with ID "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ". Skipping it..."

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v10, v0, [Ljava/lang/Object;

    invoke-static {v9, v8, v7, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, p0, :cond_4

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_4
    sget-object p0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, p0, :cond_5

    :goto_2
    move-object v1, v5

    goto :goto_3

    :cond_5
    sget-object p0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, p0, :cond_7

    :cond_6
    move-object v1, v6

    :cond_7
    :goto_3
    return-object v1

    :catch_5
    move-exception p0

    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v2, "There was unhandled exception when calling getCameraIdList. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, v2, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_6
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was a NumberFormatException when calling getCameraIdList. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_7
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was a NullPointerException when calling getCameraIdList. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :catch_8
    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "There was assertion error when calling getCameraIdList. This is probably a bug in device!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method private getScalerCropRegionForZoomLevel(F)Landroid/graphics/Rect;
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/DeviceManager;->adjustZoomLevel(F)F

    move-result p1

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_1
    iget v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxActiveToCropRegionRatio:F

    sub-float/2addr v1, v0

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float p1, p1, v1

    div-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int v3, v1, v0

    add-int/2addr v1, v0

    sub-int v0, v2, p1

    add-int/2addr v2, p1

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v3, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method public static isCamera2NativelySupported(Landroid/content/Context;Lcom/microblink/camera/hardware/camera/CameraType;)Z
    .locals 5
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "camera"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CameraManager;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "Cannot obtain camera manager from context!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_0
    invoke-static {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->getCameraId(Landroid/hardware/camera2/CameraManager;Lcom/microblink/camera/hardware/camera/CameraType;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Cannot obtain information for camera type {}"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_2

    const-class p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p1, "Supported hardware level is \'null\'"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_2
    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Camera 2 supported HW level is \'{}\'"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_3

    const-string v4, "full"

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "limited"

    goto :goto_0

    :cond_4
    const-string v4, "legacy"

    :goto_0
    aput-object v4, v3, v0

    invoke-static {p1, v1, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 p1, 0x2

    if-eq p0, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method private localStartPreview()V
    .locals 7

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Preview is already starting... Ignoring this call..."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0, v3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$502(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {v0, v4, v5}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/view/Surface;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v4}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mUIQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v4, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$2;

    invoke-direct {v4, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$2;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    invoke-interface {v0, v4}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    :goto_0
    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    const/16 v6, 0x23

    invoke-static {v4, v5, v6, v2}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v4

    iput-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOnImageAvailableListener:Landroid/media/ImageReader$OnImageAvailableListener;

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraFrameQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v6}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    new-instance v4, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v5}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraFrameFactory()Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;-><init>(ILcom/microblink/camera/hardware/camera/CameraFrameFactory;)V

    iput-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCamera2FramePool:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    invoke-virtual {v4}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v4, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v4

    iput-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v4, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionActive:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSessionCallback:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v4}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v1, v3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$502(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;Z)Z

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    const-string v0, "Cannot start preview. CameraDevice: {}, CameraSurface: {}, PreviewSize: {}"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    aput-object v4, v2, v1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    aput-object v1, v2, v3

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    aput-object v3, v2, v1

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private openCamera()V
    .locals 19
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Camera is already being opened."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v2, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "camera"

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraManager;

    :try_start_0
    invoke-virtual {v2}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, -0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v7, v6, :cond_12

    aget-object v8, v5, v7

    invoke-virtual {v2, v8}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v15
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v18

    if-nez v18, :cond_8

    if-nez v12, :cond_3

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const-string v10, "Front facing orientation is {}"

    new-array v12, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v17, 0x0

    aput-object v13, v12, v17

    invoke-static {v1, v10, v12}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v10}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Float;

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    const/4 v12, 0x0

    cmpl-float v10, v10, v12

    if-eqz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    move-object v12, v8

    move-object v13, v10

    move v10, v4

    goto/16 :goto_8

    :cond_2
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Device returned null for sensor orientation of camera \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\'. This is a bug in device, as it does not implement Camera API as it is supposed to."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_7

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    const/16 v16, 0x0

    cmpl-float v4, v4, v16

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_6

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const-string v4, "Front facing orientation is {}"

    new-array v12, v3, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v15, 0x0

    aput-object v13, v12, v15

    invoke-static {v1, v4, v12}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Device returned null for sensor orientation of camera \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\'. This is a bug in device, as it does not implement Camera API as it is supposed to."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    move-object v8, v12

    :goto_3
    move-object v12, v8

    goto/16 :goto_8

    :cond_7
    const-string v4, "Handling multiple front cameras with autofocus currently not supported! Will use the first found \'{}\'"

    new-array v8, v3, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v12, v8, v15

    :goto_4
    invoke-static {v1, v4, v8}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_8
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v3, :cond_10

    if-nez v9, :cond_b

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const-string v9, "Back facing orientation is {}"

    new-array v11, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v17, 0x0

    aput-object v14, v11, v17

    invoke-static {v1, v9, v11}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v9}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Float;

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    const/4 v11, 0x0

    cmpl-float v9, v9, v11

    if-eqz v9, :cond_9

    const/4 v9, 0x1

    goto :goto_5

    :cond_9
    const/4 v9, 0x0

    :goto_5
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    move v11, v4

    move-object v14, v9

    goto :goto_7

    :cond_a
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Device returned null for sensor orientation of camera \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\'. This is a bug in device, as it does not implement Camera API as it is supposed to."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_b
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_f

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    const/16 v16, 0x0

    cmpl-float v4, v4, v16

    if-eqz v4, :cond_c

    const/4 v4, 0x1

    goto :goto_6

    :cond_c
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_e

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v15, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const-string v4, "Back facing orientation is {}"

    new-array v9, v3, [Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    aput-object v14, v9, v15

    invoke-static {v1, v4, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_7

    :cond_d
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Device returned null for sensor orientation of camera \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\'. This is a bug in device, as it does not implement Camera API as it is supposed to."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_e
    move-object v8, v9

    :goto_7
    move-object v9, v8

    goto :goto_8

    :cond_f
    const-string v4, "Handling multiple back cameras with autofocus currently not supported. Will use the first found \'{}\'"

    new-array v8, v3, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v9, v8, v15

    goto/16 :goto_4

    :cond_10
    :goto_8
    add-int/lit8 v7, v7, 0x1

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_11
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Device returned null for lens facing of camera \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\'. This is a bug in device, as it does not implement Camera API as it is supposed to."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_12
    iget-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v4}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v4

    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v4, v5, :cond_15

    if-eqz v9, :cond_13

    sget-object v4, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v11, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    move-object v8, v9

    goto :goto_9

    :cond_13
    sget-object v4, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    move-object v8, v12

    :goto_9
    if-eqz v8, :cond_14

    goto :goto_a

    :cond_14
    const/4 v4, 0x0

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Device does not have cameras!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_15
    iget-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v4}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v4

    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v4, v5, :cond_17

    sget-object v4, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v11, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    if-eqz v9, :cond_16

    move-object v8, v9

    goto :goto_a

    :cond_16
    const/4 v4, 0x0

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Device does not have back facing camera!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_17
    iget-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v4}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v4

    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v4, v5, :cond_19

    sget-object v4, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    if-eqz v12, :cond_18

    move-object v8, v12

    goto :goto_a

    :cond_18
    const/4 v8, 0x0

    iput-object v8, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Device does not have front facing camera!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_19
    const/4 v8, 0x0

    :goto_a
    const-string v4, "Selected camera ID is {}"

    new-array v5, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v8, v5, v6

    invoke-static {v1, v4, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v8, :cond_29

    invoke-virtual {v2, v8}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v4

    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    if-eqz v5, :cond_1a

    const-string v6, "Minimum focus distance: {}"

    new-array v7, v3, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v5, v7, v9

    invoke-static {v1, v6, v7}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-nez v5, :cond_1a

    const/4 v5, 0x1

    goto :goto_b

    :cond_1a
    const/4 v5, 0x0

    :goto_b
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    iput-object v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    iget-object v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    if-eqz v6, :cond_28

    const-string v6, "Sensor active array size: {}x{}"

    const/4 v7, 0x2

    new-array v9, v7, [Ljava/lang/Object;

    iget-object v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    iget-object v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveSensorArraySize:Landroid/graphics/Rect;

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    invoke-static {v1, v6, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    if-eqz v6, :cond_27

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iput v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxActiveToCropRegionRatio:F

    const-string v6, "Maximum digital zoom: {}"

    new-array v9, v3, [Ljava/lang/Object;

    iget v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxActiveToCropRegionRatio:F

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    invoke-static {v1, v6, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v5, :cond_1b

    const/4 v6, 0x1

    goto :goto_c

    :cond_1b
    const/4 v6, 0x0

    :goto_c
    iput-boolean v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAutofocusSupported:Z

    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    if-eqz v6, :cond_1d

    array-length v9, v6

    const/4 v10, 0x0

    :goto_d
    if-ge v10, v9, :cond_1d

    aget v11, v6, v10

    if-ne v11, v3, :cond_1c

    iput-boolean v3, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOISSupported:Z

    goto :goto_e

    :cond_1c
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    :cond_1d
    :goto_e
    const-string v6, "Optical image stabilisation supported: {}"

    new-array v9, v3, [Ljava/lang/Object;

    iget-boolean v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOISSupported:Z

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    invoke-static {v1, v6, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v6
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v6, :cond_22

    :try_start_2
    sget-object v6, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;->PHASE_AF_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_1f

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1e

    iget-object v9, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v9}, Lcom/microblink/camera/hardware/DeviceManager;->isPhaseAutofocusBuggy()Z

    move-result v9

    if-eqz v9, :cond_1e

    const-string v6, "Samsung Phase AF is supported, but buggy on this device. Will not enabled it!"

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/Object;

    invoke-static {v1, v6, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1e
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iput-boolean v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_3

    :cond_1f
    const/4 v9, 0x0

    goto :goto_f

    :catch_0
    :try_start_3
    const-string v6, "Unable to query device for PAF availability"

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/Object;

    invoke-static {v1, v6, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v9, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z

    :goto_f
    const-string v6, "Samsung Phase AF supported: {}"

    new-array v10, v3, [Ljava/lang/Object;

    iget-boolean v11, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    aput-object v11, v10, v9

    invoke-static {v1, v6, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    sget-object v6, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    if-eqz v6, :cond_21

    array-length v9, v6

    const/4 v10, 0x0

    :goto_10
    if-ge v10, v9, :cond_21

    aget v11, v6, v10

    if-nez v11, :cond_20

    iput-boolean v3, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungOISPictureModeSupported:Z
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_11

    :cond_20
    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_21
    :goto_11
    const/4 v9, 0x0

    goto :goto_12

    :catch_1
    :try_start_5
    const-string v6, "Unable to query device for OIS operation mode availability"

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/Object;

    invoke-static {v1, v6, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v9, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z

    :goto_12
    const-string v6, "Samsung optical image stabilisation picture mode supported: {}"

    new-array v10, v3, [Ljava/lang/Object;

    iget-boolean v11, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungOISPictureModeSupported:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    aput-object v11, v10, v9

    invoke-static {v1, v6, v10}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_22
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    sget-object v9, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v9}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v10}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v6, :cond_26

    if-eqz v9, :cond_26

    if-eqz v10, :cond_26

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    const-string v6, "Max AF regions: {}, Max AE regions: {}, Max AWB regions: {}"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    iget v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    iget v10, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    invoke-static {v1, v6, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_25

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iput-boolean v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mTorchSupported:Z

    const-string v6, "Camera has fixed lens: {}"

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v7, v10

    invoke-static {v1, v6, v7}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v5, :cond_24

    iget-object v5, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v5}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldCrashIfAutofocusNotSupported()Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_13

    :cond_23
    new-instance v2, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;

    const-string v4, "Autofocus is required, but not supported on this device"

    invoke-direct {v2, v4}, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_24
    :goto_13
    const-string v5, "Camera sensor orientation is {}"

    new-array v6, v3, [Ljava/lang/Object;

    iget v7, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x0

    aput-object v7, v6, v9

    invoke-static {v1, v5, v6}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v5, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v5}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->choosePreviewSize(Landroid/hardware/camera2/CameraCharacteristics;Landroid/content/Context;)Landroid/util/Size;

    move-result-object v4

    iput-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    iget-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    iget-object v5, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v5

    iget-object v6, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-interface {v4, v5, v6}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onCameraPreviewSizeChosen(II)V

    const-string v4, "Opening camera \'{}\'"

    new-array v5, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v8, v5, v6

    invoke-static {v1, v4, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStateCallback:Landroid/hardware/camera2/CameraDevice$StateCallback;

    iget-object v5, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v5}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {v2, v8, v4, v5}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    return-void

    :cond_25
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Unable to obtain information about LED torch availability. This is a bug in device!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_26
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Unable to obtain max number of regions for AF, AE and AWB. This is a bug in device!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_27
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Unable to obtain max digital zoom value. This is a bug in device!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_28
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Unable to obtain sensor active array size. This is a bug in device!"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_29
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "Unable to select camera. External cameras are currently not supported."

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_2
    move-exception v0

    move-object v2, v0

    const/4 v4, 0x0

    goto :goto_14

    :catch_3
    move-exception v0

    move-object v2, v0

    const-string v3, "User has not granted permission to use camera!"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1, v2, v3, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v3, v2}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void

    :catch_4
    move-exception v0

    move-object v2, v0

    :goto_14
    const-string v5, "Camera2 API not supported on this device: {}"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfo()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-static {v1, v2, v5, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v3, v2}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void

    :catch_5
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v3, v2}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void
.end method

.method private resumeContinuousAutofocus()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->setupFrameRequest()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCaptureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v3}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to resume continuous autofocus"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private setupFrameRequest()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mFrameRequest:Landroid/hardware/camera2/CaptureRequest;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->removeTarget(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method private startGrabbingFrames()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDevice:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mShouldImmediatelyCloseCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAutofocusSupported:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_0
    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungPhaseAFSupported:Z

    if-eqz v1, :cond_2

    const-string v1, "Activating Samsung Phase AF"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureRequest;->PHASE_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_2
    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOISSupported:Z

    if-eqz v1, :cond_3

    const-string v1, "Activating optical image stabilisation"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->LENS_OPTICAL_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSamsungOISPictureModeSupported:Z

    if-eqz v1, :cond_3

    const-string v1, "Activating Samsung picture mode for optical image stabilisation"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureRequest;->LENS_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldOptimizeForNearScan()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getInitialZoomLevel()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    const v2, 0x3e4ccccd    # 0.2f

    invoke-virtual {v1, v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setInitialZoomLevel(F)V

    :cond_4
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getInitialZoomLevel()F

    move-result v1

    invoke-direct {p0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->getScalerCropRegionForZoomLevel(F)Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    const-string v1, "Initial zoom level: {}"

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getInitialZoomLevel()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCaptureCallback:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    invoke-interface {v4}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iput-boolean v0, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mFrameGrabbingPaused:Z

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->startAccelerometer()V

    :cond_5
    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->setupFrameRequest()V

    const/4 v1, 0x0

    :goto_2
    const/4 v2, 0x3

    if-ge v1, v2, :cond_6

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->captureFrameForRecognition()V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    return-void

    :catch_0
    move-exception v1

    const-string v2, "Camera session was just created and is already invalid?!?"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2, v0}, Lcom/microblink/internal/Logger;->wtf(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception v1

    const-string v2, "Failed to start capturing frames"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public areOpenedCamerasPixelsLandscapeLeft()Z
    .locals 2

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    const/16 v1, 0x10e

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public cameraSupportsTorch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mTorchSupported:Z

    return v0
.end method

.method protected choosePreviewSize(Landroid/hardware/camera2/CameraCharacteristics;Landroid/content/Context;)Landroid/util/Size;
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    move-result-object v1

    array-length v2, v1

    const/4 v8, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v9, 0x23

    const/4 v10, 0x1

    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    if-ne v4, v9, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_a

    invoke-virtual {v7, v9}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v11

    aget-object v12, v11, v8

    iget-object v1, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v1

    sget-object v2, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_MAX_AVAILABLE:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const/4 v13, 0x2

    if-ne v1, v2, :cond_3

    const-string v0, "Attempting to use highest possible resolution!"

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    move-result v1

    mul-int v0, v0, v1

    move v1, v0

    const/4 v0, 0x1

    :goto_2
    array-length v2, v11

    if-ge v0, v2, :cond_9

    const-string v2, "Available preview size is {}"

    new-array v3, v10, [Ljava/lang/Object;

    aget-object v4, v11, v0

    aput-object v4, v3, v8

    invoke-static {v6, v2, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    aget-object v2, v11, v0

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    aget-object v3, v11, v0

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int v2, v2, v3

    if-le v2, v1, :cond_2

    aget-object v1, v11, v0

    move-object v12, v1

    move v1, v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v10, :cond_4

    iget-object v0, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalBackFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v1

    goto :goto_3

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getOptimalFrontFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v1

    :cond_5
    :goto_3
    iget-object v0, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v0

    sget-object v2, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-ne v0, v2, :cond_6

    if-eqz v1, :cond_6

    new-instance v12, Landroid/util/Size;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->getHeight()I

    move-result v1

    invoke-direct {v12, v0, v1}, Landroid/util/Size;-><init>(II)V

    const-string v0, "This device will use special preview size because normal default appears to be buggy"

    new-array v1, v10, [Ljava/lang/Object;

    aput-object v12, v1, v8

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_6
    const-string v0, "window"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v2, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v2

    sget-object v3, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-ne v2, v3, :cond_7

    int-to-double v2, v0

    int-to-double v4, v1

    div-double/2addr v2, v4

    goto :goto_4

    :cond_7
    const-wide v2, 0x3ffc71c71c71c71cL    # 1.7777777777777777

    :goto_4
    move-wide v14, v2

    const-string v2, "Expected camera frame aspect ratio is {}"

    new-array v3, v10, [Ljava/lang/Object;

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v6, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v2

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->getIdealHeight()I

    move-result v2

    int-to-double v3, v2

    mul-double v3, v3, v14

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    const-string v5, "Attempting to choose resolution most similar to {}x{} (screen is {}x{})"

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    aput-object v16, v9, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v9, v10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v13

    const/4 v0, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v9, v0

    invoke-static {v6, v5, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    int-to-long v0, v2

    mul-long v16, v3, v0

    move-object/from16 v0, p0

    move-object v1, v12

    move-wide v2, v14

    move-wide/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->calcSizeCompatibility(Landroid/util/Size;DJ)D

    move-result-wide v0

    move-wide/from16 v18, v0

    const/4 v9, 0x1

    :goto_5
    array-length v0, v11

    if-ge v9, v0, :cond_9

    const-string v0, "Available preview size is {}"

    new-array v1, v10, [Ljava/lang/Object;

    aget-object v2, v11, v9

    aput-object v2, v1, v8

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    aget-object v1, v11, v9

    move-object/from16 v0, p0

    move-wide v2, v14

    move-wide/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->calcSizeCompatibility(Landroid/util/Size;DJ)D

    move-result-wide v0

    const-string v2, "Compatibility for size {} is {}"

    new-array v3, v13, [Ljava/lang/Object;

    aget-object v4, v11, v9

    aput-object v4, v3, v8

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-static {v6, v2, v3}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    cmpg-double v2, v0, v18

    if-gez v2, :cond_8

    aget-object v2, v11, v9

    move-wide/from16 v18, v0

    move-object v12, v2

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    const-string v0, "For preset {}, selected preview size is {}"

    new-array v1, v13, [Ljava/lang/Object;

    iget-object v2, v6, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v2

    aput-object v2, v1, v8

    aput-object v12, v1, v10

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Output stall duration is {}"

    new-array v1, v10, [Ljava/lang/Object;

    const/16 v2, 0x23

    invoke-virtual {v7, v2, v12}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputStallDuration(ILandroid/util/Size;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Output min frame duration is {}"

    new-array v1, v10, [Ljava/lang/Object;

    invoke-virtual {v7, v2, v12}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-static {v6, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v12

    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Expected preview format not supported!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to obtain scaler stream configuration map. This is a bug in device!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public closeImage(Landroid/media/Image;)V
    .locals 4

    invoke-virtual {p1}, Landroid/media/Image;->close()V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mNumImagesAlive:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    const-string v0, "[close] Active images: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$1700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Closing image reader"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/ImageReader;->close()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$1500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->captureFrameForRecognition()V

    :cond_2
    return-void
.end method

.method public dispose()V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDisposed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mUIQueue:Lcom/microblink/camera/util/IProcessingQueue;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDisposed:Z

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    if-eqz v1, :cond_0

    const-string v1, "Late closing ImageReader"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    invoke-virtual {v1}, Landroid/media/ImageReader;->close()V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    :cond_0
    return-void
.end method

.method public doesCameraHaveSurface()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

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

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->dispose()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getCameraSensorOrientation()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSensorOrientation:I

    return v0
.end method

.method public getCurrentPreviewSize()Lcom/microblink/camera/hardware/camera/ImageSize;
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lcom/microblink/camera/hardware/camera/ImageSize;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSize:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/microblink/camera/hardware/camera/ImageSize;-><init>(II)V

    return-object v1
.end method

.method public getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mOpenedCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-object v0
.end method

.method public getSurfaceHolderCallback()Landroid/view/SurfaceHolder$Callback;
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-object v0
.end method

.method public getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-object v0
.end method

.method public isAutofocusSupported()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$2000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAutofocusSupported:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public isCameraFocusing()Z
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iget v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public isCameraInFocus()Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iget v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isDeviceShaking()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->isPhoneShaking()Z

    move-result v0

    return v0
.end method

.method public isPreviewActive()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$2000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public onShakingStarted()V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    const-string v0, "Shaking started"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    :cond_1
    return-void
.end method

.method public onShakingStopped()V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    const-string v0, "Shaking stopped"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->isRequestFocusOnShakingStopInContinuousMode()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->performAutofocus()V

    :cond_2
    return-void
.end method

.method public performAutofocus()V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAutofocusSupported:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string v0, "Cannot trigger autofocus. Camera session is closed!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "Autofocus not supported, unable to trigger it"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setMeteringAreas([Landroid/graphics/Rect;)V
    .locals 9

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->isMeteringAreaBuggy()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_a

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    if-lez v2, :cond_1

    array-length v3, p1

    if-ge v3, v2, :cond_0

    array-length v2, p1

    :cond_0
    new-array v2, v2, [Landroid/hardware/camera2/params/MeteringRectangle;

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    if-lez v3, :cond_3

    array-length v4, p1

    if-ge v4, v3, :cond_2

    array-length v3, p1

    :cond_2
    new-array v3, v3, [Landroid/hardware/camera2/params/MeteringRectangle;

    goto :goto_1

    :cond_3
    move-object v3, v0

    :goto_1
    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    if-lez v4, :cond_5

    array-length v0, p1

    if-ge v0, v4, :cond_4

    array-length v4, p1

    :cond_4
    new-array v0, v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    :cond_5
    const/4 v4, 0x0

    :goto_2
    array-length v5, p1

    if-ge v4, v5, :cond_9

    iget v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    const/16 v6, 0x3e8

    if-ge v4, v5, :cond_6

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    aget-object v7, p1, v4

    invoke-direct {p0, v7}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->calcAbsoluteMeteringArea(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-direct {v5, v7, v6}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v5, v2, v4

    :cond_6
    iget v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    if-ge v4, v5, :cond_7

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    aget-object v7, p1, v4

    invoke-direct {p0, v7}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->calcAbsoluteMeteringArea(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-direct {v5, v7, v6}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v5, v3, v4

    :cond_7
    iget v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    if-ge v4, v5, :cond_8

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    aget-object v7, p1, v4

    invoke-direct {p0, v7}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->calcAbsoluteMeteringArea(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-direct {v5, v7, v6}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v5, v0, v4

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_9
    move-object v8, v2

    move-object v2, v0

    move-object v0, v8

    goto :goto_3

    :cond_a
    move-object v2, v0

    move-object v3, v2

    :goto_3
    const/4 v4, 0x1

    if-eqz v0, :cond_b

    :goto_4
    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v6, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v5, v6, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAFRegions:I

    if-lez v0, :cond_c

    new-array v0, v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    iget-object v6, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-direct {v5, v6, v1}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v5, v0, v1

    goto :goto_4

    :cond_c
    :goto_5
    if-eqz v3, :cond_d

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v5, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_6

    :cond_d
    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAERegions:I

    if-lez v0, :cond_e

    new-array v0, v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    new-instance v3, Landroid/hardware/camera2/params/MeteringRectangle;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-direct {v3, v5, v1}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v3, v0, v1

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v3, v5, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_e
    :goto_6
    if-eqz v2, :cond_f

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_7

    :cond_f
    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMaxAWBRegions:I

    if-lez v0, :cond_10

    new-array v0, v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    new-instance v2, Landroid/hardware/camera2/params/MeteringRectangle;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-direct {v2, v3, v1}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_10
    :goto_7
    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMeteringAreas:[Landroid/graphics/Rect;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$6;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$6;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    invoke-interface {p1, v0}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_11
    return-void
.end method

.method public setShakeCallback(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mShakeCallback:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method

.method public setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;ZLcom/microblink/camera/hardware/SuccessCallback;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setZoomLevel(F)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->getScalerCropRegionForZoomLevel(F)Landroid/graphics/Rect;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mPreviewBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mActiveScalerCropRegion:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mMeteringAreas:[Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->setMeteringAreas([Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public startPreview(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraLikeActive:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "Start preview has already been called. Ignoring this call!"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    if-eqz p1, :cond_1

    const-string p1, "Detected non-closed ImageReader from previous session. Closing it"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    invoke-virtual {p1}, Landroid/media/ImageReader;->close()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mImageReader:Landroid/media/ImageReader;

    :cond_1
    const-string p1, "Camera2Manager.startPreview"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraLikeActive:Z

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraStartupCallback:Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->reset()V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;

    invoke-direct {p2, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    invoke-interface {p1, p2}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopPreview()V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraLikeActive:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Stop preview has already been called. Ignoring this call!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraLikeActive:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const-string v0, "Camera should be closed immediately after opening..."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mShouldImmediatelyCloseCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mState:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$1500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v0, "Camera2Manager.stopPreview"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    new-instance v3, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;

    invoke-direct {v3, p0, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v2, v3}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :try_start_0
    const-string v2, "Waiting for camera preview to stop..."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

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
