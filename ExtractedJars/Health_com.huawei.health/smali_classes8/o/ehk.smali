.class public abstract Lo/ehk;
.super Lo/ehl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ehl<Lo/elb;Lo/ekw;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lo/ehl;-><init>(Landroid/content/Context;)V

    .line 21
    return-void
.end method


# virtual methods
.method protected bridge synthetic c(Lo/eih;)V
    .locals 1

    .line 18
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0}, Lo/ehk;->c(Lo/ekw;)V

    return-void
.end method

.method protected c(Lo/ekw;)V
    .locals 2

    .line 32
    invoke-virtual {p1}, Lo/ekw;->getData()Lo/ma;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ela;

    .line 33
    if-nez v1, :cond_0

    .line 34
    new-instance v1, Lo/ela;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, v0}, Lo/ela;-><init>(Ljava/util/List;)V

    .line 35
    invoke-virtual {p1, v1}, Lo/ekw;->setData(Lo/ma;)V

    .line 37
    :cond_0
    return-void
.end method

.method protected bridge synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 18
    move-object v0, p1

    check-cast v0, Lo/ekw;

    invoke-virtual {p0, v0, p2, p3}, Lo/ehk;->e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;
    .locals 8

    .line 25
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    new-instance v0, Lo/elb;

    iget-object v1, p0, Lo/ehk;->e:Landroid/content/Context;

    move-object v2, v6

    invoke-virtual {p0, p2}, Lo/ehk;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p2}, Lo/ehk;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p2}, Lo/ehk;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 27
    return-object v7
.end method
