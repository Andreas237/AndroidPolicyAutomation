.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 3

    const-string p2, "focus success: {}"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, p2, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotoCallback:Landroid/hardware/Camera$PictureCallback;

    invoke-virtual {p1, p2, p2, v0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    return-void

    :cond_0
    const-string p1, "Focusing failed"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotoCallback:Landroid/hardware/Camera$PictureCallback;

    invoke-interface {p1, p2, p2}, Landroid/hardware/Camera$PictureCallback;->onPictureTaken([BLandroid/hardware/Camera;)V

    return-void
.end method
