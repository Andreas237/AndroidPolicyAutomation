.class public Lcom/microblink/camera/hardware/orientation/OrientationManager;
.super Landroid/view/OrientationEventListener;


# instance fields
.field private mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field private mDegreesOffset:I

.field private mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field private mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    iput-object p2, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    iput-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result p2

    const/16 v1, 0x8

    if-ge p2, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getOrientation()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    :goto_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result p2

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/16 v3, 0x10e

    if-eqz p2, :cond_4

    const-string p2, "Screen is in portrait"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p0, p2, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    const-string p1, "Screen orientation is 0"

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    const-string p1, "Screen orientation is 180"

    goto :goto_1

    :cond_2
    if-ne p1, v1, :cond_3

    const-string p1, "Screen orientation is 270"

    goto :goto_2

    :cond_3
    const-string p1, "Screen orientation is 90"

    goto :goto_2

    :cond_4
    const-string p2, "Screen is in landscape"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p0, p2, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-ne p1, v2, :cond_5

    const-string p1, "Screen orientation is 90"

    :goto_1
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    goto :goto_3

    :cond_5
    if-ne p1, v1, :cond_6

    const-string p1, "Screen orientation is 270"

    goto :goto_1

    :cond_6
    if-nez p1, :cond_7

    const-string p1, "Screen orientation is 0"

    goto :goto_2

    :cond_7
    const-string p1, "Screen orientation is 180"

    :goto_2
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput v3, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    :goto_3
    const-string p1, "Calculated degrees offset: {}"

    new-array p2, v2, [Ljava/lang/Object;

    iget v1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p2, v0

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    if-ne p1, v3, :cond_9

    const-string p1, "Natural Orientation is landscape"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->isDeviceLandscapeLeftTablet()Z

    move-result p1

    if-eqz p1, :cond_8

    const/16 p1, 0x5a

    iput p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    goto :goto_4

    :cond_8
    iput v3, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    goto :goto_4

    :cond_9
    const-string p1, "Natural Orientation is portrait"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_4
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    iput-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method private calcOrientation(I)Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 3

    if-gez p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1

    :cond_0
    const/16 v0, 0x13b

    if-ge p1, v0, :cond_5

    const/16 v1, 0x2d

    if-ge p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v2, 0x87

    if-lt p1, v1, :cond_2

    if-ge p1, v2, :cond_2

    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1

    :cond_2
    const/16 v1, 0xe1

    if-lt p1, v2, :cond_3

    if-ge p1, v1, :cond_3

    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1

    :cond_3
    if-lt p1, v1, :cond_4

    if-ge p1, v0, :cond_4

    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1

    :cond_5
    :goto_0
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p1
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mDegreesOffset:I

    add-int/2addr p1, v0

    rem-int/lit16 p1, p1, 0x168

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/orientation/OrientationManager;->calcOrientation(I)Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    iget-object p1, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mOrientationChangeListener:Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;

    iget-object v0, p0, Lcom/microblink/camera/hardware/orientation/OrientationManager;->mCurrentOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;->onOrientationChange(Lcom/microblink/camera/hardware/orientation/Orientation;)V

    :cond_0
    return-void
.end method
