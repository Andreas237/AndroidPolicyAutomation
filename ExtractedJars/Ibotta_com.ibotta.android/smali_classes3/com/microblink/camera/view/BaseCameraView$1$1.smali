.class Lcom/microblink/camera/view/BaseCameraView$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/view/BaseCameraView$1;

.field final synthetic val$throwable:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/BaseCameraView$1;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$1$1;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iput-object p2, p0, Lcom/microblink/camera/view/BaseCameraView$1$1;->val$throwable:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1$1;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$1$1;->this$1:Lcom/microblink/camera/view/BaseCameraView$1;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$1;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView$1$1;->val$throwable:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lcom/microblink/camera/view/CameraEventsListener;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
