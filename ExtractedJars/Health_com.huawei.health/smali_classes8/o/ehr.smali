.class public Lo/ehr;
.super Lo/eig;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eig<Lo/ejj;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/ejj;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lo/eig;-><init>(Lo/mn;)V

    .line 27
    return-void
.end method


# virtual methods
.method protected a(FF)F
    .locals 1

    .line 193
    sub-float v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method protected a(FFF)Lo/mh;
    .locals 3

    .line 153
    invoke-virtual {p0, p1, p2, p3}, Lo/ehr;->c(FFF)Ljava/util/List;

    move-result-object v1

    .line 155
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    invoke-virtual {p0, v1, p2, p3}, Lo/ehr;->e(Ljava/util/List;FF)Lo/mh;

    move-result-object v2

    .line 169
    return-object v2
.end method

.method protected b(Lo/mz;IFLo/mb$b;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/mz;IFLo/mb$b;)Ljava/util/List<Lo/mh;>;"
        }
    .end annotation

    .line 199
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 202
    invoke-interface {p1, p3}, Lo/mz;->e(F)Ljava/util/List;

    move-result-object v8

    .line 203
    if-nez v8, :cond_0

    .line 204
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 216
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 217
    return-object v7

    .line 219
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/github/mikephil/charting/data/Entry;

    .line 220
    iget-object v0, p0, Lo/ehr;->c:Lo/mn;

    check-cast v0, Lo/ejj;

    move-object v1, p1

    check-cast v1, Lo/ehn;

    .line 221
    invoke-virtual {v1}, Lo/ehn;->e()Lo/eit$b;

    move-result-object v1

    .line 220
    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 221
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v11

    .line 224
    new-instance v0, Lo/mh;

    .line 225
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    iget-wide v3, v11, Lo/nw;->b:D

    double-to-float v3, v3

    iget-wide v4, v11, Lo/nw;->c:D

    double-to-float v4, v4

    sget-object v6, Lo/lp$b;->b:Lo/lp$b;

    move v5, p2

    invoke-direct/range {v0 .. v6}, Lo/mh;-><init>(FFFFILo/lp$b;)V

    .line 224
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    goto :goto_0

    .line 230
    :cond_2
    return-object v7
.end method

.method public b(Lo/mh;Lo/ejm;FF)Lo/mh;
    .locals 2

    .line 71
    invoke-interface {p2, p3, p4}, Lo/ejm;->e(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 73
    if-nez v1, :cond_0

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_0
    return-object p1
.end method

.method protected b(FF)Lo/nw;
    .locals 3

    .line 148
    iget-object v0, p0, Lo/ehr;->c:Lo/mn;

    check-cast v0, Lo/ejj;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-interface {v0, v1}, Lo/ejj;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/eim;->b(FF)Lo/nw;

    move-result-object v2

    .line 149
    return-object v2
.end method

.method protected c(FFFF)F
    .locals 1

    .line 136
    sub-float v0, p1, p3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public c(FFF)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)Ljava/util/List<Lo/mh;>;"
        }
    .end annotation

    .line 238
    invoke-super {p0, p1, p2, p3}, Lo/eig;->c(FFF)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected c()Lo/lt;
    .locals 1

    .line 141
    iget-object v0, p0, Lo/ehr;->c:Lo/mn;

    check-cast v0, Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getData()Lo/lt;

    move-result-object v0

    return-object v0
.end method

.method public c(FF)Lo/mh;
    .locals 7

    .line 31
    invoke-super {p0, p1, p2}, Lo/eig;->c(FF)Lo/mh;

    move-result-object v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/ehr;->b(FF)Lo/nw;

    move-result-object v4

    .line 41
    iget-object v0, p0, Lo/ehr;->c:Lo/mn;

    check-cast v0, Lo/ejj;

    invoke-interface {v0}, Lo/ejj;->getData()Lo/lt;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ehq;

    .line 43
    invoke-virtual {v3}, Lo/mh;->g()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/ehq;->a(I)Lo/mz;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ejm;

    .line 45
    invoke-interface {v6}, Lo/ejm;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    iget-wide v0, v4, Lo/nw;->b:D

    double-to-float v0, v0

    iget-wide v1, v4, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {p0, v3, v6, v0, v1}, Lo/ehr;->b(Lo/mh;Lo/ejm;FF)Lo/mh;

    move-result-object v0

    return-object v0

    .line 53
    :cond_1
    invoke-static {v4}, Lo/nw;->e(Lo/nw;)V

    .line 56
    return-object v3
.end method

.method public e(Ljava/util/List;FF)Lo/mh;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/mh;>;FF)Lo/mh;"
        }
    .end annotation

    .line 174
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/mh;

    .line 175
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/mh;

    invoke-virtual {v0}, Lo/mh;->c()F

    move-result v0

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 177
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 179
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/mh;

    .line 181
    invoke-virtual {v4}, Lo/mh;->c()F

    move-result v0

    invoke-virtual {p0, p2, v0}, Lo/ehr;->a(FF)F

    move-result v5

    .line 183
    cmpg-float v0, v5, v2

    if-gez v0, :cond_0

    .line 184
    move-object v1, v4

    .line 185
    move v2, v5

    .line 177
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 189
    :cond_1
    return-object v1
.end method
