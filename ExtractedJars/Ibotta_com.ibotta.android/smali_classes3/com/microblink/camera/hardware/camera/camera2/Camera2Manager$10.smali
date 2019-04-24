.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field private mFrameID:J

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 2

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->mFrameID:J

    return-void
.end method


# virtual methods
.method public onImageAvailable(Landroid/media/ImageReader;)V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p1, :cond_3

    :try_start_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1800(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "[acquire] Active images: {}"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v0

    invoke-static {v2, v3, v5}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {v1}, Lcom/microblink/camera/hardware/camera/CameraListener;->canReceiveFrame()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2300(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->obtain()Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-virtual {v1, p1, v2}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->setImage(Landroid/media/Image;Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->isCameraInFocus()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->setFocused(Z)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->isPhoneShaking()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v1, v4}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->setDeviceMoving(Z)V

    iget-wide v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->mFrameID:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->mFrameID:J

    invoke-virtual {v1, v2, v3}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->setFrameID(J)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v2

    new-instance v3, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;

    invoke-direct {v3, p0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;)V

    invoke-interface {v2, v3}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-virtual {v1, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->closeImage(Landroid/media/Image;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :catch_1
    move-exception v1

    const/4 p1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Failed to acquire latest image!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->closeImage(Landroid/media/Image;)V

    :cond_4
    return-void
.end method
