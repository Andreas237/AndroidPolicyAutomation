.class public Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/view/BaseCameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "BaseCameraViewEventsListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/BaseCameraView;


# direct methods
.method protected constructor <init>(Lcom/microblink/camera/view/BaseCameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCameraPinchEvent(F)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$500(Lcom/microblink/camera/view/BaseCameraView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$300(Lcom/microblink/camera/view/BaseCameraView;)Lcom/microblink/camera/hardware/camera/ICameraManager;

    move-result-object v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$600(Lcom/microblink/camera/view/BaseCameraView;)F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->setZoomLevel(F)V

    :cond_0
    return-void
.end method

.method public onCameraTapEvent(FF)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$200(Lcom/microblink/camera/view/BaseCameraView;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$300(Lcom/microblink/camera/view/BaseCameraView;)Lcom/microblink/camera/hardware/camera/ICameraManager;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0}, Lcom/microblink/camera/view/BaseCameraView;->access$400(Lcom/microblink/camera/view/BaseCameraView;)[Landroid/graphics/RectF;

    move-result-object v0

    if-nez v0, :cond_6

    const v0, 0x3e28f5c3    # 0.165f

    sub-float/2addr p1, v0

    sub-float/2addr p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    return-void

    :cond_0
    cmpl-float v1, p2, v0

    if-lez v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    cmpg-float v2, p1, v1

    if-gez v2, :cond_2

    const/4 p1, 0x0

    :cond_2
    cmpg-float v2, p2, v1

    if-gez v2, :cond_3

    const/4 p2, 0x0

    :cond_3
    const v1, 0x3ea8f5c3    # 0.33f

    add-float v2, p1, v1

    cmpl-float v2, v2, v0

    if-lez v2, :cond_4

    sub-float v2, v0, p1

    goto :goto_0

    :cond_4
    const v2, 0x3ea8f5c3    # 0.33f

    :goto_0
    add-float v3, p2, v1

    cmpl-float v3, v3, v0

    if-lez v3, :cond_5

    sub-float v1, v0, p2

    :cond_5
    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const/4 v3, 0x1

    new-array v3, v3, [Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    add-float/2addr v2, p1

    add-float/2addr v1, p2

    invoke-direct {v4, p1, p2, v2, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 p1, 0x0

    aput-object v4, v3, p1

    invoke-virtual {v0, v3, p1}, Lcom/microblink/camera/view/BaseCameraView;->setMeteringAreas([Landroid/graphics/RectF;Z)V

    :cond_6
    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraViewEventsListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {p1}, Lcom/microblink/camera/view/BaseCameraView;->focusCamera()V

    :cond_7
    return-void
.end method
