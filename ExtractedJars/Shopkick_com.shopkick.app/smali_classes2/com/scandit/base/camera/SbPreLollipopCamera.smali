.class public Lcom/scandit/base/camera/SbPreLollipopCamera;
.super Lcom/scandit/base/camera/SbICamera;
.source "SbPreLollipopCamera.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;
    }
.end annotation


# static fields
.field private static final CAMERA_CLOSED:I = 0x1

.field private static final CAMERA_INITIALIZED:I = 0x0

.field private static final INFINITY_FOCUS_WAIT_TIME:I = 0x3e8

.field private static final NUMBER_OF_PREVIEW_BUFFERS_HIGH_END:I = 0x2

.field private static final NUMBER_OF_PREVIEW_BUFFERS_LOW_END:I = 0x1


# instance fields
.field private mActualZoom:F

.field private mCamera:Landroid/hardware/Camera;

.field private mCameraId:I

.field private mCanTriggerAutoFocus:Z

.field private mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field private mHandler:Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

.field protected mHasMacroMode:Z

.field private mImageDescription:Lcom/scandit/recognition/ImageDescription;

.field private mImageMetadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

.field private mInfinityFocusRequestTime:J

.field private mIsAutoFocusTriggered:Z

.field private mLastAutoFocusTime:J

.field private mMaxZoom:I

.field private mNativePreviewCallback:Landroid/hardware/Camera$PreviewCallback;

.field private mNumBuffers:I

.field private mReceivedFirstFrame:Z

.field private mSupportedFocusBitMask:I

.field private mTargetAbsoluteZoom:I

.field private mTargetRelativeZoom:F

.field private mTorchMode:Ljava/lang/String;

