.class final Lcom/huawei/qrcode/camera/open/DefaultOpenCameraInterface;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/camera/open/OpenCameraInterface;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public open()Landroid/hardware/Camera;
    .locals 1

    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v0

    return-object v0
.end method
