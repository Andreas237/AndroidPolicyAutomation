.class final Lcom/huawei/qrcode/camera/PreviewCallback;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

.field private previewHandler:Landroid/os/Handler;

.field private previewMessage:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/camera/PreviewCallback;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/camera/PreviewCallback;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/huawei/qrcode/camera/CameraConfigurationManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    return-void
.end method


# virtual methods
.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 6

    iget-object v0, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getCameraResolution()Landroid/graphics/Point;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    iget v0, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->previewMessage:I

    iget v1, v3, Landroid/graphics/Point;->x:I

    iget v2, v3, Landroid/graphics/Point;->y:I

    invoke-virtual {v4, v0, v1, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/camera/PreviewCallback;->TAG:Ljava/lang/String;

    const-string v1, "Got preview callback, but no handler or resolution available"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method setHandler(Landroid/os/Handler;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    iput p2, p0, Lcom/huawei/qrcode/camera/PreviewCallback;->previewMessage:I

    return-void
.end method