.field private mVideoBuffers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 3

    .line 77
    invoke-direct {p0}, Lcom/scandit/base/camera/SbICamera;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    const/4 v1, -0x1

    .line 50
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    const/4 v1, 0x0

    .line 52
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHasMacroMode:Z

    .line 53
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mReceivedFirstFrame:Z

    .line 55
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    .line 59
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mSupportedFocusBitMask:I

    const-string v2, "off"

    .line 61
    iput-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchMode:Ljava/lang/String;

    .line 62
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    .line 63
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetAbsoluteZoom:I

    const/4 v2, 0x0

    .line 64
    iput v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetRelativeZoom:F

    const/4 v2, 0x1

    .line 66
    iput-boolean v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    .line 67
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mIsAutoFocusTriggered:Z

    const-wide/16 v1, -0x1

    .line 68
    iput-wide v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    .line 69
    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-wide/16 v1, 0x0

    .line 71
    iput-wide v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mLastAutoFocusTime:J

    .line 72
    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHandler:Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 73
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualZoom:F

    .line 78
    new-instance v1, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    invoke-direct {v1, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;-><init>(Lcom/scandit/base/camera/SbPreLollipopCamera$1;)V

    iput-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHandler:Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    .line 79
    new-instance v0, Lcom/scandit/base/camera/SbPreLollipopCamera$1;

    invoke-direct {v0, p0}, Lcom/scandit/base/camera/SbPreLollipopCamera$1;-><init>(Lcom/scandit/base/camera/SbPreLollipopCamera;)V

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mNativePreviewCallback:Landroid/hardware/Camera$PreviewCallback;

    return-void
.end method

.method static synthetic access$100(Lcom/scandit/base/camera/SbPreLollipopCamera;)Z
    .locals 0

    .line 40
    iget-boolean p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mReceivedFirstFrame:Z

    return p0
.end method

.method static synthetic access$1002(Lcom/scandit/base/camera/SbPreLollipopCamera;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    return p1
.end method

.method static synthetic access$102(Lcom/scandit/base/camera/SbPreLollipopCamera;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mReceivedFirstFrame:Z

    return p1
.end method

.method static synthetic access$200(Lcom/scandit/base/camera/SbPreLollipopCamera;)Z
    .locals 0

    .line 40
    iget-boolean p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mIsAutoFocusTriggered:Z

    return p0
.end method

.method static synthetic access$202(Lcom/scandit/base/camera/SbPreLollipopCamera;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mIsAutoFocusTriggered:Z

    return p1
.end method

.method static synthetic access$300(Lcom/scandit/base/camera/SbPreLollipopCamera;)J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    return-wide v0
.end method

.method static synthetic access$302(Lcom/scandit/base/camera/SbPreLollipopCamera;J)J
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    return-wide p1
.end method

.method static synthetic access$400(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0
.end method

.method static synthetic access$402(Lcom/scandit/base/camera/SbPreLollipopCamera;Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p1
.end method

.method static synthetic access$500(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/recognition/ImageDescription;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    return-object p0
.end method

.method static synthetic access$600(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/base/camera/capturedImage/ImageMetadata;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageMetadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    return-object p0
.end method

.method static synthetic access$700(Lcom/scandit/base/camera/SbPreLollipopCamera;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->handlePotentialPendingFocusEvent()V

    return-void
.end method

.method static synthetic access$800(Lcom/scandit/base/camera/SbPreLollipopCamera;)F
    .locals 0

    .line 40
    iget p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualZoom:F

    return p0
.end method

.method static synthetic access$900(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHandler:Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    return-object p0
.end method

.method private changeToZoom(I)V
    .locals 2

    .line 777
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 780
    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 783
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 784
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->isZoomSupported()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 785
    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->setZoom(I)V

    .line 786
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getZoomRatios()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    iput p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualZoom:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 788
    :try_start_1
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string p1, "ScanditSDK"

    const-string v0, "setParameters failed"

    .line 791
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    const-string p1, "ScanditSDK"

    const-string v0, "failed to change zoom."

    .line 795
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private convertFocusModeToString(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 588
    sget-object v0, Lcom/scandit/base/camera/SbPreLollipopCamera$3;->$SwitchMap$com$scandit$base$camera$SbFocusEvent$FocusMode:[I

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 599
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Should not happen"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const-string p1, "macro"

    return-object p1

    :pswitch_1
    const-string p1, "infinity"

    return-object p1

    .line 593
    :pswitch_2
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getContinuousFocusModeString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    const-string p1, "auto"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private determineMaxZoomIndex(Landroid/hardware/Camera$Parameters;)I
    .locals 0

    .line 403
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getZoomRatios()Ljava/util/List;

    move-result-object p1

    .line 404
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private getNumberOfPreviewBuffers(Landroid/content/Context;)I
    .locals 3

    .line 475
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0xe

    if-ge v0, v2, :cond_0

    return v1

    .line 478
    :cond_0
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    const-string v2, "armeabi"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const-string v0, "activity"

    .line 498
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    .line 499
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result p1

    const/16 v0, 0x40

    if-lt p1, v0, :cond_2

    const/4 v1, 0x2

    :cond_2
    return v1
.end method

.method private getPictureSize(Landroid/hardware/Camera$Parameters;II)Landroid/hardware/Camera$Size;
    .locals 8

    int-to-float v0, p2

    int-to-float p3, p3

    div-float/2addr v0, p3

    .line 326
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, 0x0

    const v1, 0x7fffffff

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    .line 327
    iget v3, v2, Landroid/hardware/Camera$Size;->width:I

    sub-int v3, p2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 328
    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    int-to-float v4, v4

    iget v5, v2, Landroid/hardware/Camera$Size;->height:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    sub-float/2addr v4, v0

    .line 329
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-double v4, v4

    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v4, v4, v6

    if-gez v4, :cond_0

    if-ge v3, v1, :cond_0

    move-object p3, v2

    move v1, v3

    goto :goto_0

    :cond_1
    return-object p3
.end method

.method private handlePotentialPendingFocusEvent()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->isReadyForFocusEvents()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHandler:Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    const/4 v1, 0x1

    .line 118
    invoke-virtual {v0, v1, p0}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method private initCameraAfterStart(Landroid/content/Context;)Z
    .locals 4

    .line 251
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 254
    :cond_0
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mReceivedFirstFrame:Z

    .line 255
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 256
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mIsAutoFocusTriggered:Z

    const-wide/16 v2, -0x1

    .line 257
    iput-wide v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    .line 261
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 267
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    sget v3, Lcom/scandit/base/camera/SbPreLollipopCamera;->DEFAULT_EXPOSURE_COMPENSATION:F

    invoke-virtual {v2, v0, v3}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V

    .line 268
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mExposureTargetBias:Ljava/lang/Float;

    if-eqz v2, :cond_1

    .line 269
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mExposureTargetBias:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v0, v2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    .line 272
    :cond_1
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 273
    invoke-direct {p0, v0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initPreviewResolution(Landroid/hardware/Camera$Parameters;Landroid/content/Context;)V

    .line 274
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initFocusControl(Landroid/hardware/Camera$Parameters;)V

    .line 275
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initTorch(Landroid/hardware/Camera$Parameters;)V

    .line 276
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initZoom(Landroid/hardware/Camera$Parameters;)V

    .line 279
    :try_start_1
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz v2, :cond_2

    .line 280
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    iget-object v3, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-interface {v2, v3}, Lcom/scandit/base/camera/SbIVideoPreview;->useForPreview(Landroid/hardware/Camera;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 290
    :cond_2
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->setDisplayOrientation(Landroid/content/Context;)V

    .line 292
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initPreviewCallback(Landroid/hardware/Camera$Parameters;)V

    .line 295
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->shouldUseTextureView()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz p1, :cond_4

    .line 303
    :cond_3
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    :cond_4
    const-string p1, ""

    .line 307
    invoke-virtual {p0, v1, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :catch_0
    const-string p1, "ScanditSDK"

    const-string v0, "SbCamera.setPreviewSurface() failed"

    .line 286
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :catch_1
    const-string p1, "ScanditSDK"

    const-string v0, "SbCamera.setPreviewSurface() failed"

    .line 283
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :catch_2
    const-string p1, "ScanditSDK"

    const-string v0, "Failed to get camera parameters"

    .line 263
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method private initFocusControl(Landroid/hardware/Camera$Parameters;)V
    .locals 2

    .line 374
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object p1

    .line 375
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 376
    invoke-static {p1, v0}, Lcom/scandit/base/camera/SbFocusUtils;->curateSupportedFocusModes(Ljava/util/List;Lcom/scandit/base/camera/profiles/DeviceProfile;)Ljava/util/List;

    move-result-object p1

    .line 378
    invoke-static {p1}, Lcom/scandit/base/camera/SbFocusUtils;->getFocusingModeBitMask(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mSupportedFocusBitMask:I

    const-string v0, "macro"

    .line 379
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHasMacroMode:Z

    .line 380
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mLastAutoFocusTime:J

    const/4 p1, 0x1

    .line 381
    iput-boolean p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    return-void
.end method

.method private initPreviewCallback(Landroid/hardware/Camera$Parameters;)V
    .locals 3

    .line 429
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p1

    .line 431
    iget v0, p1, Landroid/hardware/Camera$Size;->width:I

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreviewWidth:I

    .line 432
    iget v0, p1, Landroid/hardware/Camera$Size;->height:I

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreviewHeight:I

    const/16 v0, 0x11

    .line 434
    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v0

    .line 438
    iget v1, p1, Landroid/hardware/Camera$Size;->width:I

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v1, p1

    mul-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x8

    .line 441
    invoke-direct {p0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->needsBufferAllocation(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 442
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 443
    :goto_0
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mNumBuffers:I

    if-ge p1, v0, :cond_0

    .line 444
    new-array v0, v1, [B

    .line 445
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 448
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->resetCallbackBuffers()V

    return-void
.end method

.method private initPreviewResolution(Landroid/hardware/Camera$Parameters;Landroid/content/Context;)V
    .locals 5

    .line 341
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    .line 342
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 343
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    .line 344
    new-instance v3, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v3, v4, v2}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;-><init>(II)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    invoke-virtual {v0, p2, v1}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy;->getResolution(Landroid/content/Context;Ljava/util/List;)Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    move-result-object p2

    .line 351
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyNoteOne(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "VM670"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 352
    :cond_1
    new-instance p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    const/16 v0, 0x280

    const/16 v1, 0x1e0

    invoke-direct {p2, v0, v1}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;-><init>(II)V

    .line 355
    :cond_2
    invoke-direct {p0, p2}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initializeImageDescription(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V

    .line 357
    iget v0, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget v1, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 361
    iget v0, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget v1, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-direct {p0, p1, v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->getPictureSize(Landroid/hardware/Camera$Parameters;II)Landroid/hardware/Camera$Size;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 363
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p1, v1, v0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 366
    :cond_3
    iget v0, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreviewWidth:I

    .line 367
    iget p2, p2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    iput p2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreviewHeight:I

    .line 369
    iget-object p2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method private initTorch(Landroid/hardware/Camera$Parameters;)V
    .locals 2

    .line 385
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFlashModeForTorch(Landroid/hardware/Camera$Parameters;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchMode:Ljava/lang/String;

    .line 386
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->hasTorch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0}, Lcom/scandit/base/util/Observable;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 388
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchMode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_0

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    const-string v0, "off"

    .line 392
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 394
    :goto_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    goto :goto_1

    .line 398
    :cond_1
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private initZoom(Landroid/hardware/Camera$Parameters;)V
    .locals 3

    .line 408
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->isZoomSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->determineMaxZoomIndex(Landroid/hardware/Camera$Parameters;)I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    .line 410
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetAbsoluteZoom:I

    .line 411
    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetRelativeZoom:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_0

    .line 412
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    int-to-float v0, v0

    mul-float/2addr v1, v0

    float-to-int v0, v1

    .line 414
    :cond_0
    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 415
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualZoom:F

    if-lez v0, :cond_1

    .line 417
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setZoom(I)V

    .line 418
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getZoomRatios()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualZoom:F

    .line 420
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "ScanditSDK"

    const-string v0, "setParameters failed"

    .line 422
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private initializeImageDescription(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V
    .locals 3

    .line 237
    new-instance v0, Lcom/scandit/recognition/ImageDescription;

    invoke-direct {v0}, Lcom/scandit/recognition/ImageDescription;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    .line 238
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    sget v1, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCRCB_8U:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setLayout(I)V

    .line 239
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setWidth(I)V

    .line 240
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setHeight(I)V

    .line 241
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setFirstPlaneRowBytes(I)V

    .line 242
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setFirstPlaneOffset(I)V

    .line 243
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setSecondPlaneByteRowBytes(I)V

    .line 244
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget v2, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setSecondPlaneOffset(I)V

    .line 245
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageDescription:Lcom/scandit/recognition/ImageDescription;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    iget p1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int/2addr v1, p1

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/ImageDescription;->setMemorySize(I)V

    .line 246
    new-instance p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    invoke-direct {p1}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;-><init>()V

    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mImageMetadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    return-void
.end method

.method private needsBufferAllocation(I)Z
    .locals 3

    .line 452
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mNumBuffers:I

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    return v2

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 456
    array-length v1, v1

    if-eq v1, p1, :cond_1

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private openCamera(I)V
    .locals 3

    if-ltz p1, :cond_0

    .line 183
    iput p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    .line 184
    invoke-static {p1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    goto :goto_1

    .line 187
    :cond_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result p1

    .line 188
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 190
    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 191
    iget v2, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v2, :cond_1

    .line 192
    iput v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 195
    :cond_2
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    :goto_1
    return-void
.end method

.method private setupAutoFocusOnArea(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;Lcom/scandit/base/camera/SbFocusEvent$Area;)V
    .locals 7

    .line 654
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 658
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mLastAutoFocusTime:J

    sub-long/2addr v0, v2

    const/16 v2, 0x2710

    int-to-long v2, v2

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 661
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    if-nez v0, :cond_2

    .line 664
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "ScanditSDK"

    const-string v2, "cancelAutoFocus failed"

    .line 666
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 668
    :goto_1
    iput-boolean v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    .line 671
    :cond_2
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    if-eqz v0, :cond_5

    .line 674
    new-instance v0, Landroid/graphics/Rect;

    .line 675
    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getLeft()F

    move-result v2

    const/high16 v3, 0x44fa0000    # 2000.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    add-int/lit16 v2, v2, -0x3e8

    .line 676
    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getTop()F

    move-result v4

    mul-float/2addr v4, v3

    float-to-int v4, v4

    add-int/lit16 v4, v4, -0x3e8

    .line 677
    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getLeft()F

    move-result v5

    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getWidth()F

    move-result v6

    add-float/2addr v5, v6

    mul-float/2addr v5, v3

    float-to-int v5, v5

    add-int/lit16 v5, v5, -0x3e8

    .line 678
    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getTop()F

    move-result v6

    invoke-virtual {p2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getHeight()F

    move-result p2

    add-float/2addr v6, p2

    mul-float/2addr v6, v3

    float-to-int p2, v6

    add-int/lit16 p2, p2, -0x3e8

    invoke-direct {v0, v2, v4, v5, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 683
    :try_start_1
    iget-object p2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 688
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->convertFocusModeToString(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 689
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt p1, v2, :cond_4

    .line 690
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 691
    new-instance v2, Landroid/hardware/Camera$Area;

    invoke-direct {v2, v0, v1}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    .line 692
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 693
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 694
    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isCustomMeteringAndFocusAreaSupported()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 695
    invoke-virtual {p2, p1}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    .line 697
    :cond_3
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 698
    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isCustomMeteringAndFocusAreaSupported()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 699
    invoke-virtual {p2, p1}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    .line 703
    :cond_4
    :try_start_2
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, p2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    const-string p1, "ScanditSDK"

    const-string/jumbo p2, "setupAutoFocusOnArea: set parameters failed"

    .line 705
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_2
    const-string p1, "ScanditSDK"

    const-string/jumbo p2, "setupAutoFocusOnArea: get parameters failed"

    .line 685
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    :goto_2
    return-void
.end method

.method private setupMeteringAndFocusAreasForContinuous(Landroid/hardware/Camera$Parameters;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 740
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    return-void

    .line 743
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 745
    new-instance v1, Landroid/hardware/Camera$Area;

    new-instance v2, Landroid/graphics/Rect;

    const/16 v3, 0x12c

    const/16 v4, -0x12c

    invoke-direct {v2, v4, v4, v3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    const/16 v3, 0x3e8

    invoke-direct {v1, v2, v3}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    .line 747
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 748
    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    .line 749
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    move-result v1

    if-lez v1, :cond_1

    .line 750
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private triggerAutoFocus()V
    .locals 2

    .line 628
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 633
    :try_start_0
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCanTriggerAutoFocus:Z

    .line 634
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mLastAutoFocusTime:J

    .line 635
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 636
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    new-instance v1, Lcom/scandit/base/camera/SbPreLollipopCamera$2;

    invoke-direct {v1, p0}, Lcom/scandit/base/camera/SbPreLollipopCamera$2;-><init>(Lcom/scandit/base/camera/SbPreLollipopCamera;)V

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    const/4 v0, 0x1

    .line 647
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mIsAutoFocusTriggered:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ScanditSDK"

    const-string/jumbo v1, "setupAutoFocusOnArea: auto focus failed"

    .line 649
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 228
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 229
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 230
    iput-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    const/4 v0, -0x1

    .line 231
    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    const/4 v0, 0x1

    const-string v1, ""

    .line 233
    invoke-virtual {p0, v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    return-void
.end method

.method public getCameraToNativeDeviceOrientation()I
    .locals 4

    .line 825
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    if-ltz v0, :cond_3

    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 829
    :cond_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 830
    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 831
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->isCameraFacingFront()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    .line 832
    iget v3, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mFrontCameraSensorOrientationOverride:I

    if-eq v3, v2, :cond_1

    .line 833
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mFrontCameraSensorOrientationOverride:I

    return v0

    :cond_1
    if-nez v1, :cond_2

    .line 834
    iget v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mBackCameraSensorOrientationOverride:I

    if-eq v1, v2, :cond_2

    .line 835
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mBackCameraSensorOrientationOverride:I

    return v0

    .line 837
    :cond_2
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    return v0

    :cond_3
    :goto_0
    const/16 v0, 0x5a

    return v0
.end method

.method public getMinFocusDistance()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getRelativeZoom()F
    .locals 1

    .line 762
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetRelativeZoom:F

    return v0
.end method

.method public getSupportedFocusBitMask()I
    .locals 1

    .line 522
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mSupportedFocusBitMask:I

    return v0
.end method

.method public handleAutoFocusEventInternal(Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 2

    .line 605
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent;->hasArea()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 607
    iget-object v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iget-object v1, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-direct {p0, v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->setupAutoFocusOnArea(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;Lcom/scandit/base/camera/SbFocusEvent$Area;)V

    goto :goto_0

    .line 609
    :cond_0
    iget-object v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->setupAutoFocusGeneral(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)V

    .line 612
    :goto_0
    iget-boolean v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDisableAutoFocus:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->manualFocusPoint:Z

    if-eqz v0, :cond_2

    .line 613
    :cond_1
    invoke-direct {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->triggerAutoFocus()V

    :cond_2
    const-wide/16 v0, -0x1

    .line 616
    iput-wide v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    .line 617
    iget-object p1, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    sget-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->INFINITY:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    if-ne p1, v0, :cond_3

    .line 618
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mInfinityFocusRequestTime:J

    .line 619
    sget-object p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCurrentAutoFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    :cond_3
    return-void
.end method

.method public hasMacroMode()Z
    .locals 1

    .line 530
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mHasMacroMode:Z

    return v0
.end method

.method public hasTorch()Z
    .locals 2

    .line 526
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchMode:Ljava/lang/String;

    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isCameraFacingFront()Z
    .locals 3

    .line 843
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    const/4 v1, 0x0

    if-ltz v0, :cond_2

    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v2

    if-lt v0, v2, :cond_0

    goto :goto_0

    .line 847
    :cond_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 848
    iget v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCameraId:I

    invoke-static {v2, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 849
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method public isReadyForFocusEvents()Z
    .locals 1

    .line 535
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mReceivedFirstFrame:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public requiresRestartOnTorchSwitch()Z
    .locals 1

    .line 767
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->requiresCameraRestartOnTorchSwitch()Z

    move-result v0

    return v0
.end method

.method public resetCallbackBuffers()V
    .locals 3

    .line 576
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 579
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 580
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mNativePreviewCallback:Landroid/hardware/Camera$PreviewCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 581
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mVideoBuffers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 582
    iget-object v2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public reuseCallbackBuffer([B)V
    .locals 1

    .line 565
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 566
    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    :cond_0
    return-void
.end method

.method public setAbsoluteZoom(I)V
    .locals 1

    .line 771
    iput p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetAbsoluteZoom:I

    const/4 v0, 0x0

    .line 772
    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetRelativeZoom:F

    .line 773
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->changeToZoom(I)V

    return-void
.end method

.method public setDisplayOrientation(Landroid/content/Context;)V
    .locals 1

    .line 506
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 508
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->getBufferToSurfaceOrientation(Landroid/content/Context;)I

    move-result p1

    .line 509
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "ScanditSDK"

    const-string v0, "Failed to set display orientation"

    .line 514
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)Z
    .locals 2

    .line 539
    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 541
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 543
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    iget-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-interface {v0, v1}, Lcom/scandit/base/camera/SbIVideoPreview;->useForPreview(Landroid/hardware/Camera;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    :cond_0
    invoke-direct {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->handlePotentialPendingFocusEvent()V

    goto :goto_0

    :catch_0
    const-string v0, "ScanditSDK"

    const-string v1, "SbCamera.setPreviewSurface() failed"

    .line 550
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return p1

    :catch_1
    const-string v0, "ScanditSDK"

    const-string v1, "SbCamera.setPreviewSurface() failed"

    .line 547
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public setRelativeZoom(F)V
    .locals 1

    .line 755
    iput p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetRelativeZoom:F

    const/4 v0, 0x0

    .line 756
    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTargetAbsoluteZoom:I

    .line 757
    iget v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mMaxZoom:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->changeToZoom(I)V

    return-void
.end method

.method public setTorchState(I)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0}, Lcom/scandit/base/util/Observable;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 126
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    .line 128
    :try_start_0
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    .line 129
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initTorch(Landroid/hardware/Camera$Parameters;)V

    .line 130
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 132
    :catch_0
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public setupAutoFocusGeneral(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)V
    .locals 2

    .line 711
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 715
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ScanditSDK"

    const-string v1, "cancelAutoFocus failed"

    .line 717
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 722
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 728
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->convertFocusModeToString(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 729
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->setupMeteringAndFocusAreasForContinuous(Landroid/hardware/Camera$Parameters;)V

    .line 732
    :try_start_2
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    const-string p1, "ScanditSDK"

    const-string/jumbo v0, "setupAutoFocusGeneral: set parameters failed"

    .line 734
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void

    :catch_2
    const-string p1, "ScanditSDK"

    const-string/jumbo v0, "setupAutoFocusGeneral: get parameters failed"

    .line 724
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public start(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_5

    .line 152
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->getNumberOfPreviewBuffers(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mNumBuffers:I

    .line 155
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 156
    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFrontCamera()I

    move-result v0

    if-ltz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFrontCamera()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->openCamera(I)V

    .line 158
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    goto :goto_0

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getBackCamera()I

    move-result v0

    if-ltz v0, :cond_1

    .line 161
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getBackCamera()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->openCamera(I)V

    .line 162
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    goto :goto_0

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFrontCamera()I

    move-result v0

    if-ltz v0, :cond_2

    .line 165
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFrontCamera()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->openCamera(I)V

    .line 166
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    .line 168
    invoke-direct {p0, v0}, Lcom/scandit/base/camera/SbPreLollipopCamera;->openCamera(I)V

    .line 169
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 171
    :goto_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_4

    .line 174
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->initCameraAfterStart(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 175
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "The camera preview could not be started.."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :cond_4
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "The camera could not be opened."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    return-void
.end method

.method protected stop(Z)V
    .locals 3

    .line 205
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 208
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 210
    :try_start_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ScanditSDK"

    const-string v2, "cancelAutoFocus failed"

    .line 212
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    :goto_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    if-eqz p1, :cond_1

    .line 217
    iput-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    :cond_1
    return-void
.end method
