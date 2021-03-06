.class public final Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;
.super Lcom/scandit/base/camera/SbICamera;
.source "SbPostLollipopCamera.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;
    }
.end annotation


# static fields
.field public static final INFINITY_FOCUS_DISTANCE:F


# instance fields
.field private mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

.field private final mCameraObserver:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

.field private mContinuousFocus:Z

.field private mCurrentBuffer:Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

.field private mExposureControl:Lcom/scandit/base/camera/camera2/ExposureControl;

.field private mFactor:F

.field private mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

.field private mLastUpdate:J

.field private mSpeed:F

.field private mTorchLogic:Lcom/scandit/base/camera/camera2/TorchLogic;

.field private mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 193
    invoke-direct {p0}, Lcom/scandit/base/camera/SbICamera;-><init>()V

    const-wide/16 v0, 0x0

    .line 40
    iput-wide v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastUpdate:J

    const v0, 0x3ecccccd    # 0.4f

    .line 41
    iput v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 42
    iput v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mSpeed:F

    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mContinuousFocus:Z

    .line 46
    invoke-static {}, Lcom/scandit/barcodepicker/internal/DummyFocusStateMachine;->getNoOpFocusEvent()Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    .line 50
    new-instance v0, Lcom/scandit/base/camera/camera2/TorchLogic;

    invoke-direct {v0}, Lcom/scandit/base/camera/camera2/TorchLogic;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchLogic:Lcom/scandit/base/camera/camera2/TorchLogic;

    .line 51
    new-instance v0, Lcom/scandit/base/camera/camera2/ZoomLogic;

    invoke-direct {v0}, Lcom/scandit/base/camera/camera2/ZoomLogic;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mExposureControl:Lcom/scandit/base/camera/camera2/ExposureControl;

    .line 54
    new-instance v1, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

    invoke-direct {v1, p0, v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;)V

    iput-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCameraObserver:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

    .line 56
    new-instance v0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    invoke-direct {v0}, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCurrentBuffer:Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    const-string v0, "ScanditSDK"

    const-string v1, "Camera is instantiated using Camera2 API."

    .line 194
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    new-instance v0, Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCameraObserver:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

    invoke-direct {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2Listener;)V

    iput-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    .line 197
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchLogic:Lcom/scandit/base/camera/camera2/TorchLogic;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/TorchLogic;->setCamera(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    .line 198
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/ZoomLogic;->setCamera(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    return-void
.end method

.method static synthetic access$100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    return-object p0
.end method

.method static synthetic access$1202(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/util/Observable;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/util/Observable;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCurrentBuffer:Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbPreviewCallback;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreviewCallback:Lcom/scandit/base/camera/SbPreviewCallback;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->updateLensPosition(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    return-void
.end method

.method static synthetic access$1800(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$1900(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->handleAutoFocusEventNoLoop(Lcom/scandit/base/camera/SbFocusEvent;)V

    return-void
.end method

.method static synthetic access$2002(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Z)Z
    .locals 0

    .line 35
    iput-boolean p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mContinuousFocus:Z

    return p1
.end method

.method static synthetic access$2100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->doSetDisplayOrientation(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$300(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/ExposureControl;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mExposureControl:Lcom/scandit/base/camera/camera2/ExposureControl;

    return-object p0
.end method

.method static synthetic access$302(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/camera2/ExposureControl;)Lcom/scandit/base/camera/camera2/ExposureControl;
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mExposureControl:Lcom/scandit/base/camera/camera2/ExposureControl;

    return-object p1
.end method

.method static synthetic access$400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/SbCamera2;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    return-object p0
.end method

.method static synthetic access$500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Ljava/lang/Float;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mExposureTargetBias:Ljava/lang/Float;

    return-object p0
.end method

.method static synthetic access$600(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->disableImagePostProcessingFilters()V

    return-void
.end method

.method static synthetic access$702(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;I)I
    .locals 0

    .line 35
    iput p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreviewWidth:I

    return p1
.end method

.method static synthetic access$802(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;I)I
    .locals 0

    .line 35
    iput p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreviewHeight:I

    return p1
.end method

.method static synthetic access$900(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->notifyListeners(ILjava/lang/String;)V

    return-void
.end method

.method private collectCameraCharacteristics(Landroid/hardware/camera2/CameraCharacteristics;)V
    .locals 4

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraCharacteristics;->getKeys()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 162
    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v3

    .line 163
    invoke-virtual {v2}, Landroid/hardware/camera2/CameraCharacteristics$Key;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-static {v3}, Lcom/scandit/base/util/ValueUtils;->convertValueToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ScanditSDK"

    .line 169
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private disableImagePostProcessingFilters()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;

    invoke-direct {v1, p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method

.method private doContinuousFocus()V
    .locals 2

    .line 175
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$2;

    invoke-direct {v1, p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$2;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->postToLoop(Ljava/lang/Runnable;)V

    return-void
.end method

.method private doSetDisplayOrientation(Landroid/content/Context;)V
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    if-nez v0, :cond_0

    return-void

    .line 247
    :cond_0
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->getBufferToSurfaceOrientation(Landroid/content/Context;)I

    move-result p1

    .line 248
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->adjustToDisplayRotation(I)V

    return-void
.end method

.method private filterSupportedFocusModes([I)[I
    .locals 4

    .line 279
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isContinuousDisabled()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 280
    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->hasMode([II)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 281
    new-array p1, v2, [I

    aput v0, p1, v1

    return-object p1

    .line 283
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->hasMode([II)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 284
    new-array p1, v2, [I

    aput v2, p1, v1

    return-object p1

    .line 286
    :cond_1
    new-array p1, v1, [I

    return-object p1
.end method

.method private focusOnArea(Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 10

    .line 435
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    .line 436
    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 437
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_0

    .line 442
    :cond_0
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent;->hasArea()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "ScanditSDK"

    const-string v0, "Resetting focus area."

    .line 443
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 445
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "ScanditSDK"

    .line 450
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting auto focus region: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PIXEL_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    if-nez v0, :cond_2

    return-void

    .line 459
    :cond_2
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getLeft()F

    move-result v2

    mul-float/2addr v1, v2

    .line 460
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {v3}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getTop()F

    move-result v3

    mul-float/2addr v2, v3

    .line 461
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {v4}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getWidth()F

    move-result v4

    mul-float/2addr v3, v4

    .line 462
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object p1, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$Area;->getHeight()F

    move-result p1

    mul-float/2addr v0, p1

    .line 464
    new-instance p1, Landroid/hardware/camera2/params/MeteringRectangle;

    float-to-int v5, v1

    float-to-int v6, v2

    float-to-int v7, v3

    float-to-int v8, v0

    const/4 v9, 0x1

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(IIIII)V

    .line 465
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/hardware/camera2/params/MeteringRectangle;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_0
    const-string p1, "ScanditSDK"

    const-string v0, "Camera does not support focus on area."

    .line 438
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static getFocusBit(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    .line 255
    :pswitch_1
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_AUTO_get()I

    move-result p0

    return p0

    .line 259
    :pswitch_2
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_MANUAL_get()I

    move-result p0

    return p0

    .line 257
    :pswitch_3
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_FIXED_get()I

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private getFocusMode(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)I
    .locals 1

    .line 359
    sget-object v0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$5;->$SwitchMap$com$scandit$base$camera$SbFocusEvent$FocusMode:[I

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 371
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Invalid focus mode."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, 0x2

    return p1

    :pswitch_1
    const/4 p1, 0x4

    return p1

    :pswitch_2
    const/4 p1, 0x1

    return p1

    :pswitch_3
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handleAutoFocusEventNoLoop(Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 4

    .line 387
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v3, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    invoke-direct {p0, v3}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->getFocusMode(Lcom/scandit/base/camera/SbFocusEvent$FocusMode;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 391
    sget-object v0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$5;->$SwitchMap$com$scandit$base$camera$SbFocusEvent$FocusMode:[I

    iget-object v2, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 397
    :pswitch_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget v3, p1, Lcom/scandit/base/camera/SbFocusEvent;->focusDistance:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    .line 393
    :pswitch_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x0

    .line 394
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 393
    invoke-virtual {v0, v2, v3}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequest(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_0
    move v0, v1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 401
    :goto_1
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent;->hasArea()Z

    move-result v2

    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    invoke-virtual {v3}, Lcom/scandit/base/camera/SbFocusEvent;->hasArea()Z

    move-result v3

    if-ne v2, v3, :cond_1

    .line 402
    invoke-virtual {p1}, Lcom/scandit/base/camera/SbFocusEvent;->hasArea()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    iget-object v3, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    iget-object v3, v3, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-virtual {v2, v3}, Lcom/scandit/base/camera/SbFocusEvent$Area;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 403
    :cond_1
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->focusOnArea(Lcom/scandit/base/camera/SbFocusEvent;)V

    move v0, v1

    :cond_2
    if-eqz v0, :cond_3

    .line 408
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateRepeatingCaptureRequest()V

    .line 411
    :cond_3
    iget-boolean v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    if-eqz v0, :cond_4

    .line 413
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->triggerCaptureRequest()V

    .line 416
    :cond_4
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private hasMode([II)Z
    .locals 4

    .line 265
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    if-ne v3, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private updateLensPosition(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 8

    .line 486
    iget-boolean v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mContinuousFocus:Z

    if-nez v0, :cond_0

    return-void

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_1

    .line 491
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x4

    .line 492
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 491
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    .line 495
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    .line 497
    iget-wide v4, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastUpdate:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-lez v6, :cond_2

    sub-long v3, v1, v4

    long-to-float v3, v3

    const v4, 0x3a83126f    # 0.001f

    mul-float/2addr v3, v4

    .line 500
    :cond_2
    iput-wide v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mLastUpdate:J

    .line 501
    iget v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    iget v2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mSpeed:F

    mul-float/2addr v3, v2

    add-float/2addr v1, v3

    iput v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    .line 502
    iget v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    const v3, 0x3f333333    # 0.7f

    cmpl-float v1, v1, v3

    if-lez v1, :cond_3

    .line 503
    iput v3, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    neg-float v1, v2

    .line 504
    iput v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mSpeed:F

    .line 506
    :cond_3
    iget v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    const v2, 0x3ecccccd    # 0.4f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    .line 507
    iput v2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    .line 508
    iget v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mSpeed:F

    neg-float v1, v1

    iput v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mSpeed:F

    .line 510
    :cond_4
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 511
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mFactor:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public continuousAutoFocus(Ljava/lang/String;)V
    .locals 0

    .line 471
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->doContinuousFocus()V

    return-void
.end method

.method public getCameraToNativeDeviceOrientation()I
    .locals 1

    .line 516
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCameraToNativeDeviceOrientation()I

    move-result v0

    return v0
.end method

.method public getMinFocusDistance()F
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 424
    :cond_0
    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 425
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 430
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getRelativeZoom()F
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;

    iget v0, v0, Lcom/scandit/base/camera/camera2/ZoomLogic;->zoom:F

    return v0
.end method

.method public getSupportedFocusBitMask()I
    .locals 5

    const/4 v0, 0x0

    .line 295
    :try_start_0
    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    .line 296
    invoke-virtual {v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    invoke-direct {p0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->filterSupportedFocusModes([I)[I

    move-result-object v1

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v0, v2, :cond_0

    aget v4, v1, v0

    .line 302
    invoke-static {v4}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->getFocusBit(I)I

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v3

    :catch_0
    return v0
.end method

.method public getTorchState()I
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0}, Lcom/scandit/base/util/Observable;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public handleAutoFocusEventInternal(Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 2

    .line 377
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;

    invoke-direct {v1, p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)V

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->postToLoop(Ljava/lang/Runnable;)V

    return-void
.end method

.method public hasMacroMode()Z
    .locals 6

    .line 324
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->finishedInitialization()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 329
    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 330
    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget v4, v0, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_1
    return v1
.end method

.method public hasTorch()Z
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0}, Lcom/scandit/base/util/Observable;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCameraFacingFront()Z
    .locals 1

    .line 520
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->isCameraFacingFront()Z

    move-result v0

    return v0
.end method

.method public isReadyForFocusEvents()Z
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->finishedInitialization()Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->isRunning()Z

    move-result v0

    return v0
.end method

.method public requiresRestartOnTorchSwitch()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public resetCallbackBuffers()V
    .locals 0

    return-void
.end method

.method public setAbsoluteZoom(I)V
    .locals 1

    .line 481
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/ZoomLogic;->setAbsoluteZoom(I)V

    return-void
.end method

.method public setDisplayOrientation(Landroid/content/Context;)V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    new-instance v1, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;

    invoke-direct {v1, p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->postToLoop(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)Z
    .locals 1

    .line 348
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 349
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-interface {p1}, Lcom/scandit/base/camera/SbIVideoPreview;->getView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/TextureView;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->setViewAsync(Landroid/view/TextureView;)V

    const/4 p1, 0x1

    return p1
.end method

.method public setRelativeZoom(F)V
    .locals 1

    .line 476
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mZoomLogic:Lcom/scandit/base/camera/camera2/ZoomLogic;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/ZoomLogic;->setRelativeZoom(F)V

    return-void
.end method

.method public setTorchState(I)V
    .locals 2

    .line 319
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mTorchLogic:Lcom/scandit/base/camera/camera2/TorchLogic;

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/TorchLogic;->setTorch(Z)V

    return-void
.end method

.method public start(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->setResolutionStrategy(Lcom/scandit/base/camera/resolution/SbResolutionStrategy;)V

    .line 210
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    invoke-interface {v1}, Lcom/scandit/base/camera/SbIVideoPreview;->getView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->setViewAsync(Landroid/view/TextureView;)V

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    invoke-virtual {v0, v1, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->startAsync(Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V

    return-void
.end method

.method public stop(Z)V
    .locals 0

    .line 222
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->mCamera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->closeAsync()V

    return-void
.end method
