.class public final Lo/fmv;
.super Lo/flw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmv$1;,
        Lo/fmv$a;
    }
.end annotation


# static fields
.field private static final i:Lo/fty;


# instance fields
.field private final f:Lo/foz;

.field private final g:Lo/fmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    const-class v0, Lo/fmv;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fmv;->i:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V
    .locals 2

    .line 97
    invoke-direct/range {p0 .. p5}, Lo/flw;-><init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;)V

    .line 76
    new-instance v0, Lo/fmv$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fmv$a;-><init>(Lo/fmv;Lo/fmv$1;)V

    iput-object v0, p0, Lo/fmv;->g:Lo/fmg;

    .line 98
    iput-object p6, p0, Lo/fmv;->f:Lo/foz;

    .line 99
    return-void
.end method

.method static synthetic a(Lo/fmv;Lo/foo;Lo/fmb;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lo/fmv;->e(Lo/foo;Lo/fmb;)V

    return-void
.end method

.method static synthetic e()Lo/fty;
    .locals 1

    .line 71
    sget-object v0, Lo/fmv;->i:Lo/fty;

    return-object v0
.end method

.method private e(Lo/foo;Lo/fmb;)V
    .locals 6

    .line 310
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "removing all remaining NON-notifications of observe relation with {}"

    invoke-virtual {p1}, Lo/foo;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 312
    invoke-virtual {p1}, Lo/foo;->k()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fly;

    .line 314
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "removing NON notification: {}"

    invoke-interface {v0, v1, v4}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 316
    invoke-virtual {v4}, Lo/fly;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    invoke-static {v4}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v5

    .line 318
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v5, p2}, Lo/fml;->c(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    .line 319
    goto :goto_1

    .line 321
    :cond_0
    invoke-virtual {v4}, Lo/fly;->A()V

    .line 323
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 324
    goto :goto_0

    .line 325
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lo/fly;)Lo/fmb;
    .locals 10

    .line 218
    invoke-static {p1}, Lo/fmb$e;->c(Lo/flq;)Lo/fmb$e;

    move-result-object v5

    .line 219
    invoke-virtual {p1}, Lo/fly;->k()Lo/flz;

    move-result-object v6

    .line 220
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "received response {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v6}, Lo/fml;->b(Lo/flz;)Lo/fmb;

    move-result-object v7

    .line 222
    const/4 v8, 0x0

    .line 224
    if-nez v7, :cond_0

    .line 227
    const/4 v8, 0x1

    .line 228
    invoke-virtual {p0, p1}, Lo/fmv;->c(Lo/fly;)Lo/fmb;

    move-result-object v7

    .line 231
    :cond_0
    if-nez v7, :cond_3

    .line 235
    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-eq v0, v1, :cond_2

    .line 237
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v5}, Lo/fml;->c(Lo/fmb$e;)Lo/fmb;

    move-result-object v9

    .line 238
    if-eqz v9, :cond_1

    .line 239
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "received response for already completed exchange: {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 240
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/fly;->h(Z)V

    .line 241
    return-object v9

    .line 243
    :cond_1
    goto :goto_0

    .line 244
    :cond_2
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "discarding unmatchable piggy-backed response from [{}]: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fly;->r()Lo/fow;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 249
    :cond_3
    iget-object v0, p0, Lo/fmv;->f:Lo/foz;

    invoke-virtual {v7}, Lo/fmb;->r()Lo/fow;

    move-result-object v1

    invoke-virtual {p1}, Lo/fly;->r()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/foz;->c(Lo/fow;Lo/fow;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 251
    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-ne v0, v1, :cond_4

    invoke-virtual {v7}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {p1}, Lo/fly;->a()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 253
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "possible MID reuse before lifetime end for token [{}], expected MID {} but received {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fly;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v7}, Lo/fmb;->b()Lo/fma;

    move-result-object v3

    invoke-virtual {v3}, Lo/fma;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fly;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x0

    return-object v0

    .line 271
    :cond_4
    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-eq v0, v1, :cond_5

    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_6

    :cond_5
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v5, v7}, Lo/fml;->d(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 273
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "received duplicate response for open exchange: {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 274
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/fly;->h(Z)V

    goto :goto_1

    .line 275
    :cond_6
    if-nez v8, :cond_7

    .line 277
    invoke-virtual {v7}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-static {v0}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v5

    .line 278
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v5, v7}, Lo/fml;->c(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 279
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "closed open request [{}]"

    invoke-interface {v0, v1, v5}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 283
    :cond_7
    :goto_1
    return-object v7

    .line 285
    :cond_8
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "ignoring potentially forged response for token {} with non-matching endpoint context"

    invoke-interface {v0, v1, v6}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 286
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 171
    sget-object v0, Lo/flz;->d:Lo/flz;

    invoke-virtual {p2, v0}, Lo/flo;->e(Lo/flz;)Lo/flq;

    .line 173
    invoke-virtual {p2}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->b:Lo/flj$e;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    .line 175
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 177
    :cond_0
    return-void
.end method

.method public b(Lo/flo;)Lo/fmb;
    .locals 7

    .line 296
    invoke-static {p1}, Lo/fmb$e;->c(Lo/flq;)Lo/fmb$e;

    move-result-object v5

    .line 297
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    const/4 v1, 0x0

    invoke-interface {v0, v5, v1}, Lo/fml;->c(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    move-result-object v6

    .line 299
    if-eqz v6, :cond_0

    .line 300
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "received expected reply for message exchange {}"

    invoke-interface {v0, v1, v5}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 302
    :cond_0
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "ignoring unmatchable empty message from {}: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/flo;->r()Lo/fow;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    :goto_0
    return-object v6
.end method

.method public b(Lo/fma;)Lo/fmb;
    .locals 5

    .line 193
    invoke-static {p1}, Lo/fmb$e;->c(Lo/flq;)Lo/fmb$e;

    move-result-object v2

    .line 195
    new-instance v3, Lo/fmb;

    sget-object v0, Lo/fmb$b;->b:Lo/fmb$b;

    invoke-direct {v3, p1, v0}, Lo/fmb;-><init>(Lo/fma;Lo/fmb$b;)V

    .line 196
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, v2, v3}, Lo/fml;->d(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    move-result-object v4

    .line 197
    if-nez v4, :cond_0

    .line 198
    iget-object v0, p0, Lo/fmv;->g:Lo/fmg;

    invoke-virtual {v3, v0}, Lo/fmb;->a(Lo/fmg;)V

    .line 199
    return-object v3

    .line 202
    :cond_0
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "duplicate request: {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/fma;->h(Z)V

    .line 204
    return-object v4
.end method

.method public c(Lo/fmb;Lo/fma;)V
    .locals 6

    .line 105
    invoke-virtual {p2}, Lo/fma;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 106
    invoke-virtual {p0, p2}, Lo/fmv;->d(Lo/fma;)V

    .line 110
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, p1}, Lo/fml;->a(Lo/fmb;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    iget-object v0, p0, Lo/fmv;->g:Lo/fmg;

    invoke-virtual {p1, v0}, Lo/fmb;->a(Lo/fmg;)V

    .line 114
    sget-object v0, Lo/fmv;->i:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "tracking open request [MID: {}, Token: {}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lo/fma;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Lo/fma;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 119
    :cond_1
    sget-object v0, Lo/fmv;->i:Lo/fty;

    const-string v1, "message IDs exhausted, could not register outbound request for tracking"

    invoke-interface {v0, v1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 120
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "automatic message IDs exhausted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lo/fma;->d(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :cond_2
    :goto_0
    goto :goto_1

    .line 122
    :catch_0
    move-exception v5

    .line 123
    invoke-virtual {p2, v5}, Lo/fma;->d(Ljava/lang/Throwable;)V

    .line 125
    :goto_1
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 3

    .line 131
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/fly;->e(Lo/flz;)Lo/flq;

    .line 134
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-ne v0, v1, :cond_1

    .line 135
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->t()Lo/foo;

    move-result-object v2

    .line 136
    if-eqz v2, :cond_1

    .line 137
    invoke-direct {p0, v2, p1}, Lo/fmv;->e(Lo/foo;Lo/fmb;)V

    .line 143
    :cond_1
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_2

    .line 144
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, p1}, Lo/fml;->d(Lo/fmb;)Z

    goto :goto_0

    .line 145
    :cond_2
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_4

    .line 146
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, p1}, Lo/fml;->d(Lo/fmb;)Z

    goto :goto_0

    .line 157
    :cond_3
    iget-object v0, p0, Lo/fmv;->c:Lo/fml;

    invoke-interface {v0, p2}, Lo/fml;->b(Lo/flq;)I

    .line 162
    :cond_4
    :goto_0
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-eq v0, v1, :cond_5

    invoke-virtual {p2}, Lo/fly;->G()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 163
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 165
    :cond_5
    return-void
.end method
