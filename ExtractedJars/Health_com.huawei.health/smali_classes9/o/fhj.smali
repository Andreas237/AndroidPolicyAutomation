.class public Lo/fhj;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .line 31
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/fhj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    iput-object p1, p0, Lo/fhj;->c:Landroid/content/Context;

    .line 33
    iput p2, p0, Lo/fhj;->a:I

    .line 34
    iput p3, p0, Lo/fhj;->e:I

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fhj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    iput-object p1, p0, Lo/fhj;->c:Landroid/content/Context;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    const v0, -0x49ade

    iput v0, p0, Lo/fhj;->d:I

    .line 23
    const v0, -0x262627

    iput v0, p0, Lo/fhj;->b:I

    .line 24
    const/4 v0, 0x3

    iput v0, p0, Lo/fhj;->a:I

    .line 25
    const/4 v0, 0x3

    iput v0, p0, Lo/fhj;->e:I

    .line 45
    iput-object p1, p0, Lo/fhj;->c:Landroid/content/Context;

    .line 46
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 10

    .line 56
    new-instance v3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 57
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 60
    iget v0, p0, Lo/fhj;->k:I

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lo/fhj;->a:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    add-int v5, v0, v1

    .line 63
    iget v0, p0, Lo/fhj;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v7, v0, v1

    .line 65
    const/4 v9, 0x0

    :goto_0
    iget v0, p0, Lo/fhj;->a:I

    if-ge v9, v0, :cond_2

    .line 66
    iget-object v0, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    mul-int/2addr v0, v9

    add-int/2addr v0, v5

    int-to-float v6, v0

    .line 67
    iget v0, p0, Lo/fhj;->e:I

    if-ne v9, v0, :cond_0

    .line 68
    iget v0, p0, Lo/fhj;->d:I

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    iget-object v0, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v6, v0

    .line 70
    iget-object v0, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v8, v0, v1

    goto :goto_1

    .line 72
    :cond_0
    iget v0, p0, Lo/fhj;->b:I

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    iget v0, p0, Lo/fhj;->e:I

    if-le v9, v0, :cond_1

    .line 74
    iget-object v0, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v6, v0

    .line 75
    :cond_1
    iget-object v0, p0, Lo/fhj;->c:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v8, v0, v1

    .line 77
    :goto_1
    invoke-virtual {p1, v6, v7, v8, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 65
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 79
    :cond_2
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/fhj;->c(Landroid/graphics/Canvas;)V

    .line 51
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 92
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 93
    invoke-virtual {p0}, Lo/fhj;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/fhj;->k:I

    .line 94
    invoke-virtual {p0}, Lo/fhj;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/fhj;->f:I

    .line 96
    return-void
.end method

.method public setmSelected(I)V
    .locals 1

    .line 82
    iget v0, p0, Lo/fhj;->a:I

    if-le p1, v0, :cond_0

    .line 83
    return-void

    .line 85
    :cond_0
    iput p1, p0, Lo/fhj;->e:I

    .line 86
    invoke-virtual {p0}, Lo/fhj;->invalidate()V

    .line 87
    return-void
.end method
