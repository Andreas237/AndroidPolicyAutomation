.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 3

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v0, "Surface changed to size: {}x{}, format: {}"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 p4, 0x1

    aput-object p3, v1, p4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x2

    aput-object p2, v1, p3

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Surface has been created!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xd

    if-lt v1, v2, :cond_0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-boolean v2, v2, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1200(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object v2

    new-instance v3, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;Landroid/view/SurfaceHolder;II)V

    invoke-interface {v2, v3}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v0, "Surface is being destroyed"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$2;

    invoke-direct {v0, p0, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p1, v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->runOnCameraThread(Ljava/lang/Runnable;)V

    return-void
.end method
