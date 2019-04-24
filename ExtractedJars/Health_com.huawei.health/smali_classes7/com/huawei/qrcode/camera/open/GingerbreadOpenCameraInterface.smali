.class public final Lcom/huawei/qrcode/camera/open/GingerbreadOpenCameraInterface;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/camera/open/OpenCameraInterface;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GingerbreadOpenCamera"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public open()Landroid/hardware/Camera;
    .locals 6

    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    if-nez v3, :cond_0

    const-string v0, "GingerbreadOpenCamera"

    const-string v1, "No cameras!"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    new-instance v5, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v5}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    invoke-static {v4, v5}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v0, v5, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v4, v3, :cond_3

    const-string v0, "GingerbreadOpenCamera"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Opening camera #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v5

    goto :goto_2

    :cond_3
    const-string v0, "GingerbreadOpenCamera"

    const-string v1, "No camera facing back; returning camera #0"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v5

    :goto_2
    return-object v5
.end method
