.class public Lo/eig;
.super Lo/mi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::Lo/mn;>Lo/mi<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/mn;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1}, Lo/mi;-><init>(Lo/mn;)V

    .line 25
    return-void
.end method


# virtual methods
.method protected a(FF)F
    .locals 1

    .line 76
    sub-float v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method protected a(FFF)Lo/mh;
    .locals 3

    .line 36
    invoke-virtual {p0, p1, p2, p3}, Lo/eig;->c(FFF)Ljava/util/List;

    move-result-object v1

    .line 38
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    invoke-virtual {p0, v1, p2, p3}, Lo/eig;->e(Ljava/util/List;FF)Lo/mh;

    move-result-object v2

    .line 52
    return-object v2
.end method

.method protected b(Lo/mz;IFLo/mb$b;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/mz;IFLo/mb$b;)Ljava/util/List<Lo/mh;>;"
        }
    .end annotation

    .line 81
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-interface {p1, p3}, Lo/mz;->e(F)Ljava/util/List;

    move-result-object v8

    .line 85
    if-nez v8, :cond_0

    .line 86
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 88
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 90
    const/high16 v0, 0x7fc00000    # Float.NaN

    move-object/from16 v1, p4

    invoke-interface {p1, p3, v0, v1}, Lo/mz;->c(FFLo/mb$b;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 91
    if-eqz v9, :cond_1

    .line 94
    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-interface {p1, v0}, Lo/mz;->e(F)Ljava/util/List;

    move-result-object v8

    .line 98
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 99
    return-object v7

    .line 101
    :cond_2
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/github/mikephil/charting/data/Entry;

    .line 102
    iget-object v0, p0, Lo/eig;->c:Lo/mn;

    check-cast v0, Lo/ekt;

    move-object v1, p1

    check-cast v1, Lo/elb;

    .line 103
    invoke-virtual {v1}, Lo/elb;->e()Lo/eit$b;

    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Lo/ekt;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 103
    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v11

    .line 106
    new-instance v0, Lo/mh;

    .line 107
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

    .line 106
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    goto :goto_0

    .line 112
    :cond_3
    return-object v7
.end method

.method protected b(FF)Lo/nw;
    .locals 3

    .line 31
    iget-object v0, p0, Lo/eig;->c:Lo/mn;

    check-cast v0, Lo/ekt;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {v0, v1}, Lo/ekt;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/eim;->b(FF)Lo/nw;

    move-result-object v2

    .line 32
    return-object v2
.end method

.method public e(Ljava/util/List;FF)Lo/mh;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/mh;>;FF)Lo/mh;"
        }
    .end annotation

    .line 57
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/mh;

    .line 58
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/mh;

    invoke-virtual {v0}, Lo/mh;->c()F

    move-result v0

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 60
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 62
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/mh;

    .line 64
    invoke-virtual {v4}, Lo/mh;->c()F

    move-result v0

    invoke-virtual {p0, p2, v0}, Lo/eig;->a(FF)F

    move-result v5

    .line 66
    cmpg-float v0, v5, v2

    if-gez v0, :cond_0

    .line 67
    move-object v1, v4

    .line 68
    move v2, v5

    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 72
    :cond_1
    return-object v1
.end method
