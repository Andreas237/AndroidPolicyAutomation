.class public Lcom/microblink/camera/view/surface/CameraTextureView;
.super Landroid/view/TextureView;

# interfaces
.implements Lcom/microblink/camera/view/surface/ICameraView;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private mBottom:I

.field private mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

.field private mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

.field private mHeight:I

.field private mHostActivityOrientation:I

.field private mIsCamera2:Z

.field private mLeft:I

.field private mPinchDetector:Landroid/view/ScaleGestureDetector;

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mRight:I

.field private mRotation:I

.field private mSingleTouchDetector:Landroid/view/GestureDetector;

.field private mTop:I

.field private mUIThreadHandler:Landroid/os/Handler;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRotation:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    const/4 v1, 0x1

    iput v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mTop:I

    iput v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mLeft:I

    iput v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mBottom:I

    iput v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRight:I

    iput-boolean v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mIsCamera2:Z

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/surface/CameraTextureView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRotation:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mTop:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mLeft:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mBottom:I

    iput v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRight:I

    iput-boolean p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mIsCamera2:Z

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/surface/CameraTextureView;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/camera/view/surface/CameraTextureView;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    return p0
.end method

.method static synthetic access$100(Lcom/microblink/camera/view/surface/CameraTextureView;)Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/view/surface/CameraTextureView;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->configureTransform()V

    return-void
.end method

.method private configureTransform()V
    .locals 6

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredWidth()I

    move-result v0

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredHeight()I

    move-result v1

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget v2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    if-lez v2, :cond_3

    iget v2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    if-lez v2, :cond_3

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    new-instance v3, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v1, v1

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    iget-boolean v5, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mIsCamera2:Z

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_0

    div-float v5, v1, v0

    div-float/2addr v0, v1

    invoke-virtual {v2, v5, v0, v4, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_0
    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRotation:I

    add-int/lit8 v0, v0, -0x5a

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_2

    div-float v5, v1, v0

    div-float/2addr v0, v1

    invoke-virtual {v2, v5, v0, v4, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_2
    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRotation:I

    :goto_0
    int-to-float v0, v0

    invoke-virtual {v2, v0, v4, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    invoke-virtual {p0, v2}, Lcom/microblink/camera/view/surface/CameraTextureView;->setTransform(Landroid/graphics/Matrix;)V

    :cond_3
    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mUIThreadHandler:Landroid/os/Handler;

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/microblink/camera/view/surface/CameraTextureView$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/surface/CameraTextureView$1;-><init>(Lcom/microblink/camera/view/surface/CameraTextureView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mSingleTouchDetector:Landroid/view/GestureDetector;

    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Lcom/microblink/camera/view/surface/CameraTextureView$2;

    invoke-direct {v1, p0}, Lcom/microblink/camera/view/surface/CameraTextureView$2;-><init>(Lcom/microblink/camera/view/surface/CameraTextureView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPinchDetector:Landroid/view/ScaleGestureDetector;

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

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    invoke-static {v2, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    invoke-static {v5, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    invoke-static {v0, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v1, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v2, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getMeasuredHeight()I

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

    iget-object v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v2, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mLeft:I

    add-int/2addr p1, v1

    add-int/2addr v3, v1

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mTop:I

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

    iput-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getVisibleHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    return v0
.end method

.method public getVisibleWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    return v0
.end method

.method public installCallback(Lcom/microblink/camera/hardware/camera/ICameraManager;)V
    .locals 1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/ICameraManager;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/microblink/camera/view/surface/CameraTextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    instance-of p1, p1, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iput-boolean p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mIsCamera2:Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/TextureView;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Camera texture view works only on hardware accelerated windows!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/TextureView;->onLayout(ZIIII)V

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mLeft:I

    iput p3, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mTop:I

    iput p4, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRight:I

    iput p5, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mBottom:I

    invoke-direct {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->configureTransform()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    invoke-super {p0, p1, p2}, Landroid/view/TextureView;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    if-eqz v0, :cond_5

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/CameraTextureView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/camera/util/CommonUtils;->hostOrientationIsPortrait(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    iget v1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

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
    iget-object v2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

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

    iput v6, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

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

    iput v2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    :goto_0
    const-string p1, "Measured dimension: {}x{}"

    new-array p2, v4, [Ljava/lang/Object;

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v5

    iget v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v3

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    iget p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraTextureView;->setMeasuredDimension(II)V

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
    const-string v0, "Measured dimension: {}x{}"

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraTextureView;->setMeasuredDimension(II)V

    return-void

    :cond_5
    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/CameraTextureView;->setMeasuredDimension(II)V

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHeight:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mSingleTouchDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPinchDetector:Landroid/view/ScaleGestureDetector;

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

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-void
.end method

.method public setCameraViewEventListener(Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mCameraViewEventListener:Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;

    return-void
.end method

.method public setHostActivityOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mHostActivityOrientation:I

    return-void
.end method

.method public setPreviewSize(II)V
    .locals 0

    iput p2, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mUIThreadHandler:Landroid/os/Handler;

    new-instance p2, Lcom/microblink/camera/view/surface/CameraTextureView$3;

    invoke-direct {p2, p0}, Lcom/microblink/camera/view/surface/CameraTextureView$3;-><init>(Lcom/microblink/camera/view/surface/CameraTextureView;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setRotation(I)V
    .locals 1

    iput p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mRotation:I

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewHeight:I

    if-lez p1, :cond_0

    iget p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mPreviewWidth:I

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView;->mUIThreadHandler:Landroid/os/Handler;

    new-instance v0, Lcom/microblink/camera/view/surface/CameraTextureView$4;

    invoke-direct {v0, p0}, Lcom/microblink/camera/view/surface/CameraTextureView$4;-><init>(Lcom/microblink/camera/view/surface/CameraTextureView;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
