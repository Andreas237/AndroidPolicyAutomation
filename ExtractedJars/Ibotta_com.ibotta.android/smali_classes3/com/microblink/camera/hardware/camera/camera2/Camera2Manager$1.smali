.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$302(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraType;)Lcom/microblink/camera/hardware/camera/CameraType;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void
.end method
