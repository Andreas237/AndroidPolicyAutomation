.class public Lcom/shopkick/app/drawables/MultiColorGradientDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "MultiColorGradientDrawable.java"


# instance fields
.field private final mPaint:Landroid/graphics/Paint;

.field private final mRect:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(I[I[F)V
    .locals 9

    .line 19
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 17
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mRect:Landroid/graphics/RectF;

    .line 20
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    .line 21
    new-instance v0, Landroid/graphics/LinearGradient;

    int-to-float v5, p1

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 22
    iget-object p1, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    iget-object p1, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public static getDefaultDealTileColorPositions()[F
    .locals 1

    const/4 v0, 0x4

    .line 58
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3ecccccd    # 0.4f
        0x3f19999a    # 0.6f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static getDefaultDealTileColors()[I
    .locals 4

    const/4 v0, 0x4

    .line 53
    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    aput v2, v0, v1

    const/16 v2, 0x33

    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x1

    aput v2, v0, v3

    const/16 v2, 0x66

    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x2

    aput v2, v0, v3

    const/16 v2, 0xcc

    .line 54
    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    return-object v0
.end method

.method public static getDefaultLookbookTileColorPositions()[F
    .locals 1

    const/4 v0, 0x5

    .line 67
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3e99999a    # 0.3f
        0x3f000000    # 0.5f
        0x3f333333    # 0.7f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static getDefaultLookbookTileColors()[I
    .locals 4

    const/4 v0, 0x5

    .line 62
    new-array v1, v0, [I

    const/4 v2, 0x0

    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    aput v3, v1, v2

    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v3, 0x1

    aput v0, v1, v3

    const/16 v0, 0x33

    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v3, 0x2

    aput v0, v1, v3

    const/16 v0, 0x66

    .line 63
    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v3, 0x3

    aput v0, v1, v3

    const/16 v0, 0xcc

    invoke-static {v0, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v2, 0x4

    aput v0, v1, v2

    return-object v1
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 3

    .line 28
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, p1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/drawables/MultiColorGradientDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
