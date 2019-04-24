.class public Lcom/microblink/camera/view/surface/DummyCameraView;
.super Landroid/view/View;

# interfaces
.implements Lcom/microblink/camera/view/surface/ICameraView;


# instance fields
.field private mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

.field private mConfigurationOrientation:I

.field private mHeight:I

.field private mHostActivityOrientation:I

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mRedPaint:Landroid/graphics/Paint;

.field private final mTextHeight:F

.field private mTextPaint:Landroid/graphics/Paint;

.field private mWhitePaint:Landroid/graphics/Paint;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    const/16 v0, 0x780

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewWidth:I

    const/16 v0, 0x438

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewHeight:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    const/high16 v0, 0x42fa0000    # 125.0f

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextHeight:F

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    if-eqz p2, :cond_1

    const-string v1, "http://schemas.android.com/apk/res-auto"

    const-string v2, "aspectMode"

    invoke-interface {p2, v1, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v1, "fit"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    goto :goto_0

    :cond_0
    const-string v1, "fill"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    :cond_1
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/microblink/camera/view/surface/DummyCameraView;->init(Landroid/content/Context;Lcom/microblink/camera/view/CameraAspectMode;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/microblink/camera/view/CameraAspectMode;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/camera/view/CameraAspectMode;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    const/16 v0, 0x780

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewWidth:I

    const/16 v0, 0x438

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewHeight:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    const/high16 v0, 0x42fa0000    # 125.0f

    iput v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextHeight:F

    invoke-direct {p0, p1, p2}, Lcom/microblink/camera/view/surface/DummyCameraView;->init(Landroid/content/Context;Lcom/microblink/camera/view/CameraAspectMode;)V

    return-void
.end method

.method private drawCheckers(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    iget-object v3, v0, Lcom/microblink/camera/view/surface/DummyCameraView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v4, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne v3, v4, :cond_0

    iget v1, v0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iget v2, v0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    :cond_0
    int-to-float v1, v1

    const/high16 v3, 0x42480000    # 50.0f

    div-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v4, 0x1

    add-int/2addr v1, v4

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v14, 0x0

    :goto_0
    if-ge v4, v2, :cond_5

    const/4 v9, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v1, :cond_4

    if-eqz v7, :cond_1

    rem-int/lit8 v8, v15, 0x2

    if-nez v8, :cond_2

    goto :goto_2

    :cond_1
    rem-int/lit8 v8, v15, 0x2

    if-nez v8, :cond_3

    :cond_2
    iget-object v8, v0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWhitePaint:Landroid/graphics/Paint;

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v8, v0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    :goto_3
    move-object v13, v8

    add-float v16, v9, v3

    add-float v12, v14, v3

    move-object/from16 v8, p1

    move v10, v14

    move/from16 v11, v16

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v15, v15, 0x1

    move/from16 v9, v16

    goto :goto_1

    :cond_4
    add-float/2addr v14, v3

    xor-int/lit8 v7, v7, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method private init(Landroid/content/Context;Lcom/microblink/camera/view/CameraAspectMode;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/camera/view/CameraAspectMode;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    iput p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mConfigurationOrientation:I

    iput-object p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    const/high16 p2, -0x10000

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/16 p1, 0xff

    const/16 p2, 0x80

    const/16 v0, 0x3b

    const/16 v1, 0x64

    invoke-static {p1, p2, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/microblink/camera/view/surface/DummyCameraView;->setBackgroundColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWhitePaint:Landroid/graphics/Paint;

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWhitePaint:Landroid/graphics/Paint;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    const/high16 p2, 0x42fa0000    # 125.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    const p2, -0xffff01

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

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

    iget p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    invoke-static {v2, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    invoke-static {v5, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    iget p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    invoke-static {v0, p1, v6, v6}, Lcom/microblink/camera/util/CommonUtils;->landscapeRightPointToPoint([FIFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v1, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v2, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredHeight()I

    move-result v6

    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5, p1, v6}, Lcom/microblink/camera/util/CommonUtils;->absolutizePointCoordinate([FFF)V

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredWidth()I

    move-result p1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/microblink/camera/view/surface/DummyCameraView;->getMeasuredHeight()I

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

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1, v6, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mRedPaint:Landroid/graphics/Paint;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWhitePaint:Landroid/graphics/Paint;

    iput-object v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getVisibleHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    return v0
.end method

.method public getVisibleWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    return v0
.end method

.method public installCallback(Lcom/microblink/camera/hardware/camera/ICameraManager;)V
    .locals 0

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/surface/DummyCameraView;->drawCheckers(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v3, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne v2, v3, :cond_0

    iget v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iget v1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    :cond_0
    const-string v2, "Camera"

    iget-object v3, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    int-to-float v0, v0

    sub-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    int-to-float v1, v1

    div-float/2addr v1, v2

    const/high16 v2, 0x427a0000    # 62.5f

    add-float/2addr v1, v2

    const-string v2, "Camera"

    iget-object v3, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v0, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewWidth:I

    iget v1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewHeight:I

    iget v2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mConfigurationOrientation:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v3, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    if-ne v2, v3, :cond_2

    mul-int v2, p1, v0

    mul-int v3, p2, v1

    if-le v2, v3, :cond_1

    div-int/2addr v3, v0

    iput v3, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    goto :goto_1

    :cond_1
    div-int/2addr v2, v1

    iput v2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    iput p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    :goto_1
    iget p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mWidth:I

    iget p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHeight:I

    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/DummyCameraView;->setMeasuredDimension(II)V

    return-void

    :cond_2
    mul-int v2, p1, v0

    mul-int v3, p2, v1

    if-ge v2, v3, :cond_3

    div-int p1, v3, v0

    goto :goto_2

    :cond_3
    div-int p2, v2, v1

    :goto_2
    invoke-virtual {p0, p1, p2}, Lcom/microblink/camera/view/surface/DummyCameraView;->setMeasuredDimension(II)V

    return-void
.end method

.method public removeCallback()V
    .locals 0

    return-void
.end method

.method public setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mCameraAspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-void
.end method

.method public setCameraViewEventListener(Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;)V
    .locals 0

    return-void
.end method

.method public setHostActivityOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mHostActivityOrientation:I

    return-void
.end method

.method public setPreviewSize(II)V
    .locals 0

    iput p1, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewWidth:I

    iput p2, p0, Lcom/microblink/camera/view/surface/DummyCameraView;->mPreviewHeight:I

    return-void
.end method

.method public setRotation(I)V
    .locals 0

    return-void
.end method
