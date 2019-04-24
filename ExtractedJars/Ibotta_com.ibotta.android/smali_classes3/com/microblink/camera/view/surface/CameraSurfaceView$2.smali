.class Lcom/microblink/camera/view/surface/CameraSurfaceView$2;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$2;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$2;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {v0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$400(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$2;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {v0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$400(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    invoke-interface {v0, p1}, Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;->onCameraPinchEvent(F)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
