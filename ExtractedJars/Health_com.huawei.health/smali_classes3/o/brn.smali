.class public Lo/brn;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .line 30
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/brn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    iput-object p1, p0, Lo/brn;->e:Landroid/content/Context;

    .line 32
    iput p2, p0, Lo/brn;->b:I

    .line 33
    iput p3, p0, Lo/brn;->d:I

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/brn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    iput-object p1, p0, Lo/brn;->e:Landroid/content/Context;

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    const v0, 0xfb6522

    iput v0, p0, Lo/brn;->c:I

    .line 20
    const/high16 v0, 0x26000000

    iput v0, p0, Lo/brn;->a:I

    .line 21
    const/4 v0, 0x3

    iput v0, p0, Lo/brn;->b:I

    .line 22
    const/4 v0, 0x3

    iput v0, p0, Lo/brn;->d:I

    .line 44
    iput-object p1, p0, Lo/brn;->e:Landroid/content/Context;

    .line 45
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 7

    .line 54
    new-instance v4, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 55
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 57
    const/4 v6, 0x0

    :goto_0
    iget v0, p0, Lo/brn;->b:I

    if-ge v6, v0, :cond_1

    .line 58
    iget v0, p0, Lo/brn;->d:I

    if-ne v6, v0, :cond_0

    .line 59
    iget v0, p0, Lo/brn;->c:I

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    const/16 v0, 0xff

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 61
    new-instance v5, Landroid/graphics/Point;

    iget v0, p0, Lo/brn;->i:I

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/brn;->b:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    mul-int/2addr v1, v6

    add-int/2addr v0, v1

    iget v1, p0, Lo/brn;->h:I

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v5, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 62
    iget v0, v5, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v5, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 64
    :cond_0
    iget v0, p0, Lo/brn;->a:I

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    const/16 v0, 0x7f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 66
    new-instance v5, Landroid/graphics/Point;

    iget v0, p0, Lo/brn;->i:I

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/brn;->b:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    mul-int/2addr v1, v6

    add-int/2addr v0, v1

    iget v1, p0, Lo/brn;->h:I

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v5, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 67
    iget v0, v5, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v5, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/brn;->e:Landroid/content/Context;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 57
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 70
    :cond_1
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/brn;->c(Landroid/graphics/Canvas;)V

    .line 50
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 83
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 84
    invoke-virtual {p0}, Lo/brn;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/brn;->i:I

    .line 85
    invoke-virtual {p0}, Lo/brn;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/brn;->h:I

    .line 87
    return-void
.end method

.method public setmSelected(I)V
    .locals 1

    .line 73
    iget v0, p0, Lo/brn;->b:I

    if-le p1, v0, :cond_0

    .line 74
    return-void

    .line 76
    :cond_0
    iput p1, p0, Lo/brn;->d:I

    .line 77
    invoke-virtual {p0}, Lo/brn;->invalidate()V

    .line 78
    return-void
.end method
