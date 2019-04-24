.class Lo/flw$3;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/flw;->c(Lo/fly;)Lo/fmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/flz;

.field final synthetic b:Lo/flw;

.field final synthetic d:Lo/fma;


# direct methods
.method constructor <init>(Lo/flw;Lo/fma;Lo/flz;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lo/flw$3;->b:Lo/flw;

    iput-object p2, p0, Lo/flw$3;->d:Lo/fma;

    iput-object p3, p0, Lo/flw$3;->a:Lo/flz;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 245
    invoke-virtual {p0}, Lo/flw$3;->k()V

    .line 246
    return-void
.end method

.method public a(Lo/fly;)V
    .locals 4

    .line 218
    :try_start_0
    iget-object v0, p0, Lo/flw$3;->b:Lo/flw;

    invoke-static {v0}, Lo/flw;->c(Lo/flw;)Lo/foj;

    move-result-object v0

    iget-object v1, p0, Lo/flw$3;->d:Lo/fma;

    invoke-interface {v0, v1, p1}, Lo/foj;->a(Lo/fma;Lo/fly;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    invoke-static {}, Lo/flw;->b()Lo/fty;

    move-result-object v0

    const-string v1, "response to observe request with token {} does not contain observe option, removing request from observation store"

    iget-object v2, p0, Lo/flw$3;->a:Lo/flz;

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/flw$3;->b:Lo/flw;

    iget-object v0, v0, Lo/flw;->e:Lo/fom;

    iget-object v1, p0, Lo/flw$3;->a:Lo/flz;

    invoke-interface {v0, v1}, Lo/fom;->b(Lo/flz;)V

    goto :goto_0

    .line 220
    :catchall_0
    move-exception v3

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    invoke-static {}, Lo/flw;->b()Lo/fty;

    move-result-object v0

    const-string v1, "response to observe request with token {} does not contain observe option, removing request from observation store"

    iget-object v2, p0, Lo/flw$3;->a:Lo/flz;

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/flw$3;->b:Lo/flw;

    iget-object v0, v0, Lo/flw;->e:Lo/fom;

    iget-object v1, p0, Lo/flw$3;->a:Lo/flz;

    invoke-interface {v0, v1}, Lo/fom;->b(Lo/flz;)V

    :cond_0
    throw v3

    .line 232
    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 0

    .line 241
    return-void
.end method

.method protected k()V
    .locals 2

    .line 250
    iget-object v0, p0, Lo/flw$3;->b:Lo/flw;

    iget-object v0, v0, Lo/flw;->e:Lo/fom;

    iget-object v1, p0, Lo/flw$3;->a:Lo/flz;

    invoke-interface {v0, v1}, Lo/fom;->b(Lo/flz;)V

    .line 251
    return-void
.end method
