.class public final Lo/fql;
.super Lo/fqy;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:Lo/frn;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fsf;>;"
        }
    .end annotation
.end field

.field private d:Lo/fsa;

.field private e:Lo/fro;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqh;>;"
        }
    .end annotation
.end field

.field private h:Lo/frb;


# direct methods
.method private constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 211
    invoke-direct {p0, p1}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 71
    new-instance v0, Lo/frn;

    invoke-direct {v0}, Lo/frn;-><init>()V

    iput-object v0, p0, Lo/fql;->b:Lo/frn;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fql;->c:Ljava/util/List;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fql;->g:Ljava/util/List;

    .line 98
    new-instance v0, Lo/frb;

    invoke-direct {v0}, Lo/frb;-><init>()V

    iput-object v0, p0, Lo/fql;->h:Lo/frb;

    .line 212
    return-void
.end method

.method public constructor <init>(Lo/frn;Ljava/security/SecureRandom;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/frn;Ljava/security/SecureRandom;Ljava/util/List<Lo/fsf;>;Ljava/util/List<Lo/fqf$e;>;Ljava/util/List<Lo/fqf$e;>;Ljava/net/InetSocketAddress;)V"
        }
    .end annotation

    .line 125
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fql;-><init>(Lo/frn;Ljava/security/SecureRandom;Lo/fsa;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V

    .line 127
    return-void
.end method

.method public constructor <init>(Lo/frn;Ljava/security/SecureRandom;Lo/fqr;Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/frn;Ljava/security/SecureRandom;Lo/fqr;Ljava/util/List<Lo/fqf$e;>;Ljava/util/List<Lo/fqf$e;>;)V"
        }
    .end annotation

    .line 149
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual {p3}, Lo/fqr;->e()Lo/fsa;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Lo/fsf;

    invoke-virtual {p3}, Lo/fqr;->b()Lo/fsf;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v5, p4

    move-object v6, p5

    invoke-virtual {p3}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lo/fql;-><init>(Lo/frn;Ljava/security/SecureRandom;Lo/fsa;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V

    .line 152
    invoke-virtual {p3}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->b()Lo/fqh;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fql;->b(Lo/fqh;)V

    .line 153
    return-void
.end method

.method private constructor <init>(Lo/frn;Ljava/security/SecureRandom;Lo/fsa;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/frn;Ljava/security/SecureRandom;Lo/fsa;Ljava/util/List<Lo/fsf;>;Ljava/util/List<Lo/fqf$e;>;Ljava/util/List<Lo/fqf$e;>;Ljava/net/InetSocketAddress;)V"
        }
    .end annotation

    .line 164
    invoke-direct {p0, p7}, Lo/fql;-><init>(Ljava/net/InetSocketAddress;)V

    .line 165
    iput-object p1, p0, Lo/fql;->b:Lo/frn;

    .line 166
    new-instance v0, Lo/fro;

    invoke-direct {v0, p2}, Lo/fro;-><init>(Ljava/security/SecureRandom;)V

    iput-object v0, p0, Lo/fql;->e:Lo/fro;

    .line 167
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fql;->a:[B

    .line 168
    if-eqz p3, :cond_0

    .line 169
    iput-object p3, p0, Lo/fql;->d:Lo/fsa;

    goto :goto_0

    .line 171
    :cond_0
    invoke-static {}, Lo/fsa;->a()Lo/fsa;

    move-result-object v0

    iput-object v0, p0, Lo/fql;->d:Lo/fsa;

    .line 173
    :goto_0
    if-eqz p4, :cond_1

    .line 174
    iget-object v0, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 179
    :cond_1
    invoke-static {p4}, Lo/fsf;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    invoke-static {}, Lo/fsi$d;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lo/fsi$d;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Lo/fsi$d;

    .line 183
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    new-instance v1, Lo/fsj;

    invoke-direct {v1, v3}, Lo/fsj;-><init>([Lo/fsi$d;)V

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf;)V

    .line 186
    const/4 v0, 0x1

    new-array v0, v0, [Lo/fsg$a;

    sget-object v1, Lo/fsg$a;->a:Lo/fsg$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 187
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    new-instance v1, Lo/fsg;

    invoke-direct {v1, v4}, Lo/fsg;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf;)V

    .line 191
    :cond_2
    if-eqz p5, :cond_4

    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 192
    new-instance v3, Lo/fqj;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lo/fqj;-><init>(Z)V

    .line 193
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqf$e;

    .line 194
    invoke-virtual {v3, v5}, Lo/fqf;->c(Lo/fqf$e;)V

    .line 195
    goto :goto_1

    .line 196
    :cond_3
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0, v3}, Lo/frb;->d(Lo/frf;)V

    .line 201
    :cond_4
    if-eqz p6, :cond_6

    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 202
    new-instance v3, Lo/fru;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lo/fru;-><init>(Z)V

    .line 203
    invoke-interface {p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqf$e;

    .line 204
    invoke-virtual {v3, v5}, Lo/fqf;->c(Lo/fqf$e;)V

    .line 205
    goto :goto_2

    .line 206
    :cond_5
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0, v3}, Lo/frb;->d(Lo/frf;)V

    .line 208
    :cond_6
    return-void
