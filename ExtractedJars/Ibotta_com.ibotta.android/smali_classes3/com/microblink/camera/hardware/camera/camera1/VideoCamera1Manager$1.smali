.class Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field private mFrameID:J

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;)V
    .locals 2

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->mFrameID:J

    return-void
.end method


# virtual methods
.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 5

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    const-string p2, "Cannot obtain frame by its buffer because frame pool has been disposed"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->getFrameByItsBuffer([B)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    const-string v1, "Cannot find frame by its buffer. This is OK if buffered callback is disabled. Otherwise this is an error!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p2, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p2, p2, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mPreviewFramePool:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->obtain()Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setImgBuffer([B)V

    :cond_1
    iget-wide v1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->mFrameID:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->mFrameID:J

    invoke-virtual {p2, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setFrameID(J)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->isPhoneShaking()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setDeviceMoving(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->isCameraInFocus()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->setFocused(Z)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    const-string v1, "Frame {} has arrived from camera"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->getFrameID()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {p1, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/CameraListener;->canReceiveFrame()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/VideoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1, p2}, Lcom/microblink/camera/hardware/camera/CameraListener;->onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V

    return-void

    :cond_2
    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->recycle()V

    return-void
.end method
