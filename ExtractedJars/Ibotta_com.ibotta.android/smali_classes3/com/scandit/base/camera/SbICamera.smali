.class public abstract Lcom/scandit/base/camera/SbICamera;
.super Ljava/lang/Object;
.source "SbICamera.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/SbICamera$CameraApiVersion;,
        Lcom/scandit/base/camera/SbICamera$CameraFacing;
    }
.end annotation


# static fields
.field public static final CAMERA_CLOSED:I = 0x1

.field public static final CAMERA_ERROR:I = 0x2

.field public static final CAMERA_INITIALIZED:I = 0x0

.field static DEFAULT_EXPOSURE_COMPENSATION:F = -1.0f

.field public static final NO_TORCH:I = 0x0

.field public static final RESOLUTION_MODE_1080P:I = 0x1

.field public static final RESOLUTION_MODE_720P:I = 0x0

.field public static final RESOLUTION_MODE_MAX:I = 0x2

.field public static final TORCH_OFF:I = 0x1

.field public static final TORCH_ON:I = 0x2


# instance fields
.field mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

.field mBackCameraSensorOrientationOverride:I

.field protected mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

.field mDisableAutoFocus:Z

.field protected mExposureTargetBias:Ljava/lang/Float;

.field mFrontCameraSensorOrientationOverride:I

.field private mListeners:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/base/camera/SbCameraListener;",
            ">;>;"
        }
    .end annotation
.end field

.field protected mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

.field protected mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

.field protected mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

.field protected mPreviewCallback:Lcom/scandit/base/camera/SbPreviewCallback;

.field protected mPreviewHeight:I

.field protected mPreviewWidth:I

.field protected mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

.field private mTorchMode:Ljava/lang/String;

.field protected mTorchState:Lcom/scandit/base/util/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/base/util/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "off"

    .line 46
    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchMode:Ljava/lang/String;

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    .line 50
    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 51
    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 55
    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 56
    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    .line 57
    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mExposureTargetBias:Ljava/lang/Float;

    const/4 v0, 0x0

    .line 59
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbICamera;->mDisableAutoFocus:Z

    const/4 v1, -0x1

    .line 60
    iput v1, p0, Lcom/scandit/base/camera/SbICamera;->mFrontCameraSensorOrientationOverride:I

    .line 61
    iput v1, p0, Lcom/scandit/base/camera/SbICamera;->mBackCameraSensorOrientationOverride:I

    .line 63
    new-instance v1, Lcom/scandit/base/util/Observable;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/scandit/base/util/Observable;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mTorchState:Lcom/scandit/base/util/Observable;

    .line 96
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    return-void
.end method

