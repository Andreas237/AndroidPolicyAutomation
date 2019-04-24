.class Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;

.field final synthetic val$areas:[Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;[Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;

    iput-object p2, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;->val$areas:[Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;->val$areas:[Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->access$100(Lcom/microblink/camera/view/BaseCameraView;[Landroid/graphics/Rect;)[Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;->this$1:Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;

    iget-object v1, v1, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v1, v1, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    invoke-interface {v1, v0}, Lcom/microblink/camera/view/CameraEventsListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    return-void
.end method
