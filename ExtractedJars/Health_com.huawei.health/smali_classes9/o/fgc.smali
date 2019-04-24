.class public Lo/fgc;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field private static final a:Landroid/graphics/Bitmap$Config;

.field private static final e:Landroid/widget/ImageView$ScaleType;


# instance fields
.field private b:I

.field private c:Landroid/graphics/BitmapShader;

.field private d:Landroid/graphics/Bitmap;

.field private f:Landroid/graphics/ColorFilter;

.field private g:I

.field private h:F

.field private i:F

.field private final k:Landroid/graphics/RectF;

.field private final l:Landroid/graphics/Matrix;

.field private final m:Landroid/graphics/RectF;

.field private final n:Landroid/graphics/Paint;

.field private o:I

.field private final p:Landroid/graphics/Paint;

.field private q:Z

.field private t:Z

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    sput-object v0, Lo/fgc;->e:Landroid/widget/ImageView$ScaleType;

    .line 26
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lo/fgc;->a:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    .line 40
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    .line 41
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    .line 45
    const v0, -0x333334

    iput v0, p0, Lo/fgc;->o:I

    .line 46
    const/4 v0, 0x6

    iput v0, p0, Lo/fgc;->u:I

    .line 53
    invoke-direct {p0}, Lo/fgc;->d()V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fgc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    .line 40
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    .line 41
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    .line 45
    const v0, -0x333334

    iput v0, p0, Lo/fgc;->o:I

    .line 46
    const/4 v0, 0x6

    iput v0, p0, Lo/fgc;->u:I

    .line 62
    sget-object v0, Lcom/huawei/ui/main/R$styleable;->CircleImageView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 63
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 64
    const-string v0, "CircleImageView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Return for null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    return-void

    .line 67
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$styleable;->CircleImageView_BorderWidth:I

    const/4 v1, 0x6

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lo/fgc;->u:I

    .line 68
    sget v0, Lcom/huawei/ui/main/R$styleable;->CircleImageView_BorderColor:I

    const v1, -0x333334

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/fgc;->o:I

    .line 69
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    invoke-direct {p0}, Lo/fgc;->d()V

    .line 71
    return-void
.end method

