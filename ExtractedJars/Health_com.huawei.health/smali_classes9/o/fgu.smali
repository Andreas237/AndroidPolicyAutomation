.class public Lo/fgu;
.super Lo/fgy;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Paint;

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>(IILo/fha$c;II)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lo/fgy;-><init>(IILo/fha$c;)V

    .line 34
    iput p4, p0, Lo/fgu;->i:I

    .line 35
    iput p5, p0, Lo/fgu;->k:I

    .line 36
    invoke-direct {p0}, Lo/fgu;->a()V

    .line 37
    return-void
.end method

.method private a()V
    .locals 3

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgu;->c:Landroid/graphics/Paint;

    .line 41
    iget-object v0, p0, Lo/fgu;->c:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fgu;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->d:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lo/fgu;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->d:I

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fgu;->a:Landroid/graphics/Paint;

    .line 45
    iget-object v0, p0, Lo/fgu;->a:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    iget-object v0, p0, Lo/fgu;->a:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fgu;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lo/fgu;->d:Lo/fha$c;

    iget v1, v1, Lo/fha$c;->a:I

    goto :goto_1

    :cond_1
    sget v1, Lo/fgv;->c:I

    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 54
    move-object v0, p1

    iget v1, p0, Lo/fgu;->b:I

    int-to-float v3, v1

    iget v1, p0, Lo/fgu;->e:I

    int-to-float v4, v1

    iget-object v5, p0, Lo/fgu;->c:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 57
    iget v0, p0, Lo/fgu;->k:I

    if-eqz v0, :cond_0

    .line 58
    move-object v0, p1

    iget v1, p0, Lo/fgu;->k:I

    iget v2, p0, Lo/fgu;->i:I

    div-int/lit8 v2, v2, 0x2

    mul-int/2addr v1, v2

    int-to-float v2, v1

    iget v1, p0, Lo/fgu;->b:I

    int-to-float v3, v1

    iget v1, p0, Lo/fgu;->k:I

    iget v4, p0, Lo/fgu;->i:I

    div-int/lit8 v4, v4, 0x2

    mul-int/2addr v1, v4

    int-to-float v4, v1

    iget-object v5, p0, Lo/fgu;->a:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 60
    move-object v0, p1

    iget v1, p0, Lo/fgu;->k:I

    iget v2, p0, Lo/fgu;->i:I

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x1

    mul-int/2addr v1, v2

    int-to-float v2, v1

    iget v1, p0, Lo/fgu;->b:I

    int-to-float v3, v1

    iget v1, p0, Lo/fgu;->k:I

    iget v4, p0, Lo/fgu;->i:I

    div-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1

    mul-int/2addr v1, v4

    int-to-float v4, v1

    iget-object v5, p0, Lo/fgu;->a:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 63
    :cond_0
    return-void
.end method
