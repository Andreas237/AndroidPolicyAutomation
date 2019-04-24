.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Releasing SurfaceTexture"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$3;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$702(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraSurface;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    :cond_0
    return-void
.end method
