.class Lo/ahz$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field b:Z

.field final synthetic c:Lo/ahz;

.field d:Z

.field private volatile e:Z


# direct methods
.method private constructor <init>(Lo/ahz;)V
    .locals 1

    .line 466
    iput-object p1, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 467
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz$a;->e:Z

    .line 469
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz$a;->b:Z

    .line 470
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz$a;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/ahz;Lo/ahz$2;)V
    .locals 0

    .line 466
    invoke-direct {p0, p1}, Lo/ahz$a;-><init>(Lo/ahz;)V

    return-void
.end method

.method private d(Ljava/net/MulticastSocket;Ljava/net/DatagramSocket;)V
    .locals 0

    .line 555
    if-eqz p1, :cond_0

    .line 556
    invoke-virtual {p1}, Ljava/net/MulticastSocket;->close()V

    .line 559
    :cond_0
    if-eqz p2, :cond_1

    .line 560
    invoke-virtual {p2}, Ljava/net/DatagramSocket;->close()V

    .line 562
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 573
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->m(Lo/ahz;)Lo/ahz$a;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/ahz$a;->e:Z

    .line 574
    return-void
.end method

.method public c()V
    .locals 5

    .line 565
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->m(Lo/ahz;)Lo/ahz$a;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ahz$a;->e:Z

    .line 566
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->m(Lo/ahz;)Lo/ahz$a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 567
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 568
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit isDone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 570
    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 474
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 475
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz$a;->b:Z

    .line 476
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz$a;->d:Z

    goto :goto_0

    .line 478
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 479
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz$a;->b:Z

    .line 480
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz$a;->d:Z

    goto :goto_0

    .line 483
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz$a;->b:Z

    .line 484
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz$a;->d:Z

    .line 486
    :goto_0
    return-void
.end method

.method public run()V
    .locals 14

    .line 492
    const/4 v4, 0x0

    .line 493
    const/4 v5, 0x0

    .line 495
    :try_start_0
    new-instance v0, Ljava/net/MulticastSocket;

    invoke-direct {v0}, Ljava/net/MulticastSocket;-><init>()V

    move-object v4, v0

    .line 496
    const/16 v0, 0x400

    invoke-virtual {v4, v0}, Ljava/net/MulticastSocket;->setSendBufferSize(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 500
    goto :goto_0

    .line 498
    :catch_0
    move-exception v6

    .line 499
    const-string v0, "CombinationTask"

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

    .line 504
    :goto_0
    :try_start_1
    new-instance v0, Ljava/net/DatagramSocket;

    invoke-direct {v0}, Ljava/net/DatagramSocket;-><init>()V

    move-object v5, v0

    .line 505
    const/16 v0, 0x400

    invoke-virtual {v5, v0}, Ljava/net/DatagramSocket;->setSendBufferSize(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 508
    goto :goto_1

    .line 506
    :catch_1
    move-exception v6

    .line 507
    const-string v0, "CombinationTask"

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

    .line 510
    :goto_1
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Send mIpData len "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v2}, Lo/ahz;->q(Lo/ahz;)[I

    move-result-object v2

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 512
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendtype "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v2}, Lo/ahz;->p(Lo/ahz;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 513
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->p(Lo/ahz;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ahz$a;->e(I)V

    .line 515
    :goto_2
    iget-boolean v0, p0, Lo/ahz$a;->e:Z

    if-nez v0, :cond_5

    .line 517
    const/16 v6, 0x10

    .line 519
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->q(Lo/ahz;)[I

    move-result-object v0

    array-length v0, v0

    div-int/lit8 v7, v0, 0x2

    .line 520
    const/16 v8, 0xc

    .line 524
    const/4 v10, 0x0

    :goto_3
    iget-boolean v0, p0, Lo/ahz$a;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/ahz$a;->b:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xc

    if-ge v10, v0, :cond_1

    .line 526
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    const/16 v1, 0x8

    invoke-static {v0, v4, v1}, Lo/ahz;->c(Lo/ahz;Ljava/net/MulticastSocket;I)V

    .line 527
    const/4 v11, 0x0

    :goto_4
    if-ge v11, v7, :cond_0

    .line 528
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->s(Lo/ahz;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->q(Lo/ahz;)[I

    move-result-object v1

    mul-int/lit8 v2, v11, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->q(Lo/ahz;)[I

    move-result-object v1

    mul-int/lit8 v2, v11, 0x2

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 529
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    add-int/lit8 v1, v11, 0x1

    invoke-static {v0, v4, v1, v9}, Lo/ahz;->c(Lo/ahz;Ljava/net/MulticastSocket;ILjava/lang/String;)V

    .line 527
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 524
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 533
    :cond_1
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->u(Lo/ahz;)[I

    move-result-object v0

    array-length v10, v0

    .line 535
    const/4 v11, 0x0

    :goto_5
    iget-boolean v0, p0, Lo/ahz$a;->e:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lo/ahz$a;->d:Z

    if-eqz v0, :cond_4

    const/16 v0, 0x10

    if-ge v11, v0, :cond_4

    .line 537
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    const/16 v1, 0x8

    invoke-static {v0, v5, v1}, Lo/ahz;->b(Lo/ahz;Ljava/net/DatagramSocket;I)V

    .line 538
    const/4 v12, 0x0

    :goto_6
    iget-boolean v0, p0, Lo/ahz$a;->e:Z

    if-nez v0, :cond_3

    if-ge v12, v10, :cond_3

    .line 540
    rem-int/lit8 v0, v12, 0x1e

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 542
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    const/4 v1, 0x4

    invoke-static {v0, v5, v1}, Lo/ahz;->b(Lo/ahz;Ljava/net/DatagramSocket;I)V

    .line 544
    :cond_2
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->u(Lo/ahz;)[I

    move-result-object v0

    aget v13, v0, v12

    .line 546
    iget-object v0, p0, Lo/ahz$a;->c:Lo/ahz;

    invoke-static {v0, v5, v13}, Lo/ahz;->d(Lo/ahz;Ljava/net/DatagramSocket;I)V

    .line 538
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 535
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    .line 549
    :cond_4
    goto/16 :goto_2

    .line 551
    :cond_5
    invoke-direct {p0, v4, v5}, Lo/ahz$a;->d(Ljava/net/MulticastSocket;Ljava/net/DatagramSocket;)V

    .line 552
    return-void
.end method
