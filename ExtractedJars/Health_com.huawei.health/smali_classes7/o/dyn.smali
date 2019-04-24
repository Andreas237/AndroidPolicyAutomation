.class public Lo/dyn;
.super Lo/nv;
.source "SourceFile"


# instance fields
.field f:[F

.field private m:Landroid/graphics/Matrix;

.field private n:Lo/lf;

.field protected o:Landroid/graphics/Matrix;

.field private p:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lo/oa;Lo/lf;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/nv;-><init>(Lo/oa;)V

    .line 26
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyn;->f:[F

    .line 27
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    .line 28
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/dyn;->m:Landroid/graphics/Matrix;

    .line 30
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    .line 41
    iput-object p1, p0, Lo/dyn;->a:Lo/oa;

    .line 42
    iput-object p2, p0, Lo/dyn;->n:Lo/lf;

    .line 43
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Path;)V
    .locals 1

    .line 170
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 171
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 172
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 173
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 174
    return-void
.end method

.method public a(Lo/na;FFII)[F
    .locals 6

    .line 124
    sub-int v0, p5, p4

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v2, v0, 0x2

    .line 125
    iget-object v0, p0, Lo/dyn;->i:[F

    array-length v0, v0

    if-eq v0, v2, :cond_0

    .line 126
    new-array v0, v2, [F

    iput-object v0, p0, Lo/dyn;->i:[F

    .line 129
    :cond_0
    iget-object v3, p0, Lo/dyn;->i:[F

    .line 131
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 132
    div-int/lit8 v0, v4, 0x2

    add-int/2addr v0, p4

    invoke-interface {p1, v0}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    .line 133
    if-eqz v5, :cond_1

    .line 134
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    aput v0, v3, v4

    .line 135
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, p3

    aput v1, v3, v0

    goto :goto_1

    .line 137
    :cond_1
    const/4 v0, 0x0

    aput v0, v3, v4

    .line 138
    add-int/lit8 v0, v4, 0x1

    const/4 v1, 0x0

    aput v1, v3, v0

    .line 131
    :goto_1
    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    .line 142
    :cond_2
    invoke-virtual {p0}, Lo/dyn;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 143
    return-object v3
.end method

.method public b(FF)Lo/nw;
    .locals 5

    .line 256
    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/nw;->a(DD)Lo/nw;

    move-result-object v4

    .line 257
    invoke-virtual {p0, p1, p2, v4}, Lo/dyn;->b(FFLo/nw;)V

    .line 258
    return-object v4
.end method

.method public b(FFLo/nw;)V
    .locals 2

    .line 262
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 263
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 264
    iget-object v0, p0, Lo/dyn;->f:[F

    invoke-virtual {p0, v0}, Lo/dyn;->d([F)V

    .line 265
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-double v0, v0

    iput-wide v0, p3, Lo/nw;->b:D

    .line 266
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    float-to-double v0, v0

    iput-wide v0, p3, Lo/nw;->c:D

    .line 267
    return-void
.end method

.method public b(Landroid/graphics/RectF;)V
    .locals 1

    .line 191
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 192
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 193
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 194
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 195
    return-void
.end method

.method public c()Landroid/graphics/Matrix;
    .locals 2

    .line 287
    iget-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 288
    iget-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 290
    iget-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 292
    iget-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 294
    iget-object v0, p0, Lo/dyn;->p:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public d(FF)Lo/nw;
    .locals 6

    .line 270
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 271
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 272
    iget-object v0, p0, Lo/dyn;->f:[F

    invoke-virtual {p0, v0}, Lo/dyn;->e([F)V

    .line 273
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-double v2, v0

    .line 274
    iget-object v0, p0, Lo/dyn;->f:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    float-to-double v4, v0

    .line 275
    invoke-static {v2, v3, v4, v5}, Lo/nw;->a(DD)Lo/nw;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/graphics/RectF;F)V
    .locals 1

    .line 198
    iget v0, p1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 199
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 200
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 201
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 202
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 203
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 204
    return-void
.end method

.method public d([F)V
    .locals 2

    .line 241
    iget-object v1, p0, Lo/dyn;->k:Landroid/graphics/Matrix;

    .line 242
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 243
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 244
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 245
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 246
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 248
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 249
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 251
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 252
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 253
    return-void
.end method

.method public e(FFFF)V
    .locals 5

    .line 46
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->g()F

    move-result v0

    div-float v3, v0, p2

    .line 47
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->k()F

    move-result v0

    div-float v4, v0, p3

    .line 48
    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const/4 v3, 0x0

    .line 52
    :cond_0
    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const/4 v4, 0x0

    .line 56
    :cond_1
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 57
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    neg-float v1, p1

    neg-float v2, p4

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 58
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    neg-float v1, v4

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 60
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 61
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 63
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->n:Lo/lf;

    invoke-virtual {v1}, Lo/lf;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    neg-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 64
    return-void
.end method

.method public e(Landroid/graphics/RectF;F)V
    .locals 1

    .line 207
    iget v0, p1, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 208
    iget v0, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 209
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 210
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 211
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 212
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 213
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 67
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 68
    if-nez p1, :cond_0

    .line 69
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->a()F

    move-result v1

    iget-object v2, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->n()F

    move-result v2

    iget-object v3, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v3}, Lo/oa;->d()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->a()F

    move-result v1

    iget-object v2, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v2}, Lo/oa;->c()F

    move-result v2

    neg-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 72
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 75
    :goto_0
    return-void
.end method

.method public e([F)V
    .locals 1

    .line 184
    iget-object v0, p0, Lo/dyn;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 185
    iget-object v0, p0, Lo/dyn;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 186
    iget-object v0, p0, Lo/dyn;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 187
    iget-object v0, p0, Lo/dyn;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 188
    return-void
.end method
