.class public Lo/ehv;
.super Lo/eih;
.source "SourceFile"

# interfaces
.implements Lo/ejg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ehv$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<Lo/eia;>;Lo/ejg;"
    }
.end annotation


# instance fields
.field protected a:Z

.field private aB:Z

.field protected ab:[Lo/ehv$c;

.field private az:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 72
    invoke-direct {p0, p1}, Lo/eih;-><init>(Landroid/content/Context;)V

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehv;->az:Z

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->a:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->aB:Z

    .line 73
    invoke-direct {p0}, Lo/ehv;->ao()V

    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehv;->az:Z

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->a:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->aB:Z

    .line 78
    invoke-direct {p0}, Lo/ehv;->ao()V

    .line 79
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 82
    invoke-direct {p0, p1, p2, p3}, Lo/eih;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehv;->az:Z

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->a:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehv;->aB:Z

    .line 83
    invoke-direct {p0}, Lo/ehv;->ao()V

    .line 84
    return-void
.end method

.method private ao()V
    .locals 2

    .line 109
    iget-object v0, p0, Lo/ehv;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 110
    iget-object v0, p0, Lo/ehv;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 112
    iget-object v0, p0, Lo/ehv;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(F)V

    .line 113
    iget-object v0, p0, Lo/ehv;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 114
    invoke-virtual {p0}, Lo/ehv;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->b(Z)V

    .line 117
    iget-object v0, p0, Lo/ehv;->ad:Lo/eit;

    const v1, 0x463b8000    # 12000.0f

    invoke-virtual {v0, v1}, Lo/eit;->a(F)V

    .line 119
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ehv;->b(Z)V

    .line 120
    return-void
.end method


# virtual methods
.method public D()V
    .locals 1

    .line 169
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 170
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->m()V

    .line 172
    return-void
.end method

.method public H()Z
    .locals 1

    .line 260
    iget-boolean v0, p0, Lo/ehv;->a:Z

    return v0
.end method

.method public a(FF)Lo/mh;
    .locals 9

    .line 147
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 148
    const-string v0, "MPAndroidChart"

    const-string v1, "Can\'t select by touch. No data set."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    invoke-virtual {p0}, Lo/ehv;->getHighlighter()Lo/mq;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/mq;->c(FF)Lo/mh;

    move-result-object v8

    .line 152
    if-eqz v8, :cond_1

    invoke-virtual {p0}, Lo/ehv;->H()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    return-object v8

    .line 155
    :cond_2
    new-instance v0, Lo/mh;

    invoke-virtual {v8}, Lo/mh;->b()F

    move-result v1

    invoke-virtual {v8}, Lo/mh;->d()F

    move-result v2

    .line 156
    invoke-virtual {v8}, Lo/mh;->c()F

    move-result v3

    invoke-virtual {v8}, Lo/mh;->e()F

    move-result v4

    .line 157
    invoke-virtual {v8}, Lo/mh;->g()I

    move-result v5

    invoke-virtual {v8}, Lo/mh;->k()Lo/lp$b;

    move-result-object v7

    const/4 v6, -0x1

    invoke-direct/range {v0 .. v7}, Lo/mh;-><init>(FFFFIILo/lp$b;)V

    .line 155
    return-object v0
.end method

.method protected a()V
    .locals 3

    .line 88
    invoke-super {p0}, Lo/eih;->a()V

    .line 91
    const/4 v0, 0x5

    new-array v0, v0, [Lo/ehv$c;

    sget-object v1, Lo/ehv$c;->a:Lo/ehv$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->e:Lo/ehv$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->c:Lo/ehv$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->b:Lo/ehv$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/ehv$c;->d:Lo/ehv$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ehv;->ab:[Lo/ehv$c;

    .line 95
    new-instance v0, Lo/ehx;

    invoke-direct {v0, p0, p0}, Lo/ehx;-><init>(Lo/ejg;Lo/ejj;)V

    invoke-virtual {p0, v0}, Lo/ehv;->setHighlighter(Lo/mi;)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ehv;->setHighlightFullBarEnabled(Z)V

    .line 100
    new-instance v0, Lo/ehu;

    iget-object v1, p0, Lo/ehv;->P:Lo/la;

    iget-object v2, p0, Lo/ehv;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/ehu;-><init>(Lo/ehv;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/ehv;->S:Lo/nj;

    .line 101
    return-void
.end method

.method public b(Lo/ehn;)V
    .locals 1

    .line 188
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 189
    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0, p1}, Lo/eia;->d(Lo/ehn;)V

    .line 191
    return-void
.end method

.method public b()Z
    .locals 1

    .line 216
    iget-boolean v0, p0, Lo/ehv;->aB:Z

    return v0
.end method

.method public c()V
    .locals 4

    .line 329
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->a()V

    .line 330
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejl;

    .line 331
    invoke-interface {v2}, Lo/ejl;->ab()Ljava/util/List;

    move-result-object v3

    .line 332
    invoke-interface {v2, v3}, Lo/ejl;->d(Ljava/util/List;)V

    .line 333
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Lo/ejl;->a(Z)V

    .line 335
    instance-of v0, v2, Lo/ekz;

    if-eqz v0, :cond_0

    .line 336
    move-object v0, v2

    check-cast v0, Lo/ekz;

    invoke-interface {v0}, Lo/ekz;->an()V

    .line 338
    :cond_0
    goto :goto_0

    .line 340
    :cond_1
    invoke-virtual {p0}, Lo/ehv;->h()V

    .line 342
    invoke-virtual {p0}, Lo/ehv;->invalidate()V

    .line 343
    return-void
.end method

.method public e()Z
    .locals 1

    .line 221
    iget-boolean v0, p0, Lo/ehv;->az:Z

    return v0
.end method

.method public getBarData()Lo/ehq;
    .locals 1

    .line 176
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 177
    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->l()Lo/ehq;

    move-result-object v0

    return-object v0
.end method

.method public getCombinedData()Lo/eia;
    .locals 1

    .line 124
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    return-object v0
.end method

.method public getDrawOrder()[Lo/ehv$c;
    .locals 1

    .line 269
    iget-object v0, p0, Lo/ehv;->ab:[Lo/ehv$c;

    invoke-virtual {v0}, [Lo/ehv$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ehv$c;

    return-object v0
.end method

.method public getLineData()Lo/ela;
    .locals 1

    .line 163
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    if-nez v0, :cond_0

    .line 164
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/ehv;->A:Lo/ma;

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->p()Lo/ela;

    move-result-object v0

    return-object v0
.end method

.method public setData(Lo/eia;)V
    .locals 1

    .line 129
    invoke-super {p0, p1}, Lo/eih;->setData(Lo/ma;)V

    .line 130
    new-instance v0, Lo/ehx;

    invoke-direct {v0, p0, p0}, Lo/ehx;-><init>(Lo/ejg;Lo/ejj;)V

    invoke-virtual {p0, v0}, Lo/ehv;->setHighlighter(Lo/mi;)V

    .line 131
    iget-object v0, p0, Lo/ehv;->S:Lo/nj;

    check-cast v0, Lo/ehu;

    invoke-virtual {v0}, Lo/ehu;->c()V

    .line 132
    iget-object v0, p0, Lo/ehv;->S:Lo/nj;

    invoke-virtual {v0}, Lo/nj;->e()V

    .line 133
    return-void
.end method

.method public bridge synthetic setData(Lo/ma;)V
    .locals 1

    .line 41
    move-object v0, p1

    check-cast v0, Lo/eia;

    invoke-virtual {p0, v0}, Lo/ehv;->setData(Lo/eia;)V

    return-void
.end method

.method public setDrawBarShadow(Z)V
    .locals 0

    .line 242
    iput-boolean p1, p0, Lo/ehv;->aB:Z

    .line 243
    return-void
.end method

.method public setDrawOrder([Lo/ehv$c;)V
    .locals 1

    .line 281
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 282
    :cond_0
    return-void

    .line 283
    :cond_1
    invoke-virtual {p1}, [Lo/ehv$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ehv$c;

    iput-object v0, p0, Lo/ehv;->ab:[Lo/ehv$c;

    .line 284
    return-void
.end method

.method public setDrawValueAboveBar(Z)V
    .locals 0

    .line 231
    iput-boolean p1, p0, Lo/ehv;->az:Z

    .line 232
    return-void
.end method

.method public setHighlightFullBarEnabled(Z)V
    .locals 0

    .line 252
    iput-boolean p1, p0, Lo/ehv;->a:Z

    .line 253
    return-void
.end method
