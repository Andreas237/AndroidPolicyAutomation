.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$zoomLevel:F


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;F)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->val$zoomLevel:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->val$zoomLevel:F

    invoke-static {v1, v2, v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;FLandroid/hardware/Camera$Parameters;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Failed to set zoom level to {}"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$10;->val$zoomLevel:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
