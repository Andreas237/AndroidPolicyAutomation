.class public Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;
.super Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# instance fields
.field protected final mPhotoCallback:Landroid/hardware/Camera$PictureCallback;

.field protected volatile mPhotographyInProgress:Z

.field protected final mPreviewCallback:Landroid/hardware/Camera$PreviewCallback;

.field protected final shutterCallback_:Landroid/hardware/Camera$ShutterCallback;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotographyInProgress:Z

    new-instance p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$3;

    invoke-direct {p1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$3;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->shutterCallback_:Landroid/hardware/Camera$ShutterCallback;

    new-instance p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;

    invoke-direct {p1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotoCallback:Landroid/hardware/Camera$PictureCallback;

    new-instance p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;

    invoke-direct {p1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewCallback:Landroid/hardware/Camera$PreviewCallback;

    return-void
.end method


# virtual methods
.method protected getPreviewCallback()Landroid/hardware/Camera$PreviewCallback;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected isUsingBufferedCallback()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onShakingStopped()V
    .locals 0

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->onShakingStopped()V

    return-void
.end method

.method protected prepareCameraParameteresAndFocusManager(Landroid/hardware/Camera$Parameters;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "macro"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "macro"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated macro focus mode"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v2, v3}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    const-string v2, "auto"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "auto"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated autofocus"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v2, v3}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_0

    :cond_1
    const-string v0, "Autofocus not supported"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldCrashIfAutofocusNotSupported()Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;

    invoke-direct {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;-><init>()V

    :goto_1
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "auto"

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "auto"

    invoke-virtual {p1, v2}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedWhiteBalance()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "auto"

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "auto"

    invoke-virtual {p1, v2}, Landroid/hardware/Camera$Parameters;->setWhiteBalance(Ljava/lang/String;)V

    const-string v2, "Activated automatic white balance correction"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const-string v2, "Automatic white balance not supported!!!"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p0, v2, v3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x8

    if-lt v2, v3, :cond_4

    const/16 v2, 0x100

    invoke-virtual {p1, v2}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    :cond_4
    const/16 v2, 0x28

    invoke-virtual {p1, v2}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    instance-of v2, v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    check-cast v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v3}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v4}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;->getOptimalPhotoSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Picture size is: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v3, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget v1, v2, Landroid/hardware/Camera$Size;->width:I

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p1, v1, v2}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    return-object v0

    :cond_5
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "PhotoCameraManager should have a camera strategy that is instance of PhotoPreviewCameraStrategy in order to be able to calculate photo image size. Without this, Windfall will most likely crash!"

    invoke-static {p0, v0, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PhotoCameraManager should have a camera strategy that is instance of PhotoPreviewCameraStrategy in order to be able to calculate photo image size."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;

    const-string v0, "Autofocus is required, but not supported on this device"

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public recycleFrame(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V
    .locals 4

    instance-of v0, p1, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewActive:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewActive:Z

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->getCameraInitDelay()I

    move-result v2

    int-to-long v2, v2

    invoke-interface {v0, v1, v2, v3}, Lcom/microblink/camera/util/IProcessingQueue;->postJobDelayed(Ljava/lang/Runnable;J)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to restart camera preview"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->recycleFrame(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V

    return-void
.end method

.method public takePicture()V
    .locals 2

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void
.end method
