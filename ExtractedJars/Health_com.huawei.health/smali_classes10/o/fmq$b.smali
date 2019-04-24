.class Lo/fmq$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo/fmq;


# direct methods
.method private constructor <init>(Lo/fmq;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lo/fmq$b;->e:Lo/fmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fmq;Lo/fmq$3;)V
    .locals 0

    .line 163
    invoke-direct {p0, p1}, Lo/fmq$b;-><init>(Lo/fmq;)V

    return-void
.end method


# virtual methods
.method public a(Lo/fmb;)V
    .locals 4

    .line 188
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    .line 189
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fma;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lo/fmq$b;->e:Lo/fmq;

    iget-object v0, v0, Lo/fmq;->e:Lo/fom;

    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {p1}, Lo/fmb;->r()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fom;->b(Lo/flz;Lo/fow;)V

    .line 192
    :cond_0
    return-void
.end method

.method public c(Lo/fmb;)V
    .locals 5

    .line 167
    invoke-virtual {p1}, Lo/fmb;->a()Lo/fmb$b;

    move-result-object v0

    sget-object v1, Lo/fmb$b;->e:Lo/fmb$b;

    if-ne v0, v1, :cond_1

    .line 169
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v3

    .line 170
    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    if-nez v0, :cond_0

    .line 173
    invoke-static {}, Lo/fmq;->e()Lo/fty;

    move-result-object v0

    const-string v1, "exchange observer has been completed on unregistered exchange [peer: {}, origin: LOCAL]"

    invoke-virtual {v3}, Lo/fma;->u()Lo/fow;

    move-result-object v2

    invoke-interface {v2}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {v3}, Lo/fma;->k()Lo/flz;

    move-result-object v4

    .line 178
    iget-object v0, p0, Lo/fmq$b;->e:Lo/fmq;

    iget-object v0, v0, Lo/fmq;->c:Lo/fml;

    invoke-interface {v0, v4, p1}, Lo/fml;->a(Lo/flz;Lo/fmb;)V

    .line 179
    invoke-static {}, Lo/fmq;->e()Lo/fty;

    move-result-object v0

    const-string v1, "Exchange [{}, origin: LOCAL] completed"

    invoke-interface {v0, v1, v4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 184
    :cond_1
    :goto_0
    return-void
.end method
