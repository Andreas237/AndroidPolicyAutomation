.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v2, "Triggering autofocus"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSettings;->shouldOptimizeForNearScan()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_0
    invoke-virtual {v0, v3, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v3

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v4

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v5}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v5

    invoke-interface {v5}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v3

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v4

    invoke-interface {v4}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusFailed()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v2, "Cannot trigger autofocus. Camera session is closed!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
