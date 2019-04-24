.class public Lcom/scandit/base/draw/SbDrawUtils;
.super Ljava/lang/Object;
.source "SbDrawUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static drawBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIZII)V
    .locals 5

    if-eqz p0, :cond_2

    if-eqz p1, :cond_2

    .line 32
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 33
    invoke-virtual {v0, p6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    if-eqz p8, :cond_0

    const/4 p6, 0x3

    .line 36
    new-array v1, p6, [F

    fill-array-data v1, :array_0

    const/16 v2, 0x39

    const/16 v3, 0xc0

    const/16 v4, 0xcc

    .line 37
    invoke-static {v2, v3, v4, v1}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    .line 38
    new-array p6, p6, [F

    fill-array-data p6, :array_1

    .line 39
    invoke-static {p8}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {p8}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {p8}, Landroid/graphics/Color;->blue(I)I

    move-result p8

    invoke-static {v2, v3, p8, p6}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    const/4 p8, 0x0

    .line 41
    aget p6, p6, p8

    aget v1, v1, p8

    sub-float/2addr p6, v1

    float-to-int p6, p6

    const/16 v1, 0x14

    .line 42
    invoke-static {p8, p8, v1, p6}, Lcom/scandit/base/draw/SbColorFilterGenerator;->adjustColor(IIII)Landroid/graphics/ColorFilter;

    move-result-object p6

    .line 44
    invoke-virtual {v0, p6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_0
    if-eqz p7, :cond_1

    .line 48
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    int-to-float p6, p7

    int-to-float p8, p2

    int-to-float v1, p3

    .line 49
    invoke-virtual {p0, p6, p8, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 52
    :cond_1
    new-instance p6, Landroid/graphics/Rect;

    add-int/2addr p4, p2

    add-int/2addr p5, p3

    invoke-direct {p6, p2, p3, p4, p5}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 p2, 0x0

    .line 53
    invoke-virtual {p0, p1, p2, p6, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    if-eqz p7, :cond_2

    .line 56
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method
