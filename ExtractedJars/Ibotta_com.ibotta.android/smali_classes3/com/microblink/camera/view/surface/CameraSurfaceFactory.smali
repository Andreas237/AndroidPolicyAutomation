.class public Lcom/microblink/camera/view/surface/CameraSurfaceFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createCameraView(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/ICameraManager;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/view/surface/ICameraView;
    .locals 2

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const/16 v1, 0xe

    if-ge p2, v1, :cond_1

    instance-of p1, p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-class p1, Lcom/microblink/camera/view/surface/CameraSurfaceFactory;

    const-string p2, "Creating CameraSurfaceView"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_1
    :goto_0
    const-class p1, Lcom/microblink/camera/view/surface/CameraSurfaceFactory;

    const-string p2, "Creating CameraTextureView"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lcom/microblink/camera/view/surface/CameraTextureView;

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/microblink/camera/view/surface/CameraTextureView;-><init>(Landroid/content/Context;)V

    return-object p1
.end method
