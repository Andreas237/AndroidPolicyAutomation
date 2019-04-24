.class public Lcom/shopkick/app/util/EllipsizeColorSpan;
.super Landroid/text/style/ReplacementSpan;
.source "EllipsizeColorSpan.java"

# interfaces
.implements Landroid/text/style/LineBackgroundSpan;


# instance fields
.field color:I

.field layoutLeft:I

.field layoutRight:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutLeft:I

    .line 11
    iput v0, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutRight:I

    .line 15
    iput p1, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->color:I

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 13

    move-object v0, p0

    move-object v8, p2

    move/from16 v9, p3

    move/from16 v10, p7

    move-object/from16 v11, p9

    .line 51
    iget v1, v0, Lcom/shopkick/app/util/EllipsizeColorSpan;->color:I

    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v4, p4

    .line 52
    invoke-virtual {v11, p2, v9, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v1

    float-to-double v1, v1

    .line 53
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v3, v5

    int-to-float v3, v3

    add-float v3, p5, v3

    iget v5, v0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutRight:I

    int-to-float v6, v5

    cmpg-float v3, v3, v6

    if-gez v3, :cond_0

    .line 55
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-int/2addr v5, v1

    int-to-float v5, v5

    int-to-float v6, v10

    move-object v1, p1

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v7, p9

    .line 56
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    const-string/jumbo v1, "\u2026"

    .line 58
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const/4 v5, 0x1

    .line 61
    iget v2, v0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutRight:I

    int-to-float v2, v2

    sub-float v2, v2, p5

    sub-float v6, v2, v1

    const/4 v7, 0x0

    move-object/from16 v1, p9

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Paint;->breakText(Ljava/lang/CharSequence;IIZF[F)I

    move-result v1

    add-int v12, v9, v1

    int-to-float v10, v10

    move-object v1, p1

    move v4, v12

    move/from16 v5, p5

    move v6, v10

    move-object/from16 v7, p9

    .line 62
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    const-string/jumbo v1, "\u2026"

    .line 63
    invoke-virtual {v11, p2, v9, v12}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v2

    add-float v2, p5, v2

    move-object v3, p1

    invoke-virtual {p1, v1, v2, v10, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;III)V
    .locals 0

    .line 30
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 31
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 32
    iget p1, p2, Landroid/graphics/Rect;->left:I

    iput p1, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutLeft:I

    .line 33
    iget p1, p2, Landroid/graphics/Rect;->right:I

    iput p1, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutRight:I

    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 38
    iget p1, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutRight:I

    iget p2, p0, Lcom/shopkick/app/util/EllipsizeColorSpan;->layoutLeft:I

    sub-int/2addr p1, p2

    return p1
.end method
