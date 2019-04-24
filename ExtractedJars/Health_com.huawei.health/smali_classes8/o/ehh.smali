.class public Lo/ehh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private e:Lo/ehi;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/ehi;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lo/ehh;->a:Landroid/content/Context;

    .line 19
    iput-object p2, p0, Lo/ehh;->e:Lo/ehi;

    .line 20
    return-void
.end method


# virtual methods
.method public a()F
    .locals 2

    .line 32
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->z:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->d:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->r:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->c:F

    add-float/2addr v0, v1

    return v0
.end method

.method public b()F
    .locals 2

    .line 24
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget-boolean v0, v0, Lo/ehi;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ehh;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget-boolean v0, v0, Lo/ehi;->o:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ehh;->a:Landroid/content/Context;

    .line 25
    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 26
    :cond_1
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->f:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->g:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->x:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    .line 28
    :cond_2
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->i:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->k:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->x:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public c()F
    .locals 2

    .line 105
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->p:F

    add-float/2addr v0, v1

    return v0
.end method

.method public d()F
    .locals 2

    .line 39
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget-boolean v0, v0, Lo/ehi;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ehh;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget-boolean v0, v0, Lo/ehi;->o:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ehh;->a:Landroid/content/Context;

    .line 40
    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    :cond_1
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->i:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->k:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->C:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    .line 43
    :cond_2
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->f:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->g:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->C:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public e()F
    .locals 4

    .line 47
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->h:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->n:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->l:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->q:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->u:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->s:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->w:I

    int-to-float v1, v1

    add-float v2, v0, v1

    .line 57
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->v:F

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->t:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->w:I

    int-to-float v1, v1

    add-float v3, v0, v1

    .line 61
    cmpl-float v0, v3, v2

    if-lez v0, :cond_0

    .line 62
    return v3

    .line 65
    :cond_0
    return v2
.end method

.method public f()F
    .locals 2

    .line 113
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->k:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->i:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->e:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->g:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->f:F

    add-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->C:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public g()Landroid/graphics/Rect;
    .locals 6

    .line 122
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->x:I

    iget-object v2, p0, Lo/ehh;->e:Lo/ehi;

    iget v2, v2, Lo/ehi;->z:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->d:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->f:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->g:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->e:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->i:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->k:F

    add-float/2addr v3, v4

    float-to-int v3, v3

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->z:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->d:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->r:F

    add-float/2addr v4, v5

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public h()F
    .locals 2

    .line 109
    invoke-virtual {p0}, Lo/ehh;->f()F

    move-result v0

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->m:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->C:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public i()Landroid/graphics/Rect;
    .locals 6

    .line 134
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lo/ehh;->e:Lo/ehi;

    iget v1, v1, Lo/ehi;->x:I

    iget-object v2, p0, Lo/ehh;->e:Lo/ehi;

    iget v2, v2, Lo/ehi;->z:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->d:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->r:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->c:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->a:F

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->v:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v3, p0, Lo/ehh;->e:Lo/ehi;

    iget v3, v3, Lo/ehi;->x:I

    int-to-float v3, v3

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->f:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->g:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->e:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->i:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->k:F

    add-float/2addr v3, v4

    float-to-int v3, v3

    iget-object v4, p0, Lo/ehh;->e:Lo/ehi;

    iget v4, v4, Lo/ehi;->z:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->d:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->r:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->c:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->a:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->v:F

    add-float/2addr v4, v5

    iget-object v5, p0, Lo/ehh;->e:Lo/ehi;

    iget v5, v5, Lo/ehi;->t:F

    add-float/2addr v4, v5

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public k()F
    .locals 1

    .line 165
    iget-object v0, p0, Lo/ehh;->e:Lo/ehi;

    iget v0, v0, Lo/ehi;->a:F

    return v0
.end method
