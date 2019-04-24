.class public Lcom/microblink/camera/hardware/camera/CameraSettings;
.super Ljava/lang/Object;


# instance fields
.field private mCameraFrameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

.field private mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

.field private mCrashIfAutofocusNotSupported:Z

.field private mForceTextureView:Z

.field private mInitialZoomLevel:F

.field private mMaxAllowedPhotoDimension:I

.field private mMinAllowedVideoResolution:I

.field private mOptimizeForNearScan:Z

.field private mRequestFocusOnShakingStopInContinuousMode:Z

.field private mResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field private mShouldAlwaysUsePhotoMode:Z

.field private mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field private mUseLegacyCamera:Z

.field private mUseMegapixelsTargetForChoosingPhotoSize:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mShouldAlwaysUsePhotoMode:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mOptimizeForNearScan:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCrashIfAutofocusNotSupported:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseMegapixelsTargetForChoosingPhotoSize:Z

    const v1, 0x38400

    iput v1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMinAllowedVideoResolution:I

    const/16 v1, 0x7d0

    iput v1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMaxAllowedPhotoDimension:I

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    const/4 v1, 0x0

    iput v1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mInitialZoomLevel:F

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseLegacyCamera:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mForceTextureView:Z

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    invoke-direct {v1}, Lcom/microblink/camera/hardware/camera/CameraFrameFactory;-><init>()V

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraFrameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mRequestFocusOnShakingStopInContinuousMode:Z

    return-void
.end method


# virtual methods
.method public getCameraFrameFactory()Lcom/microblink/camera/hardware/camera/CameraFrameFactory;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraFrameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    return-object v0
.end method

.method public getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-object v0
.end method

.method public getInitialZoomLevel()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mInitialZoomLevel:F

    return v0
.end method

.method public getMaxAllowedPhotoDimension()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMaxAllowedPhotoDimension:I

    return v0
.end method

.method public getMinAllowedVideoResolution()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMinAllowedVideoResolution:I

    return v0
.end method

.method public getSlaveAccelerometerDelegate()Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-object v0
.end method

.method public getVideoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object v0
.end method

.method public isForceTextureView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mForceTextureView:Z

    return v0
.end method

.method public isRequestFocusOnShakingStopInContinuousMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mRequestFocusOnShakingStopInContinuousMode:Z

    return v0
.end method

.method public isUseLegacyCamera()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseLegacyCamera:Z

    return v0
.end method

.method public isUseMegapixelsTargetForChoosingPhotoSize()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseMegapixelsTargetForChoosingPhotoSize:Z

    return v0
.end method

.method public setCameraFrameFactory(Lcom/microblink/camera/hardware/camera/CameraFrameFactory;)V
    .locals 0
    .param p1    # Lcom/microblink/camera/hardware/camera/CameraFrameFactory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraFrameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    return-void
.end method

.method public setCameraType(Lcom/microblink/camera/hardware/camera/CameraType;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCameraType:Lcom/microblink/camera/hardware/camera/CameraType;

    return-void
.end method

.method public setCrashIfAutofocusNotSupported(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCrashIfAutofocusNotSupported:Z

    return-void
.end method

.method public setForceTextureView(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mForceTextureView:Z

    return-void
.end method

.method public setInitialZoomLevel(F)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mInitialZoomLevel:F

    return-void
.end method

.method public setMaxAllowedPhotoDimension(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMaxAllowedPhotoDimension:I

    return-void
.end method

.method public setMinAllowedVideoResolution(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mMinAllowedVideoResolution:I

    return-void
.end method

.method public setOptimizeForNearScan(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mOptimizeForNearScan:Z

    return-void
.end method

.method public setRequestFocusOnShakingStopInContinuousMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mRequestFocusOnShakingStopInContinuousMode:Z

    return-void
.end method

.method public setShouldAlwaysUsePhotoMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mShouldAlwaysUsePhotoMode:Z

    return-void
.end method

.method public setSlaveAccelerometerDelegate(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mSlaveAccelerometerDelegate:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method

.method public setUseLegacyCamera(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseLegacyCamera:Z

    return-void
.end method

.method public setUseMegapixelsTargetForChoosingPhotoSize(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mUseMegapixelsTargetForChoosingPhotoSize:Z

    return-void
.end method

.method public setVideoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-void

    :cond_0
    sget-object p1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-void
.end method

.method public shouldAlwaysUsePhotoMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mShouldAlwaysUsePhotoMode:Z

    return v0
.end method

.method public shouldCrashIfAutofocusNotSupported()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mCrashIfAutofocusNotSupported:Z

    return v0
.end method

.method public shouldOptimizeForNearScan()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/CameraSettings;->mOptimizeForNearScan:Z

    return v0
.end method
