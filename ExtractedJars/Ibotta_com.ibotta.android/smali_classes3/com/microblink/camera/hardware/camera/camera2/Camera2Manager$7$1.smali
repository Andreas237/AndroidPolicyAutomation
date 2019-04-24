.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

.field final synthetic val$height:I

.field final synthetic val$surface:Landroid/graphics/SurfaceTexture;

.field final synthetic val$width:I


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;IILandroid/graphics/SurfaceTexture;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$width:I

    iput p3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$height:I

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$surface:Landroid/graphics/SurfaceTexture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Creating camera surface size to {}x{} and starting preview"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$width:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$height:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$surface:Landroid/graphics/SurfaceTexture;

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$width:I

    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->val$height:I

    invoke-direct {v1, v2, v3, v4}, Lcom/microblink/camera/hardware/camera/CameraSurface;-><init>(Landroid/graphics/SurfaceTexture;II)V

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$702(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraSurface;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7$1;->this$1:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-void
.end method
