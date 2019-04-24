.class public Lo/ebt;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private k:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ebt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 43
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/ebt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    const-string v0, "#4D4D4D"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/ebt;->c:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lo/ebt;->d:I

    .line 49
    iget v0, p0, Lo/ebt;->d:I

    int-to-float v0, v0

    .line 50
    invoke-virtual {p0}, Lo/ebt;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 51
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 49
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebt;->d:I

    .line 52
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    .line 53
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 54
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 58
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 60
    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v0

    iget v1, p0, Lo/ebt;->e:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lo/ebt;->a:I

    .line 62
    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v0

    iget v1, p0, Lo/ebt;->a:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ebt;->b:I

    .line 63
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    const-string v1, "#aa000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 64
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 66
    move-object v0, p1

    iget v1, p0, Lo/ebt;->e:I

    int-to-float v3, v1

    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v1

    int-to-float v4, v1

    iget-object v5, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 68
    move-object v0, p1

    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v1

    iget v2, p0, Lo/ebt;->e:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v2

    int-to-float v3, v2

    .line 69
    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v2

    int-to-float v4, v2

    iget-object v5, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    .line 68
    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 71
    move-object v0, p1

    iget v1, p0, Lo/ebt;->e:I

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v2

    iget v3, p0, Lo/ebt;->e:I

    sub-int/2addr v2, v3

    int-to-float v3, v2

    iget v2, p0, Lo/ebt;->b:I

    int-to-float v4, v2

    iget-object v5, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 74
    move-object v0, p1

    iget v1, p0, Lo/ebt;->e:I

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v2

    iget v3, p0, Lo/ebt;->b:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    .line 75
    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v3

    iget v4, p0, Lo/ebt;->e:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    .line 74
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 77
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    iget v1, p0, Lo/ebt;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    iget v1, p0, Lo/ebt;->d:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 79
    iget-object v0, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 80
    move-object v0, p1

    iget v1, p0, Lo/ebt;->e:I

    int-to-float v1, v1

    iget v2, p0, Lo/ebt;->b:I

    int-to-float v2, v2

    invoke-virtual {p0}, Lo/ebt;->getWidth()I

    move-result v3

    iget v4, p0, Lo/ebt;->e:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 81
    invoke-virtual {p0}, Lo/ebt;->getHeight()I

    move-result v4

    iget v5, p0, Lo/ebt;->b:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lo/ebt;->k:Landroid/graphics/Paint;

    .line 80
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 83
    return-void
.end method

.method public setHorizontalPadding(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/ebt;->e:I

    .line 87
    return-void
.end method
