.class public Lo/ehx;
.super Lo/mi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/mi<Lo/ejg;>;"
    }
.end annotation


# instance fields
.field protected a:Lo/ehr;


# direct methods
.method public constructor <init>(Lo/ejg;Lo/ejj;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/mi;-><init>(Lo/mn;)V

    .line 36
    invoke-interface {p2}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lo/ehr;

    invoke-direct {v0, p2}, Lo/ehr;-><init>(Lo/ejj;)V

    :goto_0
    iput-object v0, p0, Lo/ehx;->a:Lo/ehr;

    .line 37
    return-void
.end method


# virtual methods
.method protected c(FFF)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)Ljava/util/List<Lo/mh;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lo/ehx;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 44
    iget-object v0, p0, Lo/ehx;->c:Lo/mn;

    check-cast v0, Lo/ejg;

    invoke-interface {v0}, Lo/ejg;->getCombinedData()Lo/eia;

    move-result-object v0

    invoke-virtual {v0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v1

    .line 46
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 48
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ma;

    .line 51
    iget-object v0, p0, Lo/ehx;->a:Lo/ehr;

    if-eqz v0, :cond_1

    instance-of v0, v3, Lo/lo;

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lo/ehx;->a:Lo/ehr;

    invoke-virtual {v0, p2, p3}, Lo/ehr;->c(FF)Lo/mh;

    move-result-object v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    invoke-virtual {v4, v2}, Lo/mh;->a(I)V

    .line 56
    iget-object v0, p0, Lo/ehx;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_0
    goto :goto_4

    .line 60
    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v3}, Lo/ma;->e()I

    move-result v5

    :goto_1
    if-ge v4, v5, :cond_4

    .line 62
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eik;

    invoke-virtual {v0, v4}, Lo/eik;->a(I)Lo/mz;

    move-result-object v6

    .line 65
    invoke-interface {v6}, Lo/mz;->n()Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    goto :goto_3

    .line 68
    :cond_2
    sget-object v0, Lo/mb$b;->d:Lo/mb$b;

    invoke-virtual {p0, v6, v4, p1, v0}, Lo/ehx;->b(Lo/mz;IFLo/mb$b;)Ljava/util/List;

    move-result-object v7

    .line 69
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/mh;

    .line 71
    invoke-virtual {v9, v2}, Lo/mh;->a(I)V

    .line 72
    iget-object v0, p0, Lo/ehx;->d:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    goto :goto_2

    .line 60
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 46
    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 78
    :cond_5
    iget-object v0, p0, Lo/ehx;->d:Ljava/util/List;

    return-object v0
.end method
