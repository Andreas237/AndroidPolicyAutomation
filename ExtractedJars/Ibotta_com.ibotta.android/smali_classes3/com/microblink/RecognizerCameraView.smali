.class Lcom/microblink/RecognizerCameraView;
.super Lcom/microblink/camera/view/BaseCameraView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;
    }
.end annotation


# static fields
.field private static final MAX_BLURRY_FRAME_COUNT:I = 0xa

.field private static final TAG:Ljava/lang/String; = "ReceiptCameraView"


# instance fields
.field private blurryFrameCount:I

.field private canFocusCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

.field private enableEnhancedAutoFocus:Z

.field private interceptor:Lcom/microblink/Interceptor;

.field private isProcessingFrame:Z

.field private listener:Lcom/microblink/CameraDataListener;

.field private regionOfInterest:Landroid/graphics/RectF;

.field private scanRegionOfInterest:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/microblink/RecognizerCameraView;->isProcessingFrame:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->canFocusCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v0, p0, Lcom/microblink/RecognizerCameraView;->enableEnhancedAutoFocus:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/microblink/camera/view/BaseCameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/microblink/RecognizerCameraView;->isProcessingFrame:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->canFocusCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p2, p0, Lcom/microblink/RecognizerCameraView;->enableEnhancedAutoFocus:Z

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/RecognizerCameraView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerCameraView;->canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/RecognizerCameraView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/RecognizerCameraView;->isProcessingFrame:Z

    return p0
.end method

.method static synthetic access$102(Lcom/microblink/RecognizerCameraView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/RecognizerCameraView;->isProcessingFrame:Z

    return p1
.end method

.method static synthetic access$200(Lcom/microblink/RecognizerCameraView;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerCameraView;->regionOfInterest:Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic access$202(Lcom/microblink/RecognizerCameraView;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->regionOfInterest:Landroid/graphics/RectF;

    return-object p1
.end method

.method static synthetic access$300(Lcom/microblink/RecognizerCameraView;)I
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/RecognizerCameraView;->getCameraSensorOrientation()I

    move-result p0

    return p0
.end method

.method static synthetic access$400(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/CameraDataListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerCameraView;->listener:Lcom/microblink/CameraDataListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/RecognizerCameraView;)Lcom/microblink/Interceptor;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerCameraView;->interceptor:Lcom/microblink/Interceptor;

    return-object p0
.end method

.method private prepareRegionOfInterest(Lcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 6

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_5

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    sget-object v5, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p1, v5, :cond_0

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    add-float/2addr p1, v0

    sub-float v0, v1, p1

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->top:F

    iget-object v2, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    add-float/2addr p1, v2

    :goto_0
    sub-float v2, v1, p1

    goto :goto_1

    :cond_0
    sget-object v5, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p1, v5, :cond_1

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->left:F

    sub-float v4, v1, p1

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v0, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->right:F

    goto :goto_0

    :cond_1
    sget-object v5, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p1, v5, :cond_2

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v3

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v4

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    add-float/2addr p1, v0

    sub-float v0, v1, p1

    iget-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    iget v2, p1, Landroid/graphics/RectF;->left:F

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/microblink/RecognizerCameraView;->getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;

    move-result-object p1

    invoke-virtual {p0}, Lcom/microblink/RecognizerCameraView;->areCameraPixelsLandscapeLeft()Z

    move-result v5

    if-eqz v5, :cond_3

    add-float/2addr v0, v3

    sub-float v0, v1, v0

    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v5, :cond_4

    goto :goto_2

    :cond_3
    sget-object v5, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    if-ne p1, v5, :cond_4

    :goto_2
    add-float/2addr v2, v4

    sub-float v2, v1, v2

    :cond_4
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1, v0, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_3
    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->regionOfInterest:Landroid/graphics/RectF;

    return-void

    :cond_5
    new-instance p1, Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_3
.end method


# virtual methods
.method cameraDataListener(Lcom/microblink/CameraDataListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->listener:Lcom/microblink/CameraDataListener;

    return-void
.end method

.method canFocusCamera(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->canFocusCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method canReceiveFrame(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method clearInterceptors()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerCameraView;->interceptor(Lcom/microblink/Interceptor;)V

    return-void
.end method

.method public createCameraListener()Lcom/microblink/camera/hardware/camera/CameraListener;
    .locals 1

    new-instance v0, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;

    invoke-direct {v0, p0}, Lcom/microblink/RecognizerCameraView$ReceiptCameraListener;-><init>(Lcom/microblink/RecognizerCameraView;)V

    return-object v0
.end method

.method public destroy()V
    .locals 1

    invoke-super {p0}, Lcom/microblink/camera/view/BaseCameraView;->destroy()V

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->interceptor:Lcom/microblink/Interceptor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/Interceptor;->cancel()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerCameraView;->interceptor(Lcom/microblink/Interceptor;)V

    return-void
.end method

.method public enableEnhancedAutofocus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/RecognizerCameraView;->enableEnhancedAutoFocus:Z

    return-void
.end method

.method public enqueue(Lcom/microblink/BitmapResult;)V
    .locals 6
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result v0

    int-to-double v0, v0

    iget-boolean v2, p0, Lcom/microblink/RecognizerCameraView;->enableEnhancedAutoFocus:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/microblink/RecognizerCameraView;->canFocusCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    const/4 v4, 0x0

    cmpg-double v5, v0, v2

    if-gez v5, :cond_0

    iget v0, p0, Lcom/microblink/RecognizerCameraView;->blurryFrameCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/RecognizerCameraView;->blurryFrameCount:I

    goto :goto_0

    :cond_0
    iput v4, p0, Lcom/microblink/RecognizerCameraView;->blurryFrameCount:I

    :goto_0
    iget v0, p0, Lcom/microblink/RecognizerCameraView;->blurryFrameCount:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    iput v4, p0, Lcom/microblink/RecognizerCameraView;->blurryFrameCount:I

    invoke-virtual {p0}, Lcom/microblink/RecognizerCameraView;->focusCamera()V

    :cond_1
    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->listener:Lcom/microblink/CameraDataListener;

    invoke-interface {v0, p1}, Lcom/microblink/CameraDataListener;->onCameraFrameResults(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method protected interceptor(Lcom/microblink/Interceptor;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->interceptor:Lcom/microblink/Interceptor;

    return-void
.end method

.method public onActivityFlip()V
    .locals 0

    return-void
.end method

.method public requireAutofocusFeature()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public scanRegion(Landroid/graphics/RectF;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    const-string v1, "Width"

    invoke-static {v0, v1}, Lcom/microblink/internal/Validate;->validateScanRegion(FLjava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    const-string v1, "Height"

    invoke-static {v0, v1}, Lcom/microblink/internal/Validate;->validateScanRegion(FLjava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/RecognizerCameraView;->scanRegionOfInterest:Landroid/graphics/RectF;

    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-direct {p0, p1}, Lcom/microblink/RecognizerCameraView;->prepareRegionOfInterest(Lcom/microblink/camera/hardware/orientation/Orientation;)V

    return-void
.end method

.method shouldRunEdgeDetection()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected stopDispatchingFrames()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/RecognizerCameraView;->canProcessFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
