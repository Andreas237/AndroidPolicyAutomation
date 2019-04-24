.class public final Lo/frs;
.super Lo/fqy;
.source "SourceFile"


# instance fields
.field private final a:Lo/fsf;

.field private final b:Lo/fro;

.field private final c:Lo/fsa;

.field private final d:Lo/fqh;

.field private final e:Lo/frn;

.field private final h:Lo/frb;


# direct methods
.method public constructor <init>(Lo/frn;Lo/fro;Lo/fsa;Lo/fsf;Lo/fqh;Lo/frb;Ljava/net/InetSocketAddress;)V
    .locals 2

    .line 121
    invoke-direct {p0, p7}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 122
    if-nez p1, :cond_0

    .line 123
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Negotiated protocol version must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_0
    if-nez p2, :cond_1

    .line 126
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ServerHello message must contain a random"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_1
    if-nez p3, :cond_2

    .line 129
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ServerHello must be associated with a session ID"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_2
    if-nez p4, :cond_3

    .line 132
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Negotiated cipher suite must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_3
    if-nez p5, :cond_4

    .line 135
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Negotiated compression method must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_4
    iput-object p1, p0, Lo/frs;->e:Lo/frn;

    .line 138
    iput-object p2, p0, Lo/frs;->b:Lo/fro;

    .line 139
    iput-object p3, p0, Lo/frs;->c:Lo/fsa;

    .line 140
    iput-object p4, p0, Lo/frs;->a:Lo/fsf;

    .line 141
    iput-object p5, p0, Lo/frs;->d:Lo/fqh;

    .line 142
    iput-object p6, p0, Lo/frs;->h:Lo/frb;

    .line 143
    return-void
.end method

.method public static d([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 182
    new-instance v8, Lo/fpq;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lo/fpq;-><init>([B)V

    .line 184
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 185
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lo/fpq;->c(I)I

    move-result v10

    .line 186
    new-instance v11, Lo/frn;

    invoke-direct {v11, v9, v10}, Lo/frn;-><init>(II)V

    .line 188
    new-instance v12, Lo/fro;

    const/16 v0, 0x20

    invoke-virtual {v8, v0}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-direct {v12, v0}, Lo/fro;-><init>([B)V

    .line 190
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lo/fpq;->c(I)I

    move-result v13

    .line 191
    new-instance v14, Lo/fsa;

    invoke-virtual {v8, v13}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-direct {v14, v0}, Lo/fsa;-><init>([B)V

    .line 193
    const/16 v0, 0x10

    invoke-virtual {v8, v0}, Lo/fpq;->c(I)I

    move-result v15

    .line 194
    invoke-static {v15}, Lo/fsf;->c(I)Lo/fsf;

    move-result-object v16

    .line 195
    if-nez v16, :cond_0

    .line 196
    new-instance v0, Lo/fqx;

    const-string v1, "Server selected unknown cipher suite [%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v15}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    move-object/from16 v5, p1

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 199
    :cond_0
    sget-object v0, Lo/fsf;->b:Lo/fsf;

    move-object/from16 v1, v16

    if-ne v1, v0, :cond_1

    .line 200
    new-instance v0, Lo/fqx;

    const-string v1, "Server tries to negotiate NULL cipher suite"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    move-object/from16 v5, p1

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 203
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lo/fpq;->c(I)I

    move-result v0

    invoke-static {v0}, Lo/fqh;->c(I)Lo/fqh;

    move-result-object v17

    .line 205
    invoke-virtual {v8}, Lo/fpq;->c()[B

    move-result-object v18

    .line 206
    const/16 v19, 0x0

    .line 207
    move-object/from16 v0, v18

    array-length v0, v0

    if-lez v0, :cond_2

    .line 208
    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/frb;->a([BLjava/net/InetSocketAddress;)Lo/frb;

    move-result-object v19

    .line 211
    :cond_2
    new-instance v0, Lo/frs;

    move-object v1, v11

    move-object v2, v12

    move-object v3, v14

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v19

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lo/frs;-><init>(Lo/frn;Lo/fro;Lo/fsa;Lo/fsf;Lo/fqh;Lo/frb;Ljava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public c()Lo/fra;
    .locals 1

    .line 218
    sget-object v0, Lo/fra;->d:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 229
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->a()I

    move-result v0

    add-int/lit8 v2, v0, 0x2

    .line 238
    :goto_0
    iget-object v0, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x26

    add-int/2addr v0, v2

    return v0
.end method

.method public f()Lo/fsf;
    .locals 1

    .line 274
    iget-object v0, p0, Lo/frs;->a:Lo/fsf;

    return-object v0
.end method

.method public g()[B
    .locals 3

    .line 149
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 151
    iget-object v0, p0, Lo/frs;->e:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 152
    iget-object v0, p0, Lo/frs;->e:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 154
    iget-object v0, p0, Lo/frs;->b:Lo/fro;

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 156
    iget-object v0, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 157
    iget-object v0, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->b()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 159
    iget-object v0, p0, Lo/frs;->a:Lo/fsf;

    invoke-virtual {v0}, Lo/fsf;->e()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 160
    iget-object v0, p0, Lo/frs;->d:Lo/fqh;

    invoke-virtual {v0}, Lo/fqh;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 162
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    invoke-virtual {v0}, Lo/frb;->c()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 166
    :cond_0
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public h()Lo/fsa;
    .locals 1

    .line 265
    iget-object v0, p0, Lo/frs;->c:Lo/fsa;

    return-object v0
.end method

.method public i()Lo/frn;
    .locals 1

    .line 247
    iget-object v0, p0, Lo/frs;->e:Lo/frn;

    return-object v0
.end method

.method public k()Lo/fro;
    .locals 1

    .line 256
    iget-object v0, p0, Lo/frs;->b:Lo/fro;

    return-object v0
.end method

.method l()Lo/fqf$e;
    .locals 4

    .line 322
    sget-object v2, Lo/fqf$e;->c:Lo/fqf$e;

    .line 323
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->x:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fru;

    .line 326
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fru;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    invoke-virtual {v3}, Lo/fru;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fqf$e;

    .line 330
    :cond_0
    return-object v2
.end method

.method public m()Lo/fqh;
    .locals 1

    .line 283
    iget-object v0, p0, Lo/frs;->d:Lo/fqh;

    return-object v0
.end method

.method n()Lo/frh;
    .locals 2

    .line 340
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->c:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    check-cast v0, Lo/frh;

    return-object v0

    .line 343
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method p()Lo/fqf$e;
    .locals 4

    .line 303
    sget-object v2, Lo/fqf$e;->c:Lo/fqf$e;

    .line 304
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    sget-object v1, Lo/frf$b;->t:Lo/frf$b;

    invoke-virtual {v0, v1}, Lo/frb;->d(Lo/frf$b;)Lo/frf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fqj;

    .line 307
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fqj;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 308
    invoke-virtual {v3}, Lo/fqj;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fqf$e;

    .line 311
    :cond_0
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 361
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    const-string v0, "\t\tServer Version: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->e:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->e:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 364
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tRandom:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->b:Lo/fro;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tSession ID Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v1}, Lo/fsa;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 366
    iget-object v0, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v0}, Lo/fsa;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 367
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tSession ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->c:Lo/fsa;

    invoke-virtual {v1}, Lo/fsa;->b()[B

    move-result-object v1

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    :cond_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCipher Suite: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->a:Lo/fsf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 370
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\tCompression Method: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->d:Lo/fqh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    iget-object v0, p0, Lo/frs;->h:Lo/frb;

    if-eqz v0, :cond_1

    .line 373
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frs;->h:Lo/frb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
