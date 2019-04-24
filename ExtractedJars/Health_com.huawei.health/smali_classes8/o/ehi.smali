.class public Lo/ehi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field C:I

.field a:F

.field b:Landroid/content/Context;

.field c:F

.field d:F

.field e:F

.field f:F

.field g:F

.field h:F

.field i:F

.field k:F

.field l:F

.field public m:F

.field n:F

.field o:Z

.field public p:F

.field q:F

.field r:F

.field s:F

.field t:F

.field u:F

.field v:F

.field w:I

.field x:I

.field y:F

.field z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehi;->o:Z

    .line 46
    iput-object p1, p0, Lo/ehi;->b:Landroid/content/Context;

    .line 47
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 203
    iget v0, p0, Lo/ehi;->n:F

    return v0
.end method

.method public a(F)Lo/ehi;
    .locals 0

    .line 134
    iput p1, p0, Lo/ehi;->f:F

    .line 135
    return-object p0
.end method

.method public a(FF)Lo/ehi;
    .locals 0

    .line 92
    iput p1, p0, Lo/ehi;->p:F

    .line 93
    iput p2, p0, Lo/ehi;->m:F

    .line 94
    return-object p0
.end method

.method public a(I)Lo/ehi;
    .locals 0

    .line 300
    iput p1, p0, Lo/ehi;->x:I

    .line 301
    return-object p0
.end method

.method public b()F
    .locals 1

    .line 215
    iget v0, p0, Lo/ehi;->i:F

    return v0
.end method

.method public b(F)Lo/ehi;
    .locals 0

    .line 104
    iput p1, p0, Lo/ehi;->d:F

    .line 105
    return-object p0
.end method

.method public b(I)Lo/ehi;
    .locals 0

    .line 305
    iput p1, p0, Lo/ehi;->C:I

    .line 306
    return-object p0
.end method

.method public b(Z)Lo/ehi;
    .locals 0

    .line 194
    iput-boolean p1, p0, Lo/ehi;->o:Z

    .line 195
    return-object p0
.end method

.method public c()F
    .locals 1

    .line 207
    iget v0, p0, Lo/ehi;->l:F

    return v0
.end method

.method public c(F)Lo/ehi;
    .locals 0

    .line 144
    iput p1, p0, Lo/ehi;->i:F

    .line 145
    return-object p0
.end method

.method public c(I)Lo/ehi;
    .locals 0

    .line 315
    iput p1, p0, Lo/ehi;->w:I

    .line 316
    return-object p0
.end method

.method public d()F
    .locals 1

    .line 199
    iget v0, p0, Lo/ehi;->h:F

    return v0
.end method

.method public d(F)Lo/ehi;
    .locals 0

    .line 129
    iput p1, p0, Lo/ehi;->g:F

    .line 130
    return-object p0
.end method

.method public d(I)Lo/ehi;
    .locals 0

    .line 310
    iput p1, p0, Lo/ehi;->z:I

    .line 311
    return-object p0
.end method

.method public e()F
    .locals 1

    .line 211
    iget v0, p0, Lo/ehi;->g:F

    return v0
.end method

.method public e(FFF)Lo/ehh;
    .locals 10

    .line 50
    iget v0, p0, Lo/ehi;->x:I

    int-to-float v0, v0

    iget v1, p0, Lo/ehi;->f:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->g:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->k:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->i:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->C:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    sub-float v4, p1, v0

    .line 56
    iget v0, p0, Lo/ehi;->z:I

    int-to-float v0, v0

    iget v1, p0, Lo/ehi;->d:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->r:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->c:F

    add-float v5, v0, v1

    .line 61
    iget v0, p0, Lo/ehi;->w:I

    int-to-float v0, v0

    iget v1, p0, Lo/ehi;->h:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->n:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->l:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->q:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->u:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->s:F

    add-float v6, v0, v1

    .line 70
    iget v0, p0, Lo/ehi;->w:I

    int-to-float v0, v0

    iget v1, p0, Lo/ehi;->v:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/ehi;->t:F

    add-float v7, v0, v1

    .line 74
    cmpl-float v0, v7, v6

    if-lez v0, :cond_0

    .line 75
    move v6, v7

    .line 78
    :cond_0
    add-float v0, v5, v6

    sub-float v8, p2, v0

    .line 81
    invoke-static {p3}, Lo/oc;->b(F)F

    move-result v9

    .line 83
    const-string v0, "LayoutBuilder"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contentHeightDpExpected("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") - realityHeight("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ") = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    sub-float v2, v9, v8

    .line 84
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " px"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 83
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iput v4, p0, Lo/ehi;->e:F

    .line 87
    iput v8, p0, Lo/ehi;->a:F

    .line 88
    new-instance v0, Lo/ehh;

    iget-object v1, p0, Lo/ehi;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lo/ehh;-><init>(Landroid/content/Context;Lo/ehi;)V

    return-object v0
.end method

.method public e(F)Lo/ehi;
    .locals 0

    .line 114
    iput p1, p0, Lo/ehi;->c:F

    .line 115
    return-object p0
.end method

.method public f()F
    .locals 1

    .line 282
    iget v0, p0, Lo/ehi;->t:F

    return v0
.end method

.method public f(F)Lo/ehi;
    .locals 0

    .line 164
    iput p1, p0, Lo/ehi;->h:F

    .line 165
    return-object p0
.end method

.method public g()F
    .locals 1

    .line 278
    iget v0, p0, Lo/ehi;->s:F

    return v0
.end method

.method public g(F)Lo/ehi;
    .locals 0

    .line 174
    iput p1, p0, Lo/ehi;->n:F

    .line 175
    return-object p0
.end method

.method public h()F
    .locals 1

    .line 270
    iget v0, p0, Lo/ehi;->q:F

    return v0
.end method

.method public h(F)Lo/ehi;
    .locals 0

    .line 154
    iput p1, p0, Lo/ehi;->k:F

    .line 155
    return-object p0
.end method

.method public i()F
    .locals 1

    .line 274
    iget v0, p0, Lo/ehi;->u:F

    return v0
.end method

.method public i(F)Lo/ehi;
    .locals 0

    .line 224
    iput p1, p0, Lo/ehi;->r:F

    .line 225
    return-object p0
.end method

.method public k()F
    .locals 1

    .line 296
    iget v0, p0, Lo/ehi;->y:F

    return v0
.end method

.method public k(F)Lo/ehi;
    .locals 0

    .line 184
    iput p1, p0, Lo/ehi;->l:F

    .line 185
    return-object p0
.end method

.method public l(F)Lo/ehi;
    .locals 0

    .line 286
    iput p1, p0, Lo/ehi;->v:F

    .line 287
    return-object p0
.end method

.method public m(F)Lo/ehi;
    .locals 0

    .line 255
    iput p1, p0, Lo/ehi;->s:F

    .line 256
    return-object p0
.end method

.method public n(F)Lo/ehi;
    .locals 0

    .line 265
    iput p1, p0, Lo/ehi;->t:F

    .line 266
    return-object p0
.end method

.method public o(F)Lo/ehi;
    .locals 0

    .line 235
    iput p1, p0, Lo/ehi;->q:F

    .line 236
    return-object p0
.end method

.method public p(F)Lo/ehi;
    .locals 0

    .line 245
    iput p1, p0, Lo/ehi;->u:F

    .line 246
    return-object p0
.end method

.method public t(F)Lo/ehi;
    .locals 0

    .line 291
    iput p1, p0, Lo/ehi;->y:F

    .line 292
    return-object p0
.end method
