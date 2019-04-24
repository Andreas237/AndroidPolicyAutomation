.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 5

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Surface changed to size: {}x{}, format: {}"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    if-ne p1, p3, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    if-eq p1, p4, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Setting surface holder fixed size to {}"

    new-array p3, v4, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p4

    aput-object p4, p3, v3

    invoke-static {p1, p2, p3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p2

    iget-object p3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p3}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Landroid/util/Size;

    move-result-object p3

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p3

    invoke-interface {p1, p2, p3}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    :cond_1
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Surface has been created!"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/DeviceManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Creating surface and starting preview"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v3, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    new-instance v2, Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget v3, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-direct {v2, p1, v3, v1}, Lcom/microblink/camera/hardware/camera/CameraSurface;-><init>(Landroid/view/SurfaceHolder;II)V

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$702(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraSurface;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/util/IProcessingQueue;

    move-result-object p1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8$1;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8$1;-><init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;)V

    invoke-interface {p1, v0}, Lcom/microblink/camera/util/IProcessingQueue;->postJob(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 3

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Surface has been destroyed"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Removing surface callback"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/CameraSurface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$8;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$702(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Lcom/microblink/camera/hardware/camera/CameraSurface;)Lcom/microblink/camera/hardware/camera/CameraSurface;

    :cond_0
    return-void
.end method
