.class Lo/eul$d;
.super Landroid/text/style/ImageSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eul;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 158
    invoke-direct {p0, p1, p2}, Landroid/text/style/ImageSpan;-><init>(Landroid/content/Context;I)V

    .line 159
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 4

    .line 187
    invoke-virtual {p0}, Lo/eul$d;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 188
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 189
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 190
    const/4 v3, 0x0

    .line 191
    sub-int v0, p8, p6

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int v3, v0, p6

    .line 192
    int-to-float v0, v3

    invoke-virtual {p1, p5, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 193
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 194
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 196
    :cond_0
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 9

    .line 163
    invoke-virtual {p0}, Lo/eul$d;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 164
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 165
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    .line 168
    if-eqz p5, :cond_1

    .line 169
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 170
    iget v0, v4, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v1, v4, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int v5, v0, v1

    .line 171
    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v1, v3, Landroid/graphics/Rect;->top:I

    sub-int v6, v0, v1

    .line 173
    div-int/lit8 v0, v6, 0x2

    div-int/lit8 v1, v5, 0x4

    sub-int v7, v0, v1

    .line 174
    div-int/lit8 v0, v6, 0x2

    div-int/lit8 v1, v5, 0x4

    add-int v8, v0, v1

    .line 176
    neg-int v0, v8

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 177
    neg-int v0, v8

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 178
    iput v7, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 179
    iput v7, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 181
    :cond_1
    iget v0, v3, Landroid/graphics/Rect;->right:I

    return v0
.end method
