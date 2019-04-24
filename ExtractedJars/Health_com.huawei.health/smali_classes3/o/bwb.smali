.class public Lo/bwb;
.super Lo/efy;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/LinearGradient;

.field private b:Landroid/graphics/Paint;

.field private c:I

.field private d:I

.field private e:Landroid/graphics/Matrix;

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/efy;-><init>(Landroid/content/Context;)V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/bwb;->d:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/bwb;->c:I

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwb;->f:Z

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Lo/efy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/bwb;->d:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/bwb;->c:I

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwb;->f:Z

    .line 31
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 58
    invoke-super {p0, p1}, Lo/efy;->onDraw(Landroid/graphics/Canvas;)V

    .line 59
    iget-boolean v0, p0, Lo/bwb;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bwb;->e:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 61
    iget v0, p0, Lo/bwb;->c:I

    iget v1, p0, Lo/bwb;->d:I

    div-int/lit8 v1, v1, 0xa

    add-int/2addr v0, v1

    iput v0, p0, Lo/bwb;->c:I

    .line 63
    iget v0, p0, Lo/bwb;->c:I

    iget v1, p0, Lo/bwb;->d:I

    mul-int/lit8 v1, v1, 0x2

    if-le v0, v1, :cond_0

    .line 64
    iget v0, p0, Lo/bwb;->d:I

    neg-int v0, v0

    iput v0, p0, Lo/bwb;->c:I

    .line 66
    :cond_0
    iget-object v0, p0, Lo/bwb;->e:Landroid/graphics/Matrix;

    iget v1, p0, Lo/bwb;->c:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 67
    iget-object v0, p0, Lo/bwb;->a:Landroid/graphics/LinearGradient;

    iget-object v1, p0, Lo/bwb;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 69
    const-wide/16 v0, 0x32

    invoke-virtual {p0, v0, v1}, Lo/bwb;->postInvalidateDelayed(J)V

    .line 71
    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 8

    .line 39
    invoke-super {p0, p1, p2, p3, p4}, Lo/efy;->onSizeChanged(IIII)V

    .line 40
    iget v0, p0, Lo/bwb;->d:I

    if-nez v0, :cond_0

    .line 43
    invoke-virtual {p0}, Lo/bwb;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/bwb;->d:I

    .line 44
    iget v0, p0, Lo/bwb;->d:I

    if-lez v0, :cond_0

    .line 45
    invoke-virtual {p0}, Lo/bwb;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, Lo/bwb;->b:Landroid/graphics/Paint;

    .line 47
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p0, Lo/bwb;->d:I

    neg-int v1, v1

    int-to-float v1, v1

    const/4 v5, 0x3

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    const/4 v6, 0x3

    new-array v6, v6, [F

    fill-array-data v6, :array_1

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lo/bwb;->a:Landroid/graphics/LinearGradient;

    .line 50
    iget-object v0, p0, Lo/bwb;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/bwb;->a:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 51
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/bwb;->e:Landroid/graphics/Matrix;

    .line 54
    :cond_0
    return-void

    :array_0
    .array-data 4
        -0x80000000
        -0x1
        -0x80000000
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method
