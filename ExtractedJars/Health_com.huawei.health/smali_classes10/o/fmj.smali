.class public Lo/fmj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fml;


# static fields
.field private static final b:Lo/fty;


# instance fields
.field private final a:Lo/fmw;

.field private final c:Lo/fmx;

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<Lo/fmb$e;Lo/fmb;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<Lo/flz;Lo/fmb;>;"
        }
    .end annotation
.end field

.field private volatile f:Lo/fmp;

.field private g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field

.field private h:Z

.field private volatile i:Lo/fnb;

.field private k:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const-class v0, Lo/fmj;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fmj;->b:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;Lo/fmx;)V
    .locals 2

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 69
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fmj;->h:Z

    .line 99
    if-nez p1, :cond_0

    .line 100
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Configuration must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_0
    if-nez p2, :cond_1

    .line 103
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "TokenProvider must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_1
    iput-object p2, p0, Lo/fmj;->c:Lo/fmx;

    .line 106
    iput-object p1, p0, Lo/fmj;->a:Lo/fmw;

    .line 107
    return-void
.end method

.method private a()V
    .locals 8

    .line 111
    iget-object v0, p0, Lo/fmj;->a:Lo/fmw;

    const-string v1, "HEALTH_STATUS_INTERVAL"

    const/16 v2, 0x3c

    invoke-virtual {v0, v1, v2}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v7

    .line 114
    sget-object v0, Lo/fmj;->b:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    new-instance v0, Lo/fpn;

    const-string v1, "MessageExchangeStore"

    invoke-direct {v0, v1}, Lo/fpn;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fmj;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 117
    iget-object v0, p0, Lo/fmj;->k:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fmj$3;

    invoke-direct {v1, p0}, Lo/fmj$3;-><init>(Lo/fmj;)V

    int-to-long v2, v7

    int-to-long v4, v7

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lo/fmj;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 125
    :cond_0
    return-void
.end method

.method private c(Lo/fmb;Lo/flq;)I
    .locals 7

    .line 195
    invoke-virtual {p2}, Lo/flq;->a()I

    move-result v5

    .line 196
    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 197
    invoke-virtual {p0, p2}, Lo/fmj;->b(Lo/flq;)I

    move-result v5

    .line 198
    const/4 v0, -0x1

    if-eq v0, v5, :cond_3

    .line 199
    invoke-static {p2}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v6

    .line 200
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v6, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "automatic message ID [%d] already in use, cannot register exchange"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lo/flq;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    goto :goto_0

    .line 206
    :cond_1
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p2}, Lo/fmb$e;->b(Lo/flq;)Lo/fmb$e;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fmb;

    .line 207
    if-eqz v6, :cond_3

    .line 208
    if-eq v6, p1, :cond_2

    .line 209
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "message ID [%d] already in use, cannot register exchange"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lo/flq;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_2
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-nez v0, :cond_3

    .line 212
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "message with already registered ID [%d] is not a re-transmission, cannot register exchange"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lo/flq;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_3
    :goto_0
    return v5
.end method

.method private c()Ljava/lang/String;
    .locals 3

    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "MessageExchangeStore contents: "

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " exchanges by MID, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " exchanges by token, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/fmj;)Ljava/lang/String;
    .locals 1

    .line 63
    invoke-direct {p0}, Lo/fmj;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e()Lo/fty;
    .locals 1

    .line 63
    sget-object v0, Lo/fmj;->b:Lo/fty;

    return-object v0
.end method

.method private e(Lo/fmb;)V
    .locals 4

    .line 222
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v2

    .line 223
    invoke-virtual {v2}, Lo/fma;->k()Lo/flz;

    move-result-object v3

    .line 224
    if-nez v3, :cond_1

    .line 226
    :cond_0
    iget-object v0, p0, Lo/fmj;->c:Lo/fmx;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fmx;->c(Z)Lo/flz;

    move-result-object v3

    .line 227
    invoke-virtual {v2, v3}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 228
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v3, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v3, p1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_2

    .line 232
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-virtual {v2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->D()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->E()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_2

    .line 234
    sget-object v0, Lo/fmj;->b:Lo/fty;

    const-string v1, "manual token overrides existing open request: {}"

    invoke-interface {v0, v1, v3}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 238
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/flz;Lo/fmb;)V
    .locals 3

    .line 272
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 273
    if-eqz v2, :cond_0

    .line 274
    sget-object v0, Lo/fmj;->b:Lo/fty;

    const-string v1, "removing exchange for token {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 276
    :cond_0
    return-void
.end method

