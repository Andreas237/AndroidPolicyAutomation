.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Camera2CaptureSessionCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method private constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-void
.end method


# virtual methods
.method public onActive(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Session is now active"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Session is now closed"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 3
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Failed to configure capture session"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    invoke-static {p1, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$502(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;Z)Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1002(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Z)Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to configure camera capture session"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 4
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "CameraCapture session has been configured"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    invoke-static {p1, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$502(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;Z)Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1002(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Z)Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-void
.end method

.method public onReady(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$Camera2CaptureSessionCallback;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Session is now ready"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
