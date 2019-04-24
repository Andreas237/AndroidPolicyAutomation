.class public abstract Lo/fng;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Lo/flq;)[B
    .locals 11

    .line 188
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 189
    invoke-virtual {p0}, Lo/flq;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->S()Ljava/util/List;

    move-result-object v3

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/flt;

    .line 194
    invoke-virtual {v6}, Lo/flt;->b()I

    move-result v0

    sub-int v7, v0, v4

    .line 195
    invoke-static {v7}, Lo/fng;->c(I)I

    move-result v8

    .line 196
    const/4 v0, 0x4

    invoke-virtual {v2, v8, v0}, Lo/fpp;->c(II)V

    .line 199
    invoke-virtual {v6}, Lo/flt;->a()I

    move-result v9

    .line 200
    invoke-static {v9}, Lo/fng;->c(I)I

    move-result v10

    .line 201
    const/4 v0, 0x4

    invoke-virtual {v2, v10, v0}, Lo/fpp;->c(II)V

    .line 204
    const/16 v0, 0xd

    if-ne v8, v0, :cond_0

    .line 205
    add-int/lit8 v0, v7, -0xd

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_1

    .line 206
    :cond_0
    const/16 v0, 0xe

    if-ne v8, v0, :cond_1

    .line 207
    add-int/lit16 v0, v7, -0x10d

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 211
    :cond_1
    :goto_1
    const/16 v0, 0xd

    if-ne v10, v0, :cond_2

    .line 212
    add-int/lit8 v0, v9, -0xd

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_2

    .line 213
    :cond_2
    const/16 v0, 0xe

    if-ne v10, v0, :cond_3

    .line 214
    add-int/lit16 v0, v9, -0x10d

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 218
    :cond_3
    :goto_2
    invoke-virtual {v6}, Lo/flt;->e()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 221
    invoke-virtual {v6}, Lo/flt;->b()I

    move-result v4

    .line 222
    goto/16 :goto_0

    .line 224
    :cond_4
    invoke-virtual {p0}, Lo/flq;->l()[B

    move-result-object v5

    .line 225
    if-eqz v5, :cond_5

    array-length v0, v5

    if-lez v0, :cond_5

    .line 229
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lo/fpp;->b(B)V

    .line 230
    invoke-virtual {v2, v5}, Lo/fpp;->e([B)V

    .line 232
    :cond_5
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method private static c(I)I
    .locals 3

    .line 243
    const/16 v0, 0xc

    if-gt p0, v0, :cond_0

    .line 244
    return p0

    .line 245
    :cond_0
    const/16 v0, 0x10c

    if-gt p0, v0, :cond_1

    .line 246
    const/16 v0, 0xd

    return v0

    .line 247
    :cond_1
    const v0, 0x1010c

    if-gt p0, v0, :cond_2

    .line 248
    const/16 v0, 0xe

    return v0

    .line 250
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported option delta "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final c(Lo/fly;Lo/fpf;)Lo/fpd;
    .locals 11

    .line 124
    invoke-virtual {p1}, Lo/fly;->C()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 125
    new-instance v7, Lo/fpp;

    invoke-direct {v7}, Lo/fpp;-><init>()V

    .line 126
    invoke-static {p1}, Lo/fng;->b(Lo/flq;)[B

    move-result-object v8

    .line 128
    new-instance v0, Lo/fnf;

    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v2

    invoke-virtual {p1}, Lo/fly;->k()Lo/flz;

    move-result-object v3

    invoke-virtual {p1}, Lo/fly;->F()Lo/flj$b;

    move-result-object v1

    iget v4, v1, Lo/flj$b;->z:I

    invoke-virtual {p1}, Lo/fly;->a()I

    move-result v5

    array-length v6, v8

    const/4 v1, 0x1

    invoke-direct/range {v0 .. v6}, Lo/fnf;-><init>(ILo/flj$e;Lo/flz;III)V

    move-object v9, v0

    .line 130
    invoke-virtual {p0, v7, v9}, Lo/fng;->e(Lo/fpp;Lo/fnf;)V

    .line 131
    invoke-virtual {v7, v8}, Lo/fpp;->e([B)V

    .line 133
    invoke-virtual {v7}, Lo/fpp;->e()[B

    move-result-object v10

    .line 134
    invoke-virtual {p1, v10}, Lo/fly;->a([B)V

    .line 136
    :cond_0
    invoke-virtual {p1}, Lo/fly;->C()[B

    move-result-object v0

    invoke-virtual {p1}, Lo/fly;->u()Lo/fow;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Lo/fpd;->b([BLo/fow;Lo/fpf;Z)Lo/fpd;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lo/fma;Lo/fpf;)Lo/fpd;
    .locals 3

    .line 74
    invoke-virtual {p1}, Lo/fma;->C()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 75
    invoke-virtual {p0, p1}, Lo/fng;->e(Lo/fma;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fma;->a([B)V

    .line 77
    :cond_0
    invoke-virtual {p1}, Lo/fma;->C()[B

    move-result-object v0

    invoke-virtual {p1}, Lo/fma;->u()Lo/fow;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Lo/fpd;->b([BLo/fow;Lo/fpf;Z)Lo/fpd;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lo/flo;Lo/fpf;)Lo/fpd;
    .locals 11

    .line 160
    invoke-virtual {p1}, Lo/flo;->C()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 161
    new-instance v7, Lo/fpp;

    invoke-direct {v7}, Lo/fpp;-><init>()V

    .line 162
    invoke-static {p1}, Lo/fng;->b(Lo/flq;)[B

    move-result-object v8

    .line 164
    new-instance v0, Lo/fnf;

    invoke-virtual {p1}, Lo/flo;->b()Lo/flj$e;

    move-result-object v2

    invoke-virtual {p1}, Lo/flo;->k()Lo/flz;

    move-result-object v3

    invoke-virtual {p1}, Lo/flo;->a()I

    move-result v5

    array-length v6, v8

    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fnf;-><init>(ILo/flj$e;Lo/flz;III)V

    move-object v9, v0

    .line 166
    invoke-virtual {p0, v7, v9}, Lo/fng;->e(Lo/fpp;Lo/fnf;)V

    .line 167
    invoke-virtual {v7, v8}, Lo/fpp;->e([B)V

    .line 169
    invoke-virtual {v7}, Lo/fpp;->e()[B

    move-result-object v10

    .line 170
    invoke-virtual {p1, v10}, Lo/flo;->a([B)V

    .line 172
    :cond_0
    invoke-virtual {p1}, Lo/flo;->C()[B

    move-result-object v0

    invoke-virtual {p1}, Lo/flo;->u()Lo/fow;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2}, Lo/fpd;->b([BLo/fow;Lo/fpf;Z)Lo/fpd;

    move-result-object v0

    return-object v0
.end method

.method protected abstract e(Lo/fpp;Lo/fnf;)V
.end method

.method public final e(Lo/fma;)[B
    .locals 10

    .line 95
    new-instance v7, Lo/fpp;

    invoke-direct {v7}, Lo/fpp;-><init>()V

    .line 96
    invoke-static {p1}, Lo/fng;->b(Lo/flq;)[B

    move-result-object v8

    .line 98
    new-instance v0, Lo/fnf;

    invoke-virtual {p1}, Lo/fma;->b()Lo/flj$e;

    move-result-object v2

    invoke-virtual {p1}, Lo/fma;->k()Lo/flz;

    move-result-object v3

    invoke-virtual {p1}, Lo/fma;->e()I

    move-result v4

    invoke-virtual {p1}, Lo/fma;->a()I

    move-result v5

    array-length v6, v8

    const/4 v1, 0x1

    invoke-direct/range {v0 .. v6}, Lo/fnf;-><init>(ILo/flj$e;Lo/flz;III)V

    move-object v9, v0

    .line 100
    invoke-virtual {p0, v7, v9}, Lo/fng;->e(Lo/fpp;Lo/fnf;)V

    .line 101
    invoke-virtual {v7, v8}, Lo/fpp;->e([B)V

    .line 103
    invoke-virtual {v7}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method
