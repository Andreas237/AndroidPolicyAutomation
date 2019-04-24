.class Lo/eih$15;
.super Lo/eki;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->e(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eih$k;

.field final synthetic b:Z

.field final synthetic e:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;Landroid/os/Handler;ZLo/eih$k;)V
    .locals 0

    .line 1229
    iput-object p1, p0, Lo/eih$15;->e:Lo/eih;

    iput-boolean p3, p0, Lo/eih$15;->b:Z

    iput-object p4, p0, Lo/eih$15;->a:Lo/eih$k;

    invoke-direct {p0, p2}, Lo/eki;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected c()V
    .locals 2

    .line 1240
    iget-object v0, p0, Lo/eih$15;->a:Lo/eih$k;

    invoke-virtual {v0}, Lo/eih$k;->e()V

    .line 1241
    iget-boolean v0, p0, Lo/eih$15;->b:Z

    if-eqz v0, :cond_0

    .line 1242
    iget-object v0, p0, Lo/eih$15;->e:Lo/eih;

    invoke-static {v0}, Lo/eih;->d(Lo/eih;)Lo/ln;

    move-result-object v0

    check-cast v0, Lo/eio;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eio;->k(Z)V

    .line 1243
    iget-object v0, p0, Lo/eih$15;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->L()V

    .line 1245
    :cond_0
    return-void
.end method
