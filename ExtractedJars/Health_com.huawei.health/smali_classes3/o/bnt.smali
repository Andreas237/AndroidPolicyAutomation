.class public Lo/bnt;
.super Landroid/text/style/ImageSpan;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/bnt;->a:I

    .line 35
    iput p2, p0, Lo/bnt;->a:I

    .line 36
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 5

    .line 68
    invoke-virtual {p0}, Lo/bnt;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 69
    if-eqz v3, :cond_0

    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 72
    const/4 v4, 0x0

    .line 73
    sub-int v0, p8, p6

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p6

    iget v1, p0, Lo/bnt;->a:I

    div-int/lit8 v1, v1, 0x2

    sub-int v4, v0, v1

    .line 74
    int-to-float v0, v4

    invoke-virtual {p1, p5, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 75
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 76
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 78
    :cond_0
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 9

    .line 41
    invoke-virtual {p0}, Lo/bnt;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 42
    if-eqz v2, :cond_1

    .line 44
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    .line 45
    if-eqz p5, :cond_0

    .line 47
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 48
    iget v0, v4, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v1, v4, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int v5, v0, v1

    .line 49
    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v1, v3, Landroid/graphics/Rect;->top:I

    sub-int v6, v0, v1

    .line 51
    div-int/lit8 v0, v6, 0x2

    div-int/lit8 v1, v5, 0x4

    sub-int v7, v0, v1

    .line 52
    div-int/lit8 v0, v6, 0x2

    div-int/lit8 v1, v5, 0x4

    add-int v8, v0, v1

    .line 54
    neg-int v0, v8

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 55
    neg-int v0, v8

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 56
    iput v7, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 57
    iput v7, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 59
    :cond_0
    iget v0, v3, Landroid/graphics/Rect;->right:I

    return v0

    .line 61
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
