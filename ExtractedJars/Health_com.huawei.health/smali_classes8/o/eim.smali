.class public Lo/eim;
.super Lo/nv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eim$e;
    }
.end annotation


# instance fields
.field protected f:Landroid/graphics/Matrix;

.field private m:Landroid/graphics/Matrix;

.field private n:Landroid/content/Context;

.field private o:Lo/eim$e;

.field private p:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/oa;)V
    .locals 1

    .line 32
    invoke-direct {p0, p2}, Lo/nv;-><init>(Lo/oa;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eim;->n:Landroid/content/Context;

    .line 26
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    .line 29
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eim;->o:Lo/eim$e;

    .line 161
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    .line 33
    iput-object p1, p0, Lo/eim;->n:Landroid/content/Context;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Path;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 92
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 93
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 94
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 95
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 96
    return-void
.end method

.method protected b(FFFF)V
    .locals 3

    .line 62
    iget-object v0, p0, Lo/eim;->o:Lo/eim$e;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->o:Lo/eim$e;

    iget-object v2, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-interface {v1, v2}, Lo/eim$e;->c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 65
    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/RectF;)V
    .locals 1

    .line 102
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 103
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 104
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 105
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 106
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 107
    return-void
.end method

.method public c()Landroid/graphics/Matrix;
    .locals 2

    .line 165
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 166
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 167
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 168
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 169
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 170
    iget-object v0, p0, Lo/eim;->p:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public d(Landroid/graphics/RectF;F)V
    .locals 1

    .line 113
    iget v0, p1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 114
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 116
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 117
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 118
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 119
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 120
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 121
    return-void
.end method

.method public d([F)V
    .locals 2

    .line 176
    iget-object v1, p0, Lo/eim;->k:Landroid/graphics/Matrix;

    .line 177
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 180
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 181
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 183
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 184
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 186
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 187
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 189
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 190
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 192
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 193
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 194
    return-void
.end method

.method public e(FFFF)V
    .locals 3

    .line 41
    invoke-super {p0, p1, p2, p3, p4}, Lo/nv;->e(FFFF)V

    .line 43
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 44
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/eim;->b(FFFF)V

    .line 46
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 48
    iget-object v0, p0, Lo/eim;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 55
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 59
    :cond_0
    return-void
.end method

.method public e(Landroid/graphics/RectF;F)V
    .locals 1

    .line 127
    iget v0, p1, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 128
    iget v0, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v0, p2

    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 130
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 131
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 132
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 133
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 134
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 135
    return-void
.end method

.method public e(Lo/eim$e;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/eim;->o:Lo/eim$e;

    .line 72
    return-void
.end method

.method public e([F)V
    .locals 1

    .line 81
    iget-object v0, p0, Lo/eim;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 82
    iget-object v0, p0, Lo/eim;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 83
    iget-object v0, p0, Lo/eim;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 84
    iget-object v0, p0, Lo/eim;->a:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 85
    iget-object v0, p0, Lo/eim;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 86
    return-void
.end method

.method public e(Lo/ekz;FFII)[F
    .locals 6

    .line 200
    sub-int v0, p5, p4

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v2, v0, 0x2

    .line 202
    iget-object v0, p0, Lo/eim;->i:[F

    array-length v0, v0

    if-eq v0, v2, :cond_0

    .line 203
    new-array v0, v2, [F

    iput-object v0, p0, Lo/eim;->i:[F

    .line 205
    :cond_0
    iget-object v3, p0, Lo/eim;->i:[F

    .line 207
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 209
    div-int/lit8 v0, v4, 0x2

    add-int/2addr v0, p4

    invoke-interface {p1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    .line 211
    if-eqz v5, :cond_1

    .line 212
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    aput v0, v3, v4

    .line 213
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, p3

    aput v1, v3, v0

    goto :goto_1

    .line 215
    :cond_1
    const/4 v0, 0x0

    aput v0, v3, v4

    .line 216
    add-int/lit8 v0, v4, 0x1

    const/4 v1, 0x0

    aput v1, v3, v0

    .line 207
    :goto_1
    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    .line 220
    :cond_2
    invoke-virtual {p0}, Lo/eim;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 222
    return-object v3
.end method
