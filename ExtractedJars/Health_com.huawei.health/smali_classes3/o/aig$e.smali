.class Lo/aig$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/aig;

.field b:Z

.field c:Z

.field private volatile e:Z


# direct methods
.method private constructor <init>(Lo/aig;)V
    .locals 1

    .line 345
    iput-object p1, p0, Lo/aig$e;->a:Lo/aig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$e;->e:Z

    .line 348
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$e;->c:Z

    .line 349
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$e;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/aig;Lo/aig$5;)V
    .locals 0

    .line 345
    invoke-direct {p0, p1}, Lo/aig$e;-><init>(Lo/aig;)V

    return-void
.end method

.method private d(Ljava/net/MulticastSocket;Ljava/net/DatagramSocket;)V
    .locals 0

    .line 440
    if-eqz p1, :cond_0

    .line 441
    invoke-virtual {p1}, Ljava/net/MulticastSocket;->close()V

    .line 444
    :cond_0
    if-eqz p2, :cond_1

    .line 445
    invoke-virtual {p2}, Ljava/net/DatagramSocket;->close()V

    .line 448
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 459
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->f(Lo/aig;)Lo/aig$e;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/aig$e;->e:Z

    .line 460
    return-void
.end method

.method public e()V
    .locals 5

    .line 451
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->f(Lo/aig;)Lo/aig$e;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/aig$e;->e:Z

    .line 452
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v1}, Lo/aig;->f(Lo/aig;)Lo/aig$e;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 453
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit isDone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 456
    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 353
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 354
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig$e;->c:Z

    .line 355
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$e;->b:Z

    goto :goto_0

    .line 357
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 358
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig$e;->c:Z

    .line 359
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig$e;->b:Z

    goto :goto_0

    .line 362
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig$e;->c:Z

    .line 363
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig$e;->b:Z

    .line 365
    :goto_0
    return-void
.end method

.method public run()V
    .locals 14

    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 373
    :try_start_0
    new-instance v0, Ljava/net/MulticastSocket;

    invoke-direct {v0}, Ljava/net/MulticastSocket;-><init>()V

    move-object v4, v0

    .line 374
    const/16 v0, 0x400

    invoke-virtual {v4, v0}, Ljava/net/MulticastSocket;->setSendBufferSize(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 378
    goto :goto_0

    .line 376
    :catch_0
    move-exception v6

    .line 377
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Create \u7ec4\u64adsocket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 382
    :goto_0
    :try_start_1
    new-instance v0, Ljava/net/DatagramSocket;

    invoke-direct {v0}, Ljava/net/DatagramSocket;-><init>()V

    move-object v5, v0

    .line 383
    const/16 v0, 0x400

    invoke-virtual {v5, v0}, Ljava/net/DatagramSocket;->setSendBufferSize(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 386
    goto :goto_1

    .line 384
    :catch_1
    move-exception v6

    .line 385
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Create \u5e7f\u64ad socket failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    :goto_1
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Send mIpData len "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v2}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v2

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendtype "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v2}, Lo/aig;->i(Lo/aig;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->i(Lo/aig;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/aig$e;->e(I)V

    .line 395
    :goto_2
    iget-boolean v0, p0, Lo/aig$e;->e:Z

    if-nez v0, :cond_5

    .line 399
    const/16 v6, 0x10

    .line 401
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v0

    array-length v0, v0

    div-int/lit8 v7, v0, 0x2

    .line 402
    const/16 v8, 0xc

    .line 406
    const/4 v10, 0x0

    :goto_3
    iget-boolean v0, p0, Lo/aig$e;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/aig$e;->c:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xc

    if-ge v10, v0, :cond_1

    .line 408
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    const/16 v1, 0x8

    invoke-static {v0, v4, v1}, Lo/aig;->b(Lo/aig;Ljava/net/MulticastSocket;I)V

    .line 409
    const/4 v11, 0x0

    :goto_4
    if-ge v11, v7, :cond_0

    .line 410
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v1}, Lo/aig;->m(Lo/aig;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v1}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v1

    mul-int/lit8 v2, v11, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v1}, Lo/aig;->o(Lo/aig;)[I

    move-result-object v1

    mul-int/lit8 v2, v11, 0x2

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 411
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    add-int/lit8 v1, v11, 0x1

    invoke-static {v0, v4, v1, v9}, Lo/aig;->d(Lo/aig;Ljava/net/MulticastSocket;ILjava/lang/String;)V

    .line 409
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 406
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 417
    :cond_1
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->l(Lo/aig;)[I

    move-result-object v0

    array-length v10, v0

    .line 419
    const/4 v11, 0x0

    :goto_5
    iget-boolean v0, p0, Lo/aig$e;->e:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lo/aig$e;->b:Z

    if-eqz v0, :cond_4

    const/16 v0, 0x10

    if-ge v11, v0, :cond_4

    .line 421
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    const/16 v1, 0x8

    invoke-static {v0, v5, v1}, Lo/aig;->c(Lo/aig;Ljava/net/DatagramSocket;I)V

    .line 422
    const/4 v12, 0x0

    :goto_6
    iget-boolean v0, p0, Lo/aig$e;->e:Z

    if-nez v0, :cond_3

    if-ge v12, v10, :cond_3

    .line 424
    rem-int/lit8 v0, v12, 0x1e

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 426
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    const/4 v1, 0x4

    invoke-static {v0, v5, v1}, Lo/aig;->c(Lo/aig;Ljava/net/DatagramSocket;I)V

    .line 428
    :cond_2
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->l(Lo/aig;)[I

    move-result-object v0

    aget v13, v0, v12

    .line 430
    iget-object v0, p0, Lo/aig$e;->a:Lo/aig;

    invoke-static {v0, v5, v13}, Lo/aig;->b(Lo/aig;Ljava/net/DatagramSocket;I)V

    .line 422
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 419
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    .line 434
    :cond_4
    goto/16 :goto_2

    .line 436
    :cond_5
    invoke-direct {p0, v4, v5}, Lo/aig$e;->d(Ljava/net/MulticastSocket;Ljava/net/DatagramSocket;)V

    .line 437
    return-void
.end method
