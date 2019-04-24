.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "SurfaceTexture has become available (size: {}x{})"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-boolean v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;Landroid/graphics/SurfaceTexture;II)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 3

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v0, "SurfaceTexture is about to be destroyed"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$3;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;)V

    invoke-interface {p1, v0}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return v1

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v0, "Immediately releasing SurfaceTexture"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "SurfaceTexture has changed size (new size: {}x{})"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-boolean v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;Landroid/graphics/SurfaceTexture;II)V

    invoke-interface {v0, v1}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
