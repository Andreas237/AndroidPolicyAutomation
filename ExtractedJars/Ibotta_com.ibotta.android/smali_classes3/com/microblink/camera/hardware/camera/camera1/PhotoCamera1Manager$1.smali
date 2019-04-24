.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "taking picture"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-boolean v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotographyInProgress:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-boolean v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPreviewActive:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mPhotographyInProgress:Z

    const-string v0, "requesting autofocus"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mCamera:Landroid/hardware/Camera;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$1;)V

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    :cond_0
    return-void
.end method