.end method

.method public static b([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 260
    new-instance v2, Lo/fpq;

    invoke-direct {v2, p0}, Lo/fpq;-><init>([B)V

    .line 261
    new-instance v3, Lo/fql;

    invoke-direct {v3, p1}, Lo/fql;-><init>(Ljava/net/InetSocketAddress;)V

    .line 263
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 264
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v5

    .line 265
    new-instance v0, Lo/frn;

    invoke-direct {v0, v4, v5}, Lo/frn;-><init>(II)V

    iput-object v0, v3, Lo/fql;->b:Lo/frn;

    .line 267
    new-instance v0, Lo/fro;

    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Lo/fpq;->d(I)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fro;-><init>([B)V

    iput-object v0, v3, Lo/fql;->e:Lo/fro;

    .line 269
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 270
    new-instance v0, Lo/fsa;

    invoke-virtual {v2, v6}, Lo/fpq;->d(I)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsa;-><init>([B)V

    iput-object v0, v3, Lo/fql;->d:Lo/fsa;

    .line 272
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 273
    invoke-virtual {v2, v7}, Lo/fpq;->d(I)[B

    move-result-object v0

    iput-object v0, v3, Lo/fql;->a:[B

    .line 275
    const/16 v0, 0x10

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 276
    invoke-virtual {v2, v8}, Lo/fpq;->d(I)[B

    move-result-object v0

    div-int/lit8 v1, v8, 0x2

    invoke-static {v0, v1}, Lo/fsf;->a([BI)Ljava/util/List;

    move-result-object v0

    iput-object v0, v3, Lo/fql;->c:Ljava/util/List;

    .line 279
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 280
    invoke-virtual {v2, v9}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-static {v0, v9}, Lo/fqh;->e([BI)Ljava/util/List;

    move-result-object v0

    iput-object v0, v3, Lo/fql;->g:Ljava/util/List;

    .line 283
    invoke-virtual {v2}, Lo/fpq;->c()[B

    move-result-object v10

    .line 284
    array-length v0, v10

    if-lez v0, :cond_0

    .line 285
    invoke-static {v10, p1}, Lo/frb;->a([BLjava/net/InetSocketAddress;)Lo/frb;

    move-result-object v0

    iput-object v0, v3, Lo/fql;->h:Lo/frb;

    .line 287
    :cond_0
    return-object v3
.end method


# virtual methods
.method public b(Lo/fqh;)V
    .locals 1

    .line 392
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    if-nez v0, :cond_0

    .line 393
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fql;->g:Ljava/util/List;

    .line 395
    :cond_0
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    return-void
.end method

.method public c()Lo/fra;
    .locals 1

    .line 295
    sget-object v0, Lo/fra;->c:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 304
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->a()I

    move-result v0

    add-int/lit8 v3, v0, 0x2

    .line 309
    :goto_0
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x27

    iget-object v1, p0, Lo/fql;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    return v0
.end method

.method d(Lo/frf;)V
    .locals 1

    .line 399
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 400
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0, p1}, Lo/frb;->d(Lo/frf;)V

    .line 402
    :cond_0
    return-void
.end method

.method public e([B)V
    .locals 1

    .line 376
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fql;->a:[B

    .line 377
    return-void
.end method

.method public f()Lo/fro;
    .locals 1

    .line 351
    iget-object v0, p0, Lo/fql;->e:Lo/fro;

    return-object v0
.end method

.method public g()[B
    .locals 3

    .line 219
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 221
    iget-object v0, p0, Lo/fql;->b:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 222
    iget-object v0, p0, Lo/fql;->b:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 224
    iget-object v0, p0, Lo/fql;->e:Lo/fro;

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 226
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 227
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->b()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 229
    iget-object v0, p0, Lo/fql;->a:[B

    array-length v0, v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 230
    iget-object v0, p0, Lo/fql;->a:[B

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 232
    iget-object v0, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 233
    iget-object v0, p0, Lo/fql;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fsf;->b(Ljava/util/List;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 235
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 236
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    invoke-static {v0}, Lo/fqh;->e(Ljava/util/List;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 238
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->c()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 242
    :cond_0
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 364
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Lo/frn;
    .locals 1

    .line 347
    iget-object v0, p0, Lo/fql;->b:Lo/frn;

    return-object v0
.end method

.method public k()Lo/fsa;
    .locals 1

    .line 355
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    return-object v0
.end method

.method public l()[B
    .locals 1

    .line 372
    iget-object v0, p0, Lo/fql;->a:[B

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fsf;>;"
        }
    .end annotation

    .line 380
    iget-object v0, p0, Lo/fql;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fqh;>;"
        }
    .end annotation

    .line 384
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()Lo/fsj;
    .locals 2

    .line 411
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->n:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/fsj;

    return-object v0

    .line 414
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public p()Lo/fqj;
    .locals 2

    .line 438
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->t:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/fqj;

    return-object v0

    .line 441
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Lo/fry;
    .locals 2

    .line 479
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->e:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/fry;

    return-object v0

    .line 482
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public t()Lo/frh;
    .locals 2

    .line 465
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->c:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/frh;

    return-object v0

    .line 468
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 315
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    const-string v0, "\t\tVersion: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->b:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->b:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tRandom:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->e:Lo/fro;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 319
    const-string v0, "\t\tSession ID Length: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v1}, Lo/fsa;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    iget-object v0, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 321
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tSession ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->d:Lo/fsa;

    invoke-virtual {v1}, Lo/fsa;->b()[B

    move-result-object v1

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    :cond_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCookie Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->a:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    iget-object v0, p0, Lo/fql;->a:[B

    array-length v0, v0

    if-lez v0, :cond_1

    .line 325
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCookie: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->a:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    :cond_1
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCipher Suites Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 328
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCipher Suites ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " suites)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    iget-object v0, p0, Lo/fql;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fsf;

    .line 330
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\tCipher Suite: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    goto :goto_0

    .line 332
    :cond_2
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCompression Methods Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 333
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCompression Methods ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " method)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    iget-object v0, p0, Lo/fql;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqh;

    .line 335
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\tCompression Method: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 336
    goto :goto_1

    .line 337
    :cond_3
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_4

    .line 338
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fql;->h:Lo/frb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lo/fru;
    .locals 2

    .line 451
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Lo/fql;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->x:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/fru;

    return-object v0

    .line 454
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