.method public static create(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbICamera;
    .locals 0

    .line 397
    sget-object p0, Lcom/scandit/base/camera/SbICamera$1;->$SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I

    invoke-static {p1}, Lcom/scandit/base/camera/SbICamera;->getTargetApiVersion(Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->ordinal()I

    move-result p1

    aget p0, p0, p1

    packed-switch p0, :pswitch_data_0

    .line 403
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Unsupported camera api version"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 401
    :pswitch_0
    new-instance p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;-><init>()V

    return-object p0

    .line 399
    :pswitch_1
    new-instance p0, Lcom/scandit/base/camera/SbPreLollipopCamera;

    invoke-direct {p0}, Lcom/scandit/base/camera/SbPreLollipopCamera;-><init>()V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static createPreviewSurface(Landroid/content/Context;Lcom/scandit/base/camera/SbIVideoPreview$Callback;Lcom/scandit/base/camera/profiles/DeviceProfile;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbIVideoPreview;
    .locals 2

    .line 373
    invoke-static {p3}, Lcom/scandit/base/camera/SbICamera;->getTargetApiVersion(Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    move-result-object v0

    .line 374
    sget-object v1, Lcom/scandit/base/camera/SbICamera$1;->$SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 384
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Unknown camera API version."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 382
    :pswitch_0
    new-instance p2, Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-direct {p2, p0, p3, p1}, Lcom/scandit/base/camera/SbTextureViewPreview;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;Lcom/scandit/base/camera/SbIVideoPreview$Callback;)V

    return-object p2

    .line 376
    :pswitch_1
    invoke-virtual {p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->shouldUseTextureView()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 377
    new-instance p2, Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-direct {p2, p0, p3, p1}, Lcom/scandit/base/camera/SbTextureViewPreview;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;Lcom/scandit/base/camera/SbIVideoPreview$Callback;)V

    return-object p2

    .line 379
    :cond_0
    new-instance p2, Lcom/scandit/base/camera/SbSurfaceViewPreview;

    invoke-direct {p2, p0, p1}, Lcom/scandit/base/camera/SbSurfaceViewPreview;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/SbIVideoPreview$Callback;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getDisplayRotation(Landroid/content/Context;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "window"

    .line 243
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    .line 244
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p0, 0x10e

    return p0

    :pswitch_1
    const/16 p0, 0xb4

    return p0

    :pswitch_2
    const/16 p0, 0x5a

    return p0

    :pswitch_3
    return v0

    :cond_0
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getTargetApiVersion(Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbICamera$CameraApiVersion;
    .locals 2

    .line 352
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 353
    sget-object p0, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA1:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    return-object p0

    :cond_0
    const-string v0, "enable_camera2_api"

    .line 355
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 357
    sget-object p0, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA2:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    return-object p0

    :cond_1
    if-nez p0, :cond_2

    .line 360
    sget-object p0, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA1:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    return-object p0

    .line 362
    :cond_2
    invoke-static {}, Lcom/scandit/base/camera/profiles/DeviceProfile;->shouldUseCamera2APIByDefault()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 363
    sget-object p0, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA2:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    return-object p0

    .line 365
    :cond_3
    sget-object p0, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA1:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    return-object p0
.end method

.method public static normalizeRotation(I)I
    .locals 0

    .line 232
    rem-int/lit16 p0, p0, 0x168

    add-int/lit16 p0, p0, 0x168

    rem-int/lit16 p0, p0, 0x168

    return p0
.end method


# virtual methods
.method public addListener(Lcom/scandit/base/camera/SbCameraListener;)V
    .locals 4

    .line 183
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    monitor-enter v0

    .line 184
    :try_start_0
    iget-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 185
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    .line 186
    monitor-exit v0

    return-void

    .line 189
    :cond_1
    iget-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract close()V
.end method

.method public getBufferToSurfaceOrientation(Landroid/content/Context;)I
    .locals 2

    .line 212
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbICamera;->getCameraToNativeDeviceOrientation()I

    move-result v0

    .line 213
    invoke-static {p1}, Lcom/scandit/base/camera/SbICamera;->getDisplayRotation(Landroid/content/Context;)I

    move-result p1

    .line 216
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbICamera;->isCameraFacingFront()Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/2addr v0, p1

    rsub-int p1, v0, 0x168

    goto :goto_0

    :cond_0
    sub-int p1, v0, p1

    .line 223
    :goto_0
    invoke-static {p1}, Lcom/scandit/base/camera/SbICamera;->normalizeRotation(I)I

    move-result p1

    return p1
.end method

.method public getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    return-object v0
.end method

.method public abstract getCameraToNativeDeviceOrientation()I
.end method

.method public abstract getMinFocusDistance()F
.end method

.method public getPreviewHeight()I
    .locals 1

    .line 198
    iget v0, p0, Lcom/scandit/base/camera/SbICamera;->mPreviewHeight:I

    return v0
.end method

.method public getPreviewWidth()I
    .locals 1

    .line 194
    iget v0, p0, Lcom/scandit/base/camera/SbICamera;->mPreviewWidth:I

    return v0
.end method

.method public abstract getRelativeZoom()F
.end method

.method public abstract getSupportedFocusBitMask()I
.end method

.method public getTorchState()I
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0}, Lcom/scandit/base/util/Observable;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final handleAutoFocusEvent(Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 2

    .line 323
    iget-object v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    if-ne v0, v1, :cond_0

    return-void

    .line 329
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbICamera;->isReadyForFocusEvents()Z

    move-result v0

    if-nez v0, :cond_1

    .line 330
    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mPendingFocusEvent:Lcom/scandit/base/camera/SbFocusEvent;

    return-void

    .line 333
    :cond_1
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/SbICamera;->handleAutoFocusEventInternal(Lcom/scandit/base/camera/SbFocusEvent;)V

    return-void
.end method

.method protected abstract handleAutoFocusEventInternal(Lcom/scandit/base/camera/SbFocusEvent;)V
.end method

.method public abstract hasMacroMode()Z
.end method

.method public hasTorch()Z
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchMode:Ljava/lang/String;

    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public initialize(Lcom/scandit/base/camera/profiles/DeviceProfile;Lcom/scandit/base/camera/SbPreviewCallback;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 101
    invoke-virtual {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->createDefaultResolutionStrategy()Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    .line 102
    iput-object p2, p0, Lcom/scandit/base/camera/SbICamera;->mPreviewCallback:Lcom/scandit/base/camera/SbPreviewCallback;

    return-void
.end method

.method public abstract isCameraFacingFront()Z
.end method

.method public abstract isReadyForFocusEvents()Z
.end method

.method public abstract isRunning()Z
.end method

.method protected notifyListeners(ILjava/lang/String;)V
    .locals 4

    .line 132
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    monitor-enter v0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_3

    .line 151
    :pswitch_0
    :try_start_0
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 152
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 153
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/base/camera/SbCameraListener;

    invoke-interface {v1, p2}, Lcom/scandit/base/camera/SbCameraListener;->didFail(Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :pswitch_1
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_1

    .line 145
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 146
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/scandit/base/camera/SbCameraListener;

    invoke-interface {p2, p0}, Lcom/scandit/base/camera/SbCameraListener;->didCloseCamera(Lcom/scandit/base/camera/SbICamera;)V

    goto :goto_1

    .line 135
    :pswitch_2
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_2

    .line 136
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 137
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/scandit/base/camera/SbCameraListener;

    iget-object v1, p0, Lcom/scandit/base/camera/SbICamera;->mActualFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iget v2, p0, Lcom/scandit/base/camera/SbICamera;->mPreviewWidth:I

    iget v3, p0, Lcom/scandit/base/camera/SbICamera;->mPreviewHeight:I

    invoke-interface {p2, p0, v1, v2, v3}, Lcom/scandit/base/camera/SbCameraListener;->didInitializeCamera(Lcom/scandit/base/camera/SbICamera;Lcom/scandit/base/camera/SbICamera$CameraFacing;II)V

    goto :goto_2

    .line 158
    :cond_3
    :goto_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public observeTorch(Lcom/scandit/base/util/Observer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/base/util/Observer<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0, p1}, Lcom/scandit/base/util/Observable;->addObserver(Lcom/scandit/base/util/Observer;)Z

    return-void
.end method

.method public removeAllListeners()V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mListeners:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public abstract requiresRestartOnTorchSwitch()Z
.end method

.method public abstract resetCallbackBuffers()V
.end method

.method public restart(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/SbICamera;->stop(Z)V

    .line 124
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbICamera;->close()V

    .line 126
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/scandit/base/camera/SbICamera;->start(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public abstract setAbsoluteZoom(I)V
.end method

.method public setCameraFacing(Lcom/scandit/base/camera/SbICamera$CameraFacing;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mPreferredFacing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    return-void
.end method

.method public setDisableAutoFocus(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/scandit/base/camera/SbICamera;->mDisableAutoFocus:Z

    return-void
.end method

.method public abstract setDisplayOrientation(Landroid/content/Context;)V
.end method

.method public setExposureTargetBias(Ljava/lang/Float;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mExposureTargetBias:Ljava/lang/Float;

    return-void
.end method

.method public abstract setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)Z
.end method

.method public abstract setRelativeZoom(F)V
.end method

.method public setResolutionMode(I)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    .line 287
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown resolution mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :pswitch_0
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    if-eqz p1, :cond_0

    instance-of p1, p1, Lcom/scandit/base/camera/resolution/SbMaxAreaResolutionStrategy;

    if-eqz p1, :cond_0

    return-void

    .line 270
    :cond_0
    new-instance p1, Lcom/scandit/base/camera/resolution/SbMaxAreaResolutionStrategy;

    invoke-direct {p1}, Lcom/scandit/base/camera/resolution/SbMaxAreaResolutionStrategy;-><init>()V

    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    return-void

    .line 273
    :pswitch_1
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    if-eqz p1, :cond_1

    instance-of p1, p1, Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;

    if-eqz p1, :cond_1

    return-void

    .line 277
    :cond_1
    new-instance p1, Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;

    invoke-direct {p1}, Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;-><init>()V

    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    return-void

    .line 280
    :pswitch_2
    iget-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    if-eqz p1, :cond_2

    instance-of p1, p1, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;

    if-eqz p1, :cond_2

    return-void

    .line 284
    :cond_2
    new-instance p1, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;

    invoke-direct {p1}, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;-><init>()V

    iput-object p1, p0, Lcom/scandit/base/camera/SbICamera;->mResolutionStrategy:Lcom/scandit/base/camera/resolution/SbResolutionStrategy;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setSensorOrientationOverride(II)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/scandit/base/camera/SbICamera;->mBackCameraSensorOrientationOverride:I

    .line 67
    iput p2, p0, Lcom/scandit/base/camera/SbICamera;->mFrontCameraSensorOrientationOverride:I

    return-void
.end method

.method public setTorchState(I)V
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract start(Landroid/content/Context;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x1

    .line 165
    invoke-virtual {p0, v0}, Lcom/scandit/base/camera/SbICamera;->stop(Z)V

    return-void
.end method

.method protected abstract stop(Z)V
.end method

.method public stopObservingTorch(Lcom/scandit/base/util/Observer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/base/util/Observer<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/scandit/base/camera/SbICamera;->mTorchState:Lcom/scandit/base/util/Observable;

    invoke-virtual {v0, p1}, Lcom/scandit/base/util/Observable;->removeObserver(Lcom/scandit/base/util/Observer;)Z

    return-void
.end method
