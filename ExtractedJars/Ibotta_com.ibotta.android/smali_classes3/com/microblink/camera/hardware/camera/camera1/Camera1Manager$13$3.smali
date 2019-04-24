.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Releasing SurfaceTexture"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    :cond_0
    return-void
.end method
