.class public Lo/bwn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:F

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Landroid/graphics/PointF;

.field private h:F

.field private i:F

.field private k:I

.field private l:F

.field private m:Ljava/lang/String;

.field private n:F

.field private o:F

.field private p:F

.field private q:Landroid/graphics/Path;

.field private r:Z

.field private s:Landroid/graphics/Path;

.field private t:Landroid/graphics/Path;

.field private u:Z

.field private v:F

.field private x:F


# direct methods
.method public constructor <init>(FFLjava/lang/String;)V
    .locals 1

    .line 62
    const v0, -0x777778

    invoke-direct {p0, p1, p2, p3, v0}, Lo/bwn;-><init>(FFLjava/lang/String;I)V

    .line 63
    return-void
.end method

.method public constructor <init>(FFLjava/lang/String;I)V
    .locals 6

    .line 67
    move-object v0, p0

    move v1, p1

    move v2, p2

    const-string v3, ""

    move-object v4, p3

    const v5, -0x777778

    invoke-direct/range {v0 .. v5}, Lo/bwn;-><init>(FFLjava/lang/String;Ljava/lang/String;I)V

    .line 68
    return-void
.end method

.method public constructor <init>(FFLjava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/bwn;->c:I

    .line 29
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/bwn;->o:F

    .line 44
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->t:Landroid/graphics/Path;

    .line 46
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->s:Landroid/graphics/Path;

    .line 48
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->q:Landroid/graphics/Path;

    .line 77
    iput p2, p0, Lo/bwn;->n:F

    .line 78
    iput p1, p0, Lo/bwn;->l:F

    .line 79
    sub-float v0, p2, p1

    iput v0, p0, Lo/bwn;->a:F

    .line 80
    iget-object v0, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v1, p0, Lo/bwn;->l:F

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 81
    iput-object p4, p0, Lo/bwn;->f:Ljava/lang/String;

    .line 82
    iput-object p3, p0, Lo/bwn;->m:Ljava/lang/String;

    .line 83
    iput p5, p0, Lo/bwn;->k:I

    .line 84
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/bwn;->a:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bwn;->e:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public constructor <init>(FLjava/lang/String;I)V
    .locals 1

    .line 53
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lo/bwn;-><init>(FFLjava/lang/String;)V

    .line 54
    iput p3, p0, Lo/bwn;->b:I

    .line 55
    return-void
.end method

.method private b(Landroid/graphics/Path;FZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 4

    .line 175
    iget v0, p0, Lo/bwn;->d:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    .line 176
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 177
    iget v0, p4, Landroid/graphics/RectF;->left:F

    iget v1, p4, Landroid/graphics/RectF;->top:F

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 178
    iget v0, p4, Landroid/graphics/RectF;->left:F

    iget v1, p4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 179
    iget v0, p4, Landroid/graphics/RectF;->right:F

    iget v1, p4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    iget v0, p4, Landroid/graphics/RectF;->right:F

    iget v1, p4, Landroid/graphics/RectF;->top:F

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 181
    invoke-virtual {p1, v3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 182
    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {p1, p5, v0, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 188
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_0
    iget v0, p5, Landroid/graphics/RectF;->bottom:F

    iget v1, p0, Lo/bwn;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, p2

    sub-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p5, Landroid/graphics/RectF;->bottom:F

    .line 192
    const/high16 v0, 0x43340000    # 180.0f

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {p1, p5, v0, v1}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 193
    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 194
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()Landroid/graphics/Path;
    .locals 8

    .line 102
    iget v0, p0, Lo/bwn;->a:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 104
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->s:Landroid/graphics/Path;

    .line 105
    iget v0, p0, Lo/bwn;->a:F

    invoke-virtual {p0, v0}, Lo/bwn;->b(F)Landroid/graphics/RectF;

    move-result-object v6

    .line 106
    iget v0, p0, Lo/bwn;->a:F

    invoke-virtual {p0, v0}, Lo/bwn;->a(F)Landroid/graphics/RectF;

    move-result-object v7

    .line 107
    move-object v0, p0

    iget-object v1, p0, Lo/bwn;->s:Landroid/graphics/Path;

    iget v2, p0, Lo/bwn;->a:F

    iget-boolean v3, p0, Lo/bwn;->r:Z

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bwn;->b(Landroid/graphics/Path;FZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v0

    iput-boolean v0, p0, Lo/bwn;->r:Z

    .line 109
    :cond_0
    iget-object v0, p0, Lo/bwn;->s:Landroid/graphics/Path;

    return-object v0
.end method

.method public a(F)Landroid/graphics/RectF;
    .locals 6

    .line 142
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, p1

    iget-object v3, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lo/bwn;->d:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    sub-float/2addr v4, p1

    iget v5, p0, Lo/bwn;->d:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public b()Landroid/graphics/Path;
    .locals 10

    .line 165
    iget v0, p0, Lo/bwn;->a:F

    iget v1, p0, Lo/bwn;->o:F

    sub-float v9, v0, v1

    .line 166
    const/4 v0, 0x0

    cmpl-float v0, v9, v0

    if-lez v0, :cond_0

    .line 167
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->q:Landroid/graphics/Path;

    .line 168
    move-object v0, p0

    iget-object v1, p0, Lo/bwn;->q:Landroid/graphics/Path;

    move v2, v9

    new-instance v4, Landroid/graphics/RectF;

    iget-object v3, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget-object v5, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    iget v6, p0, Lo/bwn;->a:F

    sub-float/2addr v5, v6

    iget v6, p0, Lo/bwn;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    iget-object v6, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    iget v7, p0, Lo/bwn;->d:F

    add-float/2addr v6, v7

    iget-object v7, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v7, v7, Landroid/graphics/PointF;->y:F

    iget v8, p0, Lo/bwn;->o:F

    sub-float/2addr v7, v8

    invoke-direct {v4, v3, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v3, p0, Lo/bwn;->a:F

    .line 169
    invoke-virtual {p0, v3}, Lo/bwn;->a(F)Landroid/graphics/RectF;

    move-result-object v5

    .line 168
    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bwn;->b(Landroid/graphics/Path;FZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 171
    :cond_0
    iget-object v0, p0, Lo/bwn;->q:Landroid/graphics/Path;

    return-object v0
.end method

.method public b(F)Landroid/graphics/RectF;
    .locals 5

    .line 138
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, p1

    iget v3, p0, Lo/bwn;->d:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lo/bwn;->d:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lo/bwn;
    .locals 0

    .line 367
    iput-object p1, p0, Lo/bwn;->e:Ljava/lang/String;

    .line 368
    return-object p0
.end method

.method public b(I)V
    .locals 0

    .line 430
    iput p1, p0, Lo/bwn;->c:I

    .line 431
    return-void
.end method

.method public c()Landroid/graphics/RectF;
    .locals 5

    .line 118
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lo/bwn;->o:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lo/bwn;->d:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public c(F)Lo/bwn;
    .locals 0

    .line 314
    iput p1, p0, Lo/bwn;->h:F

    .line 315
    return-object p0
.end method

.method public clone()Ljava/lang/Object;
    .locals 6

    .line 395
    const/4 v4, 0x0

    .line 397
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    move-object v4, v0

    .line 398
    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v4, Lo/bwn;->g:Landroid/graphics/PointF;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 401
    goto :goto_0

    .line 399
    :catch_0
    move-exception v5

    .line 400
    const-string v0, "SugExcel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    :goto_0
    return-object v4
.end method

.method public d()Landroid/graphics/Path;
    .locals 8

    .line 127
    iget v0, p0, Lo/bwn;->o:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 129
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/bwn;->t:Landroid/graphics/Path;

    .line 130
    iget v0, p0, Lo/bwn;->o:F

    invoke-virtual {p0, v0}, Lo/bwn;->b(F)Landroid/graphics/RectF;

    move-result-object v6

    .line 131
    iget v0, p0, Lo/bwn;->o:F

    invoke-virtual {p0, v0}, Lo/bwn;->a(F)Landroid/graphics/RectF;

    move-result-object v7

    .line 132
    move-object v0, p0

    iget-object v1, p0, Lo/bwn;->t:Landroid/graphics/Path;

    iget v2, p0, Lo/bwn;->o:F

    iget-boolean v3, p0, Lo/bwn;->u:Z

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bwn;->b(Landroid/graphics/Path;FZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v0

    iput-boolean v0, p0, Lo/bwn;->u:Z

    .line 134
    :cond_0
    iget-object v0, p0, Lo/bwn;->t:Landroid/graphics/Path;

    return-object v0
.end method

.method public d(F)Lo/bwn;
    .locals 1

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwn;->u:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwn;->r:Z

    .line 266
    iget v0, p0, Lo/bwn;->o:F

    mul-float/2addr v0, p1

    iput v0, p0, Lo/bwn;->o:F

    .line 267
    iget v0, p0, Lo/bwn;->a:F

    mul-float/2addr v0, p1

    iput v0, p0, Lo/bwn;->a:F

    .line 268
    return-object p0
.end method

.method public e()Landroid/graphics/PointF;
    .locals 4

    .line 204
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p0}, Lo/bwn;->l()F

    move-result v1

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lo/bwn;->a:F

    sub-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public e(F)Lo/bwn;
    .locals 0

    .line 240
    iput p1, p0, Lo/bwn;->d:F

    .line 241
    return-object p0
.end method

.method public e(I)Lo/bwn;
    .locals 0

    .line 304
    iput p1, p0, Lo/bwn;->k:I

    .line 305
    return-object p0
.end method

.method public f()Landroid/graphics/PointF;
    .locals 1

    .line 272
    iget-object v0, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    return-object v0
.end method

.method public f(F)V
    .locals 0

    .line 410
    iput p1, p0, Lo/bwn;->p:F

    .line 411
    return-void
.end method

.method public g()F
    .locals 2

    .line 255
    iget v0, p0, Lo/bwn;->a:F

    iget v1, p0, Lo/bwn;->o:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/bwn;->a:F

    goto :goto_0

    :cond_0
    iget v0, p0, Lo/bwn;->o:F

    :goto_0
    return v0
.end method

.method public h()F
    .locals 1

    .line 246
    iget v0, p0, Lo/bwn;->a:F

    return v0
.end method

.method public h(F)Lo/bwn;
    .locals 0

    .line 380
    iput p1, p0, Lo/bwn;->o:F

    iput p1, p0, Lo/bwn;->v:F

    .line 381
    return-object p0
.end method

.method public i()Landroid/graphics/PointF;
    .locals 4

    .line 209
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p0}, Lo/bwn;->l()F

    move-result v1

    iget-object v2, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lo/bwn;->o:F

    sub-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public i(F)Lo/bwn;
    .locals 3

    .line 336
    iput p1, p0, Lo/bwn;->n:F

    .line 337
    iget v0, p0, Lo/bwn;->n:F

    iget v1, p0, Lo/bwn;->l:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/bwn;->a:F

    .line 338
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##.#"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/bwn;->n:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bwn;->e:Ljava/lang/String;

    .line 339
    return-object p0
.end method

.method public k()F
    .locals 1

    .line 235
    iget v0, p0, Lo/bwn;->d:F

    return v0
.end method

.method public k(F)Lo/bwn;
    .locals 0

    .line 389
    iput p1, p0, Lo/bwn;->a:F

    iput p1, p0, Lo/bwn;->x:F

    .line 390
    return-object p0
.end method

.method public l()F
    .locals 3

    .line 283
    iget-object v0, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 284
    iget-object v0, p0, Lo/bwn;->g:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lo/bwn;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/bwn;->i:F

    goto :goto_0

    .line 286
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mStart \u4e0d\u80fd\u4e3a\u7a7a"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 288
    :goto_0
    iget v0, p0, Lo/bwn;->i:F

    return v0
.end method

.method public m()F
    .locals 1

    .line 344
    iget v0, p0, Lo/bwn;->l:F

    return v0
.end method

.method public n()F
    .locals 1

    .line 331
    iget v0, p0, Lo/bwn;->n:F

    return v0
.end method

.method public o()F
    .locals 1

    .line 309
    iget v0, p0, Lo/bwn;->h:F

    return v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 320
    iget-object v0, p0, Lo/bwn;->f:Ljava/lang/String;

    return-object v0
.end method

.method public q()F
    .locals 1

    .line 376
    iget v0, p0, Lo/bwn;->o:F

    return v0
.end method

.method public r()F
    .locals 2

    .line 372
    iget v0, p0, Lo/bwn;->a:F

    iget v1, p0, Lo/bwn;->o:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public s()F
    .locals 1

    .line 385
    iget v0, p0, Lo/bwn;->a:F

    return v0
.end method

.method public t()I
    .locals 1

    .line 354
    iget v0, p0, Lo/bwn;->b:I

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 363
    iget-object v0, p0, Lo/bwn;->e:Ljava/lang/String;

    return-object v0
.end method

.method public v()F
    .locals 1

    .line 406
    iget v0, p0, Lo/bwn;->p:F

    return v0
.end method

.method public w()I
    .locals 1

    .line 426
    iget v0, p0, Lo/bwn;->c:I

    return v0
.end method
