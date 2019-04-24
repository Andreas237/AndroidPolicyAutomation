.class Lcom/shopkick/app/receipts/CameraControllerV2$1;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "CameraControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method

.method private process(Landroid/hardware/camera2/CaptureResult;)V
    .locals 2

    .line 115
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 125
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_PRECAPTURE_TO_END:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$100(Lcom/shopkick/app/receipts/CameraControllerV2;I)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    .line 151
    invoke-direct {p0, p3}, Lcom/shopkick/app/receipts/CameraControllerV2$1;->process(Landroid/hardware/camera2/CaptureResult;)V

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$1;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$200(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    return-void
.end method

.method public onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    .line 141
    invoke-direct {p0, p3}, Lcom/shopkick/app/receipts/CameraControllerV2$1;->process(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method
