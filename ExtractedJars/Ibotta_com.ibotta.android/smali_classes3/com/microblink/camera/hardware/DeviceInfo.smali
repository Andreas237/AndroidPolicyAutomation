.class public Lcom/microblink/camera/hardware/DeviceInfo;
.super Ljava/lang/Object;


# instance fields
.field private mBlacklistedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mCameraInitDelay:I

.field private mDevice:Ljava/lang/String;

.field private mDisplayOrientationNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mEglPbufferNotSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mFocusUntrustyInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mForceUseLegacyCamera:Lcom/microblink/camera/hardware/VersionInterval;

.field private mFrameQualityFactor:D

.field private mMaxZoomLevel:D

.field private mMeteringNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mMinZoomLevel:D

.field private mModel:Ljava/lang/String;

.field private mNaturalOrientationIsLandscapeLeftInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mOptimalBackFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

.field private mOptimalBackFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

.field private mOptimalFrontFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

.field private mOptimalFrontFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

.field private mPhaseAutofocusSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

.field private mZeroCopyBufferAllowedInVersions:Lcom/microblink/camera/hardware/VersionInterval;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mCameraInitDelay:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMinZoomLevel:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMaxZoomLevel:D

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFrameQualityFactor:D

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iput-object p1, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDevice:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mModel:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Device and Model cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mCameraInitDelay:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMinZoomLevel:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMaxZoomLevel:D

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFrameQualityFactor:D

    const-string v0, "::"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    aget-object v1, p2, v0

    iput-object v1, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mModel:Ljava/lang/String;

    const/4 v1, 0x0

    aget-object p2, p2, v1

    iput-object p2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDevice:Ljava/lang/String;

    const-string p2, "backFacingPreviewSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "backFacingPreviewSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getInt(I)I

    move-result p2

    invoke-direct {v2, v3, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;-><init>(II)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalBackFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    :cond_0
    const-string p2, "backFacingPictureSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "backFacingPictureSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getInt(I)I

    move-result p2

    invoke-direct {v2, v3, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;-><init>(II)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalBackFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    :cond_1
    const-string p2, "frontFacingPreviewSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "frontFacingPreviewSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getInt(I)I

    move-result p2

    invoke-direct {v2, v3, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;-><init>(II)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalFrontFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    :cond_2
    const-string p2, "frontFacingPictureSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, "frontFacingPictureSize"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getInt(I)I

    move-result p2

    invoke-direct {v2, v1, p2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;-><init>(II)V

    iput-object v2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalFrontFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    :cond_3
    const-string p2, "cameraInitDelayMs"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "cameraInitDelayMs"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mCameraInitDelay:I

    :cond_4
    const-string p2, "minZoomLevel"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "minZoomLevel"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMinZoomLevel:D

    :cond_5
    const-string p2, "maxZoomLevel"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "maxZoomLevel"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMaxZoomLevel:D

    :cond_6
    const-string p2, "blacklisted"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p2, "blacklisted"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mBlacklistedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_7
    const-string p2, "displayOrientationNotWorking"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_8

    const-string p2, "displayOrientationNotWorking"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDisplayOrientationNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_8
    const-string p2, "naturalOrientationIsLandscapeLeft"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    const-string p2, "naturalOrientationIsLandscapeLeft"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mNaturalOrientationIsLandscapeLeftInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_9
    const-string p2, "focusUntrusty"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    const-string p2, "focusUntrusty"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFocusUntrustyInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_a
    const-string p2, "meteringNotWorking"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "meteringNotWorking"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMeteringNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_b
    const-string p2, "zeroCopyBufferAllowed"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    const-string p2, "zeroCopyBufferAllowed"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mZeroCopyBufferAllowedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_c
    const-string p2, "eglPbufferNotSupported"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_d

    const-string p2, "eglPbufferNotSupported"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mEglPbufferNotSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_d
    const-string p2, "frameQualityFactor"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_e

    const-string p2, "frameQualityFactor"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFrameQualityFactor:D

    :cond_e
    const-string p2, "phaseAutoFocusSupported"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_f

    const-string p2, "phaseAutoFocusSupported"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {v0, p2}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mPhaseAutofocusSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_f
    const-string p2, "forceUseLegacyCamera"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_10

    const-string p2, "forceUseLegacyCamera"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/microblink/camera/hardware/VersionInterval;

    invoke-direct {p2, p1}, Lcom/microblink/camera/hardware/VersionInterval;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mForceUseLegacyCamera:Lcom/microblink/camera/hardware/VersionInterval;

    :cond_10
    return-void
.end method


# virtual methods
.method getBlacklistedInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mBlacklistedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public getCameraInitDelay()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mCameraInitDelay:I

    return v0
.end method

.method public getDevice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDevice:Ljava/lang/String;

    return-object v0
.end method

.method getDisplayOrientationNotWorkingInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDisplayOrientationNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method getEglPbufferNotSupportedInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mEglPbufferNotSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method getFocusUntrustyInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFocusUntrustyInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method getForceUseLegacyCamera()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mForceUseLegacyCamera:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public getFrameQualityFactor()D
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mFrameQualityFactor:D

    return-wide v0
.end method

.method public getMaxZoomLevel()D
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMaxZoomLevel:D

    return-wide v0
.end method

.method getMeteringNotWorkingInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMeteringNotWorkingInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public getMinZoomLevel()D
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mMinZoomLevel:D

    return-wide v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mModel:Ljava/lang/String;

    return-object v0
.end method

.method getNaturalOrientationIsLandscapeLeftInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mNaturalOrientationIsLandscapeLeftInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public getOptimalBackFacingPictureSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalBackFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    return-object v0
.end method

.method public getOptimalBackFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalBackFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    return-object v0
.end method

.method public getOptimalFrontFacingPictureSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalFrontFacingPictureSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    return-object v0
.end method

.method public getOptimalFrontFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mOptimalFrontFacingPreviewSize:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    return-object v0
.end method

.method getPhaseAutofocusSupportedInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mPhaseAutofocusSupportedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public getUniqueName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDevice:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getZeroCopyBufferAllowedInVersions()Lcom/microblink/camera/hardware/VersionInterval;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mZeroCopyBufferAllowedInVersions:Lcom/microblink/camera/hardware/VersionInterval;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeviceInfo{mDevice=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mDevice:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mModel=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/camera/hardware/DeviceInfo;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
