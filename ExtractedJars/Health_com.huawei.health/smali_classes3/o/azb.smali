.class final Lo/azb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azb$a;,
        Lo/azb$d;,
        Lo/azb$b;
    }
.end annotation


# instance fields
.field private a:Lo/aze;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/bab;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;

.field private d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lorg/jivesoftware/smack/packet/Message;>;"
        }
    .end annotation
.end field

.field private e:Lo/azg;

.field private f:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/bag;>;"
        }
    .end annotation
.end field

.field private h:J

.field private i:Lo/bal;


# direct methods
.method constructor <init>(Lo/azg;)V
    .locals 3

    .line 436
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v1, Lo/baf;

    invoke-direct {v1}, Lo/baf;-><init>()V

    const/16 v2, 0x3e8

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    .line 60
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lo/azb;->b:Ljava/util/Set;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azb;->e:Lo/azg;

    .line 75
    new-instance v0, Lo/aze;

    invoke-direct {v0}, Lo/aze;-><init>()V

    iput-object v0, p0, Lo/azb;->a:Lo/aze;

    .line 85
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lo/bag;

    sget-object v2, Lo/bag$c;->d:Lo/bag$c;

    invoke-direct {v1, v2}, Lo/bag;-><init>(Lo/bag$c;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 437
    new-instance v0, Lo/azb$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/azb$b;-><init>(Lo/azb;Lo/azb$3;)V

    invoke-virtual {v0}, Lo/azb$b;->start()V

    .line 438
    iput-object p1, p0, Lo/azb;->e:Lo/azg;

    .line 439
    new-instance v0, Lo/bal;

    invoke-direct {v0, p1}, Lo/bal;-><init>(Lo/azg;)V

    iput-object v0, p0, Lo/azb;->i:Lo/bal;

    .line 440
    return-void
.end method

.method static synthetic a(Lo/azb;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lorg/jivesoftware/smack/packet/Message;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 496
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/Message;

    .line 499
    invoke-direct {p0, v4}, Lo/azb;->c(Lorg/jivesoftware/smack/packet/Message;)V

    .line 500
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    goto :goto_0

    .line 503
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    .line 504
    if-lez v3, :cond_1

    .line 506
    add-int/lit8 v0, v3, -0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 508
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 509
    invoke-direct {p0, v4, p2}, Lo/azb;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    return-void
.end method

.method static synthetic b(Lo/azb;)Lo/bal;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 631
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 632
    iget-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Message;

    .line 633
    if-eqz v2, :cond_0

    .line 635
    invoke-virtual {v2}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v0

    iput-wide v0, p0, Lo/azb;->h:J

    .line 637
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/azb;->d(Lorg/jivesoftware/smack/packet/Message;)V

    return-void
.end method

.method private b(Lorg/jivesoftware/smack/packet/Message;)V
    .locals 3

    .line 663
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->isUnRead()Z

    move-result v0

    if-nez v0, :cond_0

    .line 666
    invoke-static {p1}, Lo/bad;->b(Lorg/jivesoftware/smack/packet/Message;)Lorg/jivesoftware/smack/packet/AnReport;

    move-result-object v2

    .line 667
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    if-eqz v0, :cond_0

    .line 669
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, Lo/azg;->e(Lorg/jivesoftware/smack/packet/Stanza;Z)V

    .line 672
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/azb;)Ljava/util/Queue;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 8

    .line 602
    iget-object v4, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 604
    :try_start_0
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bag;

    .line 606
    if-eqz v5, :cond_1

    .line 607
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request OfflineMsgReq IQ sent failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",current BlockTask:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 608
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "packetID,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",current BlockTask,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/bpj;->c(ILjava/lang/String;)V

    .line 609
    invoke-virtual {v5}, Lo/bag;->a()Lo/bag$c;

    move-result-object v0

    sget-object v1, Lo/bag$c;->a:Lo/bag$c;

    if-ne v0, v1, :cond_2

    .line 611
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 612
    iget-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/jivesoftware/smack/packet/Message;

    .line 613
    if-eqz v6, :cond_0

    .line 614
    invoke-virtual {v6}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v0

    iput-wide v0, p0, Lo/azb;->h:J

    .line 616
    :cond_0
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 617
    goto :goto_0

    .line 619
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "packetID,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",current BlockTask,null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/bpj;->c(ILjava/lang/String;)V

    .line 620
    const-string v0, "MessageTrace"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handOffLineMsgReqFailed blockTask == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 622
    :cond_2
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 623
    :goto_1
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 682
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 685
    invoke-static {p1, p2}, Lo/bad;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    move-result-object v2

    .line 686
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    if-eqz v0, :cond_0

    .line 688
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    const/4 v1, 0x1

    invoke-interface {v0, v2, v1}, Lo/azg;->e(Lorg/jivesoftware/smack/packet/Stanza;Z)V

    .line 691
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/azb;->b(Lorg/jivesoftware/smack/packet/Message;)V

    return-void
.end method

.method private c(Lorg/jivesoftware/smack/packet/Message;)V
    .locals 5

    .line 449
    if-nez p1, :cond_0

    .line 451
    return-void

    .line 453
    :cond_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notify App Receive Message{:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    :cond_1
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v0

    iput-wide v0, p0, Lo/azb;->h:J

    .line 459
    iget-object v0, p0, Lo/azb;->a:Lo/aze;

    new-instance v1, Lo/azb$d;

    invoke-direct {v1, p0, p1}, Lo/azb$d;-><init>(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V

    invoke-virtual {v0, v1}, Lo/aze;->e(Ljava/lang/Runnable;)V

    .line 462
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 463
    const-string v0, "msg_active_action"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 464
    invoke-static {v4}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 465
    return-void
.end method

.method static synthetic d(Lo/azb;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/azb;->h:J

    return-wide v0
.end method

.method private d(Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;)V
    .locals 11

    .line 329
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Receive OfflineMsgRange:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iget-wide v2, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 332
    :cond_0
    iget-object v6, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v6

    .line 334
    :try_start_0
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 337
    :goto_0
    return-void

    .line 340
    :cond_1
    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iget-wide v2, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 343
    iget-object v6, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v6

    .line 345
    :try_start_1
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 346
    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iput-wide v0, p0, Lo/azb;->h:J

    .line 347
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 348
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    :goto_1
    goto :goto_2

    .line 352
    :cond_2
    const/4 v6, 0x0

    .line 353
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    if-eqz v0, :cond_3

    .line 355
    iget-object v0, p0, Lo/azb;->e:Lo/azg;

    invoke-interface {v0}, Lo/azg;->c()Ljava/lang/String;

    move-result-object v6

    .line 357
    :cond_3
    iget-object v7, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v7

    .line 360
    :try_start_2
    new-instance v0, Lo/bai;

    iget-wide v1, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iget-wide v3, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lo/bai;-><init>(JJLjava/lang/String;)V

    move-object v8, v0

    .line 361
    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iput-wide v0, p0, Lo/azb;->h:J

    .line 362
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    invoke-virtual {v0, v8}, Lo/bal;->c(Lo/bai;)V

    .line 363
    new-instance v9, Lo/bag;

    sget-object v0, Lo/bag$c;->e:Lo/bag$c;

    invoke-direct {v9, v0}, Lo/bag;-><init>(Lo/bag$c;)V

    .line 364
    iget-wide v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->startSeq:J

    iget-wide v2, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->endSeq:J

    invoke-virtual {v9, v0, v1, v2, v3}, Lo/bag;->d(JJ)V

    .line 365
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 366
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 367
    monitor-exit v7

    goto :goto_2

    :catchall_2
    move-exception v10

    monitor-exit v7

    throw v10

    .line 369
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/azb;Lorg/jivesoftware/smack/packet/Message;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/azb;->c(Lorg/jivesoftware/smack/packet/Message;)V

    return-void
.end method

.method private d(Lorg/jivesoftware/smack/packet/Message;)V
    .locals 4

    .line 715
    if-eqz p1, :cond_0

    .line 717
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Discard message id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "],local MaxSeq:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/azb;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 718
    const-string v0, "MessageTrace"

    invoke-static {v0, v3}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 720
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 719
    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 722
    :cond_0
    return-void
.end method

.method private d(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3

    .line 646
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/AnReport;

    if-eqz v0, :cond_0

    .line 648
    move-object v0, p1

    check-cast v0, Lorg/jivesoftware/smack/packet/AnReport;

    invoke-static {v0}, Lo/bad;->d(Lorg/jivesoftware/smack/packet/AnReport;)Lo/bac;

    move-result-object v2

    .line 649
    if-eqz v2, :cond_0

    .line 651
    iget-object v0, p0, Lo/azb;->a:Lo/aze;

    new-instance v1, Lo/azb$a;

    invoke-direct {v1, p0, v2}, Lo/azb$a;-><init>(Lo/azb;Lo/bac;)V

    invoke-virtual {v0, v1}, Lo/aze;->b(Ljava/lang/Runnable;)V

    .line 654
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/azb;J)J
    .locals 0

    .line 45
    iput-wide p1, p0, Lo/azb;->h:J

    return-wide p1
.end method

.method static synthetic e(Lo/azb;)Ljava/lang/Object;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    return-object v0
.end method

.method private e(Lorg/jivesoftware/smack/packet/AnReport;)V
    .locals 0

    .line 319
    invoke-direct {p0, p1}, Lo/azb;->d(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 320
    return-void
.end method

.method private e(Lorg/jivesoftware/smack/packet/Message;)Z
    .locals 4

    .line 475
    const/4 v1, 0x0

    .line 476
    if-eqz p1, :cond_0

    .line 478
    iget-object v2, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 480
    :try_start_0
    iget-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v1

    .line 481
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 482
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 484
    :cond_0
    :goto_0
    return v1
.end method

.method static synthetic g(Lo/azb;)Ljava/util/Set;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/azb;->b:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic k(Lo/azb;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/azb;->b()V

    return-void
.end method


# virtual methods
.method a(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 11

    .line 253
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Message;

    if-eqz v0, :cond_1

    .line 255
    move-object v4, p1

    check-cast v4, Lorg/jivesoftware/smack/packet/Message;

    .line 256
    invoke-virtual {v4}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->error:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_0

    .line 259
    invoke-virtual {p0, v4}, Lo/azb;->c(Lorg/jivesoftware/smack/packet/Stanza;)V

    goto :goto_0

    .line 263
    :cond_0
    invoke-direct {p0, v4}, Lo/azb;->e(Lorg/jivesoftware/smack/packet/Message;)Z

    .line 265
    :goto_0
    goto/16 :goto_2

    .line 266
    :cond_1
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/AnReport;

    if-eqz v0, :cond_2

    .line 269
    move-object v0, p1

    check-cast v0, Lorg/jivesoftware/smack/packet/AnReport;

    invoke-direct {p0, v0}, Lo/azb;->e(Lorg/jivesoftware/smack/packet/AnReport;)V

    goto/16 :goto_2

    .line 271
    :cond_2
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;

    if-eqz v0, :cond_3

    .line 274
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;

    invoke-direct {p0, v0}, Lo/azb;->d(Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;)V

    goto/16 :goto_2

    .line 276
    :cond_3
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;

    if-eqz v0, :cond_6

    .line 278
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;

    .line 279
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;->getUnReadMsgList()Ljava/util/List;

    move-result-object v5

    .line 280
    if-eqz v5, :cond_5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 282
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 283
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Receive UnReadMessage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    iget-object v7, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v7

    .line 286
    :try_start_0
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/bag;

    .line 288
    if-eqz v8, :cond_4

    .line 290
    invoke-virtual {v8}, Lo/bag;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    :cond_4
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 293
    :goto_1
    add-int/lit8 v0, v6, -0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/jivesoftware/smack/packet/Message;

    .line 294
    invoke-virtual {v7}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v8

    .line 295
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    invoke-virtual {v0, v8, v9}, Lo/bal;->e(J)V

    .line 296
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Lo/azb;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 297
    goto :goto_2

    .line 301
    :cond_5
    iget-wide v0, p0, Lo/azb;->h:J

    iget-object v2, p0, Lo/azb;->i:Lo/bal;

    invoke-virtual {v2}, Lo/bal;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lo/azb;->h:J

    .line 302
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    invoke-virtual {v0}, Lo/bal;->b()V

    .line 303
    iget-object v6, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v6

    .line 305
    :try_start_1
    invoke-direct {p0}, Lo/azb;->b()V

    .line 306
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    monitor-exit v6

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v6

    throw v10

    .line 310
    :cond_6
    :goto_2
    return-void
.end method

.method b(Lo/bab;)V
    .locals 1

    .line 519
    if-eqz p1, :cond_0

    .line 521
    iget-object v0, p0, Lo/azb;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 523
    :cond_0
    return-void
.end method

.method b(Z)V
    .locals 5

    .line 532
    iget-object v3, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 535
    :try_start_0
    iget-object v0, p0, Lo/azb;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 536
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lo/bag;

    sget-object v2, Lo/bag$c;->d:Lo/bag$c;

    invoke-direct {v1, v2}, Lo/bag;-><init>(Lo/bag$c;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 537
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 538
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 541
    :goto_0
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    invoke-virtual {v0}, Lo/bal;->b()V

    .line 544
    if-eqz p1, :cond_0

    .line 547
    iget-object v0, p0, Lo/azb;->a:Lo/aze;

    invoke-virtual {v0}, Lo/aze;->a()V

    .line 549
    :cond_0
    return-void
.end method

.method c(J)V
    .locals 5

    .line 700
    iget-object v3, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 702
    :try_start_0
    iput-wide p1, p0, Lo/azb;->h:J

    .line 703
    iget-object v0, p0, Lo/azb;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lo/bag;

    sget-object v2, Lo/bag$c;->a:Lo/bag$c;

    invoke-direct {v1, v2}, Lo/bag;-><init>(Lo/bag$c;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 704
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 705
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 706
    :goto_0
    return-void
.end method

.method c(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 7

    .line 558
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Message;

    if-eqz v0, :cond_0

    .line 560
    new-instance v3, Lo/bac;

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lo/bac;-><init>(Ljava/lang/String;I)V

    .line 561
    iget-object v0, p0, Lo/azb;->a:Lo/aze;

    new-instance v1, Lo/azb$a;

    invoke-direct {v1, p0, v3}, Lo/azb$a;-><init>(Lo/azb;Lo/bac;)V

    invoke-virtual {v0, v1}, Lo/aze;->b(Ljava/lang/Runnable;)V

    .line 562
    goto/16 :goto_1

    .line 563
    :cond_0
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;

    if-eqz v0, :cond_1

    .line 566
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/azb;->c(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 568
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    if-eqz v0, :cond_2

    .line 571
    iget-object v0, p0, Lo/azb;->i:Lo/bal;

    move-object v1, p1

    check-cast v1, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    invoke-virtual {v0, v1}, Lo/bal;->d(Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;)V

    .line 573
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;->getSeqEnd()J

    move-result-wide v0

    iput-wide v0, p0, Lo/azb;->h:J

    .line 574
    iget-object v3, p0, Lo/azb;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 576
    :try_start_0
    invoke-direct {p0}, Lo/azb;->b()V

    .line 577
    iget-object v0, p0, Lo/azb;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :goto_0
    goto :goto_1

    .line 580
    :cond_2
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    if-eqz v0, :cond_3

    .line 583
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v3

    .line 584
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    .line 585
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->getPrintfIds()Ljava/lang/String;

    move-result-object v5

    .line 586
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UnReadMsgReport IQ sent failed, packetID["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], ids["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 587
    const-string v0, "MessageTrace"

    invoke-static {v0, v6}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    invoke-static {v6}, Lo/bpj;->c(Ljava/lang/String;)V

    .line 590
    goto :goto_1

    .line 593
    :cond_3
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Packet Send failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lo/bak;->b(Lorg/jivesoftware/smack/packet/Stanza;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    :goto_1
    return-void
.end method
