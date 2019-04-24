.class final Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SbCamera2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CameraStateCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method public constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    .line 268
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->setCurrentState(I)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    .line 262
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->forceStop()V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    .line 273
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$1000(Lcom/scandit/base/camera/camera2/SbCamera2;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$800(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$402(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    .line 255
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CameraStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$900(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    return-void
.end method
