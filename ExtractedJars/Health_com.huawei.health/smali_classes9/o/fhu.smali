.class public Lo/fhu;
.super Landroid/widget/SeekBar;
.source "SourceFile"


# instance fields
.field private a:F

.field private d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 42
    invoke-super {p0, p1}, Landroid/widget/SeekBar;->onDraw(Landroid/graphics/Canvas;)V

    .line 43
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 44
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 46
    iget v0, p0, Lo/fhu;->a:F

    const/high16 v1, 0x40400000    # 3.0f

    div-float v7, v0, v1

    .line 47
    iget v0, p0, Lo/fhu;->a:F

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v8, v0, v1

    .line 48
    const/4 v9, 0x0

    .line 49
    iget v0, p0, Lo/fhu;->d:F

    const/high16 v1, 0x40400000    # 3.0f

    mul-float v10, v0, v1

    .line 50
    const/4 v0, -0x1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 52
    move-object v0, p1

    move v1, v7

    move v2, v9

    move v3, v7

    move v4, v10

    move-object v5, v6

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 53
    move-object v0, p1

    move v1, v8

    move v2, v9

    move v3, v8

    move v4, v10

    move-object v5, v6

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 54
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 35
    invoke-super {p0, p1, p2}, Landroid/widget/SeekBar;->onMeasure(II)V

    .line 36
    invoke-virtual {p0}, Lo/fhu;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/fhu;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fhu;->a:F

    .line 37
    invoke-virtual {p0}, Lo/fhu;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/fhu;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fhu;->d:F

    .line 38
    return-void
.end method
