.class public Lcom/shopkick/app/drawables/RoundedImageDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "RoundedImageDrawable.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;
    }
.end annotation


# instance fields
.field private final mBitmapShader:Landroid/graphics/BitmapShader;

.field private final mCornerRadius:F

.field private final mFillerRect:Landroid/graphics/RectF;

.field private final mPaint:Landroid/graphics/Paint;

.field private final mRect:Landroid/graphics/RectF;

.field private final mType:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;IIF)V
    .locals 6

    .line 29
    sget-object v5, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_ALL_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/drawables/RoundedImageDrawable;-><init>(Landroid/graphics/Bitmap;IIFLcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;IIFLcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 22
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mRect:Landroid/graphics/RectF;

    .line 23
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mFillerRect:Landroid/graphics/RectF;

    .line 37
    iput p4, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mCornerRadius:F

    const/4 p4, 0x1

    .line 39
    invoke-static {p1, p2, p3, p4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 40
    new-instance p2, Landroid/graphics/BitmapShader;

    sget-object p3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {p2, p1, p3, v0}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object p2, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mBitmapShader:Landroid/graphics/BitmapShader;

    .line 42
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 44
    iget-object p1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mBitmapShader:Landroid/graphics/BitmapShader;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 47
    iput-object p5, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mType:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mType:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    sget-object v1, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    if-ne v0, v1, :cond_0

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mFillerRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mCornerRadius:F

    iget-object v2, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 4

    .line 52
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mType:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    sget-object v1, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    if-ne v0, v1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mFillerRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mCornerRadius:F

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, v3, v1, v2, p1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_0
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/drawables/RoundedImageDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
