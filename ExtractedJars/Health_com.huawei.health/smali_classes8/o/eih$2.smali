.class Lo/eih$2;
.super Lo/eki;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->b(ILo/eih$k;ILo/eih$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic c:Lo/eih$k;

.field final synthetic d:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;Landroid/os/Handler;ZLo/eih$k;)V
    .locals 0

    .line 1670
    iput-object p1, p0, Lo/eih$2;->d:Lo/eih;

    iput-boolean p3, p0, Lo/eih$2;->a:Z

    iput-object p4, p0, Lo/eih$2;->c:Lo/eih$k;

    invoke-direct {p0, p2}, Lo/eki;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected c()V
    .locals 2

    .line 1681
    iget-object v0, p0, Lo/eih$2;->c:Lo/eih$k;

    invoke-virtual {v0}, Lo/eih$k;->e()V

    .line 1682
    iget-boolean v0, p0, Lo/eih$2;->a:Z

    if-eqz v0, :cond_0

    .line 1683
    iget-object v0, p0, Lo/eih$2;->d:Lo/eih;

    invoke-static {v0}, Lo/eih;->b(Lo/eih;)Lo/ln;

    move-result-object v0

    check-cast v0, Lo/eio;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eio;->k(Z)V

    .line 1684
    iget-object v0, p0, Lo/eih$2;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->L()V

    .line 1686
    :cond_0
    return-void
.end method
