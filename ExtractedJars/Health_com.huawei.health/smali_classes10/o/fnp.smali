.class final Lo/fnp;
.super Lo/fnr;
.source "SourceFile"


# static fields
.field private static final d:Lo/fty;


# instance fields
.field private c:Lo/fop;

.field private f:[B

.field private h:Lo/fly;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Lo/fnp;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnp;->d:Lo/fty;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lo/fnr;-><init>(II)V

    .line 65
    return-void
.end method

.method static synthetic c(Lo/fnp;)Lo/fly;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    return-object v0
.end method

.method private static d(Lo/fmb;I)I
    .locals 4

    .line 142
    invoke-virtual {p0}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {p0}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v3

    .line 144
    if-eqz v3, :cond_0

    .line 145
    sget-object v0, Lo/fnp;->d:Lo/fty;

    const-string v1, "using block2 szx from early negotiation in request: {}"

    invoke-virtual {v3}, Lo/fll;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    invoke-virtual {v3}, Lo/fll;->c()I

    move-result v0

    return v0

    .line 149
    :cond_0
    sget-object v0, Lo/fnp;->d:Lo/fty;

    const-string v1, "using default preferred block size for response: {}"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    invoke-static {p1}, Lo/fll;->d(I)I

    move-result v0

    return v0
.end method

.method static d(Lo/fmb;Lo/fly;I)Lo/fnp;
    .locals 3

    .line 78
    new-instance v2, Lo/fnp;

    invoke-virtual {p1}, Lo/fly;->g()I

    move-result v0

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->l()I

    move-result v1

    invoke-direct {v2, v0, v1}, Lo/fnp;-><init>(II)V

    .line 79
    iput-object p1, v2, Lo/fnp;->h:Lo/fly;

    .line 80
    iput-object p0, v2, Lo/fnp;->b:Lo/fmb;

    .line 81
    iget-object v0, v2, Lo/fnp;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lo/fly;->l()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 82
    iget-object v0, v2, Lo/fnp;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 83
    invoke-static {p0, p2}, Lo/fnp;->d(Lo/fmb;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/fnp;->c(I)V

    .line 84
    return-object v2
.end method

.method static e(Lo/fmb;Lo/fly;I)Lo/fnp;
    .locals 6

    .line 96
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->l()I

    move-result v2

    .line 97
    move v3, p2

    .line 98
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->M()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 101
    :cond_0
    new-instance v4, Lo/fnp;

    invoke-direct {v4, v3, v2}, Lo/fnp;-><init>(II)V

    .line 102
    invoke-virtual {v4, p1}, Lo/fnp;->d(Lo/flq;)V

    .line 103
    iput-object p0, v4, Lo/fnp;->b:Lo/fmb;

    .line 104
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->N()Ljava/lang/Integer;

    move-result-object v5

    .line 105
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/flr;->k(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    new-instance v0, Lo/fop;

    invoke-direct {v0, v5}, Lo/fop;-><init>(Ljava/lang/Integer;)V

    iput-object v0, v4, Lo/fnp;->c:Lo/fop;

    .line 108
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fmb;->d(I)V

    .line 110
    :cond_1
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->e()I

    move-result v0

    if-lez v0, :cond_2

    .line 112
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, v4, Lo/fnp;->f:[B

    .line 114
    :cond_2
    return-object v4
.end method

.method static e(Lo/fmb;Lo/fma;)Lo/fnp;
    .locals 5

    .line 128
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v2

    .line 129
    if-nez v2, :cond_0

    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "request must contain block2 option"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_0
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->l()I

    move-result v3

    .line 133
    new-instance v4, Lo/fnp;

    const/4 v0, 0x0

    invoke-direct {v4, v0, v3}, Lo/fnp;-><init>(II)V

    .line 134
    const/4 v0, 0x1

    iput-boolean v0, v4, Lo/fnp;->e:Z

    .line 135
    iput-object p0, v4, Lo/fnp;->b:Lo/fmb;

    .line 136
    invoke-virtual {v2}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/fnp;->b(I)V

    .line 137
    invoke-virtual {v2}, Lo/fll;->c()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/fnp;->c(I)V

    .line 138
    return-object v4
.end method

.method static final e(Lo/fly;Lo/fll;)V
    .locals 11

    .line 413
    if-nez p0, :cond_0

    .line 414
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "response message must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 415
    :cond_0
    if-nez p1, :cond_1

    .line 416
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "block option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 417
    :cond_1
    invoke-virtual {p0, p1}, Lo/fly;->e(Lo/fll;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 418
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "given response does not contain block"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 421
    :cond_2
    invoke-virtual {p0}, Lo/fly;->g()I

    move-result v5

    .line 422
    invoke-virtual {p1}, Lo/fll;->f()I

    move-result v6

    .line 423
    invoke-virtual {p1}, Lo/fll;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Lo/fll;->d()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 424
    sub-int v8, v7, v6

    .line 426
    sget-object v0, Lo/fnp;->d:Lo/fty;

    const-string v1, "cropping response body [size={}] to block {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    new-array v9, v8, [B

    .line 429
    if-ge v7, v5, :cond_3

    const/4 v10, 0x1

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    .line 430
    :goto_0
    invoke-virtual {p0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {p1}, Lo/fll;->c()I

    move-result v1

    invoke-virtual {p1}, Lo/fll;->b()I

    move-result v2

    invoke-virtual {v0, v1, v10, v2}, Lo/flr;->c(IZI)Lo/flr;

    .line 433
    invoke-virtual {p0}, Lo/fly;->l()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v6, v9, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 434
    invoke-virtual {p0, v9}, Lo/fly;->e([B)Lo/flq;

    .line 436
    return-void
.end method


# virtual methods
.method final declared-synchronized a()Ljava/lang/Integer;
    .locals 2

    monitor-enter p0

    .line 169
    :try_start_0
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    invoke-virtual {v0}, Lo/fop;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method declared-synchronized a(Lo/fll;)Lo/fly;
    .locals 2

    monitor-enter p0

    .line 264
    :try_start_0
    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    if-nez v0, :cond_0

    .line 265
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no response to track"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 268
    :cond_0
    invoke-virtual {p1}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fnp;->b(I)V

    .line 269
    invoke-virtual {p1}, Lo/fll;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fnp;->c(I)V

    .line 270
    invoke-virtual {p0}, Lo/fnp;->d()Lo/fly;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final a(Lo/fmb;)V
    .locals 5

    .line 352
    move-object v3, p0

    monitor-enter v3

    .line 353
    :try_start_0
    iget-object v2, p0, Lo/fnp;->b:Lo/fmb;

    .line 355
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fnp;->b(Ljava/util/concurrent/ScheduledFuture;)V

    .line 356
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fnp;->b:Lo/fmb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 358
    :goto_0
    if-eqz v2, :cond_2

    .line 359
    if-eq p1, v2, :cond_1

    .line 361
    invoke-virtual {v2}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->F()Z

    move-result v0

    if-nez v0, :cond_0

    .line 362
    invoke-virtual {v2}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->e(Z)V

    .line 364
    :cond_0
    invoke-virtual {v2}, Lo/fmb;->l()V

    goto :goto_1

    .line 368
    :cond_1
    invoke-virtual {v2}, Lo/fmb;->o()V

    .line 370
    invoke-virtual {v2}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fmb;->e(Lo/fma;)V

    .line 373
    :cond_2
    :goto_1
    return-void
.end method

.method declared-synchronized a(Lo/fly;)Z
    .locals 5

    monitor-enter p0

    .line 221
    if-nez p1, :cond_0

    .line 222
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "response block must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 225
    :cond_0
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v3

    .line 227
    if-nez v3, :cond_1

    .line 228
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "response block has no block2 option"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_1
    iget-object v0, p0, Lo/fnp;->f:[B

    if-eqz v0, :cond_3

    .line 232
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 233
    sget-object v0, Lo/fnp;->d:Lo/fty;

    const-string v1, "response does not contain a single ETag"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 234
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 235
    :cond_2
    iget-object v0, p0, Lo/fnp;->f:[B

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->c()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    .line 236
    sget-object v0, Lo/fnp;->d:Lo/fty;

    const-string v1, "response does not contain expected ETag"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 237
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 240
    :cond_3
    invoke-virtual {p1}, Lo/fly;->l()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fnp;->a([B)Z

    move-result v4

    .line 241
    if-eqz v4, :cond_4

    .line 242
    invoke-virtual {v3}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fnp;->b(I)V

    .line 243
    invoke-virtual {v3}, Lo/fll;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fnp;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_4
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final c(Lo/fmb;)V
    .locals 3

    .line 380
    move-object v1, p0

    monitor-enter v1

    .line 381
    :try_start_0
    iget-object v0, p0, Lo/fnp;->b:Lo/fmb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 383
    :goto_0
    if-eq p1, v0, :cond_0

    .line 385
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 387
    :cond_0
    return-void
.end method

.method final declared-synchronized c()Z
    .locals 2

    monitor-enter p0

    .line 160
    :try_start_0
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized c(Lo/fly;)Z
    .locals 2

    monitor-enter p0

    .line 182
    if-nez p1, :cond_0

    .line 183
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "response block must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 189
    :cond_1
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    invoke-virtual {v0, p1}, Lo/fop;->e(Lo/fly;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized d()Lo/fly;
    .locals 11

    monitor-enter p0

    .line 284
    :try_start_0
    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    if-nez v0, :cond_0

    .line 285
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no response to track"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 288
    :cond_0
    const/4 v3, 0x0

    .line 289
    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/fnp;->b()I

    move-result v0

    if-nez v0, :cond_1

    .line 290
    iget-object v3, p0, Lo/fnp;->h:Lo/fly;

    goto :goto_0

    .line 294
    :cond_1
    new-instance v3, Lo/fly;

    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/fly;-><init>(Lo/flj$b;)V

    .line 295
    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->u()Lo/fow;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fly;->d(Lo/fow;)Lo/flq;

    .line 296
    new-instance v0, Lo/flr;

    iget-object v1, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v1}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flr;-><init>(Lo/flr;)V

    invoke-virtual {v3, v0}, Lo/fly;->e(Lo/flr;)Lo/flq;

    .line 298
    invoke-virtual {v3}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->J()Lo/flr;

    .line 299
    new-instance v0, Lo/fnp$4;

    invoke-direct {v0, p0}, Lo/fnp$4;-><init>(Lo/fnp;)V

    invoke-virtual {v3, v0}, Lo/fly;->c(Lo/fls;)V

    .line 307
    :goto_0
    invoke-virtual {p0}, Lo/fnp;->b()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->M()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 309
    invoke-virtual {v3}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    iget-object v1, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v1}, Lo/fly;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/flr;->c(I)Lo/flr;

    .line 312
    :cond_2
    invoke-virtual {p0}, Lo/fnp;->g()I

    move-result v4

    .line 313
    invoke-virtual {p0}, Lo/fnp;->h()I

    move-result v0

    invoke-static {v0}, Lo/fll;->e(I)I

    move-result v5

    .line 314
    invoke-virtual {p0}, Lo/fnp;->b()I

    move-result v0

    mul-int v6, v0, v5

    .line 315
    const/4 v7, 0x0

    .line 317
    const/4 v0, 0x0

    if-ge v0, v4, :cond_6

    if-ge v6, v4, :cond_6

    .line 318
    invoke-virtual {p0}, Lo/fnp;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    mul-int/2addr v0, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 319
    sub-int v9, v8, v6

    .line 320
    new-array v10, v9, [B

    .line 321
    if-ge v8, v4, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 324
    :goto_1
    iget-object v0, p0, Lo/fnp;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 325
    iget-object v0, p0, Lo/fnp;->a:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v10, v1, v9}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 326
    invoke-virtual {v3, v10}, Lo/fly;->e([B)Lo/flq;

    .line 329
    if-nez v7, :cond_4

    iget-object v0, p0, Lo/fnp;->h:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3, v0}, Lo/fly;->k(Z)V

    .line 331
    if-nez v7, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p0, v0}, Lo/fnp;->e(Z)V

    .line 333
    goto :goto_4

    .line 335
    :cond_6
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/fly;->k(Z)V

    .line 336
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fnp;->e(Z)V

    .line 338
    :goto_4
    invoke-virtual {v3}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {p0}, Lo/fnp;->h()I

    move-result v1

    invoke-virtual {p0}, Lo/fnp;->b()I

    move-result v2

    invoke-virtual {v0, v1, v7, v2}, Lo/flr;->c(IZI)Lo/flr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method final declared-synchronized d(Lo/fmb;)Z
    .locals 3

    monitor-enter p0

    .line 201
    :try_start_0
    invoke-virtual {p1}, Lo/fmb;->n()Ljava/lang/Integer;

    move-result-object v2

    .line 202
    if-eqz v2, :cond_1

    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    if-eqz v0, :cond_1

    .line 203
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    invoke-virtual {v0}, Lo/fop;->c()I

    move-result v0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    .line 206
    :cond_1
    if-nez v2, :cond_2

    iget-object v0, p0, Lo/fnp;->c:Lo/fop;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 4

    monitor-enter p0

    .line 391
    :try_start_0
    invoke-super {p0}, Lo/fnr;->toString()Ljava/lang/String;

    move-result-object v2

    .line 392
    iget-object v0, p0, Lo/fnp;->c:Lo/fop;

    if-eqz v0, :cond_0

    .line 393
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 395
    const-string v0, ", observe="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fnp;->c:Lo/fop;

    invoke-virtual {v1}, Lo/fop;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 398
    :cond_0
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
