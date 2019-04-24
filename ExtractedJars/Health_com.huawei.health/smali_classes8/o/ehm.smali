.class public Lo/ehm;
.super Lo/eih;
.source "SourceFile"

# interfaces
.implements Lo/ejj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<Lo/ehq;>;Lo/ejj;"
    }
.end annotation


# instance fields
.field protected a:Z

.field private aB:Z

.field private ab:Z

.field private az:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 48
    invoke-direct {p0, p1}, Lo/eih;-><init>(Landroid/content/Context;)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->a:Z

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehm;->ab:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->aB:Z

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->az:Z

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->a:Z

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehm;->ab:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->aB:Z

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->az:Z

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 56
    invoke-direct {p0, p1, p2, p3}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->a:Z

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehm;->ab:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->aB:Z

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehm;->az:Z

    .line 57
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 61
    invoke-super {p0}, Lo/eih;->a()V

    .line 65
    new-instance v0, Lo/ehp;

    iget-object v1, p0, Lo/ehm;->P:Lo/la;

    iget-object v2, p0, Lo/ehm;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/ehp;-><init>(Lo/ejj;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/ehm;->S:Lo/nj;

    .line 67
    new-instance v0, Lo/ehr;

    invoke-direct {v0, p0}, Lo/ehr;-><init>(Lo/ejj;)V

    invoke-virtual {p0, v0}, Lo/ehm;->setHighlighter(Lo/mi;)V

    .line 69
    invoke-virtual {p0}, Lo/ehm;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/ln;->h(F)V

    .line 70
    invoke-virtual {p0}, Lo/ehm;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lo/ln;->i(F)V

    .line 78
    return-void
.end method

.method public b(ZZ)V
    .locals 1

    .line 266
    iget-object v0, p0, Lo/ehm;->S:Lo/nj;

    check-cast v0, Lo/ehp;

    invoke-virtual {v0, p1, p2}, Lo/ehp;->c(ZZ)V

    .line 267
    return-void
.end method

.method public b()Z
    .locals 1

    .line 175
    iget-boolean v0, p0, Lo/ehm;->aB:Z

    return v0
.end method

.method public c()V
    .locals 4

    .line 248
    iget-object v0, p0, Lo/ehm;->A:Lo/ma;

    check-cast v0, Lo/ehq;

    invoke-virtual {v0}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejl;

    .line 249
    invoke-interface {v2}, Lo/ejl;->ab()Ljava/util/List;

    move-result-object v3

    .line 250
    invoke-interface {v2, v3}, Lo/ejl;->d(Ljava/util/List;)V

    .line 251
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Lo/ejl;->a(Z)V

    .line 252
    goto :goto_0

    .line 254
    :cond_0
    invoke-virtual {p0}, Lo/ehm;->h()V

    .line 256
    invoke-virtual {p0}, Lo/ehm;->invalidate()V

    .line 257
    return-void
.end method

.method protected d()V
    .locals 5

    .line 83
    iget-boolean v0, p0, Lo/ehm;->az:Z

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lo/ehm;->H:Lo/ln;

    iget-object v1, p0, Lo/ehm;->A:Lo/ma;

    check-cast v1, Lo/ehq;

    invoke-virtual {v1}, Lo/ehq;->i()F

    move-result v1

    iget-object v2, p0, Lo/ehm;->A:Lo/ma;

    check-cast v2, Lo/ehq;

    invoke-virtual {v2}, Lo/ehq;->a()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/ehm;->A:Lo/ma;

    check-cast v2, Lo/ehq;

    invoke-virtual {v2}, Lo/ehq;->f()F

    move-result v2

    iget-object v3, p0, Lo/ehm;->A:Lo/ma;

    check-cast v3, Lo/ehq;

    invoke-virtual {v3}, Lo/ehq;->a()F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/ln;->d(FF)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lo/ehm;->H:Lo/ln;

    iget-object v1, p0, Lo/ehm;->A:Lo/ma;

    check-cast v1, Lo/ehq;

    invoke-virtual {v1}, Lo/ehq;->i()F

    move-result v1

    iget-object v2, p0, Lo/ehm;->A:Lo/ma;

    check-cast v2, Lo/ehq;

    invoke-virtual {v2}, Lo/ehq;->f()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/ln;->d(FF)V

    .line 90
    :goto_0
    invoke-super {p0}, Lo/eih;->d()V

    .line 91
    return-void
.end method

.method public e()Z
    .locals 1

    .line 156
    iget-boolean v0, p0, Lo/ehm;->ab:Z

    return v0
.end method

.method public getBarData()Lo/ehq;
    .locals 1

    .line 212
    iget-object v0, p0, Lo/ehm;->A:Lo/ma;

    check-cast v0, Lo/ehq;

    return-object v0
.end method

.method public invalidate()V
    .locals 0

    .line 262
    invoke-super {p0}, Lo/eih;->invalidate()V

    .line 263
    return-void
.end method

.method public setDrawBarShadow(Z)V
    .locals 0

    .line 166
    iput-boolean p1, p0, Lo/ehm;->aB:Z

    .line 167
    return-void
.end method

.method public setDrawValueAboveBar(Z)V
    .locals 0

    .line 147
    iput-boolean p1, p0, Lo/ehm;->ab:Z

    .line 148
    return-void
.end method

.method public setFitBars(Z)V
    .locals 0

    .line 223
    iput-boolean p1, p0, Lo/ehm;->az:Z

    .line 224
    return-void
.end method

.method public setHighlightFullBarEnabled(Z)V
    .locals 0

    .line 187
    iput-boolean p1, p0, Lo/ehm;->a:Z

    .line 188
    return-void
.end method
