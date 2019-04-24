.class Lo/fnt$b;
.super Lo/fnl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo/fnt;


# direct methods
.method private constructor <init>(Lo/fnt;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/fnt$b;->e:Lo/fnt;

    invoke-direct {p0}, Lo/fnl;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fnt;Lo/fnt$3;)V
    .locals 0

    .line 138
    invoke-direct {p0, p1}, Lo/fnt$b;-><init>(Lo/fnt;)V

    return-void
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 153
    invoke-virtual {p1, p2}, Lo/fmb;->c(Lo/fly;)V

    .line 154
    invoke-virtual {p0}, Lo/fnt$b;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 155
    return-void
.end method

.method public a(Lo/fmb;Lo/fma;)V
    .locals 2

    .line 160
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    if-nez v0, :cond_0

    .line 161
    invoke-virtual {p1, p2}, Lo/fmb;->d(Lo/fma;)V

    .line 163
    :cond_0
    iget-object v0, p0, Lo/fnt$b;->e:Lo/fnt;

    invoke-virtual {v0}, Lo/fnt;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/fnt$b;->e:Lo/fnt;

    invoke-static {v0}, Lo/fnt;->e(Lo/fnt;)Lo/foq;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/foq;->d(Lo/fmb;)V

    goto :goto_0

    .line 166
    :cond_1
    invoke-static {}, Lo/fnt;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Top of CoAP stack has no deliverer to deliver request"

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 168
    :goto_0
    return-void
.end method

.method public d(Lo/fma;)V
    .locals 2

    .line 141
    new-instance v1, Lo/fmb;

    sget-object v0, Lo/fmb$b;->e:Lo/fmb$b;

    invoke-direct {v1, p1, v0}, Lo/fmb;-><init>(Lo/fma;Lo/fmb$b;)V

    .line 142
    invoke-virtual {p0, v1, p1}, Lo/fnt$b;->e(Lo/fmb;Lo/fma;)V

    .line 143
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 0

    .line 185
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 172
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 173
    iget-object v0, p0, Lo/fnt$b;->e:Lo/fnt;

    invoke-virtual {v0}, Lo/fnt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lo/fnt$b;->e:Lo/fnt;

    invoke-static {v0}, Lo/fnt;->e(Lo/fnt;)Lo/foq;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/foq;->c(Lo/fmb;Lo/fly;)V

    goto :goto_0

    .line 177
    :cond_0
    invoke-static {}, Lo/fnt;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Top of CoAP stack has no deliverer to deliver response"

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 179
    :goto_0
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 147
    invoke-virtual {p1, p2}, Lo/fmb;->d(Lo/fma;)V

    .line 148
    invoke-virtual {p0}, Lo/fnt$b;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 149
    return-void
.end method
