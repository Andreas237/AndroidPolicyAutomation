.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$frame:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->val$frame:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$1000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->isUsingBufferedCallback()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->val$frame:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->getImgBuffer()[B

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->val$frame:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->getImgBuffer()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->getPreviewCallback()Landroid/hardware/Camera$PreviewCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->checkFocus()V

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$6;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v1, "Camera is released, cannot request another frame"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
