.class public Lcom/microblink/camera/view/surface/CameraSurfaceView;
.super Landroid/view/SurfaceView;

# interfaces
.implements Lcom/microblink/camera/view/surface/ICameraView;


# instance fields
.field private mBottom:I

.field mCallback:Landroid/view/SurfaceHolder$Callback;

.field private mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

.field private mCameraManager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field private mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

.field private mHeight:I

.field private mHostActivityOrientation:I

.field private mLeft:I

.field private mPinchDetector:Landroid/view/ScaleGestureDetector;

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mRight:I

.field private mSingleTouchDetector:Landroid/view/GestureDetector;

.field private mTop:I

.field private mUIThreadHandler:Landroid/os/Handler;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewHeight:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mTop:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mLeft:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mBottom:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mRight:I

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/CameraAspectMode;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mLeft:I

    return p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mTop:I

    return p0
.end method

.method static synthetic access$300(Lcom/microblink/camera/view/surface/CameraSurfaceView;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    return p0
.end method

.method static synthetic access$400(Lcom/microblink/camera/view/surface/CameraSurfaceView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    return-object p0
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mUIThreadHandler:Landroid/os/Handler;

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView$1;-><init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mSingleTouchDetector:Landroid/view/GestureDetector;

    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Lcom/microblink/camera/view/surface/CameraSurfaceView$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView$2;-><init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPinchDetector:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public convertRectangleToActualRect(Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 10

    const/4 v0, 0x2

    new-array v1, v0, [F

    iget v2, p1, Landroid/graphics/RectF;->left:F

    const/4 v3, 0x0

    aput v2, v1, v3

    iget v2, p1, Landroid/graphics/RectF;->top:F

    const/4 v4, 0x1

    aput v2, v1, v4

    new-array v2, v0, [F

    iget v5, p1, Landroid/graphics/RectF;->right:F

    aput v5, v2, v3

    iget v5, p1, Landroid/graphics/RectF;->top:F

    aput v5, v2, v4

    new-array v5, v0, [F

    iget v6, p1, Landroid/graphics/RectF;->left:F

    aput v6, v5, v3

    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    aput v6, v5, v4

    new-array v0, v0, [F

    iget v6, p1, Landroid/graphics/RectF;->right:F

    aput v6, v0, v3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    aput p1, v0, v4

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    invoke-static {v2, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    invoke-static {v5, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    invoke-static {v0, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v1, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v2, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v0, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    aget p1, v1, v3

    aget v6, v2, v3

    aget v7, v5, v3

    aget v8, v0, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-static {p1, v6}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    aget v6, v1, v4

    aget v7, v2, v4

    aget v8, v5, v4

    aget v9, v0, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    aget v7, v1, v3

    aget v8, v2, v3

    aget v9, v5, v3

    aget v3, v0, v3

    invoke-static {v9, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    aget v1, v1, v4

    aget v2, v2, v4

    aget v5, v5, v4

    aget v0, v0, v4

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v2, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mLeft:I

    add-int/2addr p1, v1

    add-int/2addr v3, v1

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mTop:I

    add-int/2addr v6, v1

    add-int/2addr v0, v1

    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1, v6, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraManager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCallback:Landroid/view/SurfaceHolder$Callback;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mSingleTouchDetector:Landroid/view/GestureDetector;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPinchDetector:Landroid/view/ScaleGestureDetector;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getVisibleHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    return v0
.end method

.method public getVisibleWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    return v0
.end method

.method public installCallback(Lcom/microblink/camera/hardware/camera/ICameraManager;)V
    .locals 2

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/ICameraManager;->getSurfaceHolderCallback()Landroid/view/SurfaceHolder$Callback;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCallback:Landroid/view/SurfaceHolder$Callback;

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCallback:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    instance-of v0, p1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraManager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/SurfaceView;->onLayout(ZIIII)V

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mLeft:I

    iput p3, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mTop:I

    iput p4, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mRight:I

    iput p5, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mBottom:I

    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewWidth:I

    if-eqz v0, :cond_5

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewHeight:I

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewHeight:I

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewWidth:I

    const-string v2, "Activity is in portrait mode, preview size used for layouting is {}x{}"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-static {p0, v2, v6}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v6, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    const/4 v7, 0x3

    const/4 v8, 0x4

    if-ne v2, v6, :cond_3

    const-string v2, "Measuring size in ASPECT_FIT mode"

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {p0, v2, v6}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    mul-int v2, p1, v1

    mul-int v6, p2, v0

    if-le v2, v6, :cond_2

    const-string v2, "width*previewHeight ({}*{}) > height*previewWidth ({}*{})"

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v7

    invoke-static {p0, v2, v8}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    div-int/2addr v6, v1

    iput v6, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    goto :goto_0

    :cond_2
    const-string v6, "width*previewHeight ({}*{}) <= height*previewWidth ({}*{})"

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, v7

    invoke-static {p0, v6, v8}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    div-int/2addr v2, v0

    iput v2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    :goto_0
    iget p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    iget p2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->setMeasuredDimension(II)V

    return-void

    :cond_3
    const-string v2, "Measuring size in ASPECT_FILL mode"

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {p0, v2, v6}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    mul-int v2, p1, v1

    mul-int v6, p2, v0

    if-ge v2, v6, :cond_4

    const-string v2, "width*previewHeight ({}*{}) > height*previewWidth ({}*{})"

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v7

    invoke-static {p0, v2, v8}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    div-int p1, v6, v1

    goto :goto_1

    :cond_4
    const-string v6, "width*previewHeight ({}*{}) <= height*previewWidth ({}*{})"

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, v7

    invoke-static {p0, v6, v8}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    div-int p2, v2, v0

    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->setMeasuredDimension(II)V

    return-void

    :cond_5
    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->setMeasuredDimension(II)V

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHeight:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mSingleTouchDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPinchDetector:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public removeCallback()V
    .locals 0

    return-void
.end method

.method public setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-void
.end method

.method public setCameraViewEventListener(Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    return-void
.end method

.method public setHostActivityOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mHostActivityOrientation:I

    return-void
.end method

.method public setPreviewSize(II)V
    .locals 0

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewHeight:I

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mPreviewWidth:I

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mUIThreadHandler:Landroid/os/Handler;

    new-instance p2, Lcom/microblink/camera/view/surface/CameraSurfaceView$3;

    invoke-direct {p2, p0}, Lcom/microblink/camera/view/surface/CameraSurfaceView$3;-><init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setRotation(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView;->mCameraManager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->rotateCameraPreview(I)V

    :cond_0
    return-void
.end method
