.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field private mFrameID:J

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V
    .locals 2

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->mFrameID:J

    return-void
.end method


# virtual methods
.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 4

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->getFrameByItsBuffer([B)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->obtain()Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setImgBuffer([B)V

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->isPhoneShaking()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setDeviceMoving(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->isCameraInFocus()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setFocused(Z)V

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->mFrameID:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->mFrameID:J

    invoke-virtual {p2, v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setFrameID(J)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/CameraListener;->canReceiveFrame()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$5;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1, p2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->recycle()V

    return-void
.end method
