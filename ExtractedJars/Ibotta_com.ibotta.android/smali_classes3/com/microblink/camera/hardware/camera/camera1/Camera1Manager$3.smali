.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$deviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field final synthetic val$factorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/DeviceManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->val$factorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->val$deviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Opening camera..."

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->val$factorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v3}, Lcom/microblink/camera/hardware/camera/CameraSettings;->getCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;

    move-result-object v1

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->val$deviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v4, v4, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->val$factorySettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-interface {v1, v3, v4, v5}, Lcom/microblink/camera/hardware/camera/camera1/strategy/factory/ICameraStrategyFactory;->createStrategy(Lcom/microblink/camera/hardware/DeviceManager;Landroid/hardware/Camera;Lcom/microblink/camera/hardware/camera/CameraSettings;)Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Camera strategy: {}"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v5, v5, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraStrategy:Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;

    aput-object v5, v4, v2

    invoke-static {v0, v1, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Camera sensor orientation is {}"

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v1, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v0

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$302(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v0

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const/16 v1, 0x10e

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$302(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)I

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$500(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Rotating camera preview by {} degrees!"

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$500(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v1, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$500(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v1

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v4

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v5

    sget-object v6, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v5, v6, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-static {v0, v1, v4, v2}, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientation(Landroid/hardware/Camera;IIZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    :cond_4
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method
