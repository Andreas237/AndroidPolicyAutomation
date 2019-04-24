.class public Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;
.super Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# static fields
.field private static final checkForSupportedPhaseAFModes:Z = true


# instance fields
.field private final mPreviewCallback:Landroid/hardware/Camera$PreviewCallback;

.field private mSlaveDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    new-instance p1, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;

    invoke-direct {p1, p0}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mPreviewCallback:Landroid/hardware/Camera$PreviewCallback;

    invoke-virtual {p5}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getSlaveAccelerometerDelegate()Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mSlaveDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mSlaveDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->dispose()V

    return-void
.end method

.method protected getPreviewCallback()Landroid/hardware/Camera$PreviewCallback;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mPreviewCallback:Landroid/hardware/Camera$PreviewCallback;

    return-object v0
.end method

.method public onShakingStarted()V
    .locals 1

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->onShakingStarted()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mSlaveDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStarted()V

    :cond_0
    return-void
.end method

.method public onShakingStopped()V
    .locals 1

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->onShakingStopped()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mSlaveDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;->onShakingStopped()V

    :cond_0
    return-void
.end method

.method protected prepareCameraParameteresAndFocusManager(Landroid/hardware/Camera$Parameters;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldOptimizeForNearScan()Z

    move-result v1

    const/16 v2, 0x10

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    const-string v1, "Optimizing camera parameters for near scanning"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_0

    if-eqz v0, :cond_0

    const-string v1, "continuous-picture"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "continuous-picture"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated continous picture autofocus"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2, v3}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;Z)V

    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    const-string v1, "macro"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "macro"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated macro focus mode"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    const-string v1, "auto"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "auto"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated autofocus"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_0

    :cond_2
    const-string v0, "Autofocus not supported"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldCrashIfAutofocusNotSupported()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;

    invoke-direct {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;-><init>()V

    :goto_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getInitialZoomLevel()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    const v2, 0x3e4ccccd    # 0.2f

    invoke-virtual {v1, v2}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setInitialZoomLevel(F)V

    goto/16 :goto_3

    :cond_3
    new-instance p1, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;

    const-string v0, "Autofocus is required, but not supported on this device"

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string v1, "Optimizing camera parameters for default scanning"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_5

    if-eqz v0, :cond_5

    const-string v1, "continuous-picture"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v0, "continuous-picture"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated continous picture autofocus"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2, v4}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;Z)V

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_6

    const-string v1, "auto"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v0, "auto"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated autofocus"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    :goto_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    const-string v1, "macro"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "macro"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    const-string v0, "Activated macro focus mode"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;-><init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V

    goto :goto_2

    :cond_7
    const-string v0, "Autofocus not supported"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAutofocusSupported:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldCrashIfAutofocusNotSupported()Z

    move-result v0

    if-nez v0, :cond_11

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;

    invoke-direct {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;-><init>()V

    :cond_8
    :goto_3
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_9

    const-string v2, "off"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v1, "off"

    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    const-string v1, "Setting flash mode to OFF!"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    const-string v2, "Flash mode OFF not supported!!!!"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p0, v2, v5}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v1, :cond_a

    const-string v2, "Supported flash modes:"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p0, v2, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p0, v2, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    :goto_5
    const-string v1, "phase-af-values"

    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Supported Phase AutoFocus modes: {}"

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v1, v5, v4

    invoke-static {p0, v2, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v1, :cond_c

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v2, :cond_c

    aget-object v6, v1, v5

    const-string v7, "on"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const-string v6, "Activating Phase Autofocus!"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {p0, v6, v7}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v6, "phase-af"

    const-string v7, "on"

    invoke-virtual {p1, v6, v7}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_c
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedWhiteBalance()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_d

    const-string v2, "auto"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "auto"

    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setWhiteBalance(Ljava/lang/String;)V

    const-string v1, "Activated automatic white balance correction"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    const-string v1, "Automatic white balance not supported!!!"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-lt v1, v2, :cond_e

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->isVideoStabilizationSupported()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "Enabling video stabilization"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Landroid/hardware/Camera$Parameters;->setVideoStabilization(Z)V

    :cond_e
    const-string v1, "Nexus 4"

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1, v3}, Landroid/hardware/Camera$Parameters;->setRecordingHint(Z)V

    const/16 v1, 0xcc0

    const/16 v2, 0x990

    invoke-virtual {p1, v1, v2}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    goto :goto_8

    :cond_f
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getModel()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Glass"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/16 v1, 0x7530

    invoke-virtual {p1, v1, v1}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    goto :goto_8

    :cond_10
    const/16 v1, 0x1e

    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setPreviewFrameRate(I)V

    :goto_8
    const-string v1, "Final parameters: {}"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v4

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_11
    new-instance p1, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;

    const-string v0, "Autofocus is required, but not supported on this device"

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/camera/AutoFocusRequiredButNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
