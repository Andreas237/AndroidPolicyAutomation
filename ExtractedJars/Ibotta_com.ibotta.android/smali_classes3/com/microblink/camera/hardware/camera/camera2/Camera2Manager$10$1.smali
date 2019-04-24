.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

.field final synthetic val$frame:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->val$frame:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/CameraListener;->canReceiveFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->val$frame:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/CameraListener;->onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$10$1;->val$frame:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->recycle()V

    return-void
.end method
