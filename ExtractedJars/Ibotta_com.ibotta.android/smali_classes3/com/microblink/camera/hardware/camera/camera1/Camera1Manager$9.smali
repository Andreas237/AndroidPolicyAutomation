.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$on:Z

.field final synthetic val$sc:Lcom/microblink/camera/hardware/SuccessCallback;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-boolean p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$on:Z

    iput-object p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-virtual {v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->isCameraFocusing()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->cancelOngoingFocus()V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iget-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$on:Z

    if-eqz v2, :cond_1

    const-string v2, "torch"

    :goto_0
    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "off"

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "off"

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->performAutofocus()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-void

    :catch_0
    nop

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    if-eqz v0, :cond_4

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v2, "Camera not yet initialized. Unable to change torch state!"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$9;->val$sc:Lcom/microblink/camera/hardware/SuccessCallback;

    if-eqz v0, :cond_6

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    :cond_6
    return-void
.end method
