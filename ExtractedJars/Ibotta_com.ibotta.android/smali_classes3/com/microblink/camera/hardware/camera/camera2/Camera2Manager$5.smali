.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v2, "Pausing accelerometer"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->stopAccelerometer()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Closing preview session"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onPreviewStopped()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Closing camera device"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Closed"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$1700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/media/ImageReader;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Closing image reader"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1900(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/media/ImageReader;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1902(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/media/ImageReader;)Landroid/media/ImageReader;

    :cond_2
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$1500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$5;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
