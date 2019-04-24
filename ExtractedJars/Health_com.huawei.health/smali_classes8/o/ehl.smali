.class public abstract Lo/ehl;
.super Lo/ehe;
.source "SourceFile"

# interfaces
.implements Lo/ekd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;ChartT:Lo/eih;>Lo/ehe<TT;TChartT;>;Lo/ekd;"
    }
.end annotation


# instance fields
.field private c:Lo/ehj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/ehe;-><init>(Landroid/content/Context;)V

    .line 73
    new-instance v0, Lo/ehj;

    invoke-direct {v0}, Lo/ehj;-><init>()V

    iput-object v0, p0, Lo/ehl;->c:Lo/ehj;

    .line 36
    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;TT;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 79
    invoke-super {p0, p1, p2, p3}, Lo/ehe;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 80
    invoke-virtual {p1}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v2

    .line 81
    invoke-virtual {p0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v0

    iget-object v1, p3, Lo/ehe$a;->c:Lo/eic;

    invoke-interface {v2, p2, v0, v1, p3}, Lo/eih$h;->b(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 82
    return-object p2
.end method

.method protected b(Lo/ehe$a;)Lo/eii;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 66
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "onFakeDataSet not Support,needs override!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lo/eih;Lo/ehe$a;)Lo/eii;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 58
    invoke-super {p0, p1, p2}, Lo/ehe;->c(Lo/eih;Lo/ehe$a;)Lo/eii;

    move-result-object v2

    .line 59
    invoke-virtual {p1}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v3

    .line 60
    invoke-virtual {p0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v0

    iget-object v1, p2, Lo/ehe$a;->c:Lo/eic;

    invoke-interface {v3, v2, v0, v1, p2}, Lo/eih$h;->b(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 61
    return-object v2
.end method

.method protected c(Lo/eih;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;)V"
        }
    .end annotation

    .line 49
    return-void
.end method

.method protected c(Lo/eih;Lo/eic;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;)V"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lo/ehl;->c:Lo/ehj;

    invoke-virtual {v0, p1, p2, p0}, Lo/ehj;->c(Lo/eih;Lo/eic;Lo/ekd;)V

    .line 71
    return-void
.end method

.method protected d(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 40
    invoke-virtual {p0, p1, p2}, Lo/ehl;->c(Lo/eih;Lo/eic;)V

    .line 41
    invoke-virtual {p1}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v0

    invoke-interface {v0}, Lo/eih$h;->f()V

    .line 42
    invoke-super {p0, p1, p2, p3}, Lo/ehe;->d(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v1

    .line 43
    return-object v1
.end method

.method public abstract d()Lo/ejk;
.end method

.method protected e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 53
    const/4 v0, 0x0

    return-object v0
.end method
