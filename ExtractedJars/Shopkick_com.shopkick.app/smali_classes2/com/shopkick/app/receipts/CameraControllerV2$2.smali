.class Lcom/shopkick/app/receipts/CameraControllerV2$2;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
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

    .line 160
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$300(Lcom/shopkick/app/receipts/CameraControllerV2;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 172
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$402(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 3
    .param p1    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$300(Lcom/shopkick/app/receipts/CameraControllerV2;)Ljava/util/concurrent/Semaphore;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 181
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$402(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    .line 184
    :cond_0
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraDevice error happened with error code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error with cameraDevice, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object p1, p1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->popScreen()V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$300(Lcom/shopkick/app/receipts/CameraControllerV2;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$402(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$500(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    return-void
.end method
