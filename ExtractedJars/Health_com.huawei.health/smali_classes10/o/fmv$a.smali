.class Lo/fmv$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/fmv;


# direct methods
.method private constructor <init>(Lo/fmv;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lo/fmv$a;->b:Lo/fmv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fmv;Lo/fmv$1;)V
    .locals 0

    .line 327
    invoke-direct {p0, p1}, Lo/fmv$a;-><init>(Lo/fmv;)V

    return-void
.end method


# virtual methods
.method public a(Lo/fmb;)V
    .locals 4

    .line 412
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    .line 413
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fma;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    iget-object v0, v0, Lo/fmv;->e:Lo/fom;

    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {p1}, Lo/fmb;->r()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fom;->b(Lo/flz;Lo/fow;)V

    .line 416
    :cond_0
    return-void
.end method

.method public c(Lo/fmb;)V
    .locals 6

    .line 332
    invoke-virtual {p1}, Lo/fmb;->a()Lo/fmb$b;

    move-result-object v0

    sget-object v1, Lo/fmb$b;->e:Lo/fmb$b;

    if-ne v0, v1, :cond_3

    .line 335
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v3

    .line 336
    invoke-virtual {v3}, Lo/fma;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 350
    :cond_0
    invoke-static {v3}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v4

    .line 351
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    iget-object v0, v0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v4, p1}, Lo/fml;->c(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    .line 354
    :goto_0
    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    if-nez v0, :cond_1

    .line 357
    invoke-static {}, Lo/fmv;->e()Lo/fty;

    move-result-object v0

    const-string v1, "exchange observer has been completed on unregistered exchange [peer: {}, origin: LOCAL]"

    invoke-virtual {v3}, Lo/fma;->u()Lo/fow;

    move-result-object v2

    invoke-interface {v2}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 361
    :cond_1
    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v4

    .line 362
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    iget-object v0, v0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v4, p1}, Lo/fml;->a(Lo/flz;Lo/fmb;)V

    .line 364
    invoke-virtual {p1}, Lo/fmb;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 369
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v5

    .line 370
    if-eq v5, v3, :cond_2

    invoke-virtual {v5}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {v5}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flz;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 373
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    iget-object v0, v0, Lo/fmv;->c:Lo/fml;

    invoke-virtual {v5}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lo/fml;->a(Lo/flz;Lo/fmb;)V

    .line 376
    :cond_2
    invoke-static {}, Lo/fmv;->e()Lo/fty;

    move-result-object v0

    const-string v1, "Exchange [{}, origin: LOCAL] completed"

    invoke-interface {v0, v1, v4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    :goto_1
    goto :goto_3

    .line 382
    :cond_3
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v3

    .line 384
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-eq v0, v1, :cond_5

    .line 390
    invoke-virtual {v3}, Lo/fly;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 391
    invoke-static {v3}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v4

    .line 392
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    iget-object v0, v0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v4, p1}, Lo/fml;->c(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    .line 394
    invoke-static {}, Lo/fmv;->e()Lo/fty;

    move-result-object v0

    const-string v1, "Exchange [{}, REMOTE] completed"

    invoke-interface {v0, v1, v4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 395
    goto :goto_2

    .line 398
    :cond_4
    invoke-virtual {v3}, Lo/fly;->A()V

    .line 403
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lo/fmb;->t()Lo/foo;

    move-result-object v4

    .line 404
    if-eqz v4, :cond_6

    .line 405
    iget-object v0, p0, Lo/fmv$a;->b:Lo/fmv;

    invoke-static {v0, v4, p1}, Lo/fmv;->a(Lo/fmv;Lo/foo;Lo/fmb;)V

    .line 408
    :cond_6
    :goto_3
    return-void
.end method
