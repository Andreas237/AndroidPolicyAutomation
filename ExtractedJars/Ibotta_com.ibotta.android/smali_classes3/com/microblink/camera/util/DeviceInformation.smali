.class public Lcom/microblink/camera/util/DeviceInformation;
.super Ljava/lang/Object;


# instance fields
.field private mAndroidRelease:Ljava/lang/String;

.field private mApiLevel:I

.field private mAutofocusSupported:Z

.field private mCamera2NativelySupported:Z

.field private mCameraHasFlash:Z

.field private mChosenCameraStrategy:Ljava/lang/String;

.field private mDeviceModel:Ljava/lang/String;

.field private mDeviceName:Ljava/lang/String;

.field private mManufacturer:Ljava/lang/String;

.field private mPreparedCameraParameters:Landroid/hardware/Camera$Parameters;

.field private mScreenHeight:I

.field private mScreenWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mCamera2NativelySupported:Z

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mDeviceModel:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    iput-object v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mDeviceName:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mManufacturer:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mAndroidRelease:Ljava/lang/String;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iput v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mApiLevel:I

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.camera.autofocus"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mAutofocusSupported:Z

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.camera.flash"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mCameraHasFlash:Z

    const-string v1, "window"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v2

    iput v2, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenWidth:I

    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenHeight:I

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "Failed to open camera!"

    iput-object v2, p0, Lcom/microblink/camera/util/DeviceInformation;->mChosenCameraStrategy:Ljava/lang/String;

    iput-object v1, p0, Lcom/microblink/camera/util/DeviceInformation;->mPreparedCameraParameters:Landroid/hardware/Camera$Parameters;

    :goto_0
    if-eqz v1, :cond_0

    new-instance v2, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;

    invoke-direct {v2}, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/DefaultCameraStrategyFactory;-><init>()V

    new-instance v3, Lcom/microblink/camera/hardware/DeviceManager;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lcom/microblink/camera/hardware/DeviceManager;-><init>(Landroid/content/Context;Z)V

    new-instance v4, Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-direct {v4}, Lcom/microblink/camera/hardware/camera/CameraSettings;-><init>()V

    invoke-interface {v2, v3, v1, v4}, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;->createStrategy(Lcom/microblink/camera/hardware/DeviceManager;Landroid/hardware/Camera;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/microblink/camera/util/DeviceInformation;->mChosenCameraStrategy:Ljava/lang/String;

    iget v3, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenWidth:I

    iget v4, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenHeight:I

    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-virtual {v2, v3, v4, v5}, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;->getOptimalPreviewSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object v2

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    iput-object v3, p0, Lcom/microblink/camera/util/DeviceInformation;->mPreparedCameraParameters:Landroid/hardware/Camera$Parameters;

    iget-object v3, p0, Lcom/microblink/camera/util/DeviceInformation;->mPreparedCameraParameters:Landroid/hardware/Camera$Parameters;

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4, v2}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    :try_start_1
    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-static {p1, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->isCamera2NativelySupported(Landroid/content/Context;Lcom/microblink/camera/hardware/camera/CameraType;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/microblink/camera/util/DeviceInformation;->mCamera2NativelySupported:Z
    :try_end_1
    .catch Landroid/util/AndroidException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    iput-boolean v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mCamera2NativelySupported:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public getAndroidRelease()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mAndroidRelease:Ljava/lang/String;

    return-object v0
.end method

.method public getApiLevel()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mApiLevel:I

    return v0
.end method

.method public getChosenCameraStrategy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mChosenCameraStrategy:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mDeviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mDeviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getManufacturer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mManufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getPreparedCameraParameters()Landroid/hardware/Camera$Parameters;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mPreparedCameraParameters:Landroid/hardware/Camera$Parameters;

    return-object v0
.end method

.method public getScreenHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenHeight:I

    return v0
.end method

.method public getScreenWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mScreenWidth:I

    return v0
.end method

.method public isAutofocusSupported()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mAutofocusSupported:Z

    return v0
.end method

.method public isCamera2NativelySupported()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mCamera2NativelySupported:Z

    return v0
.end method

.method public isCameraHasFlash()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/util/DeviceInformation;->mCameraHasFlash:Z

    return v0
.end method
