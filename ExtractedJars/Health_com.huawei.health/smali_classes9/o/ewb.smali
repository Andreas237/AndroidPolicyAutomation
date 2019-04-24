.class public Lo/ewb;
.super Lo/eir;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V
    .locals 0

    .line 23
    invoke-direct/range {p0 .. p5}, Lo/eir;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    .line 24
    return-void
.end method


# virtual methods
.method public d(FFZ)V
    .locals 3

    .line 29
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    const/4 v1, 0x5

    iput v1, v0, Lo/lh;->d:I

    .line 30
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v1, p0, Lo/ewb;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 31
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 32
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    const/high16 v1, 0x41e80000    # 29.0f

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 33
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    const/high16 v1, 0x426c0000    # 59.0f

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 34
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    const/high16 v1, 0x429e0000    # 79.0f

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 35
    iget-object v0, p0, Lo/ewb;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    const/high16 v1, 0x42c60000    # 99.0f

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 36
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 10

    .line 41
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/ewb;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    iget-object v2, p0, Lo/ewb;->l:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->n()F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 50
    invoke-virtual {p0}, Lo/ewb;->a()[F

    move-result-object v5

    .line 52
    iget-object v0, p0, Lo/ewb;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/ewb;->k:Lo/lp;

    invoke-virtual {v1}, Lo/lp;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    iget-object v0, p0, Lo/ewb;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Lo/evw;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    iget-object v6, p0, Lo/ewb;->i:Landroid/graphics/Path;

    .line 56
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 58
    const/4 v7, 0x0

    :goto_0
    array-length v0, v5

    if-ge v7, v0, :cond_2

    .line 59
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->a()I

    move-result v8

    .line 61
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->S()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    const/16 v3, 0xd

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    goto :goto_1

    .line 64
    :cond_1
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    check-cast v0, Lo/eit;

    invoke-virtual {v0}, Lo/eit;->R()I

    move-result v9

    .line 66
    :goto_1
    iget-object v0, p0, Lo/ewb;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    invoke-virtual {p0, v6, v7, v5}, Lo/ewb;->b(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v0

    iget-object v1, p0, Lo/ewb;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 69
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 70
    iget-object v0, p0, Lo/ewb;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    add-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 74
    :cond_2
    iget-object v0, p0, Lo/ewb;->k:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->K()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 75
    invoke-virtual {p0, p1}, Lo/ewb;->a(Landroid/graphics/Canvas;)V

    .line 77
    :cond_3
    return-void
.end method
