.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 7
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/hardware/camera2/CaptureRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/hardware/camera2/TotalCaptureResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Capture completed"

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x3

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mResponsesSinceLastTorchRequest:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    sget-object v2, Landroid/hardware/camera2/CaptureResult;->FLASH_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, v2}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v4, "Torch state is {}"

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v2, v5, v0

    invoke-static {v3, v4, v5}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v3, 0x1e

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p2, :cond_4

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    if-le p1, v3, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/camera/hardware/SuccessCallback;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/camera/hardware/SuccessCallback;

    invoke-interface {p1, v1}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    goto :goto_3

    :cond_3
    if-le p1, v3, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$1400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/camera/hardware/SuccessCallback;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :goto_2
    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/SuccessCallback;->onOperationDone(Z)V

    :cond_4
    :goto_3
    sget-object p1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, p1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Focus state is null! This is a bug in device!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lcom/microblink/internal/Logger;->wtf(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Unfocused"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-eq v2, p2, :cond_6

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-ne p2, v1, :cond_7

    :cond_6
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)[Landroid/graphics/Rect;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusFailed()V

    :cond_7
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_4

    :pswitch_1
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Focus locked"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget-object v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_9

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    const/4 v2, 0x4

    if-eq p2, v2, :cond_8

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)[Landroid/graphics/Rect;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    :cond_8
    :goto_4
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2600(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V

    goto/16 :goto_7

    :pswitch_2
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Active scan in progress..."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_9
    :pswitch_3
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Focused"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-eq v2, p2, :cond_a

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-ne p2, v1, :cond_b

    :cond_a
    :goto_5
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)[Landroid/graphics/Rect;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    goto :goto_7

    :goto_6
    :pswitch_4
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Focus in progress..."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-eq v2, p2, :cond_b

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-eq p2, v1, :cond_b

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$2500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)[Landroid/graphics/Rect;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onAutofocusStarted([Landroid/graphics/Rect;)V

    goto :goto_7

    :pswitch_5
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string v3, "Focus state: Focus is currently inactive"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {v2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object v2

    iget v2, v2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-eq v2, p2, :cond_a

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    iget p2, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    if-ne p2, v1, :cond_b

    goto :goto_5

    :cond_b
    :goto_7
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p2, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    :goto_8
    invoke-static {}, Lcom/microblink/internal/Logger;->getCurrentLogLevel()Lcom/microblink/internal/Logger$LogLevel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result p1

    sget-object p2, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {p2}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result p2

    if-lt p1, p2, :cond_d

    sget-object p1, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, p1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch p1, :pswitch_data_1

    goto :goto_a

    :pswitch_6
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE precapture"

    goto :goto_9

    :pswitch_7
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE flash required"

    goto :goto_9

    :pswitch_8
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE locked"

    goto :goto_9

    :pswitch_9
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE converged"

    goto :goto_9

    :pswitch_a
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE searching"

    goto :goto_9

    :pswitch_b
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE inactive"

    goto :goto_9

    :cond_c
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "AE null"

    :goto_9
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_a
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "ISO: {}"

    new-array v2, v1, [Ljava/lang/Object;

    sget-object v3, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, v3}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p1, p2, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Exposure time: {}"

    new-array v2, v1, [Ljava/lang/Object;

    sget-object v3, Landroid/hardware/camera2/CaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, v3}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p1, p2, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Frame duration: {}"

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Landroid/hardware/camera2/CaptureResult;->SENSOR_FRAME_DURATION:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, v2}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p3

    aput-object p3, v1, v0

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0
    .param p1    # Landroid/hardware/camera2/CameraCaptureSession;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/hardware/camera2/CaptureRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super/range {p0 .. p6}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    const-string p2, "Capture started"

    const/4 p3, 0x0

    new-array p4, p3, [Ljava/lang/Object;

    invoke-static {p1, p2, p4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$100(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->access$2000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p3, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;->onPreviewStarted()V

    :cond_0
    return-void
.end method
