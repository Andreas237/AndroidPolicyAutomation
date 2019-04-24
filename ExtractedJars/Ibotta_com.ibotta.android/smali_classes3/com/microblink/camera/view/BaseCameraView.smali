.class public abstract Lcom/microblink/camera/view/BaseCameraView;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;,
        Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;,
        Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;,
        Lcom/microblink/camera/view/BaseCameraView$CameraViewState;
    }
.end annotation


# instance fields
.field private mAllowPinchToZoom:Z

.field private mAllowTapToFocus:Z

.field protected mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

.field private mCameraActive:Z

.field protected mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

.field private mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

.field private mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

.field private mCameraPreviewHeight:I

.field private mCameraPreviewWidth:I

.field protected mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

.field protected mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

.field protected mConfigurationOrientation:I

.field protected mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field protected mErrorState:Z

.field private mHandler:Landroid/os/Handler;

.field protected mHostScreenOrientation:I

.field protected mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field protected mIsRequestedOrientationSensor:Z

.field protected mIsRequestedOrientationUser:Z

.field private mMeteringAreas:[Landroid/graphics/RectF;

.field protected mOnActivityFlipListener:Lcom/microblink/camera/view/OnActivityFlipListener;

.field private mOnSizeChangedListener:Lcom/microblink/camera/view/OnSizeChangedListener;

.field private mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field private mOrientationAllowedListener:Lcom/microblink/camera/view/OrientationAllowedListener;

.field protected mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

.field private mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

.field protected mRotateMeteringAreas:Z

.field private mShakeListener:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

.field protected mSlaveOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

.field private mVisiblePart:Landroid/graphics/RectF;

.field private mZoomLevel:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    sget-object v2, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const/4 v2, 0x1

    iput v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    sget-object v3, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationSensor:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationUser:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mRotateMeteringAreas:Z

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-direct {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;-><init>()V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mHandler:Landroid/os/Handler;

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v3, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    iput v4, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    iput-boolean v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowTapToFocus:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowPinchToZoom:Z

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    sget-object v2, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const/4 v2, 0x1

    iput v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    sget-object v3, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationSensor:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationUser:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mRotateMeteringAreas:Z

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-direct {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;-><init>()V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mHandler:Landroid/os/Handler;

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v3, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    iput v4, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    iput-boolean v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowTapToFocus:Z

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowPinchToZoom:Z

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-eqz p2, :cond_5

    const-string v0, "http://schemas.android.com/apk/res-auto"

    const-string v1, "initialOrientation"

    invoke-interface {p2, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "portrait"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    :goto_0
    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    goto :goto_1

    :cond_0
    const-string v1, "landscapeRight"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    goto :goto_0

    :cond_1
    const-string v1, "inversePortrait"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    goto :goto_0

    :cond_2
    const-string v1, "landscapeLeft"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    goto :goto_0

    :cond_3
    :goto_1
    const-string v0, "http://schemas.android.com/apk/res-auto"

    const-string v1, "aspectMode"

    invoke-interface {p2, v0, v1}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    const-string v0, "fit"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p2, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    :goto_2
    iput-object p2, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    goto :goto_3

    :cond_4
    const-string v0, "fill"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    goto :goto_2

    :cond_5
    :goto_3
    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/camera/view/BaseCameraView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    return p0
.end method

.method static synthetic access$002(Lcom/microblink/camera/view/BaseCameraView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    return p1
.end method

.method static synthetic access$100(Lcom/microblink/camera/view/BaseCameraView;[Landroid/graphics/Rect;)[Landroid/graphics/Rect;
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;->focusRectArrToViewRectArr([Landroid/graphics/Rect;)[Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/view/BaseCameraView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowTapToFocus:Z

    return p0
.end method

.method static synthetic access$300(Lcom/microblink/camera/view/BaseCameraView;)Lcom/microblink/camera/hardware/camera/ICameraManager;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/camera/view/BaseCameraView;)[Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mMeteringAreas:[Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/camera/view/BaseCameraView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowPinchToZoom:Z

    return p0
.end method

.method static synthetic access$600(Lcom/microblink/camera/view/BaseCameraView;)F
    .locals 0

    iget p0, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    return p0
.end method

.method static synthetic access$702(Lcom/microblink/camera/view/BaseCameraView;Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1
.end method

.method private adjustRectangleToSensorCoordinateSystem(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 6

    const-string v0, "Metering rect is for orientation {}!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$2;->$SwitchMap$com$microblink$camera$hardware$orientation$Orientation:[I

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/orientation/Orientation;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v4, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v5

    add-float/2addr v4, v5

    sub-float v4, v1, v4

    iget p1, p1, Landroid/graphics/RectF;->left:F

    new-instance v5, Landroid/graphics/RectF;

    add-float/2addr v0, v4

    add-float/2addr v2, p1

    invoke-direct {v5, v4, p1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v4, p1, Landroid/graphics/RectF;->top:F

    iget v5, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    add-float/2addr v5, p1

    sub-float p1, v1, v5

    new-instance v5, Landroid/graphics/RectF;

    add-float/2addr v0, v4

    add-float/2addr v2, p1

    invoke-direct {v5, v4, p1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_1

    :pswitch_2
    iget v0, p1, Landroid/graphics/RectF;->right:F

    sub-float v0, v1, v0

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    sub-float v2, v1, v2

    new-instance v4, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v5

    add-float/2addr v5, v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    add-float/2addr p1, v2

    invoke-direct {v4, v0, v2, v5, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v5, v4

    goto :goto_1

    :goto_0
    :pswitch_3
    move-object v5, p1

    :goto_1
    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->isCameraSensorUpsideDown()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Metering rect is sensor upside down!"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, v5, Landroid/graphics/RectF;->right:F

    sub-float p1, v1, p1

    iget v0, v5, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v0

    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v2

    add-float/2addr v2, p1

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v3

    add-float/2addr v3, v1

    invoke-direct {v0, p1, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_2

    :cond_0
    const-string p1, "Metering rect is sensor normal!"

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v5

    :goto_2
    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->left:F

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    mul-float v1, v1, v2

    add-float/2addr p1, v1

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget v2, v0, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    mul-float v2, v2, v3

    add-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    mul-float v2, v2, v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    mul-float v0, v0, v3

    new-instance v3, Landroid/graphics/RectF;

    add-float/2addr v2, p1

    add-float/2addr v0, v1

    invoke-direct {v3, p1, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private clampToInterval(FFF)F
    .locals 1

    cmpl-float v0, p1, p3

    if-lez v0, :cond_0

    return p3

    :cond_0
    cmpg-float p3, p1, p2

    if-gez p3, :cond_1

    return p2

    :cond_1
    return p1
.end method

.method private convertRectangleToRect(Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 6

    iget v0, p1, Landroid/graphics/RectF;->left:F

    const/high16 v1, 0x44fa0000    # 2000.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v2, 0x3e8

    sub-int/2addr v0, v2

    iget v3, p1, Landroid/graphics/RectF;->top:F

    mul-float v3, v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v4

    mul-float v4, v4, v1

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v5

    mul-float v5, v5, v1

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    new-instance v5, Landroid/graphics/Rect;

    add-int/2addr v4, v0

    add-int/2addr v1, v3

    invoke-direct {v5, v0, v3, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    iget v0, v5, Landroid/graphics/Rect;->left:I

    const/16 v1, -0x3e8

    if-ge v0, v1, :cond_0

    iput v1, v5, Landroid/graphics/Rect;->left:I

    :cond_0
    iget v0, v5, Landroid/graphics/Rect;->right:I

    if-le v0, v2, :cond_1

    iput v2, v5, Landroid/graphics/Rect;->right:I

    :cond_1
    iget v0, v5, Landroid/graphics/Rect;->top:I

    if-ge v0, v1, :cond_2

    iput v1, v5, Landroid/graphics/Rect;->top:I

    :cond_2
    iget v0, v5, Landroid/graphics/Rect;->bottom:I

    if-le v0, v2, :cond_3

    iput v2, v5, Landroid/graphics/Rect;->bottom:I

    :cond_3
    invoke-virtual {v5}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5, v1, v1, v2, v2}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Metering rect is {} (original rect was {})"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v5

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid metering area: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private focusRectArrToViewRectArr([Landroid/graphics/Rect;)[Landroid/graphics/Rect;
    .locals 4

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, p1

    new-array v0, v0, [Landroid/graphics/Rect;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    invoke-direct {p0, v2}, Lcom/microblink/camera/view/BaseCameraView;->focusRectToRectangle(Landroid/graphics/Rect;)Landroid/graphics/RectF;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v3, v2}, Lcom/microblink/camera/view/surface/ICameraView;->convertRectangleToActualRect(Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private focusRectToRectangle(Landroid/graphics/Rect;)Landroid/graphics/RectF;
    .locals 4

    iget v0, p1, Landroid/graphics/Rect;->left:I

    add-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const/high16 v1, 0x44fa0000    # 2000.0f

    div-float/2addr v0, v1

    iget v2, p1, Landroid/graphics/Rect;->top:I

    add-int/lit16 v2, v2, 0x3e8

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget v3, p1, Landroid/graphics/Rect;->right:I

    add-int/lit16 v3, v3, 0x3e8

    int-to-float v3, v3

    div-float/2addr v3, v1

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/lit16 p1, p1, 0x3e8

    int-to-float p1, p1

    div-float/2addr p1, v1

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v0, v2, v3, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->isCameraSensorUpsideDown()Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, v1, Landroid/graphics/RectF;->right:F

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    iget v2, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v2

    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v3

    add-float/2addr v3, p1

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    add-float/2addr v1, v0

    invoke-direct {v2, p1, v0, v3, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v1, v2

    :cond_0
    return-object v1
.end method

.method private getCameraRotation()I
    .locals 2

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    return v1

    :sswitch_0
    const/16 v0, 0x10e

    return v0

    :sswitch_1
    const/16 v0, 0xb4

    return v0

    :sswitch_2
    const/16 v0, 0x5a

    return v0

    :sswitch_3
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method private getDisplayOrientation(Landroid/view/WindowManager;)I
    .locals 2

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getOrientation()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    return p1
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mConfigurationOrientation:I

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->calculateHostScreenOrientation()I

    move-result v0

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/microblink/camera/hardware/DeviceManager;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/microblink/camera/hardware/DeviceManager;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-static {p1, v0}, Lcom/microblink/camera/util/CameraCompatibility;->initCompatibility(ILcom/microblink/camera/hardware/DeviceManager;)V

    invoke-static {}, Lcom/microblink/camera/util/CameraCompatibility;->isPortraitCameraSupported()Z

    move-result p1

    if-nez p1, :cond_1

    iget p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/microblink/camera/view/NonLandscapeOrientationNotSupportedException;

    const-string v0, "This device does not support having camera on non-landscape oriented activity. Please set activity orientation to landscape!"

    invoke-direct {p1, v0}, Lcom/microblink/camera/view/NonLandscapeOrientationNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getHostActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v0

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->isRequestedOrientationSensor(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationSensor:Z

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;->isRequestedOrientationUser(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationUser:Z

    :cond_2
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/microblink/camera/view/surface/DummyCameraView;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-direct {p1, v0, v1}, Lcom/microblink/camera/view/surface/DummyCameraView;-><init>(Landroid/content/Context;Lcom/microblink/camera/view/CameraAspectMode;)V

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {p1}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/microblink/camera/view/BaseCameraView;->addView(Landroid/view/View;I)V

    :cond_3
    return-void
.end method

.method private isCameraSensorUpsideDown()Z
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v0

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    invoke-interface {v2}, Lcom/microblink/camera/hardware/camera/ICameraManager;->areOpenedCamerasPixelsLandscapeLeft()Z

    move-result v2

    sget-object v3, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v0, v3, :cond_0

    return v2

    :cond_0
    if-nez v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private isInMultiWindowMode()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getHostActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected static isRequestedOrientationSensor(I)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private startCamera()V
    .locals 4

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Activity;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Will not open camera because activity is already finishing."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->shouldStartCamera()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->getCameraRotation()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/surface/ICameraView;->setRotation(I)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iget v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    invoke-virtual {v0, v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setInitialZoomLevel(F)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    new-instance v3, Lcom/microblink/camera/view/BaseCameraView$1;

    invoke-direct {v3, p0}, Lcom/microblink/camera/view/BaseCameraView$1;-><init>(Lcom/microblink/camera/view/BaseCameraView;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/microblink/camera/hardware/camera/ICameraManager;->startPreview(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;)V

    return-void

    :cond_1
    iput-boolean v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Initialization failed!"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/CameraEventsListener;->onError(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method


# virtual methods
.method protected areCameraPixelsLandscapeLeft()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->areOpenedCamerasPixelsLandscapeLeft()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected calculateHostScreenOrientation()I
    .locals 7

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getHostActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-direct {p0, v0}, Lcom/microblink/camera/view/BaseCameraView;->getDisplayOrientation(Landroid/view/WindowManager;)I

    move-result v0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v1

    const/16 v2, 0x9

    const/16 v3, 0x8

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    const-string v1, "Activity is in portrait"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {p0, v1, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_0

    const-string v0, "Screen orientation is 0"

    :goto_0
    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x1

    goto :goto_4

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "Screen orientation is 180"

    :goto_1
    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    if-ne v0, v4, :cond_2

    const-string v0, "Screen orientation is 270"

    goto :goto_0

    :cond_2
    const-string v0, "Screen orientation is 90"

    goto :goto_1

    :cond_3
    const-string v1, "Activity is in landscape"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-ne v0, v5, :cond_4

    const-string v0, "Screen orientation is 90"

    :goto_2
    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    if-ne v0, v4, :cond_5

    const-string v0, "Screen orientation is 270"

    :goto_3
    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v2, 0x8

    goto :goto_4

    :cond_5
    if-nez v0, :cond_6

    const-string v0, "Screen orientation is 0"

    goto :goto_2

    :cond_6
    const-string v0, "Screen orientation is 180"

    goto :goto_3

    :goto_4
    return v2
.end method

.method public changeConfiguration(Landroid/content/res/Configuration;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, "changeConfiguration: Context: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mConfigurationOrientation:I

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->calculateHostScreenOrientation()I

    move-result v0

    iput v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-virtual {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;->changeConfigurationInternal(Landroid/content/res/Configuration;)V

    return-void

    :cond_0
    new-instance p1, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v0, "ChangeConfiguration must be called from UI thread!"

    invoke-direct {p1, v0}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected changeConfigurationInternal(Landroid/content/res/Configuration;)V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->getCameraRotation()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/surface/ICameraView;->setRotation(I)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/surface/ICameraView;->setHostActivityOrientation(I)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v0}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public create()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Camera view create. Context = {}"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v0

    invoke-static {p0, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->createOrientationChangeListener()Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    new-instance v1, Lcom/microblink/camera/hardware/orientation/OrientationManager;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    invoke-direct {v1, v2, v3}, Lcom/microblink/camera/hardware/orientation/OrientationManager;-><init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;)V

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {p0, v1}, Lcom/microblink/camera/view/BaseCameraView;->prepareCameraSettings(Lcom/microblink/camera/hardware/camera/CameraSettings;)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {p0, v1}, Lcom/microblink/camera/view/BaseCameraView;->onCreateCameraManager(Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/ICameraManager;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mShakeListener:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    invoke-interface {v1, v2}, Lcom/microblink/camera/hardware/camera/ICameraManager;->setShakeCallback(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    iget-object v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-static {v1, v2, v3}, Lcom/microblink/camera/view/surface/CameraSurfaceFactory;->createCameraView(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/ICameraManager;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/view/surface/ICameraView;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-interface {v1, v2}, Lcom/microblink/camera/view/surface/ICameraView;->setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->createCameraViewEventsListener()Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/microblink/camera/view/surface/ICameraView;->setCameraViewEventListener(Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-interface {v1, v2}, Lcom/microblink/camera/view/surface/ICameraView;->setHostActivityOrientation(I)V

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v1}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/microblink/camera/view/BaseCameraView;->addView(Landroid/view/View;I)V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Please set CameraEventsListener with method setCameraEventsListener before calling create method!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Create must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It is not allowed to call create() on already created view (state is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract createCameraListener()Lcom/microblink/camera/hardware/camera/CameraListener;
.end method

.method protected createCameraViewEventsListener()Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;
    .locals 1

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;

    invoke-direct {v0, p0}, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;-><init>(Lcom/microblink/camera/view/BaseCameraView;)V

    return-object v0
.end method

.method protected createOrientationChangeListener()Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;
    .locals 1

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;

    invoke-direct {v0, p0}, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;-><init>(Lcom/microblink/camera/view/BaseCameraView;)V

    return-object v0
.end method

.method public destroy()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, "Camera view destroy. Context = {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->dispose()V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v0}, Lcom/microblink/camera/view/surface/ICameraView;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1, v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setSlaveAccelerometerDelegate(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->removeAllViews()V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Destroy must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It is not allowed to call destroy() method on view that is not stopped. State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v0}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final focusCamera()V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->performAutofocus()V

    :cond_0
    return-void
.end method

.method protected getActivityOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    sparse-switch v0, :sswitch_data_0

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0

    :sswitch_0
    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0

    :sswitch_1
    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0

    :sswitch_2
    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0

    :sswitch_3
    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public getAspectMode()Lcom/microblink/camera/view/CameraAspectMode;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-object v0
.end method

.method public getCameraEventsListener()Lcom/microblink/camera/view/CameraEventsListener;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    return-object v0
.end method

.method protected getCameraFactorySettings()Lcom/microblink/camera/hardware/camera/CameraSettings;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    return-object v0
.end method

.method public final getCameraPreviewHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    return v0
.end method

.method public final getCameraPreviewWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    return v0
.end method

.method public getCameraSensorOrientation()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->getCameraSensorOrientation()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getCameraViewState()Lcom/microblink/camera/view/BaseCameraView$CameraViewState;
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-object v0
.end method

.method protected final getConfigurationOrientation()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mConfigurationOrientation:I

    return v0
.end method

.method public getCurrentOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method

.method protected getHostActivity()Landroid/app/Activity;
    .locals 2

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHostScreenOrientation()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    return v0
.end method

.method public final getInitialOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method

.method public final getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOrientationChangeListener()Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mSlaveOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    return-object v0
.end method

.method public getVisiblePart()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final getZoomLevel()F
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    return v0
.end method

.method public final isAutofocusSupported()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->isAutofocusSupported()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isCameraActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    return v0
.end method

.method public final isCameraFocused()Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->isCameraInFocus()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isCameraTorchSupported()Z
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->cameraSupportsTorch()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDeviceShaking()Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->isDeviceShaking()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Camera manager is null! Defining that device is shaking!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method protected isHostActivityOrientationOnSensor()Z
    .locals 4

    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationSensor:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mIsRequestedOrientationUser:Z

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->isInMultiWindowMode()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "accelerometer_rotation"

    invoke-static {v0, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_2

    return v1

    :cond_2
    return v2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/provider/Settings$SettingNotFoundException;->printStackTrace()V

    :cond_3
    return v2
.end method

.method protected final isOrientationAllowed(Lcom/microblink/camera/hardware/orientation/Orientation;)Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationAllowedListener:Lcom/microblink/camera/view/OrientationAllowedListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/camera/view/OrientationAllowedListener;->isOrientationAllowed(Lcom/microblink/camera/hardware/orientation/Orientation;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getActivityOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final isPinchToZoomAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowPinchToZoom:Z

    return v0
.end method

.method protected isRequestedOrientationUser(I)Z
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/16 v3, 0xd

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/16 v6, 0x12

    if-lt v0, v6, :cond_2

    if-eq p1, v5, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_1

    if-eq p1, v3, :cond_1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v4

    :cond_2
    if-eq p1, v5, :cond_4

    if-eq p1, v3, :cond_4

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v4
.end method

.method public final isTapToFocusAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowTapToFocus:Z

    return v0
.end method

.method protected abstract onActivityFlip()V
.end method

.method protected onCameraPreviewStarted()V
    .locals 0

    return-void
.end method

.method protected onCameraPreviewStopped()V
    .locals 0

    return-void
.end method

.method protected onCreateCameraManager(Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/ICameraManager;
    .locals 2

    new-instance p1, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;-><init>(Lcom/microblink/camera/hardware/DeviceManager;)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->createCameraListener()Lcom/microblink/camera/hardware/camera/CameraListener;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {p1, v0, v1}, Lcom/microblink/camera/hardware/camera/factory/CameraManagerFactory;->createCameraManager(Lcom/microblink/camera/hardware/camera/CameraListener;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/ICameraManager;

    move-result-object p1

    return-object p1
.end method

.method protected onLayout(ZIIII)V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "Camera preview ({} childs) layouting to: top: {} bottom: {}, left: {}, right: {} (changed: {}) "

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lcom/microblink/camera/view/BaseCameraView;->getChildCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v7, 0x3

    aput-object v3, v2, v7

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v8, 0x4

    aput-object v3, v2, v8

    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v9, 0x5

    aput-object v3, v2, v9

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/microblink/camera/view/BaseCameraView;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Camera view has no children?!?"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->wtf(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sub-int v1, p4, p2

    sub-int v2, p5, p3

    if-eqz v1, :cond_9

    if-nez v2, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v3, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    if-nez v3, :cond_2

    const-string v1, "Create not called. Cannot layout view!"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-interface {v3}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    iget-object v10, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v10}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    invoke-static {v10}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    const-string v11, "Camera surface view size is {}x{}"

    new-array v12, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v5

    invoke-static {v0, v11, v12}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v11, "Base camera view size: {}x{}"

    new-array v12, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v5

    invoke-static {v0, v11, v12}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sub-int v11, v1, v3

    div-int/2addr v11, v6

    add-int v12, v1, v3

    div-int/2addr v12, v6

    sub-int v13, v2, v10

    div-int/2addr v13, v6

    add-int v14, v2, v10

    div-int/2addr v14, v6

    iget-object v15, v0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v9, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    if-ne v15, v9, :cond_3

    const-string v1, "Layouting in ASPECT_FIT mode"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v6, v6, v7, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, v0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    move v2, v11

    move v1, v12

    move v6, v13

    move v3, v14

    goto/16 :goto_1

    :cond_3
    const-string v9, "Layouting in ASPECT_FILL mode"

    new-array v15, v4, [Ljava/lang/Object;

    invoke-static {v0, v9, v15}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-lez v3, :cond_4

    if-lez v10, :cond_4

    int-to-float v1, v1

    int-to-float v3, v3

    div-float/2addr v1, v3

    int-to-float v2, v2

    int-to-float v9, v10

    div-float/2addr v2, v9

    neg-int v10, v11

    int-to-float v10, v10

    div-float v3, v10, v3

    neg-int v10, v13

    int-to-float v10, v10

    div-float v9, v10, v9

    goto :goto_0

    :cond_4
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v9, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v10

    if-eqz v10, :cond_5

    move/from16 v16, v2

    move v2, v1

    move/from16 v1, v16

    move/from16 v17, v9

    move v9, v3

    move/from16 v3, v17

    :cond_5
    invoke-direct {v0, v3, v6, v7}, Lcom/microblink/camera/view/BaseCameraView;->clampToInterval(FFF)F

    move-result v3

    invoke-direct {v0, v9, v6, v7}, Lcom/microblink/camera/view/BaseCameraView;->clampToInterval(FFF)F

    move-result v9

    invoke-direct {v0, v1, v6, v7}, Lcom/microblink/camera/view/BaseCameraView;->clampToInterval(FFF)F

    move-result v1

    invoke-direct {v0, v2, v6, v7}, Lcom/microblink/camera/view/BaseCameraView;->clampToInterval(FFF)F

    move-result v2

    new-instance v6, Landroid/graphics/RectF;

    add-float/2addr v1, v3

    add-float/2addr v2, v9

    invoke-direct {v6, v3, v9, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v6, v0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Visible ROI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/microblink/camera/view/BaseCameraView;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move/from16 v2, p2

    move/from16 v6, p3

    move/from16 v1, p4

    move/from16 v3, p5

    :goto_1
    sub-int v7, v1, v2

    iput v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    sub-int v7, v3, v6

    iput v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    const-string v7, "Layouting camera surface view: Left: {}, Top: {}, Right: {}, Bottom: {}"

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v15, 0x2

    aput-object v10, v9, v15

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v15, 0x3

    aput-object v10, v9, v15

    invoke-static {v0, v7, v9}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v7}, Lcom/microblink/camera/view/surface/ICameraView;->getView()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v11, v13, v12, v14}, Landroid/view/View;->layout(IIII)V

    iget-object v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mOnSizeChangedListener:Lcom/microblink/camera/view/OnSizeChangedListener;

    if-eqz v7, :cond_7

    iget-object v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {v7}, Lcom/microblink/camera/hardware/orientation/Orientation;->isHorizontal()Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mOnSizeChangedListener:Lcom/microblink/camera/view/OnSizeChangedListener;

    iget v9, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    iget v10, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    goto :goto_2

    :cond_6
    iget-object v7, v0, Lcom/microblink/camera/view/BaseCameraView;->mOnSizeChangedListener:Lcom/microblink/camera/view/OnSizeChangedListener;

    iget v9, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewWidth:I

    iget v10, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraPreviewHeight:I

    :goto_2
    invoke-interface {v7, v9, v10}, Lcom/microblink/camera/view/OnSizeChangedListener;->onSizeChanged(II)V

    :cond_7
    const/4 v7, 0x1

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/microblink/camera/view/BaseCameraView;->getChildCount()I

    move-result v9

    if-ge v7, v9, :cond_8

    invoke-virtual {v0, v7}, Lcom/microblink/camera/view/BaseCameraView;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    const-string v10, "Layouting child {}: Left: {}, Top: {}, Right: {}, Bottom: {}"

    const/4 v11, 0x5

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x2

    aput-object v13, v12, v14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v15, 0x3

    aput-object v13, v12, v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v8

    invoke-static {v0, v10, v12}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v9, v2, v6, v1, v3}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    return-void

    :cond_9
    :goto_4
    const-string v1, "Layout size is 0x0?!?"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->wtf(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 5
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lcom/microblink/camera/view/BaseCameraView;->resolveSize(II)I

    move-result p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lcom/microblink/camera/view/BaseCameraView;->resolveSize(II)I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lcom/microblink/camera/view/BaseCameraView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v2, v4, v3}, Landroid/view/View;->measure(II)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "Measured dimension: {}x{}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/BaseCameraView;->setMeasuredDimension(II)V

    return-void
.end method

.method public pause()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->RESUMED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    const-string v0, "Camera view pause. Context = {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/orientation/OrientationManager;->disable()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->stopPreview()V

    iput-boolean v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraActive:Z

    :cond_1
    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-void

    :cond_2
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Pause must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot pause view that has not been resumed. Please make sure that your view has been resumed with resume() method. State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected prepareCameraSettings(Lcom/microblink/camera/hardware/camera/CameraSettings;)V
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->requireAutofocusFeature()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setCrashIfAutofocusNotSupported(Z)V

    const v0, 0x38400

    invoke-virtual {p1, v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setMinAllowedVideoResolution(I)V

    return-void
.end method

.method protected abstract requireAutofocusFeature()Z
.end method

.method public resume()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    const-string v0, "Camera view resume. Context = {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->RESUMED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.CAMERA"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    invoke-interface {v0}, Lcom/microblink/camera/view/CameraEventsListener;->onCameraPermissionDenied()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationManager:Lcom/microblink/camera/hardware/orientation/OrientationManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/orientation/OrientationManager;->enable()V

    :cond_1
    invoke-direct {p0}, Lcom/microblink/camera/view/BaseCameraView;->startCamera()V

    :cond_2
    return-void

    :cond_3
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Resume must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot resume view that has not been started. Please call start() first. State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public runOnUIThread(Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    if-nez p1, :cond_0

    sget-object p1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setAspectMode must be called before calling create()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCameraEventsListener(Lcom/microblink/camera/view/CameraEventsListener;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setCameraEventsListener must be called before calling create()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCameraType(Lcom/microblink/camera/hardware/camera/CameraType;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setCameraType(Lcom/microblink/camera/hardware/camera/CameraType;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setCameraType must be called before calling create()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setForceUseLegacyCamera(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setUseLegacyCamera(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setInitialOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getInitialOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getActivityOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mInitialOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setInitialOrientation must be called before calling create()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMeteringAreas([Landroid/graphics/RectF;Z)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mMeteringAreas:[Landroid/graphics/RectF;

    iput-boolean p2, p0, Lcom/microblink/camera/view/BaseCameraView;->mRotateMeteringAreas:Z

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->setMeteringAreasToCamera()V

    return-void
.end method

.method protected setMeteringAreasToCamera()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mMeteringAreas:[Landroid/graphics/RectF;

    if-nez v2, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/ICameraManager;->setMeteringAreas([Landroid/graphics/Rect;)V

    return-void

    :cond_0
    array-length v0, v2

    new-array v0, v0, [Landroid/graphics/Rect;

    :goto_0
    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mMeteringAreas:[Landroid/graphics/RectF;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    aget-object v3, v2, v1

    if-eqz v3, :cond_1

    aget-object v2, v2, v1

    invoke-direct {p0, v2}, Lcom/microblink/camera/view/BaseCameraView;->adjustRectangleToSensorCoordinateSystem(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/microblink/camera/view/BaseCameraView;->convertRectangleToRect(Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Metering area elements cannot be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    invoke-interface {v1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->setMeteringAreas([Landroid/graphics/Rect;)V

    return-void

    :cond_3
    const-string v0, "CameraView is already disposed. Cannot set metering areas!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnActivityFlipListener(Lcom/microblink/camera/view/OnActivityFlipListener;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOnActivityFlipListener:Lcom/microblink/camera/view/OnActivityFlipListener;

    return-void
.end method

.method public final setOnSizeChangedListener(Lcom/microblink/camera/view/OnSizeChangedListener;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOnSizeChangedListener:Lcom/microblink/camera/view/OnSizeChangedListener;

    return-void
.end method

.method public final setOptimizeCameraForNearScan(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setOptimizeForNearScan(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOrientationAllowedListener(Lcom/microblink/camera/view/OrientationAllowedListener;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mOrientationAllowedListener:Lcom/microblink/camera/view/OrientationAllowedListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setOrientationAllowedListener must be called before calling create()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOrientationChangeListener(Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Method setOrientationChangeListener must be called before calling start()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mSlaveOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    return-void
.end method

.method public final setPhotoMode(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setShouldAlwaysUsePhotoMode(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setPinchToZoomAllowed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowPinchToZoom:Z

    return-void
.end method

.method public final setRequestAutofocusOnShakingStopInContinousAutofocusMode(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setRequestFocusOnShakingStopInContinuousMode(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setShakeListener(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mShakeListener:Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;

    return-void
.end method

.method public final setTapToFocusAllowed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mAllowTapToFocus:Z

    return-void
.end method

.method public final setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/microblink/camera/hardware/camera/ICameraManager;->setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    return-void
.end method

.method public final setUseTextureViewForCameraDisplay(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setForceTextureView(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setVideoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraFactorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->setVideoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method can only be called before calling create()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setZoomLevel(F)V
    .locals 3
    .param p1    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

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
    iput p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    if-eqz p1, :cond_2

    iget v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mZoomLevel:F

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager;->setZoomLevel(F)V

    :cond_2
    return-void
.end method

.method protected shouldStartCamera()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public start()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, "Camera view start. Context = {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v3, p0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraManager:Lcom/microblink/camera/hardware/camera/ICameraManager;

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/surface/ICameraView;->installCallback(Lcom/microblink/camera/hardware/camera/ICameraManager;)V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Start must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot start view that has not been created. Please call create() first. State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public stop()V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-ne v0, v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, "Camera view stop. Context = {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v0}, Lcom/microblink/camera/view/surface/ICameraView;->removeCallback()V

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    iput-object v0, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/camera/view/CalledFromWrongThreadException;

    const-string v1, "Stop must be called from UI thread!"

    invoke-direct {v0, v1}, Lcom/microblink/camera/view/CalledFromWrongThreadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot stop view that has not been paused. Please call pause() method first. State is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
