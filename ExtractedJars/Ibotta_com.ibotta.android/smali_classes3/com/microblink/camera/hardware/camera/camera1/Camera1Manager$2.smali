.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->resumeFocusing()V

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->isContinuous()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSettings:Lcom/microblink/camera/hardware/camera/CameraSettings;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/camera/CameraSettings;->isRequestFocusOnShakingStopInContinuousMode()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->invalidateFocus()V

    :cond_1
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->doAutofocus(Z)V

    :cond_2
    return-void
.end method
