.class public Lo/eja;
.super Lo/nd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eja$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/nd<Lo/eie<+Lo/lt<+Lo/mv<+Lcom/github/mikephil/charting/data/Entry;>;>;>;>;"
    }
.end annotation


# instance fields
.field private f:Lo/eji$b;

.field private g:Lo/eji;

.field private h:Lo/eja$e;

.field private i:Z

.field k:Lo/eih$c;


# direct methods
.method public constructor <init>(Lo/eie;Lo/oa;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eie<+Lo/lt<+Lo/mv<+Lcom/github/mikephil/charting/data/Entry;>;>;>;Lo/oa;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1}, Lo/nd;-><init>(Lo/ld;)V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eja;->g:Lo/eji;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eja;->f:Lo/eji$b;

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eja;->i:Z

    .line 72
    sget-object v0, Lo/eih$c;->a:Lo/eih$c;

    iput-object v0, p0, Lo/eja;->k:Lo/eih$c;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eja;->h:Lo/eja$e;

    .line 26
    new-instance v0, Lo/eji;

    iget-object v1, p0, Lo/eja;->b:Lo/ld;

    check-cast v1, Lo/eie;

    invoke-direct {v0, p0, v1, p2}, Lo/eji;-><init>(Lo/eja;Lo/eie;Lo/oa;)V

    iput-object v0, p0, Lo/eja;->g:Lo/eji;

    .line 27
    iget-object v0, p0, Lo/eja;->g:Lo/eji;

    invoke-virtual {v0}, Lo/eji;->a()Lo/eji$b;

    move-result-object v0

    iput-object v0, p0, Lo/eja;->f:Lo/eji$b;

    .line 28
    return-void
.end method


# virtual methods
.method public c(Lo/eja$e;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/eja;->h:Lo/eja$e;

    .line 86
    return-void
.end method

.method public e()V
    .locals 1

    .line 75
    sget-object v0, Lo/eih$c;->e:Lo/eih$c;

    iput-object v0, p0, Lo/eja;->k:Lo/eih$c;

    .line 76
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 44
    iget-object v0, p0, Lo/eja;->b:Lo/ld;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->u()F

    move-result v2

    .line 46
    iget-object v0, p0, Lo/eja;->f:Lo/eji$b;

    invoke-interface {v0, p2}, Lo/eji$b;->c(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v0

    iput-object v0, p0, Lo/eja;->f:Lo/eji$b;

    .line 48
    iget-object v0, p0, Lo/eja;->b:Lo/ld;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->u()F

    move-result v3

    .line 50
    cmpl-float v0, v2, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eja;->h:Lo/eja$e;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/eja;->h:Lo/eja$e;

    iget-object v1, p0, Lo/eja;->b:Lo/ld;

    check-cast v1, Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->u()F

    move-result v1

    invoke-interface {v0, v1}, Lo/eja$e;->b(F)V

    .line 54
    :cond_0
    iget-object v0, p0, Lo/eja;->b:Lo/ld;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->invalidate()V

    .line 56
    iget-object v0, p0, Lo/eja;->f:Lo/eji$b;

    iget-object v1, p0, Lo/eja;->g:Lo/eji;

    invoke-virtual {v1}, Lo/eji;->a()Lo/eji$b;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 58
    iget-boolean v0, p0, Lo/eja;->i:Z

    if-eqz v0, :cond_2

    .line 59
    iget-object v0, p0, Lo/eja;->b:Lo/ld;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->A()V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eja;->i:Z

    goto :goto_0

    .line 63
    :cond_1
    iget-boolean v0, p0, Lo/eja;->i:Z

    if-nez v0, :cond_2

    .line 64
    iget-object v0, p0, Lo/eja;->b:Lo/ld;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->B()V

    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eja;->i:Z

    .line 69
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
