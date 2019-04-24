.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v4, "Pausing focus manager"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->pauseFocusing()V

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->setCamera(Landroid/hardware/Camera;)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v4, "Pausing accelerometer"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->stopAccelerometer()V

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$900(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1002(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$5;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
