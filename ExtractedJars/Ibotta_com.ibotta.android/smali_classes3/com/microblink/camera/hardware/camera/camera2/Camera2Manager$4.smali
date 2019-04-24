.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

.field final synthetic val$on:Z

.field final synthetic val$sc:Lcom/microblink/camera/hardware/SuccessCallback;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iput-boolean p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$on:Z

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$on:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v3

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v4

    invoke-interface {v4}, Lcom/microblink/camera/util/IProcessingQueue;->getHandler()Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$on:Z

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mResponsesSinceLastTorchRequest:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$4;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    :cond_1
    return-void
.end method
