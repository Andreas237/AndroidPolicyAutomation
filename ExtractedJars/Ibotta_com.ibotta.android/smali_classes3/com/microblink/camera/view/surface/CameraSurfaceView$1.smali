.class Lcom/microblink/camera/view/surface/CameraSurfaceView$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v2, 0x1

    aput p1, v1, v2

    const-string p1, "Camera surface view touch event at location: ({}, {})"

    new-array v4, v0, [Ljava/lang/Object;

    aget v5, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v3

    aget v5, v1, v2

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {p0, p1, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$000(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/CameraAspectMode;

    move-result-object p1

    sget-object v4, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne p1, v4, :cond_0

    aget p1, v1, v3

    iget-object v4, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {v4}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$100(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr p1, v4

    aput p1, v1, v3

    aget p1, v1, v2

    iget-object v4, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {v4}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$200(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr p1, v4

    aput p1, v1, v2

    :cond_0
    const-string p1, "Camera surface view touch event at raw sensor location: ({}, {})"

    new-array v4, v0, [Ljava/lang/Object;

    aget v5, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v3

    aget v5, v1, v2

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {p0, p1, v4}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-virtual {p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    iget-object v4, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-virtual {v4}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredHeight()I

    move-result v4

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v1, p1, v4}, Lcom/microblink/camera/util/CommonUtils;->relativizePointCoordinate([FFF)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$300(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I

    move-result p1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v1, p1, v4, v4}, Lcom/microblink/camera/util/CommonUtils;->pointToLandscapeRightPoint([FIFF)V

    const-string p1, "Camera surface view touch event at normalized location: ({}, {})"

    new-array v0, v0, [Ljava/lang/Object;

    aget v4, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v0, v3

    aget v4, v1, v2

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$400(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-static {p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->access$400(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    move-result-object p1

    aget v0, v1, v3

    aget v1, v1, v2

    invoke-interface {p1, v0, v1}, Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;->onCameraTapEvent(FF)V

    return v2

    :cond_1
    return v3
.end method
