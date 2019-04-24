.class public Lo/ewv;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 23
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 24
    iput-object p1, p0, Lo/ewv;->a:Landroid/content/Context;

    .line 26
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewv;->d:I

    .line 27
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewv;->e:I

    .line 28
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/ewv;->c:I

    .line 29
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 9

    .line 58
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 59
    const/16 v0, 0xff

    const/16 v1, 0xcc

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 61
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 62
    const/16 v7, 0xb4

    .line 63
    iget v0, p0, Lo/ewv;->d:I

    int-to-float v0, v0

    iget v1, p0, Lo/ewv;->e:I

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 64
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 65
    move-object v0, p1

    iget v1, p0, Lo/ewv;->c:I

    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v2

    iget-object v3, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v2, v3, v4}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v2, v1

    iget v1, p0, Lo/ewv;->c:I

    int-to-float v4, v1

    move-object v5, v6

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 66
    const-wide v0, 0x4076800000000000L    # 360.0

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 64
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 68
    :cond_0
    return-void
.end method

.method private e(I)I
    .locals 6

    .line 37
    invoke-static {}, Lo/ewo;->d()Lo/ewo;

    move-result-object v0

    iget-object v1, p0, Lo/ewv;->a:Landroid/content/Context;

    const/high16 v2, 0x43700000    # 240.0f

    invoke-virtual {v0, v1, v2}, Lo/ewo;->e(Landroid/content/Context;F)I

    move-result v3

    .line 38
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 39
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 40
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v4, v0, :cond_0

    .line 41
    move v3, v5

    goto :goto_0

    .line 43
    :cond_0
    const/high16 v0, -0x80000000

    if-ne v4, v0, :cond_1

    .line 44
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 47
    :cond_1
    :goto_0
    return v3
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 52
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 53
    invoke-direct {p0, p1}, Lo/ewv;->b(Landroid/graphics/Canvas;)V

    .line 54
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 55
    invoke-virtual {p0}, Lo/ewv;->invalidate()V

    .line 56
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 33
    invoke-direct {p0, p1}, Lo/ewv;->e(I)I

    move-result v0

    invoke-direct {p0, p2}, Lo/ewv;->e(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/ewv;->setMeasuredDimension(II)V

    .line 34
    return-void
.end method
