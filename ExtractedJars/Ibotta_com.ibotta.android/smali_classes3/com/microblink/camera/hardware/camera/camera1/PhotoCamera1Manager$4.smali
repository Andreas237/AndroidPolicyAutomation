.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# instance fields
.field private mFrameID:J

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V
    .locals 2

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x2dc6c0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->mFrameID:J

    return-void
.end method


# virtual methods
.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 4

    const-string v0, "on picture taken"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iput-boolean v1, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewActive:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    :cond_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object p2

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;

    iget v2, p2, Landroid/hardware/Camera$Size;->width:I

    iget p2, p2, Landroid/hardware/Camera$Size;->height:I

    iget-object v3, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {v0, v2, p2, v1, v3}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;-><init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->setFocused(Z)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->setDeviceMoving(Z)V

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->setImgBuffer([B)V

    iget-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->mFrameID:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, p1

    iput-wide v2, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->mFrameID:J

    invoke-virtual {v0, p1, p2}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->setFrameID(J)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iput-boolean v1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotographyInProgress:Z

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/CameraListener;->canReceiveFrame()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCameraDelegate:Lcom/microblink/camera/hardware/camera/CameraListener;

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/CameraListener;->onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->recycle()V

    return-void
.end method
