.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$rotationDegrees:I


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->val$rotationDegrees:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-boolean v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mPreviewActive:Z

    const/16 v1, 0xe

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result v0

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->isAutofocusing()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->cancelOngoingFocus()V

    :cond_1
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    const-string v2, "Rotating camera preview by {} degrees!"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->val$rotationDegrees:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v0, v2, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->val$rotationDegrees:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)I

    move-result v4

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v5}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object v5

    sget-object v7, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne v5, v7, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v2, v4, v3}, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientation(Landroid/hardware/Camera;IIZ)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->val$rotationDegrees:I

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$502(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;I)I

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result v0

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$7;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    :cond_3
    return-void
.end method