.method public a(Lo/fmb;)Z
    .locals 3

    .line 243
    if-nez p1, :cond_0

    .line 244
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "exchange must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    if-nez v0, :cond_1

    .line 246
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "exchange does not contain a request"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_1
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/fmj;->c(Lo/fmb;Lo/flq;)I

    move-result v2

    .line 249
    const/4 v0, -0x1

    if-eq v0, v2, :cond_2

    .line 250
    invoke-direct {p0, p1}, Lo/fmj;->e(Lo/fmb;)V

    .line 251
    const/4 v0, 0x1

    return v0

    .line 253
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/flq;)I
    .locals 4

    .line 180
    invoke-virtual {p1}, Lo/flq;->a()I

    move-result v2

    .line 181
    const/4 v0, -0x1

    if-ne v0, v2, :cond_1

    .line 182
    invoke-virtual {p1}, Lo/flq;->u()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    .line 183
    iget-object v0, p0, Lo/fmj;->f:Lo/fmp;

    invoke-interface {v0, v3}, Lo/fmp;->d(Ljava/net/InetSocketAddress;)I

    move-result v2

    .line 184
    const/4 v0, -0x1

    if-ne v0, v2, :cond_0

    .line 185
    sget-object v0, Lo/fmj;->b:Lo/fty;

    const-string v1, "cannot send message to {}, all MIDs are in use"

    invoke-interface {v0, v1, v3}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {p1, v2}, Lo/flq;->d(I)Lo/flq;

    .line 190
    :cond_1
    :goto_0
    return v2
.end method

.method public b(Lo/flz;)Lo/fmb;
    .locals 1

    .line 296
    if-nez p1, :cond_0

    .line 297
    const/4 v0, 0x0

    return-object v0

    .line 299
    :cond_0
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmb;

    return-object v0
.end method

.method public declared-synchronized b()V
    .locals 4

    monitor-enter p0

    .line 325
    :try_start_0
    iget-boolean v0, p0, Lo/fmj;->h:Z

    if-nez v0, :cond_2

    .line 326
    invoke-direct {p0}, Lo/fmj;->a()V

    .line 327
    iget-object v0, p0, Lo/fmj;->i:Lo/fnb;

    if-nez v0, :cond_0

    .line 328
    invoke-static {}, Lo/fnc;->d()Lo/fnc;

    move-result-object v3

    .line 329
    iget-object v0, p0, Lo/fmj;->a:Lo/fmw;

    invoke-virtual {v3, v0}, Lo/fnc;->c(Lo/fmw;)Lo/fnb;

    move-result-object v0

    iput-object v0, p0, Lo/fmj;->i:Lo/fnb;

    .line 331
    :cond_0
    iget-object v0, p0, Lo/fmj;->i:Lo/fnb;

    invoke-interface {v0}, Lo/fnb;->a()V

    .line 332
    iget-object v0, p0, Lo/fmj;->f:Lo/fmp;

    if-nez v0, :cond_1

    .line 333
    sget-object v0, Lo/fmj;->b:Lo/fty;

    const-string v1, "no MessageIdProvider set, using default {}"

    const-class v2, Lo/fmi;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 335
    new-instance v0, Lo/fmi;

    iget-object v1, p0, Lo/fmj;->a:Lo/fmw;

    invoke-direct {v0, v1}, Lo/fmi;-><init>(Lo/fmw;)V

    iput-object v0, p0, Lo/fmj;->f:Lo/fmp;

    .line 337
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmj;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public c(Lo/fmb$e;)Lo/fmb;
    .locals 1

    .line 364
    iget-object v0, p0, Lo/fmj;->i:Lo/fnb;

    invoke-interface {v0, p1}, Lo/fnb;->a(Lo/fmb$e;)Lo/fmb;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/fmb$e;Lo/fmb;)Lo/fmb;
    .locals 3

    .line 281
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 282
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fmb;

    goto :goto_0

    .line 283
    :cond_0
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    move-object v2, p2

    goto :goto_0

    .line 286
    :cond_1
    const/4 v2, 0x0

    .line 288
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 289
    sget-object v0, Lo/fmj;->b:Lo/fty;

    const-string v1, "removing exchange for MID {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 291
    :cond_2
    return-object v2
.end method

.method public c(Lo/fmb;)Z
    .locals 2

    .line 260
    if-nez p1, :cond_0

    .line 261
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "exchange must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    if-nez v0, :cond_1

    .line 263
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "exchange does not contain a request"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_1
    invoke-direct {p0, p1}, Lo/fmj;->e(Lo/fmb;)V

    .line 266
    const/4 v0, 0x1

    return v0
.end method

.method public d(Lo/fmb$e;Lo/fmb;)Lo/fmb;
    .locals 1

    .line 359
    iget-object v0, p0, Lo/fmj;->i:Lo/fnb;

    invoke-interface {v0, p1, p2}, Lo/fnb;->a(Lo/fmb$e;Lo/fmb;)Lo/fmb;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 346
    :try_start_0
    iget-boolean v0, p0, Lo/fmj;->h:Z

    if-eqz v0, :cond_1

    .line 347
    iget-object v0, p0, Lo/fmj;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Lo/fmj;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 350
    :cond_0
    iget-object v0, p0, Lo/fmj;->i:Lo/fnb;

    invoke-interface {v0}, Lo/fnb;->e()V

    .line 351
    iget-object v0, p0, Lo/fmj;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 352
    iget-object v0, p0, Lo/fmj;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 353
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fmj;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public d(Lo/fmb;)Z
    .locals 2

    .line 314
    if-nez p1, :cond_0

    .line 315
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "exchange must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    if-nez v0, :cond_1

    .line 317
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "exchange does not contain a response"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 319
    :cond_1
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/fmj;->c(Lo/fmb;Lo/flq;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 175
    invoke-direct {p0}, Lo/fmj;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
