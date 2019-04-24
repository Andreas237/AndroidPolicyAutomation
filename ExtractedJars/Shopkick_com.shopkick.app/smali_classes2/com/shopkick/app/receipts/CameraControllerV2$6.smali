.class Lcom/shopkick/app/receipts/CameraControllerV2$6;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "CameraControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;->createCameraPreviewSession()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 1089
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 1125
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera Capture Session failed to configure."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 3

    .line 1093
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1097
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1902(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;

    .line 1100
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$2000(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x4

    .line 1101
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 1100
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 1106
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$2000(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$2102(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CaptureRequest;)Landroid/hardware/camera2/CaptureRequest;

    .line 1107
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1108
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1900(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$2100(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 1111
    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$6$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/CameraControllerV2$6$1;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2$6;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1119
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera Access Exception while creating capture session"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
