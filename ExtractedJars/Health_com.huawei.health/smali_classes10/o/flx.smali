.class public Lo/flx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/flx$e;,
        Lo/flx$h;,
        Lo/flx$a;,
        Lo/flx$b;,
        Lo/flx$d;,
        Lo/flx$c;
    }
.end annotation


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lo/fnw;

.field private final d:Lo/fov;

.field private final e:Lo/fmw;

.field private final f:Lo/fng;

.field private g:Z

.field private final h:Lo/fnh;

.field private final i:Lo/fmo;

.field private k:Ljava/util/concurrent/ScheduledExecutorService;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fmc;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fnj;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/foj;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 164
    const-class v0, Lo/flx;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/flx;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 208
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/flx;-><init>(I)V

    .line 209
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 220
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-direct {p0, v0}, Lo/flx;-><init>(Ljava/net/InetSocketAddress;)V

    .line 221
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 230
    invoke-static {}, Lo/fmw;->a()Lo/fmw;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/flx;-><init>(Ljava/net/InetSocketAddress;Lo/fmw;)V

    .line 231
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Lo/fmw;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 266
    move-object v0, p0

    new-instance v1, Lo/fpj;

    invoke-direct {v1, p1}, Lo/fpj;-><init>(Ljava/net/InetSocketAddress;)V

    move-object v3, p2

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/flx;-><init>(Lo/fov;ZLo/fmw;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V

    .line 267
    return-void
.end method

.method public constructor <init>(Lo/fov;Lo/fmw;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 292
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/flx;-><init>(Lo/fov;ZLo/fmw;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V

    .line 293
    return-void
.end method

.method protected constructor <init>(Lo/fov;ZLo/fmw;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V
    .locals 10

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lo/flx;->l:Ljava/util/List;

    .line 196
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lo/flx;->m:Ljava/util/List;

    .line 199
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lo/flx;->n:Ljava/util/List;

    .line 354
    iput-object p3, p0, Lo/flx;->e:Lo/fmw;

    .line 355
    iput-object p1, p0, Lo/flx;->d:Lo/fov;

    .line 356
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    new-instance v1, Lo/flx$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/flx$b;-><init>(Lo/flx;Lo/flx$1;)V

    invoke-interface {v0, v1}, Lo/fov;->c(Lo/fpg;)V

    .line 357
    invoke-interface {p1}, Lo/fov;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/flx;->a:Ljava/lang/String;

    .line 361
    if-nez p4, :cond_0

    .line 362
    new-instance v0, Lo/fmr;

    move-object v1, p3

    invoke-direct {v0, v1}, Lo/fmr;-><init>(Lo/fmw;)V

    move-object p4, v0

    .line 364
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p6

    if-eq v0, v1, :cond_1

    move-object/from16 v7, p6

    goto :goto_0

    :cond_1
    new-instance v7, Lo/fmj;

    invoke-direct {v7, p3, p4}, Lo/fmj;-><init>(Lo/fmw;Lo/fmx;)V

    .line 366
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p5, :cond_2

    move-object v8, p5

    goto :goto_1

    :cond_2
    new-instance v8, Lo/fon;

    invoke-direct {v8}, Lo/fon;-><init>()V

    .line 367
    :goto_1
    const/4 v0, 0x0

    move-object/from16 v1, p7

    if-ne v0, v1, :cond_3

    .line 368
    invoke-static {p1, p3}, Lo/fme;->d(Lo/fov;Lo/fmw;)Lo/foz;

    move-result-object p7

    .line 372
    :cond_3
    if-eqz p2, :cond_5

    .line 373
    instance-of v0, p1, Lo/fpj;

    if-eqz v0, :cond_4

    .line 374
    move-object v9, p1

    check-cast v9, Lo/fpj;

    .line 375
    const-string v0, "NETWORK_STAGE_RECEIVER_THREAD_COUNT"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fpj;->e(I)V

    .line 376
    const-string v0, "NETWORK_STAGE_SENDER_THREAD_COUNT"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fpj;->d(I)V

    .line 378
    const-string v0, "UDP_CONNECTOR_RECEIVE_BUFFER"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fpj;->a(I)V

    .line 379
    const-string v0, "UDP_CONNECTOR_SEND_BUFFER"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fpj;->b(I)V

    .line 380
    const-string v0, "UDP_CONNECTOR_DATAGRAM_SIZE"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fpj;->c(I)V

    .line 381
    goto :goto_2

    .line 382
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Connector must be a UDPConnector to use apply configuration!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 386
    :cond_5
    :goto_2
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    move-object/from16 v1, p7

    invoke-interface {v0, v1}, Lo/fov;->d(Lo/foz;)V

    .line 387
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "{} uses {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface/range {p7 .. p7}, Lo/foz;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    invoke-interface {p1}, Lo/fov;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 390
    new-instance v0, Lo/fmq;

    new-instance v2, Lo/flx$c;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1}, Lo/flx$c;-><init>(Lo/flx;Lo/flx$1;)V

    move-object v1, p3

    move-object v3, p4

    move-object v4, v8

    move-object v5, v7

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v6}, Lo/fmq;-><init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V

    iput-object v0, p0, Lo/flx;->i:Lo/fmo;

    .line 392
    new-instance v0, Lo/flx$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/flx$d;-><init>(Lo/flx;Lo/flx$1;)V

    invoke-virtual {p0, p3, v0}, Lo/flx;->c(Lo/fmw;Lo/fmt;)Lo/fnw;

    move-result-object v0

    iput-object v0, p0, Lo/flx;->b:Lo/fnw;

    .line 393
    new-instance v0, Lo/fnk;

    invoke-direct {v0}, Lo/fnk;-><init>()V

    iput-object v0, p0, Lo/flx;->f:Lo/fng;

    .line 394
    new-instance v0, Lo/fnm;

    invoke-direct {v0}, Lo/fnm;-><init>()V

    iput-object v0, p0, Lo/flx;->h:Lo/fnh;

    goto :goto_3

    .line 396
    :cond_6
    new-instance v0, Lo/fmv;

    new-instance v2, Lo/flx$c;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1}, Lo/flx$c;-><init>(Lo/flx;Lo/flx$1;)V

    move-object v1, p3

    move-object v3, p4

    move-object v4, v8

    move-object v5, v7

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v6}, Lo/fmv;-><init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V

    iput-object v0, p0, Lo/flx;->i:Lo/fmo;

    .line 398
    new-instance v0, Lo/flx$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/flx$d;-><init>(Lo/flx;Lo/flx$1;)V

    invoke-virtual {p0, p3, v0}, Lo/flx;->d(Lo/fmw;Lo/fmt;)Lo/fnw;

    move-result-object v0

    iput-object v0, p0, Lo/flx;->b:Lo/fnw;

    .line 399
    new-instance v0, Lo/fnn;

    invoke-direct {v0}, Lo/fnn;-><init>()V

    iput-object v0, p0, Lo/flx;->f:Lo/fng;

    .line 400
    new-instance v0, Lo/fno;

    invoke-direct {v0}, Lo/fno;-><init>()V

    iput-object v0, p0, Lo/flx;->h:Lo/fnh;

    .line 402
    :goto_3
    return-void
