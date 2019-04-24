.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3
    .param p1    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Camera has been disconnected."

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Camera has been disconnected!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 3
    .param p1    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v0, "Error while opening camera."

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    packed-switch p2, :pswitch_data_0

    const-string p1, "Unknown camera error: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    const-string p1, "Camera service has encountered a fatal error. Please reboot the device!"

    goto :goto_0

    :pswitch_1
    const-string p1, "Camera device has encountered a fatal error."

    goto :goto_0

    :pswitch_2
    const-string p1, "Camera device could not be opened due to a device policy."

    goto :goto_0

    :pswitch_3
    const-string p1, "Too many other open camera devices"

    goto :goto_0

    :pswitch_4
    const-string p1, "Camera device is already in use."

    :goto_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object p2

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onExceptionCaught(Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 4
    .param p1    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Camera opened"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v0

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mShouldImmediatelyCloseCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v1, "Immediately closing the camera."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v0, p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1602(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$9;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    return-void
.end method
