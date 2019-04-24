.class Lcom/microblink/camera/view/BaseCameraView$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/view/BaseCameraView$1;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/BaseCameraView$1;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$1$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$000(Lcom/microblink/camera/view/BaseCameraView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    invoke-interface {v0}, Lcom/microblink/camera/view/CameraEventsListener;->onCameraPreviewStarted()V

    :cond_0
    return-void
.end method