.end method

.method static synthetic a(Lo/flx;)Lo/fnw;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->b:Lo/fnw;

    return-object v0
.end method

.method static synthetic a(Lo/flx;Ljava/lang/Runnable;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Lo/flx;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lo/flx;)Lo/fng;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->f:Lo/fng;

    return-object v0
.end method

.method static synthetic c(Lo/flx;)Ljava/util/List;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/flx;)Lo/fmo;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->i:Lo/fmo;

    return-object v0
.end method

.method static synthetic e(Lo/flx;)Ljava/util/List;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->n:Ljava/util/List;

    return-object v0
.end method

.method private e(Ljava/lang/Runnable;)V
    .locals 2

    .line 999
    iget-object v0, p0, Lo/flx;->k:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/flx$4;

    invoke-direct {v1, p0, p1}, Lo/flx$4;-><init>(Lo/flx;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1009
    return-void
.end method

.method static synthetic f(Lo/flx;)Lo/fnh;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->h:Lo/fnh;

    return-object v0
.end method

.method static synthetic h()Lo/fty;
    .locals 1

    .line 161
    sget-object v0, Lo/flx;->c:Lo/fty;

    return-object v0
.end method

.method static synthetic i(Lo/flx;)Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lo/flx;)Lo/fov;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 465
    new-instance v0, Lo/flx$5;

    invoke-direct {v0, p0}, Lo/flx$5;-><init>(Lo/flx;)V

    invoke-direct {p0, v0}, Lo/flx;->e(Ljava/lang/Runnable;)V

    .line 471
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 406
    :try_start_0
    iget-boolean v0, p0, Lo/flx;->g:Z

    if-eqz v0, :cond_0

    .line 407
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Endpoint at {} is already started"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 408
    monitor-exit p0

    return-void

    .line 411
    :cond_0
    iget-object v0, p0, Lo/flx;->b:Lo/fnw;

    invoke-interface {v0}, Lo/fnw;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 412
    new-instance v0, Lo/fmd$e;

    invoke-direct {v0}, Lo/fmd$e;-><init>()V

    invoke-virtual {p0, v0}, Lo/flx;->c(Lo/foq;)V

    .line 415
    :cond_1
    iget-object v0, p0, Lo/flx;->k:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_2

    .line 416
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Endpoint [{}] requires an executor to start, using default single-threaded daemon executor"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 420
    new-instance v0, Lo/fpn;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CoapEndpoint-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/flx;->d:Lo/fov;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fpn;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flx;->a(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 422
    new-instance v0, Lo/flx$1;

    invoke-direct {v0, p0}, Lo/flx$1;-><init>(Lo/flx;)V

    invoke-virtual {p0, v0}, Lo/flx;->c(Lo/fmc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 439
    :cond_2
    :try_start_1
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Starting endpoint at {}"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 441
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/flx;->g:Z

    .line 442
    iget-object v0, p0, Lo/flx;->i:Lo/fmo;

    invoke-interface {v0}, Lo/fmo;->d()V

    .line 443
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    invoke-interface {v0}, Lo/fov;->e()V

    .line 444
    iget-object v0, p0, Lo/flx;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fmc;

    .line 445
    invoke-interface {v4, p0}, Lo/fmc;->b(Lo/fmf;)V

    .line 446
    goto :goto_0

    .line 447
    :cond_3
    invoke-direct {p0}, Lo/flx;->k()V

    .line 448
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Started endpoint at {}"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 453
    goto :goto_1

    .line 449
    :catch_0
    move-exception v3

    .line 451
    :try_start_2
    invoke-virtual {p0}, Lo/flx;->b()V

    .line 452
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 454
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized a(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    monitor-enter p0

    .line 515
    :try_start_0
    iput-object p1, p0, Lo/flx;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 516
    iget-object v0, p0, Lo/flx;->b:Lo/fnw;

    invoke-interface {v0, p1}, Lo/fnw;->c(Ljava/util/concurrent/ScheduledExecutorService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lo/fma;)V
    .locals 1

    .line 557
    invoke-virtual {p1}, Lo/fma;->G()V

    .line 559
    new-instance v0, Lo/flx$2;

    invoke-direct {v0, p0, p1}, Lo/flx$2;-><init>(Lo/flx;Lo/fma;)V

    invoke-direct {p0, v0}, Lo/flx;->e(Ljava/lang/Runnable;)V

    .line 565
    return-void
.end method

.method public declared-synchronized b()V
    .locals 5

    monitor-enter p0

    .line 475
    :try_start_0
    iget-boolean v0, p0, Lo/flx;->g:Z

    if-nez v0, :cond_0

    .line 476
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Endpoint at {} is already stopped"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 478
    :cond_0
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "Stopping endpoint at {}"

    invoke-virtual {p0}, Lo/flx;->c()Ljava/net/URI;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 479
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/flx;->g:Z

    .line 480
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    invoke-interface {v0}, Lo/fov;->a()V

    .line 481
    iget-object v0, p0, Lo/flx;->i:Lo/fmo;

    invoke-interface {v0}, Lo/fmo;->c()V

    .line 482
    iget-object v0, p0, Lo/flx;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fmc;

    .line 483
    invoke-interface {v4, p0}, Lo/fmc;->d(Lo/fmf;)V

    .line 484
    goto :goto_0

    .line 485
    :cond_1
    iget-object v0, p0, Lo/flx;->i:Lo/fmo;

    invoke-interface {v0}, Lo/fmo;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 487
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public c()Ljava/net/URI;
    .locals 11

    .line 612
    const/4 v8, 0x0

    .line 614
    :try_start_0
    invoke-virtual {p0}, Lo/flx;->e()Ljava/net/InetSocketAddress;

    move-result-object v9

    .line 615
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    invoke-interface {v0}, Lo/fov;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 616
    new-instance v0, Ljava/net/URI;

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    move-object v1, v10

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v8, v0

    .line 621
    goto :goto_0

    .line 617
    :catch_0
    move-exception v9

    .line 618
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "URI"

    invoke-interface {v0, v1, v9}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 621
    goto :goto_0

    .line 619
    :catch_1
    move-exception v9

    .line 620
    sget-object v0, Lo/flx;->c:Lo/fty;

    const-string v1, "URI"

    invoke-interface {v0, v1, v9}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 622
    :goto_0
    return-object v8
.end method

.method protected c(Lo/fmw;Lo/fmt;)Lo/fnw;
    .locals 1

    .line 1016
    new-instance v0, Lo/fny;

    invoke-direct {v0, p1, p2}, Lo/fny;-><init>(Lo/fmw;Lo/fmt;)V

    return-object v0
.end method

.method public c(Lo/fmc;)V
    .locals 1

    .line 531
    iget-object v0, p0, Lo/flx;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 532
    return-void
.end method

.method public c(Lo/foq;)V
    .locals 1

    .line 602
    iget-object v0, p0, Lo/flx;->b:Lo/fnw;

    invoke-interface {v0, p1}, Lo/fnw;->d(Lo/foq;)V

    .line 603
    return-void
.end method

.method protected d(Lo/fmw;Lo/fmt;)Lo/fnw;
    .locals 1

    .line 1012
    new-instance v0, Lo/fnu;

    invoke-direct {v0, p1, p2}, Lo/fnu;-><init>(Lo/fmw;Lo/fmt;)V

    return-object v0
.end method

.method public declared-synchronized d()Z
    .locals 2

    monitor-enter p0

    .line 509
    :try_start_0
    iget-boolean v0, p0, Lo/flx;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 607
    iget-object v0, p0, Lo/flx;->d:Lo/fov;

    invoke-interface {v0}, Lo/fov;->b()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 587
    iget-object v0, p0, Lo/flx;->b:Lo/fnw;

    invoke-interface {v0, p1, p2}, Lo/fnw;->b(Lo/fmb;Lo/flo;)V

    .line 588
    return-void
.end method

.method public f()Lo/fmw;
    .locals 1

    .line 627
    iget-object v0, p0, Lo/flx;->e:Lo/fmw;

    return-object v0
.end method
