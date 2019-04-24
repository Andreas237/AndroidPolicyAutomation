.class public final Lcom/ibotta/android/commons/view/PerfectFitImageView;
.super Landroid/support/v7/widget/AppCompatImageView;
.source "PerfectFitImageView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J0\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00132\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\u0007H\u0016J\u0012\u0010(\u001a\u00020\u00132\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fR$\u0010\t\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/PerfectFitImageView;",
        "Landroid/support/v7/widget/AppCompatImageView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "gravity",
        "getGravity",
        "()I",
        "setGravity",
        "(I)V",
        "listener",
        "Lcom/ibotta/android/commons/view/ImageSizeListener;",
        "scaledRect",
        "Landroid/graphics/Rect;",
        "initMatrix",
        "",
        "isGravity",
        "",
        "value",
        "onLayout",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "setImageBitmap",
        "bm",
        "Landroid/graphics/Bitmap;",
        "setImageDrawable",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "setImageResource",
        "resId",
        "setImageURI",
        "uri",
        "Landroid/net/Uri;",
        "setListener",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private gravity:I

.field private listener:Lcom/ibotta/android/commons/view/ImageSizeListener;

.field private scaledRect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x11

    .line 30
    iput p3, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->gravity:I

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 39
    :try_start_0
    sget-object v1, Lcom/ibotta/android/commons/R$styleable;->ScaledUpImageView:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 40
    sget p2, Lcom/ibotta/android/commons/R$styleable;->ScaledUpImageView_gravity:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setGravity(I)V

    .line 41
    sget p2, Lcom/ibotta/android/commons/R$styleable;->ScaledUpImageView_max_width:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setMaxWidth(I)V

    .line 42
    sget p2, Lcom/ibotta/android/commons/R$styleable;->ScaledUpImageView_max_height:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setMaxHeight(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 48
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setAdjustViewBounds(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 24
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 25
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/commons/view/PerfectFitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final initMatrix()V
    .locals 8

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    return-void

    .line 106
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "drawable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "drawable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getPaddingRight()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    sub-float/2addr v2, v4

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getPaddingBottom()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    int-to-float v4, v4

    cmpl-float v5, v0, v4

    if-lez v5, :cond_6

    cmpl-float v5, v1, v4

    if-lez v5, :cond_6

    cmpl-float v5, v2, v4

    if-lez v5, :cond_6

    cmpl-float v4, v3, v4

    if-lez v4, :cond_6

    div-float v4, v2, v0

    mul-float v5, v1, v4

    cmpl-float v5, v5, v3

    if-lez v5, :cond_1

    div-float v4, v3, v1

    :cond_1
    mul-float v0, v0, v4

    mul-float v1, v1, v4

    const/4 v5, 0x5

    .line 125
    invoke-direct {p0, v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->isGravity(I)Z

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    sub-float/2addr v2, v0

    goto :goto_0

    :cond_2
    const/4 v5, 0x1

    .line 126
    invoke-direct {p0, v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->isGravity(I)Z

    move-result v5

    if-eqz v5, :cond_3

    sub-float/2addr v2, v0

    div-float/2addr v2, v6

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    const/16 v5, 0x50

    .line 131
    invoke-direct {p0, v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->isGravity(I)Z

    move-result v5

    if-eqz v5, :cond_4

    sub-float v7, v3, v1

    goto :goto_1

    :cond_4
    const/16 v5, 0x10

    .line 132
    invoke-direct {p0, v5}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->isGravity(I)Z

    move-result v5

    if-eqz v5, :cond_5

    sub-float/2addr v3, v1

    div-float v7, v3, v6

    .line 136
    :cond_5
    :goto_1
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 137
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 138
    invoke-virtual {v3, v2, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 139
    invoke-virtual {p0, v3}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 141
    iget-object v2, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->listener:Lcom/ibotta/android/commons/view/ImageSizeListener;

    if-eqz v2, :cond_6

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/commons/view/ImageSizeListener;->onImageSizeChanged(II)V

    .line 145
    :cond_6
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method private final isGravity(I)Z
    .locals 1

    .line 148
    iget v0, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->gravity:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final getGravity()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->gravity:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 56
    invoke-super/range {p0 .. p5}, Landroid/support/v7/widget/AppCompatImageView;->onLayout(ZIIII)V

    if-eqz p1, :cond_5

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-nez p1, :cond_0

    .line 59
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    .line 62
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_1

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 63
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_2

    iput p3, p1, Landroid/graphics/Rect;->top:I

    .line 64
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_3

    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 65
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->scaledRect:Landroid/graphics/Rect;

    if-eqz p1, :cond_4

    iput p5, p1, Landroid/graphics/Rect;->bottom:I

    .line 67
    :cond_4
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    :cond_5
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 72
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 73
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getMaxWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getMaxWidth()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getMaxHeight()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getMaxHeight()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_1
    if-nez p1, :cond_2

    move p1, p2

    :cond_2
    if-nez p2, :cond_3

    move p2, p1

    .line 85
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "drawable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "drawable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    int-to-float p1, p1

    div-float/2addr p1, v0

    mul-float v2, v1, p1

    int-to-float p2, p2

    cmpl-float v2, v2, p2

    if-lez v2, :cond_4

    div-float p1, p2, v1

    :cond_4
    mul-float v0, v0, p1

    float-to-int p2, v0

    mul-float p1, p1, v1

    float-to-int p1, p1

    move v3, p2

    move p2, p1

    move p1, v3

    .line 98
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setGravity(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->gravity:I

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 152
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 156
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 157
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    .line 161
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->setImageResource(I)V

    .line 162
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 166
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 167
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/PerfectFitImageView;->initMatrix()V

    return-void
.end method

.method public final setListener(Lcom/ibotta/android/commons/view/ImageSizeListener;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/commons/view/ImageSizeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/commons/view/PerfectFitImageView;->listener:Lcom/ibotta/android/commons/view/ImageSizeListener;

    return-void
.end method
