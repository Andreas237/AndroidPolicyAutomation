.class public Lorg/researchstack/backbone/ui/views/SignatureView;
.super Landroid/view/View;
.source "SignatureView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;,
        Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;
    }
.end annotation


# static fields
.field private static final DEBUG:Z

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

.field private drawBounds:Landroid/graphics/Rect;

.field private guidelineColor:I

.field private guidelineHeight:I

.field private guidelineMargin:I

.field private hintPaint:Landroid/graphics/Paint;

.field private hintText:Ljava/lang/String;

.field private hintTextColor:I

.field private sigPaint:Landroid/graphics/Paint;

.field private sigPath:Landroid/graphics/Path;

.field private sigPoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;",
            ">;"
        }
    .end annotation
.end field

.field private sigPrintColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lorg/researchstack/backbone/ui/views/SignatureView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/views/SignatureView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 60
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    .line 43
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/researchstack/backbone/ui/views/SignatureView;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    .line 43
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/views/SignatureView;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 73
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    .line 43
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    .line 74
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/views/SignatureView;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 75
    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 82
    sget-object v8, Lorg/researchstack/backbone/R$styleable;->SignatureView:[I

    sget v9, Lorg/researchstack/backbone/R$style;->Widget_Backbone_SignatureView:I

    invoke-virtual {p1, p2, v8, p3, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 87
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_signatureColor:I

    const/high16 v9, -0x1000000

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 89
    .local v6, "signatureColor":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_signaturePrintColor:I

    const/high16 v9, -0x1000000

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPrintColor:I

    .line 91
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/high16 v9, 0x3f800000    # 1.0f

    mul-float/2addr v8, v9

    float-to-int v4, v8

    .line 93
    .local v4, "defSignatureStroke":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_signatureStrokeSize:I

    invoke-virtual {v0, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    .line 96
    .local v7, "signatureStroke":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_hintText:I

    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintText:Ljava/lang/String;

    .line 98
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_hintTextColor:I

    const v9, -0x333334

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintTextColor:I

    .line 100
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/high16 v9, 0x41600000    # 14.0f

    mul-float/2addr v8, v9

    float-to-int v3, v8

    .line 101
    .local v3, "defHintTextSize":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_hintTextSize:I

    invoke-virtual {v0, v8, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 104
    .local v5, "hintTextSize":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_guidelineColor:I

    iget v9, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintTextColor:I

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineColor:I

    .line 106
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/high16 v9, 0x41400000    # 12.0f

    mul-float/2addr v8, v9

    float-to-int v2, v8

    .line 107
    .local v2, "defGuidelineMargin":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_guidelineMargin:I

    invoke-virtual {v0, v8, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineMargin:I

    .line 110
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/high16 v9, 0x3f800000    # 1.0f

    mul-float/2addr v8, v9

    float-to-int v1, v8

    .line 111
    .local v1, "defGuidelineHeight":I
    sget v8, Lorg/researchstack/backbone/R$styleable;->SignatureView_guidelineHeight:I

    invoke-virtual {v0, v8, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineHeight:I

    .line 114
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 116
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 117
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 118
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 119
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 120
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 121
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    new-instance v9, Landroid/graphics/CornerPathEffect;

    const/high16 v10, 0x41a00000    # 20.0f

    invoke-direct {v9, v10}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 122
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    int-to-float v9, v7

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 124
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 125
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    iget v9, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintTextColor:I

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 127
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    int-to-float v9, v5

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 128
    return-void
.end method


# virtual methods
.method public clearSignature()V
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    .line 253
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 255
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 257
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->callbacks:Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->callbacks:Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

    invoke-interface {v0}, Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;->onSignatureCleared()V

    .line 261
    :cond_0
    return-void
.end method

.method public createSignatureBitmap()Landroid/graphics/Bitmap;
    .locals 14

    .prologue
    const/4 v9, 0x0

    const/4 v13, 0x0

    .line 284
    new-instance v0, Landroid/graphics/Paint;

    iget-object v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    invoke-direct {v0, v11}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 285
    .local v0, "bitmapSigPaint":Landroid/graphics/Paint;
    iget v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPrintColor:I

    invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 287
    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    .line 288
    .local v10, "sigBounds":Landroid/graphics/RectF;
    iget-object v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    const/4 v12, 0x1

    invoke-virtual {v11, v10, v12}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 290
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    move-result v11

    cmpl-float v11, v11, v13

    if-lez v11, :cond_0

    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    move-result v11

    cmpl-float v11, v11, v13

    if-lez v11, :cond_0

    .line 292
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v2, v11, Landroid/util/DisplayMetrics;->density:F

    .line 293
    .local v2, "density":F
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    move-result v11

    div-float/2addr v11, v2

    float-to-int v4, v11

    .line 294
    .local v4, "dipWidth":I
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    move-result v11

    div-float/2addr v11, v2

    float-to-int v3, v11

    .line 299
    .local v3, "dipHeight":I
    if-eqz v4, :cond_0

    if-nez v3, :cond_1

    .line 324
    .end local v2    # "density":F
    .end local v3    # "dipHeight":I
    .end local v4    # "dipWidth":I
    :cond_0
    :goto_0
    return-object v9

    .line 301
    .restart local v2    # "density":F
    .restart local v3    # "dipHeight":I
    .restart local v4    # "dipWidth":I
    :cond_1
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v3, v11}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 304
    .local v9, "returnedBitmap":Landroid/graphics/Bitmap;
    const/high16 v5, 0x4f000000

    .line 305
    .local v5, "minX":F
    const/high16 v6, 0x4f000000

    .line 307
    .local v6, "minY":F
    iget-object v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    .line 309
    .local v8, "point":Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    iget v12, v8, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    int-to-float v12, v12

    invoke-static {v5, v12}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 310
    iget v12, v8, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    int-to-float v12, v12

    invoke-static {v6, v12}, Ljava/lang/Math;->min(FF)F

    move-result v6

    .line 311
    goto :goto_1

    .line 313
    .end local v8    # "point":Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    :cond_2
    iget-object v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    neg-float v12, v5

    neg-float v13, v6

    invoke-virtual {v11, v12, v13}, Landroid/graphics/Path;->offset(FF)V

    .line 315
    new-instance v7, Landroid/graphics/drawable/shapes/PathShape;

    iget-object v11, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    move-result v12

    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    move-result v13

    invoke-direct {v7, v11, v12, v13}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    .line 316
    .local v7, "pathShape":Landroid/graphics/drawable/shapes/PathShape;
    int-to-float v11, v4

    int-to-float v12, v3

    invoke-virtual {v7, v11, v12}, Landroid/graphics/drawable/shapes/PathShape;->resize(FF)V

    .line 318
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 319
    .local v1, "canvas":Landroid/graphics/Canvas;
    invoke-virtual {v7, v1, v0}, Landroid/graphics/drawable/shapes/PathShape;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public isSignatureDrawn()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 265
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 266
    .local v0, "sigBounds":Landroid/graphics/RectF;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 267
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 186
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 191
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    iget v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 192
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineHeight:I

    sub-int/2addr v0, v2

    int-to-float v2, v0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v3, v0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v0

    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 201
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    iget v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintTextColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineMargin:I

    sub-int/2addr v0, v1

    iget v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->guidelineHeight:I

    sub-int v6, v0, v1

    .line 205
    .local v6, "baselineY":I
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintText:Ljava/lang/String;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    int-to-float v2, v6

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->hintPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 211
    .end local v6    # "baselineY":I
    :goto_0
    return-void

    .line 209
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 6
    .param p1, "state"    # Landroid/os/Parcelable;

    .prologue
    .line 225
    instance-of v2, p1, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;

    if-nez v2, :cond_1

    .line 227
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 248
    :cond_0
    return-void

    :cond_1
    move-object v1, p1

    .line 231
    check-cast v1, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;

    .line 232
    .local v1, "ss":Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;
    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-super {p0, v2}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 234
    iget-object v2, v1, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->points:Ljava/util/List;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    .line 235
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->rewind()V

    .line 237
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    .line 239
    .local v0, "point":Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->isStartPoint()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 241
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    iget v4, v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    int-to-float v4, v4

    iget v5, v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_0

    .line 245
    :cond_2
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    iget v4, v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    int-to-float v4, v4

    iget v5, v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 216
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 217
    .local v1, "superState":Landroid/os/Parcelable;
    new-instance v0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;

    invoke-direct {v0, v1}, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 218
    .local v0, "ss":Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    iput-object v2, v0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->points:Ljava/util/List;

    .line 219
    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "oldw"    # I
    .param p4, "oldh"    # I

    .prologue
    .line 176
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 177
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getPaddingLeft()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 178
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getPaddingTop()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 179
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getPaddingRight()I

    move-result v1

    sub-int v1, p1, v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 180
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->drawBounds:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->getPaddingBottom()I

    move-result v1

    sub-int v1, p2, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 181
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v9, 0x1

    .line 133
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v4, v6

    .line 134
    .local v4, "x":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v5, v6

    .line 136
    .local v5, "y":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    packed-switch v6, :pswitch_data_0

    .line 170
    :goto_0
    return v9

    .line 139
    :pswitch_0
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    new-instance v7, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v5, v8}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;-><init>(III)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 143
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->callbacks:Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

    invoke-interface {v6}, Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;->onSignatureStarted()V

    .line 146
    :cond_0
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    int-to-float v7, v4

    int-to-float v8, v5

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 148
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->invalidate()V

    goto :goto_0

    .line 153
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v0

    .line 155
    .local v0, "hSize":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v0, :cond_1

    .line 157
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getHistoricalX(I)F

    move-result v6

    float-to-int v1, v6

    .line 158
    .local v1, "hX":I
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getHistoricalY(I)F

    move-result v6

    float-to-int v2, v6

    .line 159
    .local v2, "hY":I
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    int-to-float v7, v1

    int-to-float v8, v2

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 160
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    new-instance v7, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    invoke-direct {v7, v4, v5, v9}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;-><init>(III)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 163
    .end local v1    # "hX":I
    .end local v2    # "hY":I
    :cond_1
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPath:Landroid/graphics/Path;

    int-to-float v7, v4

    int-to-float v8, v5

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 164
    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->sigPoints:Ljava/util/List;

    new-instance v7, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    invoke-direct {v7, v4, v5, v9}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;-><init>(III)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SignatureView;->invalidate()V

    goto :goto_0

    .line 136
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

    .prologue
    .line 272
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/SignatureView;->callbacks:Lorg/researchstack/backbone/ui/callbacks/SignatureCallbacks;

    .line 273
    return-void
.end method
