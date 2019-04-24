.class public Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;
.super Ljava/lang/Object;
.source "ZoomGestureDetector.java"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# instance fields
.field final mDetector:Landroid/view/ScaleGestureDetector;

.field mEnabled:Z

.field final mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

.field mInitialZoom:F

.field mScaleFactor:F


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 23
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mScaleFactor:F

    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mInitialZoom:F

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEnabled:Z

    .line 28
    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    .line 29
    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    .line 35
    iget p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mScaleFactor:F

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mScaleFactor:F

    .line 38
    iget p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mInitialZoom:F

    const/high16 v0, 0x3f800000    # 1.0f

    add-float v1, p1, v0

    iget v2, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mScaleFactor:F

    sub-float/2addr v2, v0

    mul-float/2addr v1, v2

    add-float/2addr p1, v1

    .line 39
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 40
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRelativeZoomAsync(F)V

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 0

    .line 46
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->getCurrentZoomFactor()F

    move-result p1

    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mInitialZoom:F

    const/high16 p1, 0x3f800000    # 1.0f

    .line 47
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mScaleFactor:F

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEnabled:Z

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->mEnabled:Z

    return-void
.end method
