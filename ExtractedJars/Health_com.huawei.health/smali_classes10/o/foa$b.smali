.class public abstract Lo/foa$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/foa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x404
    name = "b"
.end annotation


# instance fields
.field private final a:Lo/fmb;

.field private final e:Lo/flq;

.field final synthetic k:Lo/foa;


# direct methods
.method public constructor <init>(Lo/foa;Lo/fmb;Lo/flq;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lo/foa$b;->k:Lo/foa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    iput-object p2, p0, Lo/foa$b;->a:Lo/fmb;

    .line 343
    iput-object p3, p0, Lo/foa$b;->e:Lo/flq;

    .line 344
    return-void
.end method

.method static synthetic c(Lo/foa$b;)Lo/flq;
    .locals 1

    .line 336
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    return-object v0
.end method


# virtual methods
.method public abstract b()V
.end method

.method public d()V
    .locals 6

    .line 347
    iget-object v0, p0, Lo/foa$b;->a:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->f()I

    move-result v4

    .line 348
    iget-object v0, p0, Lo/foa$b;->k:Lo/foa;

    iget-object v0, v0, Lo/foa;->d:Ljava/util/concurrent/ScheduledExecutorService;

    int-to-long v1, v4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v5

    .line 349
    iget-object v0, p0, Lo/foa$b;->a:Lo/fmb;

    invoke-virtual {v0, v5}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 350
    return-void
.end method

.method public run()V
    .locals 8

    .line 361
    :try_start_0
    iget-object v6, p0, Lo/foa$b;->a:Lo/fmb;

    monitor-enter v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    :try_start_1
    iget-object v0, p0, Lo/foa$b;->a:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->g()I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    .line 363
    iget-object v0, p0, Lo/foa$b;->a:Lo/fmb;

    invoke-virtual {v0, v5}, Lo/fmb;->e(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 364
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    :try_start_2
    throw v7

    .line 365
    :goto_0
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: message already acknowledged, cancel retransmission of {}"

    iget-object v2, p0, Lo/foa$b;->e:Lo/flq;

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 367
    return-void

    .line 369
    :cond_0
    :try_start_3
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 370
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: message already rejected, cancel retransmission of {}"

    iget-object v2, p0, Lo/foa$b;->e:Lo/flq;

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 371
    return-void

    .line 373
    :cond_1
    :try_start_4
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 374
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: canceled (MID={}), do not retransmit"

    iget-object v2, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v2}, Lo/flq;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 375
    return-void

    .line 377
    :cond_2
    :try_start_5
    iget-object v0, p0, Lo/foa$b;->k:Lo/foa;

    invoke-static {v0}, Lo/foa;->a(Lo/foa;)I

    move-result v0

    if-gt v5, v0, :cond_4

    .line 378
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: retransmit message, failed: {}, message: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/foa$b;->e:Lo/flq;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->B()V

    .line 384
    iget-object v0, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->y()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 385
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: canceled (MID={}), do not retransmit"

    iget-object v2, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v2}, Lo/flq;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 386
    return-void

    .line 388
    :cond_3
    :try_start_6
    invoke-virtual {p0}, Lo/foa$b;->b()V

    goto :goto_1

    .line 390
    :cond_4
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Timeout: retransmission limit reached, exchange failed, message: {}"

    iget-object v2, p0, Lo/foa$b;->e:Lo/flq;

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lo/foa$b;->a:Lo/fmb;

    iget-object v1, p0, Lo/foa$b;->e:Lo/flq;

    invoke-virtual {v0, v1}, Lo/fmb;->a(Lo/flq;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 395
    :goto_1
    goto :goto_2

    .line 393
    :catch_0
    move-exception v5

    .line 394
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Exception in MessageObserver: {}"

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v5}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 396
    :goto_2
    return-void
.end method