.method private c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 211
    if-nez p1, :cond_0

    .line 212
    const/4 v0, 0x0

    return-object v0

    .line 215
    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 216
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 222
    :cond_1
    instance-of v0, p1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_2

    .line 223
    :try_start_0
    sget-object v0, Lo/fgc;->a:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x2

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_0

    .line 225
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Lo/fgc;->a:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 228
    :goto_0
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 229
    invoke-virtual {v5}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 230
    invoke-virtual {p1, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    return-object v4

    .line 232
    :catch_0
    move-exception v4

    .line 233
    const-string v0, "CircleImageView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OutOfMemoryError = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const/4 v0, 0x0

    return-object v0
.end method

.method private c()V
    .locals 7

    .line 240
    const/4 v5, 0x0

    .line 241
    const/4 v6, 0x0

    .line 243
    iget-object v0, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 245
    iget v0, p0, Lo/fgc;->b:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lo/fgc;->g:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v1, p0, Lo/fgc;->g:I

    int-to-float v1, v1

    div-float v4, v0, v1

    .line 247
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v1, p0, Lo/fgc;->b:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v5, v0, v1

    goto :goto_0

    .line 249
    :cond_0
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v1, p0, Lo/fgc;->b:I

    int-to-float v1, v1

    div-float v4, v0, v1

    .line 250
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v1, p0, Lo/fgc;->g:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v6, v0, v1

    .line 253
    :goto_0
    iget-object v0, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    invoke-virtual {v0, v4, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 254
    iget-object v0, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v1, v5

    float-to-int v1, v1

    iget v2, p0, Lo/fgc;->u:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v2, v6

    float-to-int v2, v2

    iget v3, p0, Lo/fgc;->u:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 255
    iget-object v0, p0, Lo/fgc;->c:Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lo/fgc;->l:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 256
    return-void
.end method

.method private d()V
    .locals 1

    .line 168
    sget-object v0, Lo/fgc;->e:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 169
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgc;->t:Z

    .line 171
    iget-boolean v0, p0, Lo/fgc;->q:Z

    if-eqz v0, :cond_0

    .line 172
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgc;->q:Z

    .line 175
    :cond_0
    return-void
.end method

.method private e()V
    .locals 6

    .line 178
    iget-boolean v0, p0, Lo/fgc;->t:Z

    if-nez v0, :cond_0

    .line 179
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fgc;->q:Z

    .line 180
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 184
    return-void

    .line 187
    :cond_1
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/fgc;->c:Landroid/graphics/BitmapShader;

    .line 189
    iget-object v0, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 190
    iget-object v0, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fgc;->c:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 192
    iget-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 193
    iget-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 194
    iget-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgc;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 195
    iget-object v0, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/fgc;->u:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 197
    iget-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lo/fgc;->g:I

    .line 198
    iget-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lo/fgc;->b:I

    .line 200
    iget-object v0, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lo/fgc;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/fgc;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 201
    iget-object v0, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v1, p0, Lo/fgc;->u:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lo/fgc;->u:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lo/fgc;->h:F

    .line 203
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    iget v1, p0, Lo/fgc;->u:I

    int-to-float v1, v1

    iget v2, p0, Lo/fgc;->u:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget v4, p0, Lo/fgc;->u:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lo/fgc;->m:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    iget v5, p0, Lo/fgc;->u:I

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 204
    iget-object v0, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fgc;->k:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lo/fgc;->i:F

    .line 206
    invoke-direct {p0}, Lo/fgc;->c()V

    .line 207
    invoke-virtual {p0}, Lo/fgc;->invalidate()V

    .line 208
    return-void
.end method


# virtual methods
.method public getBorderWidth()I
    .locals 1

    .line 74
    iget v0, p0, Lo/fgc;->u:I

    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 88
    sget-object v0, Lo/fgc;->e:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 109
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 110
    invoke-virtual {p0}, Lo/fgc;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 111
    return-void

    .line 114
    :cond_0
    invoke-virtual {p0}, Lo/fgc;->getWidth()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 115
    invoke-virtual {p0}, Lo/fgc;->getHeight()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 116
    int-to-float v0, v4

    int-to-float v1, v5

    iget v2, p0, Lo/fgc;->i:F

    iget-object v3, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 117
    iget v0, p0, Lo/fgc;->u:I

    if-eqz v0, :cond_1

    .line 118
    int-to-float v0, v4

    int-to-float v1, v5

    iget v2, p0, Lo/fgc;->h:F

    iget-object v3, p0, Lo/fgc;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 120
    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 124
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 125
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 126
    return-void
.end method

.method public setAdjustViewBounds(Z)V
    .locals 4

    .line 101
    if-eqz p1, :cond_0

    .line 102
    const-string v0, "CircleImageView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adjustViewBounds not supported."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "adjustViewBounds not supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_0
    return-void
.end method

.method public setBorderWidth(I)V
    .locals 1

    .line 78
    iget v0, p0, Lo/fgc;->u:I

    if-ne p1, v0, :cond_0

    .line 79
    return-void

    .line 82
    :cond_0
    iput p1, p0, Lo/fgc;->u:I

    .line 83
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 84
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    .line 158
    iget-object v0, p0, Lo/fgc;->f:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_0

    .line 159
    return-void

    .line 162
    :cond_0
    iput-object p1, p0, Lo/fgc;->f:Landroid/graphics/ColorFilter;

    .line 163
    iget-object v0, p0, Lo/fgc;->p:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fgc;->f:Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 164
    invoke-virtual {p0}, Lo/fgc;->invalidate()V

    .line 165
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 144
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 145
    iput-object p1, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    .line 146
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 147
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 151
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 152
    invoke-direct {p0, p1}, Lo/fgc;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    .line 153
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 154
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 130
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 131
    invoke-virtual {p0}, Lo/fgc;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fgc;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    .line 132
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 133
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 1

    .line 137
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 138
    invoke-virtual {p0}, Lo/fgc;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fgc;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/fgc;->d:Landroid/graphics/Bitmap;

    .line 139
    invoke-direct {p0}, Lo/fgc;->e()V

    .line 140
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 4

    .line 93
    sget-object v0, Lo/fgc;->e:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_0

    .line 94
    const-string v0, "CircleImageView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setScaleType not supported = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ScaleType %s not supported."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_0
    return-void
.end method
