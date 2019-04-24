.class Lcom/microblink/camera/view/BaseCameraView$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/BaseCameraView;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/BaseCameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCameraPreviewSizeChosen(II)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraSurfaceView:Lcom/microblink/camera/view/surface/ICameraView;

    invoke-interface {v0, p1, p2}, Lcom/microblink/camera/view/surface/ICameraView;->setPreviewSize(II)V

    return-void
.end method

.method public onExceptionCaught(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "Exception caught on camera startup"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0, v2}, Lcom/microblink/camera/view/BaseCameraView;->access$002(Lcom/microblink/camera/view/BaseCameraView;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/microblink/camera/view/BaseCameraView;->mErrorState:Z

    new-instance v1, Lcom/microblink/camera/view/BaseCameraView$1$1;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/view/BaseCameraView$1$1;-><init>(Lcom/microblink/camera/view/BaseCameraView$1;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onPreviewStarted()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->onCameraPreviewStarted()V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->access$002(Lcom/microblink/camera/view/BaseCameraView;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    new-instance v1, Lcom/microblink/camera/view/BaseCameraView$1$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/BaseCameraView$1$2;-><init>(Lcom/microblink/camera/view/BaseCameraView$1;)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->runOnUIThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onPreviewStopped()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->onCameraPreviewStopped()V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->access$002(Lcom/microblink/camera/view/BaseCameraView;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    new-instance v1, Lcom/microblink/camera/view/BaseCameraView$1$3;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/BaseCameraView$1$3;-><init>(Lcom/microblink/camera/view/BaseCameraView$1;)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->runOnUIThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
