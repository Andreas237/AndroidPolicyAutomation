.class public final Lo/fmq;
.super Lo/flw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmq$3;,
        Lo/fmq$b;
    }
.end annotation


# static fields
.field private static final f:Lo/fty;


# instance fields
.field private final g:Lo/foz;

.field private final i:Lo/fmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const-class v0, Lo/fmq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fmq;->f:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V
    .locals 2

    .line 87
    invoke-direct/range {p0 .. p5}, Lo/flw;-><init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;)V

    .line 66
    new-instance v0, Lo/fmq$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fmq$b;-><init>(Lo/fmq;Lo/fmq$3;)V

    iput-object v0, p0, Lo/fmq;->i:Lo/fmg;

    .line 88
    iput-object p6, p0, Lo/fmq;->g:Lo/foz;

    .line 89
    return-void
.end method

.method static synthetic e()Lo/fty;
    .locals 1

    .line 63
    sget-object v0, Lo/fmq;->f:Lo/fty;

    return-object v0
.end method


# virtual methods
.method public a(Lo/fly;)Lo/fmb;
    .locals 5

    .line 135
    invoke-virtual {p1}, Lo/fly;->k()Lo/flz;

    move-result-object v3

    .line 136
    iget-object v0, p0, Lo/fmq;->c:Lo/fml;

    invoke-interface {v0, v3}, Lo/fml;->b(Lo/flz;)Lo/fmb;

    move-result-object v4

    .line 138
    if-nez v4, :cond_0

    .line 141
    invoke-virtual {p0, p1}, Lo/fmq;->c(Lo/fly;)Lo/fmb;

    move-result-object v4

    .line 144
    :cond_0
    if-nez v4, :cond_1

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_1
    iget-object v0, p0, Lo/fmq;->g:Lo/foz;

    invoke-virtual {v4}, Lo/fmb;->r()Lo/fow;

    move-result-object v1

    invoke-virtual {p1}, Lo/fly;->r()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/foz;->c(Lo/fow;Lo/fow;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 148
    return-object v4

    .line 150
    :cond_2
    sget-object v0, Lo/fmq;->f:Lo/fty;

    const-string v1, "ignoring potentially forged response for token {} with non-matching endpoint context"

    invoke-interface {v0, v1, v3}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 117
    invoke-virtual {p2}, Lo/flo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    sget-object v0, Lo/flz;->d:Lo/flz;

    invoke-virtual {p2, v0}, Lo/flo;->e(Lo/flz;)Lo/flq;

    goto :goto_0

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "sending empty message (ACK/RST) over tcp is not supported!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :goto_0
    return-void
.end method

.method public b(Lo/flo;)Lo/fmb;
    .locals 1

    .line 160
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lo/fma;)Lo/fmb;
    .locals 2

    .line 127
    new-instance v1, Lo/fmb;

    sget-object v0, Lo/fmb$b;->b:Lo/fmb$b;

    invoke-direct {v1, p1, v0}, Lo/fmb;-><init>(Lo/fma;Lo/fmb$b;)V

    .line 128
    iget-object v0, p0, Lo/fmq;->i:Lo/fmg;

    invoke-virtual {v1, v0}, Lo/fmb;->a(Lo/fmg;)V

    .line 129
    return-object v1
.end method

.method public c(Lo/fmb;Lo/fma;)V
    .locals 3

    .line 94
    invoke-virtual {p2}, Lo/fma;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p0, p2}, Lo/fmq;->d(Lo/fma;)V

    .line 97
    :cond_0
    iget-object v0, p0, Lo/fmq;->i:Lo/fmg;

    invoke-virtual {p1, v0}, Lo/fmb;->a(Lo/fmg;)V

    .line 98
    iget-object v0, p0, Lo/fmq;->c:Lo/fml;

    invoke-interface {v0, p1}, Lo/fml;->c(Lo/fmb;)Z

    .line 99
    sget-object v0, Lo/fmq;->f:Lo/fty;

    const-string v1, "tracking open request using {}"

    invoke-virtual {p2}, Lo/fma;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 106
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/fly;->e(Lo/flz;)Lo/flq;

    .line 109
    invoke-virtual {p2}, Lo/fly;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 112
    :cond_0
    return-void
.end method
